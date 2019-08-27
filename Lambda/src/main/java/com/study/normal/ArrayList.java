package com.study.normal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @description:列表
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/23 11:52
 */
public class ArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integerList = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
        integerList.forEach(System.out::println);
    }

}
