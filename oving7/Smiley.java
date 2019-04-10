import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame {
	public Vindu(String tittel){
		setTitle(tittel);
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning smiley = new Tegning();
		add(smiley);
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

class Smiley {
	public static void main(String[] args) {
		Vindu etVindu = new Vindu("Smiley");
		etVindu.setVisible(true);
	}
}