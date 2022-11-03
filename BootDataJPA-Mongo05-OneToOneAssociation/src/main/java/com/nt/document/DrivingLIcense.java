package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document("DrivingLIcense_OTO")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class DrivingLIcense {
	@Id
	@NonNull
	private Long licenseNo;
	@NonNull
	private String licenseType;
	@NonNull
	private LocalDateTime expireDate;
	private Person personDetails;

	@Override
	public String toString() {
		return "DrivingLIcense (licenseNo=" + licenseNo + ", licenseType=" + licenseType + ", expireDate=" + expireDate
				+ ")";

	}

}
