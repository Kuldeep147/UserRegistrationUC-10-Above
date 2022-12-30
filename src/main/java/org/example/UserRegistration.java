package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String firstName;
    String lastName;
    String eMail;
    String phoneNumber;
    String password;
    public static void main(String[] args) {
        UserRegistration users = new UserRegistration();

    }
    public String addUser(String[] arr){
        String fName = arr[0];
        Pattern p1 = Pattern.compile("^[A-Z]+[a-z]{2,}");
        Matcher mat = p1.matcher(fName);
        boolean b = mat.matches();
        if(b){
            firstName = fName;
        }else{
            return "Sad";
        }
        String lName = arr[1];
        Pattern p2 = Pattern.compile("^[A-Z]+[a-z]{2,}");
        Matcher l = p2.matcher(lName);
        boolean b1 = l.matches();
        if(b1){
            lastName = lName;
        }else{
            return "Sad";
        }
        String email = arr[2];
        Pattern p3 = Pattern.compile("[a-zA-Z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-za-z]{2,})$");
        Matcher ema = p3.matcher(email);
        boolean b2 = ema.matches();
        if(b2){
            eMail = email;
        }else{
            return "Sad";
        }
        String pNum = arr[3];
        Pattern p4 = Pattern.compile("^(\\d{2}[- .]?){1}\\d{10}$");
        Matcher ph = p4.matcher(pNum);
        boolean b3 = ph.matches();
        if(b3){
            phoneNumber = pNum;
        }else{
            return "Sad";
        }
        String pass = arr[4];
        Pattern p5 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()+-=]).{8,}$");
        Matcher pas = p5.matcher(pass);
        boolean b4 = pas.matches();
        if(b4){
            password = pass;
        }else{
            return "Sad";
        }
        return "Happy";

    }
    public boolean checkEmail(String str){
        String email = str;
        Pattern p3 = Pattern.compile("[a-zA-Z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-za-z]{2,})$");
        Matcher ema = p3.matcher(email);
        boolean b2 = ema.matches();
        if(b2){
            return  true;
        }else{
            return false;
        }
    }
}