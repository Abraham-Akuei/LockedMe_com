package lockedme.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// a class to implements business operation interface
public class BusinessOperationImpl implements BusinessOperation  {
	private int EnteredValue;
	


	@Override
	// this method display files names in the current working directory in descending order one a user entered  option one in in the main context
	public void displayOptionOne() {
		String dirname = System.getProperty("user.dir");
		 String CurrentworkingDir=Paths.get(dirname).getRoot().toString();
		File f1 = new File(CurrentworkingDir);
		List<String> listFile = Arrays.asList(f1.list());
		if(f1.isDirectory()){
			
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in descending order");
			Collections.sort(listFile,Collections.reverseOrder());
			for(String s:listFile){
				System.out.println(s);
			}
		
				
			}	
		
	}

	@Override
	// this method display option from 1 to 4 when a user Entered  option 2 in the main context 
	public void displayOptioTwo() {
		String option = "Select the below Options:";
		System.out.println(option);
		System.out.println("1. add a user specified file to the application");
		System.out.println("2. delete a user specified file from the application");
		System.out.println("3. to search a user specified file from the application");
		System.out.println("4. Navigation option to close the current execution context and return to the main context");
		
	}

	@Override
	// this method terminate the programme when a user enter option three in the main context
	public void displayOptionThree() {
		System.exit(-1);
		
	}
	
	@Override
	// this method desplay main context options
	public void displayMainOptions() {
		String option = "Select the below Options:";
		System.out.println(option);
		System.out.println("1. Return the current file names in ascending order");
		System.out.println("2. return the details of the user interface such as options");
		System.out.println("3. option to close the application");
		
	}
	public void findFile(String fileName,File file)throws IOException
	{
	    File[] list = file.listFiles();
	    if(list!=null)
	    for (File fil : list)
	    {
	       // if (fil.isDirectory())
	      //  {
	           // findFile(fileName,fil);
	        //}
	       // else 
	        if (fileName.equalsIgnoreCase(fil.getName()))
	        {
	            System.out.println("File:" + fil.getParentFile() + fil.getName()+ " Searched Succsfully!");
	        }
	       
	    }
	}
	public int getEnteredValue() {
		return EnteredValue;
	}

	public void setEnteredValue(int enteredValue) {
		EnteredValue = enteredValue;
	}

	@Override
	public void findFile() {
		// TODO Auto-generated method stub
		
	}
	
	

}
