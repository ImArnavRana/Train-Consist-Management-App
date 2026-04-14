class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        void assignCargo(String cargo) {
            try {
                if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment");
                }
                this.cargo = cargo;
                System.out.println(type + " bogie assigned with " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Assignment attempt completed");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");
        b2.assignCargo("Petroleum");

        System.out.println("Program continues safely");
    }
}