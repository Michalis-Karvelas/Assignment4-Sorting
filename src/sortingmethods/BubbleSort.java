package sortingmethods;

import models.random.RandomTShirt;

import java.util.List;

public class BubbleSort {
    public void bubbleSort(List<RandomTShirt> arr, boolean isASC, int sortAttribute) {
        int n = arr.size();
        // sorting with size ASC
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                switch (sortAttribute) {
                    //size
                    case 0:
                        if (isASC){
                            if (arr.get(j).getSize().compareTo(arr.get(j + 1).getSize()) > 0) // ASC order
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        else {
                            if (arr.get(j).getSize().compareTo(arr.get(j + 1).getSize()) < 0) // DESC order
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        break;
                    // color
                    case 1:
                        if (isASC){
                            if (arr.get(j).getColor().compareTo(arr.get(j + 1).getColor()) > 0)
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        else {
                            if (arr.get(j).getColor().compareTo(arr.get(j + 1).getColor()) < 0)
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        break;
                    // fabric
                    case 2:
                        if (isASC){
                            if (arr.get(j).getFabric().compareTo(arr.get(j + 1).getFabric()) > 0)
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        else {
                            if (arr.get(j).getFabric().compareTo(arr.get(j + 1).getFabric()) < 0)
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        break;
                }
            }
        }
    }
}
