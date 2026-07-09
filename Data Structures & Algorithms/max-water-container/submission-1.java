class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int maxarea = -999;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            area = (right - left) * Math.min(heights[left], heights[right]);
            if (area > maxarea) {
                maxarea = area;
            }
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxarea;
    }
}
