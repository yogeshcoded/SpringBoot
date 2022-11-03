package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.service.IPersonService;
@Component
public class LOBRunnerTest implements CommandLineRunner {
	@Autowired
private IPersonService service;
	@Override
	public void run(String... args) throws Exception {
	// Geeting input from end user 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Name::");
		String name=scn.next();
		System.out.println("Enter DOBT yyyy-MM-ddThh:mm:ss");
		String dob=scn.next();
		System.out.println("Is Person Married? ");
		boolean ms=scn.nextBoolean();
		System.out.println("Enter photopath:: ");
		String photopath=scn.next();
		System.out.println("Enter resumepath:: ");
		String resumepath=scn.next();
		//Convent string date to localdate format
		LocalDateTime ldt=LocalDateTime.parse(dob);
		//prepare byte[] object from the photo  file content
		File file=new File(photopath);
		FileInputStream fis=new FileInputStream(file);
		byte[] photoContent=new byte[(int) file.length()];
		fis.read(photoContent);
		
		//prepare char[] object from the resumepath  file content
		File file1=new File(resumepath);
		FileReader reader =new  FileReader(file1);
		char[] resumeContent=new char[(int) file1.length()];
		reader.read(resumeContent);
		
		//create Entity Class object
		Person per=new Person();
		per.setPname(name); per.setMarried(ms);
		per.setDob(ldt);per.setPhoto(photoContent);
		per.setResume(resumeContent);
		
		//save object 
		try {
		System.out.println(service.registerPersonInfo(per));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("====================================");
		/*try {
			Person info=service.fetchPersonByPid(3);
			if(info!=null) {
				System.out.println(info.getPid()+"  "+info.getPname()+" "+info.getDob());
				byte[] photoContent1=info.getPhoto();
				OutputStream os=new FileOutputStream("photo.jpg");
				os.write(photoContent1);
				os.flush();
				os.close();
				System.out.println("Photo retrive from db table");
				char[] resumeContent1=info.getResume();
				Writer wr=new FileWriter("Resume.text");
				wr.write(resumeContent1);
				wr.flush();
				wr.close();
				System.out.println("Rsume is retrived form table");
			}//if 
			else {
				System.out.println("Record not found");
			}
		}//try
		
		catch(Exception e) {
			e.printStackTrace();
		}*/
	
	}//run method

}//class
