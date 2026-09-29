package com.tableflow;

public class Main {

    public static void main(String[] args) {
        ReservationService service = new ReservationService();
        service.addReservation("Mia Rey", "786-123-4567", 4, "8:30PM");
        service.addReservation("John Doe", "305-456-4334", 2, "5:00PM");
        service.addReservation("Jane Doe", "786-258-7766", 6, "6:30PM");

        service.viewReservations();
    }
}
