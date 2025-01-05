/**
 * Class which validates the user input.
 * 
 * @author Srihari Vemana
 * @version ver1.0
 */
public class Validator
{
    /**
     * Default constructor which creates the object of Validator class.
     *
     */
    public Validator()
    {
        //Empty constructor because of no field variables.
    }

    /**
    * Checks if given integer is of the specified range.
    *
    * @param    input   Integer which is being evaluated.
    * @param    min     Minimum value for integer.
    * @param    max     Maximum value for integer.
    *
    * @return   true if the integer is within specified range.
    */
    public boolean isIntegerInRange(int input, int min, int max)
    {
        boolean inRange = false;
        if (input >= min && input <= max)
        {
            inRange = true;
        }
        return inRange;
    }

    public boolean isValidMenuOption(char userInput)
    {
        boolean isValidMenuOption = false;
        if (userInput == '1' || userInput == '2' || userInput == '3')
        {
            isValidMenuOption = true;
        }
        return isValidMenuOption;
    }

    /**
    * Checks if a given Player object is a valid player or not. 
    *
    * @param    player  The Player class object whole validity is being checked.
    *
    * @return   validity status as a boolean.
    */
    public boolean isValidObject(Object obj)
    {
        boolean isValidObject = false;
        if (obj != null)
        {
            isValidObject = true;
        }
        return isValidObject;
    }

    /**
    * Checks if given string is of the specified length.
    *
    * @param    input   String which is being evaluated.
    * @param    min     Minimum length for string.
    * @param    max     Maximum length for string.
    *
    * @return   true if the string is within specified length.
    */
    public boolean stringLengthRange(String input, int min, int max)
    {
        boolean inRange = false;
        if (input != null && input.trim().length() >= min  && input.trim().length() <= max)
        {
            inRange = true;
        }
        return inRange;
    }

    /**
    * Returns a string that describes the class.
    *
    * @return   the description of Validator Class.
    */
    public String toString()
    {
        return "This class is used to validate user input";
    }
}
