package cn.dmk.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class FileUtils {

	private static void ensureFolderStructureExists(String file)
	  {
	    File outputFile = new File(file);
	    if (outputFile.getParent() == null) {
	      return;
	    }
	    if (!outputFile.isDirectory())
	    {
	      File parentPath = new File(outputFile.getParent());
	      if ((!parentPath.exists()) && (!parentPath.mkdirs())) {
	        throw new IllegalStateException("Error creating directory: " + parentPath);
	      }
	    }
	    else
	    {
	      throw new IllegalArgumentException("outputFile cannot be a directory: " + file);
	    }
	  }
	  
	  @SuppressWarnings("deprecation")
	public static void writeToFile(String outputFile, String content, String encoding)
	    throws IOException
	  {
	    ensureFolderStructureExists(outputFile);
	    if (encoding != null) {
	      org.apache.commons.io.FileUtils.writeStringToFile(new File(outputFile), content, encoding);
	    } else {
	      org.apache.commons.io.FileUtils.writeStringToFile(new File(outputFile), content);
	    }
	  }
}
