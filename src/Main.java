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
	private TileSet ts;
	
	private int width;
	private int height;
	private int rows;
	private int cols;
	private int size;
	private String src;
    
	
	public Main(){
		JFrame frame = new JFrame("RedMaps");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400, 300);
	    frame.setLocationRelativeTo(null);
	    
	    JPanel panel = new JPanel();
	    panel.setLayout(null);
	    JLabel label1 = new JLabel("Welcome to RedMaps!");
	    label1.setBounds(130, 1, 150, 20);
	    
	    JButton fileChoice = new JButton("Import TileSet");
	    fileChoice.setBounds(120, 20, 150, 20);
	    JButton create = new JButton("Create Map!");
	    create.setBounds(145, 200, 100, 20);
	    JTextField sizeChoice = new JTextField();
	    sizeChoice.setBounds(120, 50, 150, 20);
	    JTextField widthChoice = new JTextField();
	    widthChoice.setBounds(120, 80, 150, 20);
	    JTextField heightChoice = new JTextField();
	    heightChoice.setBounds(120, 110, 150, 20);
	    JTextField rowsChoice = new JTextField();
	    rowsChoice.setBounds(120, 140, 150, 20);
	    JTextField colsChoice = new JTextField();
	    colsChoice.setBounds(120, 170, 150, 20);
	    panel.add(label1);
	    panel.add(fileChoice);
	    panel.add(create);
	    panel.add(sizeChoice);
	    panel.add(widthChoice);
	    panel.add(heightChoice);
	    panel.add(rowsChoice);
	    panel.add(colsChoice);
	    frame.add(panel);
	    
	    
	    fileChoice.addActionListener(new ActionListener () {
	      public void actionPerformed(ActionEvent ae){
	        JFileChooser fc = new JFileChooser();
	        int returnVal = fc.showOpenDialog(frame);
	        if(returnVal == JFileChooser.APPROVE_OPTION){
	          src = fc.getSelectedFile().getAbsolutePath();
	          size = Integer.parseInt(sizeChoice.getText());
	          width = Integer.parseInt(widthChoice.getText());
	          height = Integer.parseInt(heightChoice.getText());
	          rows = Integer.parseInt(rowsChoice.getText());
	          cols = Integer.parseInt(colsChoice.getText());
	          ts = new TileSet(src, width, height, rows, cols);
	         
	        }
	      }});

	    
	    frame.setVisible(true);
	    
	    int [][] map;
	  
	    MapGenerator mg = new MapGenerator(size);
	    map = mg.getMap();
	}
  public static void main(String [] args){
    Main main = new Main();
  }
