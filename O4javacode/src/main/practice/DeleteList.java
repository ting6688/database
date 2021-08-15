package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 删除顺序结构线性表中的元素
 */
public class DeleteList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(16);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println("before delete:" + list);
        delete(list, 3);
        System.out.println("after delete:" + list);


    }


    /**
     * 删除list中在index位置的element元素
     *
     * @param list
     * @param index
     */
    public static void delete(List<String> list, int index) {
        if (list.size() == 0) {
            System.out.println("线性表为空");
            return;
        }
        if (index < 1 || index > list.size()) {
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
        list.remove(index - 1);
        if (!Objects.equals(list.size(), index)) {
            for (int i = index; i < list.size(); i++) {
                list.set(i - 1, list.get(i));
            }
        }
        return;
    }
}
