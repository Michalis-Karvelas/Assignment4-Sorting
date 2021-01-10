package sortingmethods;

import models.random.RandomTShirt;

import java.util.List;

public class QuickSort {

    int partition(List<RandomTShirt> arr, int low, int high, boolean isASC, int sortAttribute) {
        RandomTShirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            switch (sortAttribute) {
                // SIZE
                case 0:
                    if (isASC) {
                        // If current element is smaller than the pivot
                        if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                            i++;
                            // swap arr[i] and arr[j]
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j)); // arr[i] = arr[j];
                            arr.set(j, temp);   //arr[j] = temp;
                        }
                    } else {
                        // If current element is higher than the pivot
                        if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                            i++;
                            // swap arr[i] and arr[j]
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j)); // arr[i] = arr[j];
                            arr.set(j, temp);   //arr[j] = temp;
                        }
                    }
                    break;
                // COLOR
                case 1:
                    if (isASC) {
                        if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                            i++;
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    } else {
                        if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                            i++;
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    }
                    break;
                // FABRIC
                case 2:
                    if (isASC) {
                        if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    } else {
                        if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                            i++;
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    }
                    break;
            }
        }
        RandomTShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high)); // arr[i+1] = arr[high];
        arr.set(high, temp);// arr[high] = temp;
        return i + 1;
    }
    public void sort(List<RandomTShirt> arr, int low, int high, boolean isASC, int sortAttribute) {
        if (low < high) {
            int pi = partition(arr, low, high, isASC, sortAttribute);
            sort(arr, low, pi - 1, isASC, sortAttribute);
            sort(arr, pi + 1, high, isASC, sortAttribute);
        }
    }
}
