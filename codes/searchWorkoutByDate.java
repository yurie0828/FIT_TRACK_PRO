private static void searchWorkoutByDate() {
        printMenuHeader("Search Workout by Date Menu");

        if (workouts.isEmpty()) {
            System.out.println("No workouts recorded. Press Enter to continue...");
            scanner.nextLine();
            return;
        }
        LocalDate date = readDate("Enter date to search (YYYY-MM-DD): ");
        List<Workout> results = new ArrayList<>();
        for (Workout w : workouts) {
            if (w.getDate().equals(date))
                results.add(w);
        }
        if (results.isEmpty())
            System.out.println("No workouts found on " + date);
        else
            printWorkoutsTable(results);
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
