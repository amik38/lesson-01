package nota;

import java.util.Arrays;


public class vv {
	public static void main(String[] args) {
		

		int[] tab = {12, 3, 21, 8,65,98,87,767,54546,5};
        int min = Arrays.stream(tab).min().getAsInt();
        int max = Arrays.stream(tab).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
	   }
	}




