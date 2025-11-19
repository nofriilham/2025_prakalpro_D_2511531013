package реkan7_2511531013;

public class Akun_2511531013 {

//variable global

private int PinAngka;

private String username, password, email;

//membuat mutator (setter)

public void setPinAngka (int PinAngka) {

this. PinAngka=PinAngka;

} public void setusername (String username) {

this.username=username;

} public void setpassword (String password) {

this.password=password;

}

public void setemail(String email) {
	   this.email=email;

}



//membuat accestor(getter)

public int getPinAngka() {

return PinAngka;

}

public String username() {

return username;

} public String password() {
return password;
public String email() {
return email;
}

//helper method

public boolean isPasswordValid() {


return password.length()>=8;

}

public boolean isEmailValid() {

return email.contains("@")&&email.contains("."); }


}