package test_2;
import java.util.Scanner;

public class googoo {
	

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);//입력 선언
	System.out.print("원하는 단 입력:");
		int dan= sc.nextInt();// 입력
		int[] result = new int[9]; //배열 생성
	if(dan>9) {System.out.println("1-9사이의 숫자를 입력해주세요");}
		else if(dan<=9) {
			
	for(;dan<10;dan++) {							//원하는 단
			System.out.println("---------="+dan+"단=---------");
	for(int i=0;i<result.length;i++) {				//1-9까지 곱하는 수
			result[i]=dan*(i+1);
			System.out.println(dan+"*"+(i+1)+"="+result[i]); //결과출력
}
}
}
}
}

	
	/*	
		int dan=sc.nextInt();
		if(dan>9) {System.out.println("erro");}
		else if(dan<=9) {
			
	for(int i=1; i<=9;i++) {
		int gop;
			gop = i*dan;
			System.out.println(dan+"*"+i+"="+gop);
	}
}
}	*/
