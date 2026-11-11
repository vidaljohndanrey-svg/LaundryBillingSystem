
package LaunSys;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StaffLogin {

    public StaffLogin() {

        JFrame frame = new JFrame();
        frame.setTitle("LAUNDRY BILLING SYSTEM - EMPLOYEE");
        frame.setSize(1400, 800);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // ===== COMPONENTS =====
        JPanel panel = new JPanel();
        JPanel swpanel = new JPanel();
        JPanel wpanel = new JPanel();
        JPanel tb = new JPanel();

        JLabel ttl = new JLabel("LAUNDRY BILLING SYSTEM - EMPLOYEE");
        JLabel logln = new JLabel(
                "Welcome! Please login to continue",
                SwingConstants.CENTER
        );
        JLabel adlg = new JLabel("EMPLOYEE LOGIN", SwingConstants.CENTER);
        JLabel passlbl = new JLabel("Password (Enter Password)");
        JLabel uselbl = new JLabel("Username (Enter Username)");

        JButton bck = new JButton(" Exit");
        JButton login = new JButton("-> Log In");
        JButton cl = new JButton("X");
        JButton mn = new JButton("-");
        JButton mx = new JButton("□");

        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();

        // ===== MAIN WHITE BACKGROUND =====
        panel.setBounds(0, 40, 1400, 760);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        frame.add(panel);

        // ===== BLUE BORDER PANEL =====
        swpanel.setBounds(200, 50, 975, 650);
        swpanel.setBackground(new Color(0, 102, 204));
        swpanel.setLayout(null);
        panel.add(swpanel);

        // ===== INNER WHITE PANEL =====
        wpanel.setBounds(5, 5, 965, 640);
        wpanel.setBackground(Color.WHITE);
        wpanel.setLayout(null);
        swpanel.add(wpanel);

        // ===== TITLE BAR =====
        tb.setBounds(0, 0, 1400, 40);
        tb.setBackground(new Color(0, 102, 204));
        tb.setLayout(null);
        frame.add(tb);

        ttl.setFont(new Font("Arial", Font.BOLD, 18));
        ttl.setForeground(Color.WHITE);
        ttl.setBounds(15, 5, 500, 30);
        tb.add(ttl);

        // ===== MINIMIZE BUTTON =====
        mn.setBounds(1250, 0, 50, 40);
        mn.setBorderPainted(false);
        mn.setForeground(Color.WHITE);
        mn.setBackground(new Color(0, 102, 204));
        mn.setFocusPainted(false);
        tb.add(mn);

        // ===== MAXIMIZE BUTTON =====
        mx.setBounds(1300, 0, 50, 40);
        mx.setBorderPainted(false);
        mx.setForeground(Color.WHITE);
        mx.setBackground(new Color(0, 102, 204));
        mx.setFocusPainted(false);
        tb.add(mx);

        // ===== CLOSE BUTTON =====
        cl.setBounds(1350, 0, 50, 40);
        cl.setBorderPainted(false);
        cl.setForeground(Color.WHITE);
        cl.setBackground(Color.RED);
        cl.setFocusPainted(false);
        tb.add(cl);

        // ===== WELCOME MESSAGE =====
        logln.setFont(new Font("Segoe Script", Font.BOLD, 28));
        logln.setForeground(new Color(0, 70, 140));
        logln.setBounds(150, 60, 650, 45);
        wpanel.add(logln);

        // ===== EMPLOYEE LOGIN TITLE =====
        adlg.setFont(new Font("Arial", Font.BOLD, 42));
        adlg.setForeground(new Color(0, 70, 140));
        adlg.setBounds(150, 120, 650, 55);
        wpanel.add(adlg);

        // ===== USERNAME LABEL =====
        uselbl.setFont(new Font("Arial", Font.BOLD, 25));
        uselbl.setForeground(new Color(0, 70, 140));
        uselbl.setBounds(220, 200, 515, 40);
        wpanel.add(uselbl);

        // ===== USERNAME FIELD =====
        user.setFont(new Font("Arial", Font.PLAIN, 22));
        user.setBounds(220, 245, 515, 55);
        wpanel.add(user);

        // ===== PASSWORD LABEL =====
        passlbl.setFont(new Font("Arial", Font.BOLD, 25));
        passlbl.setForeground(new Color(0, 70, 140));
        passlbl.setBounds(220, 320, 515, 40);
        wpanel.add(passlbl);

        // ===== PASSWORD FIELD =====
        pass.setFont(new Font("Arial", Font.PLAIN, 22));
        pass.setBounds(220, 365, 515, 55);
        wpanel.add(pass);

        // ===== LOGIN BUTTON =====
        login.setFont(new Font("Arial", Font.BOLD, 26));
        login.setForeground(Color.WHITE);
        login.setBackground(new Color(0, 102, 204));
        login.setBounds(220, 450, 515, 65);
        login.setFocusPainted(false);
        wpanel.add(login);

        // ===== BACK BUTTON =====
        bck.setFont(new Font("Arial", Font.BOLD, 22));
        bck.setForeground(Color.WHITE);
        bck.setBackground(new Color(200, 50, 50));
        bck.setBounds(220, 530, 515, 55);
        bck.setFocusPainted(false);
        wpanel.add(bck);

        // ===== LOGIN VALIDATION =====
        login.addActionListener(e -> {

            String username = user.getText().trim();
            String password = new String(pass.getPassword());

            if (username.equals("staff") &&
                password.equals("1234")) {

                frame.dispose();
                new StaffMenu();

            } else {

                JOptionPane.showMessageDialog(
                    frame,
                    "Invalid username or password!",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE
                );

                pass.setText("");
            }
        });

        // ===== BACK BUTTON ACTION =====
        bck.addActionListener(e -> {
         frame.dispose();
          
        });

        // ===== CLOSE BUTTON ACTION =====
        cl.addActionListener(e -> {
            frame.dispose();
        });

        // ===== MINIMIZE BUTTON ACTION =====
        mn.addActionListener(e -> {
            frame.setState(JFrame.ICONIFIED);
        });

        // ===== MAXIMIZE / RESTORE BUTTON ACTION =====
        final boolean[] maximized = {false};

        mx.addActionListener(e -> {

            if (!maximized[0]) {
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                maximized[0] = true;
            } else {
                frame.setExtendedState(JFrame.NORMAL);
                frame.setSize(1400, 800);
                frame.setLocationRelativeTo(null);
                maximized[0] = false;
            }
        });

        // ===== SHOW WINDOW =====
        frame.setVisible(true);
    }
}