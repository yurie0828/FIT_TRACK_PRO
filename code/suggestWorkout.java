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
            case "Lose" -> System.out.println("Focus on Cardio: Running, Cycling, HIIT sessions");
            case "Gain" -> System.out.println("Focus on Strength Training: Weight lifting, Resistance exercises");
            case "Maintain" -> System.out.println("Balanced routine: Mix of Cardio and Strength Training");
        }

        System.out.println("Intensity Level: " + intensity);
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
