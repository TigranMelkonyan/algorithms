package com.tigran.test_tasks.other.amortized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Tigran Melkonyan
 * Date: 8/18/25
 * Time: 6:25 PM
 */
public class UserManager {
    private final Random random = new Random();
    private final List<String> usersList = new ArrayList<>();
    private final Map<String, Integer> userToIndexMap = new HashMap<>();

    public void login(String username) {
        if (!userToIndexMap.containsKey(username)) {
            usersList.add(username);
            userToIndexMap.put(username, usersList.size() - 1);
        }
    }

    public void logout(String username) {
        if (userToIndexMap.containsKey(username)) {
            int indexToRemove = userToIndexMap.get(username);
            int lastIndex = usersList.size() - 1;
            String lastUser = usersList.get(lastIndex);

            // Swap the last user with the one we want to remove
            usersList.set(indexToRemove, lastUser);
            userToIndexMap.put(lastUser, indexToRemove);

            // Remove last element
            usersList.remove(lastIndex);
            userToIndexMap.remove(username);
        }
    }

    public String getRandomLoggedInUser() {
        if (usersList.isEmpty()) return null;
        int rIndex = random.nextInt(usersList.size());
        return usersList.get(rIndex);
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.login("alice");
        userManager.login("bob");
        userManager.login("carol");
        userManager.login("dave");

        System.out.println("Random logged-in user: " + userManager.getRandomLoggedInUser());

        userManager.logout("carol");
        System.out.println("After logging out 'carol':");

        System.out.println("Random logged-in user: " + userManager.getRandomLoggedInUser());

        userManager.login("alice"); // Shouldn't duplicate

        userManager.logout("alice");
        userManager.logout("bob");
        userManager.logout("dave");

        System.out.println("All users logged out. Random user: " + userManager.getRandomLoggedInUser());
    }
}
