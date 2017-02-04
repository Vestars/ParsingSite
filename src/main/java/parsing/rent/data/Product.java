package parsing.rent.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    @JsonProperty("title")
    private String title;

    @JsonProperty("img")
    private String defaultImage;

    @JsonProperty("price")
    private BigDecimal rate1hr;

    public Product(){}

    public Product(String title, String defaultImage, BigDecimal rate1hr) {
        this.title = title;
        this.defaultImage = defaultImage;
        this.rate1hr = rate1hr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDefaultImage() {
        return defaultImage;
    }

    public void setDefaultImage(String defaultImage) {
        this.defaultImage = defaultImage;
    }

    public BigDecimal getRate1hr() {
        return rate1hr;
    }

    public void setRate1hr(BigDecimal rate1hr) {
        this.rate1hr = rate1hr;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("title='").append(title).append('\'');
        sb.append(", defaultImage='").append(defaultImage).append('\'');
        sb.append(", rate1hr=").append(rate1hr);
        sb.append('}');
        return sb.toString();
    }
}
