public class UserEdit extends javax.swing.JPanel {
    public int member_id;
    public int contact_id;
    
    public UserEdit() {
        initComponents();
        
        user_invalid.setVisible(false);
        user_contact_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                String text = user_contact_input.getText();
                char c = e.getKeyChar();

                if ((text != null && text.length() >= 10) || (text != null && !Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
       
        user_contact_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                String text = user_contact_input.getText();
                char c = e.getKeyChar();

                if ((text != null && text.length() >= 10) || (text != null && !Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE && !text.isEmpty())) {
                    e.consume();
                }
            }
        });

        user_workout_input.setUI(new javax.swing.plaf.basic.BasicComboBoxUI() {
            @Override
            public void installUI(javax.swing.JComponent comboBox) {
                super.installUI(comboBox);
                javax.swing.LookAndFeel.installProperty(comboBox, "opaque", Boolean.FALSE);
            }
        });
        
        user_workout_input.setRenderer(new javax.swing.DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(javax.swing.JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
                setOpaque(true);
                setBackground(java.awt.Color.WHITE); 
                return this;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_invalid = new javax.swing.JLabel();
        user_firstname_title = new javax.swing.JLabel();
        user_firstname_input = new javax.swing.JTextField();
        user_firstname_bg = new javax.swing.JLabel();
        user_lastname_title = new javax.swing.JLabel();
        user_lastname_input = new javax.swing.JTextField();
        user_lastname_bg = new javax.swing.JLabel();
        user_contact_title = new javax.swing.JLabel();
        user_contact_input2 = new javax.swing.JLabel();
        user_contact_input = new javax.swing.JFormattedTextField();
        user_contact_bg = new javax.swing.JLabel();
        user_email_title = new javax.swing.JLabel();
        user_email_input = new javax.swing.JTextField();
        user_email_bg = new javax.swing.JLabel();
        user_workout_title = new javax.swing.JLabel();
        user_workout_input = new javax.swing.JComboBox<>();
        user_workout_bg = new javax.swing.JLabel();
        user_save = new javax.swing.JButton();
        user_delete = new javax.swing.JButton();
        user_lastname = new javax.swing.JLabel();
        user_firstname = new javax.swing.JLabel();
        user_contact = new javax.swing.JLabel();
        user_email = new javax.swing.JLabel();
        user_workout = new javax.swing.JLabel();
        user_sched = new javax.swing.JLabel();
        user_routineP = new javax.swing.JLabel();
        user_routineC = new javax.swing.JLabel();
        user_routineJ = new javax.swing.JLabel();
        user_breakfast = new javax.swing.JLabel();
        user_lunch = new javax.swing.JLabel();
        user_dinner = new javax.swing.JLabel();
        user_contact2 = new javax.swing.JLabel();
        user_email2 = new javax.swing.JLabel();
        user_workout2 = new javax.swing.JLabel();
        user_sched2 = new javax.swing.JLabel();
        user_routine2 = new javax.swing.JLabel();
        user_dinner2 = new javax.swing.JLabel();
        user_lunch2 = new javax.swing.JLabel();
        user_breakfast2 = new javax.swing.JLabel();
        user_icon = new javax.swing.JLabel();
        user_return = new javax.swing.JButton();
        user_edit_title = new javax.swing.JLabel();
        gradient_bg2 = new javax.swing.JLabel();
        gradient_bg = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1020, 530));
        setLayout(null);

        user_invalid.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        user_invalid.setForeground(new java.awt.Color(255, 0, 0));
        user_invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_invalid.setText("Invalid member data, please recheck your input data.");
        add(user_invalid);
        user_invalid.setBounds(210, 470, 270, 20);

        user_firstname_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_firstname_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_firstname_title.setText("First name");
        user_firstname_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_firstname_title);
        user_firstname_title.setBounds(70, 80, 520, 20);

        user_firstname_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        user_firstname_input.setBorder(null);
        user_firstname_input.setOpaque(false);
        add(user_firstname_input);
        user_firstname_input.setBounds(90, 100, 510, 40);

        user_firstname_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_firstname_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar.png"))); // NOI18N
        user_firstname_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_firstname_bg);
        user_firstname_bg.setBounds(70, 100, 550, 40);

        user_lastname_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_lastname_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_lastname_title.setText("Last Name");
        user_lastname_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_lastname_title);
        user_lastname_title.setBounds(70, 160, 520, 20);

        user_lastname_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        user_lastname_input.setBorder(null);
        user_lastname_input.setOpaque(false);
        add(user_lastname_input);
        user_lastname_input.setBounds(90, 180, 510, 40);

        user_lastname_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_lastname_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar.png"))); // NOI18N
        user_lastname_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_lastname_bg);
        user_lastname_bg.setBounds(70, 180, 550, 40);

        user_contact_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_contact_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_contact_title.setText("Contact No.");
        user_contact_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_contact_title);
        user_contact_title.setBounds(70, 240, 520, 20);

        user_contact_input2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        user_contact_input2.setForeground(new java.awt.Color(153, 153, 153));
        user_contact_input2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_contact_input2.setText("+63");
        user_contact_input2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_contact_input2);
        user_contact_input2.setBounds(80, 260, 30, 40);

        user_contact_input.setBorder(null);
        user_contact_input.setColumns(10);
        user_contact_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        user_contact_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        user_contact_input.setOpaque(false);
        user_contact_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_contact_inputActionPerformed(evt);
            }
        });
        add(user_contact_input);
        user_contact_input.setBounds(120, 260, 480, 40);

        user_contact_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_contact_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar.png"))); // NOI18N
        user_contact_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_contact_bg);
        user_contact_bg.setBounds(70, 260, 550, 40);

        user_email_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_email_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_email_title.setText("Email");
        user_email_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_email_title);
        user_email_title.setBounds(70, 320, 520, 20);

        user_email_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        user_email_input.setBorder(null);
        user_email_input.setOpaque(false);
        add(user_email_input);
        user_email_input.setBounds(90, 340, 510, 40);

        user_email_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_email_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar.png"))); // NOI18N
        user_email_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_email_bg);
        user_email_bg.setBounds(70, 340, 550, 40);

        user_workout_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_workout_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_workout_title.setText("Type of Workout");
        user_workout_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_workout_title);
        user_workout_title.setBounds(70, 400, 520, 20);

        user_workout_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        user_workout_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        user_workout_input.setBorder(null);
        user_workout_input.setFocusable(false);
        user_workout_input.setOpaque(false);
        add(user_workout_input);
        user_workout_input.setBounds(90, 430, 510, 20);

        user_workout_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_workout_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar.png"))); // NOI18N
        user_workout_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_workout_bg);
        user_workout_bg.setBounds(70, 420, 550, 40);

        user_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        user_save.setBorder(null);
        user_save.setBorderPainted(false);
        user_save.setContentAreaFilled(false);
        user_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_save.setFocusPainted(false);
        user_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_saveMouseExited(evt);
            }
        });
        user_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_saveActionPerformed(evt);
            }
        });
        add(user_save);
        user_save.setBounds(800, 470, 50, 31);

        user_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        user_delete.setBorder(null);
        user_delete.setBorderPainted(false);
        user_delete.setContentAreaFilled(false);
        user_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_delete.setFocusPainted(false);
        user_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_deleteMouseExited(evt);
            }
        });
        user_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_deleteActionPerformed(evt);
            }
        });
        add(user_delete);
        user_delete.setBounds(860, 470, 50, 31);

        user_lastname.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        user_lastname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_lastname.setText("LAST NAME");
        add(user_lastname);
        user_lastname.setBounds(700, 170, 310, 40);

        user_firstname.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        user_firstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_firstname.setText("First Name");
        add(user_firstname);
        user_firstname.setBounds(700, 200, 310, 30);

        user_contact.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_contact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_contact.setText("n/a");
        add(user_contact);
        user_contact.setBounds(820, 240, 160, 20);

        user_email.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        user_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_email.setText("n/a");
        add(user_email);
        user_email.setBounds(780, 260, 210, 20);

        user_workout.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_workout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_workout.setText("n/a");
        add(user_workout);
        user_workout.setBounds(800, 290, 180, 20);

        user_sched.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_sched.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_sched.setText("n/a");
        add(user_sched);
        user_sched.setBounds(800, 310, 180, 20);

        user_routineP.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineP.setText("n/a");
        add(user_routineP);
        user_routineP.setBounds(800, 330, 180, 20);

        user_routineC.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineC.setText("n/a");
        add(user_routineC);
        user_routineC.setBounds(800, 350, 180, 20);

        user_routineJ.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineJ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineJ.setText("n/a");
        add(user_routineJ);
        user_routineJ.setBounds(800, 370, 180, 20);

        user_breakfast.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_breakfast.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_breakfast.setText("n/a");
        add(user_breakfast);
        user_breakfast.setBounds(800, 390, 180, 20);

        user_lunch.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_lunch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_lunch.setText("n/a");
        add(user_lunch);
        user_lunch.setBounds(800, 410, 190, 20);

        user_dinner.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_dinner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_dinner.setText("n/a");
        add(user_dinner);
        user_dinner.setBounds(800, 430, 190, 20);

        user_contact2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_contact2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_contact2.setText("Contact No.:");
        add(user_contact2);
        user_contact2.setBounds(720, 240, 100, 20);

        user_email2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_email2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_email2.setText("Email:");
        add(user_email2);
        user_email2.setBounds(720, 260, 50, 20);

        user_workout2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_workout2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_workout2.setText("Workout:");
        add(user_workout2);
        user_workout2.setBounds(720, 290, 70, 20);

        user_sched2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_sched2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_sched2.setText("Schedule:");
        add(user_sched2);
        user_sched2.setBounds(720, 310, 80, 20);

        user_routine2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_routine2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routine2.setText("Routine:");
        add(user_routine2);
        user_routine2.setBounds(720, 330, 70, 20);

        user_dinner2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_dinner2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_dinner2.setText("Dinner:");
        add(user_dinner2);
        user_dinner2.setBounds(720, 430, 60, 20);

        user_lunch2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_lunch2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_lunch2.setText("Lunch:");
        add(user_lunch2);
        user_lunch2.setBounds(720, 410, 60, 20);

        user_breakfast2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_breakfast2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_breakfast2.setText("Breakfast:");
        add(user_breakfast2);
        user_breakfast2.setBounds(720, 390, 80, 20);

        user_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_icon.png"))); // NOI18N
        user_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_icon);
        user_icon.setBounds(790, 40, 130, 130);

        user_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return2.png"))); // NOI18N
        user_return.setBorder(null);
        user_return.setBorderPainted(false);
        user_return.setContentAreaFilled(false);
        user_return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_return.setFocusPainted(false);
        user_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_returnMouseExited(evt);
            }
        });
        user_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_returnActionPerformed(evt);
            }
        });
        add(user_return);
        user_return.setBounds(610, 40, 40, 30);

        user_edit_title.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        user_edit_title.setText("Edit Member's Data");
        add(user_edit_title);
        user_edit_title.setBounds(40, 30, 450, 40);

        gradient_bg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gradient_bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gradient_bg_small.png"))); // NOI18N
        gradient_bg2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(gradient_bg2);
        gradient_bg2.setBounds(690, 0, 330, 530);

        gradient_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gradient_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gradient_bg.png"))); // NOI18N
        gradient_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(gradient_bg);
        gradient_bg.setBounds(0, 0, 690, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void user_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_saveMouseEntered
        user_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_user_saveMouseEntered

    private void user_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_saveMouseExited
        user_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_user_saveMouseExited

    private void user_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_saveActionPerformed
        Music.sfx();
        
        if (user_firstname_input.getText().length() > 2 &&
            user_lastname_input.getText().length() > 1 &&
            (
                (
                    (isValidEmail(user_email_input.getText()) && user_contact_input.getText().length() == 10) || // Condition 1
                    (isValidEmail(user_email_input.getText()) && user_contact_input.getText().isEmpty()) ||    // Condition 2
                    (user_email_input.getText().isEmpty() && user_contact_input.getText().isEmpty())           // Condition 3
                ) &&
                user_email_input.getText().matches("^\\w+[.-]?\\w+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$") // Email regex condition
            )) {
            user_invalid.setVisible(false);
            
            try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
                java.sql.Statement stmt = conn.createStatement();
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                
                
                int get_workoutID = 0;
                java.sql.ResultSet get_wID = stmt.executeQuery("select workout_id from workout where name = '" + String.valueOf(user_workout_input.getSelectedItem()) + "';");
                if(get_wID.next()) {
                    get_workoutID = get_wID.getInt("workout_id");
                }
                
                if(user_edit_title.getText() == "Edit Member's Data") {
                    String query_member = "update member set first_name = '" + user_firstname_input.getText() + "', last_name = '" + user_lastname_input.getText() + "' "
                                            + "where member_id = " + member_id + ";";
                    stmt.executeUpdate(query_member);

                    java.sql.ResultSet ref = stmt.executeQuery( "select MC.contact_id\n" +
                                                        "from member_contact MC left join member MCm on MC.member_id = MCm.member_id\n" +
                                                        "left join contact MCc on MC.contact_id = MCc.contact_id\n" +
                                                        "where MC.member_id = " + member_id + ";");
                    if(ref.next()) {
                        contact_id = ref.getInt("contact_id");
                    }
                    
                    if(user_contact_input.getText().isEmpty()) {
                        String query_contact = "update contact set phone_no = null, email = '" + user_email_input.getText() + "' "
                                                + "where contact_id = " + contact_id + ";";
                        stmt.executeUpdate(query_contact);
                    } else {
                        String query_contact = "update contact set phone_no = '" + user_contact_input.getText() + "', email = '" + user_email_input.getText() + "' "
                                            + "where contact_id = " + contact_id + ";";
                        stmt.executeUpdate(query_contact);
                    }
                    
                    String query_memwork = "update member_workout set workout_id = " + get_workoutID + " where member_id = " + member_id + ";";
                    int mw = stmt.executeUpdate(query_memwork);
                    if(mw == 0) {
                        String member_workout = "insert into member_workout(member_id, workout_id) values (" + member_id + ", " + get_workoutID + ");";
                        stmt.executeUpdate(member_workout);
                    }
                    
                    memberData(member_id);

                } else {
                    String query_member = "insert into member(first_name, last_name) values ('" + user_firstname_input.getText() + "','" + user_lastname_input.getText() + "');"; 
                    stmt.executeUpdate(query_member);
                    
                    java.sql.ResultSet new_mID = stmt.executeQuery("select last_insert_id();");
                    if(new_mID.next()) {
                        member_id = new_mID.getInt("last_insert_id()");
                    }
                    
                    if(user_email_input.getText().isEmpty() && user_contact_input.getText().isEmpty()) {
                        String member_contact = "insert into member_contact(member_id, contact_id) values (" + member_id + ", null);";
                        stmt.executeUpdate(member_contact);
                    }
                    if(!user_email_input.getText().isEmpty() && user_contact_input.getText().isEmpty()) {
                        String query_contact = "insert into contact(email, phone_no) values ('" + user_email_input.getText() + "', null);";
                        stmt.executeUpdate(query_contact);
                        java.sql.ResultSet new_cID = stmt.executeQuery("select last_insert_id();");
                        if(new_cID.next()) {
                            contact_id = new_cID.getInt("last_insert_id()");
                        }
                        
                        String member_contact = "insert into member_contact(member_id, contact_id) values (" + member_id + ", " + contact_id + ");";
                        stmt.executeUpdate(member_contact);
                    }
                    if(!user_email_input.getText().isEmpty() && !user_contact_input.getText().isEmpty()) {
                        String query_contact = "insert into contact(email, phone_no) values ('" + user_email_input.getText() + "', '" + user_contact_input.getText() + "');";
                        stmt.executeUpdate(query_contact);
                        java.sql.ResultSet new_cID = stmt.executeQuery("select last_insert_id();");
                        if(new_cID.next()) {
                            contact_id = new_cID.getInt("last_insert_id()");
                        }
                        
                        String member_contact = "insert into member_contact(member_id, contact_id) values (" + member_id + ", " + contact_id + ");";
                        stmt.executeUpdate(member_contact);
                    }
                    
                    String member_workout = "insert into member_workout(member_id, workout_id) values (" + member_id + ", " + get_workoutID + ");";
                    stmt.executeUpdate(member_workout);
                    
                    memberData(member_id);
                    user_save.setEnabled(false);
                }
                conn.close();

            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException ex) { 
                java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } else {
            System.out.println(user_contact_input.getText().length());
            user_invalid.setVisible(true);
        }
    }//GEN-LAST:event_user_saveActionPerformed

    private void user_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_deleteMouseEntered
        user_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_user_deleteMouseEntered

    private void user_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_deleteMouseExited
        user_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_user_deleteMouseExited

    private void user_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_deleteActionPerformed
        Music.sfx();
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete = "delete from member_workout where member_id = " + member_id + ";";
            stmt.executeUpdate(query_delete);
            
            int contact_id = 0;
            String get_contactID = "select contact_id from member_contact where member_id = " + member_id + ";";
            java.sql.ResultSet query_contact = stmt.executeQuery(get_contactID);
            if(query_contact.next()) {
                contact_id = query_contact.getInt("contact_id");
            }
            String query_delete2 = "delete from member_contact where member_id = " + member_id + ";";
            stmt.executeUpdate(query_delete2);
            
            String query_delete3 = "delete from contact where contact_id = " + contact_id + ";";
            stmt.executeUpdate(query_delete3);
            
            String query_delete4 = "delete from member where member_id = " + member_id + ";";
            stmt.executeUpdate(query_delete4);
            
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        reset();
        VallGym.mainMenu.panel_edit.reset();
        VallGym.mainMenu.panel_edit.resetTable();
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "edit_menu");
    }//GEN-LAST:event_user_deleteActionPerformed

    private void user_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_returnMouseEntered
        user_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return2_hover.png")));
    }//GEN-LAST:event_user_returnMouseEntered

    private void user_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_returnMouseExited
        user_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return2.png")));
    }//GEN-LAST:event_user_returnMouseExited

    private void user_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_returnActionPerformed
        Music.sfx();
        reset();
        
        VallGym.mainMenu.panel_edit.reset();
        VallGym.mainMenu.panel_edit.resetTable();
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "edit_menu");
    }//GEN-LAST:event_user_returnActionPerformed

    private void user_contact_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_contact_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_contact_inputActionPerformed
    
    public void memberData(int selected_ID) {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // NAME, CONTACT, EMAIL
            java.sql.ResultSet ref = stmt.executeQuery( "select MC.member_id, MC.contact_id, MCm.first_name, MCm.last_name, MCc.email, MCc.phone_no\n" +
                                                        "from member_contact MC left join member MCm on MC.member_id = MCm.member_id\n" +
                                                        "left join contact MCc on MC.contact_id = MCc.contact_id\n" +
                                                        "where MC.member_id = '" + selected_ID + "';" );
            if(ref.next()) {
                user_lastname.setText(ref.getString("last_name"));
                user_firstname.setText(ref.getString("first_name"));

                if(ref.getString("phone_no") != null)
                    user_contact.setText("+63 " + ref.getString("phone_no"));
                else
                    user_contact.setText("n/a");

                if(ref.getString("email") != null)
                    user_email.setText(ref.getString("email"));
                else
                    user_email.setText("n/a");
            }

            // WORKOUT
            int user_workID = 0;
            java.sql.ResultSet ref2 = stmt.executeQuery("select MW.member_id, MW.workout_id, MWw.name\n" +
                                                        "from member_workout MW\n" +
                                                        "join member MWm on MW.member_id = MWm.member_id\n" +
                                                        "join workout MWw on MW.workout_id = MWw.workout_id\n" +
                                                        "where MW.member_id = '" + selected_ID + "';" );
            if(ref2.next()) {
                user_workout.setText(ref2.getString("name"));
                user_workID = ref2.getInt("workout_id");
            }

            // SCHEDULE
            java.sql.ResultSet ref3 = stmt.executeQuery("select WS.workout_id, WS.sched_id, WSs.date\n" +
                                                        "from workout_schedule WS\n" +
                                                        "join workout WSw on WS.workout_id = WSw.workout_id\n" +
                                                        "join schedule WSs on WS.sched_id = WSs.sched_id\n" +
                                                        "where WS.workout_id = '" + user_workID + "';" );
            if(ref3.next()) {
                user_sched.setText(ref3.getString("date"));
            }

            // ROUTINE
            int user_routID = 0;
            java.sql.ResultSet ref4 = stmt.executeQuery("select WR.workout_id, WR.routine_id, WRr.name\n" +
                                                        "from workout_routine WR\n" +
                                                        "join workout WRw on WR.workout_id = WRw.workout_id\n" +
                                                        "join routine WRr on WR.routine_id = WRr.routine_id\n" +
                                                        "where WR.workout_id = '" + user_workID + "';" );
            if(ref4.next()) {
                user_routID = ref4.getInt("routine_id");
            }
                // PUSH-UPS
                java.sql.ResultSet ref5 = stmt.executeQuery("select RP.routine_id, RP.pushup_id, RPp.count\n" +
                                                            "from routine_pushups RP\n" +
                                                            "join routine RPr on RP.routine_id = RPr.routine_id\n" +
                                                            "join push_ups RPp on RP.pushup_id = RPp.pushup_id\n" +
                                                            "where RP.routine_id = '" + user_routID + "';" );
                if(ref5.next()) {
                    user_routineP.setText(ref5.getString("count") + "x push-ups");
                }
                // CURL-UPS
                java.sql.ResultSet ref6 = stmt.executeQuery("select RC.routine_id, RC.curlup_id, RCc.count\n" +
                                                            "from routine_curlups RC\n" +
                                                            "join routine RCr on RC.routine_id = RCr.routine_id\n" +
                                                            "join curl_ups RCc on RC.curlup_id = RCc.curlup_id\n" +
                                                            "where RC.routine_id = '" + user_routID + "';" );
                if(ref6.next()) {
                    user_routineC.setText(ref6.getString("count") + "x curl-ups");
                }
                // JOGGING
                java.sql.ResultSet ref7 = stmt.executeQuery("select RJ.routine_id, RJ.jogging_id, RJj.count\n" +
                                                            "from routine_jogging RJ\n" +
                                                            "join routine RJr on RJ.routine_id = RJr.routine_id\n" +
                                                            "join jogging RJj on RJ.jogging_id = RJj.jogging_id\n" +
                                                            "where RJ.routine_id = '" + user_routID + "';" );
                if(ref7.next()) {
                    user_routineJ.setText(ref7.getString("count") + " km jogging");
                }

            // DIET
            int user_dietID = 0;
            java.sql.ResultSet ref8 = stmt.executeQuery("select WD.workout_id, WD.diet_id, WDd.name\n" +
                                                        "from workout_diet WD\n" +
                                                        "join workout WDw on WD.workout_id = WDw.workout_id\n" +
                                                        "join diet WDd on WD.diet_id = WDd.diet_id\n" +
                                                        "where WD.workout_id = '" + user_workID + "';" );
            if(ref8.next()) {
                user_dietID = ref8.getInt("diet_id");
            }
                // BREAKFAST
                java.sql.ResultSet ref9 = stmt.executeQuery("select DB.diet_id, DB.bf_id, DBb.name\n" +
                                                            "from diet_breakfast DB\n" +
                                                            "join diet DBd on DB.diet_id = DBd.diet_id\n" +
                                                            "join breakfast DBb on DB.bf_id = DBb.bf_id\n" +
                                                            "where DB.diet_id = '" + user_dietID + "';" );
                if(ref9.next()) {
                    user_breakfast.setText(ref9.getString("name"));
                }
                // LUNCH
                java.sql.ResultSet ref10 = stmt.executeQuery("select DL.diet_id, DL.lunch_id, DLl.name\n" +
                                                            "from diet_lunch DL\n" +
                                                            "join diet DLd on DL.diet_id = DLd.diet_id\n" +
                                                            "join lunch DLl on DL.lunch_id = DLl.lunch_id\n" +
                                                            "where DL.diet_id = '" + user_dietID + "';" );
                if(ref10.next()) {
                    user_lunch.setText(ref10.getString("name"));
                }
                // DINNER
                java.sql.ResultSet ref11 = stmt.executeQuery("select DD.diet_id, DD.dinner_id, DDdd.name\n" +
                                                            "from diet_dinner DD\n" +
                                                            "join diet DDd on DD.diet_id = DDd.diet_id\n" +
                                                            "join dinner DDdd on DD.dinner_id = DDdd.dinner_id\n" +
                                                            "where DD.diet_id = '" + user_dietID + "';" );
                if(ref11.next()) {
                    user_dinner.setText(ref11.getString("name"));
                }
            conn.close();

        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(emailRegex);
        java.util.regex.Matcher matcher = pattern.matcher(email);
        
        return matcher.matches();
    }
    
    public void reset() {
        user_edit_title.setText("Edit Member's Data");
        user_lastname.setText("LAST NAME");
        user_firstname.setText("First Name");
        user_contact.setText("n/a");
        user_email.setText("n/a");
        user_workout.setText("n/a");
        user_sched.setText("n/a");
        user_routineC.setText("n/a");
        user_routineJ.setText("n/a");
        user_routineP.setText("n/a");
        user_breakfast.setText("n/a");
        user_lunch.setText("n/a");
        user_dinner.setText("n/a");
        
        user_lastname_input.setText("");
        user_firstname_input.setText("");
        user_contact_input.setText("");
        user_email_input.setText("");
        
        user_save.setEnabled(true);
        user_delete.setEnabled(true);
        user_workout_input.removeAllItems();
        user_invalid.setVisible(false);
        member_id = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gradient_bg;
    private javax.swing.JLabel gradient_bg2;
    public javax.swing.JLabel user_breakfast;
    private javax.swing.JLabel user_breakfast2;
    public javax.swing.JLabel user_contact;
    private javax.swing.JLabel user_contact2;
    private javax.swing.JLabel user_contact_bg;
    public javax.swing.JFormattedTextField user_contact_input;
    private javax.swing.JLabel user_contact_input2;
    private javax.swing.JLabel user_contact_title;
    public javax.swing.JButton user_delete;
    public javax.swing.JLabel user_dinner;
    private javax.swing.JLabel user_dinner2;
    public javax.swing.JLabel user_edit_title;
    public javax.swing.JLabel user_email;
    private javax.swing.JLabel user_email2;
    private javax.swing.JLabel user_email_bg;
    public javax.swing.JTextField user_email_input;
    private javax.swing.JLabel user_email_title;
    public javax.swing.JLabel user_firstname;
    private javax.swing.JLabel user_firstname_bg;
    public javax.swing.JTextField user_firstname_input;
    private javax.swing.JLabel user_firstname_title;
    private javax.swing.JLabel user_icon;
    public javax.swing.JLabel user_invalid;
    public javax.swing.JLabel user_lastname;
    private javax.swing.JLabel user_lastname_bg;
    public javax.swing.JTextField user_lastname_input;
    private javax.swing.JLabel user_lastname_title;
    public javax.swing.JLabel user_lunch;
    private javax.swing.JLabel user_lunch2;
    private javax.swing.JButton user_return;
    private javax.swing.JLabel user_routine2;
    public javax.swing.JLabel user_routineC;
    public javax.swing.JLabel user_routineJ;
    public javax.swing.JLabel user_routineP;
    private javax.swing.JButton user_save;
    public javax.swing.JLabel user_sched;
    private javax.swing.JLabel user_sched2;
    public javax.swing.JLabel user_workout;
    private javax.swing.JLabel user_workout2;
    private javax.swing.JLabel user_workout_bg;
    public javax.swing.JComboBox<String> user_workout_input;
    private javax.swing.JLabel user_workout_title;
    // End of variables declaration//GEN-END:variables
}
