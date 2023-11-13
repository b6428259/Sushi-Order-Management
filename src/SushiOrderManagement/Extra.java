/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SushiOrderManagement;

import java.util.HashMap;

/**
 *
 * @author Simon
 */
public class Extra extends Menu {



    private int[] extraCount  = new int[15];

    public Extra() {
        for (int i = 0; i < extraMenu.length; i++) {
            itemPrice.put(extraMenu[i], extraPrice[i]);
        }
    }

    public String orderSushi(int index) {
        extraCount[index]++;
        incrementCount(extraMenu[index]);
        return extraMenu[index];
    }
}