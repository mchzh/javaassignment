package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FileLineReverse {

	public FileLineReverse(String filepath) {
		super();
		this.filepath = filepath;
	}

	private String filepath;
	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	ArrayList<String> strList;
	
	public FileLineReverse() {
		super();
	}

	public ArrayList<String> getStrList() throws IOException {
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String result = "Begin Dealing";
		ArrayList<String> strList = new ArrayList<String>();
		while (result != null) {
			result = br.readLine();
			if(result != null) {
				strList.add(result);
			}
		}
		br.close();
		return strList;
	}

	public void setStrList(ArrayList<String> strList) {
		this.strList = strList;
	}

	public static void main(String[] args) throws IOException {
		String filecontent="/assignment/workspace/workspace/FileDeal/src/File/FileLineReverse.java";
		File file = new File(filecontent);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		//int count = 0;
		String result = "Begin Dealing";
		ArrayList<String> strList = new ArrayList<String>();
		while (result != null) {
			result = br.readLine();
			if(result != null) {
				strList.add(result);
			}
		}
		br.close();
		System.out.println("Before Reverse Order, ArrayList Contains : " + strList);
		Collections.reverse(strList);
		System.out.println("After Reverse Order, ArrayList Contains : " + strList);
	}

}
