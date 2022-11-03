package com.nt.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.StockDetails;
import com.nt.service.IStockMgmtService;

@Component
public class StockRunner implements CommandLineRunner {
	@Autowired
	private IStockMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		/*StockDetails details = new StockDetails(new Random().nextInt(1000), "TATAMOTOR", 495, "BSE");
		String result = service.registreStockDetails(details);
		System.out.println(result);*/
		
		System.out.println("============= inserstALL() =======================");
		
		/*StockDetails details1=new StockDetails(new Random().nextInt(1000), "ICICI", 1200, "NSE");
		StockDetails details2=new StockDetails(new Random().nextInt(2000), "TATASTEEL",965, "BSE");
		StockDetails details3=new StockDetails(new Random().nextInt(3000), "ITC", 395, "NSE");
		StockDetails details4=new StockDetails(new Random().nextInt(5000), "TCS", 2500, "BSE");
		String msg=service.registreStockDetails(List.of(details1,details2,details3,details4));
		System.out.println(msg);*/
		
		System.out.println("=================Fetch()===================");
		//service.fetchStockDetailsByExchange("NSE").forEach(System.out::println);
		//service.fetchStockDetailsByPrice(600,2800).forEach(System.out::println);
	//System.out.println("StockDetails are"+	service.fetchStockDetailsByStockId(1131));
		
	//service.fetchAllStockDetailsByStockId().forEach(System.out::println);
	
	//System.out.println(service.fetchAndUpdateStockDetailsByStockId(1131,854,"NSE"));
	//System.out.println(service.updateMultipleStockDetailsByPriceRange(200, 1200, "MSD"));
	//System.out.println(service.registreOrUpdateStockDetails("DMART", 5500, "BSE"));
		
		
	//System.out.println(service.fetchAndRemoveStockDetailsByStockId(1131));
	service.fetchAllAndRemoveStockDetailsByStockId(2218).forEach(System.out::println);
	}//run()

}
