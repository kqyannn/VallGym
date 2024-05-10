public class WorkoutEdit extends javax.swing.JPanel {
    public javax.swing.table.DefaultTableModel tableModel;
    private int workout_id;
    private int routine_id;
    private int sched_id;
    private int diet_id;
    
    public WorkoutEdit() {
        String[] columnNames = {"ID", "Name"};
        tableModel = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        initComponents();
        
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
                        workout_edit.setEnabled(true);
                        workout_delete.setEnabled(true);
                        
                        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
                        workoutData(selected_ID);
                    } else {
                        workout_name_input.setText("");
                        workout_edit.setEnabled(false);
                        workout_delete.setEnabled(false);
                    }
                }
            }
        });
        
        setComboBoxProperties(workout_routine_input);
        setComboBoxProperties(workout_sched_input);
        setComboBoxProperties(workout_diet_input);
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
        workout_name_title = new javax.swing.JLabel();
        workout_name_input = new javax.swing.JTextField();
        workout_name_bg = new javax.swing.JLabel();
        workout_routine_title = new javax.swing.JLabel();
        workout_routine_input = new javax.swing.JComboBox<>();
        workout_routine_bg = new javax.swing.JLabel();
        workout_diet_title = new javax.swing.JLabel();
        workout_diet_input = new javax.swing.JComboBox<>();
        workout_diet_bg = new javax.swing.JLabel();
        workout_sched_title = new javax.swing.JLabel();
        workout_sched_input = new javax.swing.JComboBox<>();
        workout_sched_bg = new javax.swing.JLabel();
        workout_edit = new javax.swing.JButton();
        workout_save = new javax.swing.JButton();
        workout_delete = new javax.swing.JButton();
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
        user_table_scroll.setBounds(50, 90, 590, 250);

        workout_name_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        workout_name_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        workout_name_title.setText("Workout Name");
        workout_name_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(workout_name_title);
        workout_name_title.setBounds(70, 360, 270, 20);

        workout_name_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        workout_name_input.setBorder(null);
        workout_name_input.setOpaque(false);
        add(workout_name_input);
        workout_name_input.setBounds(90, 380, 230, 40);

        workout_name_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workout_name_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        workout_name_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(workout_name_bg);
        workout_name_bg.setBounds(70, 380, 270, 40);

        workout_routine_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        workout_routine_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        workout_routine_title.setText("Routine");
        workout_routine_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(workout_routine_title);
        workout_routine_title.setBounds(350, 360, 270, 20);

        workout_routine_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        workout_routine_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        workout_routine_input.setBorder(null);
        workout_routine_input.setFocusable(false);
        workout_routine_input.setOpaque(false);
        add(workout_routine_input);
        workout_routine_input.setBounds(370, 390, 230, 20);

        workout_routine_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workout_routine_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        workout_routine_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(workout_routine_bg);
        workout_routine_bg.setBounds(350, 380, 270, 40);

        workout_diet_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        workout_diet_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        workout_diet_title.setText("Diet");
        workout_diet_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(workout_diet_title);
        workout_diet_title.setBounds(350, 420, 270, 20);

        workout_diet_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        workout_diet_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        workout_diet_input.setBorder(null);
        workout_diet_input.setFocusable(false);
        workout_diet_input.setOpaque(false);
        add(workout_diet_input);
        workout_diet_input.setBounds(370, 450, 230, 20);

        workout_diet_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workout_diet_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        workout_diet_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(workout_diet_bg);
        workout_diet_bg.setBounds(350, 440, 270, 40);

        workout_sched_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        workout_sched_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        workout_sched_title.setText("Schedule");
        workout_sched_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(workout_sched_title);
        workout_sched_title.setBounds(70, 420, 270, 20);

        workout_sched_input.setBackground(new java.awt.Color(0, 0, 0, 0));
        workout_sched_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        workout_sched_input.setBorder(null);
        workout_sched_input.setFocusable(false);
        workout_sched_input.setOpaque(false);
        add(workout_sched_input);
        workout_sched_input.setBounds(90, 450, 230, 20);

        workout_sched_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workout_sched_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_small.png"))); // NOI18N
        workout_sched_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(workout_sched_bg);
        workout_sched_bg.setBounds(70, 440, 270, 40);

        workout_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        workout_edit.setBorder(null);
        workout_edit.setBorderPainted(false);
        workout_edit.setContentAreaFilled(false);
        workout_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workout_edit.setEnabled(false);
        workout_edit.setFocusPainted(false);
        workout_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workout_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workout_editMouseExited(evt);
            }
        });
        workout_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workout_editActionPerformed(evt);
            }
        });
        add(workout_edit);
        workout_edit.setBounds(770, 470, 50, 31);

        workout_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        workout_save.setBorder(null);
        workout_save.setBorderPainted(false);
        workout_save.setContentAreaFilled(false);
        workout_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workout_save.setFocusPainted(false);
        workout_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workout_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workout_saveMouseExited(evt);
            }
        });
        workout_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workout_saveActionPerformed(evt);
            }
        });
        add(workout_save);
        workout_save.setBounds(830, 470, 50, 31);

        workout_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        workout_delete.setBorder(null);
        workout_delete.setBorderPainted(false);
        workout_delete.setContentAreaFilled(false);
        workout_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workout_delete.setEnabled(false);
        workout_delete.setFocusPainted(false);
        workout_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workout_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workout_deleteMouseExited(evt);
            }
        });
        workout_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workout_deleteActionPerformed(evt);
            }
        });
        add(workout_delete);
        workout_delete.setBounds(890, 470, 50, 31);

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

        workout_edit_title.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        workout_edit_title.setText("Edit Workout Plan");
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

    private void workout_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workout_saveMouseEntered
        workout_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_workout_saveMouseEntered

    private void workout_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workout_saveMouseExited
        workout_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_workout_saveMouseExited

    private void workout_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workout_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into workout(name) values ('" + workout_name_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);
            java.sql.ResultSet new_wID = stmt.executeQuery("select last_insert_id();");
                if(new_wID.next()) {
                    workout_id = new_wID.getInt("last_insert_id()");
                }
            java.sql.ResultSet new_rID = stmt.executeQuery("select routine_id from routine where name = '" +  String.valueOf(workout_routine_input.getSelectedItem()) + "';");
                if(new_rID.next()) {
                    routine_id = new_rID.getInt("routine_id");
                }
            java.sql.ResultSet new_sID = stmt.executeQuery("select sched_id from schedule where date = '" +  String.valueOf(workout_sched_input.getSelectedItem()) + "';");
                if(new_sID.next()) {
                    sched_id = new_sID.getInt("sched_id");
                }
            java.sql.ResultSet new_dID = stmt.executeQuery("select diet_id from diet where name = '" +  String.valueOf(workout_diet_input.getSelectedItem()) + "';");
                if(new_dID.next()) {
                    diet_id = new_dID.getInt("diet_id");
                }

            String workout_routine = "insert into workout_routine(workout_id, routine_id) values ('" + workout_id + "', '" + routine_id + "');";
            stmt.executeUpdate(workout_routine);
            String workout_schedule = "insert into workout_schedule(workout_id, sched_id) values ('" + workout_id + "', '" + sched_id + "');";
            stmt.executeUpdate(workout_schedule);
            String workout_diet = "insert into workout_diet(workout_id, diet_id) values ('" + workout_id + "', '" + diet_id + "');";
            stmt.executeUpdate(workout_diet);

            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            workoutData(workout_id);
            workoutList();
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_workout_saveActionPerformed

    private void workout_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workout_deleteMouseEntered
        workout_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_workout_deleteMouseEntered

    private void workout_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workout_deleteMouseExited
        workout_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_workout_deleteMouseExited

    private void workout_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workout_deleteActionPerformed
        Music.sfx();
        
        int selectedRow = user_table.getSelectedRow();
        int selected_ID = (int)user_table.getValueAt(selectedRow, 0);
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete1 = "delete from member_workout where workout_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete1);
            
            String query_delete2 = "delete from workout_routine where workout_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete2);
            
            String query_delete3 = "delete from workout_schedule where workout_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete3);
            
            String query_delete4 = "delete from workout_diet where workout_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete4);
            
            String query_delete = "delete from workout where workout_id = " + selected_ID + ";";
            stmt.executeUpdate(query_delete);
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            workoutList();
            
            workout_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_workout_deleteActionPerformed

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

    private void workout_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workout_editMouseEntered
        workout_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_workout_editMouseEntered

    private void workout_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workout_editMouseExited
        workout_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_workout_editMouseExited

    private void workout_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workout_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            int selectedRow = user_table.getSelectedRow();
            workout_id = (int)user_table.getValueAt(selectedRow, 0);

            String query_workout = "update workout set name = '" + workout_name_input.getText() + "' where workout_id = " + workout_id + ";";
                stmt.executeUpdate(query_workout);

            java.sql.ResultSet ref = stmt.executeQuery("select routine_id from routine where name = '" + String.valueOf(workout_routine_input.getSelectedItem()) + "';");
            if(ref.next()) {
                routine_id = ref.getInt("routine_id");
            }
            java.sql.ResultSet ref2 = stmt.executeQuery("select sched_id from schedule where date = '" + String.valueOf(workout_sched_input.getSelectedItem()) + "';");
            if(ref2.next()) {
                sched_id = ref2.getInt("sched_id");
            }
            java.sql.ResultSet ref3 = stmt.executeQuery("select diet_id from diet where name = '" + String.valueOf(workout_diet_input.getSelectedItem()) + "';");
            if(ref3.next()) {
                diet_id = ref3.getInt("diet_id");
            }

            String workout_routine = "update workout_routine set routine_id = " + routine_id + " where workout_id = " + workout_id + ";";
            int wr = stmt.executeUpdate(workout_routine);
            if(wr == 0) {
                String workout_routine2 = "insert into workout_routine(workout_id, routine_id) values ('" + workout_id + "', '" + routine_id + "');";
                stmt.executeUpdate(workout_routine);
            }
            
            String workout_schedule = "update workout_schedule set sched_id = " + sched_id + " where workout_id = " + workout_id + ";";
            int ws = stmt.executeUpdate(workout_schedule);
            if(ws == 0) {
                String workout_schedule2 = "insert into workout_schedule(workout_id, sched_id) values ('" + workout_id + "', '" + sched_id + "');";
                stmt.executeUpdate(workout_schedule);
            }
            String workout_diet = "update workout_diet set diet_id = " + diet_id + " where workout_id = " + workout_id + ";";
            int wd = stmt.executeUpdate(workout_diet);
            if(wd == 0) {
                String workout_diet2 = "insert into workout_diet(workout_id, diet_id) values ('" + workout_id + "', '" + diet_id + "');";
                stmt.executeUpdate(workout_diet);
            }

            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            workoutData(workout_id);
            workoutList();

            workout_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_workout_editActionPerformed
    
    public void workoutList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from workout;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel.addRow(new Object[]{workouts.getInt("workout_id"), workouts.getString("name")});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void routineList() {
        workout_routine_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select name from routine;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                workout_routine_input.addItem(workouts.getString("name"));
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void schedList() {
        workout_sched_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select date from schedule;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                workout_sched_input.addItem(workouts.getString("date"));
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void dietList() {
        workout_diet_input.removeAllItems();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select name from diet;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                workout_diet_input.addItem(workouts.getString("name"));
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

            // WORKOUT
            java.sql.ResultSet ref2 = stmt.executeQuery("select name from workout where workout_id = '" + selected_ID + "';" );
            if(ref2.next()) {
                user_workout.setText(ref2.getString("name"));
                workout_name_input.setText(ref2.getString("name"));
            }

            // SCHEDULE
            java.sql.ResultSet ref3 = stmt.executeQuery("select WS.workout_id, WS.sched_id, WSs.date\n" +
                                                        "from workout_schedule WS\n" +
                                                        "join workout WSw on WS.workout_id = WSw.workout_id\n" +
                                                        "join schedule WSs on WS.sched_id = WSs.sched_id\n" +
                                                        "where WS.workout_id = '" + selected_ID + "';" );
            if(ref3.next()) {
                int index = -1;
                for (int i = 0; i < workout_sched_input.getItemCount(); i++) {
                    String currentItem = workout_sched_input.getItemAt(i);
                    if (currentItem != null && currentItem.equals(ref3.getString("date"))) {
                        index = i;
                        break;
                    }
                }
                if(index != -1) 
                    workout_sched_input.setSelectedIndex(index);
                
                user_sched.setText(ref3.getString("date"));
            }

            // ROUTINE
            int user_routID = 0;
            java.sql.ResultSet ref4 = stmt.executeQuery("select WR.workout_id, WR.routine_id, WRr.name\n" +
                                                        "from workout_routine WR\n" +
                                                        "join workout WRw on WR.workout_id = WRw.workout_id\n" +
                                                        "join routine WRr on WR.routine_id = WRr.routine_id\n" +
                                                        "where WR.workout_id = '" + selected_ID + "';" );
            if(ref4.next()) {
                int index = -1;
                for (int i = 0; i < workout_routine_input.getItemCount(); i++) {
                    String currentItem = workout_routine_input.getItemAt(i);
                    if (currentItem != null && currentItem.equals(ref4.getString("name"))) {
                        index = i;
                        break;
                    }
                }
                if(index != -1) 
                    workout_routine_input.setSelectedIndex(index);
                
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
                                                        "where WD.workout_id = '" + selected_ID + "';" );
            if(ref8.next()) {
                int index = -1;
                for (int i = 0; i < workout_diet_input.getItemCount(); i++) {
                    String currentItem = workout_diet_input.getItemAt(i);
                    if (currentItem != null && currentItem.equals(ref8.getString("name"))) {
                        index = i;
                        break;
                    }
                }
                if(index != -1) 
                    workout_diet_input.setSelectedIndex(index);
                
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
        
        workout_edit.setEnabled(false);
        workout_delete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    public javax.swing.JButton workout_delete;
    private javax.swing.JLabel workout_diet_bg;
    public javax.swing.JComboBox<String> workout_diet_input;
    private javax.swing.JLabel workout_diet_title;
    public javax.swing.JButton workout_edit;
    public javax.swing.JLabel workout_edit_title;
    private javax.swing.JLabel workout_name_bg;
    public javax.swing.JTextField workout_name_input;
    private javax.swing.JLabel workout_name_title;
    private javax.swing.JLabel workout_routine_bg;
    public javax.swing.JComboBox<String> workout_routine_input;
    private javax.swing.JLabel workout_routine_title;
    public javax.swing.JButton workout_save;
    private javax.swing.JLabel workout_sched_bg;
    public javax.swing.JComboBox<String> workout_sched_input;
    private javax.swing.JLabel workout_sched_title;
    // End of variables declaration//GEN-END:variables
}
