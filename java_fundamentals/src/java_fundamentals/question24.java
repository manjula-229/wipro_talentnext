package java_fundamentals;
import java.util.*;
public class question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Target Element");
		int target=sc.nextInt();
		int ind=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target) {
				ind=i;
			}		
		}
		System.out.println(ind);
		
	}
}
