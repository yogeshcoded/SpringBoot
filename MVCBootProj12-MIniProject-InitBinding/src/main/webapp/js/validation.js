function doValidations(frm) {
	document.getElementById("nameErr").innerHTML="";
	document.getElementById("jobErr").innerHTML="";
	document.getElementById("salErr").innerHTML="";
	
	
	let name = frm.ename.value;
	let desg = frm.job.value;
	let salary = frm.sal.value;
	
	let isValid = true;

	if (name =="" ) {
		document.getElementById("nameErr").innerHTML = "Employee Name Are Mandatory";
		isValid = false;
	}else if (name.length < 5 || name.length > 10) {
		document.getElementById("nameErr").innerHTML = "Employee Name Must Be 5-10 Charachters";
		isValid = false;
	}

	if (desg=="") {
		document.getElementById("jobErr").innerHTML = "Employee Desg Are Mandatory";
		isValid = false;
	} else if (desg.length < 5 || desg.length > 10) {
		document.getElementById("jobErr").innerHTML = "Employee Desg Must Be 5-10 Charachters";
		isValid = false;
	}
	 
	 if(salary==""){
			document.getElementById("salErr").innerHTML = "Employee SALARY Mandatory";
			isValid=false;
	}else if(salary<=1000||salary>=500000){
			document.getElementById("salErr").innerHTML = "Employee SALARY Must Be in the range of 800-500000";
			isValid=false;
	}else if(isNaN(salary)){
		document.getElementById("salErr").innerHTML = "ONLY NUMBER ARE ALLOWED";
			isValid=false;
	}
	
//change the hidden box related active value "yes" to indicate that client side validation are done
frm.active.value="yes";

	return isValid;
}