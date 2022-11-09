package com.nt.view;

import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nt.model.Employee;

@Component("excelreport")
public class ExcelViewReport extends AbstractXlsView {
	private int i = 1;

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// get model attribite
		@SuppressWarnings("unchecked")
		Iterable<Employee> empList = (Iterable<Employee>) map.get("empsList");
		//1. define your own excel file name
				response.addHeader("Content-Disposition", "attachment;filename=EMPLOYEE.xls");
		// create sheet
		Sheet sheet = workbook.createSheet("Employee Report");
	
       //set header 
		Row row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("EMPNO");
		row1.createCell(1).setCellValue("ENAME");
		row1.createCell(2).setCellValue("JOB");
		row1.createCell(3).setCellValue("SAL");
		row1.createCell(4).setCellValue("DEPTNO");
		// add rows to sheet
		empList.forEach(emp -> {
			// add row sheet represeting report
			Row row = sheet.createRow(i);
			row.createCell(0).setCellValue(emp.getEmpno());
			row.createCell(1).setCellValue(emp.getEname());
			row.createCell(2).setCellValue(emp.getJob());
			row.createCell(3).setCellValue(emp.getSal());
			row.createCell(4).setCellValue(emp.getDeptno());
			i++;
		});

	}

}
