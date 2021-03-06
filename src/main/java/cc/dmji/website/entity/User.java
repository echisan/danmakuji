package cc.dmji.website.entity;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.user_id
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.email
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.pwd
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private String pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.phone
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.nick
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private String nick;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.age
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.sex
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.face
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private String face;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.role
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.email_verified
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private Boolean emailVerified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.phone_verified
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private Boolean phoneVerified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.create_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.modify_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.is_lock
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private Boolean isLock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dm_user.lock_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    private Integer lockTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.user_id
     *
     * @return the value of dm_user.user_id
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.user_id
     *
     * @param userId the value for dm_user.user_id
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.email
     *
     * @return the value of dm_user.email
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.email
     *
     * @param email the value for dm_user.email
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.pwd
     *
     * @return the value of dm_user.pwd
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.pwd
     *
     * @param pwd the value for dm_user.pwd
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.phone
     *
     * @return the value of dm_user.phone
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.phone
     *
     * @param phone the value for dm_user.phone
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.nick
     *
     * @return the value of dm_user.nick
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getNick() {
        return nick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.nick
     *
     * @param nick the value for dm_user.nick
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.age
     *
     * @return the value of dm_user.age
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.age
     *
     * @param age the value for dm_user.age
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.sex
     *
     * @return the value of dm_user.sex
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.sex
     *
     * @param sex the value for dm_user.sex
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.face
     *
     * @return the value of dm_user.face
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getFace() {
        return face;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.face
     *
     * @param face the value for dm_user.face
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.role
     *
     * @return the value of dm_user.role
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.role
     *
     * @param role the value for dm_user.role
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.email_verified
     *
     * @return the value of dm_user.email_verified
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.email_verified
     *
     * @param emailVerified the value for dm_user.email_verified
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.phone_verified
     *
     * @return the value of dm_user.phone_verified
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Boolean getPhoneVerified() {
        return phoneVerified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.phone_verified
     *
     * @param phoneVerified the value for dm_user.phone_verified
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setPhoneVerified(Boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.create_time
     *
     * @return the value of dm_user.create_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.create_time
     *
     * @param createTime the value for dm_user.create_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.modify_time
     *
     * @return the value of dm_user.modify_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.modify_time
     *
     * @param modifyTime the value for dm_user.modify_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.is_lock
     *
     * @return the value of dm_user.is_lock
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Boolean getIsLock() {
        return isLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.is_lock
     *
     * @param isLock the value for dm_user.is_lock
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dm_user.lock_time
     *
     * @return the value of dm_user.lock_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public Integer getLockTime() {
        return lockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dm_user.lock_time
     *
     * @param lockTime the value for dm_user.lock_time
     *
     * @mbg.generated Tue May 08 23:01:05 CST 2018
     */
    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }
}