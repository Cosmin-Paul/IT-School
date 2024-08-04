package session_17_equals_hashcode_generics.challenges.Challenge_3;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private String email;

    public Student(String name, int age, String studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj; // Cast to Student
        return age == student.age &&
                Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}