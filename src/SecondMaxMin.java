import java.util.Scanner;
public class SecondMaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res=SecondMaxMin.SecondLarge(arr);
		System.out.println(res);
		
		
	}
	public static int SecondLarge(int[] arr) {
		int p=Integer.MIN_VALUE;
		int vp=Integer.MIN_VALUE;
		int pindex=0;
		int vindex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>p) {
				//vpp=vp;
				vp=p;
				vindex=pindex;
				p=arr[i];
				pindex=i;
			}
			else if(arr[i]>vp&&arr[i]!=p) {
				
				vp=arr[i];
				vindex=i;
			}
//			else if(arr[i]>vpp&&arr[i]!=p&&arr[i]!=vp) {
//				vpp=arr[i];
//			}
			
		}
		return vindex;
	}

}
