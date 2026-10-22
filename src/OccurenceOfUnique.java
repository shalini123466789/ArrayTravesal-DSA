import java.util.Scanner;

public class OccurenceOfUnique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int ucount=0;
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count==1) {
					ucount++;
				}
				count=1;
			}
			
			
		}
		if(count==1) {
			ucount++;
		}
	System.out.print(ucount);	
		
	}

}
