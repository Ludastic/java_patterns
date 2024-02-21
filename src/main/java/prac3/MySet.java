package prac3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MySet<E> implements Set<E> {

    private final HashSet<E> set = new HashSet<E>();
    private static final Semaphore sem = new Semaphore(1);

    public void print() {
        try {
            sem.acquire();
            System.out.println(set);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(E o) {
        try {
            sem.acquire();
            set.add(o);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        boolean res = false;
        try {
            sem.acquire();
            res = set.remove(o);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean res = false;
        try {
            sem.acquire();
            res = set.addAll(c);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public void clear() {
        try {
            sem.acquire();
            set.clear();
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean removeAll(Collection c) {
        boolean res = false;
        try {
            sem.acquire();
            res = set.removeAll(c);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public boolean retainAll(Collection c) {
        boolean res = false;
        try {
            sem.acquire();
            res = set.retainAll(c);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean res = false;
        try {
            sem.acquire();
            res = set.containsAll(c);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] arr = {0};
        try {
            sem.acquire();
            arr = set.toArray();
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
