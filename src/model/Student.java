package model;

public class Student {
    private String name; // 成员变量
    private String age; // 成员变量
    private String sex; // 成员变量
    private String studentID; // 成员变量

    public Student() {

    }

    // 构造方法
    public Student(String name, String age,String sex,String studentID) {
        this.name = name;
        this.age = age;
        this.sex=sex;
        this.studentID=studentID;
    }
    //成员方法
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getStudentID() {
        return studentID;
    }
    // 成员方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }



}
