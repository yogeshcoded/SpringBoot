package com.nt.service;

import java.util.List;

import com.nt.document.StockDetails;

public interface IStockMgmtService {
public String registreStockDetails(StockDetails details);
public String registreStockDetails(List<StockDetails> details);

public List<StockDetails> fetchStockDetailsByExchange(String exchange);
public List<StockDetails> fetchStockDetailsByPrice(int start ,int end );

public StockDetails fetchStockDetailsByStockId(int id);
public List<StockDetails> fetchAllStockDetailsByStockId();
public String fetchAndUpdateStockDetailsByStockId(int stockId,int newPrice,String newExchangeName);
public String updateMultipleStockDetailsByPriceRange(int start ,int end,String newExchangeName);

public String registreOrUpdateStockDetails(String stockName,int newPrice,String newExchangeName);

public String fetchAndRemoveStockDetailsByStockId(int stockId);

public List<StockDetails> fetchAllAndRemoveStockDetailsByStockId(int stockId);
}
