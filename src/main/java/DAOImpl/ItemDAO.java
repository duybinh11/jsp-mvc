package DAOImpl;

import DAO.IItemDAO;
import DB.Database;
import Mapper.ItemMapper;
import Model.ItemModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class ItemDAO extends AbstractDAO<ItemModel> implements IItemDAO {

    @Inject
    private ItemMapper itemMapper;
    @Override
    public List<ItemModel> findByCategoryId(int categoryId) {
        String sql = "select * from item where idCategory = ?";
        super.query(sql,itemMapper,categoryId);
        return null;
    }


    @Override
    public List<ItemModel> findAll() {
        String sql = "select * from item";
        return super.query(sql,itemMapper);
    }
}
