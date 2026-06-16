class Solution {
   
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int result = 0;

        while (start <end) {
            int width = end - start;
            int ht = Math.min(heights[start], heights[end]);

            int water = width * ht;

            result = Math.max(result, water);

            if (heights[start] < heights[end])
                start++;
            else
                end--;
        }
        return result;
    }


}
