package knightminer.tcomplement.common;

public interface ModIds {
	public interface Ceramics {
		String ID = "ceramics";

		String bucket = ID + ":clay_bucket";
	}

	public interface TConstruct {
		String ID = "tconstruct";

		String ingots = ID + ":ingots";
		int manyullynMeta = 2;
		int knightSlimeMeta = 3;

		String edibles = ID + ":edible";
		int baconMeta = 0;
	}
}
