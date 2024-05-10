public class DietEdit extends javax.swing.JPanel {
    public javax.swing.table.DefaultTableModel tableModel;
    private int diet_id;
    private int bf_id;
    private int lunch_id;
    private int dinner_id;
    
    public DietEdit() {
        String[] columnNames = {"ID", "Name"};
        tableModel = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        initComponents();
        
        user_table.getColumnModel().getColumn(0).setPreferredWidth(50);
        user_table.getColumnModel().getColumn(1).setPreferredWidth(240);
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
                        diet_edit.setEnabled(true);
                        diet_delete.setEnabled(true);
                        
                        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
                        workoutData(selected_ID);
                    } else {
                        diet_name_input.setText("");
                        diet_edit.setEnabled(false);
                        diet_delete.setEnabled(false);
                    }
                }
            }
        });
        
        setComboBoxProperties(diet_breakfast_input);
        setComboBoxProperties(diet_lunch_input);
        setComboBoxProperties(diet_dinner_input);
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

        diet_modify_meals = new javax.swing.JButton();
        user_table_scroll = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        diet_name_title = new javax.swing.JLabel();
        diet_name_input = new javax.swing.JTextField();
        diet_name_bg = new javax.swing.JLabel();
        diet_breakfast_title = new javax.swing.JLabel();
        diet_breakfast_input = new javax.swing.JComboBox<>();
        diet_breakfast_bg = new javax.swing.JLabel();
        diet_lunch_title = new javax.swing.JLabel();
        diet_lunch_input = new javax.swing.JComboBox<>();
        diet_lunch_bg = new javax.swing.JLabel();
        diet_dinner_title = new javax.swing.JLabel();
        diet_dinner_input = new javax.swing.JComboBox<>();
        diet_dinner_bg = new javax.swing.JLabel();
        diet_edit = new javax.swing.JButton();
        diet_save = new javax.swing.JButton();
        diet_delete = new javax.swing.JButton();
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

        diet_modify_meals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/meals.png"))); // NOI18N
        diet_modify_meals.setBorder(null);
        diet_modify_meals.setBorderPainted(false);
        diet_modify_meals.setContentAreaFilled(false);
        diet_modify_meals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diet_modify_meals.setFocusPainted(false);
        diet_modify_meals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diet_modify_mealsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diet_modify_mealsMouseExited(evt);
            }
        });
        diet_modify_meals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diet_modify_mealsActionPerformed(evt);
            }
        });
        add(diet_modify_meals);
        diet_modify_meals.setBounds(90, 400, 170, 50);

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
        user_table_scroll.setBounds(340, 90, 310, 400);

        diet_name_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        diet_name_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        diet_name_title.setText("Diet Name");
        diet_name_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(diet_name_title);
        diet_name_title.setBounds(40, 110, 270, 20);

        diet_name_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        diet_name_input.setBorder(null);
        diet_name_input.setOpaque(false);
        add(diet_name_input);
        diet_name_input.setBounds(60, 130, 230, 40);

        diet_name_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diet_name_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        diet_name_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(diet_name_bg);
        diet_name_bg.setBounds(40, 130, 270, 40);

        diet_breakfast_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        diet_breakfast_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        diet_breakfast_title.setText("Breakfast");
        diet_breakfast_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(diet_breakfast_title);
        diet_breakfast_title.setBounds(40, 200, 270, 20);

        diet_breakfast_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        diet_breakfast_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        diet_breakfast_input.setBorder(null);
        diet_breakfast_input.setFocusable(false);
        diet_breakfast_input.setOpaque(false);
        add(diet_breakfast_input);
        diet_breakfast_input.setBounds(60, 230, 230, 20);

        diet_breakfast_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diet_breakfast_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        diet_breakfast_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(diet_breakfast_bg);
        diet_breakfast_bg.setBounds(40, 220, 270, 40);

        diet_lunch_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        diet_lunch_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        diet_lunch_title.setText("Lunch");
        diet_lunch_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(diet_lunch_title);
        diet_lunch_title.setBounds(40, 260, 270, 20);

        diet_lunch_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        diet_lunch_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        diet_lunch_input.setBorder(null);
        diet_lunch_input.setFocusable(false);
        diet_lunch_input.setOpaque(false);
        add(diet_lunch_input);
        diet_lunch_input.setBounds(60, 290, 230, 20);

        diet_lunch_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diet_lunch_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        diet_lunch_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(diet_lunch_bg);
        diet_lunch_bg.setBounds(40, 280, 270, 40);

        diet_dinner_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        diet_dinner_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        diet_dinner_title.setText("Dinner");
        diet_dinner_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(diet_dinner_title);
        diet_dinner_title.setBounds(40, 320, 270, 20);

        diet_dinner_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        diet_dinner_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        diet_dinner_input.setBorder(null);
        diet_dinner_input.setFocusable(false);
        diet_dinner_input.setOpaque(false);
        add(diet_dinner_input);
        diet_dinner_input.setBounds(60, 350, 230, 20);

        diet_dinner_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diet_dinner_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        diet_dinner_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(diet_dinner_bg);
        diet_dinner_bg.setBounds(40, 340, 270, 40);

        diet_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        diet_edit.setBorder(null);
        diet_edit.setBorderPainted(false);
        diet_edit.setContentAreaFilled(false);
        diet_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diet_edit.setEnabled(false);
        diet_edit.setFocusPainted(false);
        diet_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diet_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diet_editMouseExited(evt);
            }
        });
        diet_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diet_editActionPerformed(evt);
            }
        });
        add(diet_edit);
        diet_edit.setBounds(770, 470, 50, 31);

        diet_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        diet_save.setBorder(null);
        diet_save.setBorderPainted(false);
        diet_save.setContentAreaFilled(false);
        diet_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diet_save.setFocusPainted(false);
        diet_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diet_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diet_saveMouseExited(evt);
            }
        });
        diet_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diet_saveActionPerformed(evt);
            }
        });
        add(diet_save);
        diet_save.setBounds(830, 470, 50, 31);

        diet_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        diet_delete.setBorder(null);
        diet_delete.setBorderPainted(false);
        diet_delete.setContentAreaFilled(false);
        diet_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diet_delete.setEnabled(false);
        diet_delete.setFocusPainted(false);
        diet_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diet_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diet_deleteMouseExited(evt);
            }
        });
        diet_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diet_deleteActionPerformed(evt);
            }
        });
        add(diet_delete);
        diet_delete.setBounds(890, 470, 50, 31);

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
        user_workout.setText("Sample workout");
        add(user_workout);
        user_workout.setBounds(800, 290, 180, 20);

        user_sched.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_sched.setForeground(new java.awt.Color(153, 153, 153));
        user_sched.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_sched.setText("Sample date");
        add(user_sched);
        user_sched.setBounds(800, 310, 180, 20);

        user_routineP.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineP.setForeground(new java.awt.Color(153, 153, 153));
        user_routineP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineP.setText("0x push-ups");
        add(user_routineP);
        user_routineP.setBounds(800, 330, 180, 20);

        user_routineC.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineC.setForeground(new java.awt.Color(153, 153, 153));
        user_routineC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineC.setText("0x curl-ups");
        add(user_routineC);
        user_routineC.setBounds(800, 350, 180, 20);

        user_routineJ.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_routineJ.setForeground(new java.awt.Color(153, 153, 153));
        user_routineJ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_routineJ.setText("0 km jogging");
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

        workout_edit_title.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        workout_edit_title.setText("Edit Diet Plan");
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

    private void diet_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diet_saveMouseEntered
        diet_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_diet_saveMouseEntered

    private void diet_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diet_saveMouseExited
        diet_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_diet_saveMouseExited

    private void diet_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diet_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into diet(name) values ('" + diet_name_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);
            java.sql.ResultSet new_wID = stmt.executeQuery("select last_insert_id();");
                if(new_wID.next()) {
                    diet_id = new_wID.getInt("last_insert_id()");
                }
            java.sql.ResultSet new_rID = stmt.executeQuery("select bf_id from breakfast where name = '" +  String.valueOf(diet_breakfast_input.getSelectedItem()) + "';");
                if(new_rID.next()) {
                    bf_id = new_rID.getInt("bf_id");
                }
            java.sql.ResultSet new_sID = stmt.executeQuery("select lunch_id from lunch where name = '" +  String.valueOf(diet_lunch_input.getSelectedItem()) + "';");
                if(new_sID.next()) {
                    lunch_id = new_sID.getInt("lunch_id");
                }
            java.sql.ResultSet new_dID = stmt.executeQuery("select dinner_id from dinner where name = '" +  String.valueOf(diet_dinner_input.getSelectedItem()) + "';");
                if(new_dID.next()) {
                    dinner_id = new_dID.getInt("dinner_id");
                }

            String diet_breakfast = "insert into diet_breakfast(diet_id, bf_id) values ('" + diet_id + "', '" + bf_id + "');";
            stmt.executeUpdate(diet_breakfast);
            String diet_lunch = "insert into diet_lunch(diet_id, lunch_id) values ('" + diet_id + "', '" + lunch_id + "');";
            stmt.executeUpdate(diet_lunch);
            String diet_dinner = "insert into diet_dinner(diet_id, dinner_id) values ('" + diet_id + "', '" + dinner_id + "');";
            stmt.executeUpdate(diet_dinner);

            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            
            workoutData(diet_id);
            dietList();
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diet_saveActionPerformed

    private void diet_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diet_deleteMouseEntered
        diet_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_diet_deleteMouseEntered

    private void diet_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diet_deleteMouseExited
        diet_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_diet_deleteMouseExited

    private void diet_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diet_deleteActionPerformed
        Music.sfx();
        
        int selectedRow = user_table.getSelectedRow();
        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete0 = "delete from workout_diet where diet_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete0);
            
            String query_delete1 = "delete from diet_breakfast where diet_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete1);
            
            String query_delete2 = "delete from diet_lunch where diet_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete2);
            
            String query_delete3 = "delete from diet_dinner where diet_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete3);
            
            String query_delete4 = "delete from diet where diet_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete4);
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            dietList();
            
            diet_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diet_deleteActionPerformed

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

    private void diet_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diet_editMouseEntered
        diet_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_diet_editMouseEntered

    private void diet_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diet_editMouseExited
        diet_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_diet_editMouseExited

    private void diet_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diet_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            int selectedRow = user_table.getSelectedRow();
            diet_id = (int)user_table.getValueAt(selectedRow, 0);

            String query_diet = "update diet set name = '" + diet_name_input.getText() + "' where diet_id = " + diet_id + ";";
            stmt.executeUpdate(query_diet);

            java.sql.ResultSet ref = stmt.executeQuery("select bf_id from breakfast where name = '" + String.valueOf(diet_breakfast_input.getSelectedItem()) + "';");
            if(ref.next()) {
                bf_id = ref.getInt("bf_id");
            }
            java.sql.ResultSet ref2 = stmt.executeQuery("select lunch_id from lunch where name = '" + String.valueOf(diet_lunch_input.getSelectedItem()) + "';");
            if(ref2.next()) {
                lunch_id = ref2.getInt("lunch_id");
            }
            java.sql.ResultSet ref3 = stmt.executeQuery("select dinner_id from dinner where name = '" + String.valueOf(diet_dinner_input.getSelectedItem()) + "';");
            if(ref3.next()) {
                dinner_id = ref3.getInt("dinner_id");
            }
            
            String diet_breakfast = "update diet_breakfast set bf_id = " + bf_id + " where diet_id = " + diet_id + ";";
            int db = stmt.executeUpdate(diet_breakfast);
            if(db == 0) {
                String diet_breakfast2 = "insert into diet_breakfast(diet_id, bf_id) values ('" + diet_id + "', '" + bf_id + "');";
                stmt.executeUpdate(diet_breakfast);
            }
            String diet_lunch = "update diet_lunch set lunch_id = " + lunch_id + " where diet_id = " + diet_id + ";";
            int dl = stmt.executeUpdate(diet_lunch);
            if(dl == 0) {
                
                String diet_lunch2 = "insert into diet_lunch(diet_id, lunch_id) values ('" + diet_id + "', '" + lunch_id + "');";
                stmt.executeUpdate(diet_lunch);
            }
            String diet_dinner = "update diet_dinner set dinner_id = " + dinner_id + " where diet_id = " + diet_id + ";";
            int dd = stmt.executeUpdate(diet_dinner);
            if(dd == 0) {
                
                String diet_dinner2 = "insert into diet_dinner(diet_id, dinner_id) values ('" + diet_id + "', '" + dinner_id + "');";
                stmt.executeUpdate(diet_dinner);
            }

            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            workoutData(diet_id);
            dietList();

            diet_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diet_editActionPerformed

    private void diet_modify_mealsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diet_modify_mealsMouseEntered
        diet_modify_meals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/meals_hover.png")));
    }//GEN-LAST:event_diet_modify_mealsMouseEntered

    private void diet_modify_mealsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diet_modify_mealsMouseExited
        diet_modify_meals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/meals.png")));
    }//GEN-LAST:event_diet_modify_mealsMouseExited

    private void diet_modify_mealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diet_modify_mealsActionPerformed
        Music.sfx();
        reset();
        dietList();
        breakfastList();
        lunchList();
        dinnerList();
        
        VallGym.mainMenu.panel_meal.breakfastList();
        VallGym.mainMenu.panel_meal.lunchList();
        VallGym.mainMenu.panel_meal.dinnerList();
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "meal_edit");
    }//GEN-LAST:event_diet_modify_mealsActionPerformed
    
    public void dietList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from diet;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel.addRow(new Object[]{workouts.getInt("diet_id"), workouts.getString("name")});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void breakfastList() {
        diet_breakfast_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select name from breakfast;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                diet_breakfast_input.addItem(workouts.getString("name"));
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void lunchList() {
        diet_lunch_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select name from lunch;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                diet_lunch_input.addItem(workouts.getString("name"));
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void dinnerList() {
        diet_dinner_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select name from dinner;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                diet_dinner_input.addItem(workouts.getString("name"));
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void workoutData(int selected_ID) {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // DIET
            int user_dietID = 0;
            java.sql.ResultSet ref8 = stmt.executeQuery("select name from diet where diet_id = '" + selected_ID + "';"  );
            if(ref8.next()) {
                diet_name_input.setText(ref8.getString("name"));
            }
                // BREAKFAST
                java.sql.ResultSet ref9 = stmt.executeQuery("select DB.diet_id, DB.bf_id, DBb.name\n" +
                                                            "from diet_breakfast DB\n" +
                                                            "join diet DBd on DB.diet_id = DBd.diet_id\n" +
                                                            "join breakfast DBb on DB.bf_id = DBb.bf_id\n" +
                                                            "where DB.diet_id = '" + selected_ID + "';" );
                if(ref9.next()) {
                    int index = -1;
                    for (int i = 0; i < diet_breakfast_input.getItemCount(); i++) {
                        String currentItem = diet_breakfast_input.getItemAt(i);
                        if (currentItem != null && currentItem.equals(ref9.getString("name"))) {
                            index = i;
                            break;
                        }
                    }
                    if(index != -1) 
                        diet_breakfast_input.setSelectedIndex(index);
                    
                    user_breakfast.setText(ref9.getString("name"));
                }
                // LUNCH
                java.sql.ResultSet ref10 = stmt.executeQuery("select DL.diet_id, DL.lunch_id, DLl.name\n" +
                                                            "from diet_lunch DL\n" +
                                                            "join diet DLd on DL.diet_id = DLd.diet_id\n" +
                                                            "join lunch DLl on DL.lunch_id = DLl.lunch_id\n" +
                                                            "where DL.diet_id = '" + selected_ID + "';" );
                if(ref10.next()) {
                    int index = -1;
                    for (int i = 0; i < diet_lunch_input.getItemCount(); i++) {
                        String currentItem = diet_lunch_input.getItemAt(i);
                        if (currentItem != null && currentItem.equals(ref10.getString("name"))) {
                            index = i;
                            break;
                        }
                    }
                    if(index != -1) 
                        diet_lunch_input.setSelectedIndex(index);
                    
                    user_lunch.setText(ref10.getString("name"));
                }
                // DINNER
                java.sql.ResultSet ref11 = stmt.executeQuery("select DD.diet_id, DD.dinner_id, DDdd.name\n" +
                                                            "from diet_dinner DD\n" +
                                                            "join diet DDd on DD.diet_id = DDd.diet_id\n" +
                                                            "join dinner DDdd on DD.dinner_id = DDdd.dinner_id\n" +
                                                            "where DD.diet_id = '" + selected_ID + "';" );
                if(ref11.next()) {
                    int index = -1;
                    for (int i = 0; i < diet_dinner_input.getItemCount(); i++) {
                        String currentItem = diet_dinner_input.getItemAt(i);
                        if (currentItem != null && currentItem.equals(ref11.getString("name"))) {
                            index = i;
                            break;
                        }
                    }
                    if(index != -1) 
                        diet_dinner_input.setSelectedIndex(index);
                    
                    user_dinner.setText(ref11.getString("name"));
                }
            conn.close();

        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private void setComboBoxProperties(javax.swing.JComboBox<?> comboBox) {
        comboBox.setUI(new javax.swing.plaf.basic.BasicComboBoxUI() {
            @Override
            public void installUI(javax.swing.JComponent comboBox) {
                super.installUI(comboBox);
                javax.swing.LookAndFeel.installProperty(comboBox, "opaque", Boolean.FALSE);
            }
        });

        comboBox.setRenderer(new javax.swing.DefaultListCellRenderer() {
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
    
    public void reset() {
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
        
        user_workout.setText("n/a");
        user_sched.setText("n/a");
        user_routineC.setText("n/a");
        user_routineJ.setText("n/a");
        user_routineP.setText("n/a");
        user_breakfast.setText("n/a");
        user_lunch.setText("n/a");
        user_dinner.setText("n/a");
        
        diet_edit.setEnabled(false);
        diet_delete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel diet_breakfast_bg;
    public javax.swing.JComboBox<String> diet_breakfast_input;
    private javax.swing.JLabel diet_breakfast_title;
    public javax.swing.JButton diet_delete;
    private javax.swing.JLabel diet_dinner_bg;
    public javax.swing.JComboBox<String> diet_dinner_input;
    private javax.swing.JLabel diet_dinner_title;
    public javax.swing.JButton diet_edit;
    private javax.swing.JLabel diet_lunch_bg;
    public javax.swing.JComboBox<String> diet_lunch_input;
    private javax.swing.JLabel diet_lunch_title;
    private javax.swing.JButton diet_modify_meals;
    private javax.swing.JLabel diet_name_bg;
    public javax.swing.JTextField diet_name_input;
    private javax.swing.JLabel diet_name_title;
    public javax.swing.JButton diet_save;
    private javax.swing.JLabel gradient_bg;
    private javax.swing.JLabel gradient_bg2;
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
