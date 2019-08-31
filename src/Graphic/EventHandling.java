package Graphic;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class EventHandling extends Frame implements ActionListener {

	EventHandling() {
		super("Button Example");
		setBackground(Color.GREEN);		
		setSize(1000, 1000);
		setLayout(new FlowLayout());
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox f = new Checkbox("First", true);
		Checkbox s = new Checkbox("Second");
		Checkbox t = new Checkbox("Third");
		CheckboxGroup radio = new CheckboxGroup();

		Button r = new Button("Red");
		Button g = new Button("Green");
		EventHandling obj = new EventHandling();
		t.setCheckboxGroup(radio);
		s.setCheckboxGroup(radio);
		obj.add(r);
		obj.add(g);
		obj.add(f);
		obj.add(s);
		obj.add(t);
		r.addActionListener(obj);
		g.addActionListener(obj);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String d = e.getActionCommand();
		if (d.equals("Red"))
			this.setBackground(Color.red);

		if (d.equals("Green"))
			this.setBackground(Color.green);

	}
	

}
