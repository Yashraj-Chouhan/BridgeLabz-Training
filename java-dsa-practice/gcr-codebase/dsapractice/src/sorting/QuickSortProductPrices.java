package sorting;
public class QuickSortProductPrices {

    // Quick Sort method
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // Sort elements before and after pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method (Last element as pivot)
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] productPrices = {799, 299, 999, 499, 199};

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Product Prices (Ascending Order):");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
