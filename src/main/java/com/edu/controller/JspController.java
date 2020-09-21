package com.edu.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspController {


        @RequestMapping("/index")
        @ResponseBody
        public String jspIndex() {
//            System.out.println("ip:"+ LogUtils.getIpAdress());
            return "jenkins sucess !";
        }


}
