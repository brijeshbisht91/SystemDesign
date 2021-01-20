	package DTDL;
	
	public class LargestSubArray {
	
		public void SubArray(int arr[], int size) {
			int sum = 0;
			int maxsize = -1, startindex = 0;
			int endindex = 0;
	
			for (int i = 0; i < size - 1; i++) {
				sum = (arr[i] == 0) ? -1 : 1;
	
				for (int j = i + 1; j < size; j++) {
					if (arr[j] == 0) {
						sum = sum -1;
					} else {
						sum = sum +1;
					}
	
					if (sum == 0 && maxsize < j - i + 1) {
						maxsize = j - i + 1;
						startindex = i;
					}
				}
			}
			endindex = startindex + maxsize - 1;
	
			System.out.println(startindex + " to " + endindex);
	
		}
	
	
		public static void main(String[] args) {
			LargestSubArray sub;
			sub = new LargestSubArray();
			int arr[] = { 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
	
			sub.SubArray(arr, arr.length);
		}
	}
