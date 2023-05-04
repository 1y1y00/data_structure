package com.self.list;

/**
 * 双向链表节点实体
 *
 * @author yy
 */
public class TwoWayNode {

    /**
     * id，下标
     */
    int id;

    /**
     * 名称
     */
    String name;

    /**
     * 指向后一个节点
     */
    TwoWayNode next;

    /**
     * 指向前一个节点
     */
    TwoWayNode prev;

    public TwoWayNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
