package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> newQueue = new LinkedList<>();
        String[] arrayNombres = {"Smith", "Montessori", "Peralta", "House"};
        for (String s: arrayNombres){
            newQueue.offer(s);
        }
        return newQueue;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        printAndEmptyQueue(createQueue());
    }

}
