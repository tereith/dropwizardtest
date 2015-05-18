package dao;

import core.User;
import mappers.UserMapper;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.Set;

/**
 * Created by teithun on 18.05.2015.
 */
@RegisterMapper(UserMapper.class)
public interface UserDAO {

/*    @SqlUpdate("insert into something (id, name) values (:id, :name)")
    void insert(@Bind("id") int id, @Bind("name") String name);

    @SqlQuery("select name from something where id = :id")
    String findNameById(@Bind("id") int id); */

    @SqlQuery("select * from users")
    String findAllUsers();

    @SqlQuery("select email, password, date_created from users")
    Set<User> list();
}