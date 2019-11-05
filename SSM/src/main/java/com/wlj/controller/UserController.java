package com.wlj.controller;


import com.wlj.model.User;
import com.wlj.service.UserService;
import  org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")

public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getusername")
    public ModelAndView hello(ModelAndView mv, @RequestParam String id) {
        String name = userService.getUserName(id);
        mv.addObject("username", name);
        mv.setViewName("user");
        return mv;
    }

    @RequestMapping("/regit")
    public  String regit(){
        return  "regit";
    }

    @RequestMapping("/regit2")
    public  String regit2(@RequestParam("username")String username ,@RequestParam("password")String password , Model model){
        User user= new User();
         user.setUsername(username);
         user.setPassword(password);
            userService.regit(user);
            model.addAttribute("msg", "注册成功");
            //注册成功后跳转至success页面
            return "success";
    }

    @RequestMapping("/login")
    public  String login(){
        return  "login";
    }

    @RequestMapping("/login2")
    public  String  login2(@RequestParam("username") String username,@RequestParam("password") String password,Model model){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println("用户登录:"+ username+ password);
        User u = null;
        if((u = userService.login(user)) != null){
            model.addAttribute("msg","登录成功");
            return "train";
        }
        else {
            model.addAttribute("msg","账号密码错误");
            return  "login";
        }
    }

  /*  @RequestMapping("/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    @RequestMapping("/success")
    public  String success(){
        return  "success";
    }

}
