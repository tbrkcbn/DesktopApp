package com.tbrkcbn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    private JButton AppointmentButton;
    private JPanel MainPanel;
    private JButton TransactionRecordButton;
    private JButton StockTrackingButton;
    private JButton ExitButton;

    public App(){
        add(MainPanel);
        setSize(450,550);
        setTitle("Randevu Uygulaması");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //For close the application
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


    }
}
