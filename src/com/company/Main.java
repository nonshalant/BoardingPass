package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public int age;
    public String date;
    public String Departure;
    public String Email;
    public String Gender;
    public String Name;
    public String Pass;
    public String Number;
    public String Travel;
    public String Trip;
    public String arrival;

    public int getAge() {
        return age;
    }

    public String getArrival() {
        return arrival;
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

    public void setAge(int age) {
        this.age = age;
    }

    //main
    public void main(String[] args) { createAPass(); }


	// write your code here
        public void createAPass() {


        //Retrieving the boarding pass information.
        Scanner scan = new Scanner(System.in);

        String trip = JOptionPane.showInputDialog("Hey, you want to plan your next trip?");
            System.out.println("Trip: " + trip);
        
        String name = JOptionPane.showInputDialog("What's your name?");
            System.out.println("Name: " + name);
        
        String travel = JOptionPane.showInputDialog("Are you traveling solo or with a group?");
            System.out.println("Traveling: " + travel);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Are you 21+? If not, please provide guardian information."));
            System.out.println("Age: " +  age);

        String email = JOptionPane.showInputDialog("What is your email?");
            System.out.println("Email " + email);

        int number = Integer.parseInt(JOptionPane.showInputDialog("What is your phone number?"));
            System.out.println("Number: " + number);

        String gender = JOptionPane.showInputDialog("What is your gender?");
            System.out.println("Gender: " + gender);

        String pass = JOptionPane.showInputDialog("Enter your boarding pass number please?");
            System.out.println("Boarding Pass " + pass);

        String date = JOptionPane.showInputDialog("What is the date of your fancy trip?");
            System.out.println("Date: " + date);

        String departure = JOptionPane.showInputDialog("What airport are you departing from and the time?");
            System.out.println("Departure: " + departure);

            String arrival = JOptionPane.showInputDialog("What is your arrival time?");
            System.out.println("Arrival " + arrival);
        scan.close();

    }
}
