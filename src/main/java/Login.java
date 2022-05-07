import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Login implements ActionListener {
    HashMap<String,String> logininfo=new HashMap<>();
    JFrame frame=new JFrame();
    JLabel Company_Name=new JLabel("Carona -- Info Thuringia");
    JButton logbutton1=new JButton("Login");
    JButton logbutton=new JButton("Login");
    JButton SignUp=new JButton("SignUp");
    JTextField Id=new JTextField();
    JPasswordField password=new JPasswordField();
    JLabel userIdLabel=new JLabel("Login :");
    JLabel userPassword=new JLabel("Password :");
    JLabel Message=new JLabel("Log in to veiw your details  ");

    Login() {
        Toolkit tk=Toolkit.getDefaultToolkit();
        int Width= (int) tk.getScreenSize().getWidth();
        int Height=(int) tk.getScreenSize().getHeight();
        Company_Name.setBounds(450,90,500,60);
        Company_Name.setFont(new Font(null,Font.CENTER_BASELINE,35));
        userIdLabel.setBounds(450,250,150,40);
        userIdLabel.setFont(new Font(null,Font.BOLD,25));
        userPassword.setBounds(450,350,150,40);
        userPassword.setFont(new Font(null,Font.BOLD,25));
        Message.setBounds(550,520,450,35);
        Message.setFont(new Font(null,Font.TYPE1_FONT,15));
        Id.setBounds(450,300,400,45);
        password.setBounds(450,400,400,45);
        logbutton1.setBounds(1150,40,140,40);
        logbutton1.setFocusable(false);
        logbutton1.setBackground(Color.darkGray);
        logbutton1.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        logbutton1.addActionListener(this);
        logbutton.setBounds(530,480,200,28);
        logbutton.setFocusable(false);
        logbutton.setBackground(Color.darkGray);
        logbutton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        logbutton.addActionListener(this);
        SignUp.setBounds(1000,40,140,40);
        SignUp.setFocusable(false);
        SignUp.setBackground(Color.darkGray);
        SignUp.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        SignUp.addActionListener(this);

        frame.add(logbutton1);
        frame.add(logbutton);
        frame.add(SignUp);
        frame.add(Company_Name);
        frame.add(Id);
        frame.add(password);
        frame.add(Message);
        frame.add(userIdLabel);
        frame.add(userPassword);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Width,Height);
        frame.setForeground(Color.darkGray);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String line="";
        String path="src\\main\\java\\CSV\\DataColect.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader( path));
            while((line=br.readLine())!=null){
                String[] values=line.split(",");
                logininfo.put(values[4],values[5]);
            }
        } catch(IOException a){
            a.printStackTrace();
        }
          if (e.getSource()==SignUp){
                  SignIn SignIn=new SignIn();
          }
          if(e.getSource()==logbutton || e.getSource()==logbutton1){
              String UserId=Id.getText();
              String UserPass=String.valueOf(password.getPassword());
              if(logininfo.containsKey(UserId)){
                  if(logininfo.get(UserId).equals(UserPass)){
                       User_Welcome_Page User_Welcome_Page=new User_Welcome_Page();

                  }else {
                      Message.setText("Login Failed");
                  }
              }else {
                  Message.setForeground(Color.red);
                  Message.setText("Please check your User Id or Password");
              };
          }
    }
}
