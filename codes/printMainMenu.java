private static void printMainMenu() {
        clearScreen();
        String green = "\033[32m";
        String reset = "\033[0m";
        System.out.println(green + "════════════════════════════════════════════════════════════════════" + reset);
        System.out.println(green + "                     MAIN MENU - FIT TRACK PRO " + reset);
        System.out.println(green + "════════════════════════════════════════════════════════════════════" + reset);
        System.out.println("[1] Calorie & Nutrition Calculator");
        System.out.println("[2] Add Workout");
        System.out.println("[3] Update Workout Status");
        System.out.println("[4] Search Workout by Date");
        System.out.println("[5] Monitor Weekly Status");
        System.out.println("[6] Delete Workout");
        System.out.println("[7] View Workout History");
        System.out.println("[8] Exit");
        System.out.print("\nChoose an option: ");
    }
