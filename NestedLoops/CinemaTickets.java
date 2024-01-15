package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();

        int countTotalTickets = 0;
        int countStandardTickets = 0;
        int countStudentTickets = 0;
        int countKidTickets = 0;



        while (!movieName.equals("Finish")){
            int countFreeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int countMovieTickets = 0;

            while (!ticketType.equals("End")){
                countMovieTickets ++;
                switch (ticketType){

                    case "student":
                        countStudentTickets ++;
                        break;

                    case "standard":
                        countStandardTickets++;
                        break;

                    case "kid":
                        countKidTickets++;

                        break;
                }
                if (countMovieTickets >= countFreeSeats){
                    break;
                }

                ticketType = scanner.nextLine();
            }
            countTotalTickets += countMovieTickets;

            double percentFilled = (1.0 * countMovieTickets / countFreeSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFilled);


            movieName = scanner.nextLine();
        }

        double percentStudentsTickets = (1.0 * countStudentTickets / countTotalTickets) * 100;
        double percentStandardTickets = (1.0 * countStandardTickets / countTotalTickets) * 100;
        double percentKidsTickets = (1.0 * countKidTickets / countTotalTickets) * 100;


        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentsTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.", percentKidsTickets);


    }
}

