public class MealEdit extends javax.swing.JPanel {
    public javax.swing.table.DefaultTableModel tableModel;
    public javax.swing.table.DefaultTableModel tableModel2;
    public javax.swing.table.DefaultTableModel tableModel3;
    private int bf_id;
    private int lunch_id;
    private int dinner_id;
    
    public MealEdit() {
        
        // BREAKFAST TABLE
        String[] columnNames = {"ID", "Name"};
        tableModel = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableModel2 = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableModel3 = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        initComponents();
        
        // BREAKFAST TABLE
        breakfast_table.getColumnModel().getColumn(0).setPreferredWidth(25);
        breakfast_table.getColumnModel().getColumn(1).setPreferredWidth(240);
        breakfast_table.getColumnModel().getColumn(1).setCellRenderer(new PaddedRenderer());
        
        javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        breakfast_table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        javax.swing.ListSelectionModel selectionModel = breakfast_table.getSelectionModel();
        breakfast_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = breakfast_table.getSelectedRow();
                    if (selectedRow != -1) {
                        meal_breakfast_edit.setEnabled(true);
                        meal_breakfast_delete.setEnabled(true);
                        
                        int selected_ID = (int)breakfast_table.getValueAt(selectedRow, 0);
                        bf_id = selected_ID;
                        breakfastData();
                    } else {
                        meal_breakfast_input.setText("");
                        meal_breakfast_edit.setEnabled(false);
                        meal_breakfast_delete.setEnabled(false);
                    }
                }
            }
        });
        
        // LUNCH TABLE
        lunch_table.getColumnModel().getColumn(0).setPreferredWidth(25);
        lunch_table.getColumnModel().getColumn(1).setPreferredWidth(240);
        lunch_table.getColumnModel().getColumn(1).setCellRenderer(new PaddedRenderer());
        lunch_table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        javax.swing.ListSelectionModel selectionModel2 = lunch_table.getSelectionModel();
        lunch_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectionModel2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = lunch_table.getSelectedRow();
                    if (selectedRow != -1) {
                        meal_lunch_edit.setEnabled(true);
                        meal_lunch_delete.setEnabled(true);
                        
                        int selected_ID = (int)lunch_table.getValueAt(selectedRow, 0);
                        lunch_id = selected_ID;
                        lunchData();
                    } else {
                        meal_lunch_input.setText("");
                        meal_lunch_edit.setEnabled(false);
                        meal_lunch_delete.setEnabled(false);
                    }
                }
            }
        });
        
        // DINNER TABLE
        dinner_table.getColumnModel().getColumn(0).setPreferredWidth(25);
        dinner_table.getColumnModel().getColumn(1).setPreferredWidth(240);
        dinner_table.getColumnModel().getColumn(1).setCellRenderer(new PaddedRenderer());
        dinner_table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        javax.swing.ListSelectionModel selectionModel3 = dinner_table.getSelectionModel();
        dinner_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectionModel3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = dinner_table.getSelectedRow();
                    if (selectedRow != -1) {
                        meal_dinner_edit.setEnabled(true);
                        meal_dinner_delete.setEnabled(true);
                        
                        int selected_ID = (int)dinner_table.getValueAt(selectedRow, 0);
                        dinner_id = selected_ID;
                        dinnerData();
                    } else {
                        meal_dinner_input.setText("");
                        meal_dinner_edit.setEnabled(false);
                        meal_dinner_delete.setEnabled(false);
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

        user_table_scroll2 = new javax.swing.JScrollPane();
        breakfast_table = new javax.swing.JTable();
        user_table_scroll1 = new javax.swing.JScrollPane();
        lunch_table = new javax.swing.JTable();
        user_table_scroll = new javax.swing.JScrollPane();
        dinner_table = new javax.swing.JTable();
        meal_breakfast_title = new javax.swing.JLabel();
        meal_breakfast_input = new javax.swing.JTextField();
        meal_breakfast_bg = new javax.swing.JLabel();
        meal_breakfast_edit = new javax.swing.JButton();
        meal_breakfast_save = new javax.swing.JButton();
        meal_breakfast_delete = new javax.swing.JButton();
        meal_lunch_title = new javax.swing.JLabel();
        meal_lunch_input = new javax.swing.JTextField();
        meal_lunch_bg = new javax.swing.JLabel();
        meal_lunch_edit = new javax.swing.JButton();
        meal_lunch_save = new javax.swing.JButton();
        meal_lunch_delete = new javax.swing.JButton();
        meal_dinner_title = new javax.swing.JLabel();
        meal_dinner_input = new javax.swing.JTextField();
        meal_dinner_bg = new javax.swing.JLabel();
        meal_dinner_edit = new javax.swing.JButton();
        meal_dinner_save = new javax.swing.JButton();
        meal_dinner_delete = new javax.swing.JButton();
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

        user_table_scroll2.setBackground(new java.awt.Color(255, 255, 255));
        user_table_scroll2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        user_table_scroll2.setFocusable(false);
        user_table_scroll2.setOpaque(false);
        user_table_scroll2.setPreferredSize(new java.awt.Dimension(610, 350));
        user_table_scroll2.setRequestFocusEnabled(false);

        breakfast_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        breakfast_table.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        breakfast_table.setModel(tableModel);
        breakfast_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        breakfast_table.setFocusable(false);
        breakfast_table.setOpaque(false);
        breakfast_table.setRowHeight(30);
        breakfast_table.setShowGrid(false);
        breakfast_table.setTableHeader(null);
        user_table_scroll2.setViewportView(breakfast_table);

        add(user_table_scroll2);
        user_table_scroll2.setBounds(50, 90, 190, 280);

        user_table_scroll1.setBackground(new java.awt.Color(255, 255, 255));
        user_table_scroll1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        user_table_scroll1.setFocusable(false);
        user_table_scroll1.setOpaque(false);
        user_table_scroll1.setPreferredSize(new java.awt.Dimension(610, 350));
        user_table_scroll1.setRequestFocusEnabled(false);

        lunch_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        lunch_table.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lunch_table.setModel(tableModel2);
        lunch_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        lunch_table.setFocusable(false);
        lunch_table.setOpaque(false);
        lunch_table.setRowHeight(30);
        lunch_table.setShowGrid(false);
        lunch_table.setTableHeader(null);
        user_table_scroll1.setViewportView(lunch_table);

        add(user_table_scroll1);
        user_table_scroll1.setBounds(250, 90, 190, 280);

        user_table_scroll.setBackground(new java.awt.Color(255, 255, 255));
        user_table_scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        user_table_scroll.setFocusable(false);
        user_table_scroll.setOpaque(false);
        user_table_scroll.setPreferredSize(new java.awt.Dimension(610, 350));
        user_table_scroll.setRequestFocusEnabled(false);

        dinner_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        dinner_table.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        dinner_table.setModel(tableModel3);
        dinner_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        dinner_table.setFocusable(false);
        dinner_table.setOpaque(false);
        dinner_table.setRowHeight(30);
        dinner_table.setShowGrid(false);
        dinner_table.setTableHeader(null);
        user_table_scroll.setViewportView(dinner_table);

        add(user_table_scroll);
        user_table_scroll.setBounds(450, 90, 190, 280);

        meal_breakfast_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        meal_breakfast_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal_breakfast_title.setText("Breakfast");
        meal_breakfast_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(meal_breakfast_title);
        meal_breakfast_title.setBounds(50, 380, 190, 20);

        meal_breakfast_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        meal_breakfast_input.setBorder(null);
        meal_breakfast_input.setOpaque(false);
        add(meal_breakfast_input);
        meal_breakfast_input.setBounds(60, 400, 170, 40);

        meal_breakfast_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal_breakfast_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_tiny.png"))); // NOI18N
        meal_breakfast_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(meal_breakfast_bg);
        meal_breakfast_bg.setBounds(40, 400, 210, 40);

        meal_breakfast_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        meal_breakfast_edit.setBorder(null);
        meal_breakfast_edit.setBorderPainted(false);
        meal_breakfast_edit.setContentAreaFilled(false);
        meal_breakfast_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_breakfast_edit.setEnabled(false);
        meal_breakfast_edit.setFocusPainted(false);
        meal_breakfast_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_breakfast_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_breakfast_editMouseExited(evt);
            }
        });
        meal_breakfast_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_breakfast_editActionPerformed(evt);
            }
        });
        add(meal_breakfast_edit);
        meal_breakfast_edit.setBounds(70, 450, 50, 31);

        meal_breakfast_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        meal_breakfast_save.setBorder(null);
        meal_breakfast_save.setBorderPainted(false);
        meal_breakfast_save.setContentAreaFilled(false);
        meal_breakfast_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_breakfast_save.setFocusPainted(false);
        meal_breakfast_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_breakfast_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_breakfast_saveMouseExited(evt);
            }
        });
        meal_breakfast_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_breakfast_saveActionPerformed(evt);
            }
        });
        add(meal_breakfast_save);
        meal_breakfast_save.setBounds(120, 450, 50, 31);

        meal_breakfast_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        meal_breakfast_delete.setBorder(null);
        meal_breakfast_delete.setBorderPainted(false);
        meal_breakfast_delete.setContentAreaFilled(false);
        meal_breakfast_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_breakfast_delete.setEnabled(false);
        meal_breakfast_delete.setFocusPainted(false);
        meal_breakfast_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_breakfast_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_breakfast_deleteMouseExited(evt);
            }
        });
        meal_breakfast_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_breakfast_deleteActionPerformed(evt);
            }
        });
        add(meal_breakfast_delete);
        meal_breakfast_delete.setBounds(170, 450, 50, 31);

        meal_lunch_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        meal_lunch_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal_lunch_title.setText("Lunch");
        meal_lunch_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(meal_lunch_title);
        meal_lunch_title.setBounds(250, 380, 190, 20);

        meal_lunch_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        meal_lunch_input.setBorder(null);
        meal_lunch_input.setOpaque(false);
        add(meal_lunch_input);
        meal_lunch_input.setBounds(260, 400, 170, 40);

        meal_lunch_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal_lunch_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_tiny.png"))); // NOI18N
        meal_lunch_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(meal_lunch_bg);
        meal_lunch_bg.setBounds(240, 400, 210, 40);

        meal_lunch_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        meal_lunch_edit.setBorder(null);
        meal_lunch_edit.setBorderPainted(false);
        meal_lunch_edit.setContentAreaFilled(false);
        meal_lunch_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_lunch_edit.setEnabled(false);
        meal_lunch_edit.setFocusPainted(false);
        meal_lunch_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_lunch_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_lunch_editMouseExited(evt);
            }
        });
        meal_lunch_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_lunch_editActionPerformed(evt);
            }
        });
        add(meal_lunch_edit);
        meal_lunch_edit.setBounds(270, 450, 50, 31);

        meal_lunch_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        meal_lunch_save.setBorder(null);
        meal_lunch_save.setBorderPainted(false);
        meal_lunch_save.setContentAreaFilled(false);
        meal_lunch_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_lunch_save.setFocusPainted(false);
        meal_lunch_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_lunch_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_lunch_saveMouseExited(evt);
            }
        });
        meal_lunch_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_lunch_saveActionPerformed(evt);
            }
        });
        add(meal_lunch_save);
        meal_lunch_save.setBounds(320, 450, 50, 31);

        meal_lunch_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        meal_lunch_delete.setBorder(null);
        meal_lunch_delete.setBorderPainted(false);
        meal_lunch_delete.setContentAreaFilled(false);
        meal_lunch_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_lunch_delete.setEnabled(false);
        meal_lunch_delete.setFocusPainted(false);
        meal_lunch_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_lunch_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_lunch_deleteMouseExited(evt);
            }
        });
        meal_lunch_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_lunch_deleteActionPerformed(evt);
            }
        });
        add(meal_lunch_delete);
        meal_lunch_delete.setBounds(370, 450, 50, 31);

        meal_dinner_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        meal_dinner_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal_dinner_title.setText("Dinner");
        meal_dinner_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(meal_dinner_title);
        meal_dinner_title.setBounds(450, 380, 170, 20);

        meal_dinner_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        meal_dinner_input.setBorder(null);
        meal_dinner_input.setOpaque(false);
        add(meal_dinner_input);
        meal_dinner_input.setBounds(460, 400, 170, 40);

        meal_dinner_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal_dinner_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_tiny.png"))); // NOI18N
        meal_dinner_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(meal_dinner_bg);
        meal_dinner_bg.setBounds(440, 400, 210, 40);

        meal_dinner_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        meal_dinner_edit.setBorder(null);
        meal_dinner_edit.setBorderPainted(false);
        meal_dinner_edit.setContentAreaFilled(false);
        meal_dinner_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_dinner_edit.setEnabled(false);
        meal_dinner_edit.setFocusPainted(false);
        meal_dinner_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_dinner_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_dinner_editMouseExited(evt);
            }
        });
        meal_dinner_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_dinner_editActionPerformed(evt);
            }
        });
        add(meal_dinner_edit);
        meal_dinner_edit.setBounds(470, 450, 50, 31);

        meal_dinner_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        meal_dinner_save.setBorder(null);
        meal_dinner_save.setBorderPainted(false);
        meal_dinner_save.setContentAreaFilled(false);
        meal_dinner_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_dinner_save.setFocusPainted(false);
        meal_dinner_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_dinner_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_dinner_saveMouseExited(evt);
            }
        });
        meal_dinner_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_dinner_saveActionPerformed(evt);
            }
        });
        add(meal_dinner_save);
        meal_dinner_save.setBounds(520, 450, 50, 31);

        meal_dinner_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        meal_dinner_delete.setBorder(null);
        meal_dinner_delete.setBorderPainted(false);
        meal_dinner_delete.setContentAreaFilled(false);
        meal_dinner_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal_dinner_delete.setEnabled(false);
        meal_dinner_delete.setFocusPainted(false);
        meal_dinner_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                meal_dinner_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                meal_dinner_deleteMouseExited(evt);
            }
        });
        meal_dinner_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_dinner_deleteActionPerformed(evt);
            }
        });
        add(meal_dinner_delete);
        meal_dinner_delete.setBounds(570, 450, 50, 31);

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

    private void meal_breakfast_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_breakfast_saveMouseEntered
        meal_breakfast_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_meal_breakfast_saveMouseEntered

    private void meal_breakfast_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_breakfast_saveMouseExited
        meal_breakfast_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_meal_breakfast_saveMouseExited

    private void meal_breakfast_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_breakfast_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into breakfast(name) values ('" + meal_breakfast_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);

            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            breakfastList();
            breakfastData();
            meal_breakfast_input.setText("");
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_breakfast_saveActionPerformed

    private void meal_breakfast_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_breakfast_deleteMouseEntered
        meal_breakfast_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_meal_breakfast_deleteMouseEntered

    private void meal_breakfast_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_breakfast_deleteMouseExited
        meal_breakfast_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_meal_breakfast_deleteMouseExited

    private void meal_breakfast_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_breakfast_deleteActionPerformed
        Music.sfx();
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete = "delete from diet_breakfast where bf_id = " + bf_id + ";";
            stmt.executeUpdate(query_delete);
            
            String query_delete0 = "delete from breakfast where bf_id = " + bf_id + ";";
            stmt.executeUpdate(query_delete0);
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            breakfastList();
            breakfastData();
            meal_breakfast_input.setText("");
            
            meal_breakfast_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_breakfast_deleteActionPerformed

    private void user_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_returnMouseEntered
        user_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return2_hover.png")));
    }//GEN-LAST:event_user_returnMouseEntered

    private void user_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_returnMouseExited
        user_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return2.png")));
    }//GEN-LAST:event_user_returnMouseExited

    private void user_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_returnActionPerformed
        Music.sfx();
        reset();
        
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
        while (tableModel2.getRowCount() > 0) {
            tableModel2.removeRow(0);
        }
        while (tableModel3.getRowCount() > 0) {
            tableModel3.removeRow(0);
        }
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "diet_edit");
    }//GEN-LAST:event_user_returnActionPerformed

    private void meal_breakfast_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_breakfast_editMouseEntered
        meal_breakfast_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_meal_breakfast_editMouseEntered

    private void meal_breakfast_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_breakfast_editMouseExited
        meal_breakfast_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_meal_breakfast_editMouseExited

    private void meal_breakfast_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_breakfast_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            String query_breakfast = "update breakfast set name = '" + meal_breakfast_input.getText() + "' where bf_id = " + bf_id + ";";
            int qb = stmt.executeUpdate(query_breakfast);
            if(qb == 0) {
                String query_breakfast2 = "insert into breakfast(name) values ('" + meal_breakfast_input.getText() + "');";
                stmt.executeUpdate(query_breakfast2);
            }
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            breakfastList();
            breakfastData();
            meal_breakfast_input.setText("");

            meal_breakfast_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_breakfast_editActionPerformed

    private void meal_lunch_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_lunch_editMouseEntered
        meal_lunch_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_meal_lunch_editMouseEntered

    private void meal_lunch_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_lunch_editMouseExited
        meal_lunch_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_meal_lunch_editMouseExited

    private void meal_lunch_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_lunch_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            String query_lunch = "update lunch set name = '" + meal_lunch_input.getText() + "' where lunch_id = " + lunch_id + ";";
            int ql = stmt.executeUpdate(query_lunch);
            if(ql == 0) {
                String query_breakfast2 = "insert into lunch(name) values ('" + meal_lunch_input.getText() + "');";
                stmt.executeUpdate(query_breakfast2);
            }
            
            while (tableModel2.getRowCount() > 0) {
                tableModel2.removeRow(0);
            }
            lunchList();
            lunchData();
            meal_lunch_input.setText("");

            meal_lunch_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_lunch_editActionPerformed

    private void meal_lunch_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_lunch_saveMouseEntered
        meal_lunch_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_meal_lunch_saveMouseEntered

    private void meal_lunch_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_lunch_saveMouseExited
        meal_lunch_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_meal_lunch_saveMouseExited

    private void meal_lunch_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_lunch_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into lunch(name) values ('" + meal_lunch_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);

            while (tableModel2.getRowCount() > 0) {
                tableModel2.removeRow(0);
            }
            lunchList();
            lunchData();
            meal_lunch_input.setText("");
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_lunch_saveActionPerformed

    private void meal_lunch_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_lunch_deleteMouseEntered
        meal_lunch_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_meal_lunch_deleteMouseEntered

    private void meal_lunch_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_lunch_deleteMouseExited
        meal_lunch_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_meal_lunch_deleteMouseExited

    private void meal_lunch_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_lunch_deleteActionPerformed
        Music.sfx();
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete = "delete from diet_lunch where lunch_id = " + lunch_id + ";";
            stmt.executeUpdate(query_delete);
            
            String query_delete0 = "delete from lunch where lunch_id = " + lunch_id + ";";
            stmt.executeUpdate(query_delete0);
            
            while (tableModel2.getRowCount() > 0) {
                tableModel2.removeRow(0);
            }
            lunchList();
            lunchData();
            meal_lunch_input.setText("");
            
            meal_breakfast_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_lunch_deleteActionPerformed

    private void meal_dinner_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_dinner_editMouseEntered
        meal_dinner_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_meal_dinner_editMouseEntered

    private void meal_dinner_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_dinner_editMouseExited
        meal_dinner_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_meal_dinner_editMouseExited

    private void meal_dinner_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_dinner_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            String query_lunch = "update lunch set name = '" + meal_dinner_input.getText() + "' where dinner_id = " + dinner_id + ";";
            int ql = stmt.executeUpdate(query_lunch);
            if(ql == 0) {
                String query_breakfast2 = "insert into dinner(name) values ('" + meal_dinner_input.getText() + "');";
                stmt.executeUpdate(query_breakfast2);
            }
            
            while (tableModel3.getRowCount() > 0) {
                tableModel3.removeRow(0);
            }
            dinnerList();
            dinnerData();
            meal_dinner_input.setText("");

            meal_dinner_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_dinner_editActionPerformed

    private void meal_dinner_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_dinner_saveMouseEntered
        meal_dinner_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));

    }//GEN-LAST:event_meal_dinner_saveMouseEntered

    private void meal_dinner_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_dinner_saveMouseExited
        meal_dinner_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_meal_dinner_saveMouseExited

    private void meal_dinner_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_dinner_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into dinner(name) values ('" + meal_dinner_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);

            while (tableModel3.getRowCount() > 0) {
                tableModel3.removeRow(0);
            }
            dinnerList();
            dinnerData();
            meal_dinner_input.setText("");
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_dinner_saveActionPerformed

    private void meal_dinner_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_dinner_deleteMouseEntered
        meal_dinner_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_meal_dinner_deleteMouseEntered

    private void meal_dinner_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_dinner_deleteMouseExited
        meal_dinner_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_meal_dinner_deleteMouseExited

    private void meal_dinner_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_dinner_deleteActionPerformed
        Music.sfx();
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete = "delete from diet_dinner where dinner_id = " + dinner_id + ";";
            stmt.executeUpdate(query_delete);
            
            String query_delete0 = "delete from dinner where dinner_id = " + dinner_id + ";";
            stmt.executeUpdate(query_delete0);
            
            while (tableModel3.getRowCount() > 0) {
                tableModel3.removeRow(0);
            }
            dinnerList();
            dinnerData();
            meal_dinner_input.setText("");
            
            meal_dinner_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meal_dinner_deleteActionPerformed
    
    public void breakfastList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from breakfast;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel.addRow(new Object[]{workouts.getInt("bf_id"), workouts.getString("name")});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void lunchList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from lunch;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel2.addRow(new Object[]{workouts.getInt("lunch_id"), workouts.getString("name")});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void dinnerList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from dinner;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel3.addRow(new Object[]{workouts.getInt("dinner_id"), workouts.getString("name")});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void breakfastData() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // BREAKFAST
            java.sql.ResultSet ref9 = stmt.executeQuery("select * from breakfast where bf_id = '" + bf_id + "';" );
            if(ref9.next()) {
                meal_breakfast_input.setText(ref9.getString("name"));
                user_breakfast.setText(ref9.getString("name"));
            }
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void lunchData() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // LUNCH
            java.sql.ResultSet ref10 = stmt.executeQuery("select * from lunch where lunch_id = '" + lunch_id + "';" );
            if(ref10.next()) {
                meal_lunch_input.setText(ref10.getString("name"));
                user_lunch.setText(ref10.getString("name"));
            }
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void dinnerData() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // DINNER
            java.sql.ResultSet ref11 = stmt.executeQuery("select * from dinner where dinner_id = '" + dinner_id + "';" );
            if(ref11.next()) {
                meal_dinner_input.setText(ref11.getString("name"));
                user_dinner.setText(ref11.getString("name"));
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
        while (tableModel2.getRowCount() > 0) {
                tableModel2.removeRow(0);
            }
        while (tableModel3.getRowCount() > 0) {
                tableModel3.removeRow(0);
            }
        
        user_breakfast.setText("n/a");
        user_lunch.setText("n/a");
        user_dinner.setText("n/a");
        
        meal_breakfast_edit.setEnabled(false);
        meal_breakfast_delete.setEnabled(false);
        meal_lunch_edit.setEnabled(false);
        meal_lunch_delete.setEnabled(false);
        meal_dinner_edit.setEnabled(false);
        meal_dinner_delete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable breakfast_table;
    public javax.swing.JTable dinner_table;
    private javax.swing.JLabel gradient_bg;
    private javax.swing.JLabel gradient_bg2;
    public javax.swing.JTable lunch_table;
    private javax.swing.JLabel meal_breakfast_bg;
    public javax.swing.JButton meal_breakfast_delete;
    public javax.swing.JButton meal_breakfast_edit;
    public javax.swing.JTextField meal_breakfast_input;
    public javax.swing.JButton meal_breakfast_save;
    private javax.swing.JLabel meal_breakfast_title;
    private javax.swing.JLabel meal_dinner_bg;
    public javax.swing.JButton meal_dinner_delete;
    public javax.swing.JButton meal_dinner_edit;
    public javax.swing.JTextField meal_dinner_input;
    public javax.swing.JButton meal_dinner_save;
    private javax.swing.JLabel meal_dinner_title;
    private javax.swing.JLabel meal_lunch_bg;
    public javax.swing.JButton meal_lunch_delete;
    public javax.swing.JButton meal_lunch_edit;
    public javax.swing.JTextField meal_lunch_input;
    public javax.swing.JButton meal_lunch_save;
    private javax.swing.JLabel meal_lunch_title;
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
    public javax.swing.JScrollPane user_table_scroll;
    public javax.swing.JScrollPane user_table_scroll1;
    public javax.swing.JScrollPane user_table_scroll2;
    public javax.swing.JLabel user_workout;
    private javax.swing.JLabel user_workout2;
    public javax.swing.JLabel workout_edit_title;
    // End of variables declaration//GEN-END:variables
}
