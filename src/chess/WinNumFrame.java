package chess;

import java.awt.Rectangle;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import entity.User;

/**
 * 窗口管理
 * @author 李维
 *
 */
public class WinNumFrame extends JFrame{
	static List<User> userlist = null;
	String str = null;
	public WinNumFrame(List<User> userlist) {
		this.userlist = userlist;
		getContentPane().setBounds(new Rectangle(0, 0, 434, 261));
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 434, 261);
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(0, 31, 432, 228);
		panel.add(textArea);
		
		JLabel label = new JLabel("战绩排行");
		label.setBounds(0, 0, 432, 29);
		panel.add(label);
		
		for(int i = 0;i< userlist.size();i++){
			str += userlist.get(i).getName()+"  "+userlist.get(i).getWinNum()+"\n\r";
		}
		textArea.setText(str);
	}
	   
	  
      public static void main(String[] args) {
		new WinNumFrame(userlist).setVisible(true);
	}
}
