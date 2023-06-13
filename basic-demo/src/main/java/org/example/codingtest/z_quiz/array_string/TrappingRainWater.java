package org.example.codingtest.z_quiz.array_string;

public class TrappingRainWater {
    private static TrappingRainWater o = new TrappingRainWater();
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int solution = o.solution(height);
        System.out.println(solution);
    }

    /**
     * 1. left 벽을 구하라 (한번 벽이 세워지면 그 다음 인덱스는 그 벽보다 낮을 순 없다.)
     * 2. right 벽을 구하라
     * 3. min 값을 구하라
     * 4. min - height 값을 구하라
     **/
    public int solution(int[] height) {
        int answer = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int[] wall = new int[height.length];

        int leftWall = 0;
        int rightWall = 0;

        /**
         * 1. left 벽을 구하라 (한번 벽이 세워지면 그 다음 인덱스는 그 벽보다 낮을 순 없다.)
         * 2. right 벽을 구하라
         **/
        for (int i = 0; i < height.length; i++) {
            left[i] = Math.max(leftWall,height[i]);
            leftWall = left[i];

            right[height.length -1 - i] = Math.max(rightWall, height[height.length - 1 -i]);
            rightWall = right[height.length - 1 - i];
        }

        /**
         * 3. min 값을 구하라
         * 4. min - height 값을 구하라
         **/
        for (int i = 0; i < wall.length; i++) {
            wall[i] = Math.min(left[i],right[i]);
            int j = wall[i] - height[i];
            answer += j;
        }

        return answer;
    }
}
