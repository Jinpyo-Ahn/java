package ch03.set;

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        // HashSet
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set);




        // 교집합, 합집합, 차집합 구하기
        // 집합 자료형 2개 생성
//        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        // 교집합 구하기 -> retainAll
//        HashSet<Integer> intersection = new HashSet<>(s1);
//        intersection.retainAll(s2);
//        System.out.println(intersection);

        // 합집합 구하기 -> addAll
//        HashSet<Integer> union = new HashSet<>(s1);
//        union.addAll(s2);
//        System.out.println(union);

        // 차집합 구하기 -> removeAll
//        HashSet<Integer> substract = new HashSet<>(s1);
//        substract.removeAll(s2);
//        System.out.println(substract);



        // 집합 자료형과 관련된 메서드 -add, addAll, remove
//        HashSet<String> set = new HashSet<>();

        // add
//        set.add("Jump");
//        set.add("To");
//        set.add("Java");
//        System.out.println(set);

        // addAll
//        set.add("Jump");
//        set.addAll(Arrays.asList("To", "Java"));
//        System.out.println(set);

        // remove
//        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
//        set.remove("To");
//        System.out.println(set);
    }
}
