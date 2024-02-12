package Q3.prog408a;

public class SortingAlgs {

    public static int[] bubbleSort(int [] array) {
        for (int lcv = 0; lcv < array.length; lcv++) {
            for (int lcv2 = 0; lcv2 < array.length-lcv; lcv2++) {
                if (array[lcv2] > array[lcv2 +1]) {
                    int temp = array[lcv2+1];
                    array[lcv2+1] = array[lcv2];
                    array[lcv2] = temp;
                }
            }
        }
        return array;
    }

    public static int[] selecSort(int[] array) {

        for (int lcv = 0; lcv < array.length; lcv++) {
            int min_index = lcv;
            for (int lcv2 = lcv+1; lcv2 < array.length; lcv2++) {
                if (array[lcv2] < array[min_index]) {
                    min_index = lcv2;
                }
            }
            int temp = array[lcv];
            array[lcv] = array[min_index];
            array[min_index] = temp;
        }
        return array;
    }

    public static int[] inserSort(int[] array) {
        for (int lcv = 1; lcv < array.length; lcv++) {
            int key = array[lcv];
            int j = lcv-1;
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }

    public static Cl408a[] backinserSort(Cl408a[] array) {
        for (int lcv = 1; lcv < array.length; lcv++) {
            Cl408a key = array[lcv];
            int j = lcv-1;
            while (j >= 0 && array[j].getScore() < key.getScore()) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }
}
