package Graphic;

import java.awt.*;
import java.awt.event.*;

public class label extends Frame implements ActionListener, ItemListener {
	Choice c;
	List lt1, lt2;

	label() {

		setLayout(new GridLayout(3, 1));
		Label l1 = new Label("SYCS", Label.CENTER);
		Label l2 = new Label("JWT", Label.LEFT);
		Label l3 = new Label("SIT", Label.RIGHT);
		add(l1);
		add(l2);
		add(l3);
		l1.setBackground(Color.CYAN);
		l1.setForeground(Color.RED);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.CYAN);
		l3.setBackground(Color.BLUE);
		l3.setForeground(Color.BLACK);
		Button b = new Button("ADD");
		Button c = new Button("Clear");
		add(b);
		add(c);
		lt1 = new List(3, true);
		lt1.add("C++");
		lt1.add("Java");
		lt1.add("c");
		add(lt1);

		lt1.getItem(0);

		lt2 = new List();
		add(lt2);

		b.addActionListener(this);
		c.addActionListener(this);
		lt1.setBackground(Color.PINK);
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
		System.out.println(d);
		// if (d.equals("red"))
		// this.setBackground(Color.red);
		if (d.equals("ADD")) {
			int[] x = lt1.getSelectedIndexes();
			for (int i = 0; i < x.length; i++)
				lt2.add(lt1.getItem(i));
		} else if (d.equals("Clear"))
			lt2.removeAll();
	}

	// }

	public void itemStateChanged(ItemEvent e1) {
		int x = lt1.getItemCount();
		lt2.add(lt1.getSelectedItem());
	}

	public static void main(String[] args) {
		label c = new label();
	}

}
