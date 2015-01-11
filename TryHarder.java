package test1.examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class TryHarder extends JFrame {

    public TryHarder() {
        initUI();
    }

    public final void initUI() {

       JPanel panel = new JPanel();
       getContentPane().add(panel);

       panel.setLayout(null);

       JButton quitButton = new JButton("Commit Sudoku");
       quitButton.setBounds(50, 60, 140, 40);
       //(x,y,Width,Height)
       quitButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               System.exit(0);
          }
       });

       panel.add(quitButton);

       setTitle("Commit Sudoku?");
       setSize(300, 200);
       //(Width,Height)
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
           TryHarder ex = new TryHarder();
           ex.setVisible(true);
    }
}
