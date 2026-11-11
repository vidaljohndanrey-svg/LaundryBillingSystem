
package LaunSys;
import javax.swing.*;
import java.awt.*;

public class Login {

    public Login() {
        JFrame frame = new JFrame("LAUNDRY BILLING SYSTEM - ADMIN USER");
        frame.setSize(1400, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(230, 240, 255));
        frame.setResizable(false);

        // ===== LEFT SIDE =====
        JLabel Adac = new JLabel("Admin Access");
        Adac.setFont(new Font("Arial", Font.BOLD, 20));
        Adac.setForeground(new Color(230, 240, 255));
        Adac.setBounds(70, 675, 200, 30);
        frame.add(Adac);

        JLabel logtxt = new JLabel("LAUNDRY BILLING SYSTEM");
        logtxt.setFont(new Font("Arial", Font.BOLD, 38));
        logtxt.setForeground(new Color(0, 70, 140));
        logtxt.setBounds(45, 365, 650, 55);
        frame.add(logtxt);

        JLabel logln = new JLabel("Clean Clothes - Fresh Life");
        logln.setFont(new Font("Segoe Script", Font.BOLD, 25));
        logln.setForeground(new Color(0, 70, 140));
        logln.setBounds(120, 425, 500, 45);
        frame.add(logln);

        JLabel ver = new JLabel("");
        ver.setFont(new Font("Arial", Font.PLAIN, 16));
        ver.setForeground(new Color(0, 70, 140));
        ver.setBounds(70, 705, 200, 25);
        frame.add(ver);

        // Vertical divider
        JSeparator divider = new JSeparator(SwingConstants.VERTICAL);
        divider.setBounds(700, 100, 2, 620);
        frame.add(divider);

        // ===== RIGHT SIDE: ADMIN LOGIN =====
        JLabel adlg = new JLabel("ADMIN LOGIN", SwingConstants.CENTER);
        adlg.setFont(new Font("Arial", Font.BOLD, 38));
        adlg.setForeground(new Color(0, 70, 140));
        adlg.setOpaque(true);
        adlg.setBackground(new Color(230, 240, 255));
        adlg.setBounds(750, 90, 500, 75);
        frame.add(adlg);

        JLabel uselbl = new JLabel("Username");
        uselbl.setFont(new Font("Arial", Font.BOLD, 26));
        uselbl.setForeground(new Color(0, 70, 140));
        uselbl.setBounds(755, 195, 400, 35);
        frame.add(uselbl);

        JTextField user = new JTextField();
        user.setFont(new Font("Arial", Font.PLAIN, 20));
        user.setBounds(755, 235, 500, 55);
        frame.add(user);

        JLabel passlbl = new JLabel("Password");
        passlbl.setFont(new Font("Arial", Font.BOLD, 26));
        passlbl.setForeground(new Color(0, 70, 140));
        passlbl.setBounds(755, 320, 400, 35);
        frame.add(passlbl);

        JPasswordField pass = new JPasswordField();
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setBounds(755, 360, 500, 55);
        frame.add(pass);

        // ===== LOGIN BUTTON =====
        JButton login = new JButton("LOGIN");
        login.setFont(new Font("Arial", Font.BOLD, 26));
        login.setForeground(Color.WHITE);
        login.setBackground(new Color(0, 130, 230));
        login.setFocusPainted(false);
        login.setBounds(755, 455, 500, 65);
        frame.add(login);

        login.addActionListener(e -> {
            String username = user.getText();
            String password = new String (pass.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(
                    frame, "Login Successful!"
                );

                frame.dispose();
                new AdminMenu();

            } else {
                JOptionPane.showMessageDialog(
                    frame, "Invalid Username or Password!"
                );
            }
        });

        // ===== BACK BUTTON =====
        JButton bck = new JButton("BACK");
        bck.setFont(new Font("Arial", Font.BOLD, 24));
        bck.setForeground(new Color(0, 70, 140));
        bck.setBackground(new Color(200, 225, 245));
        bck.setFocusPainted(false);
        bck.setBounds(755, 540, 500, 60);
        frame.add(bck);

        bck.addActionListener(e -> frame.dispose());

        // ===== FOOTER =====
        JLabel bet = new JLabel("Better Service,");
        bet.setFont(new Font("Segoe Script", Font.BOLD, 18));
        bet.setForeground(new Color(0, 70, 140));
        bet.setBounds(1080, 650, 250, 30);
        frame.add(bet);

        JLabel bri = new JLabel("Brighter Days!");
        bri.setFont(new Font("Segoe Script", Font.BOLD, 18));
        bri.setForeground(new Color(0, 70, 140));
        bri.setBounds(1080, 680, 250, 30);
        frame.add(bri);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
