import java.applet.Applet;
import java.awt.Graphics;
public class q1 extends Applet
{
TextField t1;
public void init()
{
t1 = new TextField(10);
add(t1);
t1.setText("0");
}
public void paint(Graphics g)
{
g.drawString("Hello Madhav Kanjilimadom",150,150);
String str1;
g.drawString(str1,100,80);
}
}
