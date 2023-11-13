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
public class Dessert extends Menu {


    private int[] dessertCount  = new int[15];

    public Dessert() {
        for (int i = 0; i < dessertMenu.length; i++) {
            itemPrice.put(dessertMenu[i], dessertPrice[i]);
        }
    }

    public String orderSushi(int index) {
        dessertCount[index]++;
        incrementCount(dessertMenu[index]);
        return dessertMenu[index];
    }
}