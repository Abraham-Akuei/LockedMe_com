package lockedme.com;

import java.io.FileNotFoundException;
//An interface businees Operation
public interface BusinessOperation {
	public void displayOptionOne() throws FileNotFoundException;
	public void displayOptioTwo();
	public void displayOptionThree();
	public void displayMainOptions();
	public void findFile();

}
