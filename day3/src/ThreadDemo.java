class  FirstThread implements  Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("First Thread");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SecondThread implements  Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Second Thread");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



public class ThreadDemo {
    public static void main(String[] args) {
        Runnable obj1=new FirstThread();
        Runnable obj2=new SecondThread();

        Thread first=new Thread(obj1);
        Thread second = new Thread(obj2);

        first.start();
        second.start();
    }
}
