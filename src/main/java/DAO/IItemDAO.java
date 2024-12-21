package DAO;

import Model.ItemModel;

import java.util.List;

public interface IItemDAO extends  GenericDAO<ItemModel>{
    List<ItemModel> findByCategoryId(int categoryId);
    List<ItemModel> findAll();

}
