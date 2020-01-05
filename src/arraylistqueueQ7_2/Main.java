package arraylistqueueQ7_2;

public class Main {
   public static void main(String[] args){
       CircularQueue circularQueue = new CircularQueue(5);
       for(int i=1; i<6; i++){
           circularQueue.enQueue(i*10);
       }

      circularQueue.printArray();
      circularQueue.enQueue(60);
       circularQueue.printArray();

       circularQueue.deQueue();
       circularQueue.printArray();
       circularQueue.deQueue();
       circularQueue.printArray();


   }

}
