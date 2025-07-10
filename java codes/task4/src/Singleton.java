public class Singleton {
    private static Singleton classInstance;

    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (classInstance == null) {
            classInstance = new Singleton();
        }
        return classInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
