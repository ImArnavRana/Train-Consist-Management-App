class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {};

        String searchId = "BG101";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID found: " + searchId);
        } else {
            System.out.println("Bogie ID not found");
        }
    }
}