import java.util.Scanner;

public class Chapter2_34 {

	public static void main(String[] args) {
		
		Scanner pop =new Scanner(System.in);
		System.out.println("Enter the current population");
		
		int people=pop.nextInt();
		
		//population rate=1.09%
		
		int rate=people*109/100;
		System.out.println("World populaton per year " +rate);
		
		int rate2=(people*109/100)*2;
		System.out.println("World populaton per 2 years " +rate2);
		
		int rate3=(people*109/100)*3;
		System.out.println("World populaton per 3 years " +rate3);
		
		int rate4=(people*109/100)*4;
		System.out.println("World populaton per 4 years " +rate4);
		
		int rate5=(people*109/100)*5;
		System.out.println("World populaton per 5 years " +rate5);

	}

}
