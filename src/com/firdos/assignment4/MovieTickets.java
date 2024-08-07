package com.firdos.assignment4;

import java.util.Scanner;

public class MovieTickets {
    static int totalTickets = 100;
    static int bookedTickets = 0;
    static double ticketPrice = 10.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Movie Ticket Booking System");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Available Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    viewAvailableTickets();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }

    public static void bookTicket() {
        if (totalTickets - bookedTickets > 0) {
            bookedTickets++;
            double totalPrice = bookedTickets * ticketPrice;
            System.out.println("Ticket booked successfully!");
            System.out.println("Total tickets booked: " + bookedTickets);
            System.out.println("Total price: $" + totalPrice);
        } else {
            System.out.println("Sorry, no tickets available!");
        }
    }

    public static void viewAvailableTickets() {
        int availableTickets = totalTickets - bookedTickets;
        System.out.println("Available tickets: " + availableTickets);
    }
}

