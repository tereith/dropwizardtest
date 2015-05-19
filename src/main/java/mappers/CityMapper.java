package mappers;

import core.City;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by teithun on 19.05.2015.
 */
public class CityMapper implements ResultSetMapper<City> {
    @Override
    public City map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        City city = new City();
        city.setId(resultSet.getInt("id"));
        city.setName(resultSet.getString("name"));
        city.setCountrycode(resultSet.getString("countrycode"));
        city.setDistrict(resultSet.getString("district"));
        city.setPopulation(resultSet.getInt("population"));
        return city;
    }
}
