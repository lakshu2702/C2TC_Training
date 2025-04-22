package genrics;

public class GenericsMethod{
	//Generic Method
	public static <T> void printArray(T[] elements){
		for(T element : elements) {
			System.out.print(element+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer [] intArray = {1,2,3,4};
		String[] strArray = {"Hello", "World"};
		
		System.out.print("Integer Array:");
		printArray(intArray);
		System.out.print("String Array:");
		printArray(strArray);
		}
}