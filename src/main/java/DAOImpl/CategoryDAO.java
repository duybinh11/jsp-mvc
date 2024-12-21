package DAOImpl;

import DAO.GenericDAO;
import DAO.ICategoryDAO;
import Mapper.CategoryMapper;
import Model.CategoryModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {
    @Inject
    private CategoryMapper categoryMapper;
    @Override
    public List<CategoryModel> findAll() {
        String sql = "select * from category";
        return super.query(sql,categoryMapper);
    }
}
