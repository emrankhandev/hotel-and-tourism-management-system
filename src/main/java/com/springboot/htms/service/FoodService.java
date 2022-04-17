package com.springboot.htms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.FoodDAO;
import com.springboot.htms.entities.Food;
import com.springboot.htms.service.impl.IFoodService;

@Service(value = "foodService")
public class FoodService implements IFoodService{

	@Autowired
    FoodDAO foodlDAO;

	@Override
	public Food save(HttpServletRequest request) {
		
		Food f = new Food();
        f.setCode(request.getParameter("code"));
        f.setType(request.getParameter("type"));
        Double d = Double.valueOf(request.getParameter("price"));
        f.setPrice(d);
        return foodlDAO.save(f);
	}
	
	public Food getFoodByCode(String code) {
		return foodlDAO.getByCode(code);
	}

	@Override
	public Food edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food update(HttpServletRequest request) {
		
		Food f = new Food();
		f.setCode(request.getParameter("code"));
		f.setType(request.getParameter("type"));
		Double d = Double.valueOf(request.getParameter("price"));
		f.setPrice(d);
		return foodlDAO.update(f);
	}

	@Override
	public List<Food> getAll() {
		
		return foodlDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		Food f = foodlDAO.getByCode(id);
		foodlDAO.delete(f);
		return true;
	}
	
	
}
