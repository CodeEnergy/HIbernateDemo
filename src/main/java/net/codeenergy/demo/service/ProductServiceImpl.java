package net.codeenergy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codeenergy.demo.DAO.ProductDAO;
import net.codeenergy.demo.DTO.Product;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO dao;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
        @Transactional
	public Product getProduct(Integer id) {
		// TODO Auto-generated method stub
		return dao.getProduct(id);
	}

}
