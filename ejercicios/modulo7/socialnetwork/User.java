package ejercicios.modulo7.socialnetwork;

import java.util.ArrayList;

public class User implements publishable{
    private String name;
    private final ArrayList<String> followers;
    private final ArrayList<String> posts;
    private final ArrayList<TypePost> typesPost;

    public User(String name) {
        this.name = name;
        followers = new ArrayList<>();
        posts = new ArrayList<>();
        typesPost = new ArrayList<>();
    }

    @Override
    public void publish(String post, TypePost typePost) {
        posts.add(post+" "+typePost);
        if (!typesPost.contains(typePost)) {
            typesPost.add(typePost);
        }
    }

    @Override
    public void addFollower(User user) {
        if (followers.contains(user.getName())) {
            throw new UserException("User already exists");
        }
        followers.add(user.getName());
    }

    @Override
    public void removeFollower(User user) {
        if (!followers.contains(user.getName())) {
            throw new UserException("User does not found");
        }
        followers.remove(user.getName());
    }

    @Override
    public void showFollowers() {
        System.out.println(followers);
    }

    @Override
    public void showPosts() {
        System.out.println(posts);
    }

    @Override
    public int countWords(String content) {
    if (content == null || content.isEmpty()) {
        return 0;
    }
    return content.trim().split("\\s+").length;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", followers=" + followers +
                ", posts=" + posts +
                ", typesPost=" + typesPost +
                '}';
    }
}
