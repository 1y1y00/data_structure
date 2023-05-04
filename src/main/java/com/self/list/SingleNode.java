package com.self.list;

/**
 * 单向链表节点实体
 *
 * @author yy
 */
public class SingleNode {

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
    SingleNode next;

    public SingleNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}
