package SushiOrderManagement;
import java.awt.event.KeyEvent;

/**
 *
 * @author Simon
 */



public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginpanel1 = new javax.swing.JPanel();
        lusername = new javax.swing.JLabel();
        lpassword = new javax.swing.JLabel();
        Fusername = new javax.swing.JTextField();
        Fpassword = new javax.swing.JPasswordField();
        Blogin = new javax.swing.JButton();
        loginbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SushiOrderManagement");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginpanel1.setBackground(new java.awt.Color(253, 207, 109));

        lusername.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        lusername.setText("USERNAME :");

        lpassword.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        lpassword.setText("PASSWORD :");

        Fusername.setBackground(new java.awt.Color(252, 255, 231));
        Fusername.setFont(new java.awt.Font("TH Sarabun New", 0, 48)); // NOI18N
        Fusername.setToolTipText("");
        Fusername.setBorder(null);
        Fusername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Fusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FusernameKeyPressed(evt);
            }
        });

        Fpassword.setBackground(new java.awt.Color(252, 255, 231));
        Fpassword.setFont(new java.awt.Font("TH Sarabun New", 0, 48)); // NOI18N
        Fpassword.setBorder(null);
        Fpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FpasswordActionPerformed(evt);
            }
        });
        Fpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FpasswordKeyPressed(evt);
            }
        });

        Blogin.setBackground(new java.awt.Color(253, 207, 109));
        Blogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        Blogin.setForeground(new java.awt.Color(253, 207, 109));
        Blogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LoginBtn.png"))); // NOI18N
        Blogin.setBorder(null);
        Blogin.setBorderPainted(false);
        Blogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginpanel1Layout = new javax.swing.GroupLayout(loginpanel1);
        loginpanel1.setLayout(loginpanel1Layout);
        loginpanel1Layout.setHorizontalGroup(
            loginpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lusername)
                    .addComponent(lpassword))
                .addGap(18, 18, 18)
                .addGroup(loginpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fusername, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(Fpassword))
                .addGap(27, 27, 27))
            .addGroup(loginpanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(Blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        loginpanel1Layout.setVerticalGroup(
            loginpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(loginpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lusername)
                    .addComponent(Fusername, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(loginpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lpassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Fpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        getContentPane().add(loginpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 640, 380));

        loginbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Login.png"))); // NOI18N
        getContentPane().add(loginbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FpasswordActionPerformed

    private void FpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FpasswordKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        BloginActionPerformed(null);
       }
    }//GEN-LAST:event_FpasswordKeyPressed

    private void FusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FusernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        BloginActionPerformed(null);
       }
    }//GEN-LAST:event_FusernameKeyPressed

    private void BloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloginActionPerformed
        User user = new User();
        user.checkAccount(Fusername.getText(),Fpassword.getText());
        if (user.PERMISSION == null){
        }else{
            this.dispose();
        }
    }//GEN-LAST:event_BloginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blogin;
    private javax.swing.JPasswordField Fpassword;
    private javax.swing.JTextField Fusername;
    private javax.swing.JLabel loginbg;
    private javax.swing.JPanel loginpanel1;
    private javax.swing.JLabel lpassword;
    private javax.swing.JLabel lusername;
    // End of variables declaration//GEN-END:variables
}
