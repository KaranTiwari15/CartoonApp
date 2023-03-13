package com.cartoon.demo.service;

import java.util.*;

import com.cartoon.demo.dao.CartoonDAO;
import com.cartoon.demo.model.Cartoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CartoonService implements CartoonDAO {

    @Autowired
    private CartoonDAO cartoonDAO;

    public int addCartoon(Cartoon emp)
    {
       return cartoonDAO.addCartoon(emp);
    }

    public List<Cartoon> getAllCartoon()
    {
        return cartoonDAO.getAllCartoon();
    }

    public Cartoon getCartoon(int id)
    {
        return cartoonDAO.getCartoon(id);
    }

    public int deleteCartoon(int id)
    {
        return cartoonDAO.deleteCartoon(id);
    }
}
