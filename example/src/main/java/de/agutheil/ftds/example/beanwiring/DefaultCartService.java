package de.agutheil.ftds.example.beanwiring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DefaultCartService implements CartService, ApplicationContextAware {

	private ApplicationContext context;
	
	@Override
	public Cart createCart() {
		return context.getBean("cart", Cart.class);
	}

	@Override
	public Cart saveCart(Cart cart) {
		System.out.println("Saving cart ...");
		return cart;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;
	}

}
