package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Cart;
import com.packt.webstore.domain.repository.CartRepository;
import com.packt.webstore.exception.InvalidCartException;
import com.packt.webstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart create(Cart cart) {
		return cartRepository.create(cart);
	}

	@Override
	public Cart read(String cartId) {
		return cartRepository.read(cartId);
	}

	@Override
	public void update(String cartId, Cart cart) {
		cartRepository.update(cartId, cart);
	}

	@Override
	public void delete(String cartId) {
		cartRepository.delete(cartId);
	}

	@Override
	public Cart validate(String cartId) {
		Cart cart = cartRepository.read(cartId);
		if(cart==null || cart.getCartItems().size()==0) {
			throw new InvalidCartException(cartId);
		}
		return cart;
	}
}