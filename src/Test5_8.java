
public class Test5_8 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}	
		};
		int sum=0;
		int totalStudent =0;
				
		for(int i=0; i<array.length; i++) {
			totalStudent += array[i].length;
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];				
			}
		}
		System.out.println("전체 학생수 총점 : "+ sum);
		double totalavg = (double) sum / totalStudent;
		System.out.println("전체 학생수 평균 : " + totalavg);
			
		
		
	}

}
