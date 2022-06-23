package com.myworld.javacode.snippet.file;

import java.io.File;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class FilenameFilterTest {

	@Test
	public void fileExtensionfilter() {
	    Arrays.stream(new File("c:/tmpgh").
	        list(new ExtensionAwareFilenameFilter("pdf", "txt")))
	            .forEach(e -> System.out.println(e));
	}
}
