public class MinMax{
    public static void main(String[] args) {
        int[] arr = {45, 2, 89, 32, 10, 99};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
