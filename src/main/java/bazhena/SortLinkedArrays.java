package bazhena;

public class SortLinkedArrays {
    public static void main(String[] args) {
        int size = 5;
        int[] intArr = new int[size];
        double[] doubleArr = new double[size];

        // Fill arrays with random values
        for (int i = 0; i < size; i++) {
            intArr[i] = (int)(Math.random() * 100);
            doubleArr[i] = Math.random() * 10;
        }

        System.out.println("Before sorting:");
        printArrays(intArr, doubleArr);

        // Sort based on sum using bubble sort (simple demonstration)
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                double sum1 = intArr[j] + doubleArr[j];
                double sum2 = intArr[j + 1] + doubleArr[j + 1];

                if (sum1 > sum2) {
                    // Swap both arrays in sync
                    int tempI = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tempI;

                    double tempD = doubleArr[j];
                    doubleArr[j] = doubleArr[j + 1];
                    doubleArr[j + 1] = tempD;
                }
            }
        }

        System.out.println("\nAfter sorting:");
        printArrays(intArr, doubleArr);
    }

    private static void printArrays(int[] ints, double[] doubles) {
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("[%d , %.2f]%n", ints[i], doubles[i]);
        }
    }
}
