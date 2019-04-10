import javax.swing.*;
import java.awt.*;

public class SmileyApplet extends JApplet {
	public void init() {
		add(new Tegning());
	}
}

class Tegning extends JPanel {
	public void paintComponent(Graphics smiley){
		super.paintComponent(smiley);
		setBackground(Color.WHITE);
		smiley.setColor(Color.YELLOW);
		smiley.fillOval(200, 150, 250, 250);
		smiley.drawOval(275, 225, 10, 10);
		smiley.drawOval(350, 225, 10, 10);
		smiley.setColor(Color.BLACK);
		smiley.fillOval(275, 225, 10, 10);
		smiley.fillOval(350, 225, 10, 10);
		smiley.drawArc(275, 250, 100, 100, -180, 180);
	}
}