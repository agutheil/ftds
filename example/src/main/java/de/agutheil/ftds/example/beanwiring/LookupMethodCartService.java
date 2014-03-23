package de.agutheil.ftds.example.beanwiring;

public abstract class LookupMethodCartService implements CartService {

	@Override
	public Cart saveCart(Cart cart) {
		System.out.println("Saving cart ...");
		return cart;
	}

}
