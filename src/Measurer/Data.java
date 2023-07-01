package Measurer;

public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of objects
      @param meas the measurer for the objects
      @return the average of the measures
   */
   public static double average(Object[] objects, Measurer meas)
   {
      double sum = 0;
      for (Object obj : objects)
      {
         sum = sum + meas.measure(obj);
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
   
   /**
   Computes the average bank account balance over $1000 of the given objects.
   @param objects an array of objects
   @param meas the measurer for the objects
   @return the filtered average of the objects
   */
   public static double filterAvg(Object[] objects, Measurer meas, Filter filt)
   {
	   double sum = 0;
	   double len = 0;
	   for (int i=0; i<objects.length; i++)
	   {
		   if(filt.accept(objects[i]))
			   {
			   		sum = sum + meas.measure(objects[i]);
			   		len++;
			   }
	   }
	   if (objects.length > 0 && len > 0) { return sum / len; }
	   else { return 0; }
   }
}