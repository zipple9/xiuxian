package com.domain;

/**
 * Created by wzy on 2019/1/25 11:12
 **/
public class attribute {

    private int Lin=0;
    private int Body=0;
    private int Intelligence=0;

    private int Lin_Capacity=0;
    private int Lin_Control=0;
    private int Lin_Regain=0;

    private int Body_Strength=0;
    private int Body_agility=0;
    private int Body_Physique=0;

    private int skillP=50;
    private int LinSkillP=Lin*3;
    private int BodySkillP=Body*3;


    public int getLin() {
        return Lin;
    }

    public int getBody() {
        return Body;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getLin_Capacity() {
        return Lin_Capacity;
    }

    public int getLin_Control() {
        return Lin_Control;
    }

    public int getLin_Regain() {
        return Lin_Regain;
    }

    public int getBody_Strength() {
        return Body_Strength;
    }

    public int getBody_agility() {
        return Body_agility;
    }

    public int getBody_Physique() {
        return Body_Physique;
    }

    public int getSkillP() {
        return skillP;
    }

    public int getLinSkillP() {
        return LinSkillP;
    }

    public int getBodySkillP() {
        return BodySkillP;
    }

    public void setLin(int lin) {
        Lin = lin;
    }

    public void setBody(int body) {
        Body = body;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public void setLin_Capacity(int lin_Capacity) {
        Lin_Capacity = lin_Capacity;
    }

    public void setLin_Control(int lin_Control) {
        Lin_Control = lin_Control;
    }

    public void setLin_Regain(int lin_Regain) {
        Lin_Regain = lin_Regain;
    }

    public void setBody_Strength(int body_Strength) {
        Body_Strength = body_Strength;
    }

    public void setBody_agility(int body_agility) {
        Body_agility = body_agility;
    }

    public void setBody_Physique(int body_Physique) {
        Body_Physique = body_Physique;
    }

    public void setSkillP(int skillP) {
        this.skillP = skillP;
    }

    public void setLinSkillP(int linSkillP) {
        LinSkillP = linSkillP;
    }

    public void setBodySkillP(int bodySkillP) {
        BodySkillP = bodySkillP;
    }






    public boolean PCheck(){
        return Lin_Capacity*3+Lin_Control*3+Lin_Regain*3==Lin && Body_agility*3+Body_Physique*3+Body_Strength*3==Body;
    }

    public void addLin(){
    }

    public void addBody(){

    }
}
