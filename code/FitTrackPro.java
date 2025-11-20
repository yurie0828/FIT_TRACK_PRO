public class FitTrackPro {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Workout> workouts = new ArrayList<>();
    private static int nextWorkoutId = 1;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ISO_LOCAL_DATE;

    public static void main(String[] args) {
        printTitleBlock();
        scanner.nextLine();
        boolean running = true;
        while (running) {
            printMainMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    runNutritionCalculator();
                    break;
                case "2":
                    addWorkout();
                    break;
                case "3":
                    updateWorkoutStatus();
                    break;
                case "4":
                    searchWorkoutByDate();
                    break;
                case "5":
                    monitorWeeklyStatus();
                    break;
                case "6":
                    deleteWorkout();
                    break;
                case "7":
                    viewWorkoutHistory();
                    break;
                case "8":
                    clearScreen();
                    System.out.println("\nThank you for using FitTrack Pro! Stay consistent and strong!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice — please enter a number from 1 to 8.\n");
            }
        }
    }