class Solution {
    public int[] arrayRankTransform(int[] arr) {

        // Empty array
        if (arr.length == 0)
            return arr;

        // Copy original array
        int[] temp = arr.clone();

        // Sort copy
        Arrays.sort(temp);

        // Store rank of each unique element
        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int num : temp) {

            // Give rank only if element is not already present
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        // Replace original elements with their rank
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}