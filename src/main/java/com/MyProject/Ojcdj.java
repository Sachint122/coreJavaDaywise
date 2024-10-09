package com.MyProject;
import javax.swing.*;
import java.awt.*;

public class Ojcdj extends JPanel {

    private int size;

    // Constructor to set the size of the heart
    public Ojcdj(int size) {
        this.size = size;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Cast to Graphics2D for better control
        Graphics2D g2d = (Graphics2D) g;

        // Set color to red
        g2d.setColor(Color.RED);

        // Calculate the size of the heart based on the given size
        int width = size * 10;  // Scale width dynamically
        int height = size * 10; // Scale height dynamically
        int x = getWidth() / 2 - width / 2;  // Center horizontally
        int y = getHeight() / 4;             // Position near top

        // Draw the top curves of the heart
        g2d.fillArc(x, y, width / 2, height / 2, 0, 180);         // Left half
        g2d.fillArc(x + width / 2, y, width / 2, height / 2, 0, 180); // Right half

        // Draw the bottom triangle of the heart
        int[] xPoints = {x, x + width / 2, x + width};  // 3 points for bottom triangle
        int[] yPoints = {y + height / 4, y + height, y + height / 4};
        g2d.fillPolygon(xPoints, yPoints, 3);
    }

    // Create the frame and display the heart
    public static void createAndShowGUI(int size) {
        JFrame frame = new JFrame("Red Heart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);  // Set window size
        frame.setLocationRelativeTo(null); // Center the window

        // Add the panel with the heart, passing the dynamic size
        frame.add(new Ojcdj(size));

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Get the heart size from the user
        String input = JOptionPane.showInputDialog(null, "Enter the size of the heart (1-10):", "Heart Size", JOptionPane.QUESTION_MESSAGE);
        int size = Integer.parseInt(input);
        int n=size;

        // Ensure size is within bounds (1 to 10)
        if (size < 1 || size > 10) {
            size = 5;  // Default size if input is out of bounds
        }

        // Run the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> createAndShowGUI(n));
    }
}
