import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="reverse" width=500 height=500>
</applet>
*/
public class reverse extends JApplet
{
JLabel jl;
public void init()
{
try
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
makeGUI();
}
});
}
catch(Exception e)
{
System.out.println(e);
}
}
public void makeGUI()
{
setLayout(new FlowLayout());
JTextField jt=new JTextField(10);
add(jt);
jl=new JLabel("");
add(jl);
JButton jb = new JButton("Reverse");
jb.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{

  StringBuffer st=new StringBuffer(jt.getText());
                        st.reverse();
                        jl.setText(""+st);

}
});
add(jb);
}
}

