package GUI;

import Shpes.CustomLinePanel;
import Shpes.RoundButton;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    //-------Obj-------//
    JFrame frame = new JFrame();
    RoundButton UserBtnLogin = new RoundButton();
    RoundButton AdminBtnLogin = new RoundButton();
    JLabel UserLabel = new JLabel("Customer", SwingConstants.CENTER);
    JLabel AdminLabel = new JLabel("Chef", SwingConstants.CENTER);
    JLabel labelRestaurantName = new JLabel();
    JLabel UserLabelQuote = new JLabel();
    JLabel AdminLabelQuote = new JLabel();
    JLabel imageLabel = new JLabel();
    JPanel panelBackground1 = new JPanel();
    JPanel panelBackground2 = new JPanel();
    CustomLinePanel linePanel1 = new CustomLinePanel();
    CustomLinePanel linePanel2 = new CustomLinePanel();

    public MainFrame() {
        /*-------Frame-------*/
        frame.setTitle("Bite Byte Restaurant");
        ImageIcon frameLogo = new ImageIcon("C:\\Users\\CodeFather\\Downloads\\ImageProject-3-\\Restaurant Logo.png");
        Image frameImage = frameLogo.getImage();
        frame.setIconImage(frameImage);
        frame.setSize(600, 800);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*-------User Modifies Components*/
        //-------User Button Login-------//
        UserBtnLogin.setBounds(350, 20, 200, 200);
        ImageIcon iconUser = new ImageIcon("C:\\Users\\CodeFather\\Downloads\\ImageProject-3-\\Chef Hat.png");
        Image imgUser = iconUser.getImage();
        Image scaledImgUser = imgUser.getScaledInstance(UserBtnLogin.getWidth(), UserBtnLogin.getHeight(), Image.SCALE_AREA_AVERAGING);
        iconUser = new ImageIcon(scaledImgUser);
        UserBtnLogin.setIcon(iconUser);

        //-------User Label Login-------//
        UserLabel.setBounds(350, 220, 200, 40);
        UserLabel.setFont(new Font("Arial", Font.ITALIC, 30));
        UserLabel.setForeground(Color.WHITE);

        //-------User Text Login-------//
        UserLabelQuote.setText("<html><body style='width: 400px; line-height: 5;'>"  //&nbsp;&nbsp;&nbsp; == tab
                + "Our Happiness Lies in<br>"
                + "Your Satisfaction<br>"
                + "Savor Each Bite<br>"
                + "Day or Night<br>"
                + "Fuel Your Day With Us!"
                + "</body></html>");
        UserLabelQuote.setFont(new Font("Playwrite Australia Victoria Guides", Font.ITALIC, 30));
        UserLabelQuote.setForeground(Color.white);
        UserLabelQuote.setBounds(20, 10, 660, 240);

        /*-------Admin Modifies Components*/
        //-------Admin Button Login-------//
        AdminBtnLogin.setBounds(20, 470, 200, 200);
        ImageIcon iconAdmin = new ImageIcon("C:\\Users\\CodeFather\\Downloads\\ImageProject-3-\\Chef Hat.png");
        Image imgAdmin = iconAdmin.getImage();
        Image scaledImgAdmin = imgAdmin.getScaledInstance(AdminBtnLogin.getWidth(), AdminBtnLogin.getHeight(), Image.SCALE_AREA_AVERAGING);
        iconAdmin = new ImageIcon(scaledImgAdmin);
        AdminBtnLogin.setIcon(iconAdmin);

        //-------Admin Label Login-------//
        AdminLabel.setBounds(20, 670, 200, 40);
        AdminLabel.setFont(new Font("Arial", Font.ITALIC, 30));
        AdminLabel.setForeground(Color.WHITE);

        //-------Admin Text Login-------//
        AdminLabelQuote.setText("<html><body style='width: 400px; line-height: 5;'>"  //&nbsp;&nbsp;&nbsp; == tab
                + "The Chefs And Servers<br>"
                + "You are The Heroes<br>"
                + "Behind The Scenes.<br>"
                + "You are The Reason <br>"
                + "That Our Guests Keep<br>"
                + "Coming Back"
                + "</body></html>");
        AdminLabelQuote.setFont(new Font("Playwrite Australia Victoria Guides", Font.ITALIC, 30));
        AdminLabelQuote.setForeground(Color.white);
        AdminLabelQuote.setBounds(240, 450, 600, 230);


        /*-------Name of Restaurant Label Login-------*/
//        labelRestaurantName.setText("Bite Byte");
//        labelRestaurantName.setOpaque(true);
//        labelRestaurantName.setBackground(new Color(0xd3c7b5));
//        labelRestaurantName.setForeground(Color.WHITE);
//        labelRestaurantName.setFont(new Font("Monospace", Font.BOLD, 38));
//        labelRestaurantName.setHorizontalAlignment(SwingConstants.CENTER);
//        labelRestaurantName.setBounds(160, 335, 300, 50);

        //-------Restaurant Image Label-------//
        ImageIcon icon = new ImageIcon("C:\\Users\\CodeFather\\Downloads\\ImageProject-3-\\Chefimg+name.png");
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(300, 250, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        imageLabel.setIcon(icon);
        imageLabel.setBounds(135, 180, 300, 300);  // Center
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);


        /*-------Line Panel-------*/
        linePanel1.setBounds(0, 335, 600, 10); // width and high for the line
        linePanel2.setBounds(0, 375, 600, 10); // width and high for the line


        /*-------Backgrounds Panel-------*/
        panelBackground1.setBackground(new Color(0xd3c7b5));
        panelBackground1.setLayout(new BorderLayout());

        panelBackground2.setBackground(new Color(0x2c384a));
        panelBackground2.setLayout(null);


        /*-------Adding Components-------*/
        panelBackground2.add(UserBtnLogin);
        panelBackground2.add(UserLabel);
        panelBackground2.add(UserLabelQuote);
        //--------------//
        panelBackground2.add(AdminBtnLogin);
        panelBackground2.add(AdminLabel);
        panelBackground2.add(AdminLabelQuote);
        //--------------//
        panelBackground2.add(labelRestaurantName);
        panelBackground2.add(imageLabel);
        //--------------//
        panelBackground2.add(linePanel1);
        panelBackground2.add(linePanel2);
        //--------------//
        panelBackground1.add(panelBackground2, BorderLayout.CENTER);
        panelBackground1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // For spaces
        //--------------//
        frame.add(panelBackground1);
        frame.setVisible(true);
    }
}
