package cn.ddsxy.ddlx.controller;

import cn.ddsxy.ddlx.model.DeDao;
import cn.ddsxy.ddlx.model.User;
import cn.ddsxy.ddlx.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;


@Controller
public class TestController {

    @Autowired
    private UserService userService;

    //@RequiresRoles("fff")
    @RequestMapping("/index")
    @ResponseBody
    public Object index() {
        /*DeDao deDao = new DeDao();
        deDao.setName("测试");
        deDao.setDate(new Date());
        return deDao;*/
        //throw new RuntimeException("123");
        Subject subject = SecurityUtils.getSubject();
        boolean hh = subject.hasRole("hh");
        System.err.println(hh);
        return userService.getId(8);
    }

    @RequestMapping("/set")
    @ResponseBody
    public Object setId(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.err.println(bindingResult.getFieldError().getDefaultMessage());
            return bindingResult.getFieldError().getDefaultMessage();
        }
        DeDao deDao = new DeDao();
        deDao.setName("测试");
        deDao.setDate(new Date());
        return deDao;
    }
}
