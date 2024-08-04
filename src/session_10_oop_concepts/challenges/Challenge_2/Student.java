package session_10_oop_concepts.challenges.Challenge_2;

public class Student {

    private String ID;
    private String firstName;
    private int grade;

    public Student(String ID, String firstName, int grade) {
        this.ID = ID;
        this.firstName = firstName;
        this.grade = grade;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getGrade() {
        return grade;
    }

}


