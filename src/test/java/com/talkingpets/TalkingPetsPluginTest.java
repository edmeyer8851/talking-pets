package com.talkingpets;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TalkingPetsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TalkingPetsPlugin.class);
		RuneLite.main(args);
	}
}