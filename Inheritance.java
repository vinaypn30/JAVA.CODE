class Animal {
    String name = "animal";
    void eat() { System.out.println("eating"); }
}
class Dog extends Animal {
    void bark() { System.out.println("barking"); }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println(d.name);
    }
}
