package model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Api {

    @JsonProperty("people")
    private String people;
    @JsonProperty("planets")
    private String planets;
    @JsonProperty("films")
    private String films;
    @JsonProperty("species")
    private String species;
    @JsonProperty("vehicles")
    private String vehicles;
    @JsonProperty("starships")
    private String starships;

    public Api(){}

    public Api(String people, String planets, String films, String species, String vehicles, String starships) {
        this.people = people;
        this.planets = planets;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
    }

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("people")
    public String getPeople() {
        return people;
    }

    @JsonProperty("people")
    public void setPeople(String people) {
        this.people = people;
    }

    @JsonProperty("planets")
    public String getPlanets() {
        return planets;
    }

    @JsonProperty("planets")
    public void setPlanets(String planets) {
        this.planets = planets;
    }

    @JsonProperty("films")
    public String getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(String films) {
        this.films = films;
    }

    @JsonProperty("species")
    public String getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(String species) {
        this.species = species;
    }

    @JsonProperty("vehicles")
    public String getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(String vehicles) {
        this.vehicles = vehicles;
    }

    @JsonProperty("starships")
    public String getStarships() {
        return starships;
    }

    @JsonProperty("starships")
    public void setStarships(String starships) {
        this.starships = starships;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Api api = (Api) o;

        if (getPeople() != null ? !getPeople().equals(api.getPeople()) : api.getPeople() != null) return false;
        if (getPlanets() != null ? !getPlanets().equals(api.getPlanets()) : api.getPlanets() != null) return false;
        if (getFilms() != null ? !getFilms().equals(api.getFilms()) : api.getFilms() != null) return false;
        if (getSpecies() != null ? !getSpecies().equals(api.getSpecies()) : api.getSpecies() != null) return false;
        if (getVehicles() != null ? !getVehicles().equals(api.getVehicles()) : api.getVehicles() != null) return false;
        if (getStarships() != null ? !getStarships().equals(api.getStarships()) : api.getStarships() != null)
            return false;
        return getAdditionalProperties() != null ? getAdditionalProperties().equals(api.getAdditionalProperties()) : api.getAdditionalProperties() == null;
    }

    @Override
    public int hashCode() {
        int result = getPeople() != null ? getPeople().hashCode() : 0;
        result = 31 * result + (getPlanets() != null ? getPlanets().hashCode() : 0);
        result = 31 * result + (getFilms() != null ? getFilms().hashCode() : 0);
        result = 31 * result + (getSpecies() != null ? getSpecies().hashCode() : 0);
        result = 31 * result + (getVehicles() != null ? getVehicles().hashCode() : 0);
        result = 31 * result + (getStarships() != null ? getStarships().hashCode() : 0);
        result = 31 * result + (getAdditionalProperties() != null ? getAdditionalProperties().hashCode() : 0);
        return result;
    }

    public static class ApiBuilder {
        private String people;
        private String planets;
        private String films;
        private String species;
        private String vehicles;
        private String starships;

        public ApiBuilder setPeople(String people) {
            this.people = people;
            return this;
        }

        public ApiBuilder setPlanets(String planets) {
            this.planets = planets;
            return this;
        }

        public ApiBuilder setFilms(String films) {
            this.films = films;
            return this;
        }

        public ApiBuilder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public ApiBuilder setVehicles(String vehicles) {
            this.vehicles = vehicles;
            return this;
        }

        public ApiBuilder setStarships(String starships) {
            this.starships = starships;
            return this;
        }

        public Api createApi() {
            return new Api(people, planets, films, species, vehicles, starships);
        }
    }
}


