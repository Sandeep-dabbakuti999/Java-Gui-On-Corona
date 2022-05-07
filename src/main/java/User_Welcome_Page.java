import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_Welcome_Page implements ActionListener {

    JFrame frame=new JFrame();

    JButton Submit=new JButton("Submit");
    JLabel Fever=new JLabel("Fever*");
    ButtonGroup group1=new ButtonGroup();
    ButtonGroup group2=new ButtonGroup();
    ButtonGroup group3=new ButtonGroup();
    ButtonGroup group4=new ButtonGroup();
    ButtonGroup group5=new ButtonGroup();
    ButtonGroup group6=new ButtonGroup();
    ButtonGroup group7=new ButtonGroup();
    ButtonGroup group8=new ButtonGroup();

    JRadioButton With_fever=new JRadioButton("Yes");
    JRadioButton No_fever=new JRadioButton("No");


    JLabel Cold=new JLabel("Cold*");
    JRadioButton With_Cold=new JRadioButton("Yes");
    JRadioButton No_Cold=new JRadioButton("No");


    JLabel Cough=new JLabel("Cough* ");
    JRadioButton With_Cough=new JRadioButton("Yes");
    JRadioButton No_Cough=new JRadioButton("No");


    JLabel Headache=new JLabel("Headache*");
    JRadioButton With_Headache=new JRadioButton("Yes");
    JRadioButton No_Headache=new JRadioButton("No");

    JLabel Body_aches=new JLabel("Body aches*");
    JRadioButton With_Body_aches=new JRadioButton("Yes");
    JRadioButton No_Body_aches=new JRadioButton("No");

    JLabel Breathing_Trouble=new JLabel("Breathing Trouble*");
    JRadioButton With_Breathing_Trouble=new JRadioButton("Yes");
    JRadioButton No_Breathing_Trouble=new JRadioButton("No");
    JLabel Vomiting=new JLabel("Vomiting*");
    JRadioButton With_Vomiting=new JRadioButton("Yes");
    JRadioButton No_Vomiting=new JRadioButton("No");
    User_Welcome_Page(){
        Toolkit tk=Toolkit.getDefaultToolkit();
        int Width= (int) tk.getScreenSize().getWidth();
        int Height=(int) tk.getScreenSize().getHeight();
        Fever.setBounds(450,50,150,40);
        Fever.setFont(new Font(null,Font.ITALIC,18));
        With_fever.setBounds(450,90,80,40);
        No_fever.setBounds(570,90,80,40);
        Cough.setBounds(450,130,150,40);
        Cough.setFont(new Font(null,Font.ITALIC,18));
        With_Cough.setBounds(450,170,80,40);
        No_Cough.setBounds(570,170,80,40);
        Cold.setBounds(450,210,150,40);
        Cold.setFont(new Font(null,Font.ITALIC,18));
        With_Cold.setBounds(450,240,80,40);
        No_Cold.setBounds(570,240,80,40);
        Headache.setBounds(450,290,150,40);
        Headache.setFont(new Font(null,Font.ITALIC,18));
        With_Headache.setBounds(450,320,80,40);
        No_Headache.setBounds(570,320,80,40);
        Body_aches.setBounds(450,370,150,40);
        Body_aches.setFont(new Font(null,Font.ITALIC,18));
        With_Body_aches.setBounds(450,410,80,40);
        No_Body_aches.setBounds(570,410,80,40);
        Breathing_Trouble.setBounds(450,450,350,40);
        Breathing_Trouble.setFont(new Font(null,Font.ITALIC,18));
        With_Breathing_Trouble.setBounds(450,490,80,40);
        No_Breathing_Trouble.setBounds(570,490,80,40);
        Vomiting.setBounds(450,530,350,40);
        Vomiting.setFont(new Font(null,Font.ITALIC,18));
        With_Vomiting.setBounds(450,560,80,40);
        No_Vomiting.setBounds(570,560,80,40);
        Submit.setBounds(450,610,240,40);
        Submit.setFocusable(false);
        Submit.setBackground(Color.darkGray);
        Submit.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        Submit.addActionListener(this);


        frame.add(Submit);
        frame.add(Fever);
        frame.add(With_fever);
        frame.add(No_fever);
        group1.add(With_fever);
        group1.add(No_fever);
        frame.add(Cough);
        frame.add(With_Cough);
        frame.add(No_Cough);
        group2.add(With_Cough);
        group2.add(No_Cough);
        frame.add(Cold);
        frame.add(With_Cold);
        frame.add(No_Cold);
        group3.add(With_Cold);
        group3.add(No_Cold);
        frame.add(Headache);
        frame.add(With_Headache);
        frame.add(No_Headache);
        group4.add(With_Headache);
        group4.add(No_Headache);
        frame.add(Body_aches);
        frame.add(With_Body_aches);
        frame.add(No_Body_aches);
        group5.add(With_Body_aches);
        group5.add(No_Body_aches);
        frame.add(Breathing_Trouble);
        frame.add(With_Breathing_Trouble);
        frame.add(No_Breathing_Trouble);
        group6.add(With_Breathing_Trouble);
        group7.add(No_Breathing_Trouble);
        frame.add(Vomiting);
        frame.add(With_Vomiting);
        frame.add(No_Vomiting);
        group8.add(With_Vomiting);
        group8.add(No_Vomiting);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Width,Height);
        frame.setLayout(null);
        frame.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Submit) {

        }

    }



}


