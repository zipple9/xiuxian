package com.domain;

import java.util.List;

/**
 * Created by wzy on 2019/1/25 10:36
 **/
public class role {

    private String name;
    private List<item> item;
    private List<skill> skill;
    private attribute attribute;
    private roleStatus roleStatus;
    private roleData roleData;
    /**
     * 0:armor   1:weapon   2:shoes  3:head
     */
    private List<item> equipment;

    private String JingJie="";


    @Override
    public String toString() {
        System.out.println(roleData);
        return this.name;
    }


    public role(String name, List<com.domain.item> item, List<com.domain.skill> skill, com.domain.attribute attribute, com.domain.roleStatus roleStatus, com.domain.roleData roleData, List<com.domain.item> equipment, String jingJie) {
        this.name = name;
        this.item = item;
        this.skill = skill;
        this.attribute = attribute;
        this.roleStatus = roleStatus;
        this.roleData = roleData;
        this.equipment = equipment;
        JingJie = jingJie;
    }

    public role(String name) {
        this.name = name;
    }
}
