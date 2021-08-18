package practice;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * 单链表
 */
@Data
public class SingleLinkTable {

    /**
     * 头结点
     */
    private Node head;

    /**
     * 增加结点
     *
     * @param next
     */
    public void addNode(Node next) {
        // 如何增加结点呢？
    }

    /**
     * 删除结点
     *
     * @param node
     */
    public void delNode(Node node) {

    }

    /**
     * 查找第i个位置的结点
     *
     * @param index
     * @return
     */
    public Node getNode(int index) {
        // 先找到第一个结点，根据第一个找到下一个，直到找到第index个；

        return null;
    }

    // 单链表事先未定义表长，不能通过for循环来事先

    /**
     * 自己实现的，问题： 为什么会把单链表定义为list呢，也不一定合适，不知道单链表该用什么样的结构去表示，以及单链表提供的基本方法该如何表示
     *
     * @param list
     * @param index
     * @return
     */
    public int getNodeByIndex(List<Node> list, int index) {
        if (index < 0 || index > list.size()) {
            System.out.println("当前位置未找到元素");
            return -1;
        }
        return list.get(index).getData();
    }

    /**
     * 思路：从头开始找，直到找到第index元素为止
     * 核心思想：工作指针后移
     *
     * @param index
     * @return
     */
    public int getElem(int index) {
        SingleLinkTable nodeList = new SingleLinkTable();
        int j = 1;
        Node head = nodeList.getHead();
        if (head != null && j < index) {
            head = head.getNext();
            // x = i ++;    //先让x变成i的值1，再让i加1; x = ++i;    //先让i加1, 再让x变成i的值1
            // 自己写的话 j++,仅从j的结果上看，结果都是一样的j=j+1
            ++j;
        }
        if (head == null || j > index) {
            System.out.println("第index个元素不存在");
        }
        // 取第index个元素的值
        return head.getData();

    }


    /**
     * 在index位置处插入element
     * 思路： 找到index-1位置的元素，待插入元素放入index
     *
     * @param index
     * @param element
     */
    public void insertNode(int index, int element) {
        SingleLinkTable nodeList = new SingleLinkTable();
        Node head = new Node(0);
        nodeList.setHead(head);
        int j = 1;
        Node headNode = nodeList.getHead();
        // 从第一个结点开始，不断向后寻找第index个结点的data
        if (headNode != null && j < index) {
            headNode = headNode.getNext();
            j++;
        }
        if (headNode == null || j > index) {
            System.out.println("第index个元素不存在");
            return;
        }
        // headNode的index为index-1 ,headNode的next为index
        // 获取第index-1个元素，作为待插入结点的前一个元素，新建一个结点，将element 赋值给第index个元素
        Node indexNode = new Node(element);
        // 第index个元素指向原来headNode的下一个元素，原来headNode的下一个元素指向第index个元素
        indexNode.setNext(headNode.getNext());
        headNode.setNext(indexNode);
        return;
    }


    /**
     * 删除第index个元素，返回第index各元素的值
     *
     * @param index
     * @return
     */
    public int delNode(int index) {
        int element = -1;
        SingleLinkTable nodeList = new SingleLinkTable();
        Node head = new Node(0);
        nodeList.setHead(head);
        int j = 1;
        Node headNode = nodeList.getHead();
        // 从第一个结点开始，不断向后寻找第index个结点的data
        if (headNode != null && j < index) {
            headNode = headNode.getNext();
            j++;
        }
        // 第index个元素不存在
        if (headNode.getNext() == null || j > index) {
            System.out.println("第index个元素不存在");
            return -1;
        }
        Node q = headNode.getNext();
        // 将q的后继结点赋值给headNode的后继结点
        headNode.setNext(q.getNext());
        // 返回待删除元素的值
        element = q.getData();
        // 删除此结点，让系统回收结点，释放内存
//        free(q);
        return element;
    }


}
