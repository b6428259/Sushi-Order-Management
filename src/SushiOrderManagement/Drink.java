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
public class Drink extends Menu {   


    private int[] drinkCount  = new int[15];

    public Drink() {
        for (int i = 0; i < drinkMenu.length; i++) {
            itemPrice.put(drinkMenu[i], drinkPrice[i]);
        }
    }

    public String orderSushi(int index) {
        drinkCount[index]++;
        incrementCount(drinkMenu[index]);
        return drinkMenu[index];
    }
}