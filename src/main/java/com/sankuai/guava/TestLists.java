package com.sankuai.guava;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();
        StringUtils.isEmpty("11");
        ImmutableSet a = ImmutableSet.of(1,3,2);
        //System.out.println(a);
        List<Integer> integerList = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);
        try {
            //校验元素索引是否有效 ，使用checkPositionIndex校验
            Preconditions.checkElementIndex(10, integerList.size());
            //在临界值size处产生异常
        } catch (IndexOutOfBoundsException e) {
            //System.out.println((e.getMessage())); //
        }

        List<UserA> userA = Lists.newArrayList(new UserA(1, "chengyang"),
                new UserA(2, "lily"), new UserA(3, "wangxiaoming"));
        List<UserB> userB = testTransfrom(userA);
        System.out.println(userA.toString());

        List<UserA> userAS = Lists.reverse(userA);
        //System.out.println(userAS.toString());
        System.out.println(userB.toString());

        userA.add(new UserA(4, "1111"));

        System.out.println(userB.toString());
    }
    public static List<UserB> testTransfrom(List<UserA> list) {
        List<UserB> userB = Lists.transform(list, new Function<UserA, UserB>() {
            @Override
            public UserB apply(UserA input) {
                Preconditions.checkNotNull(input, "input为null");
                UserB userB = new UserB();
                userB.setId(input.getId());
                userB.setName(input.getName());
                return userB;
            }
        });
        return userB;
    }
}
