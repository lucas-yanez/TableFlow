package com.tableflow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReservationService {

    private ArrayList<Reservation> reservations;
    private Queue<WaitlistEntry> waitlist;

    public ReservationService() {
        reservations = new ArrayList <>();
        waitlist = new LinkedList<>();

    }
    public void addReservation(String guestName,String phoneNumber,int partySize, String reservationTime){
        Reservation reservation = new Reservation(guestName, phoneNumber, partySize, reservationTime);
        reservations.add(reservation);
    }

    public void viewReservations(){
       for (Reservation reservation : reservations) {
           System.out.println(reservation);
       }
    }

}

