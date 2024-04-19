enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

}

/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        // Write a switch statement to print the expected output.
            switch (myVar) {
                case LOW:
                    System.out.println("This is low level");
                    System.out.println("enum is " + myVar.name() + ", and its value is " + myVar.value);
                    break;
                case MEDIUM:
                    System.out.println("This is medium level");
                    System.out.println("enum is " + myVar.name() + ", and its value is " + myVar.value);
                    break;
                case HIGH:
                    System.out.println("This is high level");
                    System.out.println("enum is " + myVar.name() + ", and its value is " + myVar.value);
                    break;
        }
    }
}