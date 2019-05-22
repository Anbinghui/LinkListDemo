package com.satdp.linklistdemo.link;

/**
 * Created by An on 2019/5/22 0022.
 * 实现MyList.java,对接口部分实现
 */
public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size=0;
    protected MyAbstractList(){}

    protected MyAbstractList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @Override
    public void add(E e) {
        add(size,e);
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e)>=0) {
            remove(indexOf(e));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public E remove(int index) {
        return null;
    }


    @Override
    public void clear() {

    }

    @Override
    public Object set(int index, E e) {
        return null;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public int lastIndeOf(E e) {
        return 0;
    }
}
