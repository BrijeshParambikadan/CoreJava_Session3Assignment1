
//finding errors in the below code (if any)

	public class J_S3A1{
		static{
		print(10);
		}
		static void print (int x) {
		System.out.println (x);
		System.exit(0);//avoid the NoSuchmethodError
		}
		}

// Actually the Output should be c. It will compile and run printing out "10“


// Sir/Madam, I am getting the following error might due to the version of JDK. Please guide me.   
 
/* Error: Main method not found in class J_S3A1, please define the main method as:
public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application */

//Thank You