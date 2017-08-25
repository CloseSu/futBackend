package com.futureBacken.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.futureBacken.model.Tsecweighted;

public interface TsecWeightedDao extends CrudRepository<Tsecweighted,Long> {
	@Query("SELECT f FROM Tsecweighted f WHERE f.date >= :dateStart AND f.date <= :dateEnd ")
	List<Tsecweighted> findTsecweightedList(@Param("dateStart") String dateStart, @Param("dateEnd") String dateEnd);
}