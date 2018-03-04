import javax.swing.JOptionPane;

public class Bristday {
	public static void main(String[] args) {
	
	String QWERTY = JOptionPane.showInputDialog("What is the password");
	if( QWERTY.equals("Q")) {
	JOptionPane.showMessageDialog(null, "QWERTY");
	}
	else{
	JOptionPane.showMessageDialog(null, "INTRUDER!");
	}
}
}
