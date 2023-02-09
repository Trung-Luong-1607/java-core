package fa.training.algorithms.sorting;

public class ShellSort {
    // ham sap xep
    public void shellSort(int arr[]) {
        int inner, outer;
        int valueToInsert;
        int interval = 1;
        int elements = arr.length;
        int i = 0;
 
        while (interval <= elements / 3) {
            interval = interval * 3 + 1;
        }
 
        while (interval > 0) {
            for (outer = interval; outer < elements; outer++) {
                valueToInsert = arr[outer];
                inner = outer;
 
                while (inner > interval - 1 && arr[inner - interval] >= valueToInsert) {
                    arr[inner] = arr[inner - interval];
                    inner -= interval;
                }
 
                arr[inner] = valueToInsert;
            }
 
            interval = (interval - 1) / 3;
            i++;
 
            display(arr);
        }
    }
 
    public void display(int arr[]) {
        int i;
        System.out.print("[");
 
        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
 
        System.out.print("]\n");
    }
 
    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = { 6, 5, 0, 2, 5, 1, 3, 7, 4, 5 };
 
        ShellSort shellSort = new ShellSort();
        System.out.println("Mang du lieu dau vao: ");
        shellSort.display(arr);
        System.out.println("-----------------------------");
        shellSort.shellSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        shellSort.display(arr);
    }
}
