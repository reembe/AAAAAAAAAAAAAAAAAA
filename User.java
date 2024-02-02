import javax.swing.JOptionPane;


/** Precondition: language is not null when user object is initilized 
 * Postcondition: creates user objects
*/

public class User {
    private static final User User = null;
    private String name;
    private int age;
    private String language;
    private static User instance = null;
    private static User[] userList;
    private static int userNum;
    private static int count;

    public User(String n, String l)
    {

        this.name = n;
        this.language = l;
      
    }

    public User getName()
    {
        return this.User.getName(); 
    }
   
    public static User getInstance() {
        return instance;
    }


    public void pickLanguage()
    {
        String option = JOptionPane.showInputDialog("What language Would You like To Pick? ");
        setLanguage(option);
        JOptionPane.showMessageDialog(null, "Congrats your new language is " + option);
    }

    private void setLanguage(String o)
    {
        this.language = o;
    }

    public String getLanguage()
    {
        return this.language;
    }

    public void getUserList()
    {
        for (User u : userList)
        {
            System.out.println(u.getName() +"!");
        }

    }
    public void addtoAge(int i)
    {
        age += i;
    }

    public String toString()
    {
        return name + ", " + language + " learner";

    }

    public User[] formatUserListbackwards()
    {
        int[] reqPrimArray = {1,2,3,4,5,5,6,4,3};
        User[] reqObjectArray = {User.instance};

 // reverses the order of the elements of an array
      for (int k = 0; k < userList.length / 2; k++)
            {
                User j = userList[k];
                userList[k] = userList[userList.length - k - 1];
                userList[userList.length - k - 1] = j;
    
            }
    for (int k = 0; k < reqPrimArray.length / 2; k++)
            {
                int j = reqPrimArray[k];
                reqPrimArray[k] = reqPrimArray[reqPrimArray.length - k - 1];
                reqPrimArray[reqPrimArray.length - k - 1] = j;
    
            }
    for (int k = 0; k < reqObjectArray.length / 2; k++)
            {
                User j = reqObjectArray[k];
                reqObjectArray[k] = reqObjectArray[reqObjectArray.length - k - 1];
                reqObjectArray[reqObjectArray.length - k - 1] = j;
    
            }


        return userList;



    }
// added in for left over requirements
    public int moreLoopsforrequirements()
    {

        int[] inilializerList = new int[2];
        inilializerList[0] = 4;
        inilializerList[1] = 6;

        introductionMenu.reqCount++;
        while (count < 5) // does this count as a count ?????
        {
            for(int i = 0; i < 10; i++)
            {
                count++;
                System.out.println("this was executed" + count + "times");
                if ((count%2) == i)
                {
                    return count;
                }

            }

        }
        return count;

    }


    
}
