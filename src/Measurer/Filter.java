package Measurer;
/**
   Describes any class whose objects can filter other objects.
*/
public interface Filter
{
	/**
    Filters objects whose data is at least 1000.
    @param Object the object to be filtered.
    @return true if object can be filtered.
	*/
	boolean accept(Object x);
}