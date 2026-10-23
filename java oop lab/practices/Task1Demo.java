// CSC241 Lab 02 - Task 1
// Three Student objects from one Student class, proving independent state.

class Task1Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = "CIIT-SP26-BAI-001-LHR";
        s1.name = "Abeer Amina";
        s1.completedCredits = 42;

        Student s2 = new Student();
        s2.studentId = "CIIT-SP26-BAI-002-LHR";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 36;

        Student s3 = new Student();
        s3.studentId = "CIIT-SP26-BAI-003-LHR";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 51;

        System.out.println("=== BEFORE CHANGE ===");
        System.out.println(s1.studentId + " | " + s1.name + " | " + s1.completedCredits);
        System.out.println(s2.studentId + " | " + s2.name + " | " + s2.completedCredits);
        System.out.println(s3.studentId + " | " + s3.name + " | " + s3.completedCredits);

        s2.completedCredits = s2.completedCredits + 9;

        System.out.println();
        System.out.println("=== AFTER ADDING 9 CREDITS TO s2 ONLY ===");
        System.out.println(s1.studentId + " | " + s1.name + " | " + s1.completedCredits);
        System.out.println(s2.studentId + " | " + s2.name + " | " + s2.completedCredits);
        System.out.println(s3.studentId + " | " + s3.name + " | " + s3.completedCredits);

        // s1 and s3 did not change because every new Student() call builds a
        // separate object that owns its own copy of completedCredits, and the
        // reference s2 can only reach the object it points to.
    }
}
