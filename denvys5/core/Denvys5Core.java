package denvys5.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Denvys5Core.modid, name = Denvys5Core.name, version = Denvys5Core.version, dependencies = "required-before:uraniumswordmod@[0.2,)")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)

public class Denvys5Core {
	public static final String modid = "Denvys5Core";
	public static final String name = "Denvys5 Coremod";
	public static final String version = "1.0";
}
