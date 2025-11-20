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

    private static void calculateMacronutrients() {
        printMenuHeader("Macronutrient Calculator");

        System.out.print("Enter weight (kg): ");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter height (cm): ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter age (years): ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter sex (M/F): ");
        String sexInput = scanner.nextLine().trim().toUpperCase();
        Sex sex = (sexInput.equals("M")) ? Sex.MALE : Sex.FEMALE;

        System.out.println(
                "Activity Level:\n1. Sedentary(Little or No Exercise)\n2. Lightly Active(Exercise 1 to 3 times a week)\n3. Moderately Active(Exercise 4 to 5 times a week)\n4. Very Active(Daily exercise and Intense)");
        int activityChoice = readInt("Choose activity level (1-4): ", 1, 4);
        double activityFactor;
        switch (activityChoice) {
            case 1 -> activityFactor = 1.2;
            case 2 -> activityFactor = 1.375;
            case 3 -> activityFactor = 1.55;
            default -> activityFactor = 1.725;
        }

        System.out.println("Goal:\n1. Lose Weight\n2. Gain Weight\n3. Maintain Weight");
        int goalChoice = readInt("Choose goal (1-3): ", 1, 3);
        double goalFactor = (goalChoice == 1) ? 0.8 : (goalChoice == 2) ? 1.2 : 1.0;
        double bmr = (sex == Sex.MALE)
                ? 10 * weight + 6.25 * height - 5 * age + 5
                : 10 * weight + 6.25 * height - 5 * age - 161;

        double tdee = bmr * activityFactor * goalFactor;

        double protein = weight * 2; 
        double fat = tdee * 0.25 / 9; 
        double carbs = (tdee - (protein * 4 + fat * 9)) / 4; 

        System.out.println("\nDaily Calorie & Macronutrient Recommendation:");
        System.out.println("+----------------+----------+----------+----------+");
        System.out.println("| Nutrient       | Grams    | Calories | % Total  |");
        System.out.println("+----------------+----------+----------+----------+");

        double proteinCal = protein * 4;
        double fatCal = fat * 9;
        double carbsCal = carbs * 4;

        System.out.printf("| %-14s | %-8.0f | %-8.0f | %-8.0f%% |\n", "Protein", protein, proteinCal,
                (proteinCal / tdee) * 100);
        System.out.printf("| %-14s | %-8.0f | %-8.0f | %-8.0f%% |\n", "Fat", fat, fatCal, (fatCal / tdee) * 100);
        System.out.printf("| %-14s | %-8.0f | %-8.0f | %-8.0f%% |\n", "Carbs", carbs, carbsCal,
                (carbsCal / tdee) * 100);

        System.out.println("+----------------+----------+----------+----------+");
        System.out.printf("Total Daily Calories: %.0f kcal\n", tdee);

        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }