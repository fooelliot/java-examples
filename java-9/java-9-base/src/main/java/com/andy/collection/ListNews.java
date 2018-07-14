package com.andy.collection;

import java.util.List;

/**
 * java9新特性集合工厂方法
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-14 09:36
 **/
public class ListNews {


    /**
     * 除了更短和更好阅读之外，这些方法也可以避免您选择特定的集合实现。 事实上，从工厂方法返回已放入数个元素的集合实现是高度优化的。这是可能的，因为它们是不可变的：在创建后，继续添加元素到这些集合会导致 “UnsupportedOperationException”
     * @param args
     */

    public static void main(String[] args) {
        List<String> list = List.of("aa", "bb", "cc");

        List<Integer> entityList = List.of();

        System.out.println(list);
        System.out.println(entityList);

    }

}
