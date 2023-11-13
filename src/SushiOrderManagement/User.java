/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SushiOrderManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
//check if username and password match multi login data  
public class User {
    String ID,NAME,USERNAME,PASSWORD,PERMISSION,line;
    
    File F = new File("C:\\XD\\Java");               //File Path
    
    void checkAccount(String username, String password) {
RandomAccessFile RAF = null;
    try {
        RAF = new RandomAccessFile(F+"\\Account.txt", "rw");
        int found = 0;
        while ((line = RAF.readLine()) != null) {
            String[] fields = line.split(":");
            if (fields.length == 5) {
                ID = fields[0];
                NAME = fields[1];
                USERNAME = fields[2];
                PASSWORD = fields[3];
                PERMISSION = fields[4];

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    found = 1;
                } else {
                    found = 0;
                    PERMISSION = null;
                }
                if (found == 1) {
                    switch (PERMISSION) {
                        case "admin":
                            Admin admin = new Admin();
                            admin.openMenu();
                            PERMISSION = "admin";
                            break;
                        case "staff":
                            Staff staff = new Staff();
                            staff.openMenu(ID, NAME);
                            PERMISSION = "staff";
                            break;
                    }
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Login Error");
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        if (RAF != null) {
            try {
                RAF.close();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    
    
    
}
