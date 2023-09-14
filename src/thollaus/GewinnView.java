package thollaus;

import javax.swing.*;
import java.awt.*;

public class GewinnView extends JFrame {
      private JButton nocheinmal;
      private JLabel gesamtPunkte = new JLabel("Punkte gesamt:");
      private JLabel spielerZahl = new JLabel("Aktuelles Ergebnis:");

      public GewinnView(){
            setTitle("Gewinnspiel");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            setSize(450, 300);
            setLocationRelativeTo(null);

            JPanel oben = new JPanel();
            oben.setLayout(new GridLayout( 3, 2));

            gesamtPunkte.setHorizontalAlignment((SwingConstants.CENTER));
            oben.add(gesamtPunkte);
            spielerZahl.setHorizontalAlignment(SwingConstants.CENTER);
            oben.add(spielerZahl);

            oben.add(new JLabel("?"));
            oben.add(new JLabel("?"));

            add(oben, BorderLayout.PAGE_START);


            nocheinmal = new JButton("Noch Einmal!");
            add(nocheinmal, BorderLayout.SOUTH);

            setVisible(true);
      }
}
