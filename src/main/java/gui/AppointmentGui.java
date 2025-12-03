package gui;

import javax.swing.*;

public class AppointmentGui {
    public static void main(String[] args) {

        //Start with a basic window:
        JFrame frame = new JFrame("Appointment Scheduler");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Add Input Fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel dateLabel = new JLabel("Date:");
        JTextField dateField = new JTextField(10);

        JButton addButton = new JButton("Add Appointment");

        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(dateLabel);
        panel.add(dateField);
        panel.add(addButton);

        frame.add(panel);

        //Connect the GUI to the Existing Logic
        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String date = dateField.getText();
            // Call the existing method to save appointment
            System.out.println("Appointment added for " + name + " on " + date);
        });


    }
}
