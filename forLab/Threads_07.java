class SyncedKeyword1{
    void odd(){
        try{
            for(int i=0;i<=5;i+=2){
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

class SyncedKeyword2{
    void even(){
        try{
            for(int i=1;i<=5;i+=2){
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class MainOne extends Thread{
    SyncedKeyword1 k1;
    SyncedKeyword2 k2;
    MainOne(){
        k1 = new SyncedKeyword1();
        k2 = new SyncedKeyword2();
    }

    public void run(){
        synchronized(k1){
            k1.odd();
        }
        synchronized(k2){
            k2.even();
        }
        
        //k2.even();
    }
}


class Threads_07{
    public static void main(String[] args) {
        MainOne m = new MainOne();
        m.start();
    }
}