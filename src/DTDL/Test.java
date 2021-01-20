package DTDL;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		;
		int[] arr = { 6, 1, 2, 3, 4, 5 };

		int[] newarr = new int[arr.length];

		int count = 0;

		for (int i = 0; i < arr.length; i++)

		{
			if (arr[0] > arr[arr.length - 1]) {

				while (arr[count] > arr[arr.length - 1]) {

					newarr[newarr.length - 1] = arr[count];
					count++;

				}
				

			} else {
				newarr[i] = arr[i];
			}

//			if (arr[0] < arr[arr.length - 1]) {
//				System.out.println(arr[n]);
//			}
		}
		
		System.out.print(Arrays.toString(newarr));
	}

}
