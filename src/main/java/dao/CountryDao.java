package dao;

import core.Country;
import mappers.CountryMapper;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.Set;

/**
 * Created by teithun on 19.05.2015.
 */
@RegisterMapper(CountryMapper.class)
public interface CountryDao {

    @SqlQuery("select * from country")
    Set<Country> listAllCountries();
}
