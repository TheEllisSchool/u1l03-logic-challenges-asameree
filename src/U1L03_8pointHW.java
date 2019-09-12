import javax.swing.JOptionPane;

public class U1L03_8pointHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String input = JOptionPane.showInputDialog(null, "please type the base for your exponent");
		int baseE = Integer.parseInt(input);
		String input1 = JOptionPane.showInputDialog(null, "please type in your exponent");
		int exponent = Integer.parseInt(input1);
		
		int finalA = 1;
		
		for (int i = exponent; i > 0; i--){
			finalA = finalA * baseE;
		}
		JOptionPane.showMessageDialog(null, "Your final answer is: " + finalA);
		*/
		String input2 = JOptionPane.showInputDialog(null, "please type in the number you want multiplyed ");
		int multT = Integer.parseInt(input2);
		String input3 = JOptionPane.showInputDialog(null, "please type in what you want it to go up to");
		int upTo = Integer.parseInt(input3);
		String ans = "";
		for (int i = upTo; i > 0; i--) {
			int answer =  multT * i;
			//JOptionPane.showMessageDialog(null, multT + " times " + i + " equals " + answer);
			ans = ans + multT + " times " + i + " equals " + answer + ", ";
		}
		JOptionPane.showMessageDialog(null, ans);
	}

}
