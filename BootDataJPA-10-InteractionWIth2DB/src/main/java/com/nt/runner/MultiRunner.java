package com.nt.runner;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.offer.Offer;
import com.nt.model.product.Product;
import com.nt.repo.offer.IOfferRepository;
import com.nt.repo.product.IProductRepository;
@Component
public class MultiRunner implements CommandLineRunner {
	@Autowired
private IOfferRepository offerRepo;
	@Autowired
private IProductRepository prodRepo;
	@Override
	public void run(String... args) throws Exception {
		// Product object is created
		Product prod=new Product("table", 2500.0, 15.0);
		Offer offer1=new Offer("manson",10.0, LocalDateTime.now());
		Offer offer2=new Offer("BIg Billion Days",50.0, LocalDateTime.now());
		//save oracle data
System.out.println("product is save with id value::"+prodRepo.save(prod).getPid());
//save mysql data

               int count=offerRepo.saveAll(List.of(offer1,offer2)).size();
               System.out.println(count+" no.of offerrs are saved");
               
               
				/*   System.out.println("The Products Info");
				prodRepo.findAll().forEach(System.out::println);
				System.out.println("Offers are");
				offerRepo.findAll().forEach(System.out::println);*/

	}//run

}
