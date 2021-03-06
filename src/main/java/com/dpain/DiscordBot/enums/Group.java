package com.dpain.DiscordBot.enums;

public enum Group {
	// The lower, the more powerful
	OWNER("Owner", 0),
	PRESIDENT("President", 5),
	OFFICER("Officer", 10),
	MODERATOR("Moderator", 15),
	TRUSTED_USER("Trusted User", 20),
	USER("User", 25),
	GUEST("Guest", 30),
	//This is not banned status. This is only to take away permissions temporarily
	PRISONER("Prisoner", 100);
	
	private final String name;
	private int hierarchy;
	
	Group(String name, int value) {
		this.name = name;
		this.hierarchy = value;
	}
	
	public String getName() {
        return name;
    }
	
	public int getHierarchy() {
        return hierarchy;
    }
	
}
