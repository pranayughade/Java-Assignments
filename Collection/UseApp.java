public class UseApp {
    public static void main(String[] args) {
        String[] arr = {"Ram","Shyam","Raj","CHandu","Aman"};
        Use<String> use = new Use<>();
        use.set(arr);
        use.print();

    }
}
