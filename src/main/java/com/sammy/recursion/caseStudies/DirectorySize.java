package com.sammy.recursion.caseStudies;

import java.io.File;
import java.util.Scanner;

import static java.util.Objects.requireNonNull;

public class DirectorySize {
    private static long retrieveSize(File file){
        long totalDirectorySize = 0;
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(int index = 0; index < requireNonNull(files).length; index++){
                totalDirectorySize += retrieveSize(files[index]);
            }
        }else{
            totalDirectorySize += file.length();
        }

        return totalDirectorySize;
    }

    public static void main(String[] args) {
        System.out.print("Enter a directory or a file: ");
        Scanner userInput = new Scanner(System.in);
        String directory = userInput.nextLine();

        System.out.println(retrieveSize(new File(directory)) + "bytes");
    }
}
