import java.util.Scanner;

public class TimerAndStopwatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Timer");
            System.out.println("2. Stopwatch");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    timer();
                    break;
                case 2:
                    stopwatch();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private static void timer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the timer duration in seconds: ");
        int duration = scanner.nextInt();

        System.out.println("Timer started for " + duration + " seconds.");
        try {
            Thread.sleep(duration * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Timer ended.");
    }

    private static void stopwatch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stopwatch started. Press Enter to stop.");
        long startTime = System.currentTimeMillis();
        scanner.nextLine(); // Wait for user to press Enter
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.out.println("Stopwatch stopped. Elapsed time: " + elapsedTime + " milliseconds.");
    }
}

