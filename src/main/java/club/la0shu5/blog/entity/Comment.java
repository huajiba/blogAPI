package club.la0shu5.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author La0Shu5
 * @since 2023-12-29
 */
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String nickname;

    private String email;

    private String content;

    /**
     * ()
     */
    private String avatar;

    private LocalDateTime createTime;

    /**
     * ip
     */
    private String ip;

    private Boolean isPublished;

    private Boolean isAdminComment;

    /**
     * 012
     */
    private Integer page;

    private Boolean isNotice;

    private Long blogId;

    /**
     * id-1
     */
    private Long parentCommentId;

    private String website;

    /**
     * QQQQQQQQ
     */
    private String qq;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }
    public Boolean getIsAdminComment() {
        return isAdminComment;
    }

    public void setIsAdminComment(Boolean isAdminComment) {
        this.isAdminComment = isAdminComment;
    }
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
    public Boolean getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(Boolean isNotice) {
        this.isNotice = isNotice;
    }
    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }
    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        return "Comment{" +
            "id=" + id +
            ", nickname=" + nickname +
            ", email=" + email +
            ", content=" + content +
            ", avatar=" + avatar +
            ", createTime=" + createTime +
            ", ip=" + ip +
            ", isPublished=" + isPublished +
            ", isAdminComment=" + isAdminComment +
            ", page=" + page +
            ", isNotice=" + isNotice +
            ", blogId=" + blogId +
            ", parentCommentId=" + parentCommentId +
            ", website=" + website +
            ", qq=" + qq +
        "}";
    }
}
