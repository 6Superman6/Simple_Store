package demo.controller;

import demo.model.Person;
import demo.service.PersonService;
import demo.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping(path = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @ResponseBody
    @RequestMapping(path = "/get")
    public ServerResponse select(@RequestParam("id") int id)
    {
        return personService.get(id);
    }

    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpServletRequest request)
    {
//        System.out.println("username: "+username+" , password: "+password);
        ServerResponse serverResponse = personService.dologin(username,password);
        String msg = serverResponse.getMsg();
        int status = serverResponse.getStatus();
        Person person = (Person) serverResponse.getData();
//        System.out.println(msg+status+person);
        if(status==0)
        {
//            model.addAttribute("person",person);
//            model.addAttribute("autoin","true");
            request.getSession().setAttribute("person",person);
            request.getSession().setAttribute("autoin","true");
            request.getSession().setAttribute("user",person);
            return "index.ftl";
        }
        else
        {
            model.addAttribute("msg","用户名或密码错误");
            return "login.ftl";
        }

    }

    @RequestMapping(path = "/regist",method = RequestMethod.POST)
    public String regist(@Valid Person person,Model model)
    {
        ServerResponse serverResponse = personService.insert(person);
        String msg = serverResponse.getMsg();
        int status = serverResponse.getStatus();
        if(status==0)
        {
            model.addAttribute("msg","注册成功，请登录");
            return "login.ftl";
        }
        return "regist";
    }

    @RequestMapping(path = "/in")
    public String in()
    {
        return "regist.ftl";
    }

    @RequestMapping(path = "/publicin")
    public String publicin()
    {
        return "public.ftl";
    }



}
