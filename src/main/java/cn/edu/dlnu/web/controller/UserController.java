package cn.edu.dlnu.web.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/login")
    public String login(String username, String password){
        System.out.println("访问到login方法了。。。。。");
        System.out.println(username);
        System.out.println(password);

        if("zhangzan".equals(username) && "123".equals(password)){
            return "ok";
        }else {
            //登录失败
            return "error";
        }
    }
}
