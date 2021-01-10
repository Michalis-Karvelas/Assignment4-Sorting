package com.company;

import models.Timer;
import models.random.RandomTShirt;
import sortingmethods.BubbleSort;
import sortingmethods.BucketByColorSizeFabric;
import sortingmethods.BucketSort;
import sortingmethods.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        BucketSort bucketSort = new BucketSort();
//        BucketByColorSizeFabric bucketByColorSizeFabric = new BucketByColorSizeFabric(); //not actually needed

        System.out.println("-------------------Welcome to the sorting T-shirts Program-----------------------");
        System.out.println("The program sorts a list of T-shirts and outputs the following:");
        System.out.println("original list, the sorted lists by each method and the time \n" +
                "the program needed to sort the array with each method");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("To sort the T-shirts by size Ascending press 0, by size Descending press 1");
        System.out.println("To sort the T-shirts by color Ascending press 2, by color Descending press 3");
        System.out.println("To sort the T-shirts by fabric Ascending press 4, by fabric Descending press 5");
        String choice = sc.nextLine();
        double quickSortTimer=0;
        double bubbleSortTimer=0;
        int numberOfRandomTShirts = 40;
        while (!choice.equals("0")&&!choice.equals("1")&&!choice.equals("2")&&!choice.equals("3")
                &&!choice.equals("4")&&!choice.equals("5")) {
            System.out.println("You didn't insert a valid number");
            choice=sc.nextLine();
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Original Array");
        System.out.println("---------------------------------------------------------------------------------");
        List<RandomTShirt> randomTShirts = new ArrayList<>(numberOfRandomTShirts);
        List<RandomTShirt> randomTShirtsCopy1 = new ArrayList<>(numberOfRandomTShirts);
        List<RandomTShirt> randomTShirtsCopy2 = new ArrayList<>(numberOfRandomTShirts);
        List<RandomTShirt> randomTShirtsCopy3 = new ArrayList<>(numberOfRandomTShirts);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            RandomTShirt r= new RandomTShirt();
            randomTShirts.add(r);
            randomTShirtsCopy1.add(r);
            randomTShirtsCopy2.add(r);
            randomTShirtsCopy3.add(r);
            System.out.println(randomTShirts.get(i));
        }
                if(choice.equals("0")){
                    Timer quickTimer=new Timer();
                    quickSort.sort(randomTShirts, 0, randomTShirts.size() - 1, true, 0);
                    quickTimer.stop();
                    quickSortTimer=quickTimer.elapsedTime();
                    Timer bubleTimer=new Timer();
                    bubbleSort.bubbleSort(randomTShirtsCopy1, true, 0);
                    bubleTimer.stop();
                    bubbleSortTimer=bubleTimer.elapsedTime();
                    Timer bucketTimer = new Timer();
                    bucketSort.bucketSort(randomTShirtsCopy2, true, 0);
                    bucketTimer.stop();
                    System.out.println("Bucket Sort Time: " + bucketTimer.elapsedTime());
                }
                else if(choice.equals("1")){
                    Timer quickTimer=new Timer();
                    quickSort.sort(randomTShirts, 0, randomTShirts.size() - 1, false, 0);
                    quickTimer.stop();
                    quickSortTimer=quickTimer.elapsedTime();
                    Timer bubleTimer=new Timer();
                    bubbleSort.bubbleSort(randomTShirtsCopy1, false, 0);
                    bubleTimer.stop();
                    bubbleSortTimer=bubleTimer.elapsedTime();
                    Timer bucketTimer = new Timer();
                    bucketSort.bucketSort(randomTShirtsCopy2, false, 0);
                    bucketTimer.stop();
                    System.out.println("Bucket Sort Time: " + bucketTimer.elapsedTime());
                }
                else if(choice.equals("2")){
                    Timer quickTimer=new Timer();
                    quickSort.sort(randomTShirts, 0, randomTShirts.size() - 1, true, 1);
                    quickTimer.stop();
                    quickSortTimer=quickTimer.elapsedTime();
                    Timer bubleTimer=new Timer();
                    bubbleSort.bubbleSort(randomTShirtsCopy1, true, 1);
                    bubleTimer.stop();
                    bubbleSortTimer=bubleTimer.elapsedTime();
                    Timer bucketTimer = new Timer();
                    bucketSort.bucketSort(randomTShirtsCopy2, true, 1);
                    bucketTimer.stop();
                    System.out.println("Bucket Sort Time: " + bucketTimer.elapsedTime());
                }
                else if(choice.equals("3")){
                    Timer quickTimer=new Timer();
                    quickSort.sort(randomTShirts, 0, randomTShirts.size() - 1, false, 1);
                    quickTimer.stop();
                    quickSortTimer=quickTimer.elapsedTime();
                    Timer bubleTimer=new Timer();
                    bubbleSort.bubbleSort(randomTShirtsCopy1, false, 1);
                    bubleTimer.stop();
                    bubbleSortTimer=bubleTimer.elapsedTime();
                    Timer bucketTimer = new Timer();
                    bucketSort.bucketSort(randomTShirtsCopy2, false, 1);
                    bucketTimer.stop();
                    System.out.println("Bucket Sort Time: " + bucketTimer.elapsedTime());
                }
                else if(choice.equals("4")){
                    Timer quickTimer=new Timer();
                    quickSort.sort(randomTShirts, 0, randomTShirts.size() - 1, true, 2);
                    quickTimer.stop();
                    quickSortTimer=quickTimer.elapsedTime();
                    Timer bubleTimer=new Timer();
                    bubbleSort.bubbleSort(randomTShirtsCopy1, true, 2);
                    bubleTimer.stop();
                    bubbleSortTimer=bubleTimer.elapsedTime();
                    Timer bucketTimer = new Timer();
                    bucketSort.bucketSort(randomTShirtsCopy2, true, 2);
                    bucketTimer.stop();
                    System.out.println("Bucket Sort Time: " + bucketTimer.elapsedTime());
                }
                else if(choice.equals("5")){
                    Timer quickTimer=new Timer();
                    quickSort.sort(randomTShirts, 0, randomTShirts.size() - 1, false, 2);
                    quickTimer.stop();
                    quickSortTimer=quickTimer.elapsedTime();
                    Timer bubleTimer=new Timer();
                    bubbleSort.bubbleSort(randomTShirtsCopy1, false, 2);
                    bubleTimer.stop();
                    bubbleSortTimer=bubleTimer.elapsedTime();
                    Timer bucketTimer = new Timer();
                    bucketSort.bucketSort(randomTShirtsCopy2, false, 2);
                    bucketTimer.stop();
                    System.out.println("Bucket Sort Time: " + bucketTimer.elapsedTime());
                }
//        System.out.println("Sorted arrays");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("List sorted with Quick sort");
        System.out.println("---------------------------------------------------------------------------------");
        for (RandomTShirt randomTShirt : randomTShirts) {
            System.out.println(randomTShirt);
        }
        System.out.println("Quick Sort Time: " + quickSortTimer);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("List sorted with Bubble sort");
        System.out.println("---------------------------------------------------------------------------------");
        for (RandomTShirt randomTShirtCopy1 : randomTShirtsCopy1) {
            System.out.println(randomTShirtCopy1);
        }
        System.out.println("Bubble Sort Time: " + bubbleSortTimer);
//        System.out.println("---------------------------------------------------------------------------------");
//        for (RandomTShirt randomTShirtCopy2 : randomTShirtsCopy2) {
//            System.out.println(randomTShirtCopy2);
//        }

        //the following doesn't work correctly,didn't have time to troubleshoot
//        System.out.println("---------------------------------------------------------------------------------");
//        bucketByColorSizeFabric.bucketSortTShirtsBySizeThenColorThenFabric(randomTShirtsCopy3, 0);

    }
}
