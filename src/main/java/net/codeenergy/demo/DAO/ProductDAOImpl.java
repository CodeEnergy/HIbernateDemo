package net.codeenergy.demo.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.codeenergy.demo.DTO.Product;

public class ProductDAOImpl implements ProductDAO {
	
	SessionFactory sessionFactory;
	
	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public ProductDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Product getProduct(Integer id) {
		// TODO Auto-generated method stub
		Product product = (Product) sessionFactory.getCurrentSession().get(Product.class,id);
		return product;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
