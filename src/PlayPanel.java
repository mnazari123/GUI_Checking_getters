import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayPanel extends JPanel implements KeyListener, CheckMe{
	
	JPanel panelTest;
	JTextField text;
	private String textFieldValue;
	
	public PlayPanel() {
		
		panelTest = new JPanel();
		panelTest.setBackground(Color.white);
		panelTest.setBounds(0, 0, 600, 600);
		panelTest.setLayout(null);
		
		text = new JTextField();
		text.setBounds(100, 100, 100, 30);
		text.addKeyListener(this);
		
		
		panelTest.add(text);
		
		
		
		
		this.add(panelTest);
		this.setBounds(0, 0, 600, 600);
		this.setLayout(null);
			
	}
	public void setTextFieldValue(String text) {
		textFieldValue = text;
		//System.out.println("textFieldValue: " + textFieldValue);
		
	}
	public void textme(String myText) {
		text.setText(myText);
		text.setBackground(Color.blue);
//		panelTest.revalidate();
//		panelTest.repaint();
//		this.revalidate();
//		this.repaint();
	}
	public String getTextFieldValue() {
		System.out.println(textFieldValue);
		return textFieldValue;
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == text) {
			setTextFieldValue(text.getText());
			
		}
		//panelTest.revalidate();
		//panelTest.repaint();
	}
	
	

}
