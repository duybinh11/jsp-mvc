package DAO;

import Mapper.RowMapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public interface GenericDAO<T> {
    void update(String sql, Objects... params) ;
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... params);
}
