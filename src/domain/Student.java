package domain;

import org.junit.Test;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    private int ID;
    private int age;
    private String name;
    //  true为 男，false为 女
    private boolean sex;
    private int grade;
    private  Student_condition   status;
    private Date birthdays;
    private double score;

    public Student(int ID, int age, String name, boolean sex, int grade, Student_condition status, Date birthdays, double score) {
        this.ID = ID;
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.status = status;
        this.birthdays = birthdays;
        this.score = score;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student_condition getStatus() {
        return status;
    }

    public void setStatus(Student_condition status) {
        this.status = status;
    }

    public Date getBirthdays() {
        return birthdays;
    }

    public void setBirthdays(Date birthdays) {
        this.birthdays = birthdays;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", grade=" + grade +
                ", status=" + status +
                ", birthdays=" + birthdays +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        Student student = (Student) o;
        if (ID != student.ID) {return false;}
        if (age != student.age){ return false;}
        if (sex != student.sex) {return false;}
        if (grade != student.grade){ return false;}
        if (Double.compare(student.score, score) != 0){ return false;}
        if (!Objects.equals(name, student.name)) {return false;}
        if (status != student.status) {return false;}
        return Objects.equals(birthdays, student.birthdays);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = ID;
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex ? 1 : 0);
        result = 31 * result + grade;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (birthdays != null ? birthdays.hashCode() : 0);
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    public Student() {
    }

    @Test
    public void Text() throws ParseException {
        //  将 java.util.Date 类转化成Timestamp 类
        Timestamp timestamp = new Timestamp(new java.util.Date().getTime());
        Date date = new Date();
        Timestamp timestamp1 = new Timestamp(date.getTime());
        String s = timestamp1.toString();
           //将字符串转化为 util.Date 类
        System.out.println(date.getTime());
        System.out.println(timestamp1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date parse = dateFormat.parse(s);

    }
public static void tyt(){
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    Date date = new Date();
    //格式化  ；  日期  -->字符串
    String s = simpleDateFormat.format(date);
    System.out.println(s);
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DATE,12);
    calendar.set(Calendar.MONTH,4);
    Date time = calendar.getTime();
    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(time);
    System.out.println(simpleDateFormat1.format(time));
    Timestamp t = new Timestamp(System.currentTimeMillis());
    String s1 = t.toString();
    Timestamp timestamp = Timestamp.valueOf(s1);
    System.out.println(s1);
    System.out.println(simpleDateFormat1.format(t));
}
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int max = 0;
        for (int i = 1; i <= num.length(); i++) {
            for (int j = 0; j < i; j++) {
                String str = num.substring(j, i);
                int numm = Integer.parseInt(str);
                if(numm %2 !=0){
                    if(max<numm){
                        max = numm;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
