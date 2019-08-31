package Graphic;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ButtonDemo extends Frame implements ActionListener, ItemListener {
	Choice c;

	ButtonDemo() {
		// Frame f= new Frame("AWT Components");
		setSize(400, 400);
		setVisible(true);
		setLayout(new FlowLayout());
		Button r, g, b;
		r = new Button("Red");
		g = new Button("Green");
		b = new Button("Blue");
		c = new Choice();
		c.add("Red");
		c.add("Green");
		add(c);
		c.addItemListener(this);
		c.addItemListener(this);
		c.addItemListener(this);
		// EventHandling ob=new EventHandling();
		add(r);
		add(g);
		add(b);
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		Label l1 = new Label("SYCS", Label.CENTER);
		Label l2 = new Label("JWT", Label.LEFT);
		Label l3 = new Label("SIT", Label.RIGHT);
		add(l1);
		setSize(400, 400);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String d = e.getActionCommand();
		if (d.equals("Red"))
			this.setBackground(Color.red);
	}
	// }

	public void itemStateChanged(ItemEvent e1) {

		int x = c.getSelectedIndex();
		if (x == 0)
			this.setBackground(Color.RED);
		if (x == 1)
			this.setBackground(Color.GREEN);
	}

	public static void main(String[] args) {
		ButtonDemo c = new ButtonDemo();
	}

}
