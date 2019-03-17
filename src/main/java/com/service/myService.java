package com.service;

import com.dao.testDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wzy on 2019/1/22 16:28
 **/
@Service
public class myService {

    @Autowired
    private testDao td;

    public void test(){
        String str=td.test();
        System.out.println(str);
    }

}
