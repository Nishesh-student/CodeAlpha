package CodeAlpha;

import java.util.Scanner;

public class Task3_HotelReservationSystem {
    private int acRoom = 25;
    private int nonacRoom = 20;
    Scanner sc = new Scanner(System.in);
    public void enquiry(){
        int option;
        do {
            System.out.println("Welcome to Hotel Sir");
            System.out.println("Press 1 - To check room availability");
            System.out.println("Press 2 - To book room");
            System.out.println("Press 3 - For Reservation");
            System.out.println("Press 4 - To View Booking Details");
            System.out.println("Press 5 - For checking out");
            System.out.println("Press 6 - Exit");

            System.out.println("Enter your option : ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    roomAvailability();
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    reservation();
                    break;
                case 4:
                    bookingDetails();
                    break;
                case 5:
                    checkOut();
                    break;

            }
        }while(option!=6);
        System.out.println("Thanks Visit Again!!!");

    }

    private void roomAvailability(){
        System.out.println("Total rooms Available are      : "+(acRoom+nonacRoom));
        System.out.println("Total Ac room Available are    : "+acRoom);
        System.out.println("Total NonAc room Available are : "+nonacRoom);
    }

    private void bookRoom(){
        roomAvailability();
        int roomType ,rooms;
        System.out.println("Which room you want to book : ");
        System.out.println("1 - Ac Room ");
        System.out.println("2 - Non Ac Room");
        roomType = sc.nextInt();
        System.out.println("How many rooms you want to book : ");
        rooms = sc.nextInt();
        if (roomType == 1)
        {
            if(rooms>acRoom)
            {
                System.out.println("Sorry sir rooms are not available !!!");
            }
            else{
                acRoom-=rooms;
            }
        }
        else if (roomType == 2)
        {
            if(rooms>nonacRoom)
            {
                System.out.println("Sorry sir rooms are not available !!!");
            }
            else{
                nonacRoom-=rooms;
            }
        }
        else{
            System.out.println("Invalid Entry");
        }
    }

    private void reservation(){
        String arrivalDate,departureDate;
        System.out.println("Enter your arrival date : ");
        arrivalDate = sc.next();
        System.out.println("Enter your departure date : ");
        departureDate = sc.next();
        bookRoom();
    }

    private void bookingDetails(){
        roomAvailability();
        System.out.println("Payment can be done in both online as well as cash method.In Advanced");
    }

    private void checkOut(){
        int rooms;
        int roomType;
        System.out.println("Which room you had to booked : ");
        System.out.println("1 - Ac Room ");
        System.out.println("2 - Non Ac Room");
        roomType = sc.nextInt();
        System.out.println("How many rooms you want to book : ");
        rooms = sc.nextInt();

        if (roomType == 1)
        {
            acRoom+=rooms;
        }
        else if (roomType == 2)
        {
            nonacRoom+=rooms;
        }
        else{
            System.out.println("Invalid Entry");
        }

        System.out.println("Thankyou Sir. Visit Again !!!");
    }

    public static void main(String[] args) {
        Task3_HotelReservationSystem obj1 = new Task3_HotelReservationSystem();
        obj1.enquiry();
    }
}
