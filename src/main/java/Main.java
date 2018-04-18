import peoples.ILearner;
import peoples.Instructor;
import peoples.Student;

public class Main {
    public static void main(String[] args) {
        Instructor superEnglishTeacher = new Instructor(03034323456, "Sonia Lewis");
        Student allDayLearner = new Student(394857362, "Freddy Fazebear");
        ILearner[] yearUp= new ILearner[]{allDayLearner};
        superEnglishTeacher.teach(allDayLearner,9.5);
        System.out.println("The students learn for " + allDayLearner.getTotalStudyTime() + " hours");
        superEnglishTeacher.lecture(yearUp, 8.5);

    }
}
