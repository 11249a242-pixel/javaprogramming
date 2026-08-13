class Train {
    public static void main(String[] args) {
        String[] codes = {"T101", "T102", "T103"};

        try {
            System.out.println(codes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}