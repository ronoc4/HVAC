/**
 * Created by conor on 3/17/16.
 */

import java.util.Date;
public class WaterHeater extends ServiceCall {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    //Constructor of superclass
    public WaterHeater(String serviceAddress, String problemDescription, Date date, int age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;
    }

    //Static final variable for constant mandatory charge
    public static final int MANDATORY_CHARGE = 20;


    //Public override for toString method
    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);


        return "Central AC Unit Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString + "\n" +
                "Fee plus $20 mandatory fee = " + feeString + MANDATORY_CHARGE;

    }


}
