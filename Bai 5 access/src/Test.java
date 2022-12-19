class Student{
    private String name="John";
    private String classes="C02";

    public Student(){}

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
}
public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Tan");
        s.setClasses("N02");
        System.out.println(s.getName());
        System.out.println(s.getClasses());
    }
}
