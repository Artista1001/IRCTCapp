package com.tickerbooking.IRCTC.services;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tickerbooking.IRCTC.entities.userEntities.User;

import java.io.File;

public class UserBookingService {
    private User _user;
    private static final String USERS_PATH = "../LocalDb/users.json";
    //private ObjectMapper objectMapper = new ObjectMapper();
    public UserBookingService(User user){
        this._user = user;
        File users = new File(USERS_PATH);

    }


}
