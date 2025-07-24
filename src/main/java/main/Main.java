package main;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.invalidAgeExceptions;
import models.User;
import services.UserService;
public class Main {
    public static void main(String[] args)  {
        List <User> l = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        while(true){
            String st=s.nextLine();
            if(st.equals("exit")) {
                break;
            }
            int a=s.nextInt();
            s.nextLine(); 
            l.add(new User(st, a));
        }
        UserService obj=new UserService();
        for(User u : l) {
            try{
            obj.registerUser(u);
            } catch (invalidAgeExceptions e) {
                System.out.println(e.getMessage());
                  try (BufferedWriter bw = new BufferedWriter(new FileWriter("error.log", true))) {
                    bw.write(LocalDateTime.now() + " - " + e.getMessage());
                    bw.newLine();
                } catch (IOException Ex) {
                    System.out.println("Failed to log error: " + Ex.getMessage());
                }
            }
        }
        
    }
}
