/**
 * Class which initiates the manipulator.
 * 
 * @author Srihari Vemana
 * @version ver1.0
 */
public class Manipulator
{
    public static final Input input = new Input();
    public static final Validator validator = new Validator();

    public Manipulator()
    {
        //default constructor;
    }

    public void displayMenu()
    {
        System.out.println("\n****** PDF Manipulator ******\n");
        System.out.println("Select the action you would like to perform.");
        System.out.println("1. Merge PDFs");
        System.out.println("2. Split PDF"); 
        System.out.println("3. Exit");
    }
    public static void main (String args[]) 
    {
        Manipulator manipulator = new Manipulator();
        manipulator.start();
    }

    public void start()
    {
        displayMenu();
        takeMenuInput();
    }

    public void takeMenuInput()
    {
        String prompt = "\nChoose an option: ";
        boolean isValidMenuOption = false;
        char userInput = ' ';
        while (!isValidMenuOption)
        {
            userInput = input.acceptCharInput(prompt);
            isValidMenuOption = validator.isValidMenuOption(userInput);
            if (!isValidMenuOption)
            {
                System.out.println("Invalid input. Try again!");
            }
        }
        
        if (userInput == '1')
        {
            System.out.println("Merging.");
        }
        else if (userInput == '2')
        {
            System.out.println("Spliting.");
        }
        else
        {
            System.out.println("Exiting...\n");
        }
    }
}