package DavidScape.npcs.loading;


public class NPCList {

    /**
     * The type of NPC.
     */
    public int npcType = -1;

    /**
     * The name of the NPC.
     */
    public String npcName = "";

    /**
     * The examine of the NPC.
     */
    public String examine = "An NPC.";

    /**
     * The emotes of the NPC.
     */
    public int attackEmote = 0;
    public int defendEmote = 0;
    public int deathEmote = 0;

    /**
     * The combat level of the NPC.
     */
    public int attackDelay = 5;

    /**
     * The combat level of the NPC.
     */
    public int combatLevel = 0;

    /**
     * The max hitpoints of the NPC.
     */
    public int maxHP = 0;

    /**
     * The max hit of the NPC.
     */
    public int maxHit = 0;

    /**
     * The attack type of the NPC.
     */
    public int atkType = 0;

    /**
     * The name of the NPC.
     */

    /**
     * The weakness of the NPC.
     */
    public int weakness = 0;

    /**
     * The respawn time of the NPC.
     */
    public int respawnDelay = 60;

    /**
     * Constructs a new NPCList.
     */
    public NPCList(int id, String name, String view, int cb, int hp, int maxhit, int spawnTime, int atk, int weak, int attack, int defend, int dead, int delay) {
        npcType = id;
        npcName = name;
        examine = view;
        combatLevel = cb;
        maxHP = hp;
        maxHit = maxhit;
        atkType = atk;
        weakness = weak;
        respawnDelay = spawnTime;
        attackEmote = attack;
        defendEmote = defend;
        deathEmote = dead;
        attackDelay = delay;
    }
}
