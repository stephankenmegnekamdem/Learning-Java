import javax.swing.*;
import java.awt.*;

public class Main {

    // ===== Conversion method (based on your code) =====
    static int base2tobase10(long[] A, int N) {
        int c = 0;
        int j = N - 1;
        int num10 = 0;

        while (j >= 0) {
            num10 = num10 + (int) (A[j] * Math.pow(2, c));
            c++;
            j--;
        }
        return num10;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Base 2 to Base 10 Converter");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // ===== Page 1: Input Page =====
        JPanel inputPanel = new JPanel(new BorderLayout());

        JLabel promptLabel = new JLabel("Enter a base 2 number:", JLabel.CENTER);
        JTextField inputField = new JTextField();
        JButton convertButton = new JButton("Convert");

        inputPanel.add(promptLabel, BorderLayout.NORTH);
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(convertButton, BorderLayout.SOUTH);

        // ===== Page 2: Result Page =====
        JPanel resultPanel = new JPanel(new BorderLayout());

        JLabel resultLabel = new JLabel("", JLabel.CENTER);
        JButton backButton = new JButton("Back");

        resultPanel.add(resultLabel, BorderLayout.CENTER);
        resultPanel.add(backButton, BorderLayout.SOUTH);

        // ===== Button Logic =====
        convertButton.addActionListener(e -> {
            String binaryString = inputField.getText();

            // Validate input (only 0s and 1s)
            if (!binaryString.matches("[01]+")) {
                JOptionPane.showMessageDialog(frame,
                        "Please enter a valid base 2 number (0s and 1s only).");
                return;
            }

            // Convert string to array
            int N = binaryString.length();
            long[] A = new long[N];

            for (int i = 0; i < N; i++) {
                A[i] = binaryString.charAt(i) - '0';
            }

            int result = base2tobase10(A, N);

            resultLabel.setText(binaryString + " in base 10 is: " + result);
            cardLayout.show(mainPanel, "result");
        });

        backButton.addActionListener(e -> {
            inputField.setText("");
            cardLayout.show(mainPanel, "input");
        });

        // ===== Add pages to CardLayout =====
        mainPanel.add(inputPanel, "input");
        mainPanel.add(resultPanel, "result");

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
