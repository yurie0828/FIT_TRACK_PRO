private static void suggestWorkout() {
        printMenuHeader("Workout Suggestion");

        System.out.println("Goals:\n1. Lose Weight\n2. Gain Weight\n3. Maintain Weight");
        int goalChoice = readInt("Choose goal (1-3): ", 1, 3);

        System.out.println("Intensity:\n1. Low\n2. Medium\n3. High");
        int intensityChoice = readInt("Choose intensity (1-3): ", 1, 3);

        String goal = switch (goalChoice) {
            case 1 -> "Lose";
            case 2 -> "Gain";
            default -> "Maintain";
        };

        String intensity = switch (intensityChoice) {
    case 1 -> "Low";
    case 2 -> "Medium";
    default -> "High";
};

System.out.println("\nSuggested Workout:");
switch (goal) {
    case "Lose" -> {
        System.out.println("Focus on Cardio Workouts.");
        switch (intensity) {
            case "Low" -> System.out.println("• Brisk Walking, Light Cycling, Low-Impact Aerobics");
            case "Medium" -> System.out.println("• Jogging, Moderate Cycling, Dance Cardio");
            case "High" -> System.out.println("• Running, HIIT, Jump Rope");
        }
    }

    case "Gain" -> {
        System.out.println("Focus on Strength Training.");
        switch (intensity) {
            case "Low" -> System.out.println("• Bodyweight Squats, Light Dumbbells, Wall Push-Ups");
            case "Medium" -> System.out.println("• Bench Press, Lunges, Regular Push-Ups");
            case "High" -> System.out.println("• Deadlifts, Heavy Weight Lifting, Weighted Squats");
        }
    }

    case "Maintain" -> {
        System.out.println("Focus on a Balanced Routine.");
        switch (intensity) {
            case "Low" -> System.out.println("• Brisk Walking, Light Yoga, Stretching");
            case "Medium" -> System.out.println("• Jogging, Cycling, Pilates");
            case "High" -> System.out.println("• Interval Training, Power Yoga, Fast-Paced Sports");
        }
    }
}


        System.out.println("Intensity Level: " + intensity);
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }