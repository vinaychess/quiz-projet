package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, back;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quize_my.jpg"));
        Image i = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450,0,550,500);
        add(image);

        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        heading.setForeground(new Color(0,0,0));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        name.setForeground(new Color(0,0,0));
        add(name);

        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        add(text);

        back = new JButton("Back");
        back.setBounds(100,270,120,25);
        back.setBackground(new Color(25,173,202));
       back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        Next = new JButton("Next");
        Next.setBounds(250,270,120,25);
        Next.setBackground(new Color(25,173,202));
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);


        setSize(1000,500);
        setLocation(200,150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next){
            String name = text.getText();
            setVisible(false);
            new Rules(name);
        } else if (e.getSource() == back) {
            System.exit(50);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
