package mudclient;

public class Data {

    public static int getModelNameIndex(String arg0) {
        if(arg0.equalsIgnoreCase("na"))
            return 0;
        for(int i = 0; i < modelCount; i++)
            if(modelName[i].equalsIgnoreCase(arg0))
                return i;

        modelName[modelCount++] = arg0;
        return modelCount - 1;
    }

    public static int readByte() {
        int i = integerData[integerDataIndex] & 0xff;
        integerDataIndex++;
        return i;
    }

    public static int readShort() {
        int i = DataOperations.getShort(integerData, integerDataIndex);
        integerDataIndex += 2;
        return i;
    }

    public static int readInt() {
        int i = DataOperations.getInt(integerData, integerDataIndex);
        integerDataIndex += 4;
        if(i > 0x5f5e0ff)
            i = 0x5f5e0ff - i;
        return i;
    }

    public static String readString() {
        String s;
        for(s = ""; stringData[stringDataIndex] != 0; s = s + (char)stringData[stringDataIndex++]);
        stringDataIndex++;
        return s;
    }

    public static void load(byte arg0[]) {
        stringData = DataOperations.loadData("string.dat", 0, arg0);
        stringDataIndex = 0;
        integerData = DataOperations.loadData("integer.dat", 0, arg0);
        integerDataIndex = 0;
        itemCount = readShort();
        itemName = new String[itemCount];
        itemDescription = new String[itemCount];
        itemCommand = new String[itemCount];
        itemInventoryPicture = new int[itemCount];
        itemBasePrice = new int[itemCount];
        itemStackable = new int[itemCount];
        itemUnused = new int[itemCount];
        itemIsEquippable = new int[itemCount];
        itemPictureMask = new int[itemCount];
        itemSpecial = new int[itemCount];
        itemMembers = new int[itemCount];
        for(int i = 0; i < itemCount; i++)
            itemName[i] = readString();

        for(int j = 0; j < itemCount; j++)
            itemDescription[j] = readString();

        for(int k = 0; k < itemCount; k++)
            itemCommand[k] = readString();

        for(int l = 0; l < itemCount; l++) {
            itemInventoryPicture[l] = readShort();
            if(itemInventoryPicture[l] + 1 > highestLoadedPicture)
                highestLoadedPicture = itemInventoryPicture[l] + 1;
        }

        for(int i1 = 0; i1 < itemCount; i1++)
            itemBasePrice[i1] = readInt();

        for(int j1 = 0; j1 < itemCount; j1++)
            itemStackable[j1] = readByte();

        for(int k1 = 0; k1 < itemCount; k1++)
            itemUnused[k1] = readByte();

        for(int l1 = 0; l1 < itemCount; l1++)
            itemIsEquippable[l1] = readShort();

        for(int i2 = 0; i2 < itemCount; i2++)
            itemPictureMask[i2] = readInt();

        for(int j2 = 0; j2 < itemCount; j2++)
            itemSpecial[j2] = readByte();

        for(int k2 = 0; k2 < itemCount; k2++)
            itemMembers[k2] = readByte();

        for(int l2 = 0; l2 < itemCount; l2++)
            if(!Config.MEMBERS_FEATURES && itemMembers[l2] == 1) {
                itemName[l2] = "Members object";
                itemDescription[l2] = "You need to be a member to use this object";
                itemBasePrice[l2] = 0;
                itemCommand[l2] = "";
                itemUnused[0] = 0;
                itemIsEquippable[l2] = 0;
                itemSpecial[l2] = 1;
            }

        npcCount = readShort();
        npcName = new String[npcCount];
        npcDescription = new String[npcCount];
        npcCommand = new String[npcCount];
        npcAttack = new int[npcCount];
        npcStrength = new int[npcCount];
        npcHits = new int[npcCount];
        npcDefense = new int[npcCount];
        npcAttackable = new int[npcCount];
        npcAnimationCount = new int[npcCount][12];
        npcHairColor = new int[npcCount];
        npcTopColor = new int[npcCount];
        npcBottomColor = new int[npcCount];
        npcSkinColor = new int[npcCount];
        npcCameraArray1 = new int[npcCount];
        npcCameraArray2 = new int[npcCount];
        npcWalkModelArray = new int[npcCount];
        npcCombatModel = new int[npcCount];
        npcCombatSprite = new int[npcCount];
        for(int i3 = 0; i3 < npcCount; i3++)
            npcName[i3] = readString();

        for(int j3 = 0; j3 < npcCount; j3++)
            npcDescription[j3] = readString();

        for(int k3 = 0; k3 < npcCount; k3++)
            npcAttack[k3] = readByte();

        for(int l3 = 0; l3 < npcCount; l3++)
            npcStrength[l3] = readByte();

        for(int i4 = 0; i4 < npcCount; i4++)
            npcHits[i4] = readByte();

        for(int j4 = 0; j4 < npcCount; j4++)
            npcDefense[j4] = readByte();

        for(int k4 = 0; k4 < npcCount; k4++)
            npcAttackable[k4] = readByte();

        for(int l4 = 0; l4 < npcCount; l4++) {
            for(int i5 = 0; i5 < 12; i5++) {
                npcAnimationCount[l4][i5] = readByte();
                if(npcAnimationCount[l4][i5] == 255)
                    npcAnimationCount[l4][i5] = -1;
            }

        }

        for(int j5 = 0; j5 < npcCount; j5++)
            npcHairColor[j5] = readInt();

        for(int k5 = 0; k5 < npcCount; k5++)
            npcTopColor[k5] = readInt();

        for(int l5 = 0; l5 < npcCount; l5++)
            npcBottomColor[l5] = readInt();

        for(int i6 = 0; i6 < npcCount; i6++)
            npcSkinColor[i6] = readInt();

        for(int j6 = 0; j6 < npcCount; j6++)
            npcCameraArray1[j6] = readShort();

        for(int k6 = 0; k6 < npcCount; k6++)
            npcCameraArray2[k6] = readShort();

        for(int l6 = 0; l6 < npcCount; l6++)
            npcWalkModelArray[l6] = readByte();

        for(int i7 = 0; i7 < npcCount; i7++)
            npcCombatModel[i7] = readByte();

        for(int j7 = 0; j7 < npcCount; j7++)
            npcCombatSprite[j7] = readByte();

        for(int k7 = 0; k7 < npcCount; k7++)
            npcCommand[k7] = readString();

        textureCount = readShort();
        textureName = new String[textureCount];
        textureSubName = new String[textureCount];
        for(int l7 = 0; l7 < textureCount; l7++)
            textureName[l7] = readString();

        for(int i8 = 0; i8 < textureCount; i8++)
            textureSubName[i8] = readString();

        animationCount = readShort();
        animationName = new String[animationCount];
        animationCharacterColor = new int[animationCount];
        animationGenderModels = new int[animationCount];
        animationHasA = new int[animationCount];
        animationHasF = new int[animationCount];
        animationNumber = new int[animationCount];
        for(int j8 = 0; j8 < animationCount; j8++)
            animationName[j8] = readString();

        for(int k8 = 0; k8 < animationCount; k8++)
            animationCharacterColor[k8] = readInt();

        for(int l8 = 0; l8 < animationCount; l8++)
            animationGenderModels[l8] = readByte();

        for(int i9 = 0; i9 < animationCount; i9++)
            animationHasA[i9] = readByte();

        for(int j9 = 0; j9 < animationCount; j9++)
            animationHasF[j9] = readByte();

        for(int k9 = 0; k9 < animationCount; k9++)
            animationNumber[k9] = readByte();

        objectCount = readShort();
        objectName = new String[objectCount];
        objectDescription = new String[objectCount];
        objectCommand1 = new String[objectCount];
        objectCommand2 = new String[objectCount];
        objectModelNumber = new int[objectCount];
        objectWidth = new int[objectCount];
        objectHeight = new int[objectCount];
        objectType = new int[objectCount];
        objectGroundItemVar = new int[objectCount];
        for(int l9 = 0; l9 < objectCount; l9++)
            objectName[l9] = readString();

        for(int i10 = 0; i10 < objectCount; i10++)
            objectDescription[i10] = readString();

        for(int j10 = 0; j10 < objectCount; j10++)
            objectCommand1[j10] = readString();

        for(int k10 = 0; k10 < objectCount; k10++)
            objectCommand2[k10] = readString();

        for(int l10 = 0; l10 < objectCount; l10++)
            objectModelNumber[l10] = getModelNameIndex(readString());

        for(int i11 = 0; i11 < objectCount; i11++)
            objectWidth[i11] = readByte();

        for(int j11 = 0; j11 < objectCount; j11++)
            objectHeight[j11] = readByte();

        for(int k11 = 0; k11 < objectCount; k11++)
            objectType[k11] = readByte();

        for(int l11 = 0; l11 < objectCount; l11++)
            objectGroundItemVar[l11] = readByte();

        wallObjectCount = readShort();
        wallObjectName = new String[wallObjectCount];
        wallObjectDescription = new String[wallObjectCount];
        wallObjectCommand1 = new String[wallObjectCount];
        wallObjectCommand2 = new String[wallObjectCount];
        wallObjectModelVar1 = new int[wallObjectCount];
        wallObjectModelVar2 = new int[wallObjectCount];
        wallObjectModelVar3 = new int[wallObjectCount];
        wallObjectType = new int[wallObjectCount];
        wallObjectUnknown = new int[wallObjectCount];
        for(int i12 = 0; i12 < wallObjectCount; i12++)
            wallObjectName[i12] = readString();

        for(int j12 = 0; j12 < wallObjectCount; j12++)
            wallObjectDescription[j12] = readString();

        for(int k12 = 0; k12 < wallObjectCount; k12++)
            wallObjectCommand1[k12] = readString();

        for(int l12 = 0; l12 < wallObjectCount; l12++)
            wallObjectCommand2[l12] = readString();

        for(int i13 = 0; i13 < wallObjectCount; i13++)
            wallObjectModelVar1[i13] = readShort();

        for(int j13 = 0; j13 < wallObjectCount; j13++)
            wallObjectModelVar2[j13] = readInt();

        for(int k13 = 0; k13 < wallObjectCount; k13++)
            wallObjectModelVar3[k13] = readInt();

        for(int l13 = 0; l13 < wallObjectCount; l13++)
            wallObjectType[l13] = readByte();

        for(int i14 = 0; i14 < wallObjectCount; i14++)
            wallObjectUnknown[i14] = readByte();

        akd = readShort();
        alm = new int[akd];
        aln = new int[akd];
        for(int j14 = 0; j14 < akd; j14++)
            alm[j14] = readByte();

        for(int k14 = 0; k14 < akd; k14++)
            aln[k14] = readByte();
        
        /*System.out.println("akd:");
        for(int i = 0; i < akd; i++) {
            System.out.println(i + ": " + alm[i] + " " + aln[i]);
        }*/

        ajg = readShort();
        akg = new int[ajg];
        akh = new int[ajg];
        aki = new int[ajg];
        for(int l14 = 0; l14 < ajg; l14++)
            akg[l14] = readInt();

        for(int i15 = 0; i15 < ajg; i15++)
            akh[i15] = readByte();

        for(int j15 = 0; j15 < ajg; j15++)
            aki[j15] = readByte();
        
        /*System.out.println("ajg:");
        for(int i = 0; i < ajg; i++) {
            System.out.println(i + ": " + akg[i] + " " + akh[i] + " " + aki[i]);
        }*/

        spellProjectileCount = readShort();
        spellCount = readShort();
        spellName = new String[spellCount];
        spellDescription = new String[spellCount];
        spellRequiredLevel = new int[spellCount];
        spellDifferentRuneCount = new int[spellCount];
        spellType = new int[spellCount];
        spelRequiredRuneID = new int[spellCount][];
        spellRequiredRuneCount = new int[spellCount][];
        for(int k15 = 0; k15 < spellCount; k15++)
            spellName[k15] = readString();

        for(int l15 = 0; l15 < spellCount; l15++)
            spellDescription[l15] = readString();

        for(int i16 = 0; i16 < spellCount; i16++)
            spellRequiredLevel[i16] = readByte();

        for(int j16 = 0; j16 < spellCount; j16++)
            spellDifferentRuneCount[j16] = readByte();

        for(int k16 = 0; k16 < spellCount; k16++)
            spellType[k16] = readByte();

        for(int l16 = 0; l16 < spellCount; l16++) {
            int i17 = readByte();
            spelRequiredRuneID[l16] = new int[i17];
            for(int k17 = 0; k17 < i17; k17++)
                spelRequiredRuneID[l16][k17] = readShort();

        }

        for(int j17 = 0; j17 < spellCount; j17++) {
            int l17 = readByte();
            spellRequiredRuneCount[j17] = new int[l17];
            for(int j18 = 0; j18 < l17; j18++)
                spellRequiredRuneCount[j17][j18] = readByte();

        }

        prayerCount = readShort();
        prayerName = new String[prayerCount];
        prayerDescription = new String[prayerCount];
        prayerRequiredLevel = new int[prayerCount];
        prayerDrainRate = new int[prayerCount];
        for(int i18 = 0; i18 < prayerCount; i18++)
            prayerName[i18] = readString();

        for(int k18 = 0; k18 < prayerCount; k18++)
            prayerDescription[k18] = readString();

        for(int l18 = 0; l18 < prayerCount; l18++)
            prayerRequiredLevel[l18] = readByte();

        for(int i19 = 0; i19 < prayerCount; i19++)
            prayerDrainRate[i19] = readByte();

        stringData = null;
        integerData = null;
    }

    public static int itemCount;
    public static int highestLoadedPicture;
    public static String npcName[];
    public static String npcDescription[];
    public static String npcCommand[];
    public static int spellProjectileCount;
    public static int objectCount;
    public static String wallObjectName[];
    public static String wallObjectDescription[];
    public static String wallObjectCommand1[];
    public static String wallObjectCommand2[];
    public static int spellCount;
    public static int npcCameraArray1[];
    public static int npcCameraArray2[];
    public static String itemName[];
    public static String itemDescription[];
    public static String itemCommand[];
    public static int itemInventoryPicture[];
    public static int itemBasePrice[];
    public static int itemStackable[];
    public static int itemUnused[];
    public static int itemIsEquippable[];
    public static int itemPictureMask[];
    public static int itemSpecial[];
    public static int itemMembers[];
    public static String prayerName[];
    public static String prayerDescription[];
    public static String animationName[];
    public static int prayerCount;
    public static int npcHairColor[];
    public static int npcTopColor[];
    public static int npcBottomColor[];
    public static int npcSkinColor[];
    public static int ajg;
    public static int wallObjectCount;
    public static int animationCount;
    public static String modelName[] = new String[5000];
    public static String textureName[];
    public static String textureSubName[];
    public static String objectName[];
    public static String objectDescription[];
    public static String objectCommand1[];
    public static String objectCommand2[];
    public static int textureCount;
    public static int akd;
    public static int prayerRequiredLevel[];
    public static int prayerDrainRate[];
    public static int akg[];
    public static int akh[];
    public static int aki[];
    public static String spellName[];
    public static String spellDescription[];
    public static int npcWalkModelArray[];
    public static int npcCombatModel[];
    public static int npcCombatSprite[];
    public static int npcAnimationCount[][];
    public static int npcAttack[];
    public static int npcStrength[];
    public static int npcHits[];
    public static int npcDefense[];
    public static int npcAttackable[];
    public static int npcCount;
    public static int animationCharacterColor[];
    public static int animationGenderModels[];
    public static int animationHasA[];
    public static int animationHasF[];
    public static int animationNumber[];
    public static int alm[];
    public static int aln[];
    public static int modelCount;
    public static int spellRequiredLevel[];
    public static int spellDifferentRuneCount[];
    public static int spellType[];
    public static int spelRequiredRuneID[][];
    public static int spellRequiredRuneCount[][];
    public static int objectModelNumber[];
    public static int objectWidth[];
    public static int objectHeight[];
    public static int objectType[];
    public static int objectGroundItemVar[];
    public static String aml[] = new String[5000];
    public static int wallObjectModelVar1[];
    public static int wallObjectModelVar2[];
    public static int wallObjectModelVar3[];
    public static int wallObjectType[];
    public static int wallObjectUnknown[];
    public static String and[] = new String[5000];
    static byte stringData[];
    static byte integerData[];
    static int stringDataIndex;
    static int integerDataIndex;
    public static int ani;

}
