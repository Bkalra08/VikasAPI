package com.VikasAPI.VikasAPI.DAO;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.VikasAPI.VikasAPI.entities.Details;

@Repository
public interface DAOlayer extends MongoRepository<Details, Integer> {


	
	Details findById(int sHGId);

//	void update(Details detail);
	
}
