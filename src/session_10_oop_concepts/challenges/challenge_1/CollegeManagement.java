package session_10_oop_concepts.challenges.challenge_1;

public class CollegeManagement {
    public static void main(String[] args) {
        Student student1 = new Student(1234, "Tudor", "Alexandrescu", 21, 'M', "2023-05-04", "1900305047575", "Bucuresti");
        Student student2 = new Student(9256, "Lucia", "Apostolescu", 20, 'F', "2004-07-30", "20040730114420", "Craiova");

        Professors prof1 = new Professors("Mihai", "Georgescu", 46, 'M', "1978-04-09", "19780409320011", "Bucuresti");
        Professors prof2 = new Professors("Georgeta", "Lucaci", 41, 'F', "1983-12-12", "19831212580011", "Timisoara");
        Professors prof3 = new Professors("Ronela", "Ivan", 43, 'F', "1986-02-12", "200809332550099", "Bucuresti");
        Professors prof4 = new Professors("Teodor", "Mihut", 40, 'M', "1984-07-22", "10084912350044", "Craiova");
        Professors prof5 = new Professors("Cornel", "Jula", 49, 'M', "1975-09-12", "100755912350114", "CLuj Napoca");

        Course course1 = new Course(416, "Geography", "MT", "1h", "World geography", "prof2");
        Course course2 = new Course(444, "History", "FW", "1h", "Elementary history", "prof1");
        Course course3 = new Course(315, "Music", "MF", "1h", "Instrument practice", "prof3");
        Course course4 = new Course(399, "Psichology", "MT", "1h", "Temperaments", "prof5");
        Course course5 = new Course(221, "Science", "Wt", "2h", "Instrument practice", "prof4");

        System.out.println(course1.getCourseName() + " " + course2.getDuration() + " " + prof2.getFirstName() + " " + prof2.getLastName());
        System.out.println(course2.getCourseName() + " " + course1.getDuration() + " " + prof1.getFirstName() + " " + prof1.getLastName());
        System.out.println(course3.getCourseName() + " " + course3.getDuration() + " " + prof3.getFirstName() + " " + prof3.getLastName());
        System.out.println(course4.getCourseName() + " " + course4.getDuration() + " " + prof5.getFirstName() + " " + prof5.getLastName());
        System.out.println(course5.getCourseName() + " " + course5.getDuration() + " " + prof4.getFirstName() + " " + prof4.getLastName());
    }
}
