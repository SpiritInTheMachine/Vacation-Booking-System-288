package com.example.demo.services;

import com.example.demo.dao.CartsRepository;
import com.example.demo.dao.CustomersRepository;
import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import com.example.demo.entities.Customer;
import com.example.demo.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomersRepository customersRepository;

    private CartsRepository cartsRepository;

    @Autowired
    public CheckoutServiceImpl(CustomersRepository customersRepository, CartsRepository cartsRepository) {
        this.cartsRepository = cartsRepository;
        this.customersRepository = customersRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        //retrieval of order Info
        Cart cart = purchase.getCart();
        Customer customer = purchase.getCustomer();
        Set<CartItem> cartItems = purchase.getCartItems();
        String orderTrackingNumber = generateOrderTrackingNumber();

        cartItems.forEach(item -> {
            item.setCart(cart);
            cart.add(item);
        });

        cart.setId(null);
        cart.setOrderTrackingNumber(orderTrackingNumber);
        cart.setStatus(StatusType.ordered);
        customer.add(cart);

        cartsRepository.save(cart);
        customersRepository.save(customer);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        //unique id salted(UUID ver-4)

        return UUID.randomUUID().toString();

    }
}
