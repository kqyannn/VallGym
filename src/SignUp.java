public class SignUp extends javax.swing.JPanel {
    javax.swing.JWindow popup = new javax.swing.JWindow();
    javax.swing.JLabel popupLabel = new javax.swing.JLabel("      Get a referral code from employer.");
    String username_final = new String();
    String password_final = new String();
    
    public SignUp() {
        popupLabel.setBorder(null);
        popupLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 12));
        popup.getContentPane().add(popupLabel);
        popup.setSize(250, 50);
        
        initComponents();
        
        signup_incorrect.setVisible(false);
        signup_incorrect_ref.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signup_incorrect = new javax.swing.JLabel();
        signup_incorrect_ref = new javax.swing.JLabel();
        signup_signin = new javax.swing.JButton();
        signup_signup = new javax.swing.JButton();
        signup_ref_info = new javax.swing.JButton();
        signup_ref = new javax.swing.JTextField();
        signin_ref_bg = new javax.swing.JLabel();
        signup_ref_title = new javax.swing.JLabel();
        signup_pass = new javax.swing.JPasswordField();
        signup_pass_bg = new javax.swing.JLabel();
        signup_pass_title = new javax.swing.JLabel();
        signup_user = new javax.swing.JTextField();
        signup_user_bg = new javax.swing.JLabel();
        signup_user_title = new javax.swing.JLabel();
        signup_title = new javax.swing.JLabel();
        signup_title2 = new javax.swing.JLabel();
        signup_bg = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1020, 530));
        setLayout(null);

        signup_incorrect.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        signup_incorrect.setForeground(new java.awt.Color(255, 0, 0));
        signup_incorrect.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        signup_incorrect.setText("Invalid username or password");
        add(signup_incorrect);
        signup_incorrect.setBounds(490, 230, 170, 20);

        signup_incorrect_ref.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        signup_incorrect_ref.setForeground(new java.awt.Color(255, 0, 0));
        signup_incorrect_ref.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        signup_incorrect_ref.setText("Invalid referral code");
        add(signup_incorrect_ref);
        signup_incorrect_ref.setBounds(490, 310, 170, 20);

        signup_signin.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        signup_signin.setText("<html><u>Sign in</u></html>");
        signup_signin.setBorder(null);
        signup_signin.setBorderPainted(false);
        signup_signin.setContentAreaFilled(false);
        signup_signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_signin.setFocusPainted(false);
        signup_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signup_signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signup_signinMouseExited(evt);
            }
        });
        signup_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_signinActionPerformed(evt);
            }
        });
        add(signup_signin);
        signup_signin.setBounds(470, 460, 80, 20);

        signup_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signup_button.png"))); // NOI18N
        signup_signup.setBorder(null);
        signup_signup.setBorderPainted(false);
        signup_signup.setContentAreaFilled(false);
        signup_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_signup.setFocusPainted(false);
        signup_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signup_signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signup_signupMouseExited(evt);
            }
        });
        signup_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_signupActionPerformed(evt);
            }
        });
        add(signup_signup);
        signup_signup.setBounds(420, 410, 180, 50);

        signup_ref_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/referral.png"))); // NOI18N
        signup_ref_info.setBorder(null);
        signup_ref_info.setBorderPainted(false);
        signup_ref_info.setContentAreaFilled(false);
        signup_ref_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_ref_info.setFocusPainted(false);
        signup_ref_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signup_ref_infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signup_ref_infoMouseExited(evt);
            }
        });
        add(signup_ref_info);
        signup_ref_info.setBounds(460, 310, 30, 20);

        signup_ref.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signup_ref.setBorder(null);
        signup_ref.setOpaque(false);
        add(signup_ref);
        signup_ref.setBounds(370, 340, 280, 40);

        signin_ref_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_ref_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/input_bg.png"))); // NOI18N
        signin_ref_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(signin_ref_bg);
        signin_ref_bg.setBounds(350, 330, 320, 60);

        signup_ref_title.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signup_ref_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signup_ref_title.setText("Referral Code");
        add(signup_ref_title);
        signup_ref_title.setBounds(360, 310, 100, 20);

        signup_pass.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        signup_pass.setBorder(null);
        signup_pass.setOpaque(false);
        add(signup_pass);
        signup_pass.setBounds(370, 260, 280, 40);

        signup_pass_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_pass_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/input_bg.png"))); // NOI18N
        signup_pass_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(signup_pass_bg);
        signup_pass_bg.setBounds(350, 250, 320, 60);

        signup_pass_title.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signup_pass_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signup_pass_title.setText("Password");
        add(signup_pass_title);
        signup_pass_title.setBounds(360, 230, 70, 20);

        signup_user.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signup_user.setBorder(null);
        signup_user.setOpaque(false);
        add(signup_user);
        signup_user.setBounds(370, 180, 280, 40);

        signup_user_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_user_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/input_bg.png"))); // NOI18N
        signup_user_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(signup_user_bg);
        signup_user_bg.setBounds(350, 170, 320, 60);

        signup_user_title.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signup_user_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signup_user_title.setText("Username");
        add(signup_user_title);
        signup_user_title.setBounds(360, 150, 80, 20);

        signup_title.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        signup_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_title.setText("Vall Gym Database");
        add(signup_title);
        signup_title.setBounds(350, 50, 320, 60);

        signup_title2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        signup_title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_title2.setText("Sign up to connect to the gym’s database");
        add(signup_title2);
        signup_title2.setBounds(350, 100, 320, 20);

        signup_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/white_bg_signup.png"))); // NOI18N
        signup_bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(signup_bg);
        signup_bg.setBounds(280, 10, 460, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void signup_signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_signinMouseEntered
        signup_signin.setForeground(new java.awt.Color(153, 153, 153));
    }//GEN-LAST:event_signup_signinMouseEntered

    private void signup_signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_signinMouseExited
        signup_signin.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_signup_signinMouseExited

    private void signup_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_signinActionPerformed
        Music.sfx();
        reset();
        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "signin");
    }//GEN-LAST:event_signup_signinActionPerformed

    private void signup_signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_signupMouseEntered
        signup_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signup_button_hover.png")));
    }//GEN-LAST:event_signup_signupMouseEntered

    private void signup_signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_signupMouseExited
        signup_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signup_button.png")));
    }//GEN-LAST:event_signup_signupMouseExited

    private void signup_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_signupActionPerformed
        Music.sfx();
        signup_incorrect.setVisible(false);
        signup_incorrect_ref.setVisible(false);
        
        username_final = signup_user.getText();
        char[] password = signup_pass.getPassword();
        password_final = new String(password);
        java.util.Arrays.fill(password, ' ');
        
        try(java.sql.Connection conn = java.sql.DriverManager.getConnection(VallGym.DB_URL, "employer", "employer2024");
        ) {
            java.sql.Statement stmt = conn.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            if(signup_user.getText().length() > 3 && password_final.length() > 5) {
                java.sql.ResultSet ref = stmt.executeQuery("select * from referral_codes where code = '" + signup_ref.getText() + "';");
                if (!ref.next()) {
                    signup_incorrect_ref.setVisible(true);
                } else {
                    String referral_final = ref.getString("code");
                    
                    java.sql.ResultSet exists = stmt.executeQuery("select exists(select * from mysql.user WHERE user = '" + signup_user.getText() + "' AND host = 'localhost');");
                    exists.next();
                    
                    if(exists.getInt("exists(select * from mysql.user WHERE user = '" + signup_user.getText() + "' AND host = 'localhost')") == 0) {
                        
                        String delete = "delete from referral_codes where code = '" + referral_final + "';";
                        stmt.executeUpdate(delete);

                        String create_user = "create user '" + username_final + "'@'localhost' identified by '" + password_final + "';";
                        stmt.executeUpdate(create_user);

                        String privileges = "grant all privileges on vallgym.* to '" + username_final + "'@'localhost' with grant option;";
                        stmt.executeUpdate(privileges);
                        
                        
                        
                        reset();
                        VallGym.mainMenu.card.show(VallGym.mainMenu.cardPanel, "signin");
                    } else {
                        signup_incorrect.setVisible(true);
                    }
                }
            } else {
                signup_incorrect.setVisible(true);
            }
            
            conn.close();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signup_signupActionPerformed

    private void signup_ref_infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_ref_infoMouseEntered
        signup_ref_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/referral_hover.png")));
        java.awt.Point p = signup_ref_info.getLocationOnScreen();
        popup.setLocation(p.x, p.y + signup_ref_info.getHeight());
        popup.setVisible(true);
    }//GEN-LAST:event_signup_ref_infoMouseEntered

    private void signup_ref_infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_ref_infoMouseExited
        signup_ref_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/referral.png")));
        popup.setVisible(false);
    }//GEN-LAST:event_signup_ref_infoMouseExited

    public void reset() {
        signup_incorrect.setVisible(false);
        signup_incorrect_ref.setVisible(false);
        
        signup_user.setText("");
        signup_pass.setText("");
        signup_ref.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel signin_ref_bg;
    private javax.swing.JLabel signup_bg;
    public javax.swing.JLabel signup_incorrect;
    public javax.swing.JLabel signup_incorrect_ref;
    private javax.swing.JPasswordField signup_pass;
    private javax.swing.JLabel signup_pass_bg;
    private javax.swing.JLabel signup_pass_title;
    private javax.swing.JTextField signup_ref;
    private javax.swing.JButton signup_ref_info;
    private javax.swing.JLabel signup_ref_title;
    private javax.swing.JButton signup_signin;
    private javax.swing.JButton signup_signup;
    private javax.swing.JLabel signup_title;
    private javax.swing.JLabel signup_title2;
    private javax.swing.JTextField signup_user;
    private javax.swing.JLabel signup_user_bg;
    private javax.swing.JLabel signup_user_title;
    // End of variables declaration//GEN-END:variables
}
