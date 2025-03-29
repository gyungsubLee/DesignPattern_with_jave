package _01_creational_patterns._05_prototype._01_before;

public class GithubIssue {
    private int id;
    private String title;
    private GithubRepository respository;

    public GithubIssue(GithubRepository respository) {
        this.respository = respository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRespository() {
        return respository;
    }

    public String getUrl() {
        return String.format(
                "https://github.com/%s/%s/issues/%d",
                respository.getUser(),
                respository.getName(),
                this.getId());
    }
}
