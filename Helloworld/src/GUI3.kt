import java.awt.BorderLayout
import java.awt.Font
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JOptionPane
import javax.swing.SwingConstants

fun main() {
    // Create the frame
    val frame = JFrame("Hello World App")
    frame.setSize(300, 200)
    frame.defaultCloseOperation = JFrame.DO_NOTHING_ON_CLOSE
    frame.layout = BorderLayout()

    // Create label
    val label = JLabel("Hello World", SwingConstants.CENTER)
    label.font = Font("Arial", Font.BOLD, 18)

    // Create Exit button
    val exitButton = JButton("Exit")

    exitButton.addActionListener {
        val choice = JOptionPane.showConfirmDialog(
            frame,
            "Are you sure you want to exit?",
            "Confirm Exit",
            JOptionPane.YES_NO_OPTION
        )

        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0)
        }
    }

    // Add components
    frame.add(label, BorderLayout.CENTER)
    frame.add(exitButton, BorderLayout.SOUTH)

    // Center and show
    frame.setLocationRelativeTo(null)
    frame.isVisible = true
}
