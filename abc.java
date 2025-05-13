import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="abc" width="400" height="200"></applet>*/
public class abc extends Applet implements KeyListener
{
String msg="Typed";
int x=30,y=50;
public void init()
{
addKeyListener(this);
requestFocus();
}
public void keyTyped(KeyEvent ke)
{
msg+=ke.getKeyChar();
repaint();
}
public void keyReleased(KeyEvent ke)
{
showStatus("key up");
}
public void keyPressed(KeyEvent ke)
{
showStatus("key down");
}
public void paint(Graphics G)
{
G.drawString(msg,x,y);
}
}
