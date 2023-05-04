package com.self.list;

import java.util.Arrays;

/**
 * 链表功能实现
 *
 * @author apple
 */
public class NodeOptLinked {

    /**
     * 初始化单链表头节点
     */
    private SingleNode head = new SingleNode(0, "");

    /**
     * 单链表添加节点从头插入
     *
     * @param singleNode 节点
     */
    public void addNode(SingleNode singleNode) {
        //拿到头节点，从头开始计算
        SingleNode tmp = head;
        while (true) {
            if (tmp.next == null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = singleNode;
    }

    public void addByIdOrder(SingleNode node) {
        //从头插入
        SingleNode tmp = head;
        while (true) {
            // 到尾节点
            if (tmp.next == null) {
                break;
            }
            //节点存在
            if (tmp.next.id == node.id) {
                break;
            }
            if (tmp.next.id > node.id) {
                break;
            }
            tmp = tmp.next;
        }
        // 交换位置
        node.next = tmp.next;
        tmp.next = node;
    }

    //遍历链表
    public void showList() {
        // 空链表
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        SingleNode temp = head.next;
        while (true) {
            if (temp == null) {
                return;
            }
            System.out.println(temp);
            //指针下移
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // SingleNode n1 = new SingleNode(1, "张飞");
        // SingleNode n2 = new SingleNode(2, "关羽");
        // SingleNode n3 = new SingleNode(3, "赵云");
        // SingleNode n4 = new SingleNode(4, "黄忠");
        // SingleNode n5 = new SingleNode(5, "马超");
        // NodeOptLinked sll = new NodeOptLinked();
        // sll.addByIdOrder(n4);
        // sll.addByIdOrder(n5);
        // sll.addByIdOrder(n1);
        // sll.addByIdOrder(n2);
        // sll.addByIdOrder(n3);
        //
        // sll.showList();


        //sll.addNode(n4);
        //sll.addNode(n5);
        //sll.addNode(n1);
        //sll.addNode(n2);
        //sll.addNode(n3);

        int[][]  points = {{8,7},{9,9},{7,4},{9,7}};
        int[][]  points1 = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        int i = maxWidthOfVerticalArea(points1);
        System.out.println(i);

    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int mx = 0;
        for (int i = 1; i < points.length; i++) {
            mx = Math.max(points[i][0] - points[i - 1][0], mx);
        }
        return mx;
    }

}

