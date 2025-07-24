package services;

import exceptions.invalidAgeExceptions;
import models.User;

public class UserService {
     public void registerUser(User user)throws invalidAgeExceptions{
            if(user.getAge()<18){
                throw new invalidAgeExceptions("Registration Failed, Person is Under aged");
            }
            System.out.println("Successfully Registered");
     }
    
}
