package cn.ddsxy.ddlx.controller;

import com.google.code.kaptcha.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class SuuportController {

    @RequestMapping("")
    public String in(HttpSession session){
        return "index";
    }

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }


    /**
     * 没有权限访问
     *
     * @return
     */
    @RequestMapping("/403")
    public String errPage403() {
        return "403";
    }

    /**
     * 没找到页面404
     *
     * @return
     */
    @RequestMapping("/404")
    public String errorPage404() {
        return "404";
    }

    /**
     * 系统内部错误500
     *
     * @return
     */
    @RequestMapping("/500")
    public String errorPage500() {
        return "500";
    }

}
