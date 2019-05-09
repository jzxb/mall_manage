package org.lhx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lhx
 * @date 2019/5/8 - 9:11
 */
@Controller
public class SpuController {

    @RequestMapping("goto_spu_add")
    public String gotoSpuAdd(){
        return "spuAdd";
    }

    @RequestMapping("spu_add")
    public String spuAdd(){
        return "redirect:/goto_spu_add";
    }
}
