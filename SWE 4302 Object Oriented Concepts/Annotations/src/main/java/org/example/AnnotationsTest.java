package org.example;

/*import org.junit.Assert;
import org.junit.Test;*/

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationsTest {

    @Test
    public void TypeAnnotationTest() {
        boolean isAnnotationPresent = Faculty.class.isAnnotationPresent(DevelopmentHistory.class);
        Assert.assertTrue(isAnnotationPresent);
    }

    @Test
    public void ConstructorAnnotationTest() {
        Object faculty = new Faculty("Mahin", "Lecturer", 50000.0);
        Constructor[] constructors = faculty.getClass().getDeclaredConstructors();
        List<String> constructorNames = new ArrayList<>();

        for (Constructor c: constructors) {
            System.out.println("ConstructorName : " + c.getName());
            boolean isAnnotationPresent = c.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if (isAnnotationPresent) {
                System.out.println("Annotation Present");
                constructorNames.add(c.getName());
            }
        }

        Assert.assertEquals(2, constructorNames.size());
        Assert.assertTrue(constructorNames.contains("Faculty"));
    }

    @Test
    public void MethodAnnotationTest() {

        Object faculty = new Faculty("Mahin", "Lecturer", 50000.0);
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> methodNames = new ArrayList<>();

        for (Method m: methods) {
            System.out.println("MethodName : " + m.getName());
            boolean isAnnotationPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if (isAnnotationPresent) {
                System.out.println("Annotation Present");
                methodNames.add(m.getName());
            }
        }

        Assert.assertEquals(2, methodNames.size());
        Assert.assertTrue(methodNames.contains("teach"));
        Assert.assertTrue(methodNames.contains("research"));

    }

}

