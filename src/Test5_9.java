import java.util.Scanner;

public class Test5_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = null; // ����
		int plan = 0;
		int sum=0;
		double avg=0;
		int max =0;
		
		while(plan !=5) {
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.���� �Է�  | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			
			System.out.print("����>");
			plan = scan.nextInt();
		
			
			switch(plan) {
			case 1: 
				System.out.print("�л���>");
					score = new int[scan.nextInt()];
					break;
			case 2:
				System.out.println("���� �Է�>");
				for(int i=0; i<score.length; i++) {
					score[i] = scan.nextInt();
				}
				break;
			case 3: 
				System.out.println("���� ����Ʈ>");
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
				
				System.out.println("�ְ� ����: "+ max);
				System.out.println("��� ����: "+ avg );
				break;
			case 5:
				System.out.println("���α׷� ����");
			}
		}
	}
}