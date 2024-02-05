import java.util.Date;

class DateHandler {
    private Date currentDate;

    // Getter method to retrieve the current date
    public Date getCurrentDate() {
        return currentDate;
    }

    // Setter method to set the current date
    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}

public class ExtendedDateHandler extends DateHandler {
    // Additional methods or fields specific to the extended class can be added here

    public static void main(String[] args) {
        // Create an instance of the ExtendedDateHandler class
        ExtendedDateHandler extendedDateHandler = new ExtendedDateHandler();

        // Set the current date using the setter method inherited from DateHandler
        extendedDateHandler.setCurrentDate(new Date());

        // Get and print the current date using the getter method inherited from DateHandler
        Date currentDate = extendedDateHandler.getCurrentDate();
        System.out.println("Current Date: " + currentDate);
    }
}
