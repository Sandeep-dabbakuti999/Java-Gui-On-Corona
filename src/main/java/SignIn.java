import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignIn implements ActionListener{
    List<User> users = new ArrayList<User>();
    String filePath = "src\\main\\java\\CSV\\DataColect.csv";
    User[] user=new User[8000];

    private int i=0;
    String line="";
    JFrame frame=new JFrame();
    JButton SignUp=new JButton("SignUp");
    JTextField Id=new JTextField();
    JPasswordField password=new JPasswordField();
    JLabel userIdLabel=new JLabel("User Id*");
    JLabel userPassword=new JLabel("Password*");
    JTextField First_name=new JTextField();
    JLabel First_nameLabel=new JLabel("First Name* ");
    JTextField Last_name=new JTextField();
    JLabel Last_nameLabel=new JLabel("Last Name*");
    JTextField email=new JTextField();
    JLabel Email_Label=new JLabel("e-mail*");
    JTextField Address=new JTextField();
    JLabel Address_Label=new JLabel("Address*");
    SignIn(){
        Toolkit tk=Toolkit.getDefaultToolkit();
        int Width= (int) tk.getScreenSize().getWidth();
        int Height=(int) tk.getScreenSize().getHeight();
        First_nameLabel.setBounds(450,50,150,40);
        First_nameLabel.setFont(new Font(null,Font.ITALIC,18));
        Last_nameLabel.setBounds(450,130,150,40);
        Last_nameLabel.setFont(new Font(null,Font.ITALIC,18));
        First_name.setBounds(450,90,350,40);
        Last_name.setBounds(450,170,350,40);
        Email_Label.setBounds(450,210,150,40);
        Email_Label.setFont(new Font(null,Font.ITALIC,18));
        Address_Label.setBounds(450,290,150,40);
        Address_Label.setFont(new Font(null,Font.ITALIC,18));
        email.setBounds(450,250,350,40);
        Address.setBounds(450,330,350,40);
        userIdLabel.setBounds(450,370,150,40);
        userIdLabel.setFont(new Font(null,Font.ITALIC,18));
        userPassword.setBounds(450,450,350,40);
        userPassword.setFont(new Font(null,Font.ITALIC,18));
        password.setBounds(450,490,350,40);
        Id.setBounds(450,410,350,40);
        SignUp.setBounds(500,550,240,40);
        SignUp.setFocusable(false);
        SignUp.setBackground(Color.darkGray);
        SignUp.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        SignUp.addActionListener(this);
        frame.add(SignUp);
        frame.add(First_nameLabel);
        frame.add(First_name);
        frame.add(Last_nameLabel);
        frame.add(Last_name);
        frame.add(Email_Label);
        frame.add(email);
        frame.add(Address_Label);
        frame.add(Address);
        frame.add(userIdLabel);
        frame.add(userPassword);
        frame.add(Id);
        frame.add(password);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Width,Height);
        frame.setLayout(null);
        frame.setVisible(true);
        try{
            BufferedReader br=new BufferedReader(new FileReader(filePath));
            while ((line= br.readLine())!=null){
                user[i]=new User();
                String[] row=line.split("\n");
                for(int j=0;j< row.length;j++){
                    String[] col=row[j].split(",");
                    user[i].setFirst_Name(col[0]);
                    user[i].setLast_Name(col[1]);
                    user[i].setemail(col[2]);
                    user[i].setAddress(col[3]);
                    user[i].setUser_Name(col[4]);
                    user[i].setPassword(col[5]);
                    users.add(user[i]);

                }i++;
            }
        } catch(IOException e){
            e.printStackTrace();
        }

    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == SignUp) {
            i++;
            user[i]=new User();
            user[i].setFirst_Name(First_name.getText());
            user[i].setLast_Name(Last_name.getText());
            user[i].setemail(email.getText());
            user[i].setAddress(String.valueOf(Address.getText()));
            user[i].setUser_Name(Id.getText());
            user[i].setPassword(String.valueOf(password.getPassword()));
            users.add(user[i]);
            frame.dispose();
        }
            FileWriter fileWriter = null ;
            try {
                fileWriter = new FileWriter (filePath);
                for ( User u : users ) {
                    fileWriter . append ( u . getFirst_Name ());
                    fileWriter . append ( "," );
                    fileWriter .append ( u . getLast_Name ());
                    fileWriter .append(",");
                    fileWriter .append(u.getemail());
                    fileWriter .append(",");
                    fileWriter . append ( String . valueOf ( u . getAddress ()));
                    fileWriter . append ( "," );
                    fileWriter .append(u.getUser_Name());
                    fileWriter .append(",");
                    fileWriter .append(u.getPassword());
                    fileWriter . append ( "\n" ); } }
            catch ( Exception ex ) {
                ex . printStackTrace (); } finally { try {
                assert fileWriter != null;
                fileWriter . flush ();
                fileWriter . close (); } catch ( Exception a ) {
                a . printStackTrace (); } }

        }



    }





