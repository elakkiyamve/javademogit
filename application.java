public class application {

    public static void main(String args[]) {

        student firststudent = new student();
        /*
        firststudent.name = "rani";
        firststudent.roll_number = 101;
        firststudent.marks = 55;
        */

        student secondstudent = new student();
        /*
        secondstudent.name = "raja";
        secondstudent.roll_number = 121;
        secondstudent.marks = 25;
        */

        firststudent.firststudent("rani", 101, 55,"provided" );
        secondstudent.secondstudent("raja", 123, 25,"provided" );
        firststudent.studentmarks();
        secondstudent.studentmarks();
    }
}
