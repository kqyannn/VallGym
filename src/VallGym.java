import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class VallGym extends javax.swing.JFrame {
    public static JFrame mainFrame = new JFrame();
    public static JPanel mainPanel = new JPanel();
    public static CardLayout card = new CardLayout();
    
    public static CardPanel mainMenu = new CardPanel();
    
    public static boolean sound = true;
    
    public VallGym() {
        // FONTS
        try {
            java.awt.Font montserrat_medium = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT,
                    getClass().getClassLoader().getResourceAsStream("Montserrat-Medium.ttf"));
            java.awt.GraphicsEnvironment ge = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(montserrat_medium);
        } catch (java.io.IOException | java.awt.FontFormatException e) {
            e.printStackTrace();
        }
        try {
            java.awt.Font montserrat_regular = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT,
                    getClass().getClassLoader().getResourceAsStream("Montserrat-Regular.ttf"));
            java.awt.GraphicsEnvironment ge = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(montserrat_regular);
        } catch (java.io.IOException | java.awt.FontFormatException e) {
            e.printStackTrace();
        }
        
        mainFrame.setSize(1080, 720);
        mainFrame.setTitle("DiskSim");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setUndecorated(true);
        
        mainPanel.setLayout(card);
        mainPanel.add(mainMenu, "1");
        
        mainFrame.add(mainPanel);
        mainFrame.pack();
        
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        
        card.show(mainPanel, "1");
        Music.bgMusic();
        
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                card.show(mainPanel, "2");
            }
        }, 2 * 1000); // Miliseconds
    }

    public static final String DB_URL = "jdbc:mysql://localhost:3306/vallgym";
    static final String USER = "viewer";
    static final String PASS = "password";
    static final String QUERY = "select count(*) from member;";
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VallGym();
            }
        });
        
        statistics();
    }
    
    public static void statistics() {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            ResultSet member_count = stmt.executeQuery("select count(*) from member;");
            if (member_count.next()) {
                mainMenu.panel_main.menu_stat_mem.setText(String.valueOf(member_count.getInt("count(*)")));
            }
            ResultSet workout_count = stmt.executeQuery("select count(*) from workout;");
            if (workout_count.next()) {
                mainMenu.panel_main.menu_stat_work.setText(String.valueOf(workout_count.getInt("count(*)")));
            }
            ResultSet diet_count = stmt.executeQuery("select count(*) from diet;");
            if (diet_count.next()) {
                mainMenu.panel_main.menu_stat_diet.setText(String.valueOf(diet_count.getInt("count(*)")));
            }
            ResultSet routine_count = stmt.executeQuery("select count(*) from routine;");
            if (routine_count.next()) {
                mainMenu.panel_main.menu_stat_routine.setText(String.valueOf(routine_count.getInt("count(*)")));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(VallGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
}