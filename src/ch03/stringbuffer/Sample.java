package ch03.stringbuffer;

public class Sample {
    public static void main(String[] args) {
        //StringBuffer의 다양한 메서드

        //append1
//        StringBuffer sb = new StringBuffer();
//        sb.append("hello");
//        sb.append(" ");
//        sb.append("jump to java");
//        String result = sb.toString();
//        System.out.println(result);

        //append2
//        String result = "";
//        result += "hello";
//        result += " ";
//        result += "jump to java";
//        System.out.println(result);

        //StringBuilder
//        StringBuilder sb = new StringBuilder();
//        sb.append("hello");
//        sb.append(" ");
//        sb.append("jump to java");
//        String result = sb.toString();
//        System.out.println(result);

        //insert
//        StringBuffer sb = new StringBuffer();
//        sb.append("jump to java");
//        sb.insert(0, "hello ");
//        System.out.println(sb.toString());

        //substring
        StringBuffer sb = new StringBuffer();
        sb.append("Hello jump to java");
        System.out.println(sb.substring(0, 4));

    }
}
