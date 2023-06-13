package org.example.codingtest.oneLevel;

import java.util.Arrays;

public class Hamburg {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        solution(ingredient);
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        String str = Arrays.stream(ingredient)
                .mapToObj(String::valueOf)
                .reduce((x, y) -> x + y)
                .get();
        System.out.println(str);
        boolean compare = compare(str);


        Thread thread = new Thread(() -> {

        });
        thread.start();
        return answer;
    }

    public static boolean compare(String a) {
        return a.contains("1231");
    }
}
