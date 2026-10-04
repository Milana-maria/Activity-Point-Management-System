package activitypoint;

public class Teacher extends User {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String displayRole() {
        return "Teacher";
    }
}