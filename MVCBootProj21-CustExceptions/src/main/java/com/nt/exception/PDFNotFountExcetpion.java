package com.nt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.BAD_REQUEST)
public class PDFNotFountExcetpion extends Exception {
	public PDFNotFountExcetpion() {
		super();
	}

	public PDFNotFountExcetpion(String msg) {
		super(msg);
	}
}
