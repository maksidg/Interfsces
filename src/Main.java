public class Main {
    public static void main(String[] args) {
Human human = new Human("Человек", "Максим", 23);
human.swim();
human.fly();
        System.out.println("--------------------------");
Bird bird = new Bird("Птица", "утка", 2);
bird.swim();
bird.fly();
        System.out.println("--------------------------");
Swimmable fish = new Fish("Рыба", "карась", 1);
fish.swim();
    }
}
