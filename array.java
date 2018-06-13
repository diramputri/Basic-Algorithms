package sortSelection;
import java.util.Arrays;
public class array {
	
	public static void main(String[] args) {
		
	int[] lst = {5,9,1,10,3};
	int min = 0;
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

