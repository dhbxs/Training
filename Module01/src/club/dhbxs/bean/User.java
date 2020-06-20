package club.dhbxs.bean;

/**
 * @ClassName User
 * @Description
 * @Author 17235
 * @Date 2020/6/17 上午 11:19
 * @Version 1.0
 **/
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userPosition;
    private String userEmail;
    private String userLevel;

    public User() {
    }

    public User(Integer userId, String userName, String userPassword, String userPosition, String userEmail, String userLevel) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPosition = userPosition;
        this.userEmail = userEmail;
        this.userLevel = userLevel;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPosition='" + userPosition + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userLevel='" + userLevel + '\'' +
                '}';
    }
}
