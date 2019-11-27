package demo.controller;

import demo.model.Content;
import demo.model.Person;
import demo.model.Trx;
import demo.model.User;
import demo.service.ContentService;
import demo.service.TrxService;
import demo.utils.ServerResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class ContentController {

    @Autowired
    private ContentService contentService;

    @Autowired
    private TrxService trxService;

    public int getId()
    {
        List<Content> list = contentService.findAll2();
        if (list==null||list.isEmpty())
        {
            return -1;
        }
       for(int i=0,t=list.size();i<t;++i)
       {
           if(i==list.size()-1)
           {
               return list.get(i).getId();
           }
       }
       return -1;
    }

    @RequestMapping(path = "/public")
    public String pub()
    {
        return "public";
    }

    @RequestMapping(path = "/account")
    public String account(Model model)
    {
        ServerResponse serverResponse = trxService.findAll();
        List<Trx> list = serverResponse.getList();
        model.addAttribute("buyList",list);
        model.addAttribute("total",0);
        return "account";
    }

    @RequestMapping(path = "/publicSubmit",method = RequestMethod.POST)
    public String publicSubmit(@Valid Content content, Model model, HttpServletRequest request,@RequestParam("icon") String icon)
    {
        System.out.println("publicSubmit");
        ServerResponse serverResponse = contentService.insert(content);
        int status = serverResponse.getStatus();
        String msg = serverResponse.getMsg();
        int id = getId();  //获取刚插入的id
        ServerResponse serverResponse1 = contentService.get(id);
        Content content1 = (Content) serverResponse1.getData();
        model.addAttribute("product",content1);
        return "publicSubmit";
    }

    @RequestMapping(path = "/show")
    public String show(@RequestParam("id") int id,Model model)
    {
        System.out.println(id);
        ServerResponse serverResponse = contentService.get(id);
        Content content = (Content) serverResponse.getData();
        System.out.println(content);
        model.addAttribute("product",content);
        return "show";

    }

    @RequestMapping(path = "/edit")
    public String edit(@RequestParam("id") int id,Model model,HttpServletRequest request)
    {
        ServerResponse serverResponse = contentService.get(id);
        Content content = (Content) serverResponse.getData();
        model.addAttribute("product",content);
        return "edit";
    }

    @RequestMapping(path = "/editSubmit",method = RequestMethod.POST)
    public String editSubmit(@RequestParam("id") int id,@RequestParam("remark") String remark
            ,@RequestParam("icon") String icon,@RequestParam("price") String price,
             @RequestParam("text") String text,@RequestParam("title") String title
            , Model model, HttpServletRequest request)
    {
        Content content = new Content();

        System.out.println("editSubmit: "+content);
        content.setId(id);
        content.setRemark(remark);
        content.setIcon(icon);
        price = price.replaceAll(",","");
        System.out.println("price: "+price);
        content.setPrice(Double.valueOf(price));
        content.setText(text);
        content.setTitle(title);
        ServerResponse serverResponse = contentService.update(content);
        model.addAttribute("product",content);
        return "editSubmit";


    }

//    @RequestMapping(path = "/editSubmit",method = RequestMethod.POST)
//    public String editSubmit(@Valid Content content,Model model,HttpServletRequest request)
//    {
//        System.out.println("editSubmit: "+content);
//        ServerResponse serverResponse = contentService.update(content);
//        model.addAttribute("product",content);
//        return "editSubmit.ftl";
//
//
//    }

    @RequestMapping(path = "/buysure")
    public String buysure(@RequestParam("id") int id,Model model,HttpServletRequest request)
    {
        ServerResponse serverResponse = contentService.get(id);
        Content content = (Content) serverResponse.getData();
        content.setIsbuy("true");
        content.setIssell("true");
        ServerResponse serverResponse1 = contentService.update(content);
        model.addAttribute("product",content);
        String msg = "";
        if(serverResponse1.getMsg().equals("更新成功"))
        {
            msg="购买成功";
        }
        else {
            msg="购买失败";
        }
        model.addAttribute("msg",msg);

        Trx trx = new Trx();
       try
       {
           System.out.println("content: "+content);
           System.out.println("user : "+request.getSession().getAttribute("user"));
           Person user = (Person) request.getSession().getAttribute("user");
           trx.setContentid(content.getId());
           trx.setPersonid(user.getId());
           double price1 = content.getPrice();
           trx.setPrice((int)price1);
           trx.setTime(new Date().getTime());
           trx.setTitle(content.getTitle());
           trx.setIcon(content.getIcon());
       }catch (Exception e)
       {
           e.printStackTrace();
       }
        ServerResponse serverResponse2 = trxService.insert(trx);
        System.out.println(serverResponse2.getMsg());
        return "show";
    }

    @RequestMapping(path = "/del")
    public String del(@RequestParam("id") int id,Model model,HttpServletRequest request)
    {
        ServerResponse serverResponse = contentService.delete(id);
        String msgd = "";
        msgd = serverResponse.getMsg();
//        System.out.println("id: "+id+" "+msgd);
        if (msgd==null||msgd.length()==0)
        {
            model.addAttribute("msgd",1);
        }
        else {
            model.addAttribute("msgd",msgd);
        }
        List<Content> productList = contentService.findAll2();
        request.getSession().setAttribute("productList",productList);
        return "index.ftl";

    }



}
