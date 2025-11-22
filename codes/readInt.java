  private static int readInt(String prompt, int min, int max) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max)
                    break;
                System.out.println("Value must be between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
        return value;
    }

    private static LocalDate readDate(String prompt) {
        LocalDate date;
        while (true) {
            try {
                System.out.print(prompt);
                date = LocalDate.parse(scanner.nextLine(), DATE_FORMAT);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Use YYYY-MM-DD.");
            }
        }
        return date;
    }

    enum Sex {
        MALE, FEMALE
    }

    enum WorkoutStatus {
        PENDING, COMPLETED
    }
