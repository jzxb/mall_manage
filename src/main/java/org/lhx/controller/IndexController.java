package org.lhx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lhx
 * @date 2019/5/7 - 15:19
 */
@Controller
public class IndexController {

    @RequestMapping("goto_spu")
    public String gotoSpu(){
        return "spu";
    }

    @RequestMapping("/index")
    public String index(){
        return "main";
    }

}
