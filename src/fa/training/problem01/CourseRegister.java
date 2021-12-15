package fa.training.problem01;

import java.io.FileNotFoundException;
import java.util.Map;

import fa.training.utils.ReadFileScanner;

public class CourseRegister {

	public static Map<String, Integer> countStudent(String filePath) {
		try {
			ReadFileScanner.readFile(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
	
}
