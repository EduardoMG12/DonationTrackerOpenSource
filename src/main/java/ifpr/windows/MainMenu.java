package ifpr.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import ifpr.models.Donor;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Donation Tracker - Main Menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10));

        JButton loginButton = new JButton("Login Screen");
        JButton registerButton = new JButton("Register Screen");
        JButton donationButton = new JButton("Make a Donation");
        JButton rankingButton = new JButton("View Donation Ranking");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login loginScreen = new Login();
                loginScreen.setVisible(true);
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register registerScreen = new Register();
                registerScreen.setVisible(true);
            }
        });

        donationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MakeDonation donationScreen = new MakeDonation();
                donationScreen.setVisible(true);
            }
        });

        rankingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Dados fictícios para exibir na tela de ranking
                List<Donor> donors = new ArrayList<>();
                donors.add(new Donor(1, "Alice", 150.0));
                donors.add(new Donor(2, "Bob", 200.0));
                donors.add(new Donor(3, "Charlie", 50.0));

                RankingDonations rankingScreen = new RankingDonations(donors);
                rankingScreen.setVisible(true);
            }
        });

        add(loginButton);
        add(registerButton);
        add(donationButton);
        add(rankingButton);
    }
}
