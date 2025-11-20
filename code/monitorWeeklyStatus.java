 private static void monitorWeeklyStatus() {
        printMenuHeader("Monitor Weekly Status Menu");

        if (workouts.isEmpty()) {
            System.out.println("No workouts recorded. Press Enter to continue...");
            scanner.nextLine();
            return;
        }
        Map<Integer, Integer> completedCount = new HashMap<>();
        Map<Integer, Integer> totalCount = new HashMap<>();
        for (Workout w : workouts) {
            totalCount.put(w.getWeekNumber(), totalCount.getOrDefault(w.getWeekNumber(), 0) + 1);
            if (w.getStatus() == WorkoutStatus.COMPLETED)
                completedCount.put(w.getWeekNumber(), completedCount.getOrDefault(w.getWeekNumber(), 0) + 1);
        }
        System.out.println("Weekly Completion Status:");
        for (Integer week : totalCount.keySet()) {
            int completed = completedCount.getOrDefault(week, 0);
            int total = totalCount.get(week);
            System.out.printf("Week %d: %d/%d completed%n", week, completed, total);
        }
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }