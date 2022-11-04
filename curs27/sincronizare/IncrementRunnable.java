package curs27.sincronizare;

public class IncrementRunnable implements Runnable{

//    private volatile Integer index = 0;
    private   Integer index = 0;

    @Override
    public void run() {
      /*  try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(Thread.currentThread().getName() +  ": Alte instructiuni care pot fi executate de mai multe threaduri in acelasi timp ");
        synchronized (this) {
            index++;
            System.out.println(index + " : " + Thread.currentThread().getName());
        }
    }

    //varianta cu sincronizare pentru toata metoda
  /*  @Override
    public synchronized void run() {
            index++;
            System.out.println(index + " : " + Thread.currentThread().getName());
    }*/

    public  Integer getIndex() {
        return index;
    }
}
