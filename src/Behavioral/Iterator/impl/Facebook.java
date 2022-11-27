package Behavioral.Iterator.impl;

import Behavioral.Iterator.Profile;
import Behavioral.Iterator.ProfileIterator;
import Behavioral.Iterator.SocialNetwork;

public class Facebook implements SocialNetwork {

    public Profile[] socialGraphRequest(int profileId, String type) {
        return null;
        //logic
    }

    @Override
    public ProfileIterator createFriendsIterator(int profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(int profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }
}
