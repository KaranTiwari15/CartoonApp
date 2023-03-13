package com.cartoon.demo.dao.doaImp;

import java.util.*;

import com.cartoon.demo.dao.CartoonDAO;
import org.springframework.stereotype.Repository;

import com.cartoon.demo.model.Cartoon;
@Repository
public class CartoonDAOImpl implements CartoonDAO {

    List<Cartoon> cartoons = new ArrayList<>();


    public int addCartoon(Cartoon emp) {
        cartoons.add(emp);
        return 1;
    }


    public List<Cartoon> getAllCartoon() {
        return cartoons;
    }


    public Cartoon getCartoon(int id) {
        for (Cartoon emp: cartoons) {
            if(emp.getCarId() == id)
                return emp;
        }
        return null;
    }


    public int deleteCartoon(int id) {

        Cartoon carTODelete = null;

        for(Cartoon car : cartoons)
        {
            if(car.getCarId() == id)
                carTODelete = car;
        }

        if(carTODelete !=null)
        {
            cartoons.remove(carTODelete);
            return  1;
        }
        else
        {
            return 0;
        }
    }


}
