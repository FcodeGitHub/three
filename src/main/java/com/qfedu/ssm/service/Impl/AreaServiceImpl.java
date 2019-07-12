package com.qfedu.ssm.service.Impl;

import com.qfedu.ssm.mapper.AreaMapper;
import com.qfedu.ssm.pojo.Area;
import com.qfedu.ssm.service.AreaService;
import com.qfedu.ssm.utils.JedisClient;
import com.qfedu.ssm.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaMapper areaMapper;
    @Autowired
    JsonUtils jsonUtils;
    @Autowired
    JedisClient jedisClient;


    @Override
    public List<Area> provinceServlet() {
        //从redis中获取数据
        String areaJson = jedisClient.get("LEVEL:" +1);
        List<Area> areaList = null;
        //判断数据是否为空
        if (null == areaJson || areaJson.equals("")){
            //从mysql中查询
            areaList = areaMapper.provinceServlet();
            //转为json
            String areaData = jsonUtils.objectToJson(areaList);
            //存入redis中
            jedisClient.set("LEVEL:"+1,areaData);
            System.out.println("从数据库中获取");
        }else {
            //将redis中获取的数据转为json
            areaList = jsonUtils.jsonToList(areaJson,Area.class);
            System.out.println("从redis中获取");
        }
        return areaList;
    }

    @Override
    public List<Area> getCity(int id) {
        String areaJson = jedisClient.get("LEVEL:" + id);
        List<Area> areaList = null;
        if (null == areaJson || areaJson.equals("")){

            //重数据库中查询数据
            areaList = areaMapper.getCity(id);

            //转为json数据
            String areaDate = jsonUtils.objectToJson(areaList);

            //存入redis中
            jedisClient.set("LEVEL:"+id,areaDate);

            System.out.println("从数据库中查询");
        }else {
            //将redis中获取的数据转为json
            areaList = jsonUtils.jsonToList(areaJson, Area.class);
        }

        return areaList;
    }

    @Override
    public List<Area> getCountry(int id) {

        String areaJson = jedisClient.get("LEVEL:" + id);
        List<Area> areaList = null;
        if (null == areaJson || areaJson.equals("")){
            //从数据库查询数据
            areaList = areaMapper.getCountry(id);

            //转为json数据
            String areaDate = jsonUtils.objectToJson(areaList);

            //存入redis中
            jedisClient.set("LEVEL:"+id,areaDate);

            System.out.println("从数据库中查询");
        }else {
            //将redis中获取的数据转化为json
            areaList = jsonUtils.jsonToList(areaJson, Area.class);
        }

        return areaList;
    }
}
