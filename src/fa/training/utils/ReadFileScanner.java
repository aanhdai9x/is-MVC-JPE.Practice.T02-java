package fa.training.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileScanner {
	public static void readFile(String url) throws FileNotFoundException {
		// Đọc dữ liệu từ File với Scanner
		int iJ = 0, iF = 0, iN = 0, iC = 0;
		FileInputStream fileInputStream = new FileInputStream(url);
		Scanner scanner = new Scanner(fileInputStream);

		try {
			while (scanner.hasNextLine()) {
				// System.out.println(scanner.nextLine());
				String line = scanner.nextLine();
				// System.out.println(line);
				if (line.contains("Java")) {
					iJ++;
				} else {
					if (line.contains("FrontEnd")) {
						iF++;
					} else {
						if (line.contains("NET")) {
							iN++;
						} else {
							if (line.contains("C++")) {
								iC++;
							}
						}
					}
				}
			}
			System.out.println("Java" + "\t\t" + iJ + "\n" + "FrontEnd" + "\t" + iF + "\n" + "NET" + "\t\t" + iN + "\n"
					+ "C++" + "\t\t" + iC + "\n");
		} finally {
			try {
				scanner.close();
				fileInputStream.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
