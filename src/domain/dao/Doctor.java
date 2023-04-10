package domain.dao;

public class Doctor extends Person{
    public Doctor(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    @Override
    public void working() {
        System.out.println(super.getName()+"正在做手术");
    }

    @Override
    public void workLong(int workLong) {
        System.out.println(super.getName()+"一天工作"+workLong+"个小时");
    }
}
