package xserver.autoapi.html;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xserver.autoapi.constant.ConfigConstant;

public abstract class AbstractHtml implements Html{
	public static Logger LOG = LoggerFactory.getLogger(AbstractHtml.class);
	public static String ROOTDIR = null;
	public static String APIDOCS = null;
	public static String DOCHTML = null;
	public static String INDEX = null;
	public static String LEFT = null;
	public static String RIGHT = null;
	
	static{
		ROOTDIR = ConfigConstant.rootpath;
		APIDOCS = ConfigConstant.APIDOCS;
		DOCHTML = ConfigConstant.DOCHTML;
		INDEX = ConfigConstant.INDEX;
		LEFT = ConfigConstant.LEFT;
		RIGHT = ConfigConstant.RIGHT;
	}
	
	protected Collection<String> paths;
	protected Map<String, String> file2htmlPath;

	public void create() {
		if (paths!= null) {
			for (String path : paths) {
				create(path);
			}
		}
	}

	private void create(String path) {
		 String fileName = path.substring(path.lastIndexOf("/") + 1, path.length() - 5);
	        File catalog = new File(ROOTDIR);
	        if(!catalog.exists()) {
	        	catalog.mkdir();
	        }
	        
	        File f = new File(ROOTDIR + fileName + DOCHTML);
	        if (f.getAbsolutePath().contains(DOCHTML)) {
	            try {
	                f.createNewFile();
	                file2htmlPath.put(fileName, f.getAbsolutePath());
	            } catch (IOException e) {
	            	LOG.error(e.getMessage());
	            }
	        }
	}

	public File getFile(String path){
		File f = new File(ROOTDIR + path);
		if (f.exists() && f.length() > 0) {
			f.delete();
			f = new File(ROOTDIR + path);

			try {
				f.createNewFile();
			} catch (IOException e) {
				LOG.info(e.getMessage());
			}
		} else {
			f = new File(ROOTDIR + path);

			try {
				f.createNewFile();
			} catch (IOException e) {
				LOG.error(e.getMessage());
			}
		}
		return f;
	}
}
