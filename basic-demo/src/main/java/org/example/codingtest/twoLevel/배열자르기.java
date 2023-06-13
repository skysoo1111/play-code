package org.example.codingtest.twoLevel;

public class 배열자르기 {
    public static void main(String[] args) {
        int[] solution = solution(3, 2, 5);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[Math.toIntExact(right - left + 1)];
        int start = 0;
        int end = Math.toIntExact(right - left + 1);
        // n * n행 2차원 배열 생성
        int[][] temp = new int[n][n];

        // n * n 모든 빈칸을 i로 채움
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (temp[i][j] == 0) {
                    temp[i][j] = Math.max(i,j) +1;
                }

                int target = temp[i].length * i + j;
                if (left <= target && target <= right && start < end)
                    answer[start++] = temp[i][j];

            }
        }

//        for (int i = 0; i < temp.length; i++) {
//            for (int j = 0; j < temp.length; j++) {
//                System.out.println("temp[" +i +"]["+j+"] = "+ temp[i][j]);
//            }
//        }
//
//        for (int i = 0; i < n*n; i++) {
//            System.out.println("temp[" +i +"] = "+ answer[i]);
//        }


       return answer;
    }
}
