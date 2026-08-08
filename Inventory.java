//Warehouse Inventory Balancer
public class Inventory {
    public static void main(String[] args) {

        int[] A = {20, 15, 30};
        int[] B = {25, 10, 30};

        int sumA = 0, sumB = 0;
        int max = A[0];
        String section = "A";
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
            if (A[i] > max) {
                max = A[i];
                section = "A";
                index = i;
            }
        }

        for (int i = 0; i < B.length; i++) {
            sumB += B[i];
            if (B[i] > max) {
                max = B[i];
                section = "B";
                index = i;
            }
        }

        System.out.println("Section A Total: " + sumA);
        System.out.println("Section B Total: " + sumB);

        if (sumA == sumB)
            System.out.println("Status: Balanced");
        else
            System.out.println("Status: Not Balanced");

        System.out.println("Highest Quantity: " + max);
        System.out.println("Section: " + section);
        System.out.println("Item Index: " + index);
    }
}