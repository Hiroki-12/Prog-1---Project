import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    private static ArrayList<Activity> activities = new ArrayList<>();
    private static ArrayList <Athlete> athletes = new ArrayList<>();

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running)
        {
            System.out.println("\nWelcome to Strava! These are your options...");
            System.out.println("[0] Quit");
            System.out.println("[1] List options");
            System.out.println("[2] Create entries");
            System.out.println("[3] Calculate stats");
            System.out.print("Enter your choice: ");
                               
            int mainChoice = Integer.parseInt(scanner.nextLine());
            switch (mainChoice)
            {
                case 0 -> running = false;
                case 1 -> showListOptions(scanner);
                case 2 -> showCreateOptions(scanner);
                case 3 -> showCalculateOptions(scanner);
                default -> System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }

    private static void showListOptions(Scanner scanner) {
        System.out.println("\n[1] List all activities");
        System.out.println("[2] List all athletes");
        System.out.println("[3] List activities by athlete");
        System.out.println("[4] List activities by mode");
        System.out.print("Choose an option: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> listAllActivities();
            case 2 -> listAllAthletes();
            case 3 -> listActivitiesByAthlete(scanner);
            case 4 -> listActivitiesByMode(scanner);
            default -> System.out.println("Invalid choice.");
        }
    }

    private static void showCreateOptions(Scanner scanner) {
        System.out.println("\n[1] Create a new athlete");
        System.out.println("[2] Create a new activity");
        System.out.print("Choose an option: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> createAthlete(scanner);
            case 2 -> createActivity(scanner);
            default -> System.out.println("Invalid choice.");
        }
    }

    private static void showCalculateOptions(Scanner scanner) {
        System.out.println("\n[1] Total distance by athlete");
        System.out.println("[2] Total distance by all athletes");
        System.out.println("[3] Calories burned by athlete");
        System.out.print("Choose an option: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> showDistanceByAthlete(scanner);
            case 2 -> showTotalDistance(scanner);
            case 3 -> showCaloriesByAthlete(scanner);
            default -> System.out.println("Invalid choice.");
        }
    }

    private static void listAllActivities() {
        for (Activity a : activities) {
            System.out.println(a);
        }
    }

    private static void listActivitiesByAthlete(Scanner scanner) {
        System.out.println("Select athlete:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println("[" + i + "] " + athletes.get(i).getName());
        }
        int index = Integer.parseInt(scanner.nextLine());
        Athlete athlete = athletes.get(index);

        for (Activity a : athlete.getActivities()) {
            System.out.println(a);
        }
    }

    private static void listActivitiesByMode(Scanner scanner) {
        System.out.print("Enter mode of transport (WALKING, RUNNING, BIKING, SWIMMING): ");
        ModeOfTransport mode = ModeOfTransport.valueOf(scanner.nextLine().toUpperCase());
        for (Activity a : activities) {
            if (a.getMode() == mode) {
                System.out.println(a);
            }
        }
    }

    private static void listAllAthletes() {
        for (Athlete a : athletes) {
            System.out.println(a);
        }
    }
    
    private static void createAthlete(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter YOB: ");
        int YOB = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter weight (kg): ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter gender (MALE, FEMALE, OTHER): ");
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        athletes.add(new Athlete(name, YOB, gender, weight));
        System.out.println("Athlete created!");
    }

    private static void createActivity(Scanner scanner) {
        if (athletes.isEmpty()) {
            System.out.println("No athletes available. Create one first.");
            return;
        }
        System.out.println("Select athlete:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println("[" + i + "] " + athletes.get(i).getName());
        }
        int index = Integer.parseInt(scanner.nextLine());
        Athlete athlete = athletes.get(index);
        
        System.out.print("Enter date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter distance (km): ");
        double distance = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter duration (minutes): ");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter mode of transport (WALKING, RUNNING, BIKING, SWIMMING): ");
        ModeOfTransport mode = ModeOfTransport.valueOf(scanner.nextLine().toUpperCase());

        Activity activity = new Activity(date, distance, duration, mode, athlete);
        activities.add(activity);
        athlete.addActivity(activity);
        System.out.println("Activity created!");
    }
    
    private static void showTotalDistance(Scanner scanner)
    {
        double total = 0;
        for (Athlete a : athletes) {
            total += a.getTotalDistance();
        }
        System.out.println("\nTotal distance by all athletes: " + total + " km");
    }
    
    private static void showDistanceByAthlete(Scanner scanner) {
        System.out.println("Select athlete:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println("[" + i + "] " + athletes.get(i).getName());
        }
        int index = Integer.parseInt(scanner.nextLine());
        Athlete athlete = athletes.get(index);
        System.out.println("Total distance: " + athlete.getTotalDistance() + " km");
    }

    private static void showCaloriesByAthlete(Scanner scanner) {
        System.out.println("Select athlete:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println("[" + i + "] " + athletes.get(i).getName());
        }
        int index = Integer.parseInt(scanner.nextLine());
        Athlete athlete = athletes.get(index);
        System.out.println("Total calories burned: " + athlete.getTotalCaloriesBurned());
    }
}
