package SushiOrderManagement;
//SOM
/**
 *
 * @author Simon
 */
import SushiOrderManagement.Login;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




public class AdminMenu extends javax.swing.JFrame {
    // change file path here
    File F = new File("C:\\XD\\Java");
    
    public AdminMenu() {
        initComponents();
         //set Topic "ACCOUNT"
        PAccountText.setVisible(true);
        //set color TAB
        AccountTab.setBackground(new java.awt.Color (43,52,103));
        // set Color TEXT ON TAB
        laccounttext.setForeground(new java.awt.Color (252,255,231));
        //set Visible Page
        Pmain.setVisible(true);
        Pacc.setVisible(true);
        AccountTable.setAutoCreateRowSorter(true);
    }

//Check if folder exist if not then create folder
     void createDir(){
        if(!F.exists())
        {
            F.mkdir();
        }
    }
    //Check if .txt exist if not then create .txt
    void readFile(){
        try {
            FileReader FRadmin = new FileReader(F+"\\Account.txt");
            System.out.println("File Exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter FWadmin = new FileWriter(F+"\\Account.txt");
                System.out.println("File Created");
            } catch (IOException ex1) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } 
        
    }
        //count line for next block of data

       void showTable() {
    try {
        //reset Table
        AccountTable.setModel(new DefaultTableModel(null, new String[] {} ) ); 
        
        //Choose location
        BufferedReader BR = new BufferedReader(new FileReader(F+"\\Account.txt"));

        // Read the first line to get the column names
        String columnsLine = BR.readLine();
        String[] columns = columnsLine.split(":");

        // Set the column names to the JTable model
        DefaultTableModel model = (DefaultTableModel) AccountTable.getModel();
        model.setColumnIdentifiers(columns);

        // Read the remaining lines to get the data and add it to the model
        String line;
        while ((line = BR.readLine()) != null) {
            String[] dataRow = line.split(":");
            model.addRow(dataRow);
        }

        // Close the BufferedReader
        BR.close();

    } catch (IOException ex) {
        // Handle the exception
        ex.printStackTrace();
    }
}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pmanagement = new javax.swing.JPanel();
        ladmintext = new javax.swing.JLabel();
        PAccountText = new javax.swing.JPanel();
        AccountText = new javax.swing.JLabel();
        logoutbtn1 = new javax.swing.JButton();
        MainTab = new javax.swing.JPanel();
        AccountTab = new javax.swing.JPanel();
        laccounttext = new javax.swing.JLabel();
        Pmain = new javax.swing.JPanel();
        Pacc = new javax.swing.JPanel();
        IDtext = new javax.swing.JLabel();
        accidf = new javax.swing.JTextField();
        NAMEtext = new javax.swing.JLabel();
        accnamef = new javax.swing.JTextField();
        USERNAMEtext = new javax.swing.JLabel();
        accusernamef = new javax.swing.JTextField();
        PASSWORDtext = new javax.swing.JLabel();
        accpermissioncb = new javax.swing.JComboBox<>();
        addAccBtn = new javax.swing.JButton();
        showTableBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        PERMISSIONtext = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AccountTable = new javax.swing.JTable();
        searchf = new javax.swing.JTextField();
        accpasswordf = new javax.swing.JPasswordField();
        resetdataBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(43, 52, 103));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        Pmanagement.setBackground(new java.awt.Color(253, 207, 109));
        Pmanagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ladmintext.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        ladmintext.setForeground(new java.awt.Color(43, 52, 103));
        ladmintext.setText("ADMIN");
        Pmanagement.add(ladmintext, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 50));

        PAccountText.setBackground(new java.awt.Color(253, 207, 109));

        AccountText.setBackground(new java.awt.Color(43, 52, 103));
        AccountText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 38)); // NOI18N
        AccountText.setForeground(new java.awt.Color(43, 52, 103));
        AccountText.setText("ACCOUNT");

        logoutbtn1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        logoutbtn1.setText("Log out");
        logoutbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PAccountTextLayout = new javax.swing.GroupLayout(PAccountText);
        PAccountText.setLayout(PAccountTextLayout);
        PAccountTextLayout.setHorizontalGroup(
            PAccountTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAccountTextLayout.createSequentialGroup()
                .addContainerGap(426, Short.MAX_VALUE)
                .addComponent(AccountText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263)
                .addComponent(logoutbtn1)
                .addGap(45, 45, 45))
        );
        PAccountTextLayout.setVerticalGroup(
            PAccountTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAccountTextLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(PAccountTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAccountTextLayout.createSequentialGroup()
                        .addComponent(AccountText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAccountTextLayout.createSequentialGroup()
                        .addComponent(logoutbtn1)
                        .addGap(20, 20, 20))))
        );

        Pmanagement.add(PAccountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1030, 70));

        MainTab.setBackground(new java.awt.Color(252, 255, 231));

        AccountTab.setBackground(new java.awt.Color(252, 255, 231));
        AccountTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 52, 103), 2));
        AccountTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccountTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountTabMouseClicked(evt);
            }
        });

        laccounttext.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        laccounttext.setForeground(new java.awt.Color(43, 52, 103));
        laccounttext.setText("ACCOUNT");

        javax.swing.GroupLayout AccountTabLayout = new javax.swing.GroupLayout(AccountTab);
        AccountTab.setLayout(AccountTabLayout);
        AccountTabLayout.setHorizontalGroup(
            AccountTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountTabLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(laccounttext)
                .addGap(42, 42, 42))
        );
        AccountTabLayout.setVerticalGroup(
            AccountTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountTabLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(laccounttext)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout MainTabLayout = new javax.swing.GroupLayout(MainTab);
        MainTab.setLayout(MainTabLayout);
        MainTabLayout.setHorizontalGroup(
            MainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainTabLayout.setVerticalGroup(
            MainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainTabLayout.createSequentialGroup()
                .addComponent(AccountTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 597, Short.MAX_VALUE))
        );

        Pmain.setBackground(new java.awt.Color(223, 222, 220));
        Pmain.setForeground(new java.awt.Color(223, 222, 220));

        Pacc.setBackground(new java.awt.Color(223, 222, 220));

        IDtext.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        IDtext.setText("ID:");

        accidf.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        accidf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accidfActionPerformed(evt);
            }
        });

        NAMEtext.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        NAMEtext.setText("NAME:");

        accnamef.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        USERNAMEtext.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        USERNAMEtext.setText("USERNAME:");

        accusernamef.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        PASSWORDtext.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        PASSWORDtext.setText("PASSWORD:");

        accpermissioncb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        accpermissioncb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "staff", "admin" }));
        accpermissioncb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accpermissioncbActionPerformed(evt);
            }
        });

        addAccBtn.setText("Add");
        addAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccBtnActionPerformed(evt);
            }
        });

        showTableBtn.setText("Show Table");
        showTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTableBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        PERMISSIONtext.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        PERMISSIONtext.setText("PERMISSION:");

        AccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Password", "Permission"
            }
        ));
        jScrollPane2.setViewportView(AccountTable);

        accpasswordf.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        resetdataBtn.setText("Reset Data");
        resetdataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetdataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaccLayout = new javax.swing.GroupLayout(Pacc);
        Pacc.setLayout(PaccLayout);
        PaccLayout.setHorizontalGroup(
            PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(PaccLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NAMEtext)
                    .addComponent(IDtext)
                    .addComponent(USERNAMEtext)
                    .addComponent(PASSWORDtext)
                    .addComponent(PERMISSIONtext))
                .addGap(18, 18, 18)
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accusernamef)
                    .addComponent(accnamef)
                    .addComponent(accidf)
                    .addComponent(accpermissioncb, 0, 402, Short.MAX_VALUE)
                    .addComponent(accpasswordf)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaccLayout.createSequentialGroup()
                        .addComponent(searchf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaccLayout.createSequentialGroup()
                        .addComponent(addAccBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showTableBtn)
                        .addGap(4, 4, 4)
                        .addComponent(resetdataBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaccLayout.setVerticalGroup(
            PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaccLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accidf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDtext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accnamef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NAMEtext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accusernamef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USERNAMEtext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PASSWORDtext)
                    .addComponent(accpasswordf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PERMISSIONtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accpermissioncb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addAccBtn)
                    .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(showTableBtn)
                        .addComponent(resetdataBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PaccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(searchf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PmainLayout = new javax.swing.GroupLayout(Pmain);
        Pmain.setLayout(PmainLayout);
        PmainLayout.setHorizontalGroup(
            PmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PmainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PmainLayout.setVerticalGroup(
            PmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PmainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pmanagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pmanagement, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Click on Account Tab
    private void AccountTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountTabMouseClicked
        //set Topic "ACCOUNT"
        PAccountText.setVisible(true);
        //set color TAB
        AccountTab.setBackground(new java.awt.Color (43,52,103));;
        // set Color TEXT ON TAB
        laccounttext.setForeground(new java.awt.Color (252,255,231));
        //set Visible Page
        Pmain.setVisible(true);
        Pacc.setVisible(true);
    }//GEN-LAST:event_AccountTabMouseClicked

    private void addAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccBtnActionPerformed
       Admin admin = new Admin();
        createDir();
        readFile();
        admin.countLines();
        admin.regisUser(accidf.getText(),accnamef.getText(),accusernamef.getText(),accpasswordf.getText(),accpermissioncb.getSelectedItem().toString()); //accpermissionf.getText()
        showTable();
    }//GEN-LAST:event_addAccBtnActionPerformed

    private void logoutbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtn1ActionPerformed
        Login login = new Login();
                        login.setVisible(true);
                        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.setVisible(false);
    }//GEN-LAST:event_logoutbtn1ActionPerformed

    private void accpermissioncbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accpermissioncbActionPerformed
        
    }//GEN-LAST:event_accpermissioncbActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
                  DefaultTableModel obj=(DefaultTableModel) AccountTable.getModel();
        TableRowSorter<DefaultTableModel> obj1=new TableRowSorter<>(obj);
        AccountTable.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchf.getText()));
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void accidfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accidfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accidfActionPerformed

    private void showTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTableBtnActionPerformed
         showTable();
    }//GEN-LAST:event_showTableBtnActionPerformed

    private void resetdataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetdataBtnActionPerformed
      Admin admin = new Admin();
        int response = JOptionPane.showConfirmDialog(this,"Do you want to reset all data ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
        admin.resetTable();
        showTable();
        }else{
        System.out.println("NO OR EXIT");
    }//GEN-LAST:event_resetdataBtnActionPerformed
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountTab;
    private javax.swing.JTable AccountTable;
    private javax.swing.JLabel AccountText;
    private javax.swing.JLabel IDtext;
    private javax.swing.JPanel MainTab;
    private javax.swing.JLabel NAMEtext;
    private javax.swing.JLabel PASSWORDtext;
    private javax.swing.JPanel PAccountText;
    private javax.swing.JLabel PERMISSIONtext;
    private javax.swing.JPanel Pacc;
    private javax.swing.JPanel Pmain;
    private javax.swing.JPanel Pmanagement;
    private javax.swing.JLabel USERNAMEtext;
    private javax.swing.JTextField accidf;
    private javax.swing.JTextField accnamef;
    private javax.swing.JPasswordField accpasswordf;
    private javax.swing.JComboBox<String> accpermissioncb;
    private javax.swing.JTextField accusernamef;
    private javax.swing.JButton addAccBtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel laccounttext;
    private javax.swing.JLabel ladmintext;
    private javax.swing.JButton logoutbtn1;
    private javax.swing.JButton resetdataBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchf;
    private javax.swing.JButton showTableBtn;
    // End of variables declaration//GEN-END:variables
}
