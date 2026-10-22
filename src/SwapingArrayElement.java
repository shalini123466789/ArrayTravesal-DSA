import java.util.Scanner;

public class SwapingArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Swaping");
		for(int i=0;i<arr.length;i++) 
		{
		  System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++,i++) {
			int tem=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=tem;
		}
		System.out.println("After Swaping");
		for(int i=0;i<arr.length;i++) 
		{
		  System.out.print(arr[i]+" ");
		}
	}

}
