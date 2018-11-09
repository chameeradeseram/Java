import java.util.Scanner;

public class Chapter2_16 {

	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		System.out.println("enter your number");
		int number=num.nextInt();
		
		int sqr=number*number;
		
		System.out.println("Square is " +sqr);
		
		if(sqr==100){
			System.out.println("Sqare is equals 100");
		}
		
		else if(sqr<100){
			System.out.println("Sqare is less than 100 ");
		}
		
		else if(sqr>100){
			System.out.println("Sqare is greater than 100");
		}

	}

}
