package com.alphadev;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private List<User> users;

    public ChatMediatorImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            //message should not be received by the user sending it.
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
