package SushiOrderManagement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Simon
 */
public class StaffMenu extends javax.swing.JFrame {

    
    private double total = 0.0;
private int qtyss = 0;
private int x = 0, u = 0;
  
 int order = 016;
 
    public StaffMenu(String id, String name) {
        initComponents();
        sushiLabel.setForeground(new java.awt.Color (43,52,103));
        extraLabel.setForeground(new java.awt.Color (255,255,255));
        dessertLabel.setForeground(new java.awt.Color (255,255,255));
        drinkLabel.setForeground(new java.awt.Color (255,255,255));
        
        sushiBtn.setBackground(new java.awt.Color (255,255,255));
        extraBtn.setBackground(new java.awt.Color (43,52,103));
        dessertBtn.setBackground(new java.awt.Color (43,52,103));
        drinkBtn.setBackground(new java.awt.Color (43,52,103));
        
        sushiList.setVisible(true);
        extraList.setVisible(false);
        dessertList.setVisible(false);
        drinkList.setVisible(false);
        
              
  //     Menu menu = new Menu();
    }   
    void showInfo(String id,String name){
        IDLabel.setText(id);
        NAMELabel.setText(name);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StaffMainMenu = new javax.swing.JPanel();
        AddOrderBtn = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        HomeBtn = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        CheckQueueBtn = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        HistoryBtn = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        NAMELabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        orderid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        menu = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Order = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        qtyvalues = new javax.swing.JTextField();
        Notusing = new javax.swing.JTextField();
        totalvalues = new javax.swing.JTextField();
        Cancel = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        sushiBtn = new javax.swing.JPanel();
        sushiLabel = new javax.swing.JLabel();
        extraBtn = new javax.swing.JPanel();
        extraLabel = new javax.swing.JLabel();
        dessertBtn = new javax.swing.JPanel();
        dessertLabel = new javax.swing.JLabel();
        drinkBtn = new javax.swing.JPanel();
        drinkLabel = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        MenuListPanel = new javax.swing.JPanel();
        sushiList = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        r1c1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        r1c2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        r1c3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        r1c4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        r1c5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        r2c1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        r2c4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        r2c3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        r2c2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        r2c5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        r2c10 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        r2c6 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        r2c8 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        r2c7 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        r2c9 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        extraList = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        r1c6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        r1c7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        r1c8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        r1c9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        r1c10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        r2c11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        r2c12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        r2c13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        r2c14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        r2c15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        r2c16 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        r2c17 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        r2c18 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        r2c19 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        r2c20 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        dessertList = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        r1c11 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        r1c12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        r1c13 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        r1c14 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        r1c15 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        r2c21 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        r2c22 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        r2c23 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        r2c24 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        r2c25 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        r2c26 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        r2c27 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        r2c28 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        r2c29 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        r2c30 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        drinkList = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        r1c16 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        r1c17 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        r1c18 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        r1c19 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        r1c20 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        r2c31 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        r2c32 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        r2c33 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        r2c34 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        r2c35 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        r2c36 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        r2c37 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        r2c38 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        r2c39 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        r2c40 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 207, 109));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        StaffMainMenu.setBackground(new java.awt.Color(204, 204, 204));
        StaffMainMenu.setMaximumSize(new java.awt.Dimension(415, 695));
        StaffMainMenu.setMinimumSize(new java.awt.Dimension(415, 695));

        AddOrderBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AddBtn.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddOrderBtnLayout = new javax.swing.GroupLayout(AddOrderBtn);
        AddOrderBtn.setLayout(AddOrderBtnLayout);
        AddOrderBtnLayout.setHorizontalGroup(
            AddOrderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddOrderBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AddOrderBtnLayout.setVerticalGroup(
            AddOrderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HomeBtn.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout HomeBtnLayout = new javax.swing.GroupLayout(HomeBtn);
        HomeBtn.setLayout(HomeBtnLayout);
        HomeBtnLayout.setHorizontalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE)
        );
        HomeBtnLayout.setVerticalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CheckQueueBtn.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout CheckQueueBtnLayout = new javax.swing.GroupLayout(CheckQueueBtn);
        CheckQueueBtn.setLayout(CheckQueueBtnLayout);
        CheckQueueBtnLayout.setHorizontalGroup(
            CheckQueueBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CheckQueueBtnLayout.setVerticalGroup(
            CheckQueueBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HistoryBtn.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout HistoryBtnLayout = new javax.swing.GroupLayout(HistoryBtn);
        HistoryBtn.setLayout(HistoryBtnLayout);
        HistoryBtnLayout.setHorizontalGroup(
            HistoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryBtnLayout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HistoryBtnLayout.setVerticalGroup(
            HistoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(43, 52, 103));
        jPanel2.setMaximumSize(new java.awt.Dimension(389, 84));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STAFF");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID : ");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME : ");

        IDLabel.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(255, 255, 255));

        NAMELabel.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        NAMELabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAMELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(IDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(NAMELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel7.setText("NUMBER");

        jLabel39.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel39.setText("MENU");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setText("PRICE");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(79, 79, 79)
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        orderid.setBackground(new java.awt.Color(255, 255, 255));
        orderid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        orderid.setForeground(new java.awt.Color(255, 153, 0));
        orderid.setFocusable(false);
        orderid.setOpaque(false);
        orderid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderid)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderid, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.setEditable(false);
        menu.setColumns(20);
        menu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        menu.setRows(5);
        jScrollPane2.setViewportView(menu);

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        Order.setEditable(false);
        Order.setBackground(new java.awt.Color(126, 217, 87));
        Order.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        Order.setForeground(new java.awt.Color(252, 255, 231));
        Order.setText("    ORDER");
        Order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderMouseClicked(evt);
            }
        });
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Order, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        qtyvalues.setBackground(new java.awt.Color(255, 255, 255));
        qtyvalues.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        qtyvalues.setForeground(new java.awt.Color(239, 65, 54));
        qtyvalues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyvaluesActionPerformed(evt);
            }
        });

        Notusing.setEditable(false);
        Notusing.setBackground(new java.awt.Color(255, 255, 255));
        Notusing.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Notusing.setForeground(new java.awt.Color(255, 0, 0));
        Notusing.setText("     TOTAL");
        Notusing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotusingActionPerformed(evt);
            }
        });

        totalvalues.setBackground(new java.awt.Color(255, 255, 255));
        totalvalues.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        totalvalues.setForeground(new java.awt.Color(239, 65, 54));
        totalvalues.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        totalvalues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalvaluesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(qtyvalues, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Notusing, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalvalues, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qtyvalues)
            .addComponent(Notusing, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(totalvalues)
        );

        Cancel.setEditable(false);
        Cancel.setBackground(new java.awt.Color(239, 65, 54));
        Cancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Cancel.setForeground(new java.awt.Color(252, 255, 231));
        Cancel.setText("  CANCEL");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cancel))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout StaffMainMenuLayout = new javax.swing.GroupLayout(StaffMainMenu);
        StaffMainMenu.setLayout(StaffMainMenuLayout);
        StaffMainMenuLayout.setHorizontalGroup(
            StaffMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(StaffMainMenuLayout.createSequentialGroup()
                .addComponent(AddOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckQueueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(StaffMainMenuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        StaffMainMenuLayout.setVerticalGroup(
            StaffMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffMainMenuLayout.createSequentialGroup()
                .addGroup(StaffMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddOrderBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckQueueBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistoryBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(43, 52, 103));

        sushiBtn.setBackground(new java.awt.Color(43, 52, 103));
        sushiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sushiBtn.setPreferredSize(new java.awt.Dimension(180, 73));
        sushiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sushiBtnMouseClicked(evt);
            }
        });

        sushiLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        sushiLabel.setForeground(new java.awt.Color(255, 255, 255));
        sushiLabel.setText("SUSHI");

        javax.swing.GroupLayout sushiBtnLayout = new javax.swing.GroupLayout(sushiBtn);
        sushiBtn.setLayout(sushiBtnLayout);
        sushiBtnLayout.setHorizontalGroup(
            sushiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sushiBtnLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(sushiLabel)
                .addGap(32, 32, 32))
        );
        sushiBtnLayout.setVerticalGroup(
            sushiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sushiBtnLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(sushiLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        extraBtn.setBackground(new java.awt.Color(43, 52, 103));
        extraBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        extraBtn.setPreferredSize(new java.awt.Dimension(180, 73));
        extraBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extraBtnMouseClicked(evt);
            }
        });

        extraLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        extraLabel.setForeground(new java.awt.Color(255, 255, 255));
        extraLabel.setText("EXTRA");

        javax.swing.GroupLayout extraBtnLayout = new javax.swing.GroupLayout(extraBtn);
        extraBtn.setLayout(extraBtnLayout);
        extraBtnLayout.setHorizontalGroup(
            extraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extraBtnLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(extraLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        extraBtnLayout.setVerticalGroup(
            extraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extraBtnLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(extraLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        dessertBtn.setBackground(new java.awt.Color(43, 52, 103));
        dessertBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dessertBtn.setPreferredSize(new java.awt.Dimension(180, 73));
        dessertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dessertBtnMouseClicked(evt);
            }
        });

        dessertLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        dessertLabel.setForeground(new java.awt.Color(255, 255, 255));
        dessertLabel.setText("DESSERT");

        javax.swing.GroupLayout dessertBtnLayout = new javax.swing.GroupLayout(dessertBtn);
        dessertBtn.setLayout(dessertBtnLayout);
        dessertBtnLayout.setHorizontalGroup(
            dessertBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dessertBtnLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(dessertLabel)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        dessertBtnLayout.setVerticalGroup(
            dessertBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dessertBtnLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(dessertLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        drinkBtn.setBackground(new java.awt.Color(43, 52, 103));
        drinkBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drinkBtn.setPreferredSize(new java.awt.Dimension(180, 73));
        drinkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinkBtnMouseClicked(evt);
            }
        });

        drinkLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        drinkLabel.setForeground(new java.awt.Color(255, 255, 255));
        drinkLabel.setText("DRINK");

        javax.swing.GroupLayout drinkBtnLayout = new javax.swing.GroupLayout(drinkBtn);
        drinkBtn.setLayout(drinkBtnLayout);
        drinkBtnLayout.setHorizontalGroup(
            drinkBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkBtnLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(drinkLabel)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        drinkBtnLayout.setVerticalGroup(
            drinkBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkBtnLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(drinkLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        logoutbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        logoutbtn.setText("Log out");
        logoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sushiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dessertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drinkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sushiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(extraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(dessertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(drinkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutbtn)
                .addGap(21, 21, 21))
        );

        MenuListPanel.setBackground(new java.awt.Color(253, 207, 109));

        sushiList.setBackground(new java.awt.Color(253, 207, 109));
        sushiList.setMinimumSize(new java.awt.Dimension(847, 617));
        sushiList.setPreferredSize(new java.awt.Dimension(847, 617));

        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        r1c1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c1.setText("Salmon Sushi");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setText("001");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c1)
                .addGap(14, 14, 14))
        );

        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        r1c2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c2.setText("Salmon Roll");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setText("002");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel14)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c2)
                .addGap(14, 14, 14))
        );

        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        r1c3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c3.setText("      Nigiri");

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel16.setText("003");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel16)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c3)
                .addGap(14, 14, 14))
        );

        jPanel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });

        r1c4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c4.setText("        Toro");

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel18.setText("004");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel18)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c4)
                .addGap(14, 14, 14))
        );

        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });

        r1c5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c5.setText("        Ebiko");

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel20.setText("005");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel20)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c5)
                .addGap(14, 14, 14))
        );

        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        r2c1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c1.setText("   Salad Roll");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setText("006");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel12)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c1)
                .addGap(14, 14, 14))
        );

        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });

        r2c4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c4.setText("    Dory Fish");

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel22.setText("007");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel22)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c4)
                .addGap(14, 14, 14))
        );

        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });

        r2c3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c3.setText("  Sushi Saba");

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel24.setText("008");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel24)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c3)
                .addGap(14, 14, 14))
        );

        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel17.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });

        r2c2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c2.setText("  Tamagoyaki");

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel26.setText("007");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel26)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(r2c2)
                .addGap(14, 14, 14))
        );

        jPanel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel18.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        r2c5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c5.setText("      Amaebi");

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel28.setText("010");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel28)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c5)
                .addGap(14, 14, 14))
        );

        jPanel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel19.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });

        r2c10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c10.setText(" Kappa Maki");

        jLabel30.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel30.setText("015");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel30)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c10)
                .addGap(14, 14, 14))
        );

        jPanel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel20.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });

        r2c6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c6.setText("     Negitoro");

        jLabel32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel32.setText("011");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel32)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c6)
                .addGap(14, 14, 14))
        );

        jPanel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel21.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
        });

        r2c8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c8.setText("    Sushi Nori");

        jLabel34.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel34.setText("013");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel34))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(r2c8)
                .addGap(16, 16, 16))
        );

        jPanel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel22.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
        });

        r2c7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c7.setText("  Salmon Burn");

        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel36.setText("012");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel36))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(r2c7)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(57, 57, 57)
                .addComponent(r2c7)
                .addGap(15, 15, 15))
        );

        jPanel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel23.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
        });

        r2c9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c9.setText("   Tuna Rolls");

        jLabel38.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel38.setText("014");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel38)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c9)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout sushiListLayout = new javax.swing.GroupLayout(sushiList);
        sushiList.setLayout(sushiListLayout);
        sushiListLayout.setHorizontalGroup(
            sushiListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sushiListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sushiListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sushiListLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sushiListLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sushiListLayout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sushiListLayout.setVerticalGroup(
            sushiListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sushiListLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(sushiListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sushiListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sushiListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        extraList.setBackground(new java.awt.Color(153, 204, 0));
        extraList.setMinimumSize(new java.awt.Dimension(847, 617));
        extraList.setPreferredSize(new java.awt.Dimension(847, 617));

        jPanel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel25.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
        });

        r1c6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r1c6.setText("Ginger");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setText("001");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c6)
                .addGap(14, 14, 14))
        );

        jPanel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel26.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
        });

        r1c7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c7.setText("Seaweed salad ");

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel15.setText("002");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(r1c7)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(r1c7)
                .addGap(15, 15, 15))
        );

        jPanel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel27.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel27MouseClicked(evt);
            }
        });

        r1c8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r1c8.setText("Kimchi");

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel17.setText("003");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel17))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c8)
                .addGap(14, 14, 14))
        );

        jPanel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel28.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
        });

        r1c9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c9.setText("   Gochujang");

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel19.setText("004");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel19)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c9)
                .addGap(14, 14, 14))
        );

        jPanel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel29.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
        });

        r1c10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        r1c10.setText("Spicy Shrimp Salad");

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel21.setText("005");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(r1c10, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(46, 46, 46)
                .addComponent(r1c10)
                .addGap(16, 16, 16))
        );

        jPanel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel30.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel30MouseClicked(evt);
            }
        });

        r2c11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c11.setText("    Galangal");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setText("006");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel13)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c11)
                .addGap(14, 14, 14))
        );

        jPanel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel31.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });

        r2c12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c12.setText("Green Salad");

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel23.setText("007");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel23)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c12)
                .addGap(14, 14, 14))
        );

        jPanel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel32.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel32MouseClicked(evt);
            }
        });

        r2c13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c13.setText("Tuna Sandwich");

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel25.setText("008");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel25))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(r2c13)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c13)
                .addGap(14, 14, 14))
        );

        jPanel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel33.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel33MouseClicked(evt);
            }
        });

        r2c14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c14.setText("   Boiled egg");

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel27.setText("007");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel27)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(r2c14)
                .addGap(14, 14, 14))
        );

        jPanel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel34.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel34MouseClicked(evt);
            }
        });

        r2c15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c15.setText("      Lasagne");

        jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel29.setText("010");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel29)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c15)
                .addGap(14, 14, 14))
        );

        jPanel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel35.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel35MouseClicked(evt);
            }
        });

        r2c16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c16.setText("    Fried rice");

        jLabel31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel31.setText("015");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel31))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(r2c16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(r2c16)
                .addGap(15, 15, 15))
        );

        jPanel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel36.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel36MouseClicked(evt);
            }
        });

        r2c17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c17.setText("Mushroom Soup");

        jLabel33.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel33.setText("011");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel33)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r2c17)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(r2c17)
                .addGap(15, 15, 15))
        );

        jPanel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel37.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel37MouseClicked(evt);
            }
        });

        r2c18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c18.setText("   Meat Stew");

        jLabel35.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel35.setText("013");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel35))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(r2c18, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(r2c18)
                .addGap(16, 16, 16))
        );

        jPanel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel38.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel38MouseClicked(evt);
            }
        });

        r2c19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c19.setText("       Bacon");

        jLabel37.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel37.setText("012");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel37))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(r2c19)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(57, 57, 57)
                .addComponent(r2c19)
                .addGap(15, 15, 15))
        );

        jPanel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel39.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel39MouseClicked(evt);
            }
        });

        r2c20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c20.setText("Scrambled eggs");

        jLabel40.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel40.setText("014");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(r2c20)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(r2c20)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout extraListLayout = new javax.swing.GroupLayout(extraList);
        extraList.setLayout(extraListLayout);
        extraListLayout.setHorizontalGroup(
            extraListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extraListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(extraListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(extraListLayout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(extraListLayout.createSequentialGroup()
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(extraListLayout.createSequentialGroup()
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        extraListLayout.setVerticalGroup(
            extraListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, extraListLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(extraListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(extraListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(extraListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dessertList.setBackground(new java.awt.Color(255, 204, 0));
        dessertList.setMinimumSize(new java.awt.Dimension(847, 617));

        jPanel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel40.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
        });

        r1c11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c11.setText("Cheese Cake");

        jLabel41.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel41.setText("001");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r1c11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel41)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c11)
                .addGap(14, 14, 14))
        );

        jPanel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel41.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel41MouseClicked(evt);
            }
        });

        r1c12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c12.setText("   CupCake");

        jLabel42.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel42.setText("002");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel42)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r1c12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c12)
                .addGap(14, 14, 14))
        );

        jPanel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel42.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel42MouseClicked(evt);
            }
        });

        r1c13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c13.setText("Strawberry cake");

        jLabel43.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel43.setText("003");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel43))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(r1c13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c13)
                .addGap(14, 14, 14))
        );

        jPanel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel43.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel43MouseClicked(evt);
            }
        });

        r1c14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c14.setText("Chocolate Cake");

        jLabel44.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel44.setText("004");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel44))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(r1c14)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c14)
                .addGap(14, 14, 14))
        );

        jPanel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel44.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel44MouseClicked(evt);
            }
        });

        r1c15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c15.setText("Blueberry cake");

        jLabel45.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel45.setText("005");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel45))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(r1c15)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(r1c15)
                .addGap(15, 15, 15))
        );

        jPanel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel45.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel45MouseClicked(evt);
            }
        });

        r2c21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c21.setText("Milk Ice cream");

        jLabel46.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel46.setText("006");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel46)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r2c21)
                .addGap(12, 12, 12))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c21)
                .addGap(14, 14, 14))
        );

        jPanel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel46.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel46MouseClicked(evt);
            }
        });

        r2c22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c22.setText("Choc Ice Cream");

        jLabel47.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel47.setText("007");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(r2c22)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(r2c22)
                .addGap(18, 18, 18))
        );

        jPanel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel47.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel47MouseClicked(evt);
            }
        });

        r2c23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c23.setText("Mango Ice Cream");

        jLabel48.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel48.setText("008");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(r2c23))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(r2c23)
                .addGap(17, 17, 17))
        );

        jPanel48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel48.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel48MouseClicked(evt);
            }
        });

        r2c24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c24.setText("Grape Ice Cream");

        jLabel49.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel49.setText("007");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(r2c24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(r2c24)
                .addGap(16, 16, 16))
        );

        jPanel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel49.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel49MouseClicked(evt);
            }
        });

        r2c25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c25.setText("Vanilla Ice Cream");

        jLabel50.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel50.setText("010");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel50)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(r2c25)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(r2c25)
                .addGap(16, 16, 16))
        );

        jPanel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel50.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel50MouseClicked(evt);
            }
        });

        r2c26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c26.setText("Milk Bingsu");

        jLabel51.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel51.setText("015");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel51))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(r2c26)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(r2c26)
                .addGap(15, 15, 15))
        );

        jPanel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel51.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel51MouseClicked(evt);
            }
        });

        r2c27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c27.setText("Oreo Bingsu");

        jLabel52.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel52.setText("011");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel52)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r2c27, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c27)
                .addGap(14, 14, 14))
        );

        jPanel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel52.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel52MouseClicked(evt);
            }
        });

        r2c28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c28.setText("Mango Bingsu");

        jLabel53.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel53.setText("013");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel53))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(r2c28, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(r2c28)
                .addGap(16, 16, 16))
        );

        jPanel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel53.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel53MouseClicked(evt);
            }
        });

        r2c29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c29.setText("Milo Bingsu");

        jLabel54.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel54.setText("012");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel54))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(r2c29)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(55, 55, 55)
                .addComponent(r2c29)
                .addGap(17, 17, 17))
        );

        jPanel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel54.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel54MouseClicked(evt);
            }
        });

        r2c30.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c30.setText("Green Tea Bingsu");

        jLabel55.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel55.setText("014");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addComponent(r2c30)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c30)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout dessertListLayout = new javax.swing.GroupLayout(dessertList);
        dessertList.setLayout(dessertListLayout);
        dessertListLayout.setHorizontalGroup(
            dessertListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dessertListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dessertListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dessertListLayout.createSequentialGroup()
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dessertListLayout.createSequentialGroup()
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dessertListLayout.createSequentialGroup()
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        dessertListLayout.setVerticalGroup(
            dessertListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dessertListLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(dessertListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dessertListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dessertListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(702, Short.MAX_VALUE))
        );

        drinkList.setBackground(new java.awt.Color(0, 102, 102));
        drinkList.setMinimumSize(new java.awt.Dimension(847, 617));
        drinkList.setPreferredSize(new java.awt.Dimension(847, 617));

        jPanel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel55.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel55MouseClicked(evt);
            }
        });

        r1c16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c16.setText("   Milk Tea");

        jLabel56.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel56.setText("001");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r1c16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel56)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r1c16)
                .addGap(14, 14, 14))
        );

        jPanel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel56.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel56MouseClicked(evt);
            }
        });

        r1c17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        r1c17.setText("Strawberry Milk tea");

        jLabel57.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel57.setText("002");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel57))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(r1c17)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(r1c17)
                .addGap(16, 16, 16))
        );

        jPanel57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel57.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel57MouseClicked(evt);
            }
        });

        r1c18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c18.setText("  Thai Tea");

        jLabel58.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel58.setText("003");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel58))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(r1c18)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(r1c18)
                .addGap(15, 15, 15))
        );

        jPanel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel58.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel58MouseClicked(evt);
            }
        });

        r1c19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c19.setText(" Green Tea");

        jLabel59.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel59.setText("004");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel59)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r1c19, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(r1c19)
                .addGap(16, 16, 16))
        );

        jPanel59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel59.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel59MouseClicked(evt);
            }
        });

        r1c20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r1c20.setText("Bananas Tea");

        jLabel60.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel60.setText("005");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel60))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(r1c20, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(r1c20)
                .addGap(16, 16, 16))
        );

        jPanel60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel60.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel60MouseClicked(evt);
            }
        });

        r2c31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c31.setText("     Cocoa");

        jLabel61.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel61.setText("006");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c31, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel61)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c31)
                .addGap(14, 14, 14))
        );

        jPanel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel61.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel61MouseClicked(evt);
            }
        });

        r2c32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c32.setText("  Coca Cola");

        jLabel62.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel62.setText("007");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c32, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel62)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c32)
                .addGap(14, 14, 14))
        );

        jPanel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel62.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel62MouseClicked(evt);
            }
        });

        r2c33.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c33.setText("       Oishi");

        jLabel63.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel63.setText("008");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c33, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel63)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c33)
                .addGap(14, 14, 14))
        );

        jPanel63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel63.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel63MouseClicked(evt);
            }
        });

        r2c34.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c34.setText("Milk Green Tea");

        jLabel64.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel64.setText("007");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel64))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c34)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(r2c34)
                .addGap(14, 14, 14))
        );

        jPanel64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel64.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel64MouseClicked(evt);
            }
        });

        r2c35.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c35.setText("          Sprite");

        jLabel65.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel65.setText("010");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addComponent(r2c35, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c35)
                .addGap(14, 14, 14))
        );

        jPanel65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel65.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel65MouseClicked(evt);
            }
        });

        r2c36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c36.setText("Soju");

        jLabel66.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel66.setText("015");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c36)
                    .addComponent(jLabel66))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c36)
                .addGap(14, 14, 14))
        );

        jPanel66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel66.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel66MouseClicked(evt);
            }
        });

        r2c37.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c37.setText("  Fresh Water");

        jLabel67.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel67.setText("011");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c37, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel67)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c37)
                .addGap(14, 14, 14))
        );

        jPanel67.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel67.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel67MouseClicked(evt);
            }
        });

        r2c38.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c38.setText("Strawberry Juice");

        jLabel68.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel68.setText("013");

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel68)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addComponent(r2c38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c38)
                .addGap(14, 14, 14))
        );

        jPanel68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel68.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel68MouseClicked(evt);
            }
        });

        r2c39.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c39.setText(" Mango Juice");

        jLabel69.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel69.setText("012");

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel69))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(r2c39)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addGap(57, 57, 57)
                .addComponent(r2c39)
                .addGap(15, 15, 15))
        );

        jPanel69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel69.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel69MouseClicked(evt);
            }
        });

        r2c40.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        r2c40.setText("Orange Juice");

        jLabel70.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel70.setText("014");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(r2c40, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel70)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(r2c40)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout drinkListLayout = new javax.swing.GroupLayout(drinkList);
        drinkList.setLayout(drinkListLayout);
        drinkListLayout.setHorizontalGroup(
            drinkListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(drinkListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinkListLayout.createSequentialGroup()
                        .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkListLayout.createSequentialGroup()
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkListLayout.createSequentialGroup()
                        .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        drinkListLayout.setVerticalGroup(
            drinkListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drinkListLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(drinkListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(drinkListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(drinkListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuListPanelLayout = new javax.swing.GroupLayout(MenuListPanel);
        MenuListPanel.setLayout(MenuListPanelLayout);
        MenuListPanelLayout.setHorizontalGroup(
            MenuListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drinkList, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addGroup(MenuListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sushiList, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dessertList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(extraList, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE))
        );
        MenuListPanelLayout.setVerticalGroup(
            MenuListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuListPanelLayout.createSequentialGroup()
                .addComponent(drinkList, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sushiList, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dessertList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(extraList, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(StaffMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MenuListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(StaffMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sushiBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sushiBtnMouseClicked
        sushiLabel.setForeground(new java.awt.Color (43,52,103));
        extraLabel.setForeground(new java.awt.Color (255,255,255));
        dessertLabel.setForeground(new java.awt.Color (255,255,255));
        drinkLabel.setForeground(new java.awt.Color (255,255,255));
        
        sushiBtn.setBackground(new java.awt.Color (255,255,255));
        extraBtn.setBackground(new java.awt.Color (43,52,103));
        dessertBtn.setBackground(new java.awt.Color (43,52,103));
        drinkBtn.setBackground(new java.awt.Color (43,52,103));
        
        sushiList.setVisible(true);
        extraList.setVisible(false);
        dessertList.setVisible(false);
        drinkList.setVisible(false);
    }//GEN-LAST:event_sushiBtnMouseClicked

    private void extraBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraBtnMouseClicked
        sushiLabel.setForeground(new java.awt.Color (255,255,255));
        extraLabel.setForeground(new java.awt.Color (43,52,103));
        dessertLabel.setForeground(new java.awt.Color (255,255,255));
        drinkLabel.setForeground(new java.awt.Color (255,255,255));
        
        sushiBtn.setBackground(new java.awt.Color (43,52,103));
        extraBtn.setBackground(new java.awt.Color (255,255,255));
        dessertBtn.setBackground(new java.awt.Color (43,52,103));
        drinkBtn.setBackground(new java.awt.Color (43,52,103));
        
        sushiList.setVisible(false);
        extraList.setVisible(true);
        dessertList.setVisible(false);
        drinkList.setVisible(false);
    }//GEN-LAST:event_extraBtnMouseClicked

    private void dessertBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dessertBtnMouseClicked
        sushiLabel.setForeground(new java.awt.Color (255,255,255));
        extraLabel.setForeground(new java.awt.Color (255,255,255));
        dessertLabel.setForeground(new java.awt.Color (43,52,103));
        drinkLabel.setForeground(new java.awt.Color (255,255,255));
        
        sushiBtn.setBackground(new java.awt.Color (43,52,103));
        extraBtn.setBackground(new java.awt.Color (43,52,103));
        dessertBtn.setBackground(new java.awt.Color (255,255,255));
        drinkBtn.setBackground(new java.awt.Color (43,52,103));
        
        sushiList.setVisible(false);
        extraList.setVisible(false);
        dessertList.setVisible(true);
        drinkList.setVisible(false);
    }//GEN-LAST:event_dessertBtnMouseClicked

    private void drinkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinkBtnMouseClicked
        sushiLabel.setForeground(new java.awt.Color (255,255,255));
        extraLabel.setForeground(new java.awt.Color (255,255,255));
        dessertLabel.setForeground(new java.awt.Color (255,255,255));
        drinkLabel.setForeground(new java.awt.Color (43,52,103));
        
        sushiBtn.setBackground(new java.awt.Color (43,52,103));
        extraBtn.setBackground(new java.awt.Color (43,52,103));
        dessertBtn.setBackground(new java.awt.Color (43,52,103));
        drinkBtn.setBackground(new java.awt.Color (255,255,255));
        
        sushiList.setVisible(false);
        extraList.setVisible(false);
        dessertList.setVisible(false);
        drinkList.setVisible(true);
    }//GEN-LAST:event_drinkBtnMouseClicked

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        Login login = new Login();
                        login.setVisible(true);
                        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.setVisible(false);
    }//GEN-LAST:event_logoutbtnActionPerformed

 public boolean qtyIsZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Press Select Items");
            return false;
        }
        return true;
    }
    
int valu = 1;
String b;
Sushi ss = new Sushi();
Extra dr = new Extra();
Dessert ds = new Dessert();
Drink ex = new Drink();
public void loopsushi(int i){
    for(i=1; i>0; i=5){
        
    }
    
}
private int a = 0;
   
    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
    x++;
        
        String sushi = ss.orderSushi(0);
    double price = ss.getItemPrice(sushi);
    menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
     x++;
         String sushi = ss.orderSushi(1);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked

       x++;
         String sushi = ss.orderSushi(2);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked

       x++;
         String sushi = ss.orderSushi(3);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
       x++;
         String sushi = ss.orderSushi(4);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
       x++;
         String sushi = ss.orderSushi(5);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
       x++;
         String sushi = ss.orderSushi(8);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
           x++;
         String sushi = ss.orderSushi(7);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        x++;
         String sushi = ss.orderSushi(6);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
       x++;
         String sushi = ss.orderSushi(9);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
       x++;
         String sushi = ss.orderSushi(14);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
       x++;
         String sushi = ss.orderSushi(10);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t    $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
       x++;
         String sushi = ss.orderSushi(12);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
       x++;
         String sushi = ss.orderSushi(1);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
       x++;
         String sushi = ss.orderSushi(13);
    double price = ss.getItemPrice(sushi);
   menu.setText(menu.getText() +x+" x "+ss.getItemCount().get(sushi) + ": \t           " +sushi + "\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel23MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Cancel.setVisible(true);
        Order.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed

    }//GEN-LAST:event_OrderActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void orderidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderidActionPerformed

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        menu.setText("");
              qtyss++;
        totalvalues.setText("");
        qtyvalues.setText("");
        qtyss = 0;
        total = 0;
        x= 0;
    }//GEN-LAST:event_CancelMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Cancel.setVisible(true);
        Order.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void totalvaluesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalvaluesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalvaluesActionPerformed

    private void NotusingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotusingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotusingActionPerformed

    
    ConfirmOrder confirm = new ConfirmOrder();
Payment pay = new Payment();
    Menu menus = new Menu();
Pay p = new Pay();

    private void OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderMouseClicked
    String summary = ""; // Create a string to hold the summary information

    // Loop through the sushi items in the itemCount HashMap and append the summary information to the summary string
    double totalPrice = 0.0;
    for (String itemName : ss.getItemCount().keySet()) {
        int count = ss.getItemCount().get(itemName);
        double price = ss.getItemPrice(itemName);
        double itemTotalPrice = count * price;
        summary += "  " + count + "\t              " + itemName + "\t              $" + price + "\t\n";
        totalPrice += itemTotalPrice;
    }
        for (String itemName : dr.getItemCount().keySet()) {
        int count = dr.getItemCount().get(itemName);
        double price = dr.getItemPrice(itemName);
        double itemTotalPrice = count * price;
        summary += "  " + count + "\t              " + itemName + "\t              $" + price + "\t\n";
        totalPrice += itemTotalPrice;
    }
                        for (String itemName : ds.getItemCount().keySet()) {
        int count = ds.getItemCount().get(itemName);
        double price = ds.getItemPrice(itemName);
        double itemTotalPrice = count * price;
        summary += "  " + count + "\t              " + itemName + "\t              $" + price + "\t\n";
        totalPrice += itemTotalPrice;
    }
                         for (String itemName : ex.getItemCount().keySet()) {
        int count = ex.getItemCount().get(itemName);
        double price = ex.getItemPrice(itemName);
        double itemTotalPrice = count * price;
       summary += "  " + count + "\t              " + itemName + "\t              $" + price + "\t\n";
        totalPrice += itemTotalPrice;
        
        
        


        
    }
 //   summary += "Total price: $" + totalPrice;

    // Set the summary text in the Other class
    confirm.setVisible(true);
    confirm.sum.setText(summary);
    confirm.total.setText(String.valueOf(String.format("$%s", totalPrice)));
    confirm.qty.setText(String.valueOf(String.format("%s", qtyss)));
     
    String orderId = menus.generateOrderId();
    confirm.orderid.setText(orderId);
    

                        
    }//GEN-LAST:event_OrderMouseClicked

    public void update() {
    qtyss++;
   String summary = ""; // Create a string to hold the summary information
   String tt = "";

    // Loop through the sushi items in the itemCount HashMap and append the summary information to the summary string
    double totalPrice = 0.0;
    for (String itemName : ss.getItemCount().keySet()) {
        int count = ss.getItemCount().get(itemName);
        double price = ss.getItemPrice(itemName);
        double itemTotalPrice = count * price;
        summary += count + "\t " + itemName + "\t$" + price + "\t$" + itemTotalPrice + "\n";
        totalPrice += itemTotalPrice;
    }
        for (String itemName : dr.getItemCount().keySet()) {
        int count = dr.getItemCount().get(itemName);
        double price = dr.getItemPrice(itemName);
        double itemTotalPrice = count * price;
        summary += count + "\t " + itemName + "\t$" + price + "\t$" + itemTotalPrice + "\n";
        totalPrice += itemTotalPrice;
    }
                for (String itemName : ds.getItemCount().keySet()) {
        int count = ds.getItemCount().get(itemName);
        double price = ds.getItemPrice(itemName);
        double itemTotalPrice = count * price;
        summary += count + "\t " + itemName + "\t$" + price + "\t$" + itemTotalPrice + "\n";
        totalPrice += itemTotalPrice;
    }
                                for (String itemName : ex.getItemCount().keySet()) {
        int count = ex.getItemCount().get(itemName);
        double price = ex.getItemPrice(itemName);
        double itemTotalPrice = count * price;
        summary += count + "\t " + itemName + "\t$" + price + "\t$" + itemTotalPrice + "\n";
        totalPrice += itemTotalPrice;
    }
    summary += "Total price: $" + totalPrice;
    tt += totalPrice;

    // Set the summary text in the ConfirmOrder class
 
       totalvalues.setText(String.valueOf(String.format("$%s", totalPrice)));
      
        qtyvalues.setText(String.valueOf(String.format("%s", qtyss)));
    }
    
    
    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
               x++;
         String drink = dr.orderSushi(0);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t\t     $" + price + "\n");
    update();    

    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked
                      x++;
         String drink = dr.orderSushi(1);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel26MouseClicked

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseClicked
                              x++;
         String drink = dr.orderSushi(2);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel27MouseClicked

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
                                     x++;
         String drink = dr.orderSushi(3);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel28MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
                                      x++;
         String drink = dr.orderSushi(4);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel29MouseClicked

    private void jPanel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseClicked
                                     x++;
         String drink = dr.orderSushi(5);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel30MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
                                     x++;
         String drink = dr.orderSushi(8);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseClicked
                                      x++;
         String drink = dr.orderSushi(7);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel32MouseClicked

    private void jPanel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseClicked
                                      x++;
         String drink = dr.orderSushi(6);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel33MouseClicked

    private void jPanel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseClicked
                                     x++;
         String drink = dr.orderSushi(9);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel34MouseClicked

    private void jPanel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseClicked
                                      x++;
         String drink = dr.orderSushi(14);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel35MouseClicked

    private void jPanel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseClicked
                                              x++;
         String drink = dr.orderSushi(10);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel36MouseClicked

    private void jPanel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseClicked
                                              x++;
         String drink = dr.orderSushi(12);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel37MouseClicked

    private void jPanel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseClicked
                                              x++;
         String drink = dr.orderSushi(11);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel38MouseClicked

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseClicked
                                             x++;
         String drink = dr.orderSushi(13);
    double price = dr.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+dr.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel39MouseClicked

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
                                              x++;
         String drink = ds.orderSushi(0);
    double price = ds.getItemPrice(drink);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(drink) + ": \t           " +drink + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseClicked
                                                      x++;
         String dessert = ds.orderSushi(1);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel41MouseClicked

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseClicked
                                                              x++;
         String dessert = ds.orderSushi(2);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel42MouseClicked

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseClicked
                                                              x++;
         String dessert = ds.orderSushi(3);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel43MouseClicked

    private void jPanel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseClicked
                                                              x++;
         String dessert = ds.orderSushi(4);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel44MouseClicked

    private void jPanel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel45MouseClicked
                                                              x++;
         String dessert = ds.orderSushi(5);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel45MouseClicked

    private void jPanel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseClicked
                                                              x++;
         String dessert = ds.orderSushi(8);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel46MouseClicked

    private void jPanel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MouseClicked
                                                                      x++;
         String dessert = ds.orderSushi(7);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel47MouseClicked

    private void jPanel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseClicked
                                                                     x++;
         String dessert = ds.orderSushi(6);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel48MouseClicked

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked
                                                                      x++;
         String dessert = ds.orderSushi(9);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel49MouseClicked

    private void jPanel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseClicked
                                                                      x++;
         String dessert = ds.orderSushi(14);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel50MouseClicked

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseClicked
                                                                      x++;
         String dessert = ds.orderSushi(10);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel51MouseClicked

    private void jPanel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel52MouseClicked
                                                                     x++;
         String dessert = ds.orderSushi(12);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel52MouseClicked

    private void jPanel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseClicked
                                                                     x++;
         String dessert = ds.orderSushi(11);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel53MouseClicked

    private void jPanel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel54MouseClicked
                                                                     x++;
         String dessert = ds.orderSushi(13);
    double price = ds.getItemPrice(dessert);
   menu.setText(menu.getText() +x+" x "+ds.getItemCount().get(dessert) + ": \t           " +dessert + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel54MouseClicked

    private void jPanel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel55MouseClicked
                                                                     x++;
         String extra = ex.orderSushi(0);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel55MouseClicked

    private void jPanel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel56MouseClicked
                                                                            x++;
         String extra = ex.orderSushi(1);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel56MouseClicked

    private void jPanel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel57MouseClicked
                                                                             x++;
         String extra = ex.orderSushi(2);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel57MouseClicked

    private void jPanel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel58MouseClicked
                                                                             x++;
         String extra = ex.orderSushi(3);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel58MouseClicked

    private void jPanel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel59MouseClicked
                                                                             x++;
         String extra = ex.orderSushi(4);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel59MouseClicked

    private void jPanel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseClicked
                                                                            x++;
         String extra = ex.orderSushi(5);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel60MouseClicked

    private void jPanel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel61MouseClicked
                                                                            x++;
         String extra = ex.orderSushi(8);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel61MouseClicked

    private void jPanel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel62MouseClicked
                                                                             x++;
         String extra = ex.orderSushi(7);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel62MouseClicked

    private void jPanel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel63MouseClicked
                                                                          x++;
         String extra = ex.orderSushi(6);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel63MouseClicked

    private void jPanel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel64MouseClicked
                                                                            x++;
         String extra = ex.orderSushi(9);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel64MouseClicked

    private void jPanel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel65MouseClicked
                                                                          x++;
         String extra = ex.orderSushi(14);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel65MouseClicked

    private void jPanel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel66MouseClicked
                                                                            x++;
         String extra = ex.orderSushi(10);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel66MouseClicked

    private void jPanel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel67MouseClicked
                                                                            x++;
         String extra = ex.orderSushi(12);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel67MouseClicked

    private void jPanel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel68MouseClicked
                                                                             x++;
         String extra = ex.orderSushi(11);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel68MouseClicked

    private void jPanel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel69MouseClicked
                                                                            x++;
         String extra = ex.orderSushi(13);
    double price = ex.getItemPrice(extra);
   menu.setText(menu.getText() +x+" x "+ex.getItemCount().get(extra) + ": \t           " +extra + "\t     $" + price + "\n");
    update();    
    }//GEN-LAST:event_jPanel69MouseClicked

    private void qtyvaluesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyvaluesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyvaluesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                String id = "";
                String name = "";
                StaffMenu staffMenu = new StaffMenu(id, name);
                staffMenu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddOrderBtn;
    private javax.swing.JTextField Cancel;
    private javax.swing.JPanel CheckQueueBtn;
    private javax.swing.JPanel HistoryBtn;
    private javax.swing.JPanel HomeBtn;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JPanel MenuListPanel;
    private javax.swing.JLabel NAMELabel;
    private javax.swing.JTextField Notusing;
    private javax.swing.JTextField Order;
    private javax.swing.JPanel StaffMainMenu;
    private javax.swing.JPanel dessertBtn;
    private javax.swing.JLabel dessertLabel;
    private javax.swing.JPanel dessertList;
    private javax.swing.JPanel drinkBtn;
    private javax.swing.JLabel drinkLabel;
    private javax.swing.JPanel drinkList;
    private javax.swing.JPanel extraBtn;
    private javax.swing.JLabel extraLabel;
    private javax.swing.JPanel extraList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTextArea menu;
    public javax.swing.JTextField orderid;
    private javax.swing.JTextField qtyvalues;
    private javax.swing.JLabel r1c1;
    private javax.swing.JLabel r1c10;
    private javax.swing.JLabel r1c11;
    private javax.swing.JLabel r1c12;
    private javax.swing.JLabel r1c13;
    private javax.swing.JLabel r1c14;
    private javax.swing.JLabel r1c15;
    private javax.swing.JLabel r1c16;
    private javax.swing.JLabel r1c17;
    private javax.swing.JLabel r1c18;
    private javax.swing.JLabel r1c19;
    private javax.swing.JLabel r1c2;
    private javax.swing.JLabel r1c20;
    private javax.swing.JLabel r1c3;
    private javax.swing.JLabel r1c4;
    private javax.swing.JLabel r1c5;
    private javax.swing.JLabel r1c6;
    private javax.swing.JLabel r1c7;
    private javax.swing.JLabel r1c8;
    private javax.swing.JLabel r1c9;
    private javax.swing.JLabel r2c1;
    private javax.swing.JLabel r2c10;
    private javax.swing.JLabel r2c11;
    private javax.swing.JLabel r2c12;
    private javax.swing.JLabel r2c13;
    private javax.swing.JLabel r2c14;
    private javax.swing.JLabel r2c15;
    private javax.swing.JLabel r2c16;
    private javax.swing.JLabel r2c17;
    private javax.swing.JLabel r2c18;
    private javax.swing.JLabel r2c19;
    private javax.swing.JLabel r2c2;
    private javax.swing.JLabel r2c20;
    private javax.swing.JLabel r2c21;
    private javax.swing.JLabel r2c22;
    private javax.swing.JLabel r2c23;
    private javax.swing.JLabel r2c24;
    private javax.swing.JLabel r2c25;
    private javax.swing.JLabel r2c26;
    private javax.swing.JLabel r2c27;
    private javax.swing.JLabel r2c28;
    private javax.swing.JLabel r2c29;
    private javax.swing.JLabel r2c3;
    private javax.swing.JLabel r2c30;
    private javax.swing.JLabel r2c31;
    private javax.swing.JLabel r2c32;
    private javax.swing.JLabel r2c33;
    private javax.swing.JLabel r2c34;
    private javax.swing.JLabel r2c35;
    private javax.swing.JLabel r2c36;
    private javax.swing.JLabel r2c37;
    private javax.swing.JLabel r2c38;
    private javax.swing.JLabel r2c39;
    private javax.swing.JLabel r2c4;
    private javax.swing.JLabel r2c40;
    private javax.swing.JLabel r2c5;
    private javax.swing.JLabel r2c6;
    private javax.swing.JLabel r2c7;
    private javax.swing.JLabel r2c8;
    private javax.swing.JLabel r2c9;
    private javax.swing.JPanel sushiBtn;
    private javax.swing.JLabel sushiLabel;
    private javax.swing.JPanel sushiList;
    private javax.swing.JTextField totalvalues;
    // End of variables declaration//GEN-END:variables
}
