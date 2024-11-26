public class Human implements Swimmable, Fly {
    String type;
    String name;
    int age;

    public Human(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Умеет плавать техникой брасс");

    }

    @Override
    public void fly() {
        System.out.println("Умеет летать на самолете");
    }
}
