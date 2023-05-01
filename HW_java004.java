
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class HW_java004 {
    public static LinkedList<String> AddElement(int n, int leng) {
        Random rand = new Random();
        LinkedList<String> resultList = new LinkedList<>();
        for (int i = 0; i < leng; i++) {
            resultList.add(Integer.toString(rand.nextInt(n)));
        }
        return resultList;

    }

    public static LinkedList<String> ReversLinkedList(LinkedList<String> l) {
        Iterator<String> reversLinList = l.iterator();
        LinkedList<String> arrayL = new LinkedList<>();
        while (reversLinList.hasNext()) {
            arrayL.add(l.pollLast());
        }
        Iterator<String> back = arrayL.iterator();
        while (back.hasNext()) {
            l.add(back.next());
        }

        return l;

    }

    public static void SummElementLinList(LinkedList<String> l) {

        int result = 0;
        for (String str : l) {

            result += Integer.parseInt(str);

        }
        System.out.printf("Сумма элементов линкид-листа ровна %d", result);
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод, который вернет “перевернутый” список.
        // Постараться не обращаться к листу по индексам.
        LinkedList<String> FyrstLL = AddElement(10, 6);
        System.out.println(FyrstLL);
        System.out.println(ReversLinkedList(FyrstLL));

        // 2. Реализуйте очередь с помощью LinkedList со следующими методами:
        // enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.

        // 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
        // Используйте итератор

        SummElementLinList(FyrstLL);
        qQueue q = new qQueue();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");

        System.out.println(q.first());
        System.out.println(q.dequeue());
        System.out.println(q.first());
        System.out.println(q.dequeue());
        System.out.println(q.first());
        System.out.println(q.dequeue());
        System.out.println(q.first());
        System.out.println(q.dequeue());

    }
}