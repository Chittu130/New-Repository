package Singleton_Pro;

class Antivirus
{
	static Antivirus a1=new Antivirus();
	Antivirus()
	{
		System.out.println("Constructor");
	}
    public static Antivirus getInstance()
    {
    	return a1;
    }
}

public class Singleton_1 {

	public static void main(String[] args) 
	{
		System.out.println(Antivirus.getInstance());
		System.out.println(Antivirus.getInstance());
		System.out.println(Antivirus.getInstance());
	}

}
