
public class LinearSearch {

	public static void main(String[] args) {
		
		int[] lst = {5,9,1,10,3}; //this is my deck of cards
		int v = 1; //this is the card I would like to find
		int n = lst.length; //how many iterations should take place is n-1
		for (int i = 0; i < n; i++) {
			if (lst[i] == v) {
				System.out.println("Found! It is at " + i);
				return;
			}
		}
		System.out.println("The element is not in the array.");
		return;
		//for loop goes through each card (turns it number-side up) until my desired card is found.
		//otherwise, it says that the card is not in my set.
	}

}
