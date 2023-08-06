package ch03.array;

public class Sample {
    public static void main(String[] args) {
        //1부터 10까지 숫자 중 홀수 집합
//        int[] odds = {1, 3, 5, 7, 9};

        //String 배열로 요일의 집합 표현
//        String[] weeks = {"월","화", "수", "목", "금", "토", "일"};

        //배열의 길이 설정하기
//        String[] weeks = new String[7];
//        weeks[0] = "월";
//        weeks[1] = "화";
//        weeks[2] = "수";
//        weeks[3] = "목";
//        weeks[4] = "금";
//        weeks[5] = "토";
//        weeks[6] = "일";

        //배열 값에 접근하기
//        String[] weeks = {"월","화", "수", "목", "금", "토", "일"};
//        System.out.println(weeks[3]);
//        System.out.println(weeks[8]); -> ArrayIndexOutOfBoundsException 오류 발생

        //배열의 길이 구하기
        String[] weeks = {"월","화", "수", "목", "금", "토", "일"};
        for(int i = 0; i < weeks.length; i++){
            System.out.println(weeks[i]);
        }

    }
}
