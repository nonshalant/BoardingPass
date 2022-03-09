package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String age;
    public String date;
    public String Departure;
    public String Email;
    public String Gender;
    public String Name;
    public String Pass;
    public String Number;
    public String Travel;
    public String Trip;

    public String getAge() {
        return age;
    }

    public String getDate() {
        return date;
    }

    public String getDeparture() {
        return Departure;
    }

    public String getEmail() {
        return Email;
    }

    public String getGender() {
        return Gender;
    }

    public String getName() {
        return Name;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getNumber() {
        return Number;
    }

    public String getTravel() {
        return Travel;
    }

    public String getTrip() {
        return Trip;
    }

    public void setTrip(String trip) {
        Trip = trip;
    }

    public void setTravel(String travel) {
        Travel = travel;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setDeparture(String departure) {
        Departure = departure;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {

        ArrayList<String> boardingArr = createAPass();

        boardingArr.forEach(System.out::println);

    }
	// write your code here
        public static ArrayList<String> createAPass() {

        // Boarding pass array list
        ArrayList<String> boardingInfo = new ArrayList<>();

        //Retrieving the boarding pass information.
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey, you want to plan your next trip?");
        String trip = scan.nextLine();
        boardingInfo.add(trip);
        
        System.out.println("What's your name?");
        String name = scan.nextLine();
        boardingInfo.add(name);
        
        System.out.println("Are you traveling solo or with a group?");
        String travel = scan.nextLine();
        boardingInfo.add(travel);
        
        System.out.println("Are you 21+? If not, please provide guardian information.");
        String age = scan.nextLine();
        boardingInfo.add(age);

        System.out.println("What is your email?");
        String email = scan.nextLine();

        System.out.println("What is your phone number?");
        String number = scan.nextLine();

        System.out.println("What is your gender?");
        String gender = scan.nextLine();

        System.out.println("Enter your boarding pass number please?");
        String pass = scan.nextLine();

        System.out.println("What is the date of your fancy trip?");
        String date = scan.nextLine();

        System.out.println("What airport are you departing from and the time?");
        String departure = scan.nextLine();

        scan.close();

        boardingInfo.add(email);
        boardingInfo.add(number);
        boardingInfo.add(gender);
        boardingInfo.add(pass);
        boardingInfo.add(date);
        boardingInfo.add(departure);

        return boardingInfo;
    }
}
