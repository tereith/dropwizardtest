package mappers;

import core.Country;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by teithun on 19.05.2015.
 */
public class CountryMapper implements ResultSetMapper<Country> {
    @Override
    public Country map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        Country country = new Country();
        country.setCode(resultSet.getString("code"));
        country.setName(resultSet.getString("name"));
        country.setContinent(resultSet.getString("continent"));
        country.setRegion(resultSet.getString("region"));
        country.setSurfacearea(resultSet.getDouble("surfacearea"));
        country.setIndepyear(resultSet.getInt("indepyear"));
        country.setPopulation(resultSet.getInt("population"));
        country.setLifeexpectancy(resultSet.getDouble("lifeexpectancy"));
        country.setGnp(resultSet.getInt("gnp"));
        country.setGnpold(resultSet.getInt("gnpold"));
        country.setLocalname(resultSet.getString("localname"));
        country.setGovernmentform(resultSet.getString("governmentform"));
        country.setHeadofstate(resultSet.getString("headofstate"));
        country.setCapital(resultSet.getInt("capital"));

        country.setCode2(resultSet.getString("code2"));
        return country;
    }
}