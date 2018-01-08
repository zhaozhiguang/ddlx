package cn.ddsxy.ddlx.web.ControllerAdvice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuuportController {

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
