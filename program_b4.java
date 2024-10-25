// Write a program which creates two threads, one thread displaying
// “Vidyavardhaka College of Engineering” once every ten seconds and another
// displaying “CSE” once every two seconds.

// Thread class to print the college name every 10 seconds
class CollegeNameThread extends Thread {
    public void run() {
        while (true) { // Infinite loop to print continuously
            System.out.println("Vidyavardhaka College of Engineering"); // Print the college name
            try {
                Thread.sleep(10000); // Pause for 10 seconds (10000 ms)
            } catch (InterruptedException e) {
                System.out.println(e); // Print exception if interrupted
            }
        }
    }
}

// Thread class to print the department name every 2 seconds
class DepartmentThread extends Thread {
    public void run() {
        while (true) { // Infinite loop to print continuously
            System.out.println("CSE"); // Print the department name
            try {
                Thread.sleep(2000); // Pause for 2 seconds (2000 ms)
            } catch (InterruptedException e) {
                System.out.println(e); // Print exception if interrupted
            }
        }
    }
}

// Main class to execute both threads
public class program_b4 {
    public static void main(String[] args) {
        // Create instances of both thread classes
        CollegeNameThread ClgThread = new CollegeNameThread();
        DepartmentThread DeptThread = new DepartmentThread();

        // Start both threads
        ClgThread.start();
        DeptThread.start();
    }
}
