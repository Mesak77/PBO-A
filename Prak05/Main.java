public class Main {
    public static void main(String[] args) {
        // 1. Buat objek Spider, nama bebas
        Spider spider = new Spider();
        
        // 2. Objek Spider → eat()
        System.out.println("Spider:");
        spider.eat();
        
        // 3. Buat objek Dog, nama bebas
        Dog dog = new Dog();
        
        // 4. Kasih nama anjingnya bebas
        dog.setName("Buddy");
        
        // 5. Tampilkan objek namanya
        System.out.println("\nDog:");
        System.out.println("Nama anjing: " + dog.getName());
        
        // 6. Objek dog play()
        dog.play();
        
        // 7. Objek dog eat()
        dog.eat();
        
        // 8. Objek dog walk()
        dog.walk();
        
        // 9. Buat object Cat, nama bebas dan sekaligus pakai constructor yang ada set namanya
        Cat cat = new Cat("Whiskers");
        
        // 10. Tampilkan objek kucing namanya
        System.out.println("\nCat:");
        System.out.println("Nama kucing: " + cat.getName());
        
        // 11. Object Cat play()
        cat.play();
        
        // 12. Object Cat eat()
        cat.eat();
        
        // 13. Object Cat walk()
        cat.walk();
    }
}