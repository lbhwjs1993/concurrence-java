package com.sankuai.guava;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

public class TestMaps {
    public static void main(String[] args) {
        Map<String, Integer> salary = ImmutableMap.<String, Integer> builder()
                .put("John", 1000)
                .put("Jane", 1500)
                .put("Adam", 2000)
                .put("Tom", 2000)
                .build();
        salary.put("lbh", 2);
        //Maps.asMap();

    }
}
