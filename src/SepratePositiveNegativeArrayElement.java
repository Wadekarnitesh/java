public class SepratePositiveNegativeArrayElement {
    public static void main(String[] args) {
        int a[] = {-3, 7, 89, 5, 9, -4, -8, 0, 7};
        // sepratePositiveNegativeArrayElement(a);
        sepratePositiveNegativeArrayElement(a);
    }

    public static void sepratePositiveNegativeArrayElement(int[] a) {
        /** here it print negative on left positive right
         * 
         */
        int i = 0, j = a.length - 1;

        while (i < j) {
            while (i < j && a[i] < 0) {
                i++;
            }
            while (i < j && a[j] >= 0) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
