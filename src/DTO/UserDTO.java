package DTO;

import DAL.Connection1;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UserDTO {

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * @param userAccount the userAccount to set
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userGmail
     */
    public String getUserGmail() {
        return userGmail;
    }

    /**
     * @param userGmail the userGmail to set
     */
    public void setUserGmail(String userGmail) {
        this.userGmail = userGmail;
    }

    /**
     * @return the userPhoneNumber
     */
    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    /**
     * @param userPhoneNumber the userPhoneNumber to set
     */
    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public UserDTO() {
    }

    public UserDTO(int userId, String userAccount, String userPassword, String userName, String userGmail, String userPhoneNumber) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userGmail = userGmail;
        this.userPhoneNumber = userPhoneNumber;
    }

    @Override
    public String toString() {

        return "ID: " + userId + ", Account: " + userAccount + ", Name: " + userName + ", Password: " + userPassword + ", Gmail: " + userGmail + ", PhoneNumber: " + userPhoneNumber;

    }
    private int userId;
    private String userAccount;
    private String userPassword;
    private String userName;
    private String userGmail;
    private String userPhoneNumber;
}
