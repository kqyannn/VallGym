public class ExerciseEdit extends javax.swing.JPanel {
    public javax.swing.table.DefaultTableModel tableModel;
    public javax.swing.table.DefaultTableModel tableModel2;
    public javax.swing.table.DefaultTableModel tableModel3;
    private int pushup_id;
    private int curlup_id;
    private int jogging_id;
    
    public ExerciseEdit() {
        
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
        
        ex_pushup_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                String text = ex_pushup_input.getText();
                char c = e.getKeyChar();

                if ((text == null) || (text != null && !Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
       
        ex_pushup_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                String text = ex_pushup_input.getText();
                char c = e.getKeyChar();

                if ((text == null) || (text != null && !Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE && !text.isEmpty())) {
                    e.consume();
                }
            }
        });
        
        ex_curlup_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                String text = ex_curlup_input.getText();
                char c = e.getKeyChar();

                if ((text == null) || (text != null && !Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
       
        ex_curlup_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                String text = ex_curlup_input.getText();
                char c = e.getKeyChar();

                if ((text == null) || (text != null && !Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE && !text.isEmpty())) {
                    e.consume();
                }
            }
        });
        
        ex_jogging_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                String text = ex_jogging_input.getText();
                char c = e.getKeyChar();

                if ((text == null) || (text != null && !Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
       
        ex_jogging_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                String text = ex_jogging_input.getText();
                char c = e.getKeyChar();

                if ((text == null) || (text != null && !Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE && !text.isEmpty())) {
                    e.consume();
                }
            }
        });
        
        // BREAKFAST TABLE
        pushup_table.getColumnModel().getColumn(0).setPreferredWidth(25);
        pushup_table.getColumnModel().getColumn(1).setPreferredWidth(240);
        pushup_table.getColumnModel().getColumn(1).setCellRenderer(new PaddedRenderer());
        
        javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pushup_table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        javax.swing.ListSelectionModel selectionModel = pushup_table.getSelectionModel();
        pushup_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = pushup_table.getSelectedRow();
                    if (selectedRow != -1) {
                        ex_pushup_edit.setEnabled(true);
                        ex_pushup_delete.setEnabled(true);
                        
                        int selected_ID = (int)pushup_table.getValueAt(selectedRow, 0);
                        pushup_id = selected_ID;
                        pushupData();
                    } else {
                        ex_pushup_input.setText("");
                        ex_pushup_edit.setEnabled(false);
                        ex_pushup_delete.setEnabled(false);
                    }
                }
            }
        });
        
        // LUNCH TABLE
        curlup_table.getColumnModel().getColumn(0).setPreferredWidth(25);
        curlup_table.getColumnModel().getColumn(1).setPreferredWidth(240);
        curlup_table.getColumnModel().getColumn(1).setCellRenderer(new PaddedRenderer());
        curlup_table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        javax.swing.ListSelectionModel selectionModel2 = curlup_table.getSelectionModel();
        curlup_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectionModel2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = curlup_table.getSelectedRow();
                    if (selectedRow != -1) {
                        ex_curlup_edit.setEnabled(true);
                        ex_curlup_delete.setEnabled(true);
                        
                        int selected_ID = (int)curlup_table.getValueAt(selectedRow, 0);
                        curlup_id = selected_ID;
                        curlupData();
                    } else {
                        ex_curlup_input.setText("");
                        ex_curlup_edit.setEnabled(false);
                        ex_curlup_delete.setEnabled(false);
                    }
                }
            }
        });
        
        // DINNER TABLE
        jogging_table.getColumnModel().getColumn(0).setPreferredWidth(25);
        jogging_table.getColumnModel().getColumn(1).setPreferredWidth(240);
        jogging_table.getColumnModel().getColumn(1).setCellRenderer(new PaddedRenderer());
        jogging_table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        javax.swing.ListSelectionModel selectionModel3 = jogging_table.getSelectionModel();
        jogging_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectionModel3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = jogging_table.getSelectedRow();
                    if (selectedRow != -1) {
                        ex_jogging_edit.setEnabled(true);
                        ex_jogging_delete.setEnabled(true);
                        
                        int selected_ID = (int)jogging_table.getValueAt(selectedRow, 0);
                        jogging_id = selected_ID;
                        joggingData();
                    } else {
                        ex_jogging_input.setText("");
                        ex_jogging_edit.setEnabled(false);
                        ex_jogging_delete.setEnabled(false);
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
        pushup_table = new javax.swing.JTable();
        user_table_scroll1 = new javax.swing.JScrollPane();
        curlup_table = new javax.swing.JTable();
        user_table_scroll = new javax.swing.JScrollPane();
        jogging_table = new javax.swing.JTable();
        ex_pushup_title = new javax.swing.JLabel();
        ex_pushup_input = new javax.swing.JTextField();
        ex_pushup_bg = new javax.swing.JLabel();
        ex_pushup_edit = new javax.swing.JButton();
        ex_pushup_save = new javax.swing.JButton();
        ex_pushup_delete = new javax.swing.JButton();
        ex_curlup_title = new javax.swing.JLabel();
        ex_curlup_input = new javax.swing.JTextField();
        ex_curlup_bg = new javax.swing.JLabel();
        ex_curlup_edit = new javax.swing.JButton();
        ex_curlup_save = new javax.swing.JButton();
        ex_curlup_delete = new javax.swing.JButton();
        ex_jogging_title = new javax.swing.JLabel();
        ex_jogging_input = new javax.swing.JTextField();
        ex_jogging_bg = new javax.swing.JLabel();
        ex_jogging_edit = new javax.swing.JButton();
        ex_jogging_save = new javax.swing.JButton();
        ex_jogging_delete = new javax.swing.JButton();
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

        pushup_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        pushup_table.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        pushup_table.setModel(tableModel);
        pushup_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        pushup_table.setFocusable(false);
        pushup_table.setOpaque(false);
        pushup_table.setRowHeight(30);
        pushup_table.setShowGrid(false);
        pushup_table.setTableHeader(null);
        user_table_scroll2.setViewportView(pushup_table);

        add(user_table_scroll2);
        user_table_scroll2.setBounds(50, 90, 190, 280);

        user_table_scroll1.setBackground(new java.awt.Color(255, 255, 255));
        user_table_scroll1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        user_table_scroll1.setFocusable(false);
        user_table_scroll1.setOpaque(false);
        user_table_scroll1.setPreferredSize(new java.awt.Dimension(610, 350));
        user_table_scroll1.setRequestFocusEnabled(false);

        curlup_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        curlup_table.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        curlup_table.setModel(tableModel2);
        curlup_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        curlup_table.setFocusable(false);
        curlup_table.setOpaque(false);
        curlup_table.setRowHeight(30);
        curlup_table.setShowGrid(false);
        curlup_table.setTableHeader(null);
        user_table_scroll1.setViewportView(curlup_table);

        add(user_table_scroll1);
        user_table_scroll1.setBounds(250, 90, 190, 280);

        user_table_scroll.setBackground(new java.awt.Color(255, 255, 255));
        user_table_scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        user_table_scroll.setFocusable(false);
        user_table_scroll.setOpaque(false);
        user_table_scroll.setPreferredSize(new java.awt.Dimension(610, 350));
        user_table_scroll.setRequestFocusEnabled(false);

        jogging_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        jogging_table.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jogging_table.setModel(tableModel3);
        jogging_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jogging_table.setFocusable(false);
        jogging_table.setOpaque(false);
        jogging_table.setRowHeight(30);
        jogging_table.setShowGrid(false);
        jogging_table.setTableHeader(null);
        user_table_scroll.setViewportView(jogging_table);

        add(user_table_scroll);
        user_table_scroll.setBounds(450, 90, 190, 280);

        ex_pushup_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ex_pushup_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ex_pushup_title.setText("Push-ups");
        ex_pushup_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(ex_pushup_title);
        ex_pushup_title.setBounds(50, 380, 190, 20);

        ex_pushup_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ex_pushup_input.setBorder(null);
        ex_pushup_input.setOpaque(false);
        add(ex_pushup_input);
        ex_pushup_input.setBounds(60, 400, 170, 40);

        ex_pushup_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ex_pushup_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_tiny.png"))); // NOI18N
        ex_pushup_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(ex_pushup_bg);
        ex_pushup_bg.setBounds(40, 400, 210, 40);

        ex_pushup_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        ex_pushup_edit.setBorder(null);
        ex_pushup_edit.setBorderPainted(false);
        ex_pushup_edit.setContentAreaFilled(false);
        ex_pushup_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_pushup_edit.setEnabled(false);
        ex_pushup_edit.setFocusPainted(false);
        ex_pushup_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_pushup_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_pushup_editMouseExited(evt);
            }
        });
        ex_pushup_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_pushup_editActionPerformed(evt);
            }
        });
        add(ex_pushup_edit);
        ex_pushup_edit.setBounds(70, 450, 50, 31);

        ex_pushup_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        ex_pushup_save.setBorder(null);
        ex_pushup_save.setBorderPainted(false);
        ex_pushup_save.setContentAreaFilled(false);
        ex_pushup_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_pushup_save.setFocusPainted(false);
        ex_pushup_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_pushup_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_pushup_saveMouseExited(evt);
            }
        });
        ex_pushup_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_pushup_saveActionPerformed(evt);
            }
        });
        add(ex_pushup_save);
        ex_pushup_save.setBounds(120, 450, 50, 31);

        ex_pushup_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        ex_pushup_delete.setBorder(null);
        ex_pushup_delete.setBorderPainted(false);
        ex_pushup_delete.setContentAreaFilled(false);
        ex_pushup_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_pushup_delete.setEnabled(false);
        ex_pushup_delete.setFocusPainted(false);
        ex_pushup_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_pushup_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_pushup_deleteMouseExited(evt);
            }
        });
        ex_pushup_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_pushup_deleteActionPerformed(evt);
            }
        });
        add(ex_pushup_delete);
        ex_pushup_delete.setBounds(170, 450, 50, 31);

        ex_curlup_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ex_curlup_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ex_curlup_title.setText("Curl-ups");
        ex_curlup_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(ex_curlup_title);
        ex_curlup_title.setBounds(250, 380, 190, 20);

        ex_curlup_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ex_curlup_input.setBorder(null);
        ex_curlup_input.setOpaque(false);
        add(ex_curlup_input);
        ex_curlup_input.setBounds(260, 400, 170, 40);

        ex_curlup_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ex_curlup_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_tiny.png"))); // NOI18N
        ex_curlup_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(ex_curlup_bg);
        ex_curlup_bg.setBounds(240, 400, 210, 40);

        ex_curlup_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        ex_curlup_edit.setBorder(null);
        ex_curlup_edit.setBorderPainted(false);
        ex_curlup_edit.setContentAreaFilled(false);
        ex_curlup_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_curlup_edit.setEnabled(false);
        ex_curlup_edit.setFocusPainted(false);
        ex_curlup_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_curlup_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_curlup_editMouseExited(evt);
            }
        });
        ex_curlup_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_curlup_editActionPerformed(evt);
            }
        });
        add(ex_curlup_edit);
        ex_curlup_edit.setBounds(270, 450, 50, 31);

        ex_curlup_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        ex_curlup_save.setBorder(null);
        ex_curlup_save.setBorderPainted(false);
        ex_curlup_save.setContentAreaFilled(false);
        ex_curlup_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_curlup_save.setFocusPainted(false);
        ex_curlup_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_curlup_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_curlup_saveMouseExited(evt);
            }
        });
        ex_curlup_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_curlup_saveActionPerformed(evt);
            }
        });
        add(ex_curlup_save);
        ex_curlup_save.setBounds(320, 450, 50, 31);

        ex_curlup_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        ex_curlup_delete.setBorder(null);
        ex_curlup_delete.setBorderPainted(false);
        ex_curlup_delete.setContentAreaFilled(false);
        ex_curlup_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_curlup_delete.setEnabled(false);
        ex_curlup_delete.setFocusPainted(false);
        ex_curlup_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_curlup_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_curlup_deleteMouseExited(evt);
            }
        });
        ex_curlup_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_curlup_deleteActionPerformed(evt);
            }
        });
        add(ex_curlup_delete);
        ex_curlup_delete.setBounds(370, 450, 50, 31);

        ex_jogging_title.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ex_jogging_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ex_jogging_title.setText("Jogging");
        ex_jogging_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(ex_jogging_title);
        ex_jogging_title.setBounds(450, 380, 170, 20);

        ex_jogging_input.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ex_jogging_input.setBorder(null);
        ex_jogging_input.setOpaque(false);
        add(ex_jogging_input);
        ex_jogging_input.setBounds(460, 400, 170, 40);

        ex_jogging_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ex_jogging_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bar_tiny.png"))); // NOI18N
        ex_jogging_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(ex_jogging_bg);
        ex_jogging_bg.setBounds(440, 400, 210, 40);

        ex_jogging_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png"))); // NOI18N
        ex_jogging_edit.setBorder(null);
        ex_jogging_edit.setBorderPainted(false);
        ex_jogging_edit.setContentAreaFilled(false);
        ex_jogging_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_jogging_edit.setEnabled(false);
        ex_jogging_edit.setFocusPainted(false);
        ex_jogging_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_jogging_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_jogging_editMouseExited(evt);
            }
        });
        ex_jogging_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_jogging_editActionPerformed(evt);
            }
        });
        add(ex_jogging_edit);
        ex_jogging_edit.setBounds(470, 450, 50, 31);

        ex_jogging_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png"))); // NOI18N
        ex_jogging_save.setBorder(null);
        ex_jogging_save.setBorderPainted(false);
        ex_jogging_save.setContentAreaFilled(false);
        ex_jogging_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_jogging_save.setFocusPainted(false);
        ex_jogging_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_jogging_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_jogging_saveMouseExited(evt);
            }
        });
        ex_jogging_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_jogging_saveActionPerformed(evt);
            }
        });
        add(ex_jogging_save);
        ex_jogging_save.setBounds(520, 450, 50, 31);

        ex_jogging_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png"))); // NOI18N
        ex_jogging_delete.setBorder(null);
        ex_jogging_delete.setBorderPainted(false);
        ex_jogging_delete.setContentAreaFilled(false);
        ex_jogging_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ex_jogging_delete.setEnabled(false);
        ex_jogging_delete.setFocusPainted(false);
        ex_jogging_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ex_jogging_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ex_jogging_deleteMouseExited(evt);
            }
        });
        ex_jogging_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_jogging_deleteActionPerformed(evt);
            }
        });
        add(ex_jogging_delete);
        ex_jogging_delete.setBounds(570, 450, 50, 31);

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

    private void ex_pushup_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_pushup_saveMouseEntered
        ex_pushup_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_ex_pushup_saveMouseEntered

    private void ex_pushup_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_pushup_saveMouseExited
        ex_pushup_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_ex_pushup_saveMouseExited

    private void ex_pushup_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_pushup_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into push_ups(count) values ('" + ex_pushup_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);

            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            pushupList();
            pushupData();
            ex_pushup_input.setText("");
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_pushup_saveActionPerformed

    private void ex_pushup_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_pushup_deleteMouseEntered
        ex_pushup_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_ex_pushup_deleteMouseEntered

    private void ex_pushup_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_pushup_deleteMouseExited
        ex_pushup_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_ex_pushup_deleteMouseExited

    private void ex_pushup_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_pushup_deleteActionPerformed
        Music.sfx();
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete = "delete from routine_pushups where pushup_id = " + pushup_id + ";";
            stmt.executeUpdate(query_delete);
            
            String query_delete0 = "delete from push_ups where pushup_id = " + pushup_id + ";";
            stmt.executeUpdate(query_delete0);
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            pushupList();
            pushupData();
            ex_pushup_input.setText("");
            
            ex_pushup_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_pushup_deleteActionPerformed

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
        
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "routine_edit");
    }//GEN-LAST:event_user_returnActionPerformed

    private void ex_pushup_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_pushup_editMouseEntered
        ex_pushup_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_ex_pushup_editMouseEntered

    private void ex_pushup_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_pushup_editMouseExited
        ex_pushup_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_ex_pushup_editMouseExited

    private void ex_pushup_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_pushup_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            String query_pushups = "update push_ups set count = '" + ex_pushup_input.getText() + "' where pushup_id = " + pushup_id + ";";
            int qb = stmt.executeUpdate(query_pushups);
            if(qb == 0) {
                String query_pushups2 = "insert into push_ups(count) values ('" + ex_pushup_input.getText() + "');";
                stmt.executeUpdate(query_pushups2);
            }
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            pushupList();
            pushupData();
            ex_pushup_input.setText("");

            ex_pushup_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_pushup_editActionPerformed

    private void ex_curlup_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_curlup_editMouseEntered
        ex_curlup_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_ex_curlup_editMouseEntered

    private void ex_curlup_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_curlup_editMouseExited
        ex_curlup_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_ex_curlup_editMouseExited

    private void ex_curlup_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_curlup_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            String query_curlups = "update curl_ups set count = '" + ex_curlup_input.getText() + "' where curlup_id = " + curlup_id + ";";
            int ql = stmt.executeUpdate(query_curlups);
            if(ql == 0) {
                String query_curlups2 = "insert into curl_ups(count) values ('" + ex_curlup_input.getText() + "');";
                stmt.executeUpdate(query_curlups2);
            }
            
            while (tableModel2.getRowCount() > 0) {
                tableModel2.removeRow(0);
            }
            curlupList();
            curlupData();
            ex_curlup_input.setText("");

            ex_curlup_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_curlup_editActionPerformed

    private void ex_curlup_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_curlup_saveMouseEntered
        ex_curlup_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));
    }//GEN-LAST:event_ex_curlup_saveMouseEntered

    private void ex_curlup_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_curlup_saveMouseExited
        ex_curlup_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_ex_curlup_saveMouseExited

    private void ex_curlup_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_curlup_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into curl_ups(count) values ('" + ex_curlup_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);

            while (tableModel2.getRowCount() > 0) {
                tableModel2.removeRow(0);
            }
            curlupList();
            curlupData();
            ex_curlup_input.setText("");
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_curlup_saveActionPerformed

    private void ex_curlup_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_curlup_deleteMouseEntered
        ex_curlup_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_ex_curlup_deleteMouseEntered

    private void ex_curlup_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_curlup_deleteMouseExited
        ex_curlup_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_ex_curlup_deleteMouseExited

    private void ex_curlup_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_curlup_deleteActionPerformed
        Music.sfx();
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete = "delete from routine_curlups where curlup_id = " + curlup_id + ";";
            stmt.executeUpdate(query_delete);
            
            String query_delete0 = "delete from curl_ups where curlup_id = " + curlup_id + ";";
            stmt.executeUpdate(query_delete0);
            
            while (tableModel2.getRowCount() > 0) {
                tableModel2.removeRow(0);
            }
            curlupList();
            curlupData();
            ex_curlup_input.setText("");
            
            ex_pushup_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_curlup_deleteActionPerformed

    private void ex_jogging_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_jogging_editMouseEntered
        ex_jogging_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button_hover.png")));
    }//GEN-LAST:event_ex_jogging_editMouseEntered

    private void ex_jogging_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_jogging_editMouseExited
        ex_jogging_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_button.png")));
    }//GEN-LAST:event_ex_jogging_editMouseExited

    private void ex_jogging_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_jogging_editActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            String query_jogging = "update jogging set count = '" + ex_jogging_input.getText() + "' where jogging_id = " + jogging_id + ";";
            int ql = stmt.executeUpdate(query_jogging);
            if(ql == 0) {
                String query_jogging2 = "insert into jogging(count) values ('" + ex_jogging_input.getText() + "');";
                stmt.executeUpdate(query_jogging2);
            }
            
            while (tableModel3.getRowCount() > 0) {
                tableModel3.removeRow(0);
            }
            joggingList();
            joggingData();
            ex_jogging_input.setText("");

            ex_jogging_delete.setEnabled(false);
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_jogging_editActionPerformed

    private void ex_jogging_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_jogging_saveMouseEntered
        ex_jogging_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button_hover.png")));

    }//GEN-LAST:event_ex_jogging_saveMouseEntered

    private void ex_jogging_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_jogging_saveMouseExited
        ex_jogging_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_button.png")));
    }//GEN-LAST:event_ex_jogging_saveMouseExited

    private void ex_jogging_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_jogging_saveActionPerformed
        Music.sfx();
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_workout = "insert into jogging(count) values ('" + ex_jogging_input.getText() + "');"; 
                stmt.executeUpdate(query_workout);

            while (tableModel3.getRowCount() > 0) {
                tableModel3.removeRow(0);
            }
            joggingList();
            joggingData();
            ex_jogging_input.setText("");
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_jogging_saveActionPerformed

    private void ex_jogging_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_jogging_deleteMouseEntered
        ex_jogging_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button_hover.png")));
    }//GEN-LAST:event_ex_jogging_deleteMouseEntered

    private void ex_jogging_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ex_jogging_deleteMouseExited
        ex_jogging_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_button.png")));
    }//GEN-LAST:event_ex_jogging_deleteMouseExited

    private void ex_jogging_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_jogging_deleteActionPerformed
        Music.sfx();
        
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String query_delete = "delete from routine_jogging where jogging_id = " + jogging_id + ";";
            stmt.executeUpdate(query_delete);
            
            String query_delete0 = "delete from jogging where jogging_id = " + jogging_id + ";";
            stmt.executeUpdate(query_delete0);
            
            while (tableModel3.getRowCount() > 0) {
                tableModel3.removeRow(0);
            }
            joggingList();
            joggingData();
            ex_jogging_input.setText("");
            
            ex_jogging_delete.setEnabled(false);
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ex_jogging_deleteActionPerformed
    
    public void pushupList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from push_ups;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel.addRow(new Object[]{workouts.getInt("pushup_id"), workouts.getString("count") + "x push-ups"});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void curlupList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from curl_ups;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel2.addRow(new Object[]{workouts.getInt("curlup_id"), workouts.getString("count") + "x curl-ups"});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void joggingList() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            String workout_list = "select * from jogging;";
            java.sql.ResultSet workouts = stmt.executeQuery(workout_list);
            
            while(workouts.next()) {
                tableModel3.addRow(new Object[]{workouts.getInt("jogging_id"), workouts.getString("count") + " km jogging"});
            }
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void pushupData() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // BREAKFAST
            java.sql.ResultSet ref9 = stmt.executeQuery("select * from push_ups where pushup_id = '" + pushup_id + "';" );
            if(ref9.next()) {
                ex_pushup_input.setText(ref9.getString("count"));
                user_routineP.setText(ref9.getString("count") + "x push-ups");
            }
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void curlupData() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // LUNCH
            java.sql.ResultSet ref10 = stmt.executeQuery("select * from curl_ups where curlup_id = '" + curlup_id + "';" );
            if(ref10.next()) {
                ex_curlup_input.setText(ref10.getString("count"));
                user_routineC.setText(ref10.getString("count") + "x curl-ups");
            }
            
            conn.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public void joggingData() {
        try(java.sql.Connection conn = VallGym.mainMenu.panel_signin.getConnection();) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // DINNER
            java.sql.ResultSet ref11 = stmt.executeQuery("select * from jogging where jogging_id = '" + jogging_id + "';" );
            if(ref11.next()) {
                ex_jogging_input.setText(ref11.getString("count"));
                user_routineJ.setText(ref11.getString("count") + " km jogging");
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
        user_routineC.setText("n/a");
        user_routineJ.setText("n/a");
        user_routineP.setText("n/a");
        
        ex_pushup_edit.setEnabled(false);
        ex_pushup_delete.setEnabled(false);
        ex_curlup_edit.setEnabled(false);
        ex_curlup_delete.setEnabled(false);
        ex_jogging_edit.setEnabled(false);
        ex_jogging_delete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable curlup_table;
    private javax.swing.JLabel ex_curlup_bg;
    public javax.swing.JButton ex_curlup_delete;
    public javax.swing.JButton ex_curlup_edit;
    public javax.swing.JTextField ex_curlup_input;
    public javax.swing.JButton ex_curlup_save;
    private javax.swing.JLabel ex_curlup_title;
    private javax.swing.JLabel ex_jogging_bg;
    public javax.swing.JButton ex_jogging_delete;
    public javax.swing.JButton ex_jogging_edit;
    public javax.swing.JTextField ex_jogging_input;
    public javax.swing.JButton ex_jogging_save;
    private javax.swing.JLabel ex_jogging_title;
    private javax.swing.JLabel ex_pushup_bg;
    public javax.swing.JButton ex_pushup_delete;
    public javax.swing.JButton ex_pushup_edit;
    public javax.swing.JTextField ex_pushup_input;
    public javax.swing.JButton ex_pushup_save;
    private javax.swing.JLabel ex_pushup_title;
    private javax.swing.JLabel gradient_bg;
    private javax.swing.JLabel gradient_bg2;
    public javax.swing.JTable jogging_table;
    public javax.swing.JTable pushup_table;
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
