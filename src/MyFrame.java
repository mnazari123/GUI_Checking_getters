import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	
	PlayPanel playPanel;
	SettingPanel settingPanel;
	
	public MyFrame() {
		
		playPanel = new PlayPanel();
		playPanel.setBounds(0,  0, 600, 600);
		
		
		settingPanel = new SettingPanel();
		settingPanel.setBounds(600, 0, 250, 600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(850, 620);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.add(playPanel);
		this.add(settingPanel);
		this.setVisible(true);
	}

}
