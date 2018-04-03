import java.util.Arrays;

public class Puzir {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 7, 9, 4};
        bubbleSort(arr);
        bubbleSort1 ();
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {//внешний цикл выполниться 5 раз
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;//после первой проходки массив такой 2 3 6 7 9 4
                }                    //  после второй массив не поменяется//после третьей и четвертой не меняется после 5 й --9 и 4 они меняются и поменяются местами
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
    private static void bubbleSort1 (){
        int[] arr = new int[]{6, 5,4,3,2,4,-9};
        for (int i = arr.length - 1; i > 0; i--) {//внешний цикл выполниться 5 раз
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;//после первой проходки массив такой 2 3 6 7 9 4
                }                    //  после второй массив не поменяется//после третьей и четвертой не меняется после 5 й --9 и 4 они меняются и поменяются местами
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
    }

