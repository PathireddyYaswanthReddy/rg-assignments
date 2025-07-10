public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Yaswanth");
        s.setAge(20);
        s.setHeight(180);
        s.setWeight(68.5);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Height: " + s.getHeight());
        System.out.println("Weight: " + s.getWeight());
    }
}
