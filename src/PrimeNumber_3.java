import java.util.Scanner;

public class PrimeNumber_3 {

	public static void main(String[] args) {
		//소수를 판별할 숫자 a를 차례로 나누어서 처음으로 나누어 떨어졌을 때 a와 제수가 같으면 소수이다.
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 확인할 숫자 입력:");
		i = sc.nextInt();
		
		j=2;
		while(i%j !=0) 
			j++;
			if(i==j) {
				System.out.println("소수 입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			}
			

	}

}
