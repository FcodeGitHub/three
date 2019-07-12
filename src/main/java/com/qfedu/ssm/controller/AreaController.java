package com.qfedu.ssm.controller;

import com.qfedu.ssm.pojo.Area;
import com.qfedu.ssm.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AreaController {

    @Autowired
    AreaService areaService;

    @RequestMapping("/provinceServlet")
    @ResponseBody
    public List<Area> provinceServlet(Model model){

        List<Area> areaList = areaService.provinceServlet();
        return areaList;
    }

    @RequestMapping("/getCity")
    @ResponseBody
    public List<Area> getCity(int id){
        List<Area> areaList = areaService.getCity(id);
        return areaList;
    }

    @RequestMapping("/getCountry")
    @ResponseBody
    public List<Area> getCountry(int id){

        List<Area> areaList = areaService.getCountry(id);
        return areaList;
    }
}
