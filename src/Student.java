public class Student {

    private int id;
    private static int currentId = 0;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        currentId++;
        this.id = currentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getId(){
        return id;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
}
