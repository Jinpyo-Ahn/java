package ch05.constructor;

public class Sample {
    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(yorkshire.name);
    }
}
