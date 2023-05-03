import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {

    private Student chairman;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();
    private Map<String, List<Student>> completedTasks = new HashMap<>();

    public Group(Student chairman){
        this.chairman = chairman;
    }

    public void changeChairman(Student newChairman){
        this.chairman = newChairman;
    }

    public void addStudent (Student student){
        this.students.add(student);
    }

    public void addTask(String task){
        this.tasks.add(task);
    }

    public Student getChairman(){
        return chairman;
    }

    public List getStudents(){
        return students;
    }

    public List getTasks(){
        return tasks;
    }

    public void getById(int id) {
        for (Student student : students) {
            if (id == student.getId()) {
                System.out.println(student.getFullName());
            }
        }
    }

    public void renameStudent(Student student, String newFirstName, String newLastName){
        student.setFirstName(newFirstName);
        student.setLastName(newLastName);
    }

    public void removeStudent(Student student){
        if(student == getChairman()){
            System.out.println("You can not remove the chairman, please reassign position to other user");
        }else{
        students.remove(student);
        }
    }

    public void completeTask(String task, Student student){
        if (completedTasks.containsKey(task)) {
            completedTasks.get(task).add(student);
        }else{
            List<Student> studentList = new ArrayList<>();
            completedTasks.put(task, studentList);
        }
    }
}
