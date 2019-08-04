package trash.lec_16;
import java.lang.reflect.Array;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MainQ {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<String>(3);
        queue.add("cat");
        queue.add("dog");
        queue.add("cow");

        System.out.println(queue.size());
        System.out.println(queue);

        System.out.println(queue.poll());
        queue.add("cow");
        System.out.println(queue);

    }

}
