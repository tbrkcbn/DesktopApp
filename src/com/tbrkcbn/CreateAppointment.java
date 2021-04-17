package com.tbrkcbn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CreateAppointment extends JFrame {
    private JTextField isimTextField;
    private JTextField soyisimTextField;
    private JComboBox islemTuruComboBox;
    private JComboBox gunTarihComboBox;
    private JComboBox ayTarihComboBox;
    private JComboBox yilTarihComboBox;
    private JComboBox saatComboBox;
    private JComboBox dakikaComboBox;
    private JButton kaydetButton;
    private JButton temizleButton;
    private JTextArea infoTextArea;
    private JPanel Panel1;

    public CreateAppointment(){

        add(Panel1);
        setSize(400,500);
        setTitle("Yeni Randevu Kaydı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(isimTextField.getText() != "" && soyisimTextField.getText() != "" ){
                    String yil = yilTarihComboBox.getSelectedItem().toString();
                    String ay = ayTarihComboBox.getSelectedItem().toString();
                    String gun = gunTarihComboBox.getSelectedItem().toString();

                    String newAppointmentDate = gun+"."+ay+"."+yil;
                    //Daha sonra günümüzden önceki tarihe kayıt yapma bug'ı kaldırılmalı
                    if(true){
                        String newAppointmentHour = saatComboBox.getSelectedItem().toString()+":"+dakikaComboBox.getSelectedItem().toString();

                        Appointment appointment = new Appointment(
                                isimTextField.getText(),
                                soyisimTextField.getText(),
                                islemTuruComboBox.getSelectedItem().toString(),
                                newAppointmentDate,
                                newAppointmentHour);
                        infoTextArea.setText(appointment.toString());
                    }
                }
            }
        });


        temizleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isimTextField.setText("");
                soyisimTextField.setText("");
                islemTuruComboBox.setSelectedIndex(0);
                gunTarihComboBox.setSelectedIndex(0);
                ayTarihComboBox.setSelectedIndex(0);
                yilTarihComboBox.setSelectedIndex(0);
                saatComboBox.setSelectedIndex(0);
                dakikaComboBox.setSelectedIndex(0);
                infoTextArea.setText("");
            }
        });
    }
}
