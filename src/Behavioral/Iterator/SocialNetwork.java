package Behavioral.Iterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(int profileId);
    ProfileIterator createCoworkersIterator(int profileId);
}
