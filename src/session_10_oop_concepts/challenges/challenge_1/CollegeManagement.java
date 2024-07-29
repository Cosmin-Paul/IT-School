package session_10_oop_concepts.challenges.challenge_1;

public class CollegeManagement {
    public static void main(String[] args) {
        Student student = new Student("Tudor", "Georgescu", 20, "2004-01-03", 100401034125L, " Str. Joseph Preyer 15");
        Student professor = new Student("Teodora", "Ivanovici", 47, "1977-19-11", 27719113500L, "Str. Miron Costin 144");

        Course chemistry = new Course("1h:30mn", "Chemistry Course", "Wednesday 08am");
        System.out.println(chemistry.description + " " + chemistry.duration + " " + professor.firstName + " " + professor.lastName);
    }
}
