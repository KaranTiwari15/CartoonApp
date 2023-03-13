package com.cartoon.demo.dao;

import com.cartoon.demo.model.Cartoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface CartoonDAO{


@Autowired
    int addCartoon(Cartoon emp);

    List<Cartoon> getAllCartoon();

    Cartoon getCartoon(int id);

    int deleteCartoon(int id);

}
