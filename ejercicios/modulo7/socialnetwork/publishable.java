package ejercicios.modulo7.socialnetwork;

public interface publishable {
    void publish(String post, TypePost typePost);
    void addFollower(User user);
    void removeFollower(User user);
    void showFollowers();
    void showPosts();
    int countWords(String Content);
}
