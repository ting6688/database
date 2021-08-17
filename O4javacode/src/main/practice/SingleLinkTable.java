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


    public int getElem(int index){
        SingleLinkTable nodeList = new SingleLinkTable();
        int j = 1;
        Node head = nodeList.getHead();
        if(head!=null && j < index){
            head = head.getNext();
            // x = i ++;    //先让x变成i的值1，再让i加1; x = ++i;    //先让i加1, 再让x变成i的值1
            // 自己写的话 j++,仅从j的结果上看，结果都是一样的j=j+1
            ++j;
        }
        if(head==null || j > index){
            System.out.println("第index个元素不存在");
        }
        // 取第index个元素的值
        return head.getData();

    }


}
