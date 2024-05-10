public class SignIn extends javax.swing.JPanel {
    javax.swing.JWindow popup = new javax.swing.JWindow();
    javax.swing.JLabel popupLabel = new javax.swing.JLabel("      Contact employer for your credentials.");
    
    public static String username_final = new String();
    public static String password_final = new String();
    
    public SignIn() {
        popupLabel.setBorder(null);
        popupLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 12));
        popup.getContentPane().add(popupLabel);
        popup.setSize(270, 50);
        
        initComponents();
        
        signin_incorrect.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signin_incorrect = new javax.swing.JLabel();
        signin_signup = new javax.swing.JButton();
        signin_signin = new javax.swing.JButton();
        signin_forgot = new javax.swing.JButton();
        signin_pass = new javax.swing.JPasswordField();
        signin_pass_bg = new javax.swing.JLabel();
        signin_pass_title = new javax.swing.JLabel();
        signin_user = new javax.swing.JTextField();
        signin_user_bg = new javax.swing.JLabel();
        signin_user_title = new javax.swing.JLabel();
        signin_title = new javax.swing.JLabel();
        signin_title2 = new javax.swing.JLabel();
        signin_bg = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1008, 518));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1210, 580));
        setLayout(null);

        signin_incorrect.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        signin_incorrect.setForeground(new java.awt.Color(255, 0, 0));
        signin_incorrect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_incorrect.setText("Incorrect username or password");
        add(signin_incorrect);
        signin_incorrect.setBounds(490, 310, 180, 20);

        signin_signup.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        signin_signup.setText("<html><u>Sign up</u></html>");
        signin_signup.setToolTipText("");
        signin_signup.setBorder(null);
        signin_signup.setBorderPainted(false);
        signin_signup.setContentAreaFilled(false);
        signin_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_signup.setFocusPainted(false);
        signin_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signin_signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signin_signupMouseExited(evt);
            }
        });
        signin_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_signupActionPerformed(evt);
            }
        });
        add(signin_signup);
        signin_signup.setBounds(470, 400, 80, 20);

        signin_signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signin_button.png"))); // NOI18N
        signin_signin.setBorder(null);
        signin_signin.setBorderPainted(false);
        signin_signin.setContentAreaFilled(false);
        signin_signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_signin.setFocusPainted(false);
        signin_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signin_signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signin_signinMouseExited(evt);
            }
        });
        signin_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_signinActionPerformed(evt);
            }
        });
        add(signin_signin);
        signin_signin.setBounds(420, 350, 180, 50);

        signin_forgot.setFont(new java.awt.Font("Montserrat Medium", 0, 11)); // NOI18N
        signin_forgot.setText("<html><u>Forgot password?</u></html>");
        signin_forgot.setToolTipText(null);
        signin_forgot.setBorder(null);
        signin_forgot.setBorderPainted(false);
        signin_forgot.setContentAreaFilled(false);
        signin_forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_forgot.setFocusPainted(false);
        signin_forgot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signin_forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signin_forgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signin_forgotMouseExited(evt);
            }
        });
        add(signin_forgot);
        signin_forgot.setBounds(360, 310, 110, 20);

        signin_pass.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        signin_pass.setBorder(null);
        signin_pass.setOpaque(false);
        add(signin_pass);
        signin_pass.setBounds(370, 260, 280, 40);

        signin_pass_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_pass_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/input_bg.png"))); // NOI18N
        signin_pass_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(signin_pass_bg);
        signin_pass_bg.setBounds(350, 250, 320, 60);

        signin_pass_title.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signin_pass_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signin_pass_title.setText("Password");
        add(signin_pass_title);
        signin_pass_title.setBounds(360, 230, 160, 20);

        signin_user.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signin_user.setBorder(null);
        signin_user.setOpaque(false);
        add(signin_user);
        signin_user.setBounds(370, 180, 280, 40);

        signin_user_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_user_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/input_bg.png"))); // NOI18N
        signin_user_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(signin_user_bg);
        signin_user_bg.setBounds(350, 170, 320, 60);

        signin_user_title.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signin_user_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signin_user_title.setText("Username");
        add(signin_user_title);
        signin_user_title.setBounds(360, 150, 160, 20);

        signin_title.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        signin_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_title.setText("Vall Gym Database");
        add(signin_title);
        signin_title.setBounds(350, 50, 320, 60);

        signin_title2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signin_title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_title2.setText("Sign in to connect to the gym’s database");
        add(signin_title2);
        signin_title2.setBounds(350, 100, 320, 20);

        signin_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bg_signin.png"))); // NOI18N
        signin_bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signin_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(signin_bg);
        signin_bg.setBounds(280, 10, 460, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void signin_signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_signupMouseEntered
        signin_signup.setForeground(new java.awt.Color(153, 153, 153));
    }//GEN-LAST:event_signin_signupMouseEntered

    private void signin_signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_signupMouseExited
        signin_signup.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_signin_signupMouseExited

    private void signin_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_signupActionPerformed
        Music.sfx();
        reset();
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "signup");
    }//GEN-LAST:event_signin_signupActionPerformed

    private void signin_signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_signinMouseEntered
        signin_signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signin_button_hover.png")));
    }//GEN-LAST:event_signin_signinMouseEntered

    private void signin_signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_signinMouseExited
        signin_signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signin_button.png")));
    }//GEN-LAST:event_signin_signinMouseExited

    private void signin_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_signinActionPerformed
        Music.sfx();
        
//        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "edit_menu");
//            
//            VallGym.mainMenu.main_return.setVisible(false);
//            VallGym.mainMenu.main_signin.setVisible(false);
//            VallGym.mainMenu.main_signout.setVisible(true);
        
        username_final = signin_user.getText();
        char[] password = signin_pass.getPassword();
        password_final = new String(password);
        java.util.Arrays.fill(password, ' ');
        
        try(java.sql.Connection conn = java.sql.DriverManager.getConnection(VallGym.DB_URL, username_final, password_final);) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            java.sql.ResultSet ref = stmt.executeQuery("select * from member");
            while(ref.next()) {
                VallGym.mainMenu.panel_edit.tableModel.addRow(new Object[]{ref.getInt("member_id"), ref.getString("first_name") + " " + ref.getString("last_name")});
            }
            conn.close();
            
            VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "edit_menu");
            
            VallGym.mainMenu.main_return.setVisible(false);
            VallGym.mainMenu.main_signin.setVisible(false);
            VallGym.mainMenu.main_signout.setVisible(true);
            
            reset();
            VallGym.mainMenu.panel_edit.reset();
            VallGym.mainMenu.panel_edit.resetTable();
            
        } catch (java.sql.SQLException e) {
//            e.printStackTrace();
            signin_incorrect.setVisible(true);
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signin_signinActionPerformed

    private static java.sql.Connection connection;
    
    public java.sql.Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = java.sql.DriverManager.getConnection(VallGym.DB_URL, username_final, password_final);
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void signin_forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_forgotMouseEntered
        signin_forgot.setForeground(new java.awt.Color(153, 153, 153));
        java.awt.Point p = signin_forgot.getLocationOnScreen();
        popup.setLocation(p.x, p.y + signin_forgot.getHeight());
        popup.setVisible(true);
    }//GEN-LAST:event_signin_forgotMouseEntered

    private void signin_forgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_forgotMouseExited
        signin_forgot.setForeground(new java.awt.Color(0, 0, 0));
        popup.setVisible(false);
    }//GEN-LAST:event_signin_forgotMouseExited
    
    public void reset() {
        signin_incorrect.setVisible(false);
        
        signin_user.setText("");
        signin_pass.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel signin_bg;
    private javax.swing.JButton signin_forgot;
    public javax.swing.JLabel signin_incorrect;
    private javax.swing.JPasswordField signin_pass;
    private javax.swing.JLabel signin_pass_bg;
    private javax.swing.JLabel signin_pass_title;
    private javax.swing.JButton signin_signin;
    private javax.swing.JButton signin_signup;
    private javax.swing.JLabel signin_title;
    private javax.swing.JLabel signin_title2;
    private javax.swing.JTextField signin_user;
    private javax.swing.JLabel signin_user_bg;
    private javax.swing.JLabel signin_user_title;
    // End of variables declaration//GEN-END:variables
}
