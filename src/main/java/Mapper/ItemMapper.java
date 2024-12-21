package Mapper;

import Model.ItemModel;

import javax.enterprise.context.ApplicationScoped;
import java.sql.ResultSet;
import java.sql.SQLException;


@ApplicationScoped
public class ItemMapper implements RowMapper<ItemModel>{
    @Override
    public ItemModel mapRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int price = rs.getInt("price");
        return new ItemModel(id, name, price);
    }
}
