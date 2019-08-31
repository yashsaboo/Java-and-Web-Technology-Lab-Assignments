package Graphic;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicsDemo1 extends Frame {

	GraphicsDemo1() {
		super("Frame Demo");
		setSize(500, 400);
		// operation to close window from the cross button
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawOval(90, 70, 80, 80);
		/*
		 * g.setColor(Color.RED); g.drawOval(110, 95, 5, 5); g.fillOval(110, 95,
		 * 5, 5); g.drawOval(145, 95, 5, 5); g.fillOval(145, 95, 5, 5);
		 */
		g.setColor(Color.BLUE);
		// g.drawLine(130, 95, 130, 113);
		g.drawArc(103, 96, 50, 40, 10, -110);
		g.drawLine(123, 133, 123, 139);
		g.drawLine(150, 113, 156, 113);
		// making house

		int[] x = { 350, 400, 400, 300 };
		int[] y = { 150, 200, 200, 200 };

		g.setColor(Color.GREEN);
		g.drawLine(0, 280, 300, 280);
		g.setColor(Color.GREEN);

		for (int i = 0, j = 0; i < 280; i += 30, j++) {
			if (j % 2 != 0)
				g.setColor(Color.GREEN);
			else
				g.setColor(Color.YELLOW);
			g.drawArc(i, 260, 35, 30, 0, 180);
			g.fillArc(i, 260, 35, 30, 0, 180);
		}

		g.setColor(Color.YELLOW);
		g.drawRect(300, 200, 100, 100);
		g.fillRect(300, 200, 100, 100);
		g.setColor(Color.BLACK);
		g.drawPolygon(x, y, 4);
		g.fillPolygon(x, y, 4);

		Font f1 = new Font("Times New Roman", Font.BOLD, 30);
		g.setColor(Color.BLUE);
		g.setFont(f1);
		g.drawString("Sweet", 60, 350);
		Font f2 = new Font("Verdena", Font.ITALIC, 30);
		g.setColor(Color.RED);
		g.setFont(f2);
		g.drawString("Home", 150, 350);
	}

	public static void main(String[] args) {

		GraphicsDemo1 gd = new GraphicsDemo1();
		gd.setVisible(true);

	}
}
