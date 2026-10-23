// CSC241 Lab 02 - Student class (used by Task 1, Task 2 and Task 4)

class Student {
    String studentId;
    String name;
    int completedCredits;

    void addCredits(int credits) {
        completedCredits = completedCredits + credits;
    }

    int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits;
        return remaining;
    }

    String summary() {
        return studentId + " | " + name + " | credits: " + completedCredits;
    }
}
