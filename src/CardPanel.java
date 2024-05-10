import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CardPanel extends javax.swing.JPanel {
    public static java.awt.CardLayout card = new java.awt.CardLayout();
    
    public static MainMenu panel_main = new MainMenu();
    public static SignIn panel_signin = new SignIn();
    public static SignUp panel_signup = new SignUp();
    public static EditMenu panel_edit = new EditMenu();
    public static ReferralEdit panel_ref = new ReferralEdit();
    public static UserEdit panel_user = new UserEdit();
    public static WorkoutEdit panel_work = new WorkoutEdit();
    public static DietEdit panel_diet = new DietEdit();
    public static RoutineEdit panel_routine = new RoutineEdit();
    public static MealEdit panel_meal = new MealEdit();
    public static ExerciseEdit panel_exer = new ExerciseEdit();
    
    public CardPanel() {
        initComponents();

        cardPanel.setLayout(card);
        cardPanel.add(panel_main, "main");
        cardPanel.add(panel_signin, "signin");
        cardPanel.add(panel_signup, "signup");
        cardPanel.add(panel_edit, "edit_menu");
        cardPanel.add(panel_ref, "ref_edit");
        cardPanel.add(panel_user, "user_edit");
        cardPanel.add(panel_work, "workout_edit");
        cardPanel.add(panel_diet, "diet_edit");
        cardPanel.add(panel_routine, "routine_edit");
        cardPanel.add(panel_meal, "meal_edit");
        cardPanel.add(panel_exer, "exer_edit");
        
        card.show(cardPanel, "main");
        
        main_return.setVisible(false);
        main_signout.setVisible(false);
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                Date currentTime = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
                main_time.setText(sdf.format(currentTime));
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        cardPanel = new javax.swing.JPanel();
        main_sound = new javax.swing.JButton();
        main_return = new javax.swing.JButton();
        main_signin = new javax.swing.JButton();
        main_signout = new javax.swing.JButton();
        main_taskbar_title = new javax.swing.JLabel();
        main_taskbar_logo = new javax.swing.JLabel();
        main_taskbar_bar = new javax.swing.JLabel();
        main_time = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(null);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFocusPainted(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        add(exit);
        exit.setBounds(1040, 20, 20, 20);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimize.png"))); // NOI18N
        minimize.setBorder(null);
        minimize.setBorderPainted(false);
        minimize.setContentAreaFilled(false);
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.setFocusPainted(false);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        add(minimize);
        minimize.setBounds(1010, 20, 20, 20);

        cardPanel.setMinimumSize(new java.awt.Dimension(1210, 580));
        cardPanel.setOpaque(false);
        cardPanel.setPreferredSize(new java.awt.Dimension(1008, 518));
        cardPanel.setLayout(new java.awt.CardLayout());
        add(cardPanel);
        cardPanel.setBounds(30, 130, 1020, 530);

        main_sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sound_on.png"))); // NOI18N
        main_sound.setBorder(null);
        main_sound.setBorderPainted(false);
        main_sound.setContentAreaFilled(false);
        main_sound.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_sound.setFocusPainted(false);
        main_sound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                main_soundMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                main_soundMouseExited(evt);
            }
        });
        main_sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_soundActionPerformed(evt);
            }
        });
        add(main_sound);
        main_sound.setBounds(520, 670, 40, 40);

        main_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return.png"))); // NOI18N
        main_return.setBorder(null);
        main_return.setBorderPainted(false);
        main_return.setContentAreaFilled(false);
        main_return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_return.setFocusPainted(false);
        main_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                main_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                main_returnMouseExited(evt);
            }
        });
        main_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_returnActionPerformed(evt);
            }
        });
        add(main_return);
        main_return.setBounds(980, 70, 40, 40);

        main_signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signin.png"))); // NOI18N
        main_signin.setBorder(null);
        main_signin.setBorderPainted(false);
        main_signin.setContentAreaFilled(false);
        main_signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_signin.setFocusPainted(false);
        main_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                main_signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                main_signinMouseExited(evt);
            }
        });
        main_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_signinActionPerformed(evt);
            }
        });
        add(main_signin);
        main_signin.setBounds(930, 70, 90, 40);

        main_signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signout.png"))); // NOI18N
        main_signout.setBorder(null);
        main_signout.setBorderPainted(false);
        main_signout.setContentAreaFilled(false);
        main_signout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main_signout.setFocusPainted(false);
        main_signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                main_signoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                main_signoutMouseExited(evt);
            }
        });
        main_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_signoutActionPerformed(evt);
            }
        });
        add(main_signout);
        main_signout.setBounds(930, 70, 90, 40);

        main_taskbar_title.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        main_taskbar_title.setForeground(new java.awt.Color(255, 255, 255));
        main_taskbar_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        main_taskbar_title.setText("Vall Gym");
        main_taskbar_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(main_taskbar_title);
        main_taskbar_title.setBounds(120, 60, 170, 60);

        main_taskbar_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_taskbar_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/taskbar_logo.png"))); // NOI18N
        main_taskbar_logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(main_taskbar_logo);
        main_taskbar_logo.setBounds(60, 60, 50, 60);

        main_taskbar_bar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_taskbar_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/taskbar_bg.png"))); // NOI18N
        main_taskbar_bar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(main_taskbar_bar);
        main_taskbar_bar.setBounds(30, 50, 1020, 80);

        main_time.setFont(new java.awt.Font("Montserrat", 1, 15)); // NOI18N
        main_time.setForeground(new java.awt.Color(255, 255, 255));
        main_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(main_time);
        main_time.setBounds(970, 680, 80, 20);

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/background.jpg"))); // NOI18N
        main_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(main_bg);
        main_bg.setBounds(0, 0, 1080, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close_hover.png")));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close.png")));
    }//GEN-LAST:event_exitMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimize_hover.png")));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimize.png")));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        VallGym.mainFrame.setState(java.awt.Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void main_signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_signinMouseEntered
        main_signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signin_hover.png")));
    }//GEN-LAST:event_main_signinMouseEntered

    private void main_signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_signinMouseExited
        main_signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signin.png")));
    }//GEN-LAST:event_main_signinMouseExited

    private void main_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_signinActionPerformed
        Music.sfx();
        
        main_return.setVisible(true);
        main_signin.setVisible(false);
        main_signout.setVisible(false);
        
        card.show(cardPanel, "signin");
    }//GEN-LAST:event_main_signinActionPerformed

    private void main_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_returnMouseEntered
        main_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return_hover.png")));
    }//GEN-LAST:event_main_returnMouseEntered

    private void main_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_returnMouseExited
        main_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return.png")));
    }//GEN-LAST:event_main_returnMouseExited

    private void main_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_returnActionPerformed
        Music.sfx();
        
        main_return.setVisible(false);
        main_signin.setVisible(true);
        main_signout.setVisible(false);
        
        VallGym.statistics();
        
        card.show(cardPanel, "main");
    }//GEN-LAST:event_main_returnActionPerformed

    private void main_soundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_soundMouseEntered
        if(VallGym.sound)
            main_sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sound_on_hover.png")));
        else
            main_sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sound_off_hover.png")));
    }//GEN-LAST:event_main_soundMouseEntered

    private void main_soundMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_soundMouseExited
        if(VallGym.sound)
            main_sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sound_on.png")));
        else
            main_sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sound_off.png")));
    }//GEN-LAST:event_main_soundMouseExited

    private void main_soundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_soundActionPerformed
        Music.sfx();
        if(VallGym.sound) {
            VallGym.sound = false;
            Music.bgMusic.pause();
            main_sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sound_off.png")));
        } else {
            VallGym.sound = true;
            Music.bgMusic.play();
            main_sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sound_on.png")));
        }
    }//GEN-LAST:event_main_soundActionPerformed

    private void main_signoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_signoutMouseEntered
        main_signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signout_hover.png")));
    }//GEN-LAST:event_main_signoutMouseEntered

    private void main_signoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_signoutMouseExited
        main_signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signout.png")));
    }//GEN-LAST:event_main_signoutMouseExited

    private void main_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_signoutActionPerformed
        Music.sfx();
        
        main_return.setVisible(false);
        main_signin.setVisible(true);
        main_signout.setVisible(false);
        
        panel_signin.reset();
        panel_signup.reset();
        panel_edit.reset();
        panel_ref.reset();
        panel_user.reset();
        panel_work.reset();
        panel_diet.reset();
        panel_routine.reset();
        panel_meal.reset();
        panel_exer.reset();
        panel_work.workoutList();
        
        VallGym.statistics();
        
        panel_edit.resetTable();
        panel_edit.user_search_input.setText("");
        
        card.show(cardPanel, "main");
    }//GEN-LAST:event_main_signoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel cardPanel;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel main_bg;
    public javax.swing.JButton main_return;
    public javax.swing.JButton main_signin;
    public javax.swing.JButton main_signout;
    private javax.swing.JButton main_sound;
    private javax.swing.JLabel main_taskbar_bar;
    private javax.swing.JLabel main_taskbar_logo;
    private javax.swing.JLabel main_taskbar_title;
    private javax.swing.JLabel main_time;
    private javax.swing.JButton minimize;
    // End of variables declaration//GEN-END:variables
}
