  private static void printWorkoutsTable(List<Workout> list) {
        String green = "\033[32m";
        String yellow = "\033[33m";
        String reset = "\033[0m";

        System.out.printf("| %-3s | %-5s | %-3s | %-10s | %-10s | %-10s | %-10s|\n",
                "ID", "Week", "Day", "Date", "Intensity", "Goal", "Status");
        System.out.println("-------------------------------------------------------------------------------");

        for (Workout w : list) {
            String statusColor = (w.getStatus() == WorkoutStatus.COMPLETED)
                    ? green + w.getStatus() + reset
                    : yellow + w.getStatus() + reset;

            System.out.printf("| %-3d | %-5d | %-3d | %-10s | %-10s | %-10s | %-10s |\n",
                    w.getId(), w.getWeekNumber(), w.getDayNumber(),
                    w.getDate().format(DATE_FORMAT), w.getIntensity(), w.getGoal(), statusColor);
        }
    }
