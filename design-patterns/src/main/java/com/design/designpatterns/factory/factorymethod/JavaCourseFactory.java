package com.design.designpatterns.factory.factorymethod;



/**
 *
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
