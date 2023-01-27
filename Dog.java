package kirill.tasks_oop.secondTask;

public class Dog extends Animal implements Swimmable, Runnable {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("I'm dog and I love to run");
    }

    @Override
    public void swim() {
        System.out.println("I'm dog and I swim in poll");
    }

    @Override
    public void eat() {
        Swimmable.super.eat();
        System.out.println("And also I'm the dog!");
    }


    public void play(){
        System.out.println("I'm playing");
    }
}
