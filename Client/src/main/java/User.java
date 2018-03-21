public class User {

    private String id;
    private String name;
    private String github;

    public User() {}

    public User(String id, String name, String github) {
        this.id = id;
        this.name = name;
        this.github = github;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

}
