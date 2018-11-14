package com.chenqx.old;

public enum SeasonEnum {
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("冬");

    private String season;

    SeasonEnum(String season) {
        this.season = season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
    public String getThis(){
        return ""+this;
    }
}
class tests{
    public static void main(String[] args) {
        SeasonEnum.SPRING.setSeason("h");
        System.out.println(SeasonEnum.SPRING.getSeason());
        System.out.println(SeasonEnum.SPRING.toString());
        System.out.println(SeasonEnum.SPRING.ordinal());
        System.out.println(SeasonEnum.WINTER.getDeclaringClass());
        System.out.println(SeasonEnum.WINTER.getThis());
    }
}