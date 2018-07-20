package pojo.annotataion;

/**
 * @author cqx
 * @date 2018/7/20 17:44
 */
public class PassWordUtils {
    @UserCase.UserCases(id="47",description = "Passwords must contain at one numric")
    public Boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UserCase.UserCases(id="48")
    public String encrptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }
}
