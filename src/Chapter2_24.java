
public class Chapter2_24 {

	public static void main(String[] args) {
		
		int a[]={8,22,91,3,77,1};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1; i<a.length; i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		
		System.out.println("Max value is " +max);
		
		
		for(int x=1; x<a.length; x++){
			if(a[x]<min){
				min=a[x];
			}
		}
       
		System.out.println("Min value is " +min);
	}

}
