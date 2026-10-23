// CSC241 Lab 02 - Task 5
// AIExperiment class: fields, state-changing methods, query methods, overloading.

class AIExperiment {
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    // Signature: runEpochs(int)
    void runEpochs(int epochs) {
        completedEpochs = completedEpochs + epochs;
    }

    // Signature: runEpochs(int, int)
    void runEpochs(int epochs, int bonusEpochs) {
        int totalEpochs = epochs + bonusEpochs;   // local variable
        completedEpochs = completedEpochs + totalEpochs;
    }

    int remainingEpochs() {
        int remaining = targetEpochs - completedEpochs;
        return remaining;
    }

    String status() {
        return experimentName + " | completed: " + completedEpochs
                + " / " + targetEpochs + " | remaining: " + remainingEpochs();
    }
}
