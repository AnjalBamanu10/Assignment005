import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CounterApp extends JFrame implements ActionListener {
    private int counter = 1;
    private JLabel counterLabel;

    public CounterApp() {
        // Set up the frame
        setTitle("Counter App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());

        // Add the counter label
        counterLabel = new JLabel("Counter: " + counter, SwingConstants.CENTER);
        add(counterLabel, BorderLayout.CENTER);

        // Add the buttons
        JButton incrementButton = new JButton("Increment");
        JButton decrementButton = new JButton("Decrement");
        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(incrementButton);
        buttonPanel.add(decrementButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Show the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Increment")) {
            counter++;
        } else if (e.getActionCommand().equals("Decrement")) {
            counter--;
        }
        counterLabel.setText("Counter: " + counter);
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
