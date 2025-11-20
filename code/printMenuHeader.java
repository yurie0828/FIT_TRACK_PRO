 private static void printMenuHeader(String title) {
        clearScreen();
        String green = "\033[32m";
        String reset = "\033[0m";

        System.out.println(green + "\n══════════════════════════════════════════════════" + reset);
        System.out.println(green + "          " + title.toUpperCase() + reset);
        System.out.println(green + "══════════════════════════════════════════════════" + reset);
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 20; i++)
                System.out.println();
        }
    }