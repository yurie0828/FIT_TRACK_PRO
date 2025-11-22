 private static void viewWorkoutHistory() {
        printMenuHeader("View Workout History Menu");

        if (workouts.isEmpty()) {
            System.out.println("\nNo workouts recorded. Press Enter to continue...");
            scanner.nextLine();
            return;
        }
        printWorkoutsTable(workouts);
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
