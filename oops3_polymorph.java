////////////// POLYMORPHISM    Example for function overloading same name different function
class student
{
  int roll;
  String name;

  public void printinfo (String name)
  {
	System.out.println (name);
  }
  public void printinfo (int roll)
  {
	System.out.println (roll);
  }
  public void printinfo (String name, int roll)
  {
	System.out.println (name + " " + roll);
  }
}

public class Main
{
  public static void main (String[]args)
  {
	student s1 = new student ();
	  s1.roll = 53;
	  s1.name = "shwetabh";
	  s1.printinfo (s1.name);
	  s1.printinfo (s1.name, s1.roll);
  }
}
