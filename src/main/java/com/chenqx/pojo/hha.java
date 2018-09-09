package com.chenqx.pojo;

import lombok.Data;


public enum hha {
    EQ(1),
    GT(2),
    LT(3),
    GTE(4),
    LTE(5);
    private int value;

    hha(int value) {
        this.value = value;
    }
}
