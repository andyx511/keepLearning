package 堆;

import AOP.jdk动态代理.Apple;

import java.util.Arrays;

/**
 * projectName：keepLearning
 * name：heap
 * description：todo
 * 父节点 parentIndex
 * 左节点 为 2 * parentIndex * 2 + 1
 * 右节点 为 2 * parentIndex * 2 + 2
 * date：2020/8/30 8:30 上午
 * auther：AlexNi
 */
public class heap {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));
        array = new int[]{7, 1, 3, 10, 5, 2, 8, 9, 6};
        buildHeap(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 上浮调整
     *
     * @param array
     */
    public static void upAdjust(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]) {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
            array[childIndex] = temp;
        }
    }

    /**
     * 下沉调整
     *
     * @param array       待调整的堆
     * @param parentIndex 想要下沉的父节点
     * @param length      堆的有效长度
     */
    public static void downAdjust(int[] array, int parentIndex, int length) {
        int temp = array[parentIndex];
        // 左节点
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            // 如果有右孩子，且有有孩子小于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            if (temp <= array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    public static void buildHeap(int[] array) {
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
    }
}
