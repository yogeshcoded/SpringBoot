package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("menu")
public class MenuItemsPrices {
	@Value("${menu.idlyPrice}")
	private Integer idlyPrice;
	@Value("${menu.dosaPrice}")
	private Integer dosaPrice;
	@Value("${menu.pohaPrice}")
	private Integer pohaPrice;
	@Value("${menu.vadapavPrice}")
	private Integer vadapavPrice;

}
