package Monitor1;


public class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor("e:\\1.txt", new FileEvent());
        m.start();
    }
}