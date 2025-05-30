package com.tigran.test_tasks.other;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 5/30/25
 * Time: 4:49 PM
 */
public class ValidDirectoryTreeCheck {
    public static void main(String[] args) {
        List<String> list = List.of(
                "a/",
                "a/b/",
                "a/b/file.txt",
                "a/b/c/",
                "a/b/c/file2.txt"
        );
        System.out.println(isValidDirectory(list));
        list = List.of(
                "a/b/file.txt",
                "a/b/c/file2.txt");
        System.out.println(isValidDirectory(list));
    }

    public static boolean isValidDirectory(List<String> paths) {
        if (paths == null || paths.isEmpty()) return false;

        Set<String> pathSet = new HashSet<>();

        for (String path : paths) {
            if (path.endsWith("/")) {
                pathSet.add(path);
            }
        }

        for (String path : paths) {
            if (!path.endsWith("/")) {
                String[] split = path.split("/");
                StringBuilder current = new StringBuilder();

                for (int i = 0; i < split.length - 1; i++) {
                    current.append(split[i]).append("/");
                    if (!pathSet.contains(current.toString())) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
