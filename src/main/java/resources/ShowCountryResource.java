package resources;

import com.codahale.metrics.annotation.Timed;
import core.Country;
import dao.CountryDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

/**
 * Created by teithun on 19.05.2015.
 */
@Path("/countries")
@Produces(MediaType.APPLICATION_JSON)
public class ShowCountryResource {

    private CountryDao countryDao;

    public ShowCountryResource(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @GET
    @Timed
    public Set<Country> listAllCountries() {
        return countryDao.listAllCountries();
    }
}