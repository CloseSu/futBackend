package com.futureBacken.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.futureBacken.model.Trade;

public interface TradeDao extends CrudRepository<Trade,Long>{

	@Query("SELECT f FROM Trade f WHERE f.date >= :dateStart AND f.date <= :dateEnd ")
	List<Trade> findTradeList(@Param("dateStart") String dateStart, @Param("dateEnd") String dateEnd);

	Trade findById(Long id);
}
