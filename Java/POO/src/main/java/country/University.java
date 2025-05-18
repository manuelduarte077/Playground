package country;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class University {
    private String country;
    private List<String> domains;
    @JsonProperty("alpha_two_code")
    private String alphaTwoCode;
    @JsonProperty("state-province")
    private String stateProvince;
    @JsonProperty("web_pages")
    private List<String> webPages;
    private String name;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public List<String> getWebPages() {
        return webPages;
    }

    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString para una representación legible
    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", stateProvince='" + (stateProvince != null ? stateProvince : "N/A") + '\'' +
                ", domains=" + domains +
                ", webPages=" + webPages +
                ", alphaTwoCode='" + alphaTwoCode + '\'' +
                '}';
    }
}
