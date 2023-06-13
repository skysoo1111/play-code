package org.example.codingtest.z_quiz.array_string;

import java.util.*;
import java.util.stream.Collectors;

public class KthLargestArray {
    private static KthLargestArray o = new KthLargestArray();
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int solution = o.solutionByQueue(nums,k);
        System.out.println(solution);
    }

    // 정렬을 이용한 방법
    public int solution(int[] nums, int k){
        List<Integer> list = Arrays.stream(nums).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // list -> array
        int[] orderInt = list.stream().mapToInt(Integer::intValue).toArray();

        return list.get(k-1);
    }

    // priorityQueue 이용 방법
    public int solutionByQueue(int[] nums, int k){
        int answer = 0;
//        PriorityQueue<Integer> queue = new PriorityQueue<>((c1,c2)->c2.compareTo(c1));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }
        int cnt = 0;
        while (!queue.isEmpty()){
            Integer poll = queue.poll();
            if (cnt==k-1) {
                answer = poll;
                break;
            }
            cnt++;
        }
        return answer;
    }
}
