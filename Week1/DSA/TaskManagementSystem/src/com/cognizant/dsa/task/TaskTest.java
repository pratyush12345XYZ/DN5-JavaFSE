package com.cognizant.dsa.task;

public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(
                new Task(101, "Complete DSA Exercise", "Pending"));

        taskList.addTask(
                new Task(102, "Submit Assignment", "Completed"));

        taskList.addTask(
                new Task(103, "Prepare for Interview", "Pending"));

        System.out.println("All Tasks:");

        taskList.traverseTasks();

        System.out.println("\nSearching Task 102:");

        Task foundTask = taskList.searchTask(102);

        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("Task Not Found");
        }

        System.out.println("\nDeleting Task 102:");

        taskList.deleteTask(102);

        System.out.println("\nTasks After Deletion:");

        taskList.traverseTasks();
    }
}