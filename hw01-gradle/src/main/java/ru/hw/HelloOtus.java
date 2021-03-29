package ru.hw;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import java.util.List;


public class HelloOtus {
    public static void main(String[] args) {
        List<String> list = ImmutableList.of("A","C","B");
        Preconditions.checkNotNull(list,"Your list is empty");
        System.out.println("size of list = " + list.size());
    }
}
