import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
  private static final Map<String, String> userCredentials = new HashMap();

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    userCredentials.put("user1", "password1");
    userCredentials.put("user2", "password2");

    
    System.out.println("Welcome to the Login System!");

            while (true) {
                System.out.println("\nOnline Reservation System");
                System.out.println("1. Login");
                System.out.println("2. Make a Reservation");
                System.out.println("3. Cancel Reservation");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        login();
                        break;
                    case 2:
                        makeReservation();
                        break;
                    case 3:
                        cancelReservation();
                        break;
                    case 4:
                        System.out.println("Thank you for using the system!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        private static void login() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your username: ");
            String username = input.nextLine();
            System.out.print("Enter your password: ");
            String password = input.nextLine();

            if (validateCredentials(username, password)) {
                System.out.println("Login successful! Welcome, " + username + ".");
              
            } else {
                System.out.println("Invalid credentials. Please try again.");
                
            }
        }
  private static boolean validateCredentials(String username, String password) {
          
          return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
      }
  

        private static void makeReservation() {
            Scanner scanner = new Scanner(System.in);

                
                System.out.print("Enter passenger name: ");
                String passengerName = scanner.nextLine();
                System.out.print("Enter train number: ");
                String trainNumber = scanner.nextLine();
                System.out.print("Enter class type (e.g., first class, economy): ");
                String classType = scanner.nextLine();
                System.out.print("Enter date of journey (YYYY-MM-DD): ");
                String dateOfJourney = scanner.nextLine();
                System.out.print("Enter origin (place): ");
                String origin = scanner.nextLine();
                System.out.print("Enter destination: ");
                String destination = scanner.nextLine();

                
                System.out.println("\nReservation Details:");
                System.out.println("Passenger Name: " + passengerName);
                System.out.println("Train Number: " + trainNumber);
                System.out.println("Class Type: " + classType);
                System.out.println("Date of Journey: " + dateOfJourney);
                System.out.println("Origin: " + origin);
                System.out.println("Destination: " + destination);
        }

        private static void cancelReservation() {
            Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter PNR number to cancel reservation: ");
                    String pnrNumber = scanner.nextLine();

                    
                    Main canceledReservation = retrieveReservationByPNR(pnrNumber);

                    if (canceledReservation != null) {
                        System.out.println("\nReservation Details:");
                       

                        System.out.print("Confirm cancellation (OK/Cancel): ");
                        String confirmation = scanner.nextLine();
                        if (confirmation.equalsIgnoreCase("OK")) {
                            
                            System.out.println("Reservation successfully canceled.");
                        } else {
                            System.out.println("Cancellation not confirmed.");
                        }
                    } else {
                        System.out.println("No reservation found with the provided PNR.");
                    }
                }

                   private static Main retrieveReservationByPNR(String pnrNumber){
                    return null;
                }
            }
        

  