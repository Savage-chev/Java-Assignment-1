
/**
 * Class Mobile models a mobile phone with default values of type,
 * screensize, memorysize, cameraresolution, battery, GPS & given
 * service provider & contract type.
 * 
 * Through a mutator method the service provider and the contract type 
 * can be amended.
 * Furthermore, using the same type of method, "if" statement allow us to turn On/Off the GPS.
 * 
 * Accessor methods returns the type of the mobile, current service provider & battery life.
 * Furthermore, usi g the same methods we can print a full report in the terminal window.
 * 
 * Last but not least, we've got 2 mutator method that simulates charging the phone, using
 * the phone and accessor method to return you certain message depending on the battery left.
 * 
 * @author (Plamen Savchev - Computer Science Year 1 Group 1) 
 * @version (0.1 - 15/10/19)
 */
public class Mobile
{
    //Type of Mobile
    private String type;
    //Screen size
    private int screensize;
    //Memory size
    private int memorysize;
    //Service provider
    private String serviceprovider;
    //Camera Resolution in MegaPixels
    private double cameraresolution;
    //Battery life %
    private int battery;
    //GPS status (On/Off)
    private boolean GPS;
    //Contract Type
    private String contracttype;

    /**
     * Constructor that creates Mobile with default values of type,
     * screensize, memorysize, cameraresolution, battery, GPS & given
     * service provider & contract type.
     */
    public Mobile(String setProvider, String setContractType)
    {
        // initialise instance variables
        type = "Seny Xperia XZ";
        screensize = 5;
        memorysize = 64;
        serviceprovider = setProvider;
        contracttype = setContractType;
        cameraresolution = 13;
        battery = 100;
        GPS = true;
    }

    /**
     * Accessor method which returns the type of the mobile
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * Accessor method which returns the present service provider
     */
    public String getProvider()
    {
        return serviceprovider;
    }
    
    /**
     * Accessor method which returns the remaining charge
     */
    public int getCharge()
    {
        return battery;
    }
    
    /**
     * Mutator method allowing you to turn on/off the GPS 
     */
    public void makeGPS()
    {
        if (GPS == false)
        {
            GPS = true;
        }
        else 
        {
            GPS = false;
        }
    }
    
    /**
     * Mutator method allowing you to amend the service provider
     */
    public void changeProvider(String sprovider)
    {
        serviceprovider = sprovider;
    }
    
    /**
     * Mutator method allowing you to amend the contract type
     */
    public void changeContractType(String ctype)
    {
        contracttype = ctype;
    }
    
    /**
     * Accessor method to print a report about the phone in the terminal window
     */
    public void printDetails()
    {
        //Field that clear the terminal window
        System.out.print('\u000C');
        //Fields that printing full phone report in the perminal window
        System.out.println("This mobile is a "+type+" with service provider "+serviceprovider+" and type ");
        System.out.println("of contract "+contracttype+".It has screen size of "+screensize+" inches, GPS, resolution of "+cameraresolution);
        System.out.println("MegaPixels and "+memorysize+" Gig of memory. At present, it has "+battery+"% of its");
        System.out.println("battery charge remaining.");
    }
    
    /**
     * Mutator method that simulates using the phone for a specified period assuming
     *that the phone loses 1% of its charge for each hour that it is switched on. 
     */
    public void switchedOnFor(int periodoftime)
    {
        battery = battery - periodoftime;
    }
    
     /**
     * Accessor method which checks the phone's remaining charge. Depends on the
     * % of the battery will return one of the following string messages from the if
     * statement bellow.
     */
    public String checkCharge()
    {
        if (battery < 25)
        {
            return "Be aware that you will soon need to re-charge your phone";
        }
        else
        {
            return "Your phone charge is sufficient";
        }
    }
    
    /**
     * Mutator method which simulate fully charging the phone
     */
    public void chargeUp()
    {
        battery = 100;
    }
}
