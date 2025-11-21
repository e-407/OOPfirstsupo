public class FinalStudentRecord {
    private final String name;
    private final int age;
    private final String college;

    public FinalStudentRecord(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public void print() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
}