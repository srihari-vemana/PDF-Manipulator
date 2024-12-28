/**
 * Class which initiates the manipulator.
 * 
 * @author Srihari Vemana
 * @version ver1.0
 */
public class Manipulator
{
    public void displayMenu()
    {
        System.out.println("\n****** PDF Manipulator ******");
        System.out.println("Select the file you want to manipulate.");
        System.out.println("Exiting...\n");
    }
    public static void main (String args[]) 
    {
        Manipulator manipulator = new Manipulator();
        manipulator.start();
        System.out.println("This is the wild west or something.");
    }

    public void start()
    {
        displayMenu();
    }
}