/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class Log {

    private int eventId;
    private String event;
    private Date date;
    private Account account;
    private double movement;
    private static int consecutive = 0;

    public Log() {
        this.eventId = ++consecutive;
    }

    public Log(int eventId, String event, Account account, double movement) {
        this();
        this.eventId = eventId;
        this.event = event;
        this.date = new java.util.Date();
        this.account = account;
        this.movement = movement;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        Log.consecutive = consecutive;
    }

    public String toString() {
        String result = "\n Bank Log Information"
                + "\n---------------------------------"
                + "\nEvent ID: " + this.getEventId()
                + "\nEvent Type: " + this.getEvent()
                + "\nTransaction Date: " + this.getDate()
                + "\nMovement Amount: " + this.getMovement()
                + "\n Affected Account " + this.getAccount().toString();

        return result;
    }
    
}
