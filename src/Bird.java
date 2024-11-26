public class Bird implements Swimmable, Fly {
    String type;
    String name;
    int age;

    public Bird(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;


    }

    @Override
    public void swim() {
        System.out.println("Плывет, передвигая лапами");

    }

    @Override
    public void fly() {
        System.out.println("Умеет летать, благодаря крыльям");
    }
}
