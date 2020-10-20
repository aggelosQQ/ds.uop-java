public class Age
{
  public static void main(String args[])
  {
    if (args.length == 1)
    {
      System.out.print("You are ");
      System.out.print(args[0]);
      System.out.println(" years old.");
    }

    int[] argv = {2018013, 2018105};

    try {
      System.out.printf("My AM is %s", argv[1]);
    }
    catch(Exception e) {
      System.out.println("Exception occured: " + e);
    }
  }
}
