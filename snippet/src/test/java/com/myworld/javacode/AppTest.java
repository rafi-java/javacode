package com.myworld.javacode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/**
 * Unit test for simple App.
 */
@SelectPackages({"com.myworld.javacode.snippet"
	,"com.myworld.javacode.sample"})

@IncludeTags("production")
@Suite
public class AppTest {

	@DisplayName("Test testApp()")
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
}
