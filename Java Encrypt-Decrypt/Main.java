import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String END_STRING = "end";

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Encryptor encryptor = new Encryptor();
        Decryptor decryptor = new Decryptor();

        System.out.print("Enter a string to Encrypt/Decrypt: ");
        String input = scanner.nextLine();
        String action = "";

        while (!input.equals(END_STRING)) {
            System.out.println("Encrypt or Decrypt?");
            action = scanner.nextLine();

            if (action.equalsIgnoreCase("Encrypt")) {
                String encrypted = encryptor.encrypt(input);
                System.out.println("Result: " + encrypted);

                System.out.println("Do you wish to save the message into a file? Y/N");
                String answer = scanner.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                    String fileName = "";
                    System.out.print("Please enter a name for your file (ending with .txt): ");
                    fileName = scanner.nextLine();

                    File file = new File(fileName);
                    try {
                        if (file.createNewFile()) {
                            System.out.println("File created: " + file.getName());
                            System.out.println("File path: " + file.getAbsolutePath());

                            FileWriter fileWriter = new FileWriter(fileName);
                            fileWriter.write(encrypted);
                            fileWriter.close();
                        }
                        else {
                            System.out.println("File is already created!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                }
            }
            else if(action.equalsIgnoreCase("Decrypt")) {
                String decrypted = "";
                String[] decryption = input.split("\\s+");

                for (int i = 0; i < decryption.length; i++) {
                    String temp = decryption[i];
                    String temp2 = decryptor.decrypt(temp);
                    decrypted = decrypted.concat(temp2);
                }

                System.out.println("Result: " + decrypted);

            }
            else {
                System.out.println(String.format("Unknown command '%s'", action));
            }

            System.out.print("Enter a new string to Encrypt/Decrypt (or 'end' to end the program): ");
            input = scanner.nextLine();
        }
    }
}   