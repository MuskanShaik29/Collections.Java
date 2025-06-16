import java.util.*;

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return username;
    }
}

public class SocialMediaFollowingSystem {
    public static void main(String[] args) {
        HashSet<User> followers = new HashSet<>();
        TreeSet<User> sortedFollowers = new TreeSet<>(Comparator.comparing(User::getUsername));

       
        User u1 = new User("alice");
        User u2 = new User("bob");
        User u3 = new User("charlie");
        User u4 = new User("david");

        followers.add(u1);
        followers.add(u2);
        followers.add(u3);
        followers.add(u4);

        sortedFollowers.addAll(followers);

        
        System.out.println("Followers (Unordered - HashSet):");
        Iterator<User> hashSetIterator = followers.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }


        System.out.println("\nFollowers (Sorted - TreeSet):");
        Iterator<User> treeSetIterator = sortedFollowers.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }
    }
}
