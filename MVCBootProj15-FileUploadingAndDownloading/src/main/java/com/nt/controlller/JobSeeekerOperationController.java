package com.nt.controlller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.JobSeekerInfo;
import com.nt.model.JobSeekerData;
import com.nt.service.IJobSeekerService;

@Controller
public class JobSeeekerOperationController {
	@Autowired
	private IJobSeekerService jsService;
	@Autowired
	private Environment env;
	@Autowired
	private ServletContext sc;

	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/register")
	public String registerFormPageLauncher(@ModelAttribute("js") JobSeekerData js) {
		return "jobSeeker_register";
	}

	@PostMapping("/register")
	public String registerByUploadFile(@ModelAttribute("js") JobSeekerData jsData, RedirectAttributes attrs)
			throws Exception {
		// get upload location from properites file
		String storeLocation = env.getRequiredProperty("upload.path");
		// if not available then create
		File file = new File(storeLocation);
		if (!file.exists())
			file.mkdir();

		// get InputStream represent in upload file content
		MultipartFile resumeFile = jsData.getResume();
		MultipartFile photoFile = jsData.getPhoto();
		InputStream isResume = resumeFile.getInputStream();
		InputStream isphoto = photoFile.getInputStream();
		// get the names of uploaded file
		String resumeFileName = resumeFile.getOriginalFilename();
		String photoFileName = photoFile.getOriginalFilename();
		// get OutputStream represent in empty file designation file
		OutputStream osResume = new FileOutputStream(file.getAbsolutePath() + "\\" + resumeFileName);
		OutputStream osPhoto = new FileOutputStream(file.getAbsolutePath() + "\\" + photoFileName);
		// perform file copy operation
		/*	IOUtils.copy(isResume, osResume);
			IOUtils.copy(isphoto, osPhoto);
			*/
		// alternative java 9
		isResume.transferTo(osResume);
		isphoto.transferTo(osPhoto);

		// close the stram
		isResume.close();
		isphoto.close();
		osResume.close();
		osPhoto.close();
		// preapare entity class obj to model class obj
		JobSeekerInfo info = new JobSeekerInfo();
		info.setJsName(jsData.getJsName());
		info.setJsAddrs(jsData.getJsAddrs());
		info.setResumePath(file.getAbsolutePath() + "\\" + resumeFileName);
		info.setPhotoPath(file.getAbsolutePath() + "\\" + photoFileName);
		// use service
		String msg = jsService.registerJobSeeker(info);
		// keep the file name and location to model attribute
		/*map.put("file1", resumeFileName);
		map.put("file2", photoFileName);
		map.put("resultMsg", msg);*/

		// put result to flash attribute
		attrs.addFlashAttribute("file1", resumeFileName);
		attrs.addFlashAttribute("file2", photoFileName);
		attrs.addFlashAttribute("resultMsg", msg);

		// return LVN
		return "redirect:js_report";
	}

	@GetMapping("/js_report")
	public String getAllJobSeekerInfo(@ModelAttribute("js") JobSeekerInfo js, Map<String, Object> map) {
		// use service
		Iterable<JobSeekerInfo> jList = jsService.fetchAllEmployee();
		// put the result into scope
		map.put("jsInfo", jList);
		return "show_report";

	}

		@GetMapping("/download")
	public String downloadFileContent(HttpServletResponse res, @RequestParam("id") Integer id,
			                                                     @RequestParam("type") String type) throws Exception {
		// make file object to get the download path
		String filePath = null;
		if (type.equalsIgnoreCase("resume"))
			filePath = jsService.fetchResumePathById(id);
		else if(type.equalsIgnoreCase("photo"))
			filePath = jsService.fetchPhotoPathById(id);
		System.out.println(filePath);

		// create file object to represent file download
		File file = new File(filePath);
		// get the length of file and make it as response content length
		res.setContentLengthLong(file.length());
		// get the mime type and make it as response content type
		String mimeType = sc.getMimeType(filePath);
		mimeType = mimeType == null ? "application/octet-stream" : mimeType;
		res.setContentType(mimeType);
		try (
				// create InputStream to pointing file
				InputStream is = new FileInputStream(file);
				// create OutputStream to pointing response object
				OutputStream os = res.getOutputStream()) {
			res.setHeader("Content-Disposition", "attachment;fileName=" + file.getName());
			// write file content to response object
			is.transferTo(os);
		}
		return null;

	}
}
