public class Person {
    private String name;
    private int age; 
    private String address; 

    public Person(String name, int age, String address) { 
        this.name    = name;
        this.age     = age; 
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {  
        return this.name;
    }

    public void setAge(int age) { 
        this.age = age;
    }

    public int getAge() { 
        return this.age;
    }

    public void setAddress(String address) {  // Nama metode diperbaiki menjadi setAddress
        this.address = address;
    }

    public String getAddress() {  // Nama metode diperbaiki menjadi getAddress
        return this.address;
    }

    public void displayInfo() {
        // Menggabungkan teks menggunakan tanda +
        System.out.println("Nama: " + this.name + ", Age: " + this.age + ", Jalan: " + this.address); 
    }
}