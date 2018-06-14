
package sortSelection;
public class sortSelection {
	
	public static void main(String[] args) {
		
	int[] lst = {5,9,1,10,3}; //this is my set of cards
	int min = 0; //starting index
	int n = lst.length; //the length is a guide for how many iterations will take place
	 
	    for (int i = 0; i < n; i++) {
	        min = i;
	        for(int j = i + 1;j<n;j++)
	        {
	            if(lst[j] < lst[min]) { min = j;}
	        }
	        int temp = lst[i];
	        lst[i] = lst[min];
	        lst[min] = temp;
	        System.out.println(lst[i]);
	    }
	}
}

//i++ means adding 1 to i after each iteration, the first for loop goes through n-1 iterations. It divides the cards into subsets

//the second for loop accounts for moving the minimum of each subset and swapping cards with a temporary object

