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
@RequestMapping(path = "/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private ContentService contentService;

    @RequestMapping(path = "/error")
    public void err()
    {
        int a = 10/0;
    }

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        String word0 = "士大夫 ";
        String word1 = "World!";
        //将数据添加到视图数据容器中
        model.addAttribute("word0",word0);
        model.addAttribute("word1",word1);
        return "Hello.ftl";
    }

    //测试模板引擎
    @RequestMapping(path = "/login")
    public String login(Model model) throws Exception {
//        System.out.println("person1: "+person1);
//        model.addAttribute("name",person1.getUsername());
//        model.addAttribute("password",person1.getPassword());
        return "login.ftl";
    }
    //进入主页
    @RequestMapping(path = "/root")
    public String index(HttpServletRequest request)
    {
        List<Content> productList = contentService.findAll2();
        request.getSession().setAttribute("productList",productList);
        return "index.ftl";
    }

    //退出
    @RequestMapping(path = "/out")
    public String out(HttpServletRequest request)
    {
        request.getSession().setAttribute("user",null);
        return "login.ftl";
    }





    @RequestMapping(path = "/abc")
    public String ac()
    {
        return "success";
    }

    // 添加数据
    @ResponseBody
    @RequestMapping(path = "/add",method = RequestMethod.POST)
    public ServerResponse add(@Valid User user)
    {
        return userService.insert(user);
    }

    // 删除数据
    @ResponseBody
    @RequestMapping(path = "/del/{id}",method = RequestMethod.DELETE)
    public ServerResponse del(@PathVariable("id") int id)
    {
        return userService.delete(id);
    }

    // 修改数据
    @ResponseBody
    @RequestMapping(path = "/do",method = RequestMethod.POST)
    public ServerResponse update(@Valid User user)
    {
        return userService.update(user);
    }

    // 获取数据--通过编号
    @ResponseBody
    @RequestMapping(path = "/do/{id}",method = RequestMethod.GET)
    public ServerResponse get(@PathVariable("id") int id)
    {
        return userService.get(id);
    }

    // 获取全部数据
    @ResponseBody
    @RequestMapping(path = "/do",method = RequestMethod.GET)
    public ServerResponse findAll()
    {
        return userService.findAll();
    }

    // 获取数据--通过用户名
    @ResponseBody
    @RequestMapping(path = "/name/{name}",method = RequestMethod.GET)
    public ServerResponse getByName(@PathVariable("name") String name)
    {
        return userService.getyName(name);
    }


}
