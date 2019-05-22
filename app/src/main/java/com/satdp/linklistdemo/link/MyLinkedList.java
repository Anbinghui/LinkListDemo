package com.satdp.linklistdemo.link;

/**
 * Created by An on 2019/5/22 0022.
 */
public class MyLinkedList<E> extends MyAbstractList<E> {
    private Node<E> head,tail;

    public MyLinkedList() {

    }

    public MyLinkedList(E[] objects) {
        super(objects);
    }

    public E getFirst() {
        if (size==0) {
            return null;
        }
        return head.element;
    }

    public E getLast() {
        if (size==0) {
            return null;
        }
        return tail.element;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail==null) {
            tail=head;
        }
    }


    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail==null) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }


    @Override
    public void add(int index, E e) {
        if (index==0) {
            addFirst(e);
        }else if (index >= size) {
            addLast(e);
        }else {
            //其实是index吧temp的位置替换了,temp变成了index的next
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }

    }


    public E removeFirst() {
        if (size==0) return null;
        else if (size==1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;

        }else {
            Node<E> temp  = head;
            head = head.next;
            size--;
            return temp.element;
        }

    }


    public E removeLast() {
        if (size==0) {
            return null;
        }else if (size==1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }else {
            Node<E> current = head;
            for (int i = 0; i < size-2; i++) {
                current  = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;

        }
    }


    @Override
    public E remove(int index) {
        if (index<0 || index>=size) {
            return null;
        }
        else if (index==0) {
            return removeFirst();
        }else  if (index == size-1) {
            return removeLast();
        } else {
            //删除了previous.next
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }

    }

    @Override
    public String toString() {
        StringBuilder builder  = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            builder.append(current.element);
            current = current.next;
            if (current!=null ){
                builder.append(",");
            }else {
                builder.append("]");
            }
        }

        return builder.toString();
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }


    @Override
    public boolean contains(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return true;
            }else {
                current = current.next;
            }
        }

        return false;
    }

    @Override
    public E get(int index) {
        if (index<=0 || index>=size) {
            return null;
        }else if (index==0) {
            return head.element;
        }else if (index == size-1) {
            return tail.element;
        }else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            return temp.element;
        }
    }


    @Override
    public int indexOf(E e) {
        if (size==0) {
            return -1;
        }else {
            Node<E> current = head;
            for (int i = 0; i <size ; i++) {
                if (current.element.equals(e)) {
                    return i;
                }else {
                    current = current.next;
                }
            }
        }

        return -1;
    }


    public int lastIndexOf(E e) {
        if (size==0) {
            return -1;
        }else {
            Node<E> current = tail;
            for (int i = size-1; i >0 ; i--) {
                if (current.element.equals(e)) {
                    return i;
                }else {
                    current = current.next;
                }
            }

        }
        return -1;
    }


    public E set (int index,E e) {
        if (index<0  || index >= size) {
            return null;
        }else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }

            Node<E> old = current.next;
            E oldE = old.element;
            old.element = e;
            return oldE;
        }

    }
}
