public class GarbageCollection {
    protected void finalize(){
            System.out.print("Garbage Collected");
    }
    // TODO: Override the finalize() method
    // protected void finalize()
    // Inside it, print "Garbage Collected"

    public static void main(String[] args) {
        GarbageCollection a = new GarbageCollection();
        a= null;
        System.gc();
        // TODO: Create an object of GarbageCollection class
        
        // TODO: Make the object eligible for garbage collection (e.g., assign null)
        
        // TODO: Request Garbage Collection using System.gc()
        
        // Tip: You might need a small delay or simply exiting might trigger it in some JVMs, 
        // but System.gc() is the standard call.
        try{Thread.sleep(1000);}
        catch(InterruptedException e){}
    }
}
