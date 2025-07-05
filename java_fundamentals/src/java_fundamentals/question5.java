package java_fundamentals;
import java.util.*;
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i=n%10;
		int j=m%10;
		if(i==j) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}

	}

}
