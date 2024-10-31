package ifpr.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ifpr.models.Donor;

public class MakeDonation extends JFrame {
    private JTextField donorNameField;
    private JTextField donationAmountField;

    public MakeDonation() {
        setTitle("Make a Donation");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        JLabel donorNameLabel = new JLabel("Donor Name:");
        donorNameField = new JTextField();
        JLabel donationAmountLabel = new JLabel("Amount:");
        donationAmountField = new JTextField();

        JButton donateButton = new JButton("Donate");

        panel.add(donorNameLabel);
        panel.add(donorNameField);
        panel.add(donationAmountLabel);
        panel.add(donationAmountField);
        panel.add(new JLabel()); // Empty placeholder
        panel.add(donateButton);

        add(panel);

        donateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String donorName = donorNameField.getText();
                String amount = donationAmountField.getText();

                // Process donation here
                System.out.println("Donor: " + donorName + ", Amount: " + amount);
            }
        });
    }
}
