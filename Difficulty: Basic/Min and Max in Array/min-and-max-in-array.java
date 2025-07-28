class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
         
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }
        
         
        int min = arr[0];
        int max = arr[0];
        
         
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
         
        return new Pair<>(min, max);
    }
}
