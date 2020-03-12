package test_2;
import java.util.Scanner;

public class googoo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단 입력:");
		
			int dan=sc.nextInt();
			if(dan>9) {System.out.println("erro");}
			else if(dan<=9) {
				
		for(int i=1; i<=9;i++) {
			int gop;
				gop = i*dan;
				System.out.println(dan+"*"+i+"="+gop);
		}
	}
	}	
}
