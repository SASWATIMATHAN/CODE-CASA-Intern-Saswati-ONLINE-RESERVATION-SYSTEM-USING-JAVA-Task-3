package ticketbooking;

import javax.swing.JComponent;

public class BusTicketing extends javax.swing.JFrame {

    public BusTicketing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldForm = new javax.swing.JTextField();
        jTextFieldTo = new javax.swing.JTextField();
        jTextFieldDate2 = new javax.swing.JTextField();
        jTextFieldTime2 = new javax.swing.JTextField();
        jTextFieldClass = new javax.swing.JTextField();
        jTextFieldTicketType = new javax.swing.JTextField();
        jTextFieldPassengers2 = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxDestination = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonSingle1 = new javax.swing.JRadioButton();
        jRadioButtonEconomy1 = new javax.swing.JRadioButton();
        jRadioButtonReturn1 = new javax.swing.JRadioButton();
        jRadioButtonFirstClass1 = new javax.swing.JRadioButton();
        jTextFieldPassenger1 = new javax.swing.JTextField();
        jComboBoxTime = new javax.swing.JComboBox<>();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jButtonTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setMinimumSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(51, 255, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ravie", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("  BookMy Bus");

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\pinak\\Desktop\\LOGO.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setText("From");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setText("To");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel10.setText("Class");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel11.setText("Departure");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel12.setText("Date of Journey");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel13.setText("Amount Paid");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel14.setText("No. of Passengers ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel15.setText("Ticket Type");

        jTextFieldForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormActionPerformed(evt);
            }
        });

        jTextFieldTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldToActionPerformed(evt);
            }
        });

        jTextFieldDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDate2ActionPerformed(evt);
            }
        });

        jTextFieldTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTime2ActionPerformed(evt);
            }
        });

        jTextFieldClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassActionPerformed(evt);
            }
        });

        jTextFieldTicketType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTicketTypeActionPerformed(evt);
            }
        });

        jTextFieldPassengers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassengers2ActionPerformed(evt);
            }
        });

        jTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(102, 0, 51));
        jButtonReset.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReset.setText("Reset");
        jButtonReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 102), new java.awt.Color(204, 204, 204), null, null));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(204, 0, 51));
        jButtonExit.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 204, 204), null, null));
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonExitMouseExited(evt);
            }
        });
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldForm, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPassengers2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jTextFieldClass, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jTextFieldTicketType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jTextFieldTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(72, 72, 72)
                        .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTicketType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassengers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExit)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Hyderabad", "New Delhi", "Pune", "Bhubaneshwar", "Bangalore", "Gujarat", "Kolkata", "Mumbai", "Howrah", "Chennai", " " }));
        jComboBoxDestination.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDestinationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Date of Journey");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Ticket Type ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Departure Time");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("No. of Passengers ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Class");

        jRadioButtonSingle1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonSingle1.setText("Single");
        jRadioButtonSingle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSingle1ActionPerformed(evt);
            }
        });

        jRadioButtonEconomy1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonEconomy1.setText("Economy");
        jRadioButtonEconomy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEconomy1ActionPerformed(evt);
            }
        });

        jRadioButtonReturn1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonReturn1.setText("Return");
        jRadioButtonReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonReturn1ActionPerformed(evt);
            }
        });

        jRadioButtonFirstClass1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonFirstClass1.setText("First Class");
        jRadioButtonFirstClass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFirstClass1ActionPerformed(evt);
            }
        });

        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "11:30", "12:30", "1:30", "2:30" }));
        jComboBoxTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Destination ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPassenger1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxDestination, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonFirstClass1)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonSingle1)
                                        .addGap(50, 50, 50)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonReturn1)
                                    .addComponent(jRadioButtonEconomy1)))
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonReturn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButtonSingle1)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonFirstClass1)
                        .addComponent(jRadioButtonEconomy1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassenger1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("Total");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Sub Total ");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("GST");

        jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxActionPerformed(evt);
            }
        });

        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jTextFieldSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jButtonTotal.setBackground(new java.awt.Color(0, 102, 102));
        jButtonTotal.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonTotal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTotal.setText("Submit");
        jButtonTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jButtonTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonFirstClass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFirstClass1ActionPerformed
                if(jRadioButtonFirstClass1.isSelected()){
        jRadioButtonEconomy1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonFirstClass1ActionPerformed

    private void jRadioButtonEconomy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEconomy1ActionPerformed
        
         if(jRadioButtonEconomy1.isSelected()){
        jRadioButtonFirstClass1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonEconomy1ActionPerformed

    private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxActionPerformed
        
    }//GEN-LAST:event_jTextFieldTaxActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTextFieldSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubTotalActionPerformed
        
    }//GEN-LAST:event_jTextFieldSubTotalActionPerformed

    private void jTextFieldFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormActionPerformed
        
    }//GEN-LAST:event_jTextFieldFormActionPerformed

    private void jTextFieldToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldToActionPerformed
        
    }//GEN-LAST:event_jTextFieldToActionPerformed

    private void jTextFieldDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDate2ActionPerformed
        
    }//GEN-LAST:event_jTextFieldDate2ActionPerformed

    private void jTextFieldTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTime2ActionPerformed
        
    }//GEN-LAST:event_jTextFieldTime2ActionPerformed

    private void jTextFieldClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassActionPerformed
        
    }//GEN-LAST:event_jTextFieldClassActionPerformed

    private void jTextFieldTicketTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTicketTypeActionPerformed
        
    }//GEN-LAST:event_jTextFieldTicketTypeActionPerformed

    private void jTextFieldPassengers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassengers2ActionPerformed
        
    }//GEN-LAST:event_jTextFieldPassengers2ActionPerformed

    private void jTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceActionPerformed
        
    }//GEN-LAST:event_jTextFieldPriceActionPerformed
  
    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        
        int fare=200;
        int Tax = 18;
        int miles = 0;
        int Tfare =0;
        int Dtax=0;
        int SubTotal = 0;
      
       if(jComboBoxDestination.getSelectedItem().equals("Pune") && jRadioButtonFirstClass1.isSelected()&& 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
    
        int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Pune");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
           miles = 6;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
         
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Pune") && jRadioButtonEconomy1.isSelected()&& 
                jRadioButtonSingle1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Pune");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
      
           miles = 6;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Pune") && jRadioButtonFirstClass1.isSelected()&& 
               jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null)) ){
           int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Pune");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
          miles = 6;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Pune") && jRadioButtonEconomy1.isSelected()&& 
                jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Pune");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
           miles = 6;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else if(jComboBoxTime.getSelectedItem().equals("Select Time")){
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Gujarat")&& jRadioButtonEconomy1.isSelected()&& 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
     int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
      jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Gujarat");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");       
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
              miles = 4;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Gujarat") && jRadioButtonFirstClass1.isSelected() && 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
           int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Gujarat");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
                  miles = 4;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else{
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Gujarat")&& jRadioButtonEconomy1.isSelected()&& 
               jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Gujarat");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
       miles = 4;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
           if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Gujrath") && jRadioButtonFirstClass1.isSelected() && 
               jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Gujarat");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
      
           miles = 4;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Bhubaneshwar") && jRadioButtonEconomy1.isSelected() 
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bhubaneshwar");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
       miles = 5;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
           else if(jComboBoxDestination.getSelectedItem().equals("Bhubaneshwar") && jRadioButtonFirstClass1.isSelected()
                   && jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bhubaneshwar");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
           miles = 5;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
       if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Chennai") && jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Chennai");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
      
       miles = 5;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
   if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
           else if(jComboBoxDestination.getSelectedItem().equals("Kolkata") && jRadioButtonFirstClass1.isSelected()
                   && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kolkata");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
      
           miles = 5;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Bangalore")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
   
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bangalore");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
       miles = 7;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Bangalore") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bangalore");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
           miles = 7;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*(Pass);
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Bangalore")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bangalore");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
       miles = 7;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Bangalore") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bangalore");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
      
           miles = 7;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*(Pass);
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Hyderabad")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Hyderabad");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
      
        miles = 9;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Hyderabad") && jRadioButtonFirstClass1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Hyderabad");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
      
           miles = 9;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Hyderabad")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Hyderabad");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
       
        miles = 9;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
           if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
         
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Hyderabad") && jRadioButtonFirstClass1.isSelected()
               && jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){           
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Hyderabad");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("New Delhi");
     
        miles = 9;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
      jTextFieldTicketType.setText("Round Trip");
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }  
       }
       else if((!jRadioButtonSingle1.isSelected() && !jRadioButtonReturn1.isSelected()) ||
               (!jRadioButtonFirstClass1.isSelected()&& !jRadioButtonEconomy1.isSelected()) ||
               jComboBoxDestination.getSelectedItem().equals("Select Destination")|| jTextFieldPassenger1.getText()== "" ){
       jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);       
       }       
      
      
       else{
           jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
       }
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jComboBoxDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDestinationActionPerformed
        
    }//GEN-LAST:event_jComboBoxDestinationActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseExited
        
    }//GEN-LAST:event_jButtonExitMouseExited

    private void jButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMouseClicked

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        
      jDateChooser.setCalendar(null);
      jComboBoxTime.setSelectedIndex(0);
      jComboBoxDestination.setSelectedIndex(0);
      jTextFieldSubTotal.setText(null);
      jTextFieldPassenger1.setText(null);
      jTextFieldTotal.setText(null);
      jTextFieldTax.setText(null);
      jTextFieldTotal.setText(null);
     jTextFieldForm.setText(null);
     jTextFieldTo.setText(null);
      jTextFieldDate2.setText(null);
     jTextFieldTime2.setText(null);
     jTextFieldDate2.setText(null);
     jTextFieldTicketType.setText(null);
      jTextFieldClass.setText(null);
     jTextFieldPassengers2.setText(null);
        jTextFieldPrice.setText(null);
        jRadioButtonReturn1.setSelected(false);
        jRadioButtonSingle1.setSelected(false);
        jRadioButtonFirstClass1.setSelected(false);
        jRadioButtonEconomy1.setSelected(false);
        
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jRadioButtonSingle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSingle1ActionPerformed
        
        if(jRadioButtonSingle1.isSelected()){       
        jRadioButtonReturn1.setSelected(false);}
    }//GEN-LAST:event_jRadioButtonSingle1ActionPerformed

    private void jRadioButtonReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReturn1ActionPerformed
              if(jRadioButtonReturn1.isSelected()){
        jRadioButtonSingle1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonReturn1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusTicketing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JComboBox<String> jComboBoxDestination;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private com.toedter.calendar.JDateChooser jDateChooser;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonEconomy1;
    private javax.swing.JRadioButton jRadioButtonFirstClass1;
    private javax.swing.JRadioButton jRadioButtonReturn1;
    private javax.swing.JRadioButton jRadioButtonSingle1;
    private javax.swing.JTextField jTextFieldClass;
    private javax.swing.JTextField jTextFieldDate2;
    private javax.swing.JTextField jTextFieldForm;
    private javax.swing.JTextField jTextFieldPassenger1;
    private javax.swing.JTextField jTextFieldPassengers2;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTicketType;
    private javax.swing.JTextField jTextFieldTime2;
    private javax.swing.JTextField jTextFieldTo;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
