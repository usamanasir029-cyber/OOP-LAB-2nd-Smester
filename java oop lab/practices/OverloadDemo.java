// CSC241 Lab 02 - Task 3
// Method overloading and method signatures.

class OverloadDemo {

    // Signature: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in course " + courseCode + " (default section)");
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in course " + courseCode + " section " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course code " + numericCourseCode);
    }

    // INVALID OVERLOAD - differs only by return type.
    // Compiler error captured in compiler_notes.txt, then commented out.
    // int enroll(String courseCode) {
    //     return 1;
    // }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        // Valid calls
        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);

        // Invalid calls - kept commented after reading the compiler message.
        // demo.enroll();                 // no overload takes zero arguments
        // demo.enroll("241", "2");       // no overload takes (String, String)

        // The return type is not part of the method signature, so the compiler
        // has no way to pick between two methods that differ only by return type.
    }
}
