package com.nt.view;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Header;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.model.Employee;

@Component("pdfreport")
public class PdfViewReport extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get the model attribute
		@SuppressWarnings("unchecked")
		Iterable<Employee> empsList = (Iterable<Employee>) map.get("empsList");
		
		// add paragraph
		Paragraph para = new Paragraph("Employee Report", new Font(Font.HELVETICA, 18, Font.BOLD));
	document.add(para);
		// add table

		Table table = new Table(5, ((ArrayList) empsList).size());
		table.addCell("EMPNO");
		table.addCell("ENAME");
		table.addCell("JOB");
		table.addCell("SALARY");
		table.addCell("DEPTNO");
		empsList.forEach(emp -> {
			try {
				table.addCell(String.valueOf(emp.getEmpno()));
				table.addCell(emp.getEname());
				table.addCell(emp.getJob());
				table.addCell(String.valueOf(emp.getSal()));
				table.addCell(String.valueOf(emp.getDeptno()));
			} // try
			catch (BadElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // catch
		});// for each
		document.add(table);

	}// method

}// class
