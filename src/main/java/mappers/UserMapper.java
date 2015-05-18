package mappers;

import core.User;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by teithun on 18.05.2015.
 */
public class UserMapper implements ResultSetMapper<User> {

    @Override
    public User map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        User user = new User();
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setDateCreated(resultSet.getDate("date_created"));
        return user;
    }
}
