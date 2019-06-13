package net.xwjclass.demo.domain;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class CustomExtHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    Object handlerException(Exception e, HttpServletRequest request){

        Map<String,Object> map = new HashMap<>();
        map.put("code",500);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;

    }

    @ExceptionHandler(value = CustomExtHandlerMy.class)
    @ResponseBody
    Object handlerExceptionmy(CustomExtHandlerMy e,HttpServletRequest request){
        /*ModelAndView view = new ModelAndView();
        view.setViewName("error.html");
        view.addObject("msg",e.getMsg());
        view.addObject("code",e.getCode());
        return view;*/

        Map<String,Object> map = new HashMap<>();
        map.put("msg",e.getMsg());
        map.put("code",e.getCode());
        return map;

    }
}
