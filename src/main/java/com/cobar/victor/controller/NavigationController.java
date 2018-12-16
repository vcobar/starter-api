package com.cobar.victor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobar.victor.model.NavigationItem;
import com.cobar.victor.repository.NavigationItemRepository;

@RestController
public class NavigationController {

	@Autowired
	private NavigationItemRepository navigationItemRepository;
	
	@RequestMapping("/getItems")
	public ResponseEntity<List<NavigationItem>> getItems() {
		List<NavigationItem> navItems = new ArrayList<NavigationItem>();
		
		List<NavigationItem> allNavItems = navigationItemRepository.findAll();
		if ( allNavItems != null && allNavItems.size() > 0 ) {
			navItems = allNavItems;
		}
		return ResponseEntity.ok(navItems);
	}
}
