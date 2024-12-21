package ServiceImpl;

import DAOImpl.CategoryDAO;
import Model.CategoryModel;
import Service.ICategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryService implements ICategoryService {
    @Inject
    private CategoryDAO categoryDAO;
    @Override
    public List<CategoryModel> findAll() {
        return categoryDAO.findAll();
    }
}
