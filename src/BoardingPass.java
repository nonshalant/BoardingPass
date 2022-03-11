import javax.swing.*;
import java.util.ArrayList;
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
//      String trip = JOptionPane.showInputDialog("Hi welcome to Delta Airlines! Would you like to plan a trip?");
        System.out.println("Hi welcome to Delta Airlines! Would you like to plan a trip?");
        String ticketPass = tripInput.nextLine();

        //NAME
        Scanner nameInput = new Scanner(System.in);
//      String name = JOptionPane.showInputDialog("What's your name?");
        System.out.println("Enter your full name?");
        String namePass = nameInput.nextLine();

        //TRIP
        Scanner dateInput = new Scanner(System.in);
//        String date = JOptionPane.showInputDialog("What is the date of your fancy trip?");
//        System.out.println("Date: " + date);
        System.out.println("What is the date of your trip?");
        String datePass = dateInput.nextLine();

        //SOLO OR GROUP
        Scanner travelInput = new Scanner(System.in);
//        String travel = JOptionPane.showInputDialog("Are you traveling solo or with a group?");
//        System.out.println("Traveling: " + travel);
        System.out.println("Are you traveling solo or with a group?");
        String travelPass = travelInput.nextLine();

        //AGE
        Scanner ageInput = new Scanner(System.in);
//        int agePass = Integer.parseInt(JOptionPane.showInputDialog("Are you 21+? If not, please provide guardian information."));
//      System.out.println("Age: " + age);
        System.out.println("Enter your age");
        int agePass = Integer.parseInt(ageInput.nextLine());

        //GENDER
        Scanner genderInput = new Scanner(System.in);
//        String gender = JOptionPane.showInputDialog("What is your gender?");
//        System.out.println("Gender: " + gender);
        System.out.println("What is your gender?");
        String genderPass = genderInput.nextLine();

        //EMAIL
        Scanner emailInput = new Scanner(System.in);
//        String email = JOptionPane.showInputDialog("What is your email?");
//        System.out.println("Email: " + email);
        System.out.println("What's your email?");
        String emailPass = emailInput.nextLine();

        //PHONE NUMBER
        Scanner numberInput = new Scanner(System.in);
//        String number = JOptionPane.showInputDialog("What is your number?");
//        System.out.println("Number: " + number);
        System.out.println("What's your number?");
        String numberPass = numberInput.nextLine();

        //BAGS
        Scanner bagsInput = new Scanner(System.in);
        System.out.print("How many bags are you flying with?");
        String bagsPass = bagsInput.next();

        //------ FLIGHT INFO ------

        //BOARDING NUMBER
        Scanner passInput = new Scanner(System.in);
//        String pass = JOptionPane.showInputDialog("Enter your boarding pass number please?");
//        System.out.println("Boarding Pass: " + pass);
        System.out.println("Enter your boarding pass number please");
        String passPass = passInput.nextLine();

        //Departure
        Scanner departureInput = new Scanner(System.in);
//        String departure = JOptionPane.showInputDialog("What airport are you departing from and the time?");
//        System.out.println("Departure: " + departure);
        System.out.println("What airport are you departing from and the departing time?");
        String departurePass = departureInput.nextLine();

        //ARRIVAL TIME
        Scanner arrivalInput = new Scanner(System.in);
//        String arrival = JOptionPane.showInputDialog("What is your arrival time?");
//        System.out.println("Arrival: " + arrival);
        System.out.println("What airport are you arrival at and the arrival time?");
        String arrivalPass = arrivalInput.nextLine();

        // Adding elements to the boarding pass
        checkInfo(ticketPass, travelPass, numberPass, namePass, genderPass, emailPass, departurePass, datePass, agePass, passPass, arrivalPass);
    }

    public static void checkInfo (String ticketPass, String travelPass, String numberPass, String namePass, String genderPass,
                                  String emailPass, String departurePass, String datePass, int agePass, String passPass, String arrivalPass) {
        System.out.println("Is this information correct that is listed above?");
        System.out.println("Did you want to take a trip?: " + ticketPass + "\nDid you travel solo?:" + travelPass +
                "\nYour cell phone number: " + numberPass + "\nWhat's your name" + namePass + "\nWhat's your gender " + genderPass +
                "\nWhat's your email?: " + emailPass + "\nWhat airport are you departing from & time? " + departurePass + "\nDate of your flight?: "
                + datePass + " " + agePass + " " + passPass + " " + arrivalPass);

        Scanner infoAnswer = new Scanner(System.in);
        String reply = infoAnswer.nextLine();
        String theReply = "yes";

        if (reply.equals(theReply)) {
            generateRandomTravelerDetails();
            printBoardingPass(ticketPass, travelPass, numberPass, namePass, genderPass, emailPass, departurePass, datePass, agePass, passPass, arrivalPass);
        } else {
            createAPass();
        }
    }

    public static void generateRandomTravelerDetails(){

        String[] flightStatus = { "Delayed", "Cancelled", "On Time" };
        String[] classType = {"First Class", "Business Class", "Economy", "Economy Premium"};
        String[] membershipType = {"Platinum Membership", "General Membership", "Silver Membership" , "Gold Membership"};

        int randomFlightNum = (int) Math.floor(Math.random() * 1000000);
        int randomGateNumber = (int) Math.floor(Math.random() * 4);
        String randomFlightStatus = flightStatus[(int) Math.floor(Math.random() * 3)];
        int randomFlightDuration = (int) Math.floor(Math.random() * 12);
        int randomSeatNumber = (int) Math.floor(Math.random() * 30);
        String randomClassType =  classType[(int) Math.floor(Math.random() * 4)];
        String randomMembership = membershipType[(int) Math.floor(Math.random() * 4)];

//        printBoardingPass(randomFlightNum, randomGateNumber, randomFlightStatus, randomFlightDuration, randomSeatNumber, randomClassType, randomMembership);
    }

    //PRINTING THE BOARDING PASS.
    public static void printBoardingPass(String tripPass, String travelPass, String numberPass, String namePass, String genderPass,
                                         String emailPass, String departurePass, String datePass, int agePass, String passPass, String arrivalPass){
        System.out.println("Boarding Pass #: " + passPass + "\nDate: " + datePass +
                 "\nDestination: " + tripPass + "\nDeparture Time: " + departurePass + "\nArrival " + arrivalPass +
                 "\nName: " + namePass + "\nGender: " + genderPass + "\nAge: " + agePass +
                "\nTravel: " + travelPass + "\nEmail: " + emailPass + "\nPhone Number: "
                + numberPass);
    }

    public void discount(int age, String gender, int price) {
        if (age <= 12) {
            System.out.println("Price: " + price * .5);
        } else if (age >= 60) {
            System.out.println("Price: " + price * .6);
        } else if (gender.equals("female")) {
            System.out.println("Price: " + price * .25);
        }
    }
}

