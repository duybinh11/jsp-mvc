package ServiceImpl;

import DAO.IItemDAO;
import Model.ItemModel;
import Service.IItemService;

import javax.inject.Inject;
import java.util.List;

public class ItemService  implements IItemService {

    @Inject
    private IItemDAO itemDAO;

    @Override
    public List<ItemModel> findAll() {
        return itemDAO.findAll();
    }

    @Override
    public List<ItemModel> findByCategoryId(int categoryId) {
        return itemDAO.findByCategoryId(categoryId);
    }
}
