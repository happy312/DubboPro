package com.zw.dubbopro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class Test {
    /**
     * 项目启动测试
     * @return
     */
    @GetMapping("/startUp")
    public String startUp() {

        return "success";
    }



    // 第二次提交测试一下
    // 第3次提交测试一下
}
