public class pattern4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for stars in each row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
