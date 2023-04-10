package domain.dao;

public class Test {
    public static void main(String[] args) {
        Person doctor = new Doctor("张四",28,true);
        doctor.workLong(9);
        doctor.working();
        System.out.println("断点1");
        System.out.println("断点2");
    }
}
