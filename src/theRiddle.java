import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class theRiddle {
public static void main(String[] args) {
	int q = 0;
	
	for (int w=0;w<5;w++) {
		String Ans = JOptionPane.showInputDialog("What 8 letter word can have a letter taken away and it still makes a word.  Take another letter away and it still makes a word. Keep on doing that until you have one letter left. What is the word");
		if ( Ans.equals("Starting")) {
			JOptionPane.showMessageDialog(null, "good job. The word is starting! starting, staring, string, sting, sing, sin, in, I.  Cool,huh?");
			q = q+1;
			JOptionPane.showMessageDialog(null, "score is  " + q);
}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			JOptionPane.showMessageDialog(null, "score is  " + q);
	}
		
		}
	}
	
}

