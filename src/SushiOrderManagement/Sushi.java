/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SushiOrderManagement;
import java.util.HashMap;

public class Sushi extends Menu {

    private int[] sushiCount = new int[15];

    public Sushi() {
        for (int i = 0; i < sushiMenu.length; i++) {
            itemPrice.put(sushiMenu[i], sushiPrice[i]);
        }
    }

    public String orderSushi(int index) {
        sushiCount[index]++;
        incrementCount(sushiMenu[index]);
        return sushiMenu[index];
    }
}