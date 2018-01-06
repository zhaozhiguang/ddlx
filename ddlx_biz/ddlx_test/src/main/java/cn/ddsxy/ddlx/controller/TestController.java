package cn.ddsxy.ddlx.controller;

import cn.ddsxy.ddlx.model.DeDao;
import cn.ddsxy.ddlx.model.User;
import cn.ddsxy.ddlx.service.UserService;
import cn.ddsxy.ddlx.util.HibernateValidatorMessageLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import javax.validation.Validator;
import java.io.IOException;
import java.util.Date;


@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public Object index(){
        /*DeDao deDao = new DeDao();
        deDao.setName("测试");
        deDao.setDate(new Date());
        return deDao;*/
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
