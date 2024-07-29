package session_10_oop_concepts.challenges.challenge_1;

public class Course {
    String duration;
    String description;
    String schedule;

    public Course(String duration, String description, String schedule) {
        this.duration = duration;
        this.description = description;
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
}


