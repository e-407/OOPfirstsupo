public record StudentRecord(String name, int age, String college){
    public void print() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
}
