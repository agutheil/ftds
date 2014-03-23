package de.agutheil.ftds.example.beanwiring;

public class ScopedCartService implements CartService {

	private Cart cart;
	@Override
	public Cart createCart() {
		System.out.println("Calling Scoped Proxy Method");
		return getCart();
	}

	@Override
	public Cart saveCart(Cart cart) {
		System.out.println("Saving cart ...");
		return cart;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
