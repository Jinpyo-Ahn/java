package ch04.for_sentence;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        // for 문의 기본 구조
//        int[] marks = {90, 25, 67, 45, 80};
//        for(int i = 0; i < marks.length; i++){
//            if(marks[i] >= 60)
//                System.out.println((i + 1) + "번 학생은 합격입니다.");
//            else
//                System.out.println((i + 1) + "번 학생은 불합격입니다.");
//        }

        // for 문으로 돌아가기 - continue
//        int[] marks = {90, 25, 67, 45, 80};
//        for(int i = 0; i < marks.length; i++){
//            if (marks[i] < 60){
//                continue;
//            }
//            System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다.");
//        }

        // 이중 for 문
//        for(int i = 2; i < 10; i++) {
//            for(int j = 1; j < 10; j++){
//                System.out.print(i*j+" ");
//            }
//            System.out.println("");
//        }

        // for each 문
//        String[] numbers = {"one", "two", "three"};
//        for(String number: numbers)
//            System.out.println(number);

        // for each 문 - ArrayList로 구현한 예제
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers)
            System.out.println(number);
    }
}
