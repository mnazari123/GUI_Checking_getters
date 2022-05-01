import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SettingPanel extends JPanel implements ActionListener{
	
	JPanel buttonPanel;
	JButton button;
	CheckMe play;
	
	public SettingPanel() {
		
		play = new PlayPanel();
		System.out.println("The Value: " + play.getTextFieldValue());
		
		button = new JButton("Click Me");
		button.setBounds(20, 20, 150, 30);
		button.setFocusable(false);
		button.addActionListener(this);
		
		this.add(button);
		
		this.setOpaque(true);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button) {
			
			String st = play.getTextFieldValue();
			System.out.println("The Value of st: " + st);
			
			//play.textme("MyTxt");
		}
		
	}

}
