import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static List<Client> clients = new ArrayList<>();
    private static List<Pet> pets = new ArrayList<>();
    private static List<EmergencyContact> emergencyContacts = new ArrayList<>();
    private static List<VaccinationRecord> vaccinationRecords = new ArrayList<>();
    private static List<Activity> activities = new ArrayList<>();
    private static List<Feedback> feedbacks = new ArrayList<>();
    private static List<DietaryRestriction> dietaryRestrictions = new ArrayList<>();
    private static List<LoyaltyProgram> loyaltyPrograms = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the YYC Pet Resort Management System");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Manage Clients");
            System.out.println("2. Manage Pets");
            System.out.println("3. Manage Emergency Contacts");
            System.out.println("4. Manage Vaccination Records");
            System.out.println("5. Pet Check-ins and Check-outs");
            System.out.println("6. Pet Grooming Services");
            System.out.println("7. Manage Pet Activities");
            System.out.println("8. Customer Feedback and Reviews");
            System.out.println("9. Manage Dietary Restrictions");
            System.out.println("10. Manage Loyalty Program");
            System.out.println("11. Generate Reports");
            System.out.println("12. Send Notifications");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    manageClients(scanner);
                    break;
                case 2:
                    managePets(scanner);
                    break;
                case 3:
                    manageEmergencyContacts(scanner);
                    break;
                case 4:
                    manageVaccinationRecords(scanner);
                    break;
                case 5:
                    managePetCheckIns(scanner);
                    break;
                case 6:
                    managePetGrooming(scanner);
                    break;
                case 7:
                    managePetActivities(scanner);
                    break;
                case 8:
                    manageFeedback(scanner);
                    break;
                case 9:
                    manageDietaryRestrictions(scanner);
                    break;
                case 10:
                    manageLoyaltyProgram(scanner);
                    break;
                case 11:
                    generateReports(scanner);
                    break;
                case 12:
                    sendNotifications(scanner);
                    break;
                case 13:
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void manageClients(Scanner scanner) {
        System.out.println("\nClient Management:");
        System.out.println("1. Add Client");
        System.out.println("2. View Clients");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                addClient(scanner);
                break;
            case 2:
                viewClients();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addClient(Scanner scanner) {
        Client client = new Client();
        System.out.print("Enter client ID: ");
        client.setClientID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter client name: ");
        client.setName(scanner.nextLine());
        System.out.print("Enter client phone number: ");
        client.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter client address: ");
        client.setAddress(scanner.nextLine());

        clients.add(client);
        System.out.println("Client added successfully.");
    }

    private static void viewClients() {
        System.out.println("\nClient List:");
        for (Client client : clients) {
            System.out.println("ID: " + client.getClientID() + ", Name: " + client.getName() +
                    ", Phone: " + client.getPhoneNumber() + ", Address: " + client.getAddress());
        }
    }

    private static void managePets(Scanner scanner) {
        System.out.println("\nPet Management:");
        System.out.println("1. Add Pet");
        System.out.println("2. View Pets");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                addPet(scanner);
                break;
            case 2:
                viewPets();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addPet(Scanner scanner) {
        Pet pet = new Pet();
        System.out.print("Enter pet ID: ");
        pet.setPetID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter pet name: ");
        pet.setName(scanner.nextLine());
        System.out.print("Enter pet species: ");
        pet.setSpecies(scanner.nextLine());

        pets.add(pet);
        System.out.println("Pet added successfully.");
    }

    private static void viewPets() {
        System.out.println("\nPet List:");
        for (Pet pet : pets) {
            System.out.println("ID: " + pet.getPetID() + ", Name: " + pet.getName() +
                    ", Species: " + pet.getSpecies());
        }
    }

    private static void manageEmergencyContacts(Scanner scanner) {
        System.out.println("\nEmergency Contact Management:");
        System.out.println("1. Add Emergency Contact");
        System.out.println("2. View Emergency Contacts");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                addEmergencyContact(scanner);
                break;
            case 2:
                viewEmergencyContacts();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addEmergencyContact(Scanner scanner) {
        EmergencyContact contact = new EmergencyContact();
        System.out.print("Enter contact ID: ");
        contact.setContactID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter contact name: ");
        contact.setName(scanner.nextLine());
        System.out.print("Enter contact phone number: ");
        contact.setPhoneNumber(scanner.nextLine());

        emergencyContacts.add(contact);
        System.out.println("Emergency contact added successfully.");
    }

    private static void viewEmergencyContacts() {
        System.out.println("\nEmergency Contact List:");
        for (EmergencyContact contact : emergencyContacts) {
            System.out.println("ID: " + contact.getContactID() + ", Name: " + contact.getName() +
                    ", Phone: " + contact.getPhoneNumber());
        }
    }

    private static void manageVaccinationRecords(Scanner scanner) {
        System.out.println("\nVaccination Record Management:");
        System.out.println("1. Add Vaccination Record");
        System.out.println("2. View Vaccination Records");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                addVaccinationRecord(scanner);
                break;
            case 2:
                viewVaccinationRecords();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addVaccinationRecord(Scanner scanner) {
        VaccinationRecord record = new VaccinationRecord();
        System.out.print("Enter record ID: ");
        record.setRecordID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter pet ID: ");
        record.setPetID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter vaccination details: ");
        record.setDetails(scanner.nextLine());

        vaccinationRecords.add(record);
        System.out.println("Vaccination record added successfully.");
    }

    private static void viewVaccinationRecords() {
        System.out.println("\nVaccination Record List:");
        for (VaccinationRecord record : vaccinationRecords) {
            System.out.println("Record ID: " + record.getRecordID() + ", Pet ID: " + record.getPetID() +
                    ", Details: " + record.getDetails());
        }
    }

    private static void managePetCheckIns(Scanner scanner) {
        System.out.println("\nPet Check-ins and Check-outs:");
        System.out.println("1. Check-in Pet");
        System.out.println("2. Check-out Pet");
        System.out.println("3. View Check-ins");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                checkInPet(scanner);
                break;
            case 2:
                checkOutPet(scanner);
                break;
            case 3:
                viewCheckIns();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void checkInPet(Scanner scanner) {
        System.out.print("Enter pet ID: ");
        int petID = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.println("Pet ID " + petID + " checked in.");
    }

    private static void checkOutPet(Scanner scanner) {
        System.out.print("Enter pet ID: ");
        int petID = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.println("Pet ID " + petID + " checked out.");
    }

    private static void viewCheckIns() {
        // Dummy implementation, real implementation would require a list to store check-ins
        System.out.println("\nChecked-in Pets:");
        System.out.println("Pet ID: 1");
        System.out.println("Pet ID: 2");
    }

    private static void managePetGrooming(Scanner scanner) {
        System.out.println("\nPet Grooming Services:");
        System.out.println("1. Schedule Grooming");
        System.out.println("2. View Grooming Schedule");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                scheduleGrooming(scanner);
                break;
            case 2:
                viewGroomingSchedule();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void scheduleGrooming(Scanner scanner) {
        System.out.print("Enter pet ID: ");
        int petID = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.println("Grooming scheduled for pet ID " + petID + ".");
    }

    private static void viewGroomingSchedule() {
        // Dummy implementation, real implementation would require a list to store grooming schedules
        System.out.println("\nGrooming Schedule:");
        System.out.println("Pet ID: 1 - 10:00 AM");
        System.out.println("Pet ID: 2 - 11:00 AM");
    }

    private static void managePetActivities(Scanner scanner) {
        System.out.println("\nPet Activities:");
        System.out.println("1. Add Activity");
        System.out.println("2. View Activities");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                addActivity(scanner);
                break;
            case 2:
                viewActivities();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addActivity(Scanner scanner) {
        Activity activity = new Activity();
        System.out.print("Enter activity ID: ");
        activity.setActivityID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter activity description: ");
        activity.setDescription(scanner.nextLine());

        activities.add(activity);
        System.out.println("Activity added successfully.");
    }

    private static void viewActivities() {
        System.out.println("\nActivity List:");
        for (Activity activity : activities) {
            System.out.println("ID: " + activity.getActivityID() + ", Description: " + activity.getDescription());
        }
    }

    private static void manageFeedback(Scanner scanner) {
        System.out.println("\nCustomer Feedback and Reviews:");
        System.out.println("1. Add Feedback");
        System.out.println("2. View Feedback");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                addFeedback(scanner);
                break;
            case 2:
                viewFeedback();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addFeedback(Scanner scanner) {
        Feedback feedback = new Feedback();
        System.out.print("Enter feedback ID: ");
        feedback.setFeedbackID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter feedback description: ");
        feedback.setDescription(scanner.nextLine());

        feedbacks.add(feedback);
        System.out.println("Feedback added successfully.");
    }

    private static void viewFeedback() {
        System.out.println("\nFeedback List:");
        for (Feedback feedback : feedbacks) {
            System.out.println("ID: " + feedback.getFeedbackID() + ", Description: " + feedback.getDescription());
        }
    }

    private static void manageDietaryRestrictions(Scanner scanner) {
        System.out.println("\nDietary Restrictions:");
        System.out.println("1. Add Dietary Restriction");
        System.out.println("2. View Dietary Restrictions");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                addDietaryRestriction(scanner);
                break;
            case 2:
                viewDietaryRestrictions();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addDietaryRestriction(Scanner scanner) {
        DietaryRestriction restriction = new DietaryRestriction();
        System.out.print("Enter restriction ID: ");
        restriction.setRestrictionID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter restriction details: ");
        restriction.setDetails(scanner.nextLine());

        dietaryRestrictions.add(restriction);
        System.out.println("Dietary restriction added successfully.");
    }

    private static void viewDietaryRestrictions() {
        System.out.println("\nDietary Restriction List:");
        for (DietaryRestriction restriction : dietaryRestrictions) {
            System.out.println("ID: " + restriction.getRestrictionID() + ", Details: " + restriction.getDetails());
        }
    }

    private static void manageLoyaltyProgram(Scanner scanner) {
        System.out.println("\nLoyalty Program:");
        System.out.println("1. Add Loyalty Program");
        System.out.println("2. View Loyalty Programs");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                addLoyaltyProgram(scanner);
                break;
            case 2:
                viewLoyaltyPrograms();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addLoyaltyProgram(Scanner scanner) {
        LoyaltyProgram program = new LoyaltyProgram();
        System.out.print("Enter program ID: ");
        program.setProgramID(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter program details: ");
        program.setDetails(scanner.nextLine());

        loyaltyPrograms.add(program);
        System.out.println("Loyalty program added successfully.");
    }

    private static void viewLoyaltyPrograms() {
        System.out.println("\nLoyalty Program List:");
        for (LoyaltyProgram program : loyaltyPrograms) {
            System.out.println("ID: " + program.getProgramID() + ", Details: " + program.getDetails());
        }
    }

    private static void generateReports(Scanner scanner) {
        System.out.println("\nGenerating Reports...");
        // Dummy implementation, real implementation would generate and display reports
        System.out.println("Reports generated successfully.");
    }

    private static void sendNotifications(Scanner scanner) {
        System.out.println("\nSending Notifications...");
        // Dummy implementation, real implementation would send notifications
        System.out.println("Notifications sent successfully.");
    }

    static class Client {
        private int clientID;
        private String name;
        private String phoneNumber;
        private String address;

        // Getters and setters
        public int getClientID() {
            return clientID;
        }

        public void setClientID(int clientID) {
            this.clientID = clientID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    static class Pet {
        private int petID;
        private String name;
        private String species;

        // Getters and setters
        public int getPetID() {
            return petID;
        }

        public void setPetID(int petID) {
            this.petID = petID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }
    }

    static class EmergencyContact {
        private int contactID;
        private String name;
        private String phoneNumber;

        // Getters and setters
        public int getContactID() {
            return contactID;
        }

        public void setContactID(int contactID) {
            this.contactID = contactID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    static class VaccinationRecord {
        private int recordID;
        private int petID;
        private String details;

        // Getters and setters
        public int getRecordID() {
            return recordID;
        }

        public void setRecordID(int recordID) {
            this.recordID = recordID;
        }

        public int getPetID() {
            return petID;
        }

        public void setPetID(int petID) {
            this.petID = petID;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }
    }

    static class Activity {
        private int activityID;
        private String description;

        // Getters and setters
        public int getActivityID() {
            return activityID;
        }

        public void setActivityID(int activityID) {
            this.activityID = activityID;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    static class Feedback {
        private int feedbackID;
        private String description;

        // Getters and setters
        public int getFeedbackID() {
            return feedbackID;
        }

        public void setFeedbackID(int feedbackID) {
            this.feedbackID = feedbackID;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    static class DietaryRestriction {
        private int restrictionID;
        private String details;

        // Getters and setters
        public int getRestrictionID() {
            return restrictionID;
        }

        public void setRestrictionID(int restrictionID) {
            this.restrictionID = restrictionID;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }
    }

    static class LoyaltyProgram {
        private int programID;
        private String details;

        // Getters and setters
        public int getProgramID() {
            return programID;
        }

        public void setProgramID(int programID) {
            this.programID = programID;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }
    }
}
