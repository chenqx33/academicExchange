package com.chenqx.pojo;

public enum Season {
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("冬");
    public String des;
    Season(){}
    Season(String season){
        this.des=season;
    }
    public String getDes(){
        return this.des;
    }
    public void setDes(String des){
        this.des=des;
    }
    public void intro(){
        System.out.println(this.des);
    }

}
