package xserver.autoapi.html;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public interface Html {

	public void create();

	public File getFile(String path);

	public void writeData(BufferedWriter bufferWritter) throws IOException;
}
