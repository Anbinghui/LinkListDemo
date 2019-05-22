package com.satdp.linklistdemo.link;

/**
 * Created by An on 2019/5/22 0022.
 * 节点泛型类,每个结点包括两个部分
 * 存储数据元素的data
 * 存储下一个节点地址的指针P
 */
public class Node<E> {
    E element;
    Node<E> next;

    public Node(E e) {
        element = e;
    }

}
