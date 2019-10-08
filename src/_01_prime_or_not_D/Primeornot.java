package _01_prime_or_not_D;

import javax.swing.JOptionPane;

public class Primeornot {
public static void main(String[] args) {
 String number =	JOptionPane.showInputDialog("Give This comupter a number");
int abc = Integer.parseInt(number);
 boolean isPrime= true ;

for (int i = 2; i < abc; i++) {
	
	int remainder = abc % i;
	if (remainder == 0) {
		JOptionPane.showMessageDialog(null, number+  " is not prime.");
	isPrime=false;
	break;
	}
	
}
 if(isPrime  ) {
		JOptionPane.showMessageDialog(null, number+" is Prime");
	return;
	} 
}
}