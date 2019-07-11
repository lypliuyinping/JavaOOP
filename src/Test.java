import model.Student;

public class Test {
    public static void main(String[] args) {
        Student xiaoming =new Student();
        xiaoming.setName("小明");
        xiaoming.setAge("18");
        xiaoming.setSex("男");
        xiaoming.setStudentID("12021022");
        System.out.println("姓名:"+xiaoming.getName()+"\n"+
                "年龄:"+xiaoming.getAge()+"\n"+
                "性别:"+xiaoming.getSex()+"\n"+
                "学号:"+xiaoming.getStudentID()
        );
    }
}
