package sortingmethods;

import models.enums.Size;
import models.random.RandomTShirt;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    public void bucketSort(List<RandomTShirt> arr, boolean isASC, int sortAttribute){
        // Step 1 - Create buckets, Size.length
        int noOfBuckets= Size.values().length;
        List<RandomTShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i=0; i< noOfBuckets; i++) { //noOfBuckets
            buckets[i] = new ArrayList<RandomTShirt>(); //initialize the buckets
        }
        switch (sortAttribute) {
            // case 0 for size
            case 0:
                if (isASC){
                    // Step 2, divide into buckets
                    for (RandomTShirt tShirt : arr) {
                        buckets[tShirt.getSize().ordinal()].add(tShirt);
                    }
                    //step 3,print
                    printBucket();
                    for (int i = 0; i < noOfBuckets; i++) {
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
//                          swap?
                        }
                    }
                } else {
                    for (RandomTShirt tShirt : arr) {
                        buckets[tShirt.getSize().ordinal()].add(tShirt);
                    }
                    printBucket();
                    for (int i = noOfBuckets - 1; i >= 0; i--) {
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
                        }
                    }
                }
                break;
            // case 1 for color
            case 1:
                if (isASC){
                    for (RandomTShirt tShirt : arr) {
                        buckets[tShirt.getColor().ordinal()].add(tShirt);
                    }
                    printBucket();
                    for (int i = 0; i < noOfBuckets; i++) {
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
                        }
                    }
                } else {
                    for (RandomTShirt tShirt : arr) {
                        buckets[tShirt.getColor().ordinal()].add(tShirt);
                    }
                    printBucket();
                    for (int i = noOfBuckets - 1; i >= 0; i--) {
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
                        }
                    }
                }
                break;
            // case 2 for fabric
            case 2:
                if (isASC){
                    for (RandomTShirt tShirt : arr) {
                        buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    }
                    printBucket();
                    for (int i = 0; i < noOfBuckets; i++) {
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
                        }
                    }
                } else {
                    for (RandomTShirt tShirt : arr) {
                        buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    }
                    printBucket();
                    for (int i = noOfBuckets - 1; i >= 0; i--) {
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
                        }
                    }
                }
                break;
        }
    }
    public void printBucket(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("List sorted with Bucket sort");
        System.out.println("---------------------------------------------------------------------------------");
    }
}
