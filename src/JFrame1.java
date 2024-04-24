
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JFrame1 extends javax.swing.JFrame {

    public JFrame1() {
        initComponents();
        flights.setEnabled(false);
        if(onewayCB.isSelected()){
                returnTF.disable();
        }else returnTF.enable();
    }
    public JFrame1(String u) {
        initComponents();
        if(onewayCB.isSelected()){
                returnTF.disable();
        }else returnTF.enable();
        loggedinas.setText("You are logged in as:");
        onomaxrhsth.setText(u);
        loginB.setEnabled(false);
        flights.setEnabled(true);
    }
    
    public JFrame1(String city1, String city2){
        initComponents();
        if(onewayCB.isSelected()){
                returnTF.disable();
        }else returnTF.enable();
        fromTF.setText(city1);
        toTF.setText(city2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AristeroPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loginB = new javax.swing.JButton();
        loggedinas = new javax.swing.JLabel();
        onomaxrhsth = new javax.swing.JLabel();
        flights = new javax.swing.JButton();
        onewayCB = new javax.swing.JCheckBox();
        returnCB = new javax.swing.JCheckBox();
        departTF = new javax.swing.JTextField();
        returnTF = new javax.swing.JTextField();
        searchB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fromTF = new javax.swing.JTextField();
        toTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exchangeB = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        passengersCMB = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        au = new javax.swing.JMenu();
        cu = new javax.swing.JMenu();
        pmad = new javax.swing.JMenu();
        ep1 = new javax.swing.JMenuItem();
        ep2 = new javax.swing.JMenuItem();
        ep3 = new javax.swing.JMenuItem();
        ep4 = new javax.swing.JMenuItem();
        ep5 = new javax.swing.JMenuItem();
        ep6 = new javax.swing.JMenuItem();
        ep7 = new javax.swing.JMenuItem();
        ep8 = new javax.swing.JMenuItem();
        ep9 = new javax.swing.JMenuItem();
        ep10 = new javax.swing.JMenuItem();
        ep11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to SapAir!");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AristeroPanel.setBackground(new java.awt.Color(137, 132, 162));
        AristeroPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        AristeroPanel.setPreferredSize(new java.awt.Dimension(1360, 105));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image 1.png"))); // NOI18N

        loginB.setBackground(new java.awt.Color(137, 132, 162));
        loginB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        loginB.setForeground(new java.awt.Color(255, 255, 255));
        loginB.setText("Log In");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });

        loggedinas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loggedinas.setForeground(new java.awt.Color(255, 255, 255));
        loggedinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        onomaxrhsth.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        onomaxrhsth.setForeground(new java.awt.Color(255, 255, 255));

        flights.setBackground(new java.awt.Color(137, 132, 162));
        flights.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        flights.setForeground(new java.awt.Color(255, 255, 255));
        flights.setText("Show my Flights");
        flights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AristeroPanelLayout = new javax.swing.GroupLayout(AristeroPanel);
        AristeroPanel.setLayout(AristeroPanelLayout);
        AristeroPanelLayout.setHorizontalGroup(
            AristeroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AristeroPanelLayout.createSequentialGroup()
                .addGroup(AristeroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AristeroPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AristeroPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(loginB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AristeroPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(AristeroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loggedinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onomaxrhsth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AristeroPanelLayout.setVerticalGroup(
            AristeroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AristeroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(170, 170, 170)
                .addComponent(loginB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loggedinas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onomaxrhsth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flights)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        getContentPane().add(AristeroPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 860));

        onewayCB.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        onewayCB.setForeground(new java.awt.Color(255, 255, 255));
        onewayCB.setSelected(true);
        onewayCB.setText("One Way");
        onewayCB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        onewayCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onewayCBActionPerformed(evt);
            }
        });
        getContentPane().add(onewayCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 130, 20));

        returnCB.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        returnCB.setForeground(new java.awt.Color(255, 255, 255));
        returnCB.setText("Return Trip");
        returnCB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        returnCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnCBActionPerformed(evt);
            }
        });
        getContentPane().add(returnCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 140, 20));

        departTF.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        departTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        departTF.setText("--/--/20--");
        departTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departTFActionPerformed(evt);
            }
        });
        getContentPane().add(departTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 190, -1));

        returnTF.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        returnTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        returnTF.setText("--/--/20--");
        returnTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnTFActionPerformed(evt);
            }
        });
        getContentPane().add(returnTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 190, -1));

        searchB.setBackground(new java.awt.Color(137, 132, 162));
        searchB.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        searchB.setForeground(new java.awt.Color(255, 255, 255));
        searchB.setText("Search");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });
        getContentPane().add(searchB, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, -1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Depart:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Return:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, -1, -1));

        fromTF.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        fromTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTFActionPerformed(evt);
            }
        });
        getContentPane().add(fromTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 190, 40));

        toTF.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        toTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toTFActionPerformed(evt);
            }
        });
        getContentPane().add(toTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 190, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("From:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("To:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, -1, -1));

        exchangeB.setBackground(new java.awt.Color(137, 132, 162));
        exchangeB.setForeground(new java.awt.Color(255, 255, 255));
        exchangeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image 4.png"))); // NOI18N
        exchangeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangeBActionPerformed(evt);
            }
        });
        getContentPane().add(exchangeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 60, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Passengers:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        passengersCMB.setBackground(new java.awt.Color(153, 102, 255));
        passengersCMB.setForeground(new java.awt.Color(0, 0, 0));
        passengersCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        passengersCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersCMBActionPerformed(evt);
            }
        });
        getContentPane().add(passengersCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sapmikros.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1000, 860));

        jMenuBar1.setBackground(new java.awt.Color(137, 132, 162));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        au.setBackground(new java.awt.Color(0, 0, 0));
        au.setForeground(new java.awt.Color(137, 132, 162));
        au.setText("About Us");
        au.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        au.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                auMouseClicked(evt);
            }
        });
        au.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auActionPerformed(evt);
            }
        });
        jMenuBar1.add(au);

        cu.setForeground(new java.awt.Color(137, 132, 162));
        cu.setText("Contact Us");
        cu.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuMouseClicked(evt);
            }
        });
        cu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuActionPerformed(evt);
            }
        });
        jMenuBar1.add(cu);

        pmad.setBackground(new java.awt.Color(0, 0, 0));
        pmad.setForeground(new java.awt.Color(137, 132, 162));
        pmad.setText("Pick me a Destination!");
        pmad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pmad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pmadMouseClicked(evt);
            }
        });
        pmad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmadActionPerformed(evt);
            }
        });

        ep1.setText("Thessaloniki");
        ep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep1ActionPerformed(evt);
            }
        });
        pmad.add(ep1);

        ep2.setText("Athens");
        ep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep2ActionPerformed(evt);
            }
        });
        pmad.add(ep2);

        ep3.setText("London");
        ep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep3ActionPerformed(evt);
            }
        });
        pmad.add(ep3);

        ep4.setText("Barcelona");
        ep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep4ActionPerformed(evt);
            }
        });
        pmad.add(ep4);

        ep5.setText("Berlin");
        ep5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep5ActionPerformed(evt);
            }
        });
        pmad.add(ep5);

        ep6.setText("Paris");
        ep6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep6ActionPerformed(evt);
            }
        });
        pmad.add(ep6);

        ep7.setText("Rome");
        ep7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep7ActionPerformed(evt);
            }
        });
        pmad.add(ep7);

        ep8.setText("Istanbul");
        ep8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep8ActionPerformed(evt);
            }
        });
        pmad.add(ep8);

        ep9.setText("New York");
        ep9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep9ActionPerformed(evt);
            }
        });
        pmad.add(ep9);

        ep10.setText("Tokyo");
        ep10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep10ActionPerformed(evt);
            }
        });
        pmad.add(ep10);

        ep11.setText("Rio de Janeiro");
        ep11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep11ActionPerformed(evt);
            }
        });
        pmad.add(ep11);

        jMenuBar1.add(pmad);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onewayCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onewayCBActionPerformed
            returnCB.setSelected(false);
            if(onewayCB.isSelected()){
                returnTF.disable();
        }
    }//GEN-LAST:event_onewayCBActionPerformed

    private void returnCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnCBActionPerformed
            onewayCB.setSelected(false);
            returnTF.enable();
        
    }//GEN-LAST:event_returnCBActionPerformed

    private void departTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departTFActionPerformed

    private void returnTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnTFActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        boolean typeoftrip=returnCB.isSelected();
        if(typeoftrip==false){
             String date1=departTF.getText();
             String from=fromTF.getText();
             String to=toTF.getText();
             int numP=passengersCMB.getSelectedIndex();
            try {
                new eishthria(from,to,date1,numP).setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(JFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
             String date1=departTF.getText();
             String date2=returnTF.getText();
             String from=fromTF.getText();
             String to=toTF.getText();
             int numP=passengersCMB.getSelectedIndex();
            try {
                new eishthria(from,to,date1,date2,numP).setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(JFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_searchBActionPerformed

    private void toTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toTFActionPerformed

    private void fromTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTFActionPerformed
        if(fromTF.getText().equalsIgnoreCase("Thessaloniki")){
              
        }
    }//GEN-LAST:event_fromTFActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
        dispose();    
        new login().setVisible(true);        
    }//GEN-LAST:event_loginBActionPerformed

    private void exchangeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangeBActionPerformed
        String met1=fromTF.getText();
        fromTF.setText(toTF.getText());
        toTF.setText(met1);
    }//GEN-LAST:event_exchangeBActionPerformed

    private void auActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auActionPerformed
        
    }//GEN-LAST:event_auActionPerformed

    private void auMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auMouseClicked
        new parathiroABOUTUS().setVisible(true);    }//GEN-LAST:event_auMouseClicked

    private void pmadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmadActionPerformed

    }//GEN-LAST:event_pmadActionPerformed

    private void pmadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmadMouseClicked
        
    }//GEN-LAST:event_pmadMouseClicked

    private void passengersCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengersCMBActionPerformed

    private void ep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep1ActionPerformed
        new rndDest(ep1.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep1ActionPerformed

    private void ep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep2ActionPerformed
        new rndDest(ep2.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep2ActionPerformed

    private void ep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep4ActionPerformed
        new rndDest(ep4.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep4ActionPerformed

    private void ep6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep6ActionPerformed
        new rndDest(ep6.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep6ActionPerformed

    private void ep8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep8ActionPerformed
        new rndDest(ep8.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep8ActionPerformed

    private void ep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep3ActionPerformed
        new rndDest(ep3.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep3ActionPerformed

    private void ep5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep5ActionPerformed
        new rndDest(ep5.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep5ActionPerformed

    private void ep7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep7ActionPerformed
        new rndDest(ep7.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep7ActionPerformed

    private void ep9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep9ActionPerformed
        new rndDest(ep9.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep9ActionPerformed

    private void ep10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep10ActionPerformed
        new rndDest(ep10.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep10ActionPerformed

    private void ep11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep11ActionPerformed
        new rndDest(ep11.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_ep11ActionPerformed

    private void flightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsActionPerformed
        try {
            new myFlights(onomaxrhsth.getText()).setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(JFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_flightsActionPerformed

    private void cuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuActionPerformed

    private void cuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuMouseClicked
        new contactJFRAME().setVisible(true);
    }//GEN-LAST:event_cuMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrame1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AristeroPanel;
    private javax.swing.JMenu au;
    private javax.swing.JLabel background;
    private javax.swing.JMenu cu;
    private javax.swing.JTextField departTF;
    private javax.swing.JMenuItem ep1;
    private javax.swing.JMenuItem ep10;
    private javax.swing.JMenuItem ep11;
    private javax.swing.JMenuItem ep2;
    private javax.swing.JMenuItem ep3;
    private javax.swing.JMenuItem ep4;
    private javax.swing.JMenuItem ep5;
    private javax.swing.JMenuItem ep6;
    private javax.swing.JMenuItem ep7;
    private javax.swing.JMenuItem ep8;
    private javax.swing.JMenuItem ep9;
    private javax.swing.JButton exchangeB;
    private javax.swing.JButton flights;
    private javax.swing.JTextField fromTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JLabel loggedinas;
    private javax.swing.JButton loginB;
    private javax.swing.JLabel logo;
    private javax.swing.JCheckBox onewayCB;
    public javax.swing.JLabel onomaxrhsth;
    private javax.swing.JComboBox<String> passengersCMB;
    private javax.swing.JMenu pmad;
    private javax.swing.JCheckBox returnCB;
    private javax.swing.JTextField returnTF;
    private javax.swing.JButton searchB;
    private javax.swing.JTextField toTF;
    // End of variables declaration//GEN-END:variables
}
