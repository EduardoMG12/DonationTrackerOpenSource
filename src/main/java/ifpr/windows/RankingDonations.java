package ifpr.windows;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import ifpr.models.Donor;

public class RankingDonations extends JFrame {

    public RankingDonations(List<Donor> donors) {
        setTitle("Donation Ranking");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnNames = {"Donor Name", "Total Donated"};
        String[][] data = new String[donors.size()][2];

        for (int i = 0; i < donors.size(); i++) {
            data[i][0] = donors.get(i).getName();
            data[i][1] = String.valueOf(donors.get(i).getTotalDonated());
        }

        JTable rankingTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(rankingTable);
        add(scrollPane);
    }
}
