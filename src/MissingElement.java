import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) {
          arr[i]=sc.nextInt();	
        }
        int res= MissingElement.MissingElement(arr);
        System.out.println(res);
        
	}
	public static int MissingElement(int[] arr) {
		int sum=0;
		int Asum=0;
		int mis=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		 Asum=(arr.length+1)*(arr.length+2)/2;
		 return mis=Asum-sum;
		 
		
	}

}
