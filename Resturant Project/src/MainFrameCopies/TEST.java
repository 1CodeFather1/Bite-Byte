package MainFrameCopies;

import Shpes.CustomLinePanel;
import Shpes.RoundButton;

import javax.swing.*;
import java.awt.*;

public class TEST extends JFrame {
    RoundButton UserBtnLogin = new RoundButton();
    RoundButton AdminBtnLogin = new RoundButton();
    JLabel labelUser = new JLabel("Customer", SwingConstants.CENTER);
    JLabel labelAdmin = new JLabel("Manager", SwingConstants.CENTER);
    JLabel labelRestaurantName = new JLabel("Bite Byte", SwingConstants.CENTER);
    JLabel imageLabel = new JLabel();
    JPanel panelBackground1 = new JPanel();
    CustomLinePanel linePanel = new CustomLinePanel();

    public TEST() {
        // إعداد الإطار
        setTitle("ITE Restaurant");
        setSize(600, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // إعداد زر المستخدم
        UserBtnLogin.setBounds(350, 20, 200, 200);
        ImageIcon iconUser = new ImageIcon("C:\\Users\\CodeFather\\Pictures\\ImageProject-3-\\profile.png");
        Image imgUser = iconUser.getImage();
        Image scaledImgUser = imgUser.getScaledInstance(UserBtnLogin.getWidth(), UserBtnLogin.getHeight(), Image.SCALE_AREA_AVERAGING);
        iconUser = new ImageIcon(scaledImgUser);
        UserBtnLogin.setIcon(iconUser);

        // إعداد نص المستخدم
        labelUser.setBounds(350, 220, 200, 40);
        labelUser.setFont(new Font("Arial", Font.BOLD, 30));

        // إعداد زر المدير
        AdminBtnLogin.setBounds(20, 470, 200, 200);
        ImageIcon iconAdmin = new ImageIcon("C:\\Users\\CodeFather\\Pictures\\ImageProject-3-\\profile.png");
        Image imgAdmin = iconAdmin.getImage();
        Image scaledImgAdmin = imgAdmin.getScaledInstance(AdminBtnLogin.getWidth(), AdminBtnLogin.getHeight(), Image.SCALE_AREA_AVERAGING);
        iconAdmin = new ImageIcon(scaledImgAdmin);
        AdminBtnLogin.setIcon(iconAdmin);

        // إعداد نص المدير
        labelAdmin.setBounds(20, 670, 200, 40);
        labelAdmin.setFont(new Font("Arial", Font.BOLD, 30));

        // إعداد نص اسم المطعم
        labelRestaurantName.setBounds(150, 365, 300, 40);
        labelRestaurantName.setFont(new Font("Monospace", Font.BOLD, 30));
        labelRestaurantName.setOpaque(false); // جعل النص شفافاً

        // إعداد الصورة
        ImageIcon icon = new ImageIcon("C:\\Users\\CodeFather\\Pictures\\Chef Hat.png"); // تأكد من تغيير المسار إلى مسار صورتك
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH); // تعيين الحجم المطلوب
        icon = new ImageIcon(scaledImage);
        imageLabel.setIcon(icon);
        imageLabel.setBounds(150, 200, 300, 300); // تأكد من ضبط الموقع والحجم ليتوافق مع النص

        // إعداد JLayeredPane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(600, 800));

        // إضافة العناصر إلى JLayeredPane
        layeredPane.add(imageLabel, Integer.valueOf(1)); // الصورة في الطبقة السفلى
        layeredPane.add(labelRestaurantName, Integer.valueOf(2)); // النص في الطبقة العليا

        // إعداد الحاوية الرئيسية
        panelBackground1.setLayout(new BorderLayout());
        panelBackground1.add(layeredPane, BorderLayout.CENTER);

        // إعداد خط اللوحة
        linePanel.setBounds(0, 380, 600, 10);

        // إضافة الحاوية الرئيسية إلى الإطار
        add(panelBackground1);

        // إضافة المكونات الأخرى إلى الإطار
        panelBackground1.add(UserBtnLogin);
        panelBackground1.add(labelUser);
        panelBackground1.add(AdminBtnLogin);
        panelBackground1.add(labelAdmin);
        panelBackground1.add(linePanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TEST();
    }
}
