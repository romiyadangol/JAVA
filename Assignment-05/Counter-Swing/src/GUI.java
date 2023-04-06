import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
        int count = 1;
        JLabel label = new JLabel(); // initialize countLabel
        JButton increButton = new JButton("Increment");
        JButton decreButton = new JButton("Decrement");

        public GUI() {
            setTitle("Counter");
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            //setLocationRelativeTo(null);
            setLayout(null);
            setSize(300,300);
            setResizable(false);

            // Create components
            //increButton.setBounds(125, 200, 120, 30);
            increButton.addActionListener(this);
            //decreButton.setBounds(125, 165, 120, 30);
            decreButton.addActionListener(this);

            // Add components to content pane
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            c.add(increButton, BorderLayout.NORTH);
            c.add(decreButton, BorderLayout.SOUTH);
            c.add(label, BorderLayout.CENTER);

            label.setText(Integer.toString(count)); // set initial value
            label.setHorizontalAlignment(JLabel.CENTER);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == increButton) {
                count++;
                label.setText(Integer.toString(count));
            }
            if (e.getSource() == decreButton) {
                count--;
                label.setText(Integer.toString(count));
            }
        }
    }

