
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(100);
	private int mouseX, mouseY;
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		// You should use fillRect()
		g.drawRect(square.getCenterX(mouseX), square.getCenterY(mouseY), square.getShapeWidth(), square.getShapeHeight());
		g.setColor(square.getRandomColor());
		g.fillRect(square.getCenterX(mouseX), square.getCenterY(mouseY), square.getShapeWidth(), square.getShapeHeight());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		mouseX = e.getX();
		mouseY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// No need to implement
	}
}
