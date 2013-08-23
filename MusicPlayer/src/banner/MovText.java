package banner;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MovText extends JPanel {
	int x=0,y=0;
	String text ="";
	
	public MovText(String text,int x, int y){
		this.text = text;
		this.x=x;
		this.y=y;
	}
	public void paint (Graphics g){
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		Font font = new Font(this.getName(), Font.PLAIN,50);
		g2.setFont(font);
		g2.setColor(Color.RED);
		g2.drawString(text,x,y);
		
		try{Thread.sleep(100);}catch(Exception e){};
		x=x+10;
		if (x>this.getWidth())x=0;
		repaint();
	}
	
	public static void main (String[] args){
		JFrame jf = new JFrame("moving text");
		jf.setSize(700,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(new MovText("Song name",0,100));
		jf.setVisible(true);
	}
}
