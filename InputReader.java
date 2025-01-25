import java.util.Scanner;

/**
 * InputReader reads typed input from the user.
 * The text typed by the user is returned as a String.
 * 
 * @author IT
 * @version 24/01/2025
 */

 public class InputReader
 {
    private Scanner reader;

    /**
     * Create a nre InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * read a line of text from the user.
     * @return A string enetered by the user.
     */
    public String getInput()
    {
        System.out.print("> "); // print prompt
        String inputLine = reader.nextLine();
        return inputLine;
    }
 }
