interface A
{    
 
}
 
class InterfaceAndObjectClass
{
    @SuppressWarnings("null")
	public static void main(String[] args)
    {
        A a = null;
 
        a.equals(null);
 
        a.hashCode();
 
        a.toString();
    }
}

interface B
{
    @Override
    public boolean equals(Object obj);
 
    @Override
    public int hashCode();
 
    @Override
    public String toString();
}