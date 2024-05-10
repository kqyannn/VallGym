public class EditMenu extends javax.swing.JPanel {
    public javax.swing.table.DefaultTableModel tableModel;
    
    public EditMenu() {
        String[] columnNames = {"ID", "Name"};
        tableModel = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        initComponents();
        
        user_table.getColumnModel().getColumn(0).setPreferredWidth(50);
        user_table.getColumnModel().getColumn(1).setPreferredWidth(540);
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
                        reset();
                        user_edit.setEnabled(true);
                        user_delete.setEnabled(true);
                        
                        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
                        memberData(selected_ID);
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

        user_search_input = new javax.swing.JTextField();
        user_delete = new javax.swing.JButton();
        user_edit = new javax.swing.JButton();
        user_edit_routines = new javax.swing.JButton();
        user_edit_diets = new javax.swing.JButton();
        user_edit_workouts = new javax.swing.JButton();
        user_edit_referral = new javax.swing.JButton();
        user_add = new javax.swing.JButton();
        user_table_scroll = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        user_search = new javax.swing.JButton();
        search_bar = new javax.swing.JLabel();
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
        gradient_bg2 = new javax.swing.JLabel();
        gradient_bg = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1020, 530));
        setLayout(null);

        user_search_input.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        user_search_input.setBorder(null);
        user_search_input.setOpaque(false);
        add(user_search_input);
        user_search_input.setBounds(60, 40, 530, 50);

        user_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        user_delete.setBorder(null);
        user_delete.setBorderPainted(false);
        user_delete.setContentAreaFilled(false);
        user_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_delete.setEnabled(false);
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

        user_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        user_edit.setBorder(null);
        user_edit.setBorderPainted(false);
        user_edit.setContentAreaFilled(false);
        user_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_edit.setEnabled(false);
        user_edit.setFocusPainted(false);
        user_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_editMouseExited(evt);
            }
        });
        user_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_editActionPerformed(evt);
            }
        });
        add(user_edit);
        user_edit.setBounds(800, 470, 50, 31);

        user_edit_routines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/routine.png"))); // NOI18N
        user_edit_routines.setBorder(null);
        user_edit_routines.setBorderPainted(false);
        user_edit_routines.setContentAreaFilled(false);
        user_edit_routines.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_edit_routines.setFocusPainted(false);
        user_edit_routines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_edit_routinesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_edit_routinesMouseExited(evt);
            }
        });
        user_edit_routines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_edit_routinesActionPerformed(evt);
            }
        });
        add(user_edit_routines);
        user_edit_routines.setBounds(600, 450, 50, 50);

        user_edit_diets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/diet.png"))); // NOI18N
        user_edit_diets.setBorder(null);
        user_edit_diets.setBorderPainted(false);
        user_edit_diets.setContentAreaFilled(false);
        user_edit_diets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_edit_diets.setFocusPainted(false);
        user_edit_diets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_edit_dietsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_edit_dietsMouseExited(evt);
            }
        });
        user_edit_diets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_edit_dietsActionPerformed(evt);
            }
        });
        add(user_edit_diets);
        user_edit_diets.setBounds(550, 450, 50, 50);

        user_edit_workouts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_workouts.png"))); // NOI18N
        user_edit_workouts.setBorder(null);
        user_edit_workouts.setBorderPainted(false);
        user_edit_workouts.setContentAreaFilled(false);
        user_edit_workouts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_edit_workouts.setFocusPainted(false);
        user_edit_workouts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_edit_workoutsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_edit_workoutsMouseExited(evt);
            }
        });
        user_edit_workouts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_edit_workoutsActionPerformed(evt);
            }
        });
        add(user_edit_workouts);
        user_edit_workouts.setBounds(390, 450, 160, 50);

        user_edit_referral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/referral_codes.png"))); // NOI18N
        user_edit_referral.setBorder(null);
        user_edit_referral.setBorderPainted(false);
        user_edit_referral.setContentAreaFilled(false);
        user_edit_referral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_edit_referral.setFocusPainted(false);
        user_edit_referral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_edit_referralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_edit_referralMouseExited(evt);
            }
        });
        user_edit_referral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_edit_referralActionPerformed(evt);
            }
        });
        add(user_edit_referral);
        user_edit_referral.setBounds(340, 450, 50, 50);

        user_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add_button.png"))); // NOI18N
        user_add.setBorder(null);
        user_add.setBorderPainted(false);
        user_add.setContentAreaFilled(false);
        user_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_add.setFocusPainted(false);
        user_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_addMouseExited(evt);
            }
        });
        user_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_addActionPerformed(evt);
            }
        });
        add(user_add);
        user_add.setBounds(40, 450, 50, 50);

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
        user_table_scroll.setBounds(40, 100, 610, 340);

        user_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_button.png"))); // NOI18N
        user_search.setBorder(null);
        user_search.setBorderPainted(false);
        user_search.setContentAreaFilled(false);
        user_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_search.setFocusPainted(false);
        user_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_searchMouseExited(evt);
            }
        });
        user_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_searchActionPerformed(evt);
            }
        });
        add(user_search);
        user_search.setBounds(600, 50, 30, 30);

        search_bar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_bar.png"))); // NOI18N
        search_bar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(search_bar);
        search_bar.setBounds(40, 40, 610, 50);

        user_lastname.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        user_lastname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_lastname.setText("SELECT");
        add(user_lastname);
        user_lastname.setBounds(700, 170, 310, 40);

        user_firstname.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        user_firstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_firstname.setText("a User");
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
        user_email2.setBounds(720, 260, 100, 20);

        user_workout2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_workout2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_workout2.setText("Workout:");
        add(user_workout2);
        user_workout2.setBounds(720, 290, 100, 20);

        user_sched2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_sched2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_sched2.setText("Schedule:");
        add(user_sched2);
        user_sched2.setBounds(720, 310, 100, 20);

        user_routine2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_routine2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routine2.setText("Routine:");
        add(user_routine2);
        user_routine2.setBounds(720, 330, 100, 20);

        user_dinner2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_dinner2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_dinner2.setText("Dinner:");
        add(user_dinner2);
        user_dinner2.setBounds(720, 430, 100, 20);

        user_lunch2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_lunch2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_lunch2.setText("Lunch:");
        add(user_lunch2);
        user_lunch2.setBounds(720, 410, 100, 20);

        user_breakfast2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        user_breakfast2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_breakfast2.setText("Breakfast:");
        add(user_breakfast2);
        user_breakfast2.setBounds(720, 390, 100, 20);

        user_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_icon.png"))); // NOI18N
        user_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(user_icon);
        user_icon.setBounds(790, 40, 130, 130);

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

    private void user_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_searchMouseEntered
        user_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_button_hover.png")));
    }//GEN-LAST:event_user_searchMouseEntered

    private void user_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_searchMouseExited
        user_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_button.png")));
    }//GEN-LAST:event_user_searchMouseExited

    private void user_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_searchActionPerformed
        Music.sfx();
        reset();
        resetTable();
    }//GEN-LAST:event_user_searchActionPerformed

    private void user_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_addMouseEntered
        user_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add_button_hover.png")));
    }//GEN-LAST:event_user_addMouseEntered

    private void user_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_addMouseExited
        user_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add_button.png")));
    }//GEN-LAST:event_user_addMouseExited

    private void user_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_addActionPerformed
        Music.sfx();
        reset();
        user_search_input.setText("");
        resetTable();
        workoutList();
        
        VallGym.mainMenu.panel_user.user_edit_title.setText("Create Member Data");
        VallGym.mainMenu.panel_user.user_delete.setEnabled(false);
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "user_edit");
    }//GEN-LAST:event_user_addActionPerformed

    private void user_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_editMouseEntered
        user_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_user_editMouseEntered

    private void user_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_editMouseExited
        user_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_user_editMouseExited

    private void user_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_editActionPerformed
        Music.sfx();
        workoutList();
        
        int selectedRow = user_table.getSelectedRow();
        VallGym.mainMenu.panel_user.member_id = (int)user_table.getValueAt(selectedRow, 0);
        
        VallGym.mainMenu.panel_user.user_firstname_input.setText(user_firstname.getText());
        VallGym.mainMenu.panel_user.user_lastname_input.setText(user_lastname.getText());
        
        if(user_contact.getText() != "n/a")
            VallGym.mainMenu.panel_user.user_contact_input.setText(user_contact.getText().replace("+63 ", ""));
        else 
            VallGym.mainMenu.panel_user.user_contact_input.setText("");
        if(user_email.getText() != "n/a")
            VallGym.mainMenu.panel_user.user_email_input.setText(user_email.getText());
        else 
            VallGym.mainMenu.panel_user.user_email_input.setText("");
        
        for (int i = 0; i < VallGym.mainMenu.panel_user.user_workout_input.getItemCount(); i++) {
            Object item = VallGym.mainMenu.panel_user.user_workout_input.getItemAt(i);
            if (item != null && item.toString().equals(user_workout.getText())) {
                VallGym.mainMenu.panel_user.user_workout_input.setSelectedIndex(i);
                break; 
            }
        }
        
        VallGym.mainMenu.panel_user.user_firstname.setText(user_firstname.getText());
        VallGym.mainMenu.panel_user.user_lastname.setText(user_lastname.getText());
        VallGym.mainMenu.panel_user.user_contact.setText(user_contact.getText());
        VallGym.mainMenu.panel_user.user_email.setText(user_email.getText());
        VallGym.mainMenu.panel_user.user_workout.setText(user_workout.getText());
        VallGym.mainMenu.panel_user.user_sched.setText(user_sched.getText());
        VallGym.mainMenu.panel_user.user_routineP.setText(user_routineP.getText());
        VallGym.mainMenu.panel_user.user_routineC.setText(user_routineC.getText());
        VallGym.mainMenu.panel_user.user_routineJ.setText(user_routineJ.getText());
        VallGym.mainMenu.panel_user.user_breakfast.setText(user_breakfast.getText());
        VallGym.mainMenu.panel_user.user_lunch.setText(user_lunch.getText());
        VallGym.mainMenu.panel_user.user_dinner.setText(user_dinner.getText());
        
        reset();
        user_search_input.setText("");
        resetTable();
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "user_edit");
    }//GEN-LAST:event_user_editActionPerformed

    private void user_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_deleteMouseEntered
        user_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_user_deleteMouseEntered

    private void user_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_deleteMouseExited
        user_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_user_deleteMouseExited

    private void user_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_deleteActionPerformed
        Music.sfx();
        
        int selectedRow = user_table.getSelectedRow();
        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete = "delete from member_workout where member_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete);
            
            int contact_id = 0;
            String get_contactID = "select contact_id from member_contact where member_id = " + selected_ID + ";";
            java.sql.ResultSet query_contact = stmt.executeQuery(get_contactID);
            if(query_contact.next()) {
                contact_id = query_contact.getInt("contact_id");
            }
            String query_delete2 = "delete from member_contact where member_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete2);
            
            String query_delete3 = "delete from contact where contact_id = " + contact_id + ";";
            stmt.executeUpdate(query_delete3);
            
            String query_delete4 = "delete from member where member_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete4);
            
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        reset();
        user_search_input.setText("");
        resetTable();
    }//GEN-LAST:event_user_deleteActionPerformed

    private void user_edit_workoutsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_workoutsMouseEntered
        user_edit_workouts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_workouts_hover.png")));
    }//GEN-LAST:event_user_edit_workoutsMouseEntered

    private void user_edit_workoutsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_workoutsMouseExited
        user_edit_workouts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_workouts.png")));
    }//GEN-LAST:event_user_edit_workoutsMouseExited

    private void user_edit_workoutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_edit_workoutsActionPerformed
        Music.sfx();
        
        reset();
        user_search_input.setText("");
        resetTable();
        
        VallGym.mainMenu.panel_work.workoutList();
        VallGym.mainMenu.panel_work.routineList();
        VallGym.mainMenu.panel_work.schedList();
        VallGym.mainMenu.panel_work.dietList();
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "workout_edit");
    }//GEN-LAST:event_user_edit_workoutsActionPerformed

    private void user_edit_routinesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_routinesMouseEntered
        user_edit_routines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/routine_hover.png")));
    }//GEN-LAST:event_user_edit_routinesMouseEntered

    private void user_edit_routinesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_routinesMouseExited
        user_edit_routines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/routine.png")));
    }//GEN-LAST:event_user_edit_routinesMouseExited

    private void user_edit_routinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_edit_routinesActionPerformed
        Music.sfx();
        
        reset();
        user_search_input.setText("");
        resetTable();
        
        VallGym.mainMenu.panel_routine.routineList();
        VallGym.mainMenu.panel_routine.pushupList();
        VallGym.mainMenu.panel_routine.curlupList();
        VallGym.mainMenu.panel_routine.joggingList();
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "routine_edit");
    }//GEN-LAST:event_user_edit_routinesActionPerformed

    private void user_edit_dietsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_dietsMouseEntered
        user_edit_diets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/diet_hover.png")));
    }//GEN-LAST:event_user_edit_dietsMouseEntered

    private void user_edit_dietsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_dietsMouseExited
        user_edit_diets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/diet.png")));
    }//GEN-LAST:event_user_edit_dietsMouseExited

    private void user_edit_dietsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_edit_dietsActionPerformed
        Music.sfx();
        
        reset();
        user_search_input.setText("");
        resetTable();
        
        VallGym.mainMenu.panel_diet.dietList();
        VallGym.mainMenu.panel_diet.breakfastList();
        VallGym.mainMenu.panel_diet.lunchList();
        VallGym.mainMenu.panel_diet.dinnerList();
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "diet_edit");
    }//GEN-LAST:event_user_edit_dietsActionPerformed

    private void user_edit_referralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_referralMouseEntered
        user_edit_referral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/referral_codes_hover.png")));
    }//GEN-LAST:event_user_edit_referralMouseEntered

    private void user_edit_referralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_referralMouseExited
        user_edit_referral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/referral_codes.png")));
    }//GEN-LAST:event_user_edit_referralMouseExited

    private void user_edit_referralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_edit_referralActionPerformed
        Music.sfx();
        
        reset();
        user_search_input.setText("");
        resetTable();
        
        VallGym.mainMenu.panel_ref.codeList();
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "ref_edit");
    }//GEN-LAST:event_user_edit_referralActionPerformed
    
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
                    user_routineJ.setText(ref7.getString("count") + "km jogging");
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
    
    public void resetTable() {
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
        try(java.sql.Connection search_conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement search_stmt = search_conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            java.sql.ResultSet search_ref = search_stmt.executeQuery("select * from member where member_id like '" 
                        + user_search_input.getText() + "' or concat(first_name, ' ', last_name) like '%" + user_search_input.getText() + "%';");

                while(search_ref.next()) {
                    tableModel.addRow(new Object[]{search_ref.getInt("member_id"), search_ref.getString("first_name") + " " + search_ref.getString("last_name")});
                }
            
            search_conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private void workoutList() {
        VallGym.mainMenu.panel_user.user_workout_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select name from workout;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                VallGym.mainMenu.panel_user.user_workout_input.addItem(workouts.getString("name"));
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void reset() {
        user_edit.setEnabled(false);
        user_delete.setEnabled(false);
        
        user_lastname.setText("SELECT");
        user_firstname.setText("A User");
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gradient_bg;
    private javax.swing.JLabel gradient_bg2;
    private javax.swing.JLabel search_bar;
    private javax.swing.JButton user_add;
    public javax.swing.JLabel user_breakfast;
    private javax.swing.JLabel user_breakfast2;
    public javax.swing.JLabel user_contact;
    private javax.swing.JLabel user_contact2;
    private javax.swing.JButton user_delete;
    public javax.swing.JLabel user_dinner;
    private javax.swing.JLabel user_dinner2;
    private javax.swing.JButton user_edit;
    private javax.swing.JButton user_edit_diets;
    private javax.swing.JButton user_edit_referral;
    private javax.swing.JButton user_edit_routines;
    private javax.swing.JButton user_edit_workouts;
    public javax.swing.JLabel user_email;
    private javax.swing.JLabel user_email2;
    public javax.swing.JLabel user_firstname;
    private javax.swing.JLabel user_icon;
    public javax.swing.JLabel user_lastname;
    public javax.swing.JLabel user_lunch;
    private javax.swing.JLabel user_lunch2;
    private javax.swing.JLabel user_routine2;
    public javax.swing.JLabel user_routineC;
    public javax.swing.JLabel user_routineJ;
    public javax.swing.JLabel user_routineP;
    public javax.swing.JLabel user_sched;
    private javax.swing.JLabel user_sched2;
    private javax.swing.JButton user_search;
    public javax.swing.JTextField user_search_input;
    private javax.swing.JTable user_table;
    public javax.swing.JScrollPane user_table_scroll;
    public javax.swing.JLabel user_workout;
    private javax.swing.JLabel user_workout2;
    // End of variables declaration//GEN-END:variables
}
