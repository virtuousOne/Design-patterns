package com.design.designpatterns.factory.factorymethod;



/**
 *
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
