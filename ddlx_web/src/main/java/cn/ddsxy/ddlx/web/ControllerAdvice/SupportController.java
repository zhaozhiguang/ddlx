package cn.ddsxy.ddlx.web.ControllerAdvice;


import cn.ddsxy.ddlx.exception.SupportException;
import org.omg.CORBA.SystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class SupportController {

    private static final Logger logger = LoggerFactory.getLogger(SupportController.class);

    /**
     * 系统异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object SystemException(Exception e) {

        return "system:fail";
    }

    /**
     * 自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(SupportException.class)
    @ResponseBody
    public Object CustomException(SupportException e){

        return "custom:fail";
    }
}
