package com.tigran.test_tasks.other;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 5/14/25
 * Time: 3:33 PM
 */
//You’re given a list of file and folder paths as strings. Your task is to validate that the structure is 
// logically consistent — that is, no file or folder appears before its parent directory.
//   valid
//[
//  "root/",
//  "root/a/",
//  "root/a/b.txt"
//]
//    invalid
// [
//  "root/a/",
//  "root/a/b.txt"
//]
//// missing "root/"    

public class DirectoryStructureValidator {
    public static void main(String[] args) {
        List<String> input = List.of(
                "root/f",
                "root/a/",
                "root/a/b.txt");
        System.out.println(isValidStructure(input));
        input = List.of(
                "root/a/",
                "root/a/b.txt");

        System.out.println(isValidStructure(input));
    }

    public static boolean isValidStructure(List<String> paths) {
        if (paths == null || paths.isEmpty()) return true;

        Set<String> pathSet = new HashSet<>(paths);

        for (String path : paths) {
            // Remove trailing slash if it's a directory to split properly
            String cleanPath = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            String[] parts = cleanPath.split("/");

            StringBuilder current = new StringBuilder();

            for (int i = 0; i < parts.length - 1; i++) {
                current.append(parts[i]).append("/");
                String parent = current.toString();
                if (!pathSet.contains(parent)) {
                    return false;
                }
            }
        }

        return true;
    }

}
