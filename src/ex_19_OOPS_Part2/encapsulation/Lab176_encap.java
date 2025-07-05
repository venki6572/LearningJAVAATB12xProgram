package ex_19_OOPS_Part2.encapsulation;

public class Lab176_encap {
    public static void main(String[] args){
//        VMOLogin vmoLogin = new VMOLogin("Admin","password");
//        System.out.println(vmoLogin.password);
//        System.out.println(vmoLogin.username);

        GoodVMOLogin  goodVMOLogin = new GoodVMOLogin("Admin","password");

        goodVMOLogin.getPassword();
        goodVMOLogin.getUsername();

//        goodVMOLogin.setPassword();
        goodVMOLogin.setUsername("pramod");

        System.out.println(goodVMOLogin.getUsername());
        System.out.println(goodVMOLogin.getPassword());

        goodVMOLogin.setPassword("Ram@123",false);

        System.out.println(goodVMOLogin.getPassword());

        goodVMOLogin.setPassword("Ram@123",true);
        System.out.println(goodVMOLogin.getPassword());

    }
}

class VMOLogin {

    public String username;
    public String password;

    public VMOLogin(String username,String password){
        this.username = username;
        this.password = password;
    }

}

//good example for encapsulation
class GoodVMOLogin {

    //in encapsulation variables are private
    public String username;
    private String password;

    public GoodVMOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not Allowed, Not a admin");
        }
    }
}