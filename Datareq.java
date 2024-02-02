/**
 * This class with a method that prints
 * preset data 
 * 
 * @author Reem and Fatou
 * @version 1.0
 */


public class Datareq {
    private int questions = 10;
    private String language = "spanish";
    private double boost = 0.5;

/** This method prints out the 
 * questions, language, 
 * and boost in one line 
 * for the user
 **/
    public void reqMeeter()
    {
        System.out.print(questions + language + boost);

    }

    /** This method returns the preset number of questions
    * @return an int representing the number of questions**/
    public int questionGetter()
    {
        return questions;
    }
}
