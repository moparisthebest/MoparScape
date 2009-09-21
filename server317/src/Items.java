// a collection of item methods

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Items {

    //Few item types for equipping
    public static int capes[] = {6111, 6570, 6568, 1007, 1019, 1021, 1023, 1027, 1029, 1031, 1052, 2412, 2413, 2414, 4304, 4315, 4317, 4319, 4321, 4323, 4325, 4327, 4329, 4331, 4333, 4335, 4337, 4339, 4341, 4343, 4345, 4347, 4349, 4351, 4353, 4355, 4357, 4359, 4361, 4363, 4365, 4367, 4369, 4371, 4373, 4375, 4377, 4379, 4381, 4383, 4385, 4387, 4389, 4391, 4393, 4395, 4397, 4399, 4401, 4403, 4405, 4407, 4409, 4411, 4413, 4514, 4516, 6070, 6568, 6570};
    public static int boots[] = {6061, 6106, 88, 89, 626, 628, 630, 632, 634, 1061, 1837, 1846, 2577, 2579, 2894, 2904, 2914, 2924, 2934, 3061, 3105, 3107, 3791, 4097, 4107, 4117, 4119, 4121, 4123, 4125, 4127, 4129, 4131, 4310, 5064, 5345, 5557, 6069, 6106, 6143, 6145, 6147, 6328};
    public static int gloves[] = {2491, 1065, 2487, 2489, 3060, 1495, 775, 777, 778, 6708, 1059, 1063, 1065, 1580, 2487, 2489, 2491, 2902, 2912, 2922, 2932, 2942, 3060, 3799, 4095, 4105, 4115, 4308, 5556, 6068, 6110, 6149, 6151, 6153};
    public static int shields[] = {1171, 1173, 1175, 1177, 1179, 1181, 1183, 1185, 1187, 1189, 1191, 1193, 1195, 1197, 1199, 1201, 1540, 2589, 2597, 2603, 2611, 2621, 2629, 2659, 2667, 2675, 2890, 3122, 3488, 3758, 3839, 3840, 3841, 3842, 3843, 3844, 4072, 4156, 4224, 4225, 4226, 4227, 4228, 4229, 4230, 4231, 4232, 4233, 4234, 4302, 4507, 4512, 6215, 6217, 6219, 6221, 6223, 6225, 6227, 6229, 6231, 6233, 6235, 6237, 6239, 6241, 6243, 6245, 6247, 6249, 6251, 6253, 6255, 6257, 6259, 6261, 6263, 6265, 6267, 6269, 6271, 6273, 6275, 6277, 6279, 6524};
    public static int hats[] = {4732, 4753, 4611, 6188, 6182, 4511, 4056, 4071, 4724, 2639, 2641, 2643, 2665, 6109, 5525, 5527, 5529, 5531, 5533, 5535, 5537, 5539, 5541, 5543, 5545, 5547, 5549, 5551, 74, 579, 656, 658, 660, 662, 664, 740, 1017, 1037, 1038, 1040, 1042, 1044, 1046, 1048, 1050, 1053, 1055, 1057, 1137, 1139, 1141, 1143, 1145, 1147, 1149, 1151, 1153, 1155, 1157, 1159, 1161, 1163, 1165, 1506, 1949, 2422, 2581, 2587, 2595, 2605, 2613, 2619, 2627, 2631, 2633, 2635, 2637, 2651, 2657, 2673, 2900, 2910, 2920, 2930, 2940, 2978, 2979, 2980, 2981, 2982, 2983, 2984, 2985, 2986, 2987, 2988, 2989, 2990, 2991, 2992, 2993, 2994, 2995, 3057, 3385, 3486, 3748, 3749, 3751, 3753, 3755, 3797, 4041, 4042, 4071, 4089, 4099, 4109, 4164, 4302, 4506, 4511, 4513, 4515, 4551, 4567, 4708, 4716, 4724, 4745, 4753, 4856, 4857, 4858, 4859, 4880, 4881, 4882, 4883, 4904, 4905, 4906, 4907, 4952, 4953, 4954, 4955, 4976, 4977, 4978, 4979, 5013, 5014, 5554, 5574, 6109, 6128, 6131, 6137, 6182, 6188, 6335, 6337, 6339, 6345, 6355, 6365, 6375, 6382, 6392, 6400};
    public static int amulets[] = {6585, 86, 87, 295, 421, 552, 589, 1478, 1692, 1694, 1696, 1698, 1700, 1702, 1704, 1706, 1708, 1710, 1712, 1725, 1727, 1729, 1731, 4021, 4081, 4250, 4677, 6040, 6041, 6208};
    public static int arrows[] = {78, 598, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 942, 2532, 2533, 2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2866, 4160, 4172, 4173, 4174, 4175, 4740, 5616, 5617, 5618, 5619, 5620, 5621, 5622, 5623, 5624, 5625, 5626, 5627, 6061, 6062};
    public static int rings[] = {773, 1635, 1637, 1639, 1641, 1643, 1645, 2550, 2552, 2554, 2556, 2558, 2560, 2562, 2564, 2566, 2568, 2570, 2572, 4202, 4657, 6465};
    public static int body[] = {1035, 540, 5553, 4757, 1833, 6388, 6384, 2501, 2499, 1355, 4111, 4101, 4091, 6186, 6184, 6180, 3058, 4509, 4504, 4069, 4728, 4736, 4712, 6107, 2661, 3140, 1101, 1103, 1105, 1107, 1109, 1111, 1113, 1115, 1117, 1119, 1121, 1123, 1125, 1127, 1129, 1131, 1133, 1135, 2499, 2501, 2503, 2583, 2591, 2599, 2607, 2615, 2623, 2653, 2669, 3387, 3481, 4712, 4720, 4728, 4749, 4892, 4893, 4894, 4895, 4916, 4917, 4918, 4919, 4964, 4965, 4966, 4967, 6107, 6133, 6322};
    public static int legs[] = {426, 1835, 538, 1033, 5555, 4759, 6386, 6390, 2503, 2497, 2495, 2493, 1099, 4113, 4103, 4093, 6187, 6185, 6181, 3059, 4510, 4505, 4070, 6108, 538, 542, 548, 1011, 1013, 1015, 1067, 1069, 1071, 1073, 1075, 1077, 1079, 1081, 1083, 1085, 1087, 1089, 1091, 1093, 2585, 2593, 2601, 2609, 2617, 2625, 2655, 2663, 2671, 3059, 3389, 3472, 3473, 3474, 3475, 3476, 3477, 3478, 3479, 3480, 3483, 3485, 3795, 4087, 4585, 4712, 4714, 4722, 4730, 4738, 4751, 4759, 4874, 4875, 4876, 4877, 4898, 4899, 4900, 4901, 4922, 4923, 4924, 4925, 4946, 4947, 4948, 4949, 4970, 4971, 4972, 4973, 4994, 4995, 4996, 4997, 5048, 5050, 5052, 5576, 6107, 6130, 6187, 6390, 6386, 6390, 6396, 6404};
    public static int platebody[] = {1035, 540, 5553, 4757, 1833, 1835, 6388, 6384, 2503, 2501, 2499, 1355, 4111, 4101, 4091, 6186, 6184, 6180, 3058, 4509, 4504, 4069, 4728, 4736, 4712, 6107, 2661, 3140, 1115, 1117, 1119, 1121, 1123, 1125, 1127, 2583, 2591, 2599, 2607, 2615, 2623, 2653, 2669, 3481, 4720, 4728, 4749, 2661};
    public static int fullHelm[] = {4732, 4753, 6188, 4511, 4056, 4071, 4724, 6109, 2665, 1153, 1155, 1157, 1159, 1161, 1163, 1165, 2587, 2595, 2605, 2613, 2619, 2627, 2657, 2673, 3486, 6402, 6394};
    public static int fullMask[] = {4732, 5554, 4753, 4611, 6188, 3507, 4511, 4056, 4071, 4724, 2665, 6109, 1053, 1055, 1057};
    //All other IDs are weapons (I hope)

    public static int crackers[] = {1038, 1040, 1042, 1044, 1046, 1048};
    public static int normal_gems[] = {1623, 1621, 1619, 1617};
    public static int shilo_gems[] = {1623, 1621, 1619, 1617, 1625, 1627, 1629};

    /*Any Sea - ID 1*/
    public static int fishing_net[] = {317, 321};
    public static int fishing_net_lvl[] = {1, 15};
    public static int fishing_net_xp[] = {10, 40};
    /*Any Sea - ID 2*/
    public static int fishing_rod1[] = {327, 345};
    public static int fishing_rod1_lvl[] = {5, 10};
    public static int fishing_rod1_xp[] = {10, 30};
    /*Lumby Swamp - ID 3*/
    public static int fishing_rod2[] = {3379, 5001};
    public static int fishing_rod2_lvl[] = {28, 36};
    public static int fishing_rod2_xp[] = {65, 80};
    /*Any River - ID 4*/
    public static int fishing_fly[] = {335, 349, 331};
    public static int fishing_fly_lvl[] = {20, 25, 30};
    public static int fishing_fly_xp[] = {50, 60, 70};
    /*Catherby, relekka and fishing guild - ID 5*/
    public static int fishing_big_net[] = {353, 407, 405, 401, 341, 363};
    public static int fishing_big_net_lvl[] = {16, 16, 16, 16, 23, 46};
    public static int fishing_big_net_xp[] = {20, 10, 10, 1, 45, 100};
    /*karamja, fishing guild, caatherby and rellekka - ID 6*/
    public static int fishing_harpoon[] = {359, 371};
    public static int fishing_harpoon_lvl[] = {35, 50};
    public static int fishing_harpoon_xp[] = {80, 100};

    public static int smithing_frame[][][] = {
            {{1205, 1, 1, 1, 1125, 1094}, {1351, 1, 1, 1, 1126, 1091}, {1422, 1, 2, 1, 1129, 1093}, {1139, 1, 3, 1, 1127, 1102}, {1277, 1, 3, 1, 1128, 1085}, {819, 10, 4, 1, 1124, 1107}, {4819, 15, 4, 1, 13357, 13358}, {39, 15, 5, 1, 1130, 1108}, {1321, 1, 5, 2, 1116, 1087}, {1291, 1, 6, 2, 1089, 1086}, {1155, 1, 7, 2, 1113, 1103}, {864, 5, 7, 1, 1131, 1106}, {1173, 1, 8, 2, 1114, 1104}, {1337, 1, 9, 3, 1118, 1083}, {1375, 1, 10, 3, 1095, 1092}, {1103, 1, 11, 3, 1109, 1098}, {1189, 1, 12, 3, 1115, 1105}, {3095, 1, 13, 2, 8428, 8429}, {1307, 1, 14, 3, 1090, 1088}, {1087, 1, 16, 3, 1111, 1100}, {1075, 1, 16, 3, 1110, 1099}, {1117, 1, 18, 5, 1112, 1101},/*Specials*/{1794, 1, 4, 1, 1132, 1096}},
            {{1203, 1, 15, 1, 1125, 1094}, {1349, 1, 16, 1, 1126, 1091}, {1420, 1, 17, 1, 1129, 1093}, {1137, 1, 18, 1, 1127, 1102}, {1279, 1, 19, 1, 1128, 1085}, {820, 10, 19, 1, 1124, 1107}, {4820, 15, 19, 1, 13357, 13358}, {40, 15, 20, 1, 1130, 1108}, {1323, 1, 20, 2, 1116, 1087}, {1293, 1, 21, 2, 1089, 1086}, {1153, 1, 22, 2, 1113, 1103}, {863, 5, 22, 1, 1131, 1106}, {1175, 1, 23, 2, 1114, 1104}, {1335, 1, 24, 3, 1118, 1083}, {1363, 1, 25, 3, 1095, 1092}, {1101, 1, 26, 3, 1109, 1098}, {1191, 1, 27, 3, 1115, 1105}, {3096, 1, 28, 2, 8428, 8429}, {1309, 1, 29, 3, 1090, 1088}, {1081, 1, 31, 3, 1111, 1100}, {1067, 1, 31, 3, 1110, 1099}, {1115, 1, 33, 5, 1112, 1101},/*Specials*/{4540, 1, 26, 1, 11459, 11461}},
            {{1207, 1, 30, 1, 1125, 1094}, {1353, 1, 31, 1, 1126, 1091}, {1424, 1, 32, 1, 1129, 1093}, {1141, 1, 33, 1, 1127, 1102}, {1281, 1, 34, 1, 1128, 1085}, {821, 10, 34, 1, 1124, 1107}, {1539, 15, 34, 1, 13357, 13358}, {41, 15, 35, 1, 1130, 1108}, {1325, 1, 35, 2, 1116, 1087}, {1295, 1, 36, 2, 1089, 1086}, {1157, 1, 37, 2, 1113, 1103}, {865, 5, 37, 1, 1131, 1106}, {1177, 1, 38, 2, 1114, 1104}, {1339, 1, 39, 3, 1118, 1083}, {1365, 1, 40, 3, 1095, 1092}, {1105, 1, 41, 3, 1109, 1098}, {1193, 1, 42, 3, 1115, 1105}, {3097, 1, 43, 2, 8428, 8429}, {1311, 1, 44, 3, 1090, 1088}, {1083, 1, 46, 3, 1111, 1100}, {1069, 1, 46, 3, 1110, 1099}, {1119, 1, 48, 5, 1112, 1101},/*Specials*/{4544, 1, 49, 1, 11459, 11461}, {2370, 1, 36, 1, 1135, 1134}},
            {{1209, 1, 50, 1, 1125, 1094}, {1355, 1, 51, 1, 1126, 1091}, {1428, 1, 52, 1, 1129, 1093}, {1143, 1, 53, 1, 1127, 1102}, {1285, 1, 53, 1, 1128, 1085}, {822, 10, 54, 1, 1124, 1107}, {4822, 15, 54, 1, 13357, 13358}, {42, 15, 55, 1, 1130, 1108}, {1329, 1, 55, 2, 1116, 1087}, {1299, 1, 56, 2, 1089, 1086}, {1159, 1, 57, 2, 1113, 1103}, {866, 5, 57, 1, 1131, 1106}, {1181, 1, 58, 2, 1114, 1104}, {1343, 1, 59, 3, 1118, 1083}, {1369, 1, 60, 3, 1095, 1092}, {1109, 1, 61, 3, 1109, 1098}, {1197, 1, 62, 3, 1115, 1105}, {3099, 1, 63, 2, 8428, 8429}, {1315, 1, 64, 3, 1090, 1088}, {1085, 1, 66, 3, 1111, 1100}, {1071, 1, 66, 3, 1110, 1099}, {1121, 1, 68, 5, 1112, 1101}},
            {{1211, 1, 70, 1, 1125, 1094}, {1357, 1, 71, 1, 1126, 1091}, {1430, 1, 72, 1, 1129, 1093}, {1145, 1, 73, 1, 1127, 1102}, {1287, 1, 74, 1, 1128, 1085}, {823, 10, 74, 1, 1124, 1107}, {4823, 15, 74, 1, 13357, 13358}, {43, 15, 75, 1, 1130, 1108}, {1331, 1, 75, 2, 1116, 1087}, {1301, 1, 76, 2, 1089, 1086}, {1161, 1, 77, 2, 1113, 1103}, {867, 5, 77, 1, 1131, 1106}, {1183, 1, 78, 2, 1114, 1104}, {1345, 1, 79, 3, 1118, 1083}, {1371, 1, 80, 3, 1095, 1092}, {1111, 1, 81, 3, 1109, 1098}, {1199, 1, 82, 3, 1115, 1105}, {3100, 1, 83, 2, 8428, 8429}, {1317, 1, 84, 3, 1090, 1088}, {1091, 1, 86, 3, 1111, 1100}, {1073, 1, 86, 3, 1110, 1099}, {1123, 1, 88, 5, 1112, 1101}},
            {{1213, 1, 85, 1, 1125, 1094}, {1359, 1, 86, 1, 1126, 1091}, {1432, 1, 87, 1, 1129, 1093}, {1147, 1, 88, 1, 1127, 1102}, {1289, 1, 89, 1, 1128, 1085}, {824, 10, 89, 1, 1124, 1107}, {4824, 15, 89, 1, 13357, 13358}, {44, 15, 90, 1, 1130, 1108}, {1333, 1, 90, 2, 1116, 1087}, {1303, 1, 91, 2, 1089, 1086}, {1163, 1, 92, 2, 1113, 1103}, {868, 5, 92, 1, 1131, 1106}, {1185, 1, 93, 2, 1114, 1104}, {1347, 1, 94, 3, 1118, 1083}, {1373, 1, 95, 3, 1095, 1092}, {1113, 1, 96, 3, 1109, 1098}, {1201, 1, 97, 3, 1115, 1105}, {3101, 1, 98, 2, 8428, 8429}, {1319, 1, 99, 3, 1090, 1088}, {1093, 1, 99, 3, 1111, 1100}, {1079, 1, 99, 3, 1110, 1099}, {1127, 1, 99, 5, 1112, 1101}}
//			0			1			2			3			4			5			6				7			8			9			10			11			12			13			14			15			16		17				18			19			20			21				22			23
//			dagger			axe			mace			medium			sword			dart tips		nails				arrow heads		scimitar		long sword		full helmet		knives			square			warhammer		battle axe		chain			kite		claws				2-handed		skirt			legs			body				lantern/wire		studs
    };
    public static int SmithingItems[][] = new int[5][5];

    public static boolean[] itemStackable = new boolean[7000];
    public static boolean[] itemIsNote = new boolean[7000];
    public static boolean[] itemTwoHanded = new boolean[7000];
    public static boolean[] itemTradeable = new boolean[7000];
    public static boolean[] itemSellable = new boolean[7000];

    static {
        int counter = 0;
        int c;
        try {
            FileInputStream dataIn = new FileInputStream(new File(server.workingDir + "data/stackable.dat"));
            while ((c = dataIn.read()) != -1) {
                if (c == 0)
                    itemStackable[counter] = false;
                else
                    itemStackable[counter] = true;
                counter++;
            }
            dataIn.close();
        } catch (IOException e) {
            System.out.println("Critical error while loading stackabledata! Trace:");
            e.printStackTrace();
        }

        counter = 0;
        try {
            FileInputStream dataIn = new FileInputStream(new File(server.workingDir + "data/notes.dat"));
            while ((c = dataIn.read()) != -1) {
                if (c == 0)
                    itemIsNote[counter] = true;
                else
                    itemIsNote[counter] = false;
                counter++;
            }
            dataIn.close();
        } catch (IOException e) {
            System.out.println("Critical error while loading notedata! Trace:");
            e.printStackTrace();
        }

        counter = 0;
        try {
            FileInputStream dataIn = new FileInputStream(new File(server.workingDir + "data/twohanded.dat"));
            while ((c = dataIn.read()) != -1) {
                if (c == 0)
                    itemTwoHanded[counter] = false;
                else
                    itemTwoHanded[counter] = true;
                counter++;
            }
            dataIn.close();
        } catch (IOException e) {
            System.out.println("Critical error while loading twohanded! Trace:");
            e.printStackTrace();
        }

        counter = 0;
        try {
            FileInputStream dataIn = new FileInputStream(new File(server.workingDir + "data/tradeable.dat"));
            while ((c = dataIn.read()) != -1) {
                if (c == 0)
                    itemTradeable[counter] = false;
                else
                    itemTradeable[counter] = true;
                counter++;
            }
            dataIn.close();
        } catch (IOException e) {
            System.out.println("Critical error while loading tradeable! Trace:");
            e.printStackTrace();
        }

        counter = 0;
        try {
            FileInputStream dataIn = new FileInputStream(new File(server.workingDir + "data/sellable.dat"));
            while ((c = dataIn.read()) != -1) {
                if (c == 0)
                    itemSellable[counter] = true;
                else
                    itemSellable[counter] = false;
                counter++;
            }
            dataIn.close();
        } catch (IOException e) {
            System.out.println("Critical error while loading sellable! Trace:");
            e.printStackTrace();
        }
    }


    public static int randomCape() {
        return capes[(int) (Math.random() * capes.length)];
    }

    public static int randomBoots() {
        return boots[(int) (Math.random() * boots.length)];
    }

    public static int randomGloves() {
        return gloves[(int) (Math.random() * gloves.length)];
    }

    public static int randomShield() {
        return shields[(int) (Math.random() * shields.length)];
    }

    public static int randomHat() {
        return hats[(int) (Math.random() * hats.length)];
    }

    public static int randomAmulet() {
        return amulets[(int) (Math.random() * amulets.length)];
    }

    public static int randomArrows() {
        return arrows[(int) (Math.random() * arrows.length)];
    }

    public static int randomRing() {
        return rings[(int) (Math.random() * rings.length)];
    }

    public static int randomBody() {
        return body[(int) (Math.random() * body.length)];
    }

    public static int randomLegs() {
        return legs[(int) (Math.random() * legs.length)];
    }

    public static int randomPHat() {
        return crackers[(int) (Math.random() * crackers.length)];
    }

    public static int randomNGems() {
        return normal_gems[(int) (Math.random() * normal_gems.length)];
    }

    public static int randomSGems() {
        return shilo_gems[(int) (Math.random() * shilo_gems.length)];
    }


    public static boolean isPlate(int itemID) {
        for (int i = 0; i < platebody.length; i++)
            if (platebody[i] == itemID)
                return true;
        return false;
    }

    public static boolean isFullHelm(int itemID) {
        for (int i = 0; i < fullHelm.length; i++)
            if (fullHelm[i] == itemID)
                return true;
        return false;
    }

    public static boolean isFullMask(int itemID) {
        for (int i = 0; i < fullMask.length; i++)
            if (fullMask[i] == itemID)
                return true;
        return false;
    }
}