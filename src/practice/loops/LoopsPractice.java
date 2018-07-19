package practice.loops;

public class LoopsPractice
{
    public static void main (String[]args)
    {
        int count = 0;
        while (count<=100)
        {
            System.out.println("Roy - "+count);
            count =count+1;

            if(count==30)
            {
                break;
            }

        }
    }




    // Extract all categories from string argument
    public static void printCategories (String str)
    {



    }

    String mainStr ="WE have a large invetory of things in our warwehouse falling in "
            +" the category :appearl and the slighty "
            + "more in demond category:maekup along with the category :furniture and ...";

     printCategories(mainStr);


}
