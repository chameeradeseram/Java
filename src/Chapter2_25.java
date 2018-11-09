import java.util.Scanner;
public class Chapter2_25 {

	public static void main(String[] args) {
	        Scanner n=new Scanner(System.in);
		System.out.println("enter your number");
		int num=n.nextInt();
		
		if(num%3==0){
			System.out.println(num+ " is divisible by 3.");
		}
		else{
			System.out.println(num+ " isnot divisible by 3.");
		}	
		

	}

}
