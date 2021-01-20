package DTDL;

public class GetIndex {

	int equalIndex(int arr[], int n) {

		int sumR;
		int sumL;
		int i;
		int j;

		for (i = 1; i < arr.length; i++) {

			sumL = 0;
			for (j = 0; j < i; j++) {

				sumL += arr[j];
			}

			sumR = 0;
			for (j = i + 1; j < n; j++) {
				sumR += arr[j];	
			}
			if (sumR == sumL) {
				return i;
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int arr[] = { 3, 3, 0, 3 };

		GetIndex index = new GetIndex();
		int indx = index.equalIndex(arr, arr.length);

		System.out.println(indx);

	}

}			
