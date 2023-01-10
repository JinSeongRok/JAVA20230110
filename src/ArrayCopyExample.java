
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + " ");
			
		}
		System.out.println();
		
		String[] newstrArr = new String[5];
		System.arraycopy(oldStrArray, 1, newstrArr, 1, 2);
		for(int i=0; i<newstrArr.length; i++) {
			System.out.print(newstrArr[i] + " ");
		}
		System.out.println();
		
		String[] newArr = new String[5];
		System.arraycopy(oldStrArray, 0, newArr, 2, 2);
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		
//		String[] new1 = new String[5];
//		System.arraycopy(oldStrArray, 0, new1, 0, 3);
//		for(int i=0; i<new1.length; i++) {
//			System.out.print(new1[i] + " ");
//		}
		
		
	}

}
