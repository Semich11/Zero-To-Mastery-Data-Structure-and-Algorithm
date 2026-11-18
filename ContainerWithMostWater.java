public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {7, 1, 2, 3, 9};
        int maxArea = 0;
        System.out.println("Max Area: " + maxArea);

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                if (area > maxArea) {
                    maxArea = area;
                    System.out.println("New Max Area: " + maxArea + " between lines at index " + i + " and " + j);
                }
            }
        }
        System.out.println("Final Max Area: " + maxArea);
    }
}