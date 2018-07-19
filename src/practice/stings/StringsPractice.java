package practice.stings;

public class StringsPractice
{
    public static   void main  (String [] args)
    {
        String a = "Hello";
        String b = "there";
        System.out.println(a.length());

        String str = "ABCDEFG";
        String strExtracted = str.substring(2,5);
        System.out.println(strExtracted);

        if (!a.equals("Hello"))
        {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

        if(b.equalsIgnoreCase("TheRe"))
        {
            System.out.println(b);
        }

        System.out.println(a.charAt(3));

        //look for string from index postion..working from right to left

        String str2 = " Helo there yogi there";
        String str3 = " Helo yogi there  there";
        System.out.println(str2);
        int c= str2.indexOf(b,7);
        System.out.println(c);

        //working the same but from right to left
        int d = str3.lastIndexOf("yogi");
        System.out.println(d);
        int e = str3.indexOf("yogi");
        System.out.println(e);



    }
}
