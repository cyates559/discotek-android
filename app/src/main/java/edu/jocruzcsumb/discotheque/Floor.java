package edu.jocruzcsumb.discotheque;

import org.json.JSONObject;

import java.util.ArrayList;

import static junit.framework.Assert.fail;

/**
 * Created by Tommy on 3/23/2017.
 */

public class Floor
{

    private String name;
    private ArrayList<Message> messages = null;
    private ArrayList<Song> songs = null;
    private ArrayList<User> users = null;

    public Floor()
    {
        messages = new ArrayList<Message>();
        songs = new ArrayList<Song>();
        users = new ArrayList<User>();
    }

    public Floor(String name)
    {
        this.name = name;
    }

    public Floor parse(JSONObject jsonFloor)
    {
        //TODO
        fail("nyi");
        return new Floor();
    }

    public void setMessages(ArrayList<Message> messages)
    {
        this.messages = messages;
    }

    public void setSongs(ArrayList<Song> songs)
    {
        this.songs = songs;
    }

    public void setUsers(ArrayList<User> users)
    {
        this.users = users;
    }

    public ArrayList<Message> getMessages()
    {
        return messages;
    }

    public ArrayList<Song> getSongs()
    {
        return songs;
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }

    public String getName()
    {
        return name;
    }


}
