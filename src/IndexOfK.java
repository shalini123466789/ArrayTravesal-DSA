import java.util.Scanner;

public class IndexOfK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int res=IndexOfK.index(arr,k);
		System.out.println(res);
	}
	public static int index(int[] arr,int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return i;
	}
			
	}
		return -1;

	}

}
