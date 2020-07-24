package lockedme.com;
import java.io.File;
import java.io.FilenameFilter;
public class OnlyExt implements FilenameFilter  {
String ext;
public OnlyExt(String newFile)
{
	this.ext=newFile;
}
	@Override
	public boolean accept(File dir, String name) {
		
		return name.equals(ext);
	}

}
