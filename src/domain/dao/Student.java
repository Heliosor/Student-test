package domain.dao;

public class Student extends Person{
    public Student(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    @Override
    public void working() {
        System.out.println(super.getName()+"在努力敲代码");
    }

   @Override
    public void workLong(int workLong) {
        System.out.println(super.getName()+"一天工作"+workLong+"个小时");
    }
}
