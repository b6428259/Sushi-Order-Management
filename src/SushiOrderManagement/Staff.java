/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SushiOrderManagement;
import javax.swing.JFrame;

/**
 *
 * @author Simon
 */
public class Staff extends User {
        
    Menu menu = new Menu();
    
        void openMenu(String ID,String NAME){
                StaffMenu staffMenu = new StaffMenu(ID, NAME);
                        staffMenu.setVisible(true);
                        staffMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        staffMenu.showInfo(ID,NAME);
                        
                        String orderId = menu.generateOrderId();
                         staffMenu.orderid.setText(orderId);
        }
        
    }

