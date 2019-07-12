package com.qfedu.ssm.service;

import com.qfedu.ssm.pojo.Area;

import java.util.List;

public interface AreaService {
    List<Area> provinceServlet();

    List<Area> getCity(int id);

    List<Area> getCountry(int id);
}
