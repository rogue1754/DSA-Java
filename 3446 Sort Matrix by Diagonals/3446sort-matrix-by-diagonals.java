class Solution {
    public int[][] sortMatrix(int[][] grid) {
            int n = grid.length;
        int[][] ans = new int[n][n];

        // Map from (i - j) to a list of diagonal elements
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Collect diagonals from the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }

        // Sort diagonals as specified
        for (int key : map.keySet()) {
            List<Integer> diag = map.get(key);
            if (key < 0) {
                Collections.sort(diag); // Ascending
            } else {
                diag.sort(Collections.reverseOrder()); // Descending
            }
        }

        // Track index for each diagonal for safe retrieval
        Map<Integer, Integer> diagIndex = new HashMap<>();

        // Place sorted elements back into the answer matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                List<Integer> diag = map.get(key);
                int idx = diagIndex.getOrDefault(key, 0);
                ans[i][j] = diag.get(idx);
                diagIndex.put(key, idx + 1);
            }
        }

        return ans;
    }
}