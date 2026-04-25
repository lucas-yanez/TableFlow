package com.tableflow;

public class Reservation {
    private String guestName;
    private String phoneNumber;
    private int partySize;
    private String reservationTime;

    public Reservation(String guestName, String phoneNumber, int partySize, String reservationTime){
        this.guestName = guestName;
        this.phoneNumber = phoneNumber;
        this.partySize = partySize;
        this.reservationTime = reservationTime;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPartySize() {
        return partySize;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    @Override
public String toString() {
        return "Reservation{" +
                "guestName='" + guestName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", partySize=" + partySize +
                ", reservationTime='" + reservationTime + '\'' +
                '}';

    }
}




