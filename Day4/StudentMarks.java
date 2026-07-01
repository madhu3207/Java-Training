package Day4;

public class StudentMarks {
    public static void main(String[] args) {//demonstrating labeled continue statement with student marks

        outer:
        for (int student = 1; student <= 3; student++) {
            for (int subject = 1; subject <= 3; subject++) {

                if (student == 2) {
                    continue outer;
                }

                System.out.println("Student " + student +
                                   " Subject " + subject);
            }
        }
    }
}
