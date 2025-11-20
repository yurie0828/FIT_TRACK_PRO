 private static void addWorkout() {
        printMenuHeader("Add Workout Menu");

        System.out.println("Add a Workout");
        int week = readInt("Enter Week Number: ", 1, 52);
        int day = readInt("Enter Day Number: ", 1, 7);
        LocalDate date = readDate("Enter Date (YYYY-MM-DD): ");
        System.out.print("Enter Intensity (Low/Medium/High): ");
        String intensity = scanner.nextLine().trim();
        System.out.print("Enter Goal (Lose/Gain/Maintain): ");
        String goal = scanner.nextLine().trim();
        System.out.println("Workout Type:\n1. Cardio\n2. Strength\n3. Flexibility");
        int typeChoice = readInt("Choose type (1-3): ", 1, 3);

        Workout w;
        switch (typeChoice) {
            case 1 -> w = new Cardio(nextWorkoutId++, week, day, date, intensity, goal);
            case 2 -> w = new Strength(nextWorkoutId++, week, day, date, intensity, goal);
            default -> w = new Flexibility(nextWorkoutId++, week, day, date, intensity, goal);
        }

        workouts.add(w);
        System.out.println("Workout added successfully! Press Enter to continue...");
        scanner.nextLine();
    }