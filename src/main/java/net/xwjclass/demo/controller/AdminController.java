package net.xwjclass.demo.controller;

import net.xwjclass.demo.domain.CustomExtHandlerMy;
import net.xwjclass.demo.domain.TestsTable;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminController {

    private Map<String,String> params = new HashMap<>();

    @RequestMapping("/api")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/api/map")
    @ResponseBody
    public Map<String,String> testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("cc","11");
        map.put("bb","22");
        map.put("aa","33");
        return map;
    }


    @GetMapping("/api/getapi")
    @ResponseBody
    public Object getParam(@RequestParam(value = "id", required = true /*,defaultValue = "sdfsdfw"*/) String sid,
                           @RequestParam(value = "formid", required = false,defaultValue = "formid") String formid){
        params.clear();
//        params.put("sid",sid);
        params.put("formid",formid);
        return params;
    }

    @GetMapping("/api/getUser")
    @ResponseBody
    public Object TestsTable(){
        return new TestsTable("1122334455",  new Date(),"passwd",0);
    }




    @GetMapping("/re/index")
    public Object index(){
        int i = 1/0;
        return "index";
    }

    @GetMapping("/re/error")
    public Object error(@RequestParam(value = "sid") String sid){


        if(sid.equals("s")){
            throw new CustomExtHandlerMy("500","我是从控制器传出来的异常，你出错了！");
        }else{
            return "index";
        }


    }

    @RequestMapping(value = "/re/index3")
    public String index3(Model model){

        model.addAttribute("msg","你好");
        return "error";
    }


}