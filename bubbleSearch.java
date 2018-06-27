import java.util.Arrays;
public class bubbleSearch {

	public static void main(String[] args) {
		
		int[] lst = {3,2,1,4};
		int n = lst.length;
		boolean swapped;
		do 
		{
			swapped = false; //initialization; assumes list is not ordered?
			for (int i = 0; i < n-1; i++) { //For n-1 iterations
				if (lst[i] > lst[i+1]) {
					int temp = lst[i]; 
					lst[i] = lst[i+1];
					lst[i+1] = temp; //Changes positions if element i > i+1
					swapped = true; 
				}
			}
		} while (swapped == true);
		
		System.out.println(Arrays.toString(lst));
	}

}
