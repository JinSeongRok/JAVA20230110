
public class Test5_7 {

	public static void main(String[] args) {
		
		int[] array= {1,5,3,8,2};
		
		int max = array[0];
		
		for(int num : array ) {
			if(num > max) {
				max = num;
			}
			System.out.println(max);
			
		}
	}
}
