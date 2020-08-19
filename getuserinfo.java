package week7b;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class getuserinfo{
	public static void main(String[]args) {
	
		JOptionPane.showMessageDialog(null,"Continue");
		
		String name; 	
		int monney;
		double yai =12;
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("w \nxyz" + yai);		
		name = input.nextLine();
		
		
		System.out.print("Enter your age >>");
		monney = input.nextInt();
		
		
		System.out.println("Welcome Mr."+name+" I have a monney "+monney+" bath..");

	}
}