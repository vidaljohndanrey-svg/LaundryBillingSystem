
package LaunSys;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;

public class AdminMenu {

    public AdminMenu() {

        JFrame frame = new JFrame("LAUNDRY BILLING SYSTEM - ADMIN");
        frame.setSize(1400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);

        // ===== COLORS =====
        Color lightBlue = new Color(235, 248, 255);
        Color darkBlue = new Color(0, 70, 140);
        Color buttonBlue = new Color(0, 102, 204);
        Color red = new Color(200, 55, 55);

        // ===== BACKGROUND =====
        JPanel background = new JPanel();
        background.setLayout(null);
        background.setBackground(lightBlue);
        background.setBounds(0, 0, 1400, 800);
        frame.setContentPane(background);

        // ===== HEADER =====
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(darkBlue);
        header.setBounds(0, 0, 1400, 100);
        background.add(header);

        JLabel adminAccess = new JLabel("ADMIN ACCESS");
        adminAccess.setFont(new Font("Arial", Font.BOLD, 18));
        adminAccess.setForeground(Color.WHITE);
        adminAccess.setBounds(40, 10, 250, 25);
        header.add(adminAccess);

        JLabel title = new JLabel("LAUNDRY BILLING SYSTEM");
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(Color.WHITE);
        title.setBounds(40, 38, 650, 45);
        header.add(title);

        // ===== LEFT SIDE =====
        JLabel welcome = new JLabel(
                "Welcome, Administrator!", SwingConstants.CENTER);
        welcome.setFont(new Font("Arial", Font.BOLD, 30));
        welcome.setForeground(darkBlue);
        welcome.setBounds(70, 135, 550, 50);
        background.add(welcome);

        // ===== WASHING MACHINE IMAGE =====
        ImageIcon originalIcon = new ImageIcon(
                "C:\\Users\\john danrey\\OneDrive\\Pictures\\wahingmachine.png");

        if (originalIcon.getIconWidth() > 0) {
            Image washingImage = originalIcon.getImage()
                    .getScaledInstance(300, 300, Image.SCALE_SMOOTH);

            JLabel washingLabel = new JLabel(new ImageIcon(washingImage));
            washingLabel.setBounds(190, 190, 300, 300);
            background.add(washingLabel);
        } else {
            JLabel imageNote = new JLabel(
                    "Washing Machine Image Not Found");
            imageNote.setFont(new Font("Arial", Font.PLAIN, 16));
            imageNote.setForeground(darkBlue);
            imageNote.setBounds(150, 300, 400, 40);
            background.add(imageNote);
        }

        JLabel slogan = new JLabel(
                "Clean Clothes - Fresh Life", SwingConstants.CENTER);
        slogan.setFont(new Font("Segoe Script", Font.BOLD, 22));
        slogan.setForeground(darkBlue);
        slogan.setBounds(70, 500, 550, 45);
        background.add(slogan);

        JLabel betterService = new JLabel(
                "Better Service, Brighter Days!", SwingConstants.CENTER);
        betterService.setFont(new Font("Segoe Script", Font.PLAIN, 19));
        betterService.setForeground(darkBlue);
        betterService.setBounds(70, 550, 550, 40);
        background.add(betterService);

        // ===== BUTTON FONT =====
        Font buttonFont = new Font("Arial", Font.BOLD, 23);

        // ===== TRANSACTION RECORD BUTTON =====
        JButton transactionButton = new JButton("TRANSACTION RECORD");
        transactionButton.setFont(buttonFont);
        transactionButton.setForeground(Color.WHITE);
        transactionButton.setBackground(buttonBlue);
        transactionButton.setBounds(760, 240, 500, 85);
        transactionButton.setFocusPainted(false);
        transactionButton.setBorder(
                BorderFactory.createEmptyBorder(10, 20, 10, 20));
        transactionButton.setHorizontalAlignment(SwingConstants.CENTER);
        background.add(transactionButton);

        transactionButton.addActionListener(e -> {
            new HistoryTransactions().setVisible(true);
        });

        // ===== LOG OUT BUTTON =====
        JButton logoutButton = new JButton("LOG OUT");
        logoutButton.setFont(buttonFont);
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setBackground(red);
        logoutButton.setBounds(760, 355, 500, 85);
        logoutButton.setFocusPainted(false);
        logoutButton.setBorder(
                BorderFactory.createEmptyBorder(10, 20, 10, 20));
        logoutButton.setHorizontalAlignment(SwingConstants.CENTER);
        background.add(logoutButton);

        logoutButton.addActionListener(e -> {
            frame.dispose();
            new Login();
        });

        // ===== SHOW WINDOW =====
        frame.setVisible(true);
    }
}
