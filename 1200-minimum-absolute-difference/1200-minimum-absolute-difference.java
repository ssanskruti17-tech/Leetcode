class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        // Find minimum difference
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            min = Math.min(min, diff);
        }

        // Store answer
        List<List<Integer>> ans = new ArrayList<>();

        // Find all pairs with minimum difference
        for (int i = 0; i < arr.length - 1; i++) {

            int diff = Math.abs(arr[i + 1] - arr[i]);

            if (diff == min) {

                List<Integer> pair = new ArrayList<>();

                pair.add(arr[i]);
                pair.add(arr[i + 1]);

                ans.add(pair);
            }
        }

        return ans;
    }
}