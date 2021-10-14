package com.teamreact.dao;

import java.util.List;

import com.teamreact.entity.Class;


public interface ClassDao {
	void add(Class classroom);

	void update(Class classroom);

	void delete(Class classroom);

	Class get(int id);

	List<Class> search(SearchDTO searchDTO);
	
	Long countSearch(SearchDTO searchDTO);
	
	Long countTotal(SearchDTO searchDTO);
}