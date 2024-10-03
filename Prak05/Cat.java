public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4); // Cats have 4 legs
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Berburu seekor tikus");
    }

    @Override
    public void eat() {
        System.out.println("Bermain bola jahitan");
    }

    @Override
    public void walk() {
        System.out.println("Meminum Susu");
    }
}