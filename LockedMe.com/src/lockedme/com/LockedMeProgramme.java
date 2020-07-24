package lockedme.com;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class LockedMeProgramme {

	public static void main(String[] args) throws IOException{
		
		BusinessOperationImpl BO = new BusinessOperationImpl();
		String result = String.join(""," Welcom to Lockedme.com! \n \t Developer Name: Abrahma Akuei Makuac");
		
		System.out.println("\t*************************************************************************\t");
		System.out.println("\t" +result);
		result =String.join("\t Developer Name: Abrahma Akuei Makuac", "Email: abrahamakuei@gmail.com\t");
		System.out.println("\t"+ result);
		System.out.println("\t*************************************************************************\t");
	
	//mainContex();
	mainContex(BO);
	
	}

	public static void mainContex(BusinessOperationImpl BO) {
		BO.displayMainOptions() ;
		// take user input for the main option
		Scanner Sc = new Scanner(System.in);
		System.out.println("Please Enter your option for main Menu");
		try {
		int Options= Sc.nextInt();
		if (Options==1)// check if the user input is equal to 1 it will call the displayoptionOne method
		{
		BO.displayOptionOne();
		mainContex(BO);
		}
		
		
			if (Options==2) // check if the user input is equal to 2 it will call the displayOptioTwo(); method
			{
			BO.displayOptioTwo();
			menuTwo(BO);
			}
			
				if (Options==3) // check if the user input is equal to 3 it will call the displayOptionThree(); method
				{
					BO.displayOptionThree();
				}
		}
		catch (InputMismatchException exception) {
			exception.getMessage();
			System.err.println("Wrong Input! Please provide ony numbers (1, 2, 3)");
		}
		mainContex(BO);
	}

	@SuppressWarnings("unlikely-arg-type")
	// this is menu two which is call when a user intered 2 in the main options 
	public static void menuTwo(BusinessOperationImpl BO) {
	
		String dirname = System.getProperty("user.dir");
		 String CurrentworkingDir=Paths.get(dirname).getRoot().toString();// current working directory
		 
		File f1 = new File(CurrentworkingDir);
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your option for Menu Two");// Ask the user to enter the option for meanu two (1,2,3,4)
				try
		
		{
		int enteredValue= scanner.nextInt();
	
		if (enteredValue==1)// check if the user input is equal to 1 it will ask the user to enter the file name to be add
		{
			System.out.println("Please Enter the file Name to be added");
			
			String fileName= scanner.next();
		
			
			
			File newFile= new File(CurrentworkingDir+ fileName );
			if(!newFile.exists())
				
				try {
					
					if(newFile.createNewFile()){
						
					    System.out.println(newFile + " File Added Successfully to the directory");
					   
					}
					else System.out.println("File "+newFile+" already exists in the project root directory");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					e.getMessage();
					System.err.println("File not Found!");// File not found message if the file name is not found
				}
				menuTwo(BO);
		}
	
		if (enteredValue==2)//check if the user input is equal to 2 it will ask the user to enter the file name to be Deleted
		{
			
			System.out.println("Please Enter the file Name to be deleted");
			try {
			String fileName= scanner.next();
			String fileNameToLower =fileName.toLowerCase();
		
			File newFile= new File(CurrentworkingDir+ fileNameToLower );
		
			if(newFile.delete()){
				
				System.out.println(newFile.getName() + "Deleted");
			}
			else
				
				System.out.println("File does not exit!");
			
			}
			catch (InputMismatchException exception) {
				exception.getMessage();
				System.out.println("File Not found!");
			}
			menuTwo(BO);
		}
		
			if (enteredValue==3)//check if the user input is equal to 3 it will ask the user to enter the file name to be serached
			{
			
				System.out.println("Please Enter the file Name to be serached");
				try {
					//File newFile= new File(CurrentworkingDir);
					String fileName= scanner.next();
					//String fileNameCs= fileName.toLowerCase();
					BO.findFile(fileName, new File(CurrentworkingDir));
					
				}	
			catch (InputMismatchException exception) {
				exception.getMessage();
				System.err.println("File not Found!");// File not found message if the file name is not found
			
				menuTwo(BO);	
				//maintEntry();
		
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			else
				if (enteredValue==4) //check if the user input is equal to 4 it will desplay the main context 
				{
					//BO.displayMainOptions();
				
					mainContex(BO);
					
				}
		}
		
				catch (InputMismatchException exception) {
					exception.getMessage();
					System.err.println("Wrong Input! Please provide ony numbers (1, 2, 3,4)");// if a user entenred string value it will throw and error with this message
		
		}
				menuTwo(BO);
	}
	
}

	