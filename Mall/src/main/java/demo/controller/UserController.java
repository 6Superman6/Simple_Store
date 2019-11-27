package demo.controller;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import demo.mapper.UserMapper;
import demo.model.Content;
import demo.model.Person;
import demo.model.User;
import demo.service.ContentService;
import demo.service.UserService;
import demo.utils.ServerResponse;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private ContentService contentService;

    //展示页
    @RequestMapping("/")
    public String index(@RequestParam(name = "type", required = false) String type,
                        @SessionAttribute(name = "user", required = false) Person user,
                        Model model) {
        List<Content> productList = contentService.findAll2();
        List<Content> productList2 = contentService.findAllwBuy();
        if (type!=null)
        {
            model.addAttribute("productList", productList2);
            model.addAttribute("userType",1);
        }
        else {
            model.addAttribute("productList", productList);
            model.addAttribute("userType",0);
        }

        return "index";
    }

    @RequestMapping(path = "/error")
    public void err()
    {
        int a = 10/0;
    }

    //测试模板引擎
    @RequestMapping(path = "/login")
    public String login(Model model) throws Exception {
//        System.out.println("person1: "+person1);
//        model.addAttribute("name",person1.getUsername());
//        model.addAttribute("password",person1.getPassword());
//        System.out.println("login");
        return "login";
    }

    //退出
    @RequestMapping(path = "/logout")
    public String out(HttpServletRequest request)
    {
        request.getSession().setAttribute("user",null);
        return "login";
    }

}
