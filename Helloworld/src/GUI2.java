 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class GUI2 {

        public static void main(String[] args) {
            // Create the frame
            JFrame frame = new JFrame("Hello World App");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Create a label
            JLabel label = new JLabel("Hello World", JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));

            // Create Exit button
            JButton exitButton = new JButton("Exit");

            // Button action
            exitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int choice = JOptionPane.showConfirmDialog(
                            frame,
                            "Are you sure you want to exit?",
                            "Confirm Exit",
                            JOptionPane.YES_NO_OPTION
                    );

                    if (choice == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                }
            });

            // Add components to frame
            frame.add(label, BorderLayout.CENTER);
            frame.add(exitButton, BorderLayout.SOUTH);

            // Make frame visible
            frame.setLocationRelativeTo(null); // center on screen
            frame.setVisible(true);
        }
    }


