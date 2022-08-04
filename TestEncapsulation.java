
class Encapsulate 
{

   

    private String sName;

    private int sRoll;

    private int sAge;
 

   

    public int getAge() { return sAge; }
 

    

    public String getName() { return sName; }
 

   

    public int getRoll() { return sRoll; }
 

   

    public void setAge(int newAge)
	{ 
	sAge = sAge; 
	}
 

    

    public void setName(String newName)

    {

        sName = newName;

    }
 

    

    public void setRoll(int newRoll)
	{ 
	sRoll = newRoll; 
	}
}
 

public class TestEncapsulation {

    public static void main(String[] args)

    {

        Encapsulate obj = new Encapsulate();
 

        

        obj.setName("sweety");

        obj.setAge(20);

        obj.setRoll(2454503);
 

        

        System.out.println("sudiksha name: " + obj.getName());

        System.out.println("sudiksha age: " + obj.getAge());

        System.out.println("sudiksha roll: " + obj.getRoll());
 

       

    }
}