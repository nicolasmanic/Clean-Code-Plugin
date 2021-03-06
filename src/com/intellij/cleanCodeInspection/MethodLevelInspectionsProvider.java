package com.intellij.cleanCodeInspection;

import com.intellij.cleanCodeInspection.methodInspections.TooLargeMethod;
import com.intellij.cleanCodeInspection.methodInspections.TooManyArgumentsInspection;
import com.intellij.cleanCodeInspection.methodInspections.TooLongStatement;
import com.intellij.codeInspection.InspectionToolProvider;

/**
 * Created by nkanakis on 9/14/2017.
 */
public class MethodLevelInspectionsProvider implements InspectionToolProvider {
    @Override
    public Class[] getInspectionClasses() {
        return new Class[]{
                TooManyArgumentsInspection.class,
                TooLargeMethod.class,
                TooLongStatement.class
        };
    }
}
