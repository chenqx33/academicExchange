package com.chenqx.old;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum ConditionEnum {

    YEAR("YEAR") {
        @Override
        public boolean checkTime(Long firstTime, Long secondTime) {
            if (super.checkTime(firstTime, secondTime)) {
                return true;
            }
            return dateConverter(firstTime).getYear() == dateConverter(secondTime).getYear();
        }
    },
    MONTH("MONTH") {
        @Override
        public boolean checkTime(Long firstTime, Long secondTime) {
            if (super.checkTime(firstTime, secondTime)) {
                return true;
            }
            LocalDateTime t1 = dateConverter(firstTime);
            LocalDateTime t2 = dateConverter(secondTime);
            return t1.getYear() == t2.getYear() && t1.getMonthValue() == t2.getMonthValue();
        }
    },
    DAY("DAY") {
        @Override
        public boolean checkTime(Long firstTime, Long secondTime) {
            if (super.checkTime(firstTime, secondTime)) {
                return true;
            }
            LocalDateTime t1 = dateConverter(firstTime);
            LocalDateTime t2 = dateConverter(secondTime);
            return t1.getYear() == t2.getYear()
                    && t1.getMonthValue() == t2.getMonthValue()
                    && t1.getDayOfMonth() == t2.getDayOfMonth();
        }
    },
    NONE("NONE") {
        @Override
        public boolean checkTime(Long firstTime, Long secondTime) {
            return true;
        }
    };

    private String condition;
    public static Map<String, ConditionEnum> conditionEnumMap = new HashMap<String, ConditionEnum>();

    static {
        for (ConditionEnum value : values()) {
            conditionEnumMap.put(value.toString(), value);
        }
    }

    ConditionEnum(String condition) {
        this.condition = condition;
    }

    public static ConditionEnum of(String condition) {
        return conditionEnumMap.get(condition);
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return this.condition;
    }

    public boolean checkTime(Long firstTime, Long secondTime) {
        return Objects.isNull(secondTime);
    }

    protected LocalDateTime dateConverter(long time) {
        return LocalDateTime.ofEpochSecond(time / 1000, 0, ZoneOffset.ofHours(8));
    }
}

class test{
    public static void main(String[] args) {
        ConditionEnum e = get();
        System.out.println(e.name());
    }

    public static ConditionEnum get(){
        return ConditionEnum.DAY;
    }
}
