package com.util;

import com.domain.attribute;
import com.domain.role;

/**
 * Created by wzy on 2019/1/25 11:42
 **/
public class roleGenerator {



    public role generatrRole(String JingJie){
        role r=new role(chineseName.getName());



        return r;
    }




//    public attribute getRandomAttrubute(){
//        attribute atb=new attribute();
//        atb.setBody(Math.round((float)(atb.getSkillP()*Math.random())));
//        atb.setBody_Strength(Math.round((float)(atb.getBodySkillP()*Math.random())));
//        atb.setBody_agility(Math.round((float)((atb.getBodySkillP()-atb.getBody_Strength()) *Math.random())));
//        atb.setBody_Physique(atb.getBodySkillP()-atb.getBody_Strength()-atb.getBody_agility());
//
//
//
//        atb.setLin(atb.getSkillP()-atb.getBody());
//        atb.setLin_Capacity(Math.round((float)(atb.getLinSkillP()*Math.random())));
//        atb.setLin_Control(Math.round((float)((atb.getLinSkillP()-atb.getLin_Capacity()) *Math.random())));
//        atb.setLin_Regain(atb.getLinSkillP()-atb.getLin_Capacity()-atb.getLin_Control());
//
//    }
}
