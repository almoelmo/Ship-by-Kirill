package kirill.tasks_oop.secondTask;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 10);
        dog.eat();
        dog.run();
        dog.play();
        dog.swim();
        Fish fish = new Fish("Goldy", 3);
        fish.sayName();
        fish.eat();
        fish.swim();
        Bird bird = new Bird("Kesha", 5);
        bird.eat();
        bird.fly();
        bird.run();
        bird.swim();
        bird.sing();
    }
}
