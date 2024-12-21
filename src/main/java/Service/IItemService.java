package Service;

import DAO.GenericDAO;
import Model.ItemModel;

import java.util.List;

public interface IItemService  {
    List<ItemModel> findAll();
    List<ItemModel> findByCategoryId(int categoryId);
}
