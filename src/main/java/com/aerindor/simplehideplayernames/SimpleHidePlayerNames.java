package com.aerindor.simplehideplayernames;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
    modid = SimpleHidePlayerNames.MODID,
    name = SimpleHidePlayerNames.NAME,
    version = SimpleHidePlayerNames.VERSION
)
public class SimpleHidePlayerNames {

    public static final String MODID = "simplehideplayernames";
    public static final String NAME = "Simple Hide Player Names";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("[SimpleHidePlayerNames] PreInit loaded");
    }
}
