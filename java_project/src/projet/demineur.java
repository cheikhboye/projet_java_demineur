package projet;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class demineur extends JFrame {

    private JLabel statusbar;

    public demineur() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new tableau(statusbar));

        setResizable(false);
        pack();

        setTitle("Demineur");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new demineur();
            ex.setVisible(true);
        });
    }
}
