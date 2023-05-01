import java.util.LinkedList;

public class qQueue {
    LinkedList<String> LinList = new LinkedList<>();

    void enqueue(String item) {
        LinList.addLast(item);
    }

    String dequeue() {
        String item = LinList.pollFirst();
        return item;
    }

    String first() {
        String item = LinList.peekFirst();
        return item;

    }
}
