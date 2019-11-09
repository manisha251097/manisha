class Solution {
	MinPQ<Double> minobj;
	MaxPQ<Double> maxobj;

	public static double[] dynamicMedian(double[] arr) {
		int n = arr.length;
		MinPQ<Double> minobj = new MinPQ<Double>(n);
		MaxPQ<Double> maxobj = new MaxPQ<Double>(n);
		double median = 0.0;
		int size = 0;
		double[] dynamicMedian = new double[arr.length];
		for (int i = 0; i < n; i++) {

			if (arr[i] < median) {
				maxobj.insert(arr[i]);
			} else {
				minobj.insert(arr[i]);
			}
			if (minobj.size() > maxobj.size() + 1) {
				maxobj.insert(minobj.delMin());
			}
			if (maxobj.size() > minobj.size() + 1) {
				minobj.insert(maxobj.delMax());
			}
			if (minobj.size() == maxobj.size()) {
				median = (maxobj.max() + minobj.min()) / 2;
			} else if (minobj.size() > maxobj.size()) {
				median = minobj.min();
			} else {
				median = maxobj.max();
			}
			dynamicMedian[size++] = median;

		}
		return dynamicMedian;
	}
}
