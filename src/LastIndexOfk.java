import java.util.Scanner;

public class LastIndexOfk {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int res=LastIndexOfk.LastIndex(arr,k);
		System.out.println(res); 

	}
	public static int LastIndex(int[] arr,int k) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				index=i;
			}
		}
		return index;
	}

}
