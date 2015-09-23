import java.util.ArrayList;
/**
 * A BetterArrayList.
 */
public class BetterArrayList<E> extends ArrayList<E>
{
    /**
     * Creates a new BetterArrayList object.
     */
    public BetterArrayList()
    {
        super();
    }

    public void printEach()
    {
        System.out.println(this);
        for(int i=0; i<size(); i++)
        {
            System.out.println(get(i));
        }
        
    }
    
    

}
