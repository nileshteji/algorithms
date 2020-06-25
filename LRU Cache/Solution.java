import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class Cache {
    int cache_size = 3;

    HashSet<Integer> set = new HashSet<>();
    Deque<Integer> deque = new LinkedList<>();

    Cache(int n) {
        cache_size = n;
    }

    public void refer(int x) {

        if (!deque.contains(x)) {
            if (deque.size() == cache_size) {
                int a = deque.removeLast();
                set.remove(a);
            } else {
                deque.add(x);
                set.add(x);

            }
        } else {
            Iterator<Integer> nIterator = deque.iterator();
            while (nIterator.hasNext()) {
                if (nIterator.next() == x) {
                    deque.removeFirstOccurrence(x);
                    deque.push(x);

                }
            }

        }
    }

    public static void main(String[] args) {
        Cache ca = new Cache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }

    private void display() {
        System.out.println(deque);
    }
}