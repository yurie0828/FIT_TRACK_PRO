  private static void updateWorkoutStatus() {
        printMenuHeader("Update Workout Status Menu");

        if (workouts.isEmpty()) {
            System.out.println("No workouts to update. Press Enter to continue...");
            scanner.nextLine();
            return;
        }
        printWorkoutsTable(workouts);
        int id = readInt("\nEnter Workout ID to mark as completed: ", 1, nextWorkoutId - 1);
        boolean found = false;
        for (Workout w : workouts) {
            if (w.getId() == id) {
                w.setStatus(WorkoutStatus.COMPLETED);
                System.out.println("Workout ID " + id + " marked as COMPLETED!");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Workout not found.");
        System.out.println("\nUpdated Workouts Table:\n");
        printWorkoutsTable(workouts);
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }