package MainFrameCopies;

import Shpes.CustomLinePanel;
import Shpes.RoundButton;
import javax.swing.*;
import java.awt.*;

public class MainFrameTest1 extends JFrame {
    //-------Obj-------//
    JFrame frame = new JFrame();
    RoundButton UserBtnLogin = new RoundButton();
    RoundButton AdminBtnLogin = new RoundButton();
    JLabel labelUser = new JLabel("Customer", SwingConstants.CENTER);
    JLabel labelAdmin = new JLabel("Manager", SwingConstants.CENTER);
    JLabel labelRestaurantName = new JLabel();
    JLabel labelTextUser = new JLabel();
    JLabel labelTextAdmin = new JLabel();
    JLabel imageLabel = new JLabel();
    JPanel panelBackground1 = new JPanel();
    JPanel panelBackground2 = new JPanel();
    CustomLinePanel linePanel1 = new CustomLinePanel();
    CustomLinePanel linePanel2 = new CustomLinePanel();


    public MainFrameTest1() {
        //-------Frame-------//
        frame.setTitle("Bite Byte Restaurant");
        frame.setSize(600, 800);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//!      /*-------User Modifies Components*/
        //-------User Button Login-------//
        UserBtnLogin.setBounds(350, 20, 200, 200);
        ImageIcon iconUser = new ImageIcon("C:\\Users\\CodeFather\\Pictures\\ImageProject-3-\\profile.png");
        Image imgUser = iconUser.getImage();
        Image scaledImgUser = imgUser.getScaledInstance(UserBtnLogin.getWidth(), UserBtnLogin.getHeight(), Image.SCALE_AREA_AVERAGING);
        iconUser = new ImageIcon(scaledImgUser);
        UserBtnLogin.setIcon(iconUser);

        //-------User Label Login-------//
        labelUser.setBounds(350, 220, 200, 40);
        labelUser.setFont(new Font("Arial", Font.ITALIC, 30));
        labelUser.setForeground(Color.WHITE);

        //-------User Text Login-------//
        labelTextUser.setText("<html><body style='width: 350px'>"
                + "Our Happiness<br>"
                + "Lies in Your Satisfaction. <br>"
                + "We Hope You Enjoy<br>"
                + "With an Unforgettable Flavor."
                + "</body></html>");
        labelTextUser.setFont(new Font("Playwrite Australia Victoria Guides", Font.ITALIC, 30));
        labelTextUser.setForeground(Color.WHITE);
        labelTextUser.setBounds(20, 40, 600, 200);

//!      /*-------Admin Modifies Components*/
        //-------Admin Button Login-------//
        AdminBtnLogin.setBounds(20, 470, 200, 200);
        ImageIcon iconAdmin = new ImageIcon("C:\\Users\\CodeFather\\Pictures\\ImageProject-3-\\profile.png");
        Image imgAdmin = iconAdmin.getImage();
        Image scaledImgAdmin = imgAdmin.getScaledInstance(AdminBtnLogin.getWidth(), AdminBtnLogin.getHeight(), Image.SCALE_AREA_AVERAGING);
        iconAdmin = new ImageIcon(scaledImgAdmin);
        AdminBtnLogin.setIcon(iconAdmin);

        //-------Admin Label Login-------//
        labelAdmin.setBounds(20, 670, 200, 40);
        labelAdmin.setFont(new Font("Arial", Font.ITALIC, 30));
        labelAdmin.setForeground(Color.WHITE);


        //-------Name Label Login-------//
        labelRestaurantName.setText("Bite Byte");
//        labelRestaurantName.setOpaque(true);
        labelRestaurantName.setBackground(new Color(0x3E5879)); // الأزرق المتوسط
        labelRestaurantName.setForeground(Color.WHITE);
        labelRestaurantName.setFont(new Font("Monospace", Font.BOLD, 38));
        labelRestaurantName.setHorizontalAlignment(SwingConstants.CENTER);
        labelRestaurantName.setBounds(145, 330, 300, 50);


        //-------Image Label-------//
        ImageIcon icon = new ImageIcon("C:\\Users\\CodeFather\\Pictures\\Chef Hat.png");
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(230, 230, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        imageLabel.setIcon(icon);
        imageLabel.setBounds(150, 200,230,230);  // Center
//        imageLabel.setBounds(20, 20, 250, 250);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //-------Line Panel-------//
        linePanel1.setBounds(0, 335, 600, 10); // تعيين موقع وحجم الخط
        linePanel2.setBounds(0, 375, 600, 10); // تعيين موقع وحجم الخط

        //-------Backgrounds Panel-------//
        panelBackground1.setBackground(new Color(0xD8C4B6)); // الأزرق الداكن
        panelBackground1.setLayout(new BorderLayout());

        panelBackground2.setBackground(new Color(0x3E5879)); // البيج
        panelBackground2.setLayout(null);

        /*-------Adding Components-------*/
        frame.add(panelBackground1);
        panelBackground1.add(panelBackground2, BorderLayout.CENTER);
        panelBackground1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // For spaces
        panelBackground2.add(UserBtnLogin);
        panelBackground2.add(labelUser);
        panelBackground2.add(AdminBtnLogin);
        panelBackground2.add(labelAdmin);
        panelBackground2.add(labelRestaurantName);
        panelBackground2.add(labelTextUser);
        panelBackground2.add(imageLabel);
        panelBackground2.add(linePanel1);
        panelBackground2.add(linePanel2);
        frame.setVisible(true);
    }

}
