public class RoutineEdit extends javax.swing.JPanel {
    public javax.swing.table.DefaultTableModel tableModel;
    private int routine_id;
    private int pushup_id;
    private int curlup_id;
    private int jogging_id;
    
    public RoutineEdit() {
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
                        routine_edit.setEnabled(true);
                        routine_delete.setEnabled(true);
                        
                        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
                        workoutData(selected_ID);
                    } else {
                        routine_name_input.setText("");
                        routine_edit.setEnabled(false);
                        routine_delete.setEnabled(false);
                    }
                }
            }
        });
        setComboBoxProperties(routine_pushup_input);
        setComboBoxProperties(routine_curlup_input);
        setComboBoxProperties(routine_jogging_input);
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

        routine_modify_values = new javax.swing.JButton();
        user_table_scroll = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        routine_name_title = new javax.swing.JLabel();
        routine_name_input = new javax.swing.JTextField();
        routine_name_bg = new javax.swing.JLabel();
        routine_pushup_title = new javax.swing.JLabel();
        routine_pushup_input = new javax.swing.JComboBox<>();
        routine_pushup_bg = new javax.swing.JLabel();
        routine_curlup_title = new javax.swing.JLabel();
        routine_curlup_input = new javax.swing.JComboBox<>();
        routine_curlup_bg = new javax.swing.JLabel();
        routine_jogging_title = new javax.swing.JLabel();
        routine_jogging_input = new javax.swing.JComboBox<>();
        routine_jogging_bg = new javax.swing.JLabel();
        routine_edit = new javax.swing.JButton();
        routine_save = new javax.swing.JButton();
        routine_delete = new javax.swing.JButton();
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

        routine_modify_values.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/values.png"))); // NOI18N
        routine_modify_values.setBorder(null);
        routine_modify_values.setBorderPainted(false);
        routine_modify_values.setContentAreaFilled(false);
        routine_modify_values.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        routine_modify_values.setFocusPainted(false);
        routine_modify_values.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                routine_modify_valuesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                routine_modify_valuesMouseExited(evt);
            }
        });
        routine_modify_values.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routine_modify_valuesActionPerformed(evt);
            }
        });
        add(routine_modify_values);
        routine_modify_values.setBounds(90, 400, 170, 50);

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

        routine_name_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        routine_name_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        routine_name_title.setText("Routine Name");
        routine_name_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(routine_name_title);
        routine_name_title.setBounds(40, 110, 270, 20);

        routine_name_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        routine_name_input.setBorder(null);
        routine_name_input.setOpaque(false);
        add(routine_name_input);
        routine_name_input.setBounds(60, 130, 230, 40);

        routine_name_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        routine_name_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        routine_name_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(routine_name_bg);
        routine_name_bg.setBounds(40, 130, 270, 40);

        routine_pushup_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        routine_pushup_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        routine_pushup_title.setText("Push-ups (by count)");
        routine_pushup_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(routine_pushup_title);
        routine_pushup_title.setBounds(40, 200, 270, 20);

        routine_pushup_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        routine_pushup_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        routine_pushup_input.setBorder(null);
        routine_pushup_input.setFocusable(false);
        routine_pushup_input.setOpaque(false);
        add(routine_pushup_input);
        routine_pushup_input.setBounds(60, 230, 230, 20);

        routine_pushup_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        routine_pushup_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        routine_pushup_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(routine_pushup_bg);
        routine_pushup_bg.setBounds(40, 220, 270, 40);

        routine_curlup_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        routine_curlup_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        routine_curlup_title.setText("Curl-ups (by count)");
        routine_curlup_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(routine_curlup_title);
        routine_curlup_title.setBounds(40, 260, 270, 20);

        routine_curlup_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        routine_curlup_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        routine_curlup_input.setBorder(null);
        routine_curlup_input.setFocusable(false);
        routine_curlup_input.setOpaque(false);
        add(routine_curlup_input);
        routine_curlup_input.setBounds(60, 290, 230, 20);

        routine_curlup_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        routine_curlup_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        routine_curlup_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(routine_curlup_bg);
        routine_curlup_bg.setBounds(40, 280, 270, 40);

        routine_jogging_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        routine_jogging_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        routine_jogging_title.setText("Jogs (by km)");
        routine_jogging_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(routine_jogging_title);
        routine_jogging_title.setBounds(40, 320, 270, 20);

        routine_jogging_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        routine_jogging_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        routine_jogging_input.setBorder(null);
        routine_jogging_input.setFocusable(false);
        routine_jogging_input.setOpaque(false);
        add(routine_jogging_input);
        routine_jogging_input.setBounds(60, 350, 230, 20);

        routine_jogging_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        routine_jogging_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        routine_jogging_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(routine_jogging_bg);
        routine_jogging_bg.setBounds(40, 340, 270, 40);

        routine_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        routine_edit.setBorder(null);
        routine_edit.setBorderPainted(false);
        routine_edit.setContentAreaFilled(false);
        routine_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        routine_edit.setEnabled(false);
        routine_edit.setFocusPainted(false);
        routine_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                routine_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                routine_editMouseExited(evt);
            }
        });
        routine_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routine_editActionPerformed(evt);
            }
        });
        add(routine_edit);
        routine_edit.setBounds(770, 470, 50, 31);

        routine_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        routine_save.setBorder(null);
        routine_save.setBorderPainted(false);
        routine_save.setContentAreaFilled(false);
        routine_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        routine_save.setFocusPainted(false);
        routine_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                routine_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                routine_saveMouseExited(evt);
            }
        });
        routine_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routine_saveActionPerformed(evt);
            }
        });
        add(routine_save);
        routine_save.setBounds(830, 470, 50, 31);

        routine_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        routine_delete.setBorder(null);
        routine_delete.setBorderPainted(false);
        routine_delete.setContentAreaFilled(false);
        routine_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        routine_delete.setEnabled(false);
        routine_delete.setFocusPainted(false);
        routine_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                routine_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                routine_deleteMouseExited(evt);
            }
        });
        routine_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routine_deleteActionPerformed(evt);
            }
        });
        add(routine_delete);
        routine_delete.setBounds(890, 470, 50, 31);

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
        user_breakfast.setForeground(new java.awt.Color(153, 153, 153));
        user_breakfast.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_breakfast.setText("Sample food");
        add(user_breakfast);
        user_breakfast.setBounds(800, 390, 180, 20);

        user_lunch.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_lunch.setForeground(new java.awt.Color(153, 153, 153));
        user_lunch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_lunch.setText("Sample food");
        add(user_lunch);
        user_lunch.setBounds(800, 410, 190, 20);

        user_dinner.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        user_dinner.setForeground(new java.awt.Color(153, 153, 153));
        user_dinner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_dinner.setText("Sample food");
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
        workout_edit_title.setText("Edit Routine Plan");
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

    private void routine_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routine_saveMouseEntered
        routine_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_routine_saveMouseEntered

    private void routine_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routine_saveMouseExited
        routine_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_routine_saveMouseExited

    private void routine_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routine_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into routine(name) values ('" + routine_name_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);
            java.sql.ResultSet new_wID = stmt.executeQuery("select last_insert_id();");
                if(new_wID.next()) {
                    routine_id = new_wID.getInt("last_insert_id()");
                }
            java.sql.ResultSet new_rID = stmt.executeQuery("select pushup_id from push_ups where count = '" +  String.valueOf(routine_pushup_input.getSelectedItem()) + "';");
                if(new_rID.next()) {
                    pushup_id = new_rID.getInt("pushup_id");
                }
            java.sql.ResultSet new_sID = stmt.executeQuery("select curlup_id from curl_ups where count = '" +  String.valueOf(routine_curlup_input.getSelectedItem()) + "';");
                if(new_sID.next()) {
                    curlup_id = new_sID.getInt("curlup_id");
                }
            java.sql.ResultSet new_dID = stmt.executeQuery("select jogging_id from jogging where count = '" +  String.valueOf(routine_jogging_input.getSelectedItem()) + "';");
                if(new_dID.next()) {
                    jogging_id = new_dID.getInt("jogging_id");
                }

            String routine_pushups = "insert into routine_pushups(routine_id, pushup_id) values ('" + routine_id + "', '" + pushup_id + "');";
            stmt.executeUpdate(routine_pushups);
            String routine_curlups = "insert into routine_curlups(routine_id, curlup_id) values ('" + routine_id + "', '" + curlup_id + "');";
            stmt.executeUpdate(routine_curlups);
            String routine_jogging = "insert into routine_jogging(routine_id, jogging_id) values ('" + routine_id + "', '" + jogging_id + "');";
            stmt.executeUpdate(routine_jogging);

            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            workoutData(routine_id);
            routineList();
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_routine_saveActionPerformed

    private void routine_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routine_deleteMouseEntered
        routine_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_routine_deleteMouseEntered

    private void routine_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routine_deleteMouseExited
        routine_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_routine_deleteMouseExited

    private void routine_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routine_deleteActionPerformed
        Music.sfx();
        
        int selectedRow = user_table.getSelectedRow();
        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete0 = "delete from workout_routine where routine_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete0);
            
            String query_delete1 = "delete from routine_pushups where routine_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete1);
            
            String query_delete2 = "delete from routine_curlups where routine_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete2);
            
            String query_delete3 = "delete from routine_jogging where routine_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete3);
            
            String query_delete4 = "delete from routine where routine_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete4);
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            routineList();
            
            routine_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_routine_deleteActionPerformed

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

    private void routine_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routine_editMouseEntered
        routine_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_routine_editMouseEntered

    private void routine_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routine_editMouseExited
        routine_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_routine_editMouseExited

    private void routine_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routine_editActionPerformed
        Music.sfx();
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            int selectedRow = user_table.getSelectedRow();
            routine_id = (int)user_table.getValueAt(selectedRow, 0);

            String query_routine = "update routine set name = '" + routine_name_input.getText() + "' where routine_id = " + routine_id + ";";
            stmt.executeUpdate(query_routine);

            java.sql.ResultSet ref = stmt.executeQuery("select pushup_id from push_ups where count = '" + String.valueOf(routine_pushup_input.getSelectedItem()) + "';");
            if(ref.next()) {
                pushup_id = ref.getInt("pushup_id");
            }
            java.sql.ResultSet ref2 = stmt.executeQuery("select curlup_id from curl_ups where count = '" + String.valueOf(routine_curlup_input.getSelectedItem()) + "';");
            if(ref2.next()) {
                curlup_id = ref2.getInt("curlup_id");
            }
            java.sql.ResultSet ref3 = stmt.executeQuery("select jogging_id from jogging where count = '" + String.valueOf(routine_jogging_input.getSelectedItem()) + "';");
            if(ref3.next()) {
                jogging_id = ref3.getInt("jogging_id");
            }
            
            System.out.println(pushup_id);
            System.out.println(curlup_id);
            System.out.println(jogging_id);

            String routine_pushups = "update routine_pushups set pushup_id = " + pushup_id + " where routine_id = " + routine_id + ";";
            int rp = stmt.executeUpdate(routine_pushups);
            if(rp == 0) {
                String routine_pushups2 = "insert into routine_pushups(routine_id, pushup_id) values ('" + routine_id + "', '" + pushup_id + "');";
                stmt.executeUpdate(routine_pushups);
            }
            String routine_curlups = "update routine_curlups set curlup_id = " + curlup_id + " where routine_id = " + routine_id + ";";
            int rc = stmt.executeUpdate(routine_curlups);
            if(rc == 0) {
                
                String routine_curlups2 = "insert into routine_curlups(routine_id, curlup_id) values ('" + routine_id + "', '" + curlup_id + "');";
                stmt.executeUpdate(routine_curlups);
            }
            String routine_jogging = "update routine_jogging set jogging_id = " + jogging_id + " where routine_id = " + routine_id + ";";
            int rj = stmt.executeUpdate(routine_jogging);
            if(rj == 0) {
                String routine_jogging2 = "insert into routine_jogging(routine_id, jogging_id) values ('" + routine_id + "', '" + jogging_id + "');";
                stmt.executeUpdate(routine_jogging);
            }
                
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            workoutData(routine_id);
            routineList();

            routine_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_routine_editActionPerformed

    private void routine_modify_valuesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routine_modify_valuesMouseEntered
        routine_modify_values.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/values_hover.png")));
    }//GEN-LAST:event_routine_modify_valuesMouseEntered

    private void routine_modify_valuesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routine_modify_valuesMouseExited
        routine_modify_values.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/values.png")));
    }//GEN-LAST:event_routine_modify_valuesMouseExited

    private void routine_modify_valuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routine_modify_valuesActionPerformed
        Music.sfx();
        reset();
        routineList();
        pushupList();
        curlupList();
        joggingList();
        
        VallGym.mainMenu.panel_exer.pushupList();
        VallGym.mainMenu.panel_exer.curlupList();
        VallGym.mainMenu.panel_exer.joggingList();
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "exer_edit");
    }//GEN-LAST:event_routine_modify_valuesActionPerformed
    
    public void routineList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from routine;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel.addRow(new Object[]{workouts.getInt("routine_id"), workouts.getString("name")});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void pushupList() {
        routine_pushup_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select count from push_ups;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                routine_pushup_input.addItem(workouts.getString("count"));
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void curlupList() {
        routine_curlup_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select count from curl_ups;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                routine_curlup_input.addItem(workouts.getString("count"));
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void joggingList() {
        routine_jogging_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select count from jogging;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                routine_jogging_input.addItem(workouts.getString("count"));
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

            // ROUTINE
            java.sql.ResultSet ref4 = stmt.executeQuery("select name from routine where routine_id = '" + selected_ID + "';" );
            if(ref4.next()) {
                routine_name_input.setText(ref4.getString("name"));
            }
                // PUSH-UPS
                java.sql.ResultSet ref5 = stmt.executeQuery("select RP.routine_id, RP.pushup_id, RPp.count\n" +
                                                            "from routine_pushups RP\n" +
                                                            "join routine RPr on RP.routine_id = RPr.routine_id\n" +
                                                            "join push_ups RPp on RP.pushup_id = RPp.pushup_id\n" +
                                                            "where RP.routine_id = '" + selected_ID + "';" );
                if(ref5.next()) {
                    int index = -1;
                    for (int i = 0; i < routine_pushup_input.getItemCount(); i++) {
                        String currentItem = routine_pushup_input.getItemAt(i);
                        if (currentItem != null && currentItem.equals(ref5.getString("count"))) {
                            index = i;
                            break;
                        }
                    }
                    if(index != -1) 
                        routine_pushup_input.setSelectedIndex(index);
                    
                    user_routineP.setText(ref5.getString("count") + "x push-ups");
                }
                // CURL-UPS
                java.sql.ResultSet ref6 = stmt.executeQuery("select RC.routine_id, RC.curlup_id, RCc.count\n" +
                                                            "from routine_curlups RC\n" +
                                                            "join routine RCr on RC.routine_id = RCr.routine_id\n" +
                                                            "join curl_ups RCc on RC.curlup_id = RCc.curlup_id\n" +
                                                            "where RC.routine_id = '" + selected_ID + "';" );
                if(ref6.next()) {
                    int index = -1;
                    for (int i = 0; i < routine_curlup_input.getItemCount(); i++) {
                        String currentItem = routine_curlup_input.getItemAt(i);
                        if (currentItem != null && currentItem.equals(ref6.getString("count"))) {
                            index = i;
                            break;
                        }
                    }
                    if(index != -1) 
                        routine_curlup_input.setSelectedIndex(index);
                    
                    user_routineC.setText(ref6.getString("count") + "x curl-ups");
                }
                // JOGGING
                java.sql.ResultSet ref7 = stmt.executeQuery("select RJ.routine_id, RJ.jogging_id, RJj.count\n" +
                                                            "from routine_jogging RJ\n" +
                                                            "join routine RJr on RJ.routine_id = RJr.routine_id\n" +
                                                            "join jogging RJj on RJ.jogging_id = RJj.jogging_id\n" +
                                                            "where RJ.routine_id = '" + selected_ID + "';" );
                if(ref7.next()) {
                    int index = -1;
                    for (int i = 0; i < routine_jogging_input.getItemCount(); i++) {
                        String currentItem = routine_jogging_input.getItemAt(i);
                        if (currentItem != null && currentItem.equals(ref7.getString("count"))) {
                            index = i;
                            break;
                        }
                    }
                    if(index != -1) 
                        routine_jogging_input.setSelectedIndex(index);
                    
                    user_routineJ.setText(ref7.getString("count") + " km jogging");
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
        
        routine_edit.setEnabled(false);
        routine_delete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gradient_bg;
    private javax.swing.JLabel gradient_bg2;
    private javax.swing.JLabel routine_curlup_bg;
    public javax.swing.JComboBox<String> routine_curlup_input;
    private javax.swing.JLabel routine_curlup_title;
    public javax.swing.JButton routine_delete;
    public javax.swing.JButton routine_edit;
    private javax.swing.JLabel routine_jogging_bg;
    public javax.swing.JComboBox<String> routine_jogging_input;
    private javax.swing.JLabel routine_jogging_title;
    private javax.swing.JButton routine_modify_values;
    private javax.swing.JLabel routine_name_bg;
    public javax.swing.JTextField routine_name_input;
    private javax.swing.JLabel routine_name_title;
    private javax.swing.JLabel routine_pushup_bg;
    public javax.swing.JComboBox<String> routine_pushup_input;
    private javax.swing.JLabel routine_pushup_title;
    public javax.swing.JButton routine_save;
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
