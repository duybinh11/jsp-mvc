package Mapper;

import Model.CategoryModel;

import javax.enterprise.context.ApplicationScoped;
import java.sql.ResultSet;
import java.sql.SQLException;

@ApplicationScoped
public class CategoryMapper implements RowMapper<CategoryModel> {
    @Override
    public CategoryModel mapRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        return new CategoryModel(id, name);
    }
}
