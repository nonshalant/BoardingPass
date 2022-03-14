import com.company.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files extends Main {

    public void CreateToFile() {
        try {
            File ticket = new File("");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void WriteToFile(){
            try {
                FileWriter myWriter = new FileWriter("/Users/Dhruvil/Desktop/Java_Assignments/Boarding-pass-plane-ticket/src/Ticket.txt");
                myWriter.write("(\"Boarding Pass #: \" + passPass + \"\\nDate: \" + datePass +\n" +
                        "                 \"\\nDestination: \" + tripPass + \"\\nDeparture Time: \" + departurePass + \"\\nArrival: \" + arrivalPass +\n" +
                        "                 \"\\nName: \" + namePass + \"\\nGender: \" + genderPass + \"\\nAge: \" + agePass +\n" +
                        "                \"\\nTravel: \" + travelPass + \"\\nEmail: \" + emailPass + \"\\nPhone Number: \"\n" +
                        "                + numberPass);\n" +
                        "    }");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();

        }
}
}
