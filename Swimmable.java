package kirill.tasks_oop.secondTask;

public interface Swimmable {
    public void swim();
    public default void eat(){
        System.out.println("I'm eat food");
    }
}
