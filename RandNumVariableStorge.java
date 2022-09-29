import java.util.Random;



public class RandNumVariableStorge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randNum = new Random();
		
		int a = 16;
		int b = 5;
	
		System.out.println("The variable a holds 5."
				+ " While the variable b hols 16. This"
				+ " generates numbers between 5 and 20.");
		
		int randres = randNum.nextInt(a)+b;
		
		System.out.println("The Random generated number between a and b is: "+randres);

	}

}
