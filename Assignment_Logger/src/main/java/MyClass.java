import java.lang.*;
import org.apache.logging.log4j.LogManager;
public class MyClass {

	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(MyClass.class);

public static double simpleIntrest(double principal_amt,double rate,double time_period)
 {
     double si=principal_amt*time_period*rate/100;
     LOGGER.info(si);
     LOGGER.error("There will be corrrection");
     LOGGER.warn("there is something wrong in code");
     LOGGER.fatal("there is any case of abort");
     return si;
 }
 public static double compoundInterest(double principal_amt,double rate,double time_period,double times_intrest_applied)
 {  double ci=principal_amt*(Math.pow((1+(rate)/times_intrest_applied), time_period*times_intrest_applied))-principal_amt;
     LOGGER.info(ci);
     LOGGER.error("There will be corrrection");
     LOGGER.warn("there is something wrong in code");
     LOGGER.fatal("there is any case of abort");
  return ci;
 }
 public static double estimator(String material_standard,double area_of_house,Boolean automated_type)
    {  
        double price_estimate=0;
            material_standard=material_standard.toLowerCase();
            if(material_standard.compareTo("standard")==0)
            {
               price_estimate= area_of_house*1200;
               LOGGER.info(price_estimate);
               if(automated_type==true) {
            	   LOGGER.error("There will be corrrection");
            	   LOGGER.warn("there is something wrong in code");
            	   LOGGER.fatal("there is any case of abort");
            	             }
            }else if(material_standard.compareTo("above standard")==0)
            {
                price_estimate=area_of_house*1500;
              LOGGER.info(price_estimate);
              if(automated_type==true) {
            	  LOGGER.error("There will be corrrection");
            	  LOGGER.warn("there is something wrong in code");
            	  LOGGER.fatal("there is any case of abort");
            	            }
            }else if(material_standard.compareTo("high standard")==0  )
            {    if(automated_type)
                price_estimate=area_of_house*2500;
                else
                price_estimate=area_of_house*1800;
            LOGGER.info(price_estimate);
     LOGGER.error("There will be corrrection");
     LOGGER.warn("there is something wrong in code");
     LOGGER.fatal("there is any case of abort");
}
            return price_estimate;
    }
   
}