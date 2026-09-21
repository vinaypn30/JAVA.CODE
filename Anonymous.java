public class AnonymousClassDemo {
    interface Greet { String say(); }
    public static void main(String[] args) {
        Greet g = new Greet() { public String say() { return "hi"; } };
        System.out.println(g.say());
    }
}
