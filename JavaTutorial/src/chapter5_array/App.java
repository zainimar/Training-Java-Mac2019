package chapter5_array;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Zainimar Binti Zulkifli";
        p1.age = 34;
        p1.gender = "female";
        
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.gender);
        System.out.println(p1.getStatusKahwin("kanak-kanak"));
    }
}
