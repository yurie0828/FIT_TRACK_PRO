# 🏃 FIT TRACK PRO: CONSOLE FITNESS TRACKER #

## 📌 DESCRIPTION 

Fit Track Pro is a console-based tracker built in `Java` that helps users monitor and manage their fitness journey in a smart way. The program integrates a workout tracking system that allows users to `add, update, search, and view workouts` while tracking weekly progress. It has also a `calorie & nutrition calculator` that helps users estimate their calorie intake and basic nutritional needs. The program is designed to encourage fitness consistency and improve overall health by providing a simple, interactive tracking system.


## 🚀 OBJECT ORIENTED PROGRAMMING CONCEPTS APPLIED

**Encapsulation** - The Workout class and its subclasses (Cardio, Strength, Flexibility) incorporate workout data (ID, week, day, date, intensity, goal, status) and associated behavior. OOP Concepts Applied Fit Track Pro exemplifies a  number of important OOP concepts. This guarantees consistency and safeguards the data.

**Abstraction** - The Workout class is an abstract class, providing a general structure for different types of workouts. This enables the program to manage exercises in a general manner while still permitting particular implementations.

**Inheritance** - Common properties and methods are inherited by the Cardio, Strength and Flexibility classes from the Workout class.

**Polymorphism** - It is demonstrated when different workout objects (Cardio, Strength, or Flexibility) are treated as instances of the Workout class. Through method overriding, each workout type can define its own version of these methods, showcasing true polymorphic behavior.

**Enum Usage** - Examples of employing enums to define a defined set of potential values, which improves code readability and lower errors, include the Sex and WorkoutStatus enums.

**Exception Handling** - 


## :gear: PROGRAM STRUCTURE 

**1. FitTrackPro (Main Class)**

- It is responsible for everything that has to do with the user, it takes care of the input/output and workouts. It is the main controller of the whole fitness tracking system that operates in console mode.

`Variables or Attributes `

- scanner – Input is taken from the console user via this.

- workouts – This is the list comprising all workouts that have been added.

- nextWorkoutId – New workouts are allocated IDs automatically in ascending order.

- DATE_FORMAT – One and the same format is used for inputting and displaying date.

`Methods (or Functions)`

- *main()* - Entry point for the programme, it controls the main menu loop.

- *printTitleBlock()* - The screen with the title and decoration gets displayed.

- *printMainMenu()* - It displays the options available on the main menu.

- *addWorkout()* - A new workout is appended to the workouts list.

- *updateWorkoutStatus()* - The status (completed/pending) of a workout is altered.

- *searchWorkoutByDate()* - The user can search their added workouts by date.

- *monitorWeeklyStatus()* - It provides a weekly summary of workout completion.

- *deleteWorkout()* - User can delete a specific workout that has been completed.

- *viewWorkoutHistory()* - All logged workouts are shown.

- *runNutritionCalculator()* - The system will calculate the data that the user inputs to the system and it will serve as a guide of how many macronutrients and calories the user needs to take per day.

- *clearScreen()* - The console is cleared to help with the readability.

**2. Workout (Supporting Class)**

- A single workout session is depicted, and all the information about that workout is wrapped.

`Attributes`

- *id* – Each workout is assigned a distinct identifier.

- *type* – The type of workout (e.g., Cardio, Strength). 

- *date* – The workout was either performed or it was waiting on that particular day.

- *status* – It indicates whether the workout is done or still needs to be done.

`Methods (or Functions)`

- Getters and setters are available for all attributes (encapsulation ensures control over access).

**3. Class Relationships**
- FitTrackPro utilizes Workout for the individual workout management.

- FitTrackPro keeps a collection of Workout objects and offers operations such as add, update, delete, and search.

- Every method in FitTrackPro is working with the Workout objects which gives the opportunity to have a modular and reusable functionality.



## 🧑‍💻 HOW TO RUN THE PROGRAM

**To run Fit Track Pro, do the following:**

`Requirements:`

- Make sure your system has the Jva Development Kit (JDK) installed (version 11 or later is recommended).
- Configure your JDK installation directory as the value of the JAVA_HOME environment variable.
 - Make sure your system’s PATH contains java and javac commands.

`Compilation:`
1. Save the code as FitTrackPro.java.
2. Open a command prompt or terminal.
3. Navigate to the directory where FitTrackPro.java is saved.
4. Compile the code using the command : javac FitTrackPro.java

`Implementation:`

Use the command FitTrackPro to launch the application.

`User Interface:`

The application will launch with a console-based user interface.
To engage with the fitness tracking system, follow the menu prompts displayed on the screen.
To choose menu selections and enter the needed information, enter the corresponding numbers.

## :desktop_computer: SAMPLE OUTPUT
*HEADER*

![Alt Text](https://github.com/yurie0828/FIT_TRACK_PRO/blob/017fffd3fd3757191ac3bb030974de1a0897374d/Images/Header.png)

*MAIN MENU*

![Alt Text](https://github.com/yurie0828/FIT_TRACK_PRO/blob/d5bbd82160321479760e49ad872a803b9b5fc511/Images/Main_menu.png)) 

*CALCULATOR*

![Alt Text](https://github.com/yurie0828/FIT_TRACK_PRO/blob/d5bbd82160321479760e49ad872a803b9b5fc511/Images/calculator.png))

*ADDING WORKOUT*

![Alt Text](https://github.com/yurie0828/FIT_TRACK_PRO/blob/d5bbd82160321479760e49ad872a803b9b5fc511/Images/Add_workout.png)

*VIEW WORKOUT HISTORY*

![Alt Text](https://github.com/yurie0828/FIT_TRACK_PRO/blob/d5bbd82160321479760e49ad872a803b9b5fc511/Images/view.png)

## :memo: AUTHOR AND ACKNOLEDGEMENT

## :hammer_and_wrench: FUTURE ENHANCEMENTS 

- Include simple graphs or charts in the program for better visualization.
- For working in a more user-friendly interaction, migrate to GUI version like JavaFX or Swing.
 - Include a simple console daily reminders or notifications for pending workouts.
- Implement file based (i.e., CSV, JSON) or database-based storage (e.g. SQLite) so that a user can save his or her workout history between program sessions.
- Let users input meals and monitor daily consumption to receive more accurate dietary advice.

    

## :paperclips: REFERENCES

