package com.myworld.javacode.snippet.file;

import java.io.File;
import java.io.FilenameFilter;

public class FilenamePattern {

	public static void main(String[] args) {		
	    	File fil = new File("");
	    	fil.list(new FilenameFilter() {
	    	    public boolean accept(File fil, String filename) {
	    	        return filename.matches("[0-9]+");
	    	    }
	    	});
	    	
	}

}


