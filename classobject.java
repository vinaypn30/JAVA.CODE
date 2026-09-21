public class ClassObject {
    String name;
    int age;
    public ClassObject(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        ClassObject p = new ClassObject("Alice", 30);
        System.out.println(p.name + " " + p.age);
    }
}
