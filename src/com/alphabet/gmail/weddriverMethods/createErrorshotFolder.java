package com.alphabet.gmail.weddriverMethods;

import java.io.File;
import java.io.IOException;

public class createErrorshotFolder {
	public static void main(String[] args) throws IOException {
		File f1=new File("./errorshots");
		f1.mkdir();
		File f2=new File("./errorshots/a1.txt");
		f2.createNewFile();
		
	}

}
