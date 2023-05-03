
public class Main {

    public static void main(String[] args) {

        Student alex = new Student( "Alex", "Morr");
        Student kate = new Student("kate", "Hudson");
        Student charlie = new Student("Charlie", "Lynn");
        Student lorie = new Student("Lorie", "Dunn");

        Group group1 = new Group(alex);
        group1.addStudent(alex);
        group1.addStudent(kate);
        group1.addStudent(charlie);
        group1.addStudent(lorie);

        group1.renameStudent(alex, "Alexander", "Morrison");

        group1.addTask("Lear how to code");
        group1.addTask("Learn javascript");

        group1.completeTask("Learn to code", alex);
        group1.completeTask("Learn to code", kate);
        group1.completeTask("Learn javascript", alex);

        group1.removeStudent(alex);
        group1.changeChairman(kate);
        group1.removeStudent(kate);
    }
}
