package com.springRest.Dao;

import org.springframework.data.repository.CrudRepository;

import com.springRest.entities.Book;

public interface BookDao extends CrudRepository<Book, Integer> {

}
