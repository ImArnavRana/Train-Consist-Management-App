import java.util.ArrayList;
import java.util.List;

class TrainConsistManagementApp {

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 60));
            bogies.add(new PassengerBogie("First Class", 0));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        for (PassengerBogie b : bogies) {
            System.out.println(b.name + " Capacity: " + b.capacity);
        }
    }
}