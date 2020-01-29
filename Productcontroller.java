package com.cts.project2;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Map;
	import java.util.HashMap;


	//import org.springframework.ui.model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import com.cts.project2.*;

	@RestController
	public class Productcontroller {
		Map<Integer,Product> map=new HashMap();
		List<Product> list=new ArrayList();
		
		public Productcontroller(){
			map.put(100,(new Product("Tv",2,2000f)));
			map.put(101,(new Product("Ac",3,5000)));
			map.put(102,(new Product("Tv",1,12000)));
			
			list.add(new Product("Tv",2,3000));
			list.add(new Product("Tv",1,15000));
			list.add(new Product("DvD",3,7000));
		}
		@RequestMapping(value="/data")
		public Map<Integer,Product> displayproddetails(){
			return map;
		}
		@RequestMapping(value="/jsondata")
		public List<Product>displayproduct() {
			return list;
		}
		
	}



	
	
