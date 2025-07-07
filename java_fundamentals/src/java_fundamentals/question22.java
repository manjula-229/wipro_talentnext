package java_fundamentals;
import java.util.*;
public class question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++) {
			sum+=arr[j];
		}
		double avg=sum/arr.length;
		System.out.println(sum);
		System.out.println(avg);
	}
}
