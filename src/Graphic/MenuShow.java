package Graphic;

import java.awt.*;
import java.awt.event.*;


public class MenuShow extends Frame
{

static WindowAdapter closebutton=new WindowAdapter(){
		@Override
		public void windowClosing(WindowEvent e)
			{
				System.exit(0);
					
			}
};

public void paint(Graphics g)
{


g.drawArc(30,50,200,200,0,360); // Main Face
g.drawArc(82,80,30,30,20,160); //Left Eye Brow
g.fillArc(85,85,25,25,0,360); //Left Eye
g.drawArc(152,80,30,30,20,160); //Right Eye Brow
g.fillArc(155,85,25,25,0,360); //Right Eye
g.drawRect(90,190,80,20); //Mouth

g.drawLine(130,135,115,160); //Nose Left Line
g.drawLine(130,135,145,160); // Nose Right Line
g.drawLine(115,160,145,160); // Nose Base

}

public static void main(String args[]){
	Face my=new Face();
	MenuBar mb=new MenuBar();
	MenuItem newitem=new MenuItem("New");
	MenuItem openitem=new MenuItem("open");
	MenuItem edititem=new MenuItem("editor");
	MenuItem lineitem=new MenuItem("Lines");
	Menu file=new Menu("File");
	file.add(newitem);
	file.add(openitem);
	Menu edit=new Menu("Edit");
	edit.add(edititem);
	edit.add(lineitem);
	Menu format=new Menu("Format");
	Menu help=new Menu("Help");
	mb.add(file);mb.add(edit);mb.add(format);mb.add(help);
	my.setMenuBar(mb);	
	my.addWindowListener(closebutton);
	my.setPreferredSize(new Dimension(300,300));
	my.pack();
	my.setVisible(true);
}
}