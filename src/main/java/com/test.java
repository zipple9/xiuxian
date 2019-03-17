package com;

import com.alibaba.druid.pool.DruidDataSource;
import com.config.RootConfig;
import com.config.druidDataSourceConfig;
import com.service.myService;
import com.util.chineseName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Arrays;

/**
 * Created by wzy on 2019/1/22 15:03
 **/
public class test {

    
    
    
    public static void main (String args[]){
//        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(RootConfig.class,druidDataSourceConfig.class);
//
//        String[] sa=ctx.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(sa));
//
//
//        myService ms=(myService)ctx.getBean("myService");
//        ms.test();

        for (int i = 0; i <20 ; i++) {
            System.out.println(chineseName.getName());

        }

    }


}
