package DAO;

import Model.CategoryModel;

import java.util.List;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
    List<CategoryModel> findAll();
}
