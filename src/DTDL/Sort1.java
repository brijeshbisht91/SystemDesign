package DTDL;

import java.lang.reflect.Array;

public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input : arr[] = {1, 2, 0, 0, 0, 3, 6};
//	Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
//	
		int arr[] = { 1, 2, 0, 0, 0, 3, 6 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}

		}

		while (count < arr.length) {
			arr[count++] = 0;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	}
}