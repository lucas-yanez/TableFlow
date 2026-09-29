package com.tableflow;

public class WaitlistEntry {

    private String guestName;
    private String phoneNumber;
    private int partySize;


 public WaitlistEntry(String guestName, String phoneNumber, int partySize) {
     //below are the assigned values
     this.guestName = guestName;
     this.phoneNumber = phoneNumber;
     this.partySize = partySize;
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




 //will help to debug and view data later
@Override
public String toString() {
    return "WaitlistEntry{" +
            "guestName='" + guestName + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", partySize=" + partySize +
            '}';
    }
}