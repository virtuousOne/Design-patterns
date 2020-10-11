package com.design.designpatterns.template.course;

/**
 * @Author: 吴宸煊
 * Date: 2020/10/11 12:41
 * Description:
 */
public class JavaCourse extends NetworkCourse {
    @Override
    void checkHomework() {
        System.out.println("检查Java的架构课件");
    }
}
