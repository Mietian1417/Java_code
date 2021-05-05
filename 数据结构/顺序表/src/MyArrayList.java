/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-05
 * Time: 17:14
 */

import java.util.*;

public class MyArrayList {
    public int[] elem;
    public int size;

    public MyArrayList() {
        this.elem = new int[5];
    }

    //判断顺序表是否还有空间
    public boolean isFull() {
        if (this.elem.length == this.size) {
            return true;
        }
        return false;
    }

    //添加元素
    public void add(int pos, int data) {
        //空间不够，就扩大两倍
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem, this.size * 2);
        }
        if (pos < 0 || pos > this.size) {
            System.out.println("位置不合法！");
            return;
        }
        for (int i = this.size; i > pos; i--) {
            this.elem[i] = this.elem[i - 1];
        }
        this.elem[pos] = data;
        this.size++;
    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.elem.length; i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.elem.length; i++) {
            if (toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int setPos(int pos) {
        if (pos < 0 || pos >= this.size) {
            System.out.println("位置不合法！");
            return -1;
        }
        return this.elem[pos];
    }

    //将指定pos位置的元素设置成value
    public void stePos(int pos, int value) {
        if (pos < 0 || pos >= this.size) {
            System.out.println("位置不合法！");
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的key关键字
    public void remove(int key) {
        int pos = -1;
        for (int i = 0; i < this.elem.length; i++) {
            if (key == this.elem[i]) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("没有key这个关键字");
        }
        for (int i = pos; i < this.elem.length - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.size--;
    }

    //获取顺序表长度
    public int size() {
        return this.elem.length;
    }

    //清空顺序表
    public void clear() {
        this.size = 0;
    }
}



