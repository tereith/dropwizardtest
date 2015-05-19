

import dao.CityDao;
import dao.CountryDao;
import dao.UserDAO;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;
import resources.HelloWorldResource;
import resources.ShowCityResource;
import resources.ShowCountryResource;
import resources.ShowUsersResource;


public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) {

        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDatabase(), "postgresql");

        final UserDAO dao = jdbi.onDemand(UserDAO.class);
        environment.jersey().register(new ShowUsersResource(dao));

        final CountryDao countryDao = jdbi.onDemand(CountryDao.class);
        environment.jersey().register(new ShowCountryResource(countryDao));

        final CityDao cityDao = jdbi.onDemand(CityDao.class);
        environment.jersey().register(new ShowCityResource(cityDao));

        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }
}