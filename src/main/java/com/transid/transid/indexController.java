package com.transid.transid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/formCadCliente")
    public String formCadCliente(){
        return "formCadCliente";
    }
}
