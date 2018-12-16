package com.cobar.victor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cobar.victor.model.NavigationItem;

public interface NavigationItemRepository extends JpaRepository<NavigationItem, Long>{

	List<NavigationItem> findNavigationItemByName(String name);
}
