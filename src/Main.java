import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main{
    
	
	public Main(){
	    JFrame frame = new JFrame("RedMaps");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400, 300);
	    frame.setLocationRelativeTo(null);
	    JPanel panel = new JPanel();
	    panel.setLayout(null);
	    frame.setVisible(true);
	}
	
	public static void main(String [] args){
    		Main main = new Main();
  	}
}
