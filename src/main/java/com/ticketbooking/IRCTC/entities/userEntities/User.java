package com.ticketbooking.IRCTC.entities.userEntities;

import java.util.List;
import com.ticketbooking.IRCTC.entities.ticketEntities.Ticket;

public class User {
    private String name;
    private String password;
    private String HashPassword;
    private List<Ticket> ticketbooked;
    private String userId;
    public User(String name, String password, String HashPassword, List<Ticket> ticketbooked, String userId){
        this.name = name;
        this.password = password;
        this.HashPassword = HashPassword;
        this.ticketbooked = ticketbooked;
        this.userId = userId;
    }
    public User(){}

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public String getHashPassword(){
        return this.HashPassword;
    }

    public List<Ticket> getTicketbooked(){
        return this.ticketbooked;
    }

    public void printTickets(){
        for(int i = 0; i<ticketbooked.size(); i++){
            System.out.println(ticketbooked.get(i).getTicketInfo());
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHashPassword(String hashedPassoword){
        this.password = hashedPassoword;
    }

    public void setTicketbooked(List<Ticket> ticketsBooked){
        this.ticketbooked = ticketbooked;
    }

    public void setUserId(String UserId){
        this.userId = userId;
    }
}
