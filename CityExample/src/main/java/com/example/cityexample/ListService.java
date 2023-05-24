package com.example.cityexample;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ListService implements ISlistService{

    @Autowired
    private ShoppingListRepository repository;

    @Override
    public List<ShoppingList> findAll() {

        var list = (List<ShoppingList>) repository.findAll();

        return list;

    }
}
