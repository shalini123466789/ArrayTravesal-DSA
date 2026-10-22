import java.util.Scanner;

public class OcurrenceOfEach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		OcurrenceOfEach.rep(arr,n);

}
	public static void rep(int[] arr,int n){
		int count=1;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				System.out.println(arr[i]+" "+count);
				count=1;
			}
		}
		System.out.println(arr[n-1]+" "+count);
		
	}
}
