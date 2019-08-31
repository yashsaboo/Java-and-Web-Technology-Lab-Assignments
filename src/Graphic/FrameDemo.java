package Graphic;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class FrameDemo extends Frame {

	FrameDemo() {
		super("Frame Demo");
		setSize(400, 200);
		add(new Label("SYCS"));
		// operation to close window from the cross button
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		FrameDemo f = new FrameDemo();

		f.setVisible(true);
	}
}
