package com.cognizant.dsa.task;

public class TaskLinkedList {

    private Node head;

    private static class Node {

        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public Task searchTask(int taskId) {

        Node current = head;

        while (current != null) {

            if (current.task.getTaskId() == taskId) {
                return current.task;
            }

            current = current.next;
        }

        return null;
    }

    public void traverseTasks() {

        Node current = head;

        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task Deleted Successfully");
            return;
        }

        Node current = head;

        while (current.next != null &&
                current.next.task.getTaskId() != taskId) {

            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task Not Found");
        } else {
            current.next = current.next.next;
            System.out.println("Task Deleted Successfully");
        }
    }
}