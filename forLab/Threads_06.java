class SyncedKeyword1{
    synchronized void odd(){
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
    synchronized void even(){
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
        k1.odd();
        k2.even();
    }
}


class Threads_06{
    public static void main(String[] args) {
        MainOne m = new MainOne();
        m.start();
    }
}