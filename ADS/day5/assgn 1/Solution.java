class Solution {

	public static boolean isMinHeap(double[] arr) {
		if (arr.length == 0) {
			return false;
		} else {
			for (int i = 1; i < arr.length / 2; i++) {
				if (((2 * i) < arr.length) && ((2 * i + 1) < arr.length)) {
					if ((arr[i] > arr[2 * i]) || (arr[i] > arr[2 * i + 1])) {
						return false;
					}
				}
			}
			return true;
		}
	}
}