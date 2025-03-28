package _02_structural_patterns._06_adapter._02_after.security;

public class LoginHandler {

    private final UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService)  {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
