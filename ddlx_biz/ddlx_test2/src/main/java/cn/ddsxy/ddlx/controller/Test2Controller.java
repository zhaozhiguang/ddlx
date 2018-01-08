package cn.ddsxy.ddlx.controller;

import cn.ddsxy.ddlx.model.DeDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class Test2Controller {

    @RequestMapping("/index2")
    @ResponseBody
    public Object index2(){
        DeDao deDao = new DeDao();
        deDao.setName("测试1");
        deDao.setDate(new Date());
        return deDao;
    }
}
