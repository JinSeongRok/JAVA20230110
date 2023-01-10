import java.util.Scanner;

public class Test5_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = null; // 점수
		int plan = 0;
		int sum=0;
		double avg=0;
		int max =0;
		
		while(plan !=5) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수 입력  | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			
			System.out.print("선택>");
			plan = scan.nextInt();
		
			
			switch(plan) {
			case 1: 
				System.out.print("학생수>");
					score = new int[scan.nextInt()];
					break;
			case 2:
				System.out.println("점수 입력>");
				for(int i=0; i<score.length; i++) {
					score[i] = scan.nextInt();
				}
				break;
			case 3: 
				System.out.println("점수 리스트>");
				for(int i=0; i<score.length; i++) {
					System.out.println(score[i]);
				}
				break;
			case 4:
				for(int i=0; i<score.length; i++) {
					max = Math.max(score[i],max);
					sum += score[i];
				}
				avg = (double)sum / score.length;
				
				System.out.println("최고 점수: "+ max);
				System.out.println("평균 점수: "+ avg );
				break;
			case 5:
				System.out.println("프로그램 종료");
			}
		}
	}
}
