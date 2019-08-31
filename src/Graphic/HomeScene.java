package Graphic;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HomeScene extends Frame {

	public void paint(Graphics g) {
		//Color c = new Color(1, 2, 3);

		g.drawRect(100, 100, 600, 600);
		g.setColor(Color.PINK);
		g.fillRect(100, 100, 600, 600);
		g.drawRect(420, 400, 180, 180);
		g.setColor(Color.BLUE);
		g.fillRect(420, 400, 180, 180);
		int x[] = { 420, 510, 600 };
		int y[] = { 400, 300, 400 };
		g.drawPolygon(x, y, 3);
		g.setColor(Color.cyan);
		g.fillPolygon(x, y, 3);
		g.setColor(Color.yellow);
		g.drawOval(250, 150, 70, 70);
		g.fillOval(250, 150, 70, 70);
		g.setColor(Color.green);
		g.drawLine(100, 550, 420, 550);
		g.drawArc(100, 525, 50, 50, 0, 180);
		g.fillArc(100, 525, 50, 50, 0, 180);
		g.drawArc(150, 525, 50, 50, 0, 180);
		g.fillArc(150, 525, 50, 50, 0, 180);
		g.drawArc(200, 525, 50, 50, 0, 180);
		g.fillArc(200, 525, 50, 50, 0, 180);
		g.drawArc(250, 525, 50, 50, 0, 180);
		g.fillArc(250, 525, 50, 50, 0, 180);
		g.drawArc(300, 525, 50, 50, 0, 180);
		g.fillArc(300, 525, 50, 50, 0, 180);
		g.drawArc(350, 525, 50, 50, 0, 180);
		g.fillArc(350, 525, 50, 50, 0, 180);
		Font f1 = new Font("Serif", Font.BOLD, 80);
		g.setFont(f1);
		g.setColor(Color.MAGENTA);
		g.drawString("Sweet Home", 150, 650);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		HomeScene d = new HomeScene();
		d.setSize(400, 400);
		d.setTitle("Hello");
		d.setVisible(true);

	}

}
