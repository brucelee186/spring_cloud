package com.framework.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// 添加有参构造函数
@AllArgsConstructor
// 添加无参构造函数
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
