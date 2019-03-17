package com.domain;

/**
 * Created by wzy on 2019/1/25 12:30
 **/
public class roleData {

    /**
     * 灵气
     */
    private int LinQi;

    private int HP=500;
    private int LP=500;
    /**
     * regain per 3 secends
     */
    private int HPRegain=5;
    private int LPRegain=5;




    private double attack=50.0d;
    private double armor;
    /**
     * 多少秒攻击一次
     */
    private double speed=3.0;

    private double dodge;
    private double critical=0.1;

    private double critDamage=1.5;


    public void generateData(attribute attribute,roleStatus roleStatus){


        /**
         * 根据属性点attribute计算人物的能力值data
         */
        this.LPRegain+=attribute.getLin_Regain()*3;
        this.LP=(attribute.getLin_Capacity()+100)/100*this.LP;
        this.HPRegain+=attribute.getBody_Physique();
        this.HP+=attribute.getBody_Physique()*10;
        this.attack+=attribute.getBody_Strength()*2;
        this.armor+=attribute.getBody_Strength()*0.3;
        this.speed=90/(attribute.getBody_agility()+30);
        this.dodge+=attribute.getBody_agility()*0.6/100;


    }


}
