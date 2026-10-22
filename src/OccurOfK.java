import java.util.Scanner;

public class OccurOfK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
