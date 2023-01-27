package kirill.tasks_oop.secondTask;

public class Bird extends Animal implements Flyable, Runnable, Swimmable{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("I'm bird and I love to fly in the sky");
    }

    @Override
    public void run() {
        System.out.println("I'm bird and I can run");
    }

    @Override
    public void swim() {
        System.out.println("I'm bird and I can swim");
    }

    @Override
    public void eat() {
        Swimmable.super.eat();
    }


    public void sing(){
        System.out.println("La-la-la");
    }
}
