package com.ticketbooking.IRCTC.services;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ticketbooking.IRCTC.entities.userEntities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
    private User _user;
    private List<User> userList;
    private static final String USERS_PATH = "app/src/main/java/ticketbooking/IRCTC/LocalDb/users.json";
    private ObjectMapper objectMapper = new ObjectMapper();
    public UserBookingService(User user) throws IOException {
        this._user = user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }

    public boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user ->{
            return user.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user.)
        })
    }
}
