package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InsertList {


    // arrayList的疑问：长度和size的值应该是一样的吧，可是初始大小起什么作用呢？
    public static final int MAXSIZE = 16;
    public static void main(String[] args){
//        List<String> numList = new ArrayList<>();
//        numList.add("1");
//        numList.add("2");
//        numList.add("3");
//        numList.add("4");
//        numList.add("5");
//        numList.add("6");
//        numList.add("7");
//        numList.add("8");

        // 先预留出一个空位来
//        numList.add(null);
//        System.out.println("插入之前list:"+numList.toString());
//        insertElement(numList,3,"9");
//        System.out.println("插入之后list:"+numList.toString());


        Integer[] arr1 = new Integer[12];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        arr1[5] = 6;
        arr1[6] = 7;
        arr1[7] = 8;
        System.out.println("插入之前list:"+ Arrays.toString(arr1));
        insertElement(arr1,3,9);
        System.out.println("插入之后list:"+ Arrays.toString(arr1));
    }


    /**
     * 将元素element 插入到list L 的index（数组的索引下标+1）位置处
     * @param L
     * @param index
     * @param element
     */
    public  static void insertElement(Integer[] L,int index ,Integer element){
        if(L.length == MAXSIZE){
            System.out.println("线性表已满");
            return;
        }
        if( index <1 || index > L.length + 1  ){
            System.out.println("index不在范围内");
            return;
        }
        if( index <= L.length){
            // 如果插入的位置不在表尾，就需要将插入位置后数据元素向后移动一位
            // m1: [1, 2, 9, 3, 3, 3, 3, 3, 3] 原因：先往后放一位，下一次拿到的还是刚放过去的原来的
//            for (int i = index -1 ; i < L.size() -1 ; i++) {
//                L.set(i+1,L.get(i));
//            }
            // 插入之前list:[1, 2, 3, 4, 5, 6, 7, 8, null, null, null, null]
            //插入成功
            //插入之后list:[1, 2, 9, 3, 4, 5, 6, 7, 8, null, null, null]
            // i = length -2 预留出最后一个位置
            for (int i = L.length -2 ; i >= index -1 ; i--) {
//                L.set(i+1,L.get(i));
                L[i+1] = L[i];
            }
        }
        // 将新元素插入
        L[index -1] = element;
        System.out.println("插入成功");
    }
}

