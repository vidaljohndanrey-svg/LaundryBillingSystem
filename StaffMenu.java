
package LaunSys;
import javax.swing.*;
import java.awt.*;


public class StaffMenu{ 
JFrame frame = new JFrame();
  public StaffMenu(){ 

        frame.setTitle("Laundry Billing System");

        JPanel panel = new JPanel();
        panel.setBackground(new Color(242, 248, 255));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel LPanel = new JPanel();
        LPanel.setLayout(new BoxLayout(LPanel, BoxLayout.Y_AXIS));
        LPanel.setBackground(new Color(242, 248, 255));
        LPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel Rpanel = new JPanel();
        Rpanel.setLayout(new GridLayout(4, 1, 0, 10));
        Rpanel.setPreferredSize(new Dimension(280,180));
        Rpanel.setBackground(new Color(242, 248, 255));
        Rpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ===== WASHING MACHINE PICTURE =====
        ImageIcon washer = new ImageIcon(
                "C:\\Users\\john danrey\\OneDrive\\Pictures\\wahingmachine.png");

        Image img = washer.getImage();
        Image resizedImg = img.getScaledInstance(
                200, 200, Image.SCALE_SMOOTH);

        ImageIcon resizedWasher = new ImageIcon(resizedImg);
        JLabel washerLabel = new JLabel(resizedWasher);

        washerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        LPanel.add(washerLabel);

        // ===== TITLE =====
        JLabel title = new JLabel("LAUNDRY BILLING SYSTEM");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(new Color(0, 70, 140));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        LPanel.add(title);

        // ===== SUBTITLE =====
        JLabel subtitle = new JLabel("Clean Clothes  •  Fresh Life");
        subtitle.setFont(new Font("Serif", Font.ITALIC, 20));
        subtitle.setForeground(new Color(0, 90, 170));
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        LPanel.add(Box.createVerticalStrut(8));
        LPanel.add(subtitle);

        // ===== NEW TRANSACTION BUTTON =====
        JButton transactionButton = new JButton("NEW TRANSACTION");

        transactionButton.setForeground(Color.WHITE);
        transactionButton.setFont(new Font("Arial", Font.BOLD, 12));
        transactionButton.setFocusPainted(false);
        transactionButton.setBorderPainted(false);
        transactionButton.setOpaque(true);
        transactionButton.setBackground(new Color(37, 99, 235));
        transactionButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Rpanel.add(transactionButton);

        transactionButton.addActionListener(e -> {
            NewTransaction transaction = new NewTransaction();
            transaction.setVisible(true);
        });

       

        

        // ===== EXIT BUTTON =====
        JButton ExitButton = new JButton("EXIT");

        ExitButton.setForeground(Color.WHITE);
        ExitButton.setFont(new Font("Arial", Font.BOLD, 12));
        ExitButton.setFocusPainted(false);
        ExitButton.setBorderPainted(false);
        ExitButton.setOpaque(true);
        ExitButton.setBackground(new Color(220, 65, 65));
        ExitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Rpanel.add(ExitButton);

        ExitButton.addActionListener(e -> {
             frame.dispose();
         new StaffLogin();
          
        });

        // ===== ADMIN LOGIN BUTTON =====
        JButton adminButton = new JButton("ADMIN LOGIN");

        adminButton.setForeground(Color.WHITE);
        adminButton.setFont(new Font("Arial", Font.BOLD, 12));
        adminButton.setFocusPainted(false);
        adminButton.setBorderPainted(false);
        adminButton.setOpaque(true);
        adminButton.setBackground(new Color(112, 82, 175));
        adminButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Rpanel.add(adminButton);

        adminButton.addActionListener(e -> {
            new Login();
        });

        // ===== ADD PANELS =====
        panel.add(LPanel);
        panel.add(Box.createVerticalStrut(20));
        panel.add(Rpanel);

        // ===== FRAME SETTINGS =====
        frame.add(panel);
        frame.setSize(750, 750);
        frame.setMinimumSize(new Dimension(700, 750));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        System.out.println("Laundry Billing System is running");
    }
}


