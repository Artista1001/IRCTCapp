package com.ticketbooking.IRCTC.entities.ticketEntities;

import com.ticketbooking.IRCTC.entities.trainEntities.Train;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String UserId;
    private String source;
    private String destination;
    private Date dateOfTravel;
    private Train train;

}
