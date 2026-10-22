import java.util.Scanner;

public class RepetingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				if(i==0||arr[i-1]!=arr[i]) {
					System.out.println(arr[i]+" ");
					
				}
			}
			
		}
		
	}

}
