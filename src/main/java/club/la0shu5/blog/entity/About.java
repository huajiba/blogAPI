package club.la0shu5.blog.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author La0Shu5
 * @since 2023-12-29
 */
public class About implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nameEn;

    private String nameZh;

    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "About{" +
            "id=" + id +
            ", nameEn=" + nameEn +
            ", nameZh=" + nameZh +
            ", value=" + value +
        "}";
    }
}
