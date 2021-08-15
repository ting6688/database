package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 删除顺序结构线性表中的元素
 */
public class DeleteList {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[12];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        arr1[5] = 6;
        arr1[6] = 7;
        arr1[7] = 8;

//        System.out.println(arr1.toString());
//        System.out.println("length:"+ arr1.length);
//
//        System.out.println("arrget:"+ arr1[8] +",arr9:"+arr1[9]);
//
//        List<String> list = new ArrayList<>(16);
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        list.add("6");
        // 数组的length为final 不可变，数组没有删除方法
        //before delete:[1, 2, 3, 4, 5, 6, 7, 8, null, null, null, null] length 12
       //  after delete:[1, 2, 4, 5, 6, 7, 8, null, null, null, null, null] length 12
        System.out.println("before delete:" + Arrays.toString(arr1) + ",length:"+arr1.length);
        delete(arr1, 3);
        System.out.println("after delete:" + Arrays.toString(arr1) + ",length:"+arr1.length);


    }


    /**
     * 删除list中在index位置的element元素
     *
     * @param list
     * @param index
     */
    public static void delete(Integer[] list, int index) {
        if (list.length == 0) {
            System.out.println("线性表为空");
            return;
        }
        if (index < 1 || index > list.length) {
            System.out.println("删除位置不正确，超范围");
            return;
        }
        // 如果该元素不是最后一个，则删除元素之后的位置都要往前移一个位置
        // error:before delete:[1, 2, 3, 4, 5, 6];after delete:[1, 2, 4, 5, 6, 6]
//        if (Objects.equals(list.size(), index)) {
//            // 是最后一个直接删除
//            list.remove(index - 1);
//            return;
//        }

        // 删除元素，先删除，再移动位置
        // error: before delete:[1, 2, 3, 4, 5, 6] ,after delete:[1, 2, 5, 6, 6];
        // 因为arrayList数组本身remove造成的这个原因

        if (!Objects.equals(list.length, index)) {
            for (int i = index; i < list.length; i++) {
                list[i-1] = list[i];
            }
        }
        return;
    }
}
