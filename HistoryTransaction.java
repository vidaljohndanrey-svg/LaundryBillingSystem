
package LaunSys;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HistoryTransactions extends JFrame {

    public HistoryTransactions() {
        setTitle("Laundry Billing System - Transaction History");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // TABLE COLUMNS
        String[] columns = {
            "Transaction No.",
            "Staff ID",
            "Customer Name",
            "Customer No.",
            "Service Type",
            "Weight (kg)",
            "Total Amount"
        };

        DefaultTableModel model =
            new DefaultTableModel(columns, 0);

        JTable table = new JTable(model);

        // DISPLAY SAVED TRANSACTIONS
        for (Transaction t :
                TransactionHistory.getTransactions()) {

            model.addRow(new Object[]{
                t.getTransactionNo(),
                t.getStaffId(),
                t.getCustomerName(),
                t.getCustomerNo(),
                t.getServiceType(),
                t.getWeight(),
                String.format("₱%.2f", t.getTotalAmount())
            });
        }

        // TABLE DESIGN
        table.setRowHeight(28);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.getTableHeader().setFont(
            new Font("Arial", Font.BOLD, 14)
        );

        add(new JScrollPane(table), BorderLayout.CENTER);

        // SORT BUTTON
        JButton sortButton = new JButton("SORT BY AMOUNT");

        sortButton.addActionListener(e -> {
            TransactionHistory.bubbleSortByAmount();
            dispose();
            new HistoryTransactions().setVisible(true);
        });

        // CLOSE BUTTON
        JButton closeButton = new JButton("CLOSE");
        closeButton.addActionListener(e -> dispose());

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(sortButton);
        bottomPanel.add(closeButton);

        add(bottomPanel, BorderLayout.SOUTH);
    }
}
