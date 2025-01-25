/**
 * This class is used to perform simple caulculation suing two digits
 * 
 * @author IT
 * @version 25/01/2025
 */

 public class Calculator
 {
    private int firstNumber;
    private int secondNumber;
    private String operator;
    private InputReader reader;

    /**
     * Defining a constructor
     */
    public Calculator()
    {
        firstNumber = 0;
        secondNumber = 0;
        operator = "";
        reader = new InputReader();
    }

    /**
     * This method do thje following:
     * Prompts fro a first number, reads it and converts it to an integer before assigning it to a variable
     * Prompts for operator (+, -, x, /) reads is and assigns it to a variable
     * Prompts for a second number, reads it and converts it to an integer before assigning it to a variable
     */
    private void getInput()
    {
        System.out.println("Enter the first number: ");
        firstNumber = Integer.parseInt(reader.getInput());
        System.out.println("Enter your operator: (+, -, x, /)");
        operator = reader.getInput();
        System.out.println("Enter the second number: ");
        secondNumber = Integer.parseInt(reader.getInput());
    }

    /**
     * This method performs the calculation based on the input entered by the user
     */
    public void doSum()
    {
        getInput();
        operator = operator.toLowerCase(); //to use X as valid multiplication sign
        switch(operator)
        {
            case "+":
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case "x":
                System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber != 0) { //check for division by 0
                    //returns a float number to make division more accurate
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber /(float) secondNumber));
                }
                else {
                    System.out.println("Error: division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
    }

    /**
     * This method does multiple sums
     */
    public void doCalculations(int howMany)
    {
        for (int i=0; i < howMany; i++) {
            doSum();
            System.out.println();
        }
    }

 }
