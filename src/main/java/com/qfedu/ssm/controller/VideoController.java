package com.qfedu.ssm.controller;

import com.qfedu.ssm.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
    public class VideoController {

        @Autowired
        VideoService videoService;

        @RequestMapping("/list")
        public String list(){
            System.out.println("我通过springmvc进来了");
            videoService.queryList();
            return "index";
        }
    }
