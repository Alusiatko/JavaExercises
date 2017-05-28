package random;

public class SymmetricTriangles {
    void drawSymFromL(int n) {
        /* the main loop have to start from "1",
        because if I will multiply by "0" then in the first row there will be NO asterisk
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void drawSymFromG(int n) {
        /* the have to be condition i > 0 in the main loop (without "=" sign),
        because I need to have one asterisk in the last row
         */
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < (n - i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SymmetricTriangles st = new SymmetricTriangles();
        System.out.println("From the lowest do the greatest:");
        st.drawSymFromL(7);
        System.out.println("From the greatest do the lowest:");
        st.drawSymFromG(3);
    }
}
