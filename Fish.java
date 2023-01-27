package kirill.tasks_oop.secondTask;

public class Fish extends Animal implements Swimmable{

    public Fish(String name, int age) {
        super(name, age);
    }


    @Override
    public void swim() {
        System.out.println("I'm fish and I swim in lake");
    }

    @Override
    public void eat() {
        Swimmable.super.eat();
        System.out.println("And also I'm the fish!");
    }

    public void sayName(){
        System.out.println("My name is " + getName());
    }
}
