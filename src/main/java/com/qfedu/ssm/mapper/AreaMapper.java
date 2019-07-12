package com.qfedu.ssm.mapper;

import com.qfedu.ssm.pojo.Area;

import java.util.List;

public interface AreaMapper {

    List<Area> provinceServlet();

    List<Area> getCity(int id);

    List<Area> getCountry(int id);
}
