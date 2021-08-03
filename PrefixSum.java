public class PrefixSum {
	
	int[] A = [1, 2, 3, 4, 5];

	// prefixSum - [0, 1, 3, 6, 10, 15]
	// prefixSum[i] - A[0] + A[1] + ... + A[i-1] the sum of first i numbers

	// sum from A[i] to A[j] is prefixSum[j+1] - prefixSum[i]

	int[] prefixSum = new int[A.length + 1];

	prefixSum[0] = 0;

	public void getPrefixSum () {
		for (int i = 1; i < prefixSum.length; i ++) {
			prefixSum[i] = prefixSum[i-1] + A[i-1];
		}

	}
}