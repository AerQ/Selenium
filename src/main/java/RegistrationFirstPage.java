import java.util.Date;
import java.util.Random;

public class RegistrationFirstPage {
    private String customerName;
    private String email;
    private String password;

    public RegistrationFirstPage(String customerName, String email, String password) {
        this.customerName = customerName;
        this.email = email;
        this.password = password;
    }

    public RegistrationFirstPage() {
        customerName = getCustomerName(6);
        email = getEmail();
        password = getPassword(1, 9999);
    }

    public String getCustomerName(int length) {

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String ran = sb.toString();
        return ran;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return getCustomerName(7) + ".aerq" + (new Date().getTime()) + "@gmail.com";
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(int min, int max) {
        Random random = new Random();
        return String.valueOf(random.ints(min, (max + 1)).findFirst().getAsInt()) + "aerQ";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("customerName=").append(customerName).append("\n");
        sb.append("email=").append(email).append("\n");
        sb.append("password=").append(password);
        return sb.toString();
    }
}
