package com.springboot.demoBoot.Dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.demoBoot.Model.Alien;

public interface HomeRepository extends CrudRepository<Alien, Integer> {

}
