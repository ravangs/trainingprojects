import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeSearchApp {

    public static void main(String[] args) throws Exception {
        RunnablePrimerSearch w1 = new RunnablePrimerSearch(1, 100000);
        RunnablePrimerSearch w2 = new RunnablePrimerSearch(100000, 250000);
        //Old style
        /*Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("Primes b/w 1 and 10000 "+w1.count);
        System.out.println("Primes bw 10000 and 25k "+w2.count);
*/
        ExecutorService pool = Executors.newFixedThreadPool(4);
        
        /*pool.execute(w1);
        pool.execute(w2);
        
        while(!(w1.resultReady && w2.resultReady)) {
            Thread.sleep(200);
        }
        System.out.println("Primes b/w 1 and 10000 "+w1.count);
        System.out.println("Primes bw 10000 and 25k "+w2.count);*/
        
        CallablePrimerSearch c1 = new CallablePrimerSearch(1, 100000);
        CallablePrimerSearch c2 = new CallablePrimerSearch(100000, 250000);
        
        Future<Integer> r1 = pool.submit(c1);
        Future<Integer> r2 = pool.submit(c2);
        
        System.out.println("Primes b/w 1 and 10000 "+r1.get());
        System.out.println("Primes bw 10000 and 25k "+r2.get());
        
        pool.shutdown();
        
        
    }

}

