/**
 *
 * @author Sandeep
 */
public class ThreadDemo {

    public static void main(String[] args) {
                    
            myThread t = new myThread();
            t.start();
            for(int i =0 ; i<10 ; i++ )
            {
                System.out.println("Main Thread");
            }
        
    }
    
}

