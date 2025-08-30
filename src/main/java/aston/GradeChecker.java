package aston;

public class GradeChecker {
    public static void main(String[] args) {
        int score = 75;  // Step 1: hard-coded value

        // Step 2: If statement for pass/fail
        if (score >= 50) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }

        // Step 3: Switch statement for grade
        switch (score) {  // dividing by 10 to group ranges
            case 100:
                System.out.println("Grade: A");
                break;
            case 90:
                System.out.println("Grade: B");
                break;
            case 80:
                System.out.println("Grade: C");
                break;
            case 70:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
    }
}

