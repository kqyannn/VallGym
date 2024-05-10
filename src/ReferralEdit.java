public class ReferralEdit extends javax.swing.JPanel {
    public javax.swing.table.DefaultTableModel tableModel;
    private int code_id;
    
    public ReferralEdit() {
        String[] columnNames = {"ID", "Name"};
        tableModel = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        initComponents();
        
        referral_invalid.setVisible(false);
        
        user_table.getColumnModel().getColumn(0).setPreferredWidth(50);
        user_table.getColumnModel().getColumn(1).setPreferredWidth(520);
        user_table.getColumnModel().getColumn(1).setCellRenderer(new PaddedRenderer());
        
        javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        javax.swing.ListSelectionModel selectionModel = user_table.getSelectionModel();
        user_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = user_table.getSelectedRow();
                    if (selectedRow != -1) {
                        referral_edit.setEnabled(true);
                        referral_delete.setEnabled(true);
                        
                        code_id = (int)user_table.getValueAt(selectedRow, 0);
                        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
                            java.sql.Statement stmt = conn.createStatement();
                            Class.forName("com.mysql.cj.jdbc.Driver"); 

                            String queryCode = "select code from referral_codes where code_id = " + code_id + ";";
                            java.sql.ResultSet rs = stmt.executeQuery(queryCode);
                            if(rs.next()) {
                                referral_input.setText(rs.getString("code"));
                            }

                            conn.close();

                        } catch (java.sql.SQLException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException ex) { 
                            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        }
                    } else {
                        referral_input.setText("");
                        referral_edit.setEnabled(false);
                        referral_delete.setEnabled(false);
                    }
                }
            }
        });
    }
    
    class PaddedRenderer extends javax.swing.table.DefaultTableCellRenderer {
        private java.awt.Insets padding = new java.awt.Insets(5, 10, 5, 10); // Define padding

        public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            javax.swing.JLabel label = (javax.swing.JLabel) super.getTableCellRendererComponent(table, value, isSelected, false, row, column);
            label.setBorder(javax.swing.BorderFactory.createEmptyBorder(padding.top, padding.left, padding.bottom, padding.right));
            return label;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_table_scroll = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        referral_title = new javax.swing.JLabel();
        referral_input = new javax.swing.JTextField();
        referral_bg = new javax.swing.JLabel();
        referral_edit = new javax.swing.JButton();
        referral_save = new javax.swing.JButton();
        referral_delete = new javax.swing.JButton();
        referral_invalid = new javax.swing.JLabel();
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
        workout_edit_title = new javax.swing.JLabel();
        gradient_bg2 = new javax.swing.JLabel();
        gradient_bg = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1020, 530));
        setLayout(null);

        user_table_scroll.setBackground(new java.awt.Color(255, 255, 255));
        user_table_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        user_table_scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        user_table_scroll.setFocusable(false);
        user_table_scroll.setOpaque(false);
        user_table_scroll.setPreferredSize(new java.awt.Dimension(610, 350));
        user_table_scroll.setRequestFocusEnabled(false);

        user_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        user_table.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        user_table.setModel(tableModel);
        user_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        user_table.setFocusable(false);
        user_table.setOpaque(false);
        user_table.setRowHeight(30);
        user_table.setShowGrid(false);
        user_table.setTableHeader(null);
        user_table_scroll.setViewportView(user_table);

        add(user_table_scroll);
        user_table_scroll.setBounds(50, 90, 590, 290);

        referral_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        referral_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        referral_title.setText("Referral Code");
        referral_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(referral_title);
        referral_title.setBounds(120, 400, 270, 20);

        referral_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        referral_input.setBorder(null);
        referral_input.setOpaque(false);
        add(referral_input);
        referral_input.setBounds(140, 420, 230, 40);

        referral_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        referral_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        referral_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(referral_bg);
        referral_bg.setBounds(120, 420, 270, 40);

        referral_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        referral_edit.setBorder(null);
        referral_edit.setBorderPainted(false);
        referral_edit.setContentAreaFilled(false);
        referral_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        referral_edit.setEnabled(false);
        referral_edit.setFocusPainted(false);
        referral_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                referral_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                referral_editMouseExited(evt);
            }
        });
        referral_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referral_editActionPerformed(evt);
            }
        });
        add(referral_edit);
        referral_edit.setBounds(410, 420, 50, 40);

        referral_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        referral_save.setBorder(null);
        referral_save.setBorderPainted(false);
        referral_save.setContentAreaFilled(false);
        referral_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        referral_save.setFocusPainted(false);
        referral_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                referral_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                referral_saveMouseExited(evt);
            }
        });
        referral_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referral_saveActionPerformed(evt);
            }
        });
        add(referral_save);
        referral_save.setBounds(460, 420, 50, 40);

        referral_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        referral_delete.setBorder(null);
        referral_delete.setBorderPainted(false);
        referral_delete.setContentAreaFilled(false);
        referral_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        referral_delete.setEnabled(false);
        referral_delete.setFocusPainted(false);
        referral_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                referral_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                referral_deleteMouseExited(evt);
            }
        });
        referral_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referral_deleteActionPerformed(evt);
            }
        });
        add(referral_delete);
        referral_delete.setBounds(510, 420, 50, 40);

        referral_invalid.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        referral_invalid.setForeground(new java.awt.Color(255, 0, 0));
        referral_invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        referral_invalid.setText("Invalid referral code, must be 8 characters long.");
        add(referral_invalid);
        referral_invalid.setBounds(120, 460, 270, 30);

        user_lastname.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        user_lastname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_lastname.setText("SAMPLE");
        add(user_lastname);
        user_lastname.setBounds(700, 170, 310, 40);

        user_firstname.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        user_firstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_firstname.setText("Sample");
        add(user_firstname);
        user_firstname.setBounds(700, 200, 310, 30);

        user_contact.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_contact.setForeground(new java.awt.Color(153, 153, 153));
        user_contact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_contact.setText("+63 9123456789");
        add(user_contact);
        user_contact.setBounds(820, 240, 160, 20);

        user_email.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        user_email.setForeground(new java.awt.Color(153, 153, 153));
        user_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_email.setText("sample@sample.com");
        add(user_email);
        user_email.setBounds(780, 260, 210, 20);

        user_workout.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_workout.setForeground(new java.awt.Color(153, 153, 153));
        user_workout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_workout.setText("n/a");
        add(user_workout);
        user_workout.setBounds(800, 290, 180, 20);

        user_sched.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_sched.setForeground(new java.awt.Color(153, 153, 153));
        user_sched.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_sched.setText("n/a");
        add(user_sched);
        user_sched.setBounds(800, 310, 180, 20);

        user_routineP.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineP.setForeground(new java.awt.Color(153, 153, 153));
        user_routineP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineP.setText("n/a");
        add(user_routineP);
        user_routineP.setBounds(800, 330, 180, 20);

        user_routineC.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineC.setForeground(new java.awt.Color(153, 153, 153));
        user_routineC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineC.setText("n/a");
        add(user_routineC);
        user_routineC.setBounds(800, 350, 180, 20);

        user_routineJ.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineJ.setForeground(new java.awt.Color(153, 153, 153));
        user_routineJ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineJ.setText("n/a");
        add(user_routineJ);
        user_routineJ.setBounds(800, 370, 180, 20);

        user_breakfast.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_breakfast.setForeground(new java.awt.Color(153, 153, 153));
        user_breakfast.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_breakfast.setText("n/a");
        add(user_breakfast);
        user_breakfast.setBounds(800, 390, 180, 20);

        user_lunch.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_lunch.setForeground(new java.awt.Color(153, 153, 153));
        user_lunch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_lunch.setText("n/a");
        add(user_lunch);
        user_lunch.setBounds(800, 410, 190, 20);

        user_dinner.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_dinner.setForeground(new java.awt.Color(153, 153, 153));
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

        workout_edit_title.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        workout_edit_title.setText("Edit Referral Codes");
        add(workout_edit_title);
        workout_edit_title.setBounds(40, 30, 450, 40);

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

    private void referral_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_referral_saveMouseEntered
        referral_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_referral_saveMouseEntered

    private void referral_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_referral_saveMouseExited
        referral_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_referral_saveMouseExited

    private void referral_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referral_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            if(referral_input.getText().length() == 8) {
                String query_workout = "insert into referral_codes(code) values ('" + referral_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);
                java.sql.ResultSet new_wID = stmt.executeQuery("select last_insert_id();");
                    if(new_wID.next()) {
                        code_id = new_wID.getInt("last_insert_id()");
                    }

                while (tableModel.getRowCount() > 0) {
                    tableModel.removeRow(0);
                }
                codeList();
                referral_invalid.setVisible(false);
            } else {
                referral_invalid.setVisible(true);
            }
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_referral_saveActionPerformed

    private void referral_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_referral_deleteMouseEntered
        referral_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_referral_deleteMouseEntered

    private void referral_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_referral_deleteMouseExited
        referral_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_referral_deleteMouseExited

    private void referral_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referral_deleteActionPerformed
        Music.sfx();
        
        int selectedRow = user_table.getSelectedRow();
        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete1 = "delete from referral_codes where code_id = " + code_id + ";";
            stmt.executeUpdate(query_delete1);
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            codeList();
            
            referral_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_referral_deleteActionPerformed

    private void user_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_returnMouseEntered
        user_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return2_hover.png")));
    }//GEN-LAST:event_user_returnMouseEntered

    private void user_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_returnMouseExited
        user_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return2.png")));
    }//GEN-LAST:event_user_returnMouseExited

    private void user_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_returnActionPerformed
        Music.sfx();
        reset();
       
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "edit_menu");
    }//GEN-LAST:event_user_returnActionPerformed

    private void referral_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_referral_editMouseEntered
        referral_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_referral_editMouseEntered

    private void referral_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_referral_editMouseExited
        referral_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_referral_editMouseExited

    private void referral_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referral_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            if(referral_input.getText().length() == 8) {
                String workout_routine = "update referral_codes set code = '" + referral_input.getText() + "' where code_id = " + code_id + ";";
                int wr = stmt.executeUpdate(workout_routine);
                if(wr == 0) {
                    String workout_routine2 = "insert into referral_codes(code) values ('" + referral_input.getText() + "');";
                    stmt.executeUpdate(workout_routine);
                }

                while (tableModel.getRowCount() > 0) {
                    tableModel.removeRow(0);
                }
                codeList();
                referral_invalid.setVisible(false);
                referral_delete.setEnabled(false);
            } else {
                referral_invalid.setVisible(true);
            }
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_referral_editActionPerformed
    
    public void codeList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from referral_codes;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel.addRow(new Object[]{workouts.getInt("code_id"), workouts.getString("code")});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void reset() {
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
        
        referral_edit.setEnabled(false);
        referral_delete.setEnabled(false);
        referral_invalid.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gradient_bg;
    private javax.swing.JLabel gradient_bg2;
    private javax.swing.JLabel referral_bg;
    public javax.swing.JButton referral_delete;
    public javax.swing.JButton referral_edit;
    public javax.swing.JTextField referral_input;
    public javax.swing.JLabel referral_invalid;
    public javax.swing.JButton referral_save;
    private javax.swing.JLabel referral_title;
    public javax.swing.JLabel user_breakfast;
    private javax.swing.JLabel user_breakfast2;
    public javax.swing.JLabel user_contact;
    private javax.swing.JLabel user_contact2;
    public javax.swing.JLabel user_dinner;
    private javax.swing.JLabel user_dinner2;
    public javax.swing.JLabel user_email;
    private javax.swing.JLabel user_email2;
    public javax.swing.JLabel user_firstname;
    private javax.swing.JLabel user_icon;
    public javax.swing.JLabel user_lastname;
    public javax.swing.JLabel user_lunch;
    private javax.swing.JLabel user_lunch2;
    private javax.swing.JButton user_return;
    private javax.swing.JLabel user_routine2;
    public javax.swing.JLabel user_routineC;
    public javax.swing.JLabel user_routineJ;
    public javax.swing.JLabel user_routineP;
    public javax.swing.JLabel user_sched;
    private javax.swing.JLabel user_sched2;
    public javax.swing.JTable user_table;
    public javax.swing.JScrollPane user_table_scroll;
    public javax.swing.JLabel user_workout;
    private javax.swing.JLabel user_workout2;
    public javax.swing.JLabel workout_edit_title;
    // End of variables declaration//GEN-END:variables
}
