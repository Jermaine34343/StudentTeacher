package peoples;

public class Instructor extends Person implements ITeacher{

    public Instructor(long iD, String name){
        super(iD, name);
    }

    public void teach(ILearner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(ILearner[] learners, double numberOfHours) {

        for (int x = 0; x < learners.length; x++){
            learners[x].learn(numberOfHours);
            System.out.println("Instructor teaches for " + numberOfHours);
        }
    }
}
