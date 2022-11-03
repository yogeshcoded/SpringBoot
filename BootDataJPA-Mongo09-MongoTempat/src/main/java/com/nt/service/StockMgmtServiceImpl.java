package com.nt.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.nt.document.StockDetails;

@Service("stockService")
public class StockMgmtServiceImpl implements IStockMgmtService {
	@Autowired
private MongoTemplate template;

	@Override
	public String registreStockDetails(StockDetails details) {
	int idVal=template.save(details,"STOCK").getStockid();
		return "Stock register  "+idVal;
	}

	@Override
	public String registreStockDetails(List<StockDetails> list) {
	int size=template.insertAll(list).size();
		return size+" no of stock details are save";
	}

	@Override
	public List<StockDetails> fetchStockDetailsByExchange(String exchange) {
		Query query=new Query();
		query.addCriteria(Criteria.where("exchangeName").is(exchange));
		List<StockDetails> list=template.find(query, StockDetails.class);
		return list;
	}
	@Override
	public List<StockDetails> fetchStockDetailsByPrice(int startPrice, int endPrice) {
	Query query=new Query();
	query.addCriteria(Criteria.where("price").gt(startPrice).lt(endPrice));
	List<StockDetails> SList=template.find(query, StockDetails.class);
		return  SList;
	}
	
	
	@Override
	public StockDetails fetchStockDetailsByStockId(int id) {
		return template.findById(id, StockDetails.class);
	}
	
	@Override
	public List<StockDetails> fetchAllStockDetailsByStockId() {
				return template.findAll(StockDetails.class);
	}
	
	@Override
	public String fetchAndUpdateStockDetailsByStockId(int stockId, int newPrice, String newExchangeName) {
		Query query=new Query();
		query.addCriteria(Criteria.where("stockid").is(stockId));
		//create update object 
		Update update=new Update();
		update.set("price", newPrice);
		update.set("exchangeName", newExchangeName);
		//call the method
		StockDetails details=template.findAndModify(query, update, StockDetails.class);
		return details==null?"stock is not found":"stock is found and update";
	}
	
	@Override
	public String updateMultipleStockDetailsByPriceRange(int start, int end, String newExchangeName) {
			Query query = new Query();
			query.addCriteria(Criteria.where("price").gte(start).andOperator(Criteria.where("price").lte(end)));
			Update update = new Update().set("exchangeName", newExchangeName);
			// call the method
			UpdateResult result = template.updateMulti(query, update,"STOCK");
			return result.getModifiedCount() + "  no of document are update ";
	}
	
	@Override
	public String registreOrUpdateStockDetails(String stockName, int newPrice, String newExchangeName) {
		Query query=new Query();
		query.addCriteria(Criteria.where("stockName").is(stockName));
		//update 
		Update update=new Update();
		update.set("exchangeName", newExchangeName);
		update.setOnInsert("stockName", stockName);
		update.setOnInsert("stockid", new Random().nextInt(10000));
		update.set("price", newPrice);
		UpdateResult result=template.upsert(query, update, StockDetails.class);
		return result.getModifiedCount()+"  no of document update";
	}
	@Override
	public String fetchAndRemoveStockDetailsByStockId(int stockId) {
		Query query=new Query();
		query.addCriteria(Criteria.where("stockid").is(stockId));
		//call the method
		StockDetails details=template.findAndRemove(query, StockDetails.class);
		return details==null?"stock not found":"stock id found and remove";
	}
	
	@Override
	public List<StockDetails> fetchAllAndRemoveStockDetailsByStockId(int stockId) {
		Query query=new Query();
		query.addCriteria(Criteria.where("stockid").is(stockId));
		List<StockDetails> list=template.findAllAndRemove(query, StockDetails.class);
		return list ;
	}
}//service class
