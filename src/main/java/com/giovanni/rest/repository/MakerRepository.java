package com.giovanni.rest.repository;

import com.giovanni.rest.entities.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository  extends CrudRepository<Maker, Long> {
}
