import java.util.Scanner;

public class Chapter2_17 {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1=n.nextInt();
		System.out.println("Enter number 2");
		int n2=n.nextInt();
		System.out.println("Enter number 3");
		int n3=n.nextInt();
		
		int sum=n1+n2+n3;
		int avg=sum/3;
		
		System.out.println("Sum is "+sum);
		System.out.println("Avg is " +avg);
		
		int arr[]=new int[3];
		arr[0]=n1;
		arr[1]=n2;
		arr[2]=n3;
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
			
		}
        System.out.println("Max value is " +max);
        
        
        for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
			
		}
        System.out.println("Min value is " +min);
	}

}
