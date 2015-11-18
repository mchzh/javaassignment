package Thread;

import java.util.concurrent.Semaphore;

public class ProducerConsumer {
	public static void main(String[] args) {
	 ProcuctQueue pq = new ProcuctQueue();
     ProducerSem p = new ProducerSem(pq);
     ConsumerSem c= new ConsumerSem(pq);
	}
}

class ProcuctQueue {
    // We must start with Producer semaphore
    static Semaphore semProd = new Semaphore(1);
    // Start with consumer semaphore unavailable.
    static Semaphore semCon = new Semaphore(0);
     
    int productId;
     
    public void putProductIntoQ(int productId){
        try {
            semProd.acquire();
            this.productId=productId;
            System.out.println(Thread.currentThread().getName()+" Putting(In Q) Product ID:"+productId);
            semCon.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
    public void getProductFromQ(){
        try {
            semCon.acquire();
            System.out.println(Thread.currentThread().getName()+" Getting(From Q) Product ID:"+productId);
            semProd.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
    }
 
}

class ProducerSem extends Thread{
     
    ProcuctQueue q;
     
    public ProducerSem(ProcuctQueue q){
        this.q=q;
        this.setName("Producer Thread");
        this.start();
    }
     
    public void run(){
        for(int i=0;i<5;i++){
            q.putProductIntoQ(i);
        }
         
    }
 
}

class ConsumerSem extends Thread{
     
    ProcuctQueue q;
     
    public ConsumerSem(ProcuctQueue q){
        this.q=q;
        this.setName("Consumer Thread");
        this.start();
    }
     
    public void run(){
        for(int i=0;i<5;i++){
            q.getProductFromQ();
        }
         
    }
 
}