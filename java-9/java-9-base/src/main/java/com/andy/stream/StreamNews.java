package com.andy.stream;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * java9新特性改进的 Stream API
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-14 09:40
 **/
public class StreamNews {

    /**
     * 长期以来，Stream API 都是 Java 标准库最好的改进之一。通过这套 API 可以在集合上建立用于转换的申明管道。
     * 在 Java 9 中它会变得更好。Stream 接口中添加了 4 个新的方法：dropWhile, takeWhile, ofNullable。
     * 还有个 iterate 方法的新重载方法，可以让你提供一个 Predicate (判断条件)来指定什么时候结束迭代：
     * @param args
     */

    public static void main(String[] args) {
        //第二个参数是一个 Lambda，它会在当前 IntStream 中的元素到达 100 的时候返回 true。因此这个简单的示例是向控制台打印 1 到 99。
        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);

        //除了对 Stream 本身的扩展，Optional 和 Stream 之间的结合也得到了改进。现在可以通过 Optional 的新方法 `stram` 将一个 Optional 对象转换为一个(可能是空的) Stream 对象：
        //在组合复杂的 Stream 管道时，将 Optional 转换为 Stream 非常有用
        Stream<Integer> s = Optional.of(1).stream();

    }

}
