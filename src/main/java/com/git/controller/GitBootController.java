package com.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2020/10/18 0018.
 */

@Controller
public class GitBootController {

    @ResponseBody
    @RequestMapping("/helloBoot")
    public String hello(){
        return "Hello boot!!!";
    }

    @ResponseBody
    @RequestMapping("helloGit")
    public String hello2(){
        return "Hello GitHub!";
    }

    @ResponseBody
    @RequestMapping("helloEveryOne")
    public String hello3(String name){
        return "Hello 2 "+name+ "!";
    }
}
