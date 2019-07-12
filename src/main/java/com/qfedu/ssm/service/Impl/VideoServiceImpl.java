package com.qfedu.ssm.service.Impl;

import com.qfedu.ssm.mapper.VideoMapper;
import com.qfedu.ssm.pojo.Video;
import com.qfedu.ssm.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoMapper mapper;

    @Override
    public List<Video> queryList() {

        List<Video> videoList = mapper.queryList();
        System.out.println(videoList);
        System.out.println("我是service,我被触发了");
        return null;
    }
}
