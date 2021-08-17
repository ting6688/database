package practice;

import java.util.HashMap;
import java.util.List;

/**
 * 单链表
 */
public class SingleLinkTable {

    /**
     * 头结点
     */
    private Node head;

    /**
     * 增加结点
     * @param next
     */
    public void addNode(Node next){
        // 如何增加结点呢？
    }

    /**
     * 删除结点
     * @param node
     */
    public void delNode(Node node){

    }

    /**
     * 查找第i个位置的结点
     * @param index
     * @return
     */
    public Node getNode(int index){
        // 先找到第一个结点，根据第一个找到下一个，直到找到第index个；

        return null;
    }


    /**
     * 自己实现的，问题： 为什么会把单链表定义为list呢，也不一定合适，不知道单链表该用什么样的结构去表示，以及单链表提供的基本方法该如何表示
     * @param list
     * @param index
     * @return
     */
    public int getNodeByIndex(List<Node> list, int index){
        if(index < 0 || index > list.size()){
            System.out.println("当前位置未找到元素");
            return -1;
        }
        return list.get(index).getData();
    }


}
