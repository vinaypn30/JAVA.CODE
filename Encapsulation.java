public class EncapsulationDemo {
    private String data;
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public static void main(String[] args) {
        EncapsulationDemo e = new EncapsulationDemo();
        e.setData("secret");
        System.out.println(e.getData());
    }
}
