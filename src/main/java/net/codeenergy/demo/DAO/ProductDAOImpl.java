package net.codeenergy.demo.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.codeenergy.demo.DTO.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
        @Autowired
	SessionFactory sessionFactory;

	@Override
	public Product getProduct(Integer id) {
		// TODO Auto-generated method stub
		Product product = (Product) sessionFactory.getCurrentSession().get(Product.class,id);
		return product;
	}
}
