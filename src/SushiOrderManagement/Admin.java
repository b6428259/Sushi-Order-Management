package SushiOrderManagement;
import SushiOrderManagement.Login;
import SushiOrderManagement.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class Admin extends User {
    int ln = 0;
    int currentIndex = -1;
    int numAccounts = 0;

       
        void openMenu(){
            AdminMenu adminMenu = new AdminMenu();
                        adminMenu.setVisible(true);
                        adminMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
        
        //add user
        void regisUser(String id ,String name ,String username ,String password ,String permission){
        String Id, Name,Username,Password,Permission;
        numAccounts++;
        currentIndex = numAccounts - 1;
        try {
            Id = id;
            Name = name;
            Username = username;
            Password = password;
            Permission = permission;
            RandomAccessFile RAF = new RandomAccessFile(F+"\\Account.txt","rwd");
            File A = new File(F+"Account.txt");
            //write Column of ID, Name, Username, Password and Permission
            RAF.writeBytes("ID:Name:Username:Password:Permission\r\n");
                for(int i = 0; i < ln; i++){
                RAF.readLine();
            }
            //write data in txt files
            RAF.writeBytes(Id+":"+Name+":"+Username+":"+Password+":"+Permission+"\r\n");
            
            //show output on console
            System.out.println("\r\n"+"\r\n"+"ID:"+Id+"\r\n"+"Name:"+Name+"\r\n"+"Username:"+Username+"\r\n"+"Password:"+Password+"\r\n"+"Permission:"+Permission);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Added Account Succesfully");

    }
        void resetTable()
       {
        try {
            PrintWriter pw = new PrintWriter(F+"\\Account.txt");
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }

        //Count line on notepad
         void countLines(){
        try {
        ln=1;
        RandomAccessFile RAF = new RandomAccessFile(F+"\\Account.txt","rw");
            for(int i = 0; RAF.readLine() != null; i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
         } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
         
    
    
}
