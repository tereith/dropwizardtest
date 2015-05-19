package core;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;

/**
 * Created by teithun on 19.05.2015.
 */
public class Country {

    @JsonProperty
    @NotEmpty
    @Max(3)
    private String code;

    @JsonProperty
    @NotEmpty
    private String name;

    @JsonProperty
    @NotEmpty
    private String continent;

    @JsonProperty
    @NotEmpty
    private String region;

    @JsonProperty
    @NotEmpty
    private double surfacearea;

    @JsonProperty
    private int indepyear;

    @JsonProperty
    @NotEmpty
    private int population;

    @JsonProperty
    private double lifeexpectancy;

    @JsonProperty
    private int gnp;

    @JsonProperty
    private int gnpold;

    @JsonProperty
    @NotEmpty
    private String localname;

    @JsonProperty
    @NotEmpty
    private String governmentform;

    @JsonProperty
    private String headofstate;

    @JsonProperty
    private int capital;

    @JsonProperty
    @NotEmpty
    @Max(2)
    private String code2;

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSurfacearea() {
        return surfacearea;
    }

    public void setSurfacearea(double surfacearea) {
        this.surfacearea = surfacearea;
    }

    public int getIndepyear() {
        return indepyear;
    }

    public void setIndepyear(int indepyear) {
        this.indepyear = indepyear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLifeexpectancy() {
        return lifeexpectancy;
    }

    public void setLifeexpectancy(double lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    public int getGnp() {
        return gnp;
    }

    public void setGnp(int gnp) {
        this.gnp = gnp;
    }

    public int getGnpold() {
        return gnpold;
    }

    public void setGnpold(int gnpold) {
        this.gnpold = gnpold;
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    public String getGovernmentform() {
        return governmentform;
    }

    public void setGovernmentform(String governmentform) {
        this.governmentform = governmentform;
    }

    public String getHeadofstate() {
        return headofstate;
    }

    public void setHeadofstate(String headofstate) {
        this.headofstate = headofstate;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (Double.compare(country.surfacearea, surfacearea) != 0) return false;
        if (indepyear != country.indepyear) return false;
        if (population != country.population) return false;
        if (Double.compare(country.lifeexpectancy, lifeexpectancy) != 0) return false;
        if (gnp != country.gnp) return false;
        if (gnpold != country.gnpold) return false;
        if (capital != country.capital) return false;
        if (code != null ? !code.equals(country.code) : country.code != null) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (continent != null ? !continent.equals(country.continent) : country.continent != null) return false;
        if (region != null ? !region.equals(country.region) : country.region != null) return false;
        if (localname != null ? !localname.equals(country.localname) : country.localname != null) return false;
        if (governmentform != null ? !governmentform.equals(country.governmentform) : country.governmentform != null)
            return false;
        if (headofstate != null ? !headofstate.equals(country.headofstate) : country.headofstate != null) return false;
        return !(code2 != null ? !code2.equals(country.code2) : country.code2 != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (continent != null ? continent.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        temp = Double.doubleToLongBits(surfacearea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + indepyear;
        result = 31 * result + population;
        temp = Double.doubleToLongBits(lifeexpectancy);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + gnp;
        result = 31 * result + gnpold;
        result = 31 * result + (localname != null ? localname.hashCode() : 0);
        result = 31 * result + (governmentform != null ? governmentform.hashCode() : 0);
        result = 31 * result + (headofstate != null ? headofstate.hashCode() : 0);
        result = 31 * result + capital;
        result = 31 * result + (code2 != null ? code2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfacearea='" + surfacearea + '\'' +
                ", indepyear=" + indepyear +
                ", population=" + population +
                ", lifeexpectancy=" + lifeexpectancy +
                ", gnp=" + gnp +
                ", gnpold=" + gnpold +
                ", localname='" + localname + '\'' +
                ", governmentform='" + governmentform + '\'' +
                ", headofstate='" + headofstate + '\'' +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                '}';
    }
}
