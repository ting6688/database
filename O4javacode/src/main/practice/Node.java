package practice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node {

    /**
     * 数据
     */
    private int data;

    /**
     * 下一结点的引用
     */
    private Node next;


    public Node(int data){
        this.data  = data;
    }
}
