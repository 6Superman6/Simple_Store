package demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import demo.model.Content;
import demo.model.Person;
import demo.model.Trx;
import demo.service.ContentService;
import demo.service.PersonService;
import demo.service.TrxService;
import demo.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "/api")
public class AjaxController {

    @Autowired
    private PersonService personService;
    @Autowired
    private TrxService trxService;
    @Autowired
    private ContentService contentService;


    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public Model login(@RequestParam("userName") String userName, @RequestParam("password") String password, Model model, HttpServletRequest request)
    {
        System.out.println("api/login");
        ServerResponse serverResponse = personService.dologin(userName,password);
        System.out.println(userName+" "+password);
        String msg = serverResponse.getMsg();
        int status = serverResponse.getStatus();
        Person person = (Person) serverResponse.getData();
        if(status==0)
        {
//            model.addAttribute("person",person);
//            model.addAttribute("autoin","true");
            model.addAttribute("code", 200);
            model.addAttribute("message", "登录成功");
            model.addAttribute("result", true);
            request.getSession().setAttribute("user",person);
        }
        else
        {
            model.addAttribute("code", 400);//失败的code自定义，前端对此无限制
            model.addAttribute("message", "用户名或密码错误");
            model.addAttribute("result", false);
        }
        return model;

    }

    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public Model del(@RequestParam("id") int id, Model model, HttpServletRequest request)
    {
        ServerResponse serverResponse = contentService.delete(id);
        String msgd = "";
        msgd = serverResponse.getMsg();
//        System.out.println("id: "+id+" "+msgd);
        if (msgd==null||msgd.length()==0)
        {
            model.addAttribute("code", 400);
            model.addAttribute("message", "删除失败");
            model.addAttribute("result", false);
        }
        else {
            model.addAttribute("code", 200);
            model.addAttribute("message", "删除成功");
            model.addAttribute("result", true);
        }
        List<Content> productList = contentService.findAll2();
        request.getSession().setAttribute("productList",productList);
        return model;

    }

}
