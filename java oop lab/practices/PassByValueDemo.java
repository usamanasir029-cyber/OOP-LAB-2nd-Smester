// CSC241 Lab 02 - Task 4
// Three experiments that prove Java is pass-by-value.

class PassByValueDemo {

    void changeNumber(int x) {
        System.out.println("Inside Method : x = " + x);
        x = 99;
        System.out.println("Inside Method : x after assignment = " + x);
    }

    void changeStudent(Student st) {
        System.out.println("Inside Method : credits = " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("Inside Method : credits after mutation = " + st.completedCredits);
    }

    void replaceStudent(Student st) {
        System.out.println("Inside Method : name = " + st.name);
        st = new Student();
        st.name = "Temporary";
        st.completedCredits = 0;
        System.out.println("Inside Method : name after reassignment = " + st.name);
    }

    public static void main(String[] args) {
        PassByValueDemo demo = new PassByValueDemo();

        System.out.println("=== EXPERIMENT A : PRIMITIVE ===");
        int credits = 42;
        System.out.println("Before       : credits = " + credits);
        demo.changeNumber(credits);
        System.out.println("After        : credits = " + credits);

        System.out.println();
        System.out.println("=== EXPERIMENT B : OBJECT MUTATION ===");
        Student s1 = new Student();
        s1.studentId = "CIIT-SP26-BAI-001-LHR";
        s1.name = "Abeer Amina";
        s1.completedCredits = 42;
        System.out.println("Before       : credits = " + s1.completedCredits);
        demo.changeStudent(s1);
        System.out.println("After        : credits = " + s1.completedCredits);

        System.out.println();
        System.out.println("=== EXPERIMENT C : PARAMETER REASSIGNMENT ===");
        Student s2 = new Student();
        s2.studentId = "CIIT-SP26-BAI-002-LHR";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 36;
        System.out.println("Before       : name = " + s2.name);
        demo.replaceStudent(s2);
        System.out.println("After        : name = " + s2.name);

        // In every experiment the argument value is copied into the parameter.
        // For an int the copied value is the number itself, so changing the
        // parameter cannot touch the caller's variable. For a Student the copied
        // value is the reference, so both the caller and the method reach the
        // same object and a mutation is visible, but overwriting the parameter
        // only overwrites the copy and leaves the caller's variable alone.
    }
}
