public class qQueueTwo {
    String[] newArray = new String[1];
    int size = 0;

    void enqueue(String item) {
        if (size == newArray.length) {
            String[] newArray2 = new String[newArray.length + 10];
            System.arraycopy(newArray, 0, newArray2, 0, newArray.length);
            newArray = newArray2;

        }
        
        for (String i : newArray) {
            if (i == null) {
                newArray[size++] = item;
                break;
            }
        }

    }

    String dequeue() {
        String[] newArray2 = new String[newArray.length - 1];
        String num = newArray[0];
        System.arraycopy(newArray, 1, newArray2, 0, newArray2.length);
        newArray = newArray2;
        return num;

    }

    String first() {
        String num = newArray[0];
        return num;

    }
}
