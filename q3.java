package org.koud.example;

public class q3 {

    public static void main (String[] args) {
//as i understand the question is theory answer so i write it here..
        System.out.println("can we use the privet constroctor which is in side the class? who we use it and whats the binfit?"+
                "Some reasons where you may need private constructor:\n" +
                "\n" +
                "The constructor can only be accessed from static factory method inside the class itself. " +
                "Singleton can also belong to this category.\n" +
                "A utility class, that only contains static methods.");

        }
    }

/*public class User {

    private final String name;
    private final String email;
    private final String country;

    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }*/

