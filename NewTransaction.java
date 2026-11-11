
package LaunSys;

import javax.swing.*;
import java.awt.*;


import javax.swing.*;
import java.awt.*;

public class NewTransaction extends JFrame {

    private JTextField nameField;
    private JTextField customerNoField;
    private JTextField weightField;
    private JTextField priceField;
    private JTextField paidField;

    private JComboBox<String> serviceBox;

    private JLabel totalLabel;
    private JLabel changeLabel;

    private JButton receiptButton;

    private String savedReceipt = "";

    private static int transactionCounter = 1;
    private final String staffId = "ST001";

    public NewTransaction() {
        setTitle("Laundry Billing System - Staff");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ===== HEADER =====
        JPanel header = new JPanel(new BorderLayout(15, 5));
        header.setBackground(new Color(0, 91, 180));
        header.setBorder(
            BorderFactory.createEmptyBorder(20, 25, 20, 25)
        );

        JLabel title = new JLabel("NEW TRANSACTION");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel slogan = new JLabel("Clean Clothes - Fresh Life");
        slogan.setForeground(Color.WHITE);
        slogan.setFont(new Font("Arial", Font.ITALIC, 15));

        header.add(title, BorderLayout.WEST);
        header.add(slogan, BorderLayout.EAST);

        add(header, BorderLayout.NORTH);

        // ===== MAIN CONTENT =====
        JPanel mainPanel = new JPanel(
            new GridLayout(1, 2, 20, 0)
        );
        mainPanel.setBackground(new Color(240, 248, 255));
        mainPanel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        // ===== LEFT SIDE =====
        JPanel leftPanel = new JPanel(
            new GridLayout(2, 1, 0, 15)
        );
        leftPanel.setBackground(new Color(240, 248, 255));

        // ===== CUSTOMER INFORMATION =====
        JPanel customerPanel = new JPanel(
            new GridBagLayout()
        );
        customerPanel.setBackground(Color.WHITE);
        customerPanel.setBorder(
            BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(
                    new Color(135, 206, 250), 2
                ),
                "CUSTOMER INFORMATION"
            )
        );

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 10, 12, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;

        JLabel nameLabel = new JLabel("Customer Name:");
        nameField = new JTextField(15);

        JLabel customerNoLabel = new JLabel("Customer No.:");
        customerNoField = new JTextField(15);

        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        customerNoLabel.setFont(new Font("Arial", Font.BOLD, 14));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        customerPanel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        customerPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        customerPanel.add(customerNoLabel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        customerPanel.add(customerNoField, gbc);

        // ===== SERVICE DETAILS =====
        JPanel servicePanel = new JPanel(
            new GridBagLayout()
        );
        servicePanel.setBackground(Color.WHITE);
        servicePanel.setBorder(
            BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(
                    new Color(135, 206, 250), 2
                ),
                "SERVICE DETAILS"
            )
        );

        JLabel serviceLabel = new JLabel("Service Type:");

        String[] services = {
            "Wash & Dry", "Wash Only", "Dry Only"
        };

        serviceBox = new JComboBox<>(services);

        JLabel weightLabel = new JLabel("Weight (kg):");
        weightField = new JTextField(15);

        JLabel priceLabel = new JLabel("Price per kg:");
        priceField = new JTextField("₱0.00");
        priceField.setEditable(false);
        priceField.setBackground(new Color(225, 238, 250));

        serviceLabel.setFont(new Font("Arial", Font.BOLD, 14));
        weightLabel.setFont(new Font("Arial", Font.BOLD, 14));
        priceLabel.setFont(new Font("Arial", Font.BOLD, 14));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(12, 10, 12, 10);
        servicePanel.add(serviceLabel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        servicePanel.add(serviceBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        servicePanel.add(weightLabel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        servicePanel.add(weightField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        servicePanel.add(priceLabel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        servicePanel.add(priceField, gbc);

        // ===== COMPUTE AND RECEIPT BUTTONS =====
        JButton computeButton = new JButton("COMPUTE");
        receiptButton = new JButton("PRINT RECEIPT");
        receiptButton.setEnabled(false);

        computeButton.setFont(new Font("Arial", Font.BOLD, 17));
        computeButton.setBackground(new Color(0, 105, 240));
        computeButton.setForeground(Color.WHITE);
        computeButton.setFocusPainted(false);

        receiptButton.setFont(new Font("Arial", Font.BOLD, 17));
        receiptButton.setBackground(new Color(0, 140, 90));
        receiptButton.setForeground(Color.WHITE);
        receiptButton.setFocusPainted(false);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.insets = new Insets(10, 10, 5, 10);
        servicePanel.add(computeButton, gbc);

        gbc.gridy = 4;
        gbc.insets = new Insets(5, 10, 10, 10);
        servicePanel.add(receiptButton, gbc);

        leftPanel.add(customerPanel);
        leftPanel.add(servicePanel);

        // ===== RIGHT SIDE =====
        JPanel rightPanel = new JPanel(
            new BorderLayout(0, 15)
        );
        rightPanel.setBackground(new Color(240, 248, 255));

        // ===== BILL SUMMARY =====
        JPanel billPanel = new JPanel(
            new GridBagLayout()
        );
        billPanel.setBackground(Color.WHITE);
        billPanel.setBorder(
            BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(
                    new Color(120, 220, 180), 2
                ),
                "BILL SUMMARY"
            )
        );

        JLabel totalTitle = new JLabel("Total Amount:");
        totalLabel = new JLabel("₱0.00");

        JLabel paidTitle = new JLabel("Amount Paid:");
        paidField = new JTextField(12);

        JLabel changeTitle = new JLabel("Change:");
        changeLabel = new JLabel("₱0.00");

        totalLabel.setOpaque(true);
        totalLabel.setBackground(new Color(205, 255, 225));
        totalLabel.setHorizontalAlignment(SwingConstants.CENTER);

        changeLabel.setOpaque(true);
        changeLabel.setBackground(new Color(255, 240, 190));
        changeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        totalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        changeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        totalTitle.setFont(new Font("Arial", Font.BOLD, 14));
        paidTitle.setFont(new Font("Arial", Font.BOLD, 14));
        changeTitle.setFont(new Font("Arial", Font.BOLD, 14));

        gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        billPanel.add(totalTitle, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        billPanel.add(totalLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        billPanel.add(paidTitle, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        billPanel.add(paidField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        billPanel.add(changeTitle, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        billPanel.add(changeLabel, gbc);

        // ===== COMPUTE ACTION =====
        computeButton.addActionListener(e -> {
            try {
                double weight = Double.parseDouble(
                    weightField.getText().trim()
                );

                if (weight <= 0) {
                    JOptionPane.showMessageDialog(
                        this,
                        "Weight must be greater than zero."
                    );
                    return;
                }

                LaundryService laundryService =
                    getSelectedLaundryService();

                double rate = laundryService.getRatePerKg();
                double total = laundryService.calculateBill(weight);

                priceField.setText(String.format("₱%.2f", rate));
                totalLabel.setText(String.format("₱%.2f", total));

                double amountPaid = Double.parseDouble(
                    paidField.getText().trim()
                );

                if (amountPaid < 0) {
                    changeLabel.setText("₱0.00");

                    JOptionPane.showMessageDialog(
                        this,
                        "Amount paid cannot be negative."
                    );
                    return;
                }

                if (amountPaid < total) {
                    changeLabel.setText("₱0.00");

                    JOptionPane.showMessageDialog(
                        this,
                        "Amount paid is not enough."
                    );
                    return;
                }

                double change = amountPaid - total;
                changeLabel.setText(String.format("₱%.2f", change));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this,
                    "Please enter a valid weight and amount paid."
                );
            }
        });

        // ===== ACTION BUTTONS =====
        JPanel actionPanel = new JPanel(
            new GridLayout(3, 1, 10, 12)
        );
        actionPanel.setBackground(new Color(240, 248, 255));

        JButton confirmButton =
            new JButton("✓  CONFIRM TRANSACTION");

        JButton clearButton = new JButton("CLEAR");
        JButton backButton = new JButton("←  BACK");

        confirmButton.setBackground(new Color(0, 170, 110));
        confirmButton.setForeground(Color.WHITE);

        clearButton.setBackground(new Color(255, 195, 0));
        clearButton.setForeground(new Color(20, 60, 120));

        backButton.setBackground(new Color(205, 220, 240));
        backButton.setForeground(new Color(20, 60, 120));

        confirmButton.setFont(new Font("Arial", Font.BOLD, 15));
        confirmButton.setFocusPainted(false);

        clearButton.setFont(new Font("Arial", Font.BOLD, 15));
        clearButton.setFocusPainted(false);

        backButton.setFont(new Font("Arial", Font.BOLD, 15));
        backButton.setFocusPainted(false);

        // ===== CLEAR ACTION =====
        clearButton.addActionListener(e -> {
            nameField.setText("");
            customerNoField.setText("");
            weightField.setText("");
            priceField.setText("₱0.00");
            paidField.setText("");
            totalLabel.setText("₱0.00");
            changeLabel.setText("₱0.00");
            serviceBox.setSelectedIndex(0);

            savedReceipt = "";
            receiptButton.setEnabled(false);
        });

        // ===== BACK ACTION =====
        backButton.addActionListener(e -> dispose());

        // ===== CONFIRM ACTION =====
        confirmButton.addActionListener(e -> {
            try {
                String customerName = nameField.getText().trim();
                String customerNo = customerNoField.getText().trim();
                String service = (String) serviceBox.getSelectedItem();

                if (customerName.isEmpty()
                        || customerNo.isEmpty()
                        || weightField.getText().trim().isEmpty()
                        || paidField.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(
                        this,
                        "Please complete all fields."
                    );
                    return;
                }

                double weight = Double.parseDouble(
                    weightField.getText().trim()
                );

                double amountPaid = Double.parseDouble(
                    paidField.getText().trim()
                );

                if (weight <= 0) {
                    JOptionPane.showMessageDialog(
                        this,
                        "Weight must be greater than zero."
                    );
                    return;
                }

                if (amountPaid < 0) {
                    JOptionPane.showMessageDialog(
                        this,
                        "Amount paid cannot be negative."
                    );
                    return;
                }

                // Use abstraction and polymorphism
                LaundryService laundryService =
                    getSelectedLaundryService();

                double rate = laundryService.getRatePerKg();
                double total = laundryService.calculateBill(weight);

                if (amountPaid < total) {
                    JOptionPane.showMessageDialog(
                        this,
                        "Amount paid is not enough."
                    );
                    return;
                }

                double change = amountPaid - total;

                // Update bill summary
                priceField.setText(String.format("₱%.2f", rate));
                totalLabel.setText(String.format("₱%.2f", total));
                changeLabel.setText(String.format("₱%.2f", change));

                // Generate transaction number
                String transactionNo = String.format(
                    "TR-%03d", transactionCounter
                );

                // Create transaction object
                Transaction transaction = new Transaction(
                    transactionNo,
                    staffId,
                    customerName,
                    customerNo,
                    service,
                    weight,
                    total
                );

                // Save transaction
                TransactionHistory.addTransaction(transaction);

                // Generate receipt using the confirmed values
                savedReceipt =
                    "      LAUNDRY BILLING SYSTEM\n" +
                    "         CUSTOMER RECEIPT\n" +
                    "----------------------------------\n" +
                    "Transaction No.: " + transactionNo + "\n" +
                    "Staff ID: " + staffId + "\n" +
                    "Customer Name: " + customerName + "\n" +
                    "Customer No.: " + customerNo + "\n" +
                    "Service: " + service + "\n" +
                    String.format("Weight: %.2f kg%n", weight) +
                    String.format("Price per kg: ₱%.2f%n", rate) +
                    "----------------------------------\n" +
                    String.format("Total Amount: ₱%.2f%n", total) +
                    String.format("Amount Paid: ₱%.2f%n", amountPaid) +
                    String.format("Change: ₱%.2f%n", change) +
                    "----------------------------------\n" +
                    "Thank you for choosing our service!\n" +
                    "    Clean Clothes - Fresh Life";

                transactionCounter++;
                receiptButton.setEnabled(true);

                JOptionPane.showMessageDialog(
                    this,
                    "Transaction saved successfully!\n" +
                    "Transaction No.: " + transactionNo
                );

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numbers for weight and payment."
                );
            }
        });

        // ===== VIEW RECEIPT ACTION =====
        receiptButton.addActionListener(e -> {
            if (savedReceipt.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "Please confirm the transaction first."
                );
                return;
            }

            JTextArea receiptArea = new JTextArea(savedReceipt);
            receiptArea.setEditable(false);
            receiptArea.setFont(
                new Font("Monospaced", Font.PLAIN, 13)
            );
            receiptArea.setMargin(
                new Insets(15, 15, 15, 15)
            );

            JOptionPane.showMessageDialog(
                this,
                new JScrollPane(receiptArea),
                "Customer Receipt",
                JOptionPane.INFORMATION_MESSAGE
            );
        });

        actionPanel.add(confirmButton);
        actionPanel.add(clearButton);
        actionPanel.add(backButton);

        rightPanel.add(billPanel, BorderLayout.CENTER);
        rightPanel.add(actionPanel, BorderLayout.SOUTH);

        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        add(mainPanel, BorderLayout.CENTER);
    }

    // ===== SELECT SERVICE: POLYMORPHISM =====
    private LaundryService getSelectedLaundryService() {
        String service = (String) serviceBox.getSelectedItem();

        if ("Wash & Dry".equals(service)) {
            return new WashDryService();
        } else if ("Wash Only".equals(service)) {
            return new WashOnlyService();
        } else {
            return new DryOnlyService();
        }
    }
}
