  private static void runNutritionCalculator() {
        printMenuHeader("Nutrition Calculator Menu");

        System.out.println("[1] Suggested Macronutrients");
        System.out.println("[2] Suggested Workout");
        System.out.print("\nChoose an option: ");
        String subChoice = scanner.nextLine().trim();

        switch (subChoice) {
            case "1":
                calculateMacronutrients();
                break;
            case "2":
                suggestWorkout();
                break;
            default:
                System.out.println("Invalid choice. Press Enter to return...");
                scanner.nextLine();
        }
    }
