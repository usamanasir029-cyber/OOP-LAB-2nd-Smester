// CSC241 Lab 02 - Task 5 driver

class AIExperimentDemo {

    void trainExtra(AIExperiment experiment, int epochs) {
        experiment.completedEpochs = experiment.completedEpochs + epochs;
        System.out.println("Inside helper : " + experiment.status());
    }

    public static void main(String[] args) {
        AIExperimentDemo demo = new AIExperimentDemo();

        AIExperiment first = new AIExperiment();
        first.experimentName = "Urdu Sentiment Classifier";
        first.completedEpochs = 12;
        first.targetEpochs = 50;

        AIExperiment second = new AIExperiment();
        second.experimentName = "Crop Disease CNN";
        second.completedEpochs = 30;
        second.targetEpochs = 80;

        System.out.println("=== INITIAL STATE ===");
        System.out.println(first.status());
        System.out.println(second.status());

        System.out.println();
        System.out.println("=== AFTER runEpochs(int) ON first ONLY ===");
        first.runEpochs(8);
        System.out.println(first.status());
        System.out.println(second.status());

        System.out.println();
        System.out.println("=== AFTER OVERLOADED runEpochs(int, int) ON second ===");
        second.runEpochs(10, 5);
        System.out.println(first.status());
        System.out.println(second.status());

        System.out.println();
        System.out.println("=== REMAINING EPOCHS ===");
        System.out.println(first.experimentName + " needs " + first.remainingEpochs() + " more epochs");
        System.out.println(second.experimentName + " needs " + second.remainingEpochs() + " more epochs");

        System.out.println();
        System.out.println("=== PASS-BY-VALUE CHECK ===");
        System.out.println("Before helper : " + first.status());
        demo.trainExtra(first, 6);
        System.out.println("After helper  : " + first.status());

        // The argument value is copied into the parameter, and for an object the
        // copied value is the reference. The helper therefore reaches the same
        // AIExperiment object, so the mutation is visible to main.
    }
}
