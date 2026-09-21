public class ObjectMethods {
    String id;
    public ObjectMethods(String id) { this.id = id; }
    @Override
    public String toString() { return "Obj:" + id; }
    @Override
    public boolean equals(Object o) { return (o instanceof ObjectMethods) && ((ObjectMethods)o).id.equals(this.id); }
    @Override
    public int hashCode() { return id.hashCode(); }
    public static void main(String[] args) {
        ObjectMethods a = new ObjectMethods("x");
        ObjectMethods b = new ObjectMethods("x");
        System.out.println(a.toString());
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
    }
}
