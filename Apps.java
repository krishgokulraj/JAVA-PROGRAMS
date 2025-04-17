import java.awt.*;
class Apps
{
public static void main(String args[])
{
Frame f=new Frame();
f.setTitle("Notepad");
f.setSize(900,800);
f.setLayout(new FlowLayout());
Label l1=new Label("User Name");
TextField tf1=new TextField(20);
Label l2=new Label("Passward:");
TextField tf2=new TextField(20);
Button Login=new Button("Login");
l1.setForeground(Color.RED);
l2.setBackground(Color.BLUE);
f.add(l1);
f.add(tf1);
f.add(l2);
f.add(tf2);
f.add(Login);
f.setVisible(true);
}
}