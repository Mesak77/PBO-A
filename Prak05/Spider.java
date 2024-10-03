public class Spider extends Animal {
    public Spider() {
        super(8); // Spiders have 8 legs
    }

    @Override
    public void eat() {
        System.out.println("Sedang menjebak serangga");
    }
}