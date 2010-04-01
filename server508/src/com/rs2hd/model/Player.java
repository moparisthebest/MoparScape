package com.rs2hd.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.apache.mina.common.IoSession;

import com.rs2hd.content.DeathEvent;
import com.rs2hd.content.Combat.CombatType;
import com.rs2hd.model.Hits.Hit;
import com.rs2hd.net.ActionSender;
import com.rs2hd.net.Packet;
import com.rs2hd.packethandler.PacketHandlers;

/**
 * Represents a connected player.
 * @author Graham
 *
 */
public class Player extends Entity {
	
	private PlayerDetails details;
	private transient ActionSender actionSender;
	private transient Queue<Packet> queuedPackets;
	private transient PlayerUpdateFlags updateFlags;
	private transient Sprite sprite;
	private transient WalkingQueue walkingQueue;
	private transient LocalEntityList localEntities;
	private transient ChatMessage lastChatMessage;
	private transient int world;
	private transient Map<String, Object> temporaryAttributes;
	private transient Queue<Hit> queuedHits;
	private transient Bonuses bonuses;
	private transient boolean hd;
	private transient ShopConfiguration shopConfiguration;
	private transient int lastKnownWildernessLevel;
	private transient boolean busy;
	private Bank bank;
	private Settings settings;
	private Appearance appearance;
	private HeadIcons headIcons;
	private Equipment equipment;
	private Skills skills;
	private Inventory inventory;
	private Friends friends;
	private Specials specials;
	private int rights = 0;
	private int runEnergy = 100;
	
	public Player(PlayerDetails details) {
		this.details = details;
		this.appearance = new Appearance();
		this.headIcons = new HeadIcons();
		this.equipment = new Equipment();
		this.skills = new Skills();
		this.inventory = new Inventory();
		this.friends = new Friends();
		this.settings = new Settings();
		this.bank = new Bank();
		this.settings.setDefaultSettings();
		this.specials = new Specials();
	}
	
	/**
	 * Called when XStream loads us.
	 * 
	 * NOTE: other loaders should call this also.
	 */
	public Object readResolve() {
		super.readResolve();
		actionSender = new ActionSender(this);
		queuedPackets = new LinkedList<Packet>();
		updateFlags = new PlayerUpdateFlags();
		sprite = new Sprite();
		walkingQueue = new WalkingQueue(this);
		skills.setPlayer(this);
		inventory.setPlayer(this);
		bank.setPlayer(this);
		equipment.setPlayer(this);
		friends.setPlayer(this);
		localEntities = new LocalEntityList();
		settings.setPlayer(this);
		specials.setPlayer(this);
		temporaryAttributes = new HashMap<String, Object>();
		lastChatMessage = null;
		world = 66;
		details.refreshLongName();
		queuedHits = new LinkedList<Hit>();
		bonuses = new Bonuses(this);
		hd = false;
		shopConfiguration = new ShopConfiguration();
		lastKnownWildernessLevel = -1;
		busy = false;
		return this;
	}
	
	public boolean isBusy() {
		return busy;
	}
	
	public void setBusy(boolean b) {
		this.busy = b;
		if(busy) {
			this.setAttacking(false);
		}
	}

	/**
	 * Called roughly every 500ms.
	 */
	public void tick() {
		
	}
	
	public void setTemporaryAttribute(String attribute, Object value) {
		temporaryAttributes.put(attribute, value);
	}
	
	public Object getTemporaryAttribute(String attribute) {
		return temporaryAttributes.get(attribute);
	}
	
	public void removeTemporaryAttribute(String attribute) {
		temporaryAttributes.remove(attribute);
	}
	
	public Settings getSettings() {
		return this.settings;
	}
	
	public PlayerDetails getPlayerDetails() {
		return this.details;
	}
	
	public ActionSender getActionSender() {
		return this.actionSender;
	}
	
	public IoSession getSession() {
		return this.details.getSession();
	}
	
	public String getUsername() {
		return this.details.getUsername();
	}
	
	public int getRights() {
		return this.rights;
	}
	
	public void processQueuedPackets() {
		synchronized(queuedPackets) {
			Packet p = null;
			while((p = queuedPackets.poll()) != null) {
				PacketHandlers.handlePacket(getSession(), p);
			}
		}
	}
	
	public void addPacketToQueue(Packet p) {
		synchronized(queuedPackets) {
			queuedPackets.add(p);
		}
	}
	
	public PlayerUpdateFlags getUpdateFlags() {
		return updateFlags;
	}
	
	public Sprite getSprites() {
		return sprite;
	}
	
	public Appearance getAppearance() {
		return appearance;
	}
	
	public HeadIcons getHeadIcons() {
		return headIcons;
	}
	
	public Equipment getEquipment() {
		return equipment;
	}
	
	public WalkingQueue getWalkingQueue() {
		return walkingQueue;
	}
	
	public Skills getSkills() {
		return skills;
	}

	public boolean isDisconnected() {
		return !getSession().isConnected();
	}

	public void setPlayerListSize(int playerListSize) {
		localEntities.playerListSize = playerListSize;
	}

	public int getPlayerListSize() {
		return localEntities.playerListSize;
	}

	public void setPlayerList(Player[] playerList) {
		localEntities.playerList = playerList;
	}

	public Player[] getPlayerList() {
		return localEntities.playerList;
	}
	
	public void setPlayersInList(byte[] playersInList) {
		localEntities.playersInList = playersInList;
	}

	public byte[] getPlayersInList() {
		return localEntities.playersInList;
	}
	


	public void setNpcListSize(int npcListSize) {
		localEntities.npcListSize = npcListSize;
	}

	public int getNpcListSize() {
		return localEntities.npcListSize;
	}

	public void setNpcList(NPC[] npcList) {
		localEntities.npcList = npcList;
	}

	public NPC[] getNpcList() {
		return localEntities.npcList;
	}
	
	public void setNpcsInList(byte[]npcsInList) {
		localEntities.npcsInList = npcsInList;
	}

	public byte[] getNpcsInList() {
		return localEntities.npcsInList;
	}

	public Inventory getInventory() {
		return inventory;
	}
	
	public ChatMessage getLastChatMessage() {
		return lastChatMessage;
	}
	
	public void setLastChatMessage(ChatMessage msg) {
		lastChatMessage = msg;
	}
	
	public int getWorld() {
		return world;
	}

	public Friends getFriends() {
		return friends;
	}

	public boolean isRebuildNpcList() {
		return localEntities.rebuildNpcList;
	}
	
	public void graphics(int id) {
		graphics(id, 0);
	}
	
	public void graphics(int id, int delay) {
		this.setLastGraphics(new Graphics(id, delay));
		updateFlags.setGraphicsUpdateRequired(true);
	}
	
	public void animate(int id) {
		animate(id, 0);
	}
	
	public void animate(int id, int delay) {
		this.setLastAnimation(new Animation(id, delay));
		updateFlags.setAnimationUpdateRequired(true);
	}

	public void setRebuildNpcList(boolean b) {
		this.localEntities.rebuildNpcList = true;
	}
	
	public void processQueuedHits() {
		if(!updateFlags.isHitUpdateRequired()) {
			if(queuedHits.size() > 0) {
				Hit h = queuedHits.poll();
				hit(h.getDamage(), h.getType());
			}
		}
		if(!updateFlags.isHit2UpdateRequired()) {
			if(queuedHits.size() > 0) {
				Hit h = queuedHits.poll();
				hit(h.getDamage(), h.getType());
			}
		}
	}
	
	public void heal(int amount) {
		skills.heal(amount);
	}
	
	public void hit(int damage) {
		if(damage == 0) {
			hit(damage, Hits.HitType.NO_DAMAGE);
		} else {
			hit(damage, Hits.HitType.NORMAL_DAMAGE);
		}
	}
	
	public void hit(int damage, Hits.HitType type) {
		int hp = this.getSkills().getLevelForXp(Skills.HITPOINTS);
		if(damage > hp) {
			damage = hp;
		}
		if(!updateFlags.isHitUpdateRequired()) {
			getHits().setHit1(new Hit(damage, type));
			updateFlags.setHitUpdateRequired(true);
		} else {
			if(!updateFlags.isHit2UpdateRequired()) {
				getHits().setHit2(new Hit(damage, type));
				updateFlags.setHit2UpdateRequired(true);
			} else {
				queuedHits.add(new Hit(damage, type));
			}
		}
		skills.hit(damage);
		if(skills.getLevel(Skills.HITPOINTS) <= 0) {
			if(!this.isDead()) {
				World.getInstance().registerEvent(new DeathEvent(this));
			}
			this.setDead(true);
		}
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public void setRunEnergy(int runEnergy) {
		this.runEnergy = runEnergy;
		actionSender.sendEnergy();
	}
	
	public int getRunEnergy() {
		return this.runEnergy;
	}
	
	public Bonuses getBonuses() {
		return this.bonuses;
	}

	public void setHd(boolean b) {
		this.hd = b;
		if(b) {
			this.getActionSender().sendHdLogin();
		}
	}
	
	public boolean isHd() {
		return hd;
	}

	public void turnTo(Entity entity) {
		this.getUpdateFlags().setFaceToUpdateRequired(true, entity.getClientIndex());
	}
	
	public void turnTemporarilyTo(Entity entity) {
		this.getUpdateFlags().setFaceToUpdateRequired(true, entity.getClientIndex());
		this.getUpdateFlags().setClearFaceTo(true);
	}
	
	public ShopConfiguration getShopConfiguration() {
		return shopConfiguration;
	}

	@Override
	public void resetTurnTo() {
		this.getUpdateFlags().setFaceToUpdateRequired(true, 0);
	}

	@Override
	public int getAttackAnimation() {
		return !this.appearance.isNpc() ? equipment.getAttackAnimation() : NPCDefinition.forId(this.appearance.getNpcId()).getAttackAnimation();
	}

	@Override
	public int getAttackSpeed() {
		return equipment.getAttackSpeed();
	}

	@Override
	public int getMaxHit() {
		double maxHit = 0;
		if(this.getCombatType().equals(CombatType.MELEE)) {
			int strBonus = bonuses.getBonus(10);
			int strength = skills.getLevel(Skills.STRENGTH);
			int fightType = this.getAttackStyle();
			if(fightType == 1 || fightType == 4) {
				maxHit += (double) (1.05 + (double) ((double) (strBonus * strength) * 0.00175));
			} else if(fightType == 2) {
				maxHit += (double) (1.35 + (double) ((double) (strBonus) * 0.00525));
			} else if(fightType == 3){
				maxHit += (double) (1.15 + (double) ((double) (strBonus) * 0.00175));
			}
			maxHit += (double)(strength * 0.1);
		} else if(this.getCombatType().equals(CombatType.RANGE)) {
			int range = skills.getLevel(Skills.RANGE);
			int rangeBonus = bonuses.getBonus(4);
			double d = ((double) (rangeBonus * 0.00175D) + 0.1D);
			maxHit += d * (double) range + 2.05D;
		} else {
			// todo mage
		}
		return ((int) (Math.ceil(maxHit)) + 1);
	}

	@Override
	public int getDefenceAnimation() {
		return !this.appearance.isNpc() ? equipment.getDefenceAnimation() : NPCDefinition.forId(this.appearance.getNpcId()).getDefenceAnimation();
	}

	@Override
	public boolean isAnimating() {
		return this.getUpdateFlags().isAnimationUpdateRequired();
	}

	@Override
	public boolean isDestroyed() {
		return !World.getInstance().getPlayerList().contains(this);
	}

	@Override
	public int getDeathAnimation() {
		return !this.appearance.isNpc() ? 7197 : NPCDefinition.forId(this.appearance.getNpcId()).getDeathAnimation();
	}

	public void updateWildernessState() {
		boolean update = false;
		if(lastKnownWildernessLevel == -1) {
			update = true;
		}
		int currentLevel = Location.wildernessLevel(this.getLocation());
		if(currentLevel != lastKnownWildernessLevel) {
			update = true;
		}
		if(update) {
			lastKnownWildernessLevel = currentLevel;
			if(currentLevel == 0) {
				actionSender.sendPlayerOption("null", 1, false);
				actionSender.sendRemoveOverlay();
			} else {
				actionSender.sendPlayerOption("Attack", 1, false);
				actionSender.sendOverlay(381);
			}
		}
	}

	@Override
	public int getHp() {
		return this.getSkills().getLevel(Skills.HITPOINTS);
	}

	@Override
	public int getMaxHp() {
		return this.getSkills().getLevelForXp(Skills.HITPOINTS);
	}

	@Override
	public void setHp(int val) {
		this.getSkills().set(Skills.HITPOINTS, val);
	}

	@Override
	public void dropLoot() {
		List<Item> itemsInHand = new ArrayList<Item>();
		for(int i = 0; i < Inventory.SIZE; i++) {
			Item item = this.getInventory().getContainer().get(i);
			if(item != null) {
				itemsInHand.add(item);
			}
		}
		for(int i = 0; i < Equipment.SIZE; i++) {
			Item item = this.getEquipment().getContainer().get(i);
			if(item != null) {
				itemsInHand.add(item);
			}
		}
		if(this.getHeadIcons().isSkulled()) {
			
		}
	}

	public Specials getSpecials() {
		return specials;
	}

	@Override
	public boolean isAutoRetaliating() {
		return settings.isAutoRetaliate();
	}

	@Override
	public CombatType getCombatType() {
		if(equipment.isWieldindBow() || equipment.isWieldingKnives()) {
			return CombatType.RANGE;
		}
		return CombatType.MELEE;
	}

	@Override
	public int getDrawBackGraphics() {
		return equipment.getDrawBackGraphics();
	}

	@Override
	public int getProjectileId() {
		return equipment.getProjectileId();
	}

	@Override
	public boolean hasAmmo() {
		return equipment.hasAmmo();
	}

}
