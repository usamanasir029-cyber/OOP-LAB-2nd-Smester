// CSC241 Lab 02 - Task 2
// Instance methods: parameters, local variables and return values.

class Task2Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = "CIIT-SP26-BAI-001-LHR";
        s1.name = "Abeer Amina";
        s1.completedCredits = 42;

        Student s2 = new Student();
        s2.studentId = "CIIT-SP26-BAI-002-LHR";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 36;

        int degreeCredits = 133;

        System.out.println("=== BEFORE METHOD CALLS ===");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        s1.addCredits(9);
        s2.addCredits(12);

        System.out.println();
        System.out.println("=== AFTER addCredits(...) ===");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        System.out.println();
        System.out.println("=== remainingCredits(" + degreeCredits + ") ===");
        System.out.println(s1.name + " still needs " + s1.remainingCredits(degreeCredits) + " credits");
        System.out.println(s2.name + " still needs " + s2.remainingCredits(degreeCredits) + " credits");

        // completedCredits is a field (object state).
        // credits and degreeCredits are parameters (copies of the arguments).
        // remaining inside remainingCredits(...) is a local variable.
    }
}
