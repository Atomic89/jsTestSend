package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Информация об автомобиле
 */
@Getter
@Setter
public class AutoInfo {
    /**
     * @param number номер автомобиля
     */
    private String number;
    /**
     * @param mark марка автомобиля
     */
    private String mark;
    /**
     * @param year год автомобиля
     */
    private String year;
    /**
     * @param nameOrg название организации
     */
    private String nameOrg;
}
