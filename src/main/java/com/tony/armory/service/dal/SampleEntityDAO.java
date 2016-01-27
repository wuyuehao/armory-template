package com.tony.armory.service.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tony.armory.service.entity.SampleEntity;

@Repository
public interface SampleEntityDAO extends JpaRepository<SampleEntity, Long>{
	

}
