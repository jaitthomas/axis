package com.axis.project.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.axis.project.Project";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
