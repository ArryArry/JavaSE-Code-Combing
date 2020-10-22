package LeetCode.Demo01;

import org.junit.Test;

/**
 * 题目：
 * 给定一个数组nums，写一个函数，将数组中所有的0挪到数组的末尾，⽽维持其他所有非0元素的相对位置。
 * 举例: nums = [0, 1, 0, 3, 12]，函数运⾏后结果为[1, 3,12, 0, 0]
 *
 * 思路：
 *   解法一：
 *   创建一个临时数组nonZeroElements，遍历nums，将nums中非0元素赋值到nonZeroElements中，
 *   而后按顺序将nonZeroElements赋值到nums上，未遍历的元素置0；
 *
 *   解法二：
 *
 *   解法三：
 *
 * 参考链接：https://mp.weixin.qq.com/s/ikxTnt9kpCtxHmosCjxcuw leetcode上第283号问题：Move Zeros
 */
public class MoveZeros {

  /**
   *实现步骤：
   *   //1.初始化一个数组int[] nums = {0,1,0,2,0,3}
   *   //2.创建一个临时数组nonZeroElements
   *   //3.遍历数组中nums的值，将nums中非0元素赋值到nonZeroElements中
   *   //4.按顺序将nonZeroElements赋值到nums
   *   //5.遍历的元素置0
   */
  @Test
  public void test01() {
    //1.初始化一个数组int[] nums = {0,1,0,2,0,3}

    //2.创建一个临时数组nonZeroElements
    //3.遍历数组中nums的值，将nums中非0元素赋值到nonZeroElements中
    //4.按顺序将nonZeroElements赋值到nums
    //5.遍历的元素置0
  }
}
