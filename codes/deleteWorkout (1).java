 private static void deleteWorkout() {
        printMenuHeader("Delete Workout Menu");

        if (workouts.isEmpty()) {
            System.out.println("\nNo workouts to delete. Press Enter to continue...");
            scanner.nextLine();
            return;
        }
        printWorkoutsTable(workouts);
        int id = readInt("\nEnter Workout ID to delete: ", 1, nextWorkoutId - 1);
        workouts.removeIf(w -> w.getId() == id);
        System.out.println("\nWorkout deleted if it existed. Press Enter to continue...");
        scanner.nextLine();
    }