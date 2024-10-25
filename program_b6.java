// 6. Develop a java program to create an enum as session and demonstrate the
// usage of value(), valueOf() and ordinal() methods.

enum Session {
    MORNING, AFTERNOON, EVENING, NIGHT // Enum constants representing different sessions
}

public class Program6 {
    public static void main(String[] args) {
        // Retrieve all the enum constants in the Session enum
        Session[] sessions = Session.values();
        System.out.println("All Enum Constants:");
        
        // Loop through each enum constant and print it
        for (Session session : sessions) {
            System.out.println(session);
        }
        
        // Define a string that corresponds to one of the enum constants
        String sessionName = "MORNING";
        
        // Convert the string to the corresponding enum constant
        Session session = Session.valueOf(sessionName);
        System.out.println("\nEnum Constant for Name '" + sessionName + "': " + session);
        
        // Get the ordinal (position) of the enum constant
        int ordinal = session.ordinal();
        System.out.println("\nPosition of Enum Constant " + session + ": " + ordinal);
    }
}
