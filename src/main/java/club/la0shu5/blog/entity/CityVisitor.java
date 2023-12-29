package club.la0shu5.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author La0Shu5
 * @since 2023-12-29
 */
@TableName("city_visitor")
public class CityVisitor implements Serializable {

    private static final long serialVersionUID = 1L;

    private String city;

    private Integer uv;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return "CityVisitor{" +
            "city=" + city +
            ", uv=" + uv +
        "}";
    }
}
