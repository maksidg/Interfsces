public class Fish implements Swimmable {
    String type;
    String name;
    int age;

    public Fish(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;


    }

    @Override
    public void swim() {
        System.out.println("Плывет, двигая хвостом");
    }
}
