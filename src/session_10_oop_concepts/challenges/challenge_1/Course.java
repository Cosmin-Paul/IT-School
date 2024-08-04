package session_10_oop_concepts.challenges.challenge_1;

public class Course {
    private int courseId;
    private String courseName;
    private String schedule;
    private String duration;
    private String description;
    private String assignedProfessor;

    public Course(int courseId, String courseName, String schedule, String duration, String description, String assignedProfessor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.assignedProfessor = assignedProfessor;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedProfessor() {
        return assignedProfessor;
    }

    public void setAssignedProfessor(String assignedProfessor) {
        this.assignedProfessor = assignedProfessor;
    }
}