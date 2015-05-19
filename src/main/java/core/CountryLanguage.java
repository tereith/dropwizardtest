package core;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;

/**
 * Created by teithun on 19.05.2015.
 */
public class CountryLanguage {


    @JsonProperty
    @NotEmpty
    @Max(3)
    private String countrycode;


    @JsonProperty
    @NotEmpty
    private String language;


    @JsonProperty
    @NotEmpty
    private boolean isofficial;

    @JsonProperty
    @NotEmpty
    private double precentage;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isofficial() {
        return isofficial;
    }

    public void setIsofficial(boolean isofficial) {
        this.isofficial = isofficial;
    }

    public double getPrecentage() {
        return precentage;
    }

    public void setPrecentage(double precentage) {
        this.precentage = precentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryLanguage that = (CountryLanguage) o;

        if (isofficial != that.isofficial) return false;
        if (Double.compare(that.precentage, precentage) != 0) return false;
        if (countrycode != null ? !countrycode.equals(that.countrycode) : that.countrycode != null) return false;
        return !(language != null ? !language.equals(that.language) : that.language != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = countrycode != null ? countrycode.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (isofficial ? 1 : 0);
        temp = Double.doubleToLongBits(precentage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "countrycode='" + countrycode + '\'' +
                ", language='" + language + '\'' +
                ", isofficial=" + isofficial +
                ", precentage=" + precentage +
                '}';
    }
}
