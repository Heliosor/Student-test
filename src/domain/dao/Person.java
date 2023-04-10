package domain.dao;

public class Person {
    private String name;
    private int age;
    private boolean sex;

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void  working(){
        System.out.println(name+"正在努力学习专业知识!");
    }
    public void workLong(int workLong){
        System.out.println(name+"一天工作"+workLong+"小时");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

}
