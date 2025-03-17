package com.tickerbooking.IRCTC.entities.userEntities;

import java.util.List;
import com.tickerbooking.IRCTC.entities.ticketEntities.Ticket;

public class User {
    private String name;
    private String password;
    private String HashPassword;
    private List<Ticket> ticketbooked;
    private String userId;
}
