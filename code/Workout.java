static abstract class Workout {
        private final int id, weekNumber, dayNumber;
        private final LocalDate date;
        private final String intensity, goal;
        private WorkoutStatus status = WorkoutStatus.PENDING;

        Workout(int id, int week, int day, LocalDate date, String intensity, String goal) {
            this.id = id;
            this.weekNumber = week;
            this.dayNumber = day;
            this.date = date;
            this.intensity = intensity;
            this.goal = goal;
        }

        public int getId() {
            return id;
        }

        public int getWeekNumber() {
            return weekNumber;
        }

        public int getDayNumber() {
            return dayNumber;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getIntensity() {
            return intensity;
        }

        public String getGoal() {
            return goal;
        }

        public WorkoutStatus getStatus() {
            return status;
        }

        public void setStatus(WorkoutStatus status) {
            this.status = status;
        }
    }