package Graphic;

import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {
	private static final long serialVersionUID = -5561847286781028722L;
	Button add = new Button("+");
	Button sub = new Button("-");
	Button mul = new Button("X");
	Button div = new Button("/");
	TextField tf1 = new TextField("Enter First Number");
	TextField tf2 = new TextField("Enter Second Number");
	TextField tf3 = new TextField("Result");
	
	CalculatorAWT() {
		setTitle("Calculator");
		setVisible(true);
		setSize(400, 400);
		setBackground(Color.lightGray);
		setLayout(new FlowLayout());
		
		
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(tf1);
		add(tf2);
		add(tf3);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);
		
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String choice = e.getActionCommand();
		int n1 = Integer.valueOf(tf1.getText());
		int n2 = Integer.valueOf(tf2.getText());
		int result=0;
		
		if(choice.equals("+"))
			result = n1+n2;
		else if(choice.equals("-"))
			result = n1-n2;
		else if(choice.equals("X"))
			result = n1*n2;
		else if(choice.equals("/"))
			result = (int)n1/n2;
		else
			result = 0;
		
		tf3.setText(""+result);		
			
	}
	
	public static void main(String args[])
	{
		CalculatorAWT obj = new CalculatorAWT();
	}

}
