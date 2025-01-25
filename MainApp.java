public class MainApp 
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        InputReader reader = new InputReader();
        int userChoice;

        while (true)
        {
            System.out.println("Choose an option: ");
            System.out.println("1. Perform a single calculation");
            System.out.println("2. Perform a multiple calculations");
            System.out.println("3. Exit the program");
            
            String input = reader.getInput();
            userChoice = Integer.parseInt(input);

            //execute based on the user choice
            switch (userChoice)
            {
                case 1:
                    calculator.doSum();
                    break;
                case 2:
                    System.out.println("How many calculations would you like to perform?");
                    String numInput = reader.getInput();
                    int numOfCalculations = Integer.parseInt(numInput);
                    calculator.doCalculations(numOfCalculations);
                    break;
                case 3:
                    System.out.println("Closing the program....");
                    return; //Exit the program
                default: 
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
