
public class Main{
    
	public static void main(String [] args){
	    JFrame frame = new JFrame("RedMaps");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null);
	    MainPanel mp = new MainPanel();
	    frame.add(mp);
	    frame.pack();
	    frame.setVisible(true);
	}
}
