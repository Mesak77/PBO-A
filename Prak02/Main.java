public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Abner", 20, "Srengseng");
        person1.displayInfo();
  

    person1.setName("Mesak Mychart");
    person1.setAge(18);
    person1.setAddress("Bekasi");

    System.out.println("Sudah diubah");
    person1.displayInfo();
}

}