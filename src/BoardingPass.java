import javax.swing.*;
import java.util.Scanner;

public class BoardingPass {
    public int age;
    public String date;
    public String Departure;
    public String Email;
    public String Gender;
    public String Name;
    public String Pass;
    public String number;
    public String Travel;
    public String Trip;
    public String arrival;

    //-------GETTERS.------

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

    public String getTravel() {return Travel;}

    public String getTrip() {
        return Trip;
    }

    public String getPhoneNumber() {return number; }


// ------- SETTERS -------

    public void setPass(String pass) {
        Pass = pass;
    }

    public void setTrip(String trip) {
        Trip = trip;
    }

    public void setTravel(String travel) {
        Travel = travel;
    }

    public void setPhoneNumber(String phoneNumber) {
        number = phoneNumber;
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


    public static void main(String[] args) {
        createAPass();
    }

    // ------ CONSTRUCTOR -----

    public BoardingPass() {
    }

    // ------ OVERLOADED CONSTRUCTOR -----

    public BoardingPass(String trip, String travel, String phoneNumber, String name, String gender, String email, String departure, String date, int age, String pass, String arrival) {
        this.Trip = trip;
        this.Travel = travel;
        this.number = phoneNumber;
        this.Name = name;
        this.Gender = gender;
        this.Email = email;
        this.Departure = departure;
        this.date = date;
        this.age = age;
        this.Pass = pass;
        this.arrival = arrival;
    }

    // ------- RETRIEVING TRAVELER INFO -------


    public static void createAPass() {

        // WE HAVE TO CREATE A VARIABLE TO STORE THE TRAVELERS INFORMATION IN ORDER TO PRINT THE BOARDING PASS.
        // Retrieving the boarding pass information

        // ----- TRAVELER INFO -----

        //WELCOME IN
        Scanner tripInput = new Scanner(System.in);
        String ticketPass = JOptionPane.showInputDialog("Hi welcome to Delta Airlines! Would you like to plan a trip?");


        //NAME
        Scanner nameInput = new Scanner(System.in);
        String namePass = JOptionPane.showInputDialog("Enter your full name:");


        //TRIP
        Scanner dateInput = new Scanner(System.in);
        String datePass = JOptionPane.showInputDialog("What is the date of your trip?");
        System.out.println("Date: " + datePass);


        //SOLO OR GROUP
        Scanner travelInput = new Scanner(System.in);
        String travelPass = JOptionPane.showInputDialog("Are you traveling solo or with a group?");
        System.out.println("Traveling: " + travelPass);


        //AGE
        Scanner ageInput = new Scanner(System.in);
        int agePass = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        System.out.println("Age: " + agePass);


        //GENDER
        Scanner genderInput = new Scanner(System.in);
        String genderPass = JOptionPane.showInputDialog("What is your gender?");
        System.out.println("Gender: " + genderPass);


        //EMAIL
        Scanner emailInput = new Scanner(System.in);
        String emailPass = JOptionPane.showInputDialog("What is your email?");
        System.out.println("Email: " + emailPass);


        //PHONE NUMBER
        Scanner numberInput = new Scanner(System.in);
        String numberPass = JOptionPane.showInputDialog("What is your phone number?");
        System.out.println("Number: " + numberPass);


        //BAGS
        Scanner bagsInput = new Scanner(System.in);
        int bagsPass = Integer.parseInt(JOptionPane.showInputDialog("How many bags are you flying with?"));
        System.out.print("Bags: " + bagsPass);


        //------ FLIGHT INFO ------

        //Departure
        Scanner departureInput = new Scanner(System.in);
        String departurePass = JOptionPane.showInputDialog("What airport are you departing from and the departing time?");
        System.out.println("Departure: " + departurePass);

        //ARRIVAL TIME
        Scanner arrivalInput = new Scanner(System.in);
        String arrivalPass = JOptionPane.showInputDialog("What airport are you arriving at and the arrival time?");
        System.out.println("Arrival: " + arrivalPass);


        // Adding elements to the boarding pass
        checkInfo(ticketPass, travelPass, numberPass, namePass, genderPass, emailPass, departurePass, datePass, agePass, arrivalPass);
    }

    public static void checkInfo (String ticketPass, String travelPass, String numberPass, String namePass, String genderPass,
                                  String emailPass, String departurePass, String datePass, int agePass, String arrivalPass) {
        System.out.println("Is this information correct that is listed above?");
        System.out.println("Did you want to take a trip?: " + ticketPass + "\nDid you travel solo?: " + travelPass +
                "\nYour cell phone number: " + numberPass + "\nWhat is your name " + namePass + "\nWhat is your gender: " + genderPass +
                "\nWhat is your email?: " + emailPass + "\nWhat airport are you departing from & time?: " + departurePass + "\nDate of your flight?: "
                + datePass + " " + agePass +  " " + arrivalPass);

        Scanner infoAnswer = new Scanner(System.in);
        String reply = JOptionPane.showInputDialog("Is this information correct that is listed above?");
        String theReply = "yes";

        if (reply.equals(theReply)) {
            generateRandomTravelerDetails(ticketPass, travelPass, numberPass, namePass, genderPass, emailPass, departurePass, datePass, agePass, arrivalPass);
        } else {
            createAPass();
        }
    }

    public static void generateRandomTravelerDetails(String tripPass, String travelPass, String numberPass, String namePass, String genderPass,
                                                     String emailPass, String departurePass, String datePass, int agePass, String arrivalPass){

        String[] flightStatus = { "Delayed", "Cancelled", "On Time" };
        String[] classType = {"First Class", "Business Class", "Economy", "Economy Premium"};
        String[] membershipType = {"Platinum Membership", "General Membership", "Silver Membership" , "Gold Membership"};

        int randomFlightNum = (int) Math.floor(Math.random() * 10000);
        int boardingPassNum = (int) Math.floor(Math.random()* 10000);
        int randomGateNumber = (int) Math.floor(Math.random() * 4);
        String randomFlightStatus = flightStatus[(int) Math.floor(Math.random() * 3)];
        int randomFlightDuration = (int) Math.floor(Math.random() * 12);
        int randomSeatNumber = (int) Math.floor(Math.random() * 30);
        String randomClassType =  classType[(int) Math.floor(Math.random() * 4)];
        String randomMembership = membershipType[(int) Math.floor(Math.random() * 4)];

        printBoardingPass(tripPass, travelPass, numberPass, namePass, genderPass, emailPass, departurePass, datePass, agePass, arrivalPass,
                randomFlightNum, boardingPassNum, randomGateNumber, randomFlightStatus, randomFlightDuration, randomSeatNumber, randomClassType, randomMembership);

    }

    //PRINTING THE BOARDING PASS.
    public static void printBoardingPass(String tripPass, String travelPass, String numberPass, String namePass, String genderPass,
                                         String emailPass, String departurePass, String datePass, int agePass, String arrivalPass,
                                         int randomFlightNum, int boardingPassNum, int randomGateNumber, String randomFlightStatus, int randomSeatNumber, int seatNumber, String randomClassType, String randomMembership) {

         JOptionPane.showMessageDialog(null,"Thank you for flying with Delta Airlines! Here is your Boarding Pass: \nBoarding Pass #: " + boardingPassNum + "\nDate: " + datePass + "\nDestination: " + tripPass + "\nDeparture Time: " + departurePass + "\nArrival: " + arrivalPass +
                 "\nName: " + namePass + "\nGender: " + genderPass + "\nAge: " + agePass +
                 "\nTravel: " + travelPass + "\nEmail: " + emailPass + "\nPhone Number: "
                 + numberPass + "\nFlight number: " + randomFlightNum + "\nGate number: " + randomGateNumber + "\nFlight Status: " + randomFlightStatus + "\nSeat number: " + randomSeatNumber
                 + "\nClass :" + randomClassType + "\nMembership: " + randomMembership);
        //System.out.println("Thank you for flying with Delta Airlines! Here is your Boarding Pass. \nBoarding Pass #: " + boardingPassNum + "\nDate: " + datePass +
                // "\nDestination: " + tripPass + "\nDeparture Time: " + departurePass + "\nArrival: " + arrivalPass +
                // "\nName: " + namePass + "\nGender: " + genderPass + "\nAge: " + agePass +
              //  "\nTravel: " + travelPass + "\nEmail: " + emailPass + "\nPhone Number: "
              //  + numberPass + "\nFlight number: " + randomFlightNum + "\nGate number: " + randomGateNumber + "\nFlight Status: " + randomFlightStatus + "\nSeat number: " + randomSeatNumber
      //  + "\nClass :" + randomClassType + "\nMembership: " + randomMembership);
    }


    public void discount(int agePass, String genderPass, int price) {
        if (age <= 12) {
            System.out.println("Price: " + price * .5);
        } else if (agePass >= 60) {
            System.out.println("Price: " + price * .6);
        } else if (genderPass.equals("female")) {
            System.out.println("Price: " + price * .25);
        }
    }
}

