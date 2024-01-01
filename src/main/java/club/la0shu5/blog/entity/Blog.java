package club.la0shu5.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author La0Shu5
 * @since 2023-12-29
 */
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;

    private String firstPicture;

    private String content;

    private String description;

    private Boolean isPublished;

    private Boolean isRecommend;

    private Boolean isAppreciation;

    private Boolean isCommentEnabled;

    private Date createTime;

    private Date updateTime;

    private Integer views;

    private Integer words;

    /**
     * ()
     */
    private Integer readTime;

    private Long categoryId;

    private Boolean isTop;

    private String password;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }
    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }
    public Boolean getIsAppreciation() {
        return isAppreciation;
    }

    public void setIsAppreciation(Boolean isAppreciation) {
        this.isAppreciation = isAppreciation;
    }
    public Boolean getIsCommentEnabled() {
        return isCommentEnabled;
    }

    public void setIsCommentEnabled(Boolean isCommentEnabled) {
        this.isCommentEnabled = isCommentEnabled;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }
    public Integer getWords() {
        return words;
    }

    public void setWords(Integer words) {
        this.words = words;
    }
    public Integer getReadTime() {
        return readTime;
    }

    public void setReadTime(Integer readTime) {
        this.readTime = readTime;
    }
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Blog{" +
            "id=" + id +
            ", title=" + title +
            ", firstPicture=" + firstPicture +
            ", content=" + content +
            ", description=" + description +
            ", isPublished=" + isPublished +
            ", isRecommend=" + isRecommend +
            ", isAppreciation=" + isAppreciation +
            ", isCommentEnabled=" + isCommentEnabled +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", views=" + views +
            ", words=" + words +
            ", readTime=" + readTime +
            ", categoryId=" + categoryId +
            ", isTop=" + isTop +
            ", password=" + password +
            ", userId=" + userId +
        "}";
    }
}
