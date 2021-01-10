package sortingmethods;

import models.TShirt;
import models.enums.Size;
import models.random.RandomTShirt;

import java.util.ArrayList;
import java.util.List;
//not needed -implemented correctly it ios copied=pasted from the file that was uploaded on git, with some small changes.
public class BucketByColorSizeFabric {

    public List<Integer> bubbleSort(List<Integer> arr) {
        List<Integer> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); // 5
        for (int i = 0; i < n - 1; i++) // i = 0, 1
        {
            for (int j = 0; j < n - i - 1; j++) // j = 5-0-1 = 4, 5-1-1 = 3
            {
                if (arr2.get(j) > arr2.get(j + 1)) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr2.get(j);
                    arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                    arr2.set(j + 1, temp); // arr[j+1] = temp;
                }
            }
        }
        return (arr2);
    }

    private List<RandomTShirt> bubbleSortTShirtsBySize(List<RandomTShirt> arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<RandomTShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() > arr2.get(j + 1).getSize().ordinal()) {
                            // swap arr[j+1] and arr[j]
                            RandomTShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() < arr2.get(j + 1).getSize().ordinal()) {
                            // swap arr[j+1] and arr[j]
                            RandomTShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    private List<RandomTShirt> bubbleSortTShirtsByColor(List<RandomTShirt>  arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<RandomTShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() > arr2.get(j + 1).getColor().ordinal()) {
                            // swap arr[j+1] and arr[j]
                            RandomTShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() < arr2.get(j + 1).getColor().ordinal()) {
                            // swap arr[j+1] and arr[j]
                            RandomTShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    private List<RandomTShirt> bubbleSortTShirtsByFabric(List<RandomTShirt>  arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<RandomTShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() > arr2.get(j + 1).getFabric().ordinal()) {
                            // swap arr[j+1] and arr[j]
                            RandomTShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() < arr2.get(j + 1).getFabric().ordinal()) {
                            // swap arr[j+1] and arr[j]
                            RandomTShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp;
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    public List<RandomTShirt> bubbleSortTShirts(List<RandomTShirt> arr, int sortingType, int sortByAttribute) {
        List<RandomTShirt> arr2 = new ArrayList<>(arr);
        if (sortingType == 0) {
            switch (sortByAttribute) {
                // Size
                case 0:
                    arr2 = bubbleSortTShirtsBySize(arr, 0);
                    break;
                // Color
                case 1:
                    arr2 = bubbleSortTShirtsByColor(arr, 0);
                    break;
                // Fabric
                case 2:
                    arr2 = bubbleSortTShirtsByFabric(arr, 0);
                    break;
            }
        } else {
            switch (sortByAttribute) {
                // Size
                case 0:
                    arr2 = bubbleSortTShirtsBySize(arr, 1);
                    break;
                // Color
                case 1:
                    arr2 = bubbleSortTShirtsByColor(arr, 1);
                    break;
                // Fabric
                case 2:
                    arr2 = bubbleSortTShirtsByFabric(arr, 1);
                    break;
            }
        }
        return (arr2);
    }

    int partition(List<RandomTShirt>  arr, int low, int high, int sortByAttribute, int sortingType) {
        RandomTShirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (sortingType == 0) { // ASC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot
                        if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            } else { // DESC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot
                        if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            RandomTShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            }

        }

        // swap arr[i+1] and arr[high] (or pivot)
        RandomTShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    public void quickSortTShirts(List<RandomTShirt> arr, int low, int high, int sortByAttribute, int sortingType) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = 0;
            switch (sortingType) {
                // ASC
                case 0:
                    pi = partition(arr, low, high, sortByAttribute, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before
                    // partition and after partition
                    quickSortTShirts(arr, low, pi - 1, sortByAttribute, 0);
                    quickSortTShirts(arr, pi + 1, high, sortByAttribute, 0);
                    break;
                // DESC
                case 1:
                    pi = partition(arr, low, high, sortByAttribute, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before
                    // partition and after partition
                    quickSortTShirts(arr, low, pi - 1, sortByAttribute, 1);
                    quickSortTShirts(arr, pi + 1, high, sortByAttribute, 1);
                    break;
            }
        }
    }

    // Step 1: divide to n + 1 buckets as the number of elements,
    // e.g. if we have 10 elements then we create 10 buckets
    // Step 2: place similar data to each bucket,
    // e.g. 1: { 10, 11, 22, 2, 19, 3, 17}
    // n = 7, b[0], b[1], b[2], b[3], b[4], b[5], b[6], b[7]
    // b[1] = { 10, 11, 19, 17}
    // b[2] = { 22, 2 }
    // b[3] = { 3 }
    // e.g. 2: { 0, 0, 1, 3, 0, 4, 2, 3 }
    // int n = randomTShirts.size();
    // List<TShirt>[] buckets = new List<TShirt>[randomTShirts.size()]();
    // b[0] = { 0, 0, 0 }
    // b[1] = { 1, 1, 1, 1, 1 } <----- randomTShirts.get(22).getSize().ordinal() = 1
    // b[2] = { 2 }
    // b[3] = { 3, 3 }
    // b[4] = { 4 }
    // Step 3: sort each bucket ??????????
    public void bucketSortTShirts(List<RandomTShirt> randomTShirts, int sortByAttribute, int sortingType) {
        // Step 1 - Create buckets, Size.length
        int noOfBuckets = Size.values().length;

        // Step 1, create noOfBuckets buckets
        List<RandomTShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<RandomTShirt>(); // initialize the buckets
        }
        // Step 2, divide into buckets
        for (RandomTShirt tShirt : randomTShirts) {
            switch (sortByAttribute) {
                case 0:
                    buckets[tShirt.getSize().ordinal()].add(tShirt);
                    break;
                case 1:
                    buckets[tShirt.getColor().ordinal()].add(tShirt);
                    break;
                case 2:
                    buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    break;
            }
        }
        // Step 3, print
        // just print the contents of each bucket
        if (sortingType == 0) {
            for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                for (int j = 0; j < buckets[i].size(); j++) {
                    System.out.println(buckets[i].get(j));
                }
            }
        } else {
            for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                for (int j = 0; j < buckets[i].size(); j++) {
                    System.out.println(buckets[i].get(j));
                }
            }
        }
    }

    public void bucketSortTShirtsBySizeThenColorThenFabric(List<RandomTShirt> randomTShirts, int sortingType) {
        List<RandomTShirt> ran = new ArrayList<>();

        // Step 1 - Create noOfBuckets buckets, Size.length
        int noOfBuckets = Size.values().length;

        List<RandomTShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<RandomTShirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets, Sort By Size
        for (RandomTShirt tShirt : randomTShirts) {
            buckets[tShirt.getSize().ordinal()].add(tShirt);
        }

        // Step 3, Sort By Color
        for (List<RandomTShirt> bucket : buckets) {
            quickSortTShirts(bucket, 0, bucket.size() - 1, 1, 0);
        }

        // Step 4, Sort By Fabric
        for (List<RandomTShirt> bucket : buckets) {
            List<RandomTShirt> bucketByFabric = new ArrayList<>(bucket);
            bucketSortTShirts(bucketByFabric, 2, 0);
            quickSortTShirts(bucketByFabric, 0, bucketByFabric.size() - 1, 2, 0);
            bucket = bucketByFabric;
        }

        // combine all the buckets to 1 List
        for (List<RandomTShirt> bucket : buckets) {
            for (RandomTShirt tShirt : bucket) {
                randomTShirts.add(tShirt);
            }
        }

        System.out.println("\nBucket Sorted Array By Size Ascending, By Color Ascending And By Fabric Ascending");
        for (TShirt tShirt : randomTShirts) {
            System.out.println(tShirt);
        }
    }
}
