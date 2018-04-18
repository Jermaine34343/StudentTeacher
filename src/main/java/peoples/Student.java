package peoples;

    public class Student extends Person implements ILearner{

        private double totalStudyTime;

        public Student(long iD, String name){
            super(iD, name);
        }


        public void learn(double numberOfHours) {
            totalStudyTime = numberOfHours + totalStudyTime;
        }

        public double getTotalStudyTime(){
            return totalStudyTime;
        }

    }
