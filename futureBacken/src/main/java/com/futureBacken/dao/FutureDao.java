package com.futureBacken.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.futureBacken.model.Future;

public interface FutureDao extends CrudRepository<Future,Long>{
	Future findByDate(String date);
	Future findByContractMonth(String contractMonth);
	
	@Query("SELECT f FROM Future f WHERE f.date >= :dateStart AND f.date <= :dateEnd AND f.contractMonth = :contractMonth")
	List<Future> findFutureList(@Param("dateStart") String dateStart, @Param("dateEnd") String dateEnd, @Param("contractMonth") String contractMonth);
}
