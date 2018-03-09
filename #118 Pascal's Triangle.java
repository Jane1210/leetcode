class Solution {
  public List<List<Integer>> generate(int numRows) {

		int[][] element = new int[numRows][numRows];

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					element[i][j] = 1;
				else {
					element[i][j] = element[i-1][j-1] + element[i-1][j];
				}
				row.add(element[i][j]);
			}
			list.add(row);
		}
		return list;
	}
}
