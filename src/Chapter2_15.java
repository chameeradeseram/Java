import java.util.Scanner;

public class Chapter2_15 {
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number 1");
		
		int n1=s.nextInt();
		
		System.out.println("enter number 2");
		int n2=s.nextInt();
		
		int sqr1=n1*n1;
		int sqr2=n2*n2;
		
		int sum=sqr1+sqr2;
		int dif=sqr1-sqr2;
		
		System.out.println("Squares of number 1 " +sqr1);
		System.out.println("Squares of number 2 " +sqr2);
		System.out.println("Sum of squares " +sum);
		System.out.println("Diffrernce " +dif);
	}

}
