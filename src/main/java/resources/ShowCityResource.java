package resources;

import com.codahale.metrics.annotation.Timed;
import core.City;
import dao.CityDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

/**
 * Created by teithun on 19.05.2015.
 */
@Path("/cities")
@Produces(MediaType.APPLICATION_JSON)
public class ShowCityResource {

    private CityDao cityDao;

    public ShowCityResource(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @GET
    @Timed
    public Set<City> listAllCities() {
        return cityDao.listAllCities();
    }
}