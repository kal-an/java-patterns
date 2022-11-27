package Behavioral.Iterator;

import Behavioral.Iterator.impl.Facebook;

public class Application {

    private SocialNetwork network;
    private SocialSpammer spammer;

    public static void main(String[] args) {
        Application app = new Application();
        app.config();
    }

    private void config() {
        this.network = new Facebook();
        //or this.network = new LinkedIn();
        this.spammer = new SocialSpammer();
    }

    private void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    private void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }
}
