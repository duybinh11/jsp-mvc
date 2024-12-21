package DAOImpl;

import DAO.GenericDAO;
import DB.Database;
import Mapper.RowMapper;

import java.net.BindException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AbstractDAO<T> implements GenericDAO<T> {

    @Override
    public void update(String sql, Objects... params) {

    }

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... params) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<T> resultList = new ArrayList<>();

        connection = Database.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            setParameter(preparedStatement, params);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                resultList.add(rowMapper.mapRow(resultSet));
            }
            return resultList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void setParameter(PreparedStatement statement,  Object... parameter) throws SQLException {
        int index = 1;
        for (int i = 0; i < parameter.length; i++) {
            Object value = parameter[i];
            if (value instanceof Long) {
                statement.setLong(index, (Long) value);
            } else if (value instanceof String) {
                statement.setString(index, (String) value);
            } else if (value instanceof Integer) {
                statement.setInt(index, (Integer) value);
            } else if (value instanceof Timestamp) {
                statement.setTimestamp(index, (Timestamp) value);
            }
            index++;
        }
    }



}
