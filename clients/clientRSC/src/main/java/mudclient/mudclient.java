package mudclient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class mudclient extends GameAppletMiddleMan {
    
    public static final void main(String args[]) {
        mudclient mud = new mudclient();
        mud.createWindow(mud.windowWidth, mud.windowHeight + 11, "MoparClassic", false);
        mud.gameMinThreadSleepTime = 10;
    }

    private final void menuClick(int l) {
        int actionX = menuActionX[l];
        int actionY = menuActionY[l];
        int actionType = menuActionType[l];
        int actionVar1 = menuActionVar1[l];
        int actionVar2 = menuActionVar2[l];
        int actionID = menuActionID[l];
        if(actionID == 200) {
            walkToGroundItem(sectionX, sectionY, actionX, actionY, true);
            super.streamClass.createPacket(104);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedSpell = -1;
        }
        if(actionID == 210) {
            walkToGroundItem(sectionX, sectionY, actionX, actionY, true);
            super.streamClass.createPacket(34);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedItem = -1;
        }
        if(actionID == 220) {
            walkToGroundItem(sectionX, sectionY, actionX, actionY, true);
            super.streamClass.createPacket(245);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
        }
        if(actionID == 3200)
            displayMessage(Data.itemDescription[actionType], 3);
        if(actionID == 300) {
            walkToWallObject(actionX, actionY, actionType);
            super.streamClass.createPacket(67);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addByte(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedSpell = -1;
        }
        if(actionID == 310) {
            walkToWallObject(actionX, actionY, actionType);
            super.streamClass.createPacket(36);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addByte(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedItem = -1;
        }
        if(actionID == 320) {
            walkToWallObject(actionX, actionY, actionType);
            super.streamClass.createPacket(126);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addByte(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 2300) {
            walkToWallObject(actionX, actionY, actionType);
            super.streamClass.createPacket(235);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addByte(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 3300)
            displayMessage(Data.wallObjectDescription[actionType], 3);
        if(actionID == 400) {
            walkToObject(actionX, actionY, actionType, actionVar1);
            super.streamClass.createPacket(17);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addShort(actionVar2);
            super.streamClass.formatPacket();
            selectedSpell = -1;
        }
        if(actionID == 410) {
            walkToObject(actionX, actionY, actionType, actionVar1);
            super.streamClass.createPacket(94);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addShort(actionVar2);
            super.streamClass.formatPacket();
            selectedItem = -1;
        }
        if(actionID == 420) {
            walkToObject(actionX, actionY, actionType, actionVar1);
            super.streamClass.createPacket(51);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.formatPacket();
        }
        if(actionID == 2400) {
            walkToObject(actionX, actionY, actionType, actionVar1);
            super.streamClass.createPacket(40);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.formatPacket();
        }
        if(actionID == 3400)
            displayMessage(Data.objectDescription[actionType], 3);
        if(actionID == 600) {
            super.streamClass.createPacket(49);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedSpell = -1;
        }
        if(actionID == 610) {
            super.streamClass.createPacket(27);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedItem = -1;
        }
        if(actionID == 620) {
            super.streamClass.createPacket(92);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 630) {
            super.streamClass.createPacket(181);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 640) {
            super.streamClass.createPacket(89);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 650) {
            selectedItem = actionType;
            drawMenuTab = 0;
            selectedItemName = Data.itemName[inventoryItems[selectedItem]];
        }
        if(actionID == 660) {
            super.streamClass.createPacket(147);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
            selectedItem = -1;
            drawMenuTab = 0;
            displayMessage("Dropping " + Data.itemName[inventoryItems[actionType]], 4);
        }
        if(actionID == 3600)
            displayMessage(Data.itemDescription[actionType], 3);
        if(actionID == 700) {
            int k2 = (actionX - 64) / magicLoc;
            int k4 = (actionY - 64) / magicLoc;
            walkTo1Tile(sectionX, sectionY, k2, k4, true);
            super.streamClass.createPacket(71);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedSpell = -1;
        }
        if(actionID == 710) {
            int l2 = (actionX - 64) / magicLoc;
            int l4 = (actionY - 64) / magicLoc;
            walkTo1Tile(sectionX, sectionY, l2, l4, true);
            super.streamClass.createPacket(142);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedItem = -1;
        }
        if(actionID == 720) {
            int i3 = (actionX - 64) / magicLoc;
            int i5 = (actionY - 64) / magicLoc;
            walkTo1Tile(sectionX, sectionY, i3, i5, true);
            super.streamClass.createPacket(177);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 725) {
            int j3 = (actionX - 64) / magicLoc;
            int j5 = (actionY - 64) / magicLoc;
            walkTo1Tile(sectionX, sectionY, j3, j5, true);
            super.streamClass.createPacket(74);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 715 || actionID == 2715) {
            int k3 = (actionX - 64) / magicLoc;
            int k5 = (actionY - 64) / magicLoc;
            walkTo1Tile(sectionX, sectionY, k3, k5, true);
            super.streamClass.createPacket(73);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 3700)
            displayMessage(Data.npcDescription[actionType], 3);
        if(actionID == 800) {
            int l3 = (actionX - 64) / magicLoc;
            int l5 = (actionY - 64) / magicLoc;
            walkTo1Tile(sectionX, sectionY, l3, l5, true);
            super.streamClass.createPacket(55);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedSpell = -1;
        }
        if(actionID == 810) {
            int i4 = (actionX - 64) / magicLoc;
            int i6 = (actionY - 64) / magicLoc;
            walkTo1Tile(sectionX, sectionY, i4, i6, true);
            super.streamClass.createPacket(16);
            super.streamClass.addShort(actionType);
            super.streamClass.addShort(actionVar1);
            super.streamClass.formatPacket();
            selectedItem = -1;
        }
        if(actionID == 805 || actionID == 2805) {
            int j4 = (actionX - 64) / magicLoc;
            int j6 = (actionY - 64) / magicLoc;
            walkTo1Tile(sectionX, sectionY, j4, j6, true);
            super.streamClass.createPacket(57);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 2806) {
            super.streamClass.createPacket(222);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 2810) {
            super.streamClass.createPacket(166);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 2820) {
            super.streamClass.createPacket(68);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
        }
        if(actionID == 900) {
            walkTo1Tile(sectionX, sectionY, actionX, actionY, true);
            super.streamClass.createPacket(232);
            super.streamClass.addShort(actionX + areaX);
            super.streamClass.addShort(actionY + areaY);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
            selectedSpell = -1;
        }
        if(actionID == 920) {
            walkTo1Tile(sectionX, sectionY, actionX, actionY, false);
            if(actionPictureType == -24)
                actionPictureType = 24;
        }
        if(actionID == 1000) {
            super.streamClass.createPacket(206);
            super.streamClass.addShort(actionType);
            super.streamClass.formatPacket();
            selectedSpell = -1;
        }
        if(actionID == 4000) {
            selectedItem = -1;
            selectedSpell = -1;
        }
    }

    protected final void resetIntVars() {
        systemUpdate = 0;
        loginScreen = 0;
        loggedIn = 0;
        logoutTimer = 0;
    }

    private final void drawReportAbuseBox1() {
        reportAbuseOptionSelected = 0;
        int yOffset = 135;
        for(int option = 0; option < 12; option++) {
            if(super.mouseX > 66 && super.mouseX < 446 && super.mouseY >= yOffset - 12 && super.mouseY < yOffset + 3)
                reportAbuseOptionSelected = option + 1;
            yOffset += 14;
        }

        if(mouseButtonClick != 0 && reportAbuseOptionSelected != 0) {
            mouseButtonClick = 0;
            showAbuseBox = 2;
            super.inputText = "";
            super.enteredInputText = "";
            return;
        }
        yOffset += 15;
        if(mouseButtonClick != 0) {
            mouseButtonClick = 0;
            if(super.mouseX < 56 || super.mouseY < 35 || super.mouseX > 456 || super.mouseY > 325) {
                showAbuseBox = 0;
                return;
            }
            if(super.mouseX > 66 && super.mouseX < 446 && super.mouseY >= yOffset - 15 && super.mouseY < yOffset + 5) {
                showAbuseBox = 0;
                return;
            }
        }
        gameGraphics.drawBox(56, 35, 400, 290, 0);
        gameGraphics.drawBoxEdge(56, 35, 400, 290, 0xffffff);
        yOffset = 50;
        gameGraphics.drawText("This form is for reporting players who are breaking our rules", 256, yOffset, 1, 0xffffff);
        yOffset += 15;
        gameGraphics.drawText("Using it sends a snapshot of the last 60 secs of activity to us", 256, yOffset, 1, 0xffffff);
        yOffset += 15;
        gameGraphics.drawText("If you misuse this form, you will be banned.", 256, yOffset, 1, 0xff8000);
        yOffset += 15;
        yOffset += 10;
        gameGraphics.drawText("First indicate which of our 12 rules is being broken. For a detailed", 256, yOffset, 1, 0xffff00);
        yOffset += 15;
        gameGraphics.drawText("explanation of each rule please read the manual on our website.", 256, yOffset, 1, 0xffff00);
        yOffset += 15;
        int j1;
        if(reportAbuseOptionSelected == 1) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("1: Offensive language", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 2) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("2: Item scamming", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 3) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("3: Password scamming", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 4) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("4: Bug abuse", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 5) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("5: Jagex Staff impersonation", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 6) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("6: Account sharing/trading", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 7) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("7: Macroing", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 8) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("8: Mutiple logging in", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 9) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("9: Encouraging others to break rules", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 10) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("10: Misuse of customer support", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 11) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("11: Advertising / website", 256, yOffset, 1, j1);
        yOffset += 14;
        if(reportAbuseOptionSelected == 12) {
            gameGraphics.drawBoxEdge(66, yOffset - 12, 380, 15, 0xffffff);
            j1 = 0xff8000;
        } else {
            j1 = 0xffffff;
        }
        gameGraphics.drawText("12: Real world item trading", 256, yOffset, 1, j1);
        yOffset += 14;
        yOffset += 15;
        j1 = 0xffffff;
        if(super.mouseX > 196 && super.mouseX < 316 && super.mouseY > yOffset - 15 && super.mouseY < yOffset + 5)
            j1 = 0xffff00;
        gameGraphics.drawText("Click here to cancel", 256, yOffset, 1, j1);
    }

    private final void loadMap() {
        engineHandle.mapsFree = unpackData("maps.jag", "map", 70);
        engineHandle.mapsMembers = unpackData("maps.mem", "members map", 75);
        engineHandle.landscapeFree = unpackData("land.jag", "landscape", 80);
        engineHandle.landscapeMembers = unpackData("land.mem", "members landscape", 85);
    }

    private final void drawModel(int l, String s1) {
        int i1 = objectX[l];
        int j1 = objectY[l];
        int k1 = i1 - ourPlayer.currentX / 128;
        int l1 = j1 - ourPlayer.currentY / 128;
        byte byte0 = 7;
        if(i1 >= 0 && j1 >= 0 && i1 < 96 && j1 < 96 && k1 > -byte0 && k1 < byte0 && l1 > -byte0 && l1 < byte0) {
            gameCamera.removeModel(objectArray[l]);
            int i2 = Data.getModelNameIndex(s1);
            GameObject j2 = gameDataObjects[i2].cnj();
            gameCamera.addModel(j2);
            j2.cme(true, 48, 48, -50, -10, -50);
            j2.cnl(objectArray[l]);
            j2.index = l;
            objectArray[l] = j2;
        }
    }
    
    final void drawPlayer(int x, int y, int width, int height, int arg4, int arg5, int arg6) {
        Mob f1 = playerArray[arg4];
        if(f1.bottomColour == 255)// TODO this checks if the player is an invisible moderator
            return;
        int direction = f1.currentSprite + (cameraRotation + 16) / 32 & 7;
        boolean flag = false;
        int direction2 = direction;
        if(direction2 == 5) {
            direction2 = 3;
            flag = true;
        } else
        if(direction2 == 6) {
            direction2 = 2;
            flag = true;
        } else
        if(direction2 == 7) {
            direction2 = 1;
            flag = true;
        }
        int j1 = direction2 * 3 + walkModel[(f1.stepCount / 6) % 4];
        if(f1.currentSprite == 8) {
            direction2 = 5;
            direction = 2;
            flag = false;
            x -= (5 * arg6) / 100;
            j1 = direction2 * 3 + combatModelArray1[(tick / 5) % 8];
        } else
        if(f1.currentSprite == 9) {
            direction2 = 5;
            direction = 2;
            flag = true;
            x += (5 * arg6) / 100;
            j1 = direction2 * 3 + combatModelArray2[(tick / 6) % 8];
        }
        for(int k1 = 0; k1 < 12; k1++) {
            int l1 = animationModelArray[direction][k1];
            int l2 = f1.appearanceItems[l1] - 1;
            if(l2 > Data.animationCount - 1)
                continue;
            if(l2 >= 0) {
                int k3 = 0;
                int i4 = 0;
                int j4 = j1;
                if(flag && direction2 >= 1 && direction2 <= 3)
                    if(Data.animationHasF[l2] == 1)
                        j4 += 15;
                    else
                    if(l1 == 4 && direction2 == 1) {
                        k3 = -22;
                        i4 = -3;
                        j4 = direction2 * 3 + walkModel[(2 + f1.stepCount / 6) % 4];
                    } else
                    if(l1 == 4 && direction2 == 2) {
                        k3 = 0;
                        i4 = -8;
                        j4 = direction2 * 3 + walkModel[(2 + f1.stepCount / 6) % 4];
                    } else
                    if(l1 == 4 && direction2 == 3) {
                        k3 = 26;
                        i4 = -5;
                        j4 = direction2 * 3 + walkModel[(2 + f1.stepCount / 6) % 4];
                    } else
                    if(l1 == 3 && direction2 == 1) {
                        k3 = 22;
                        i4 = 3;
                        j4 = direction2 * 3 + walkModel[(2 + f1.stepCount / 6) % 4];
                    } else
                    if(l1 == 3 && direction2 == 2) {
                        k3 = 0;
                        i4 = 8;
                        j4 = direction2 * 3 + walkModel[(2 + f1.stepCount / 6) % 4];
                    } else
                    if(l1 == 3 && direction2 == 3) {
                        k3 = -26;
                        i4 = 5;
                        j4 = direction2 * 3 + walkModel[(2 + f1.stepCount / 6) % 4];
                    }
                if(direction2 != 5 || Data.animationHasA[l2] == 1) {
                    int k4 = j4 + Data.animationNumber[l2];
                    k3 = (k3 * width) / ((GameImage) (gameGraphics)).pictureAssumedWidth[k4];
                    i4 = (i4 * height) / ((GameImage) (gameGraphics)).pictureAssumedHeight[k4];
                    int l4 = (width * ((GameImage) (gameGraphics)).pictureAssumedWidth[k4]) / ((GameImage) (gameGraphics)).pictureAssumedWidth[Data.animationNumber[l2]];
                    k3 -= (l4 - width) / 2;
                    int i5 = Data.animationCharacterColor[l2];
                    int j5 = appearanceSkinColours[f1.skinColour];
                    if(i5 == 1)
                        i5 = appearanceHairColours[f1.hairColour];
                    else
                    if(i5 == 2)
                        i5 = appearanceTopBottomColours[f1.topColour];
                    else
                    if(i5 == 3)
                        i5 = appearanceTopBottomColours[f1.bottomColour];
                    gameGraphics.drawImage(x + k3, y + i4, l4, height, k4, i5, j5, arg5, flag);
                }
            }
        }

        if(f1.lastMessageTimeout > 0) {
            receivedMessageMidPoint[receivedMessagesCount] = gameGraphics.textWidth(f1.lastMessage, 1) / 2;
            if(receivedMessageMidPoint[receivedMessagesCount] > 150)
                receivedMessageMidPoint[receivedMessagesCount] = 150;
            receivedMessageHeight[receivedMessagesCount] = (gameGraphics.textWidth(f1.lastMessage, 1) / 300) * gameGraphics.textHeightNumber(1);
            receivedMessageX[receivedMessagesCount] = x + width / 2;
            receivedMessageY[receivedMessagesCount] = y;
            receivedMessages[receivedMessagesCount++] = f1.lastMessage;
        }
        if(f1.playerSkullTimeout > 0) {
            itemAboveHeadX[itemsAboveHeadCount] = x + width / 2;
            itemAboveHeadY[itemsAboveHeadCount] = y;
            itemAboveHeadScale[itemsAboveHeadCount] = arg6;
            itemAboveHeadID[itemsAboveHeadCount++] = f1.itemAboveHeadID;
        }
        if(f1.currentSprite == 8 || f1.currentSprite == 9 || f1.combatTimer != 0) {
            if(f1.combatTimer > 0) {
                int i2 = x;
                if(f1.currentSprite == 8)
                    i2 -= (20 * arg6) / 100;
                else
                if(f1.currentSprite == 9)
                    i2 += (20 * arg6) / 100;
                int i3 = (f1.currentHits * 30) / f1.baseHits;
                healthBarX[healthBarVisibleCount] = i2 + width / 2;
                healthBarY[healthBarVisibleCount] = y;
                healthBarMissing[healthBarVisibleCount++] = i3;
            }
            if(f1.combatTimer > 150) {
                int j2 = x;
                if(f1.currentSprite == 8)
                    j2 -= (10 * arg6) / 100;
                else
                if(f1.currentSprite == 9)
                    j2 += (10 * arg6) / 100;
                gameGraphics.drawPicture((j2 + width / 2) - 12, (y + height / 2) - 12, baseInventoryPic + 11);
                gameGraphics.drawText(String.valueOf(f1.lastDamageCount), (j2 + width / 2) - 1, y + height / 2 + 5, 3, 0xffffff);
            }
        }
        if(f1.playerSkulled == 1 && f1.playerSkullTimeout == 0) {
            int k2 = arg5 + x + width / 2;
            if(f1.currentSprite == 8)
                k2 -= (20 * arg6) / 100;
            else
            if(f1.currentSprite == 9)
                k2 += (20 * arg6) / 100;
            int j3 = (16 * arg6) / 100;
            int l3 = (16 * arg6) / 100;
            gameGraphics.ccc(k2 - j3 / 2, y - l3 / 2 - (10 * arg6) / 100, j3, l3, baseInventoryPic + 13);
        }
    }

    private final void walkToWallObject(int x, int y, int direction) {
        if(direction == 0) {
            walkTo(sectionX, sectionY, x, y - 1, x, y, false, true);
            return;
        }
        if(direction == 1) {
            walkTo(sectionX, sectionY, x - 1, y, x, y, false, true);
            return;
        } else {
            walkTo(sectionX, sectionY, x, y, x, y, true, true);
            return;
        }
    }

    private final void drawDuelConfirmBox() {
        byte byte0 = 22;
        byte byte1 = 36;
        gameGraphics.drawBox(byte0, byte1, 468, 16, 192);
        int l = 0x989898;
        gameGraphics.drawBoxAlpha(byte0, byte1 + 16, 468, 246, l, 160);
        gameGraphics.drawText("Please confirm your duel with @yel@" + DataOperations.hashToName(duelOpponentHash), byte0 + 234, byte1 + 12, 1, 0xffffff);
        gameGraphics.drawText("Your stake:", byte0 + 117, byte1 + 30, 1, 0xffff00);
        for(int i1 = 0; i1 < duelOurStakeCount; i1++) {
            String s1 = Data.itemName[duelOurStakeItem[i1]];
            if(Data.itemStackable[duelOurStakeItem[i1]] == 0)
                s1 = s1 + " x " + formatItemCount(duelOurStakeItemCount[i1]);
            gameGraphics.drawText(s1, byte0 + 117, byte1 + 42 + i1 * 12, 1, 0xffffff);
        }

        if(duelOurStakeCount == 0)
            gameGraphics.drawText("Nothing!", byte0 + 117, byte1 + 42, 1, 0xffffff);
        gameGraphics.drawText("Your opponent's stake:", byte0 + 351, byte1 + 30, 1, 0xffff00);
        for(int j1 = 0; j1 < duelOpponentStakeCount; j1++) {
            String s2 = Data.itemName[duelOpponentStakeItem[j1]];
            if(Data.itemStackable[duelOpponentStakeItem[j1]] == 0)
                s2 = s2 + " x " + formatItemCount(duelOutStakeItemCount[j1]);
            gameGraphics.drawText(s2, byte0 + 351, byte1 + 42 + j1 * 12, 1, 0xffffff);
        }

        if(duelOpponentStakeCount == 0)
            gameGraphics.drawText("Nothing!", byte0 + 351, byte1 + 42, 1, 0xffffff);
        if(duelRetreat == 0)
            gameGraphics.drawText("You can retreat from this duel", byte0 + 234, byte1 + 180, 1, 65280);
        else
            gameGraphics.drawText("No retreat is possible!", byte0 + 234, byte1 + 180, 1, 0xff0000);
        if(duelMagic == 0)
            gameGraphics.drawText("Magic may be used", byte0 + 234, byte1 + 192, 1, 65280);
        else
            gameGraphics.drawText("Magic cannot be used", byte0 + 234, byte1 + 192, 1, 0xff0000);
        if(duelPrayer == 0)
            gameGraphics.drawText("Prayer may be used", byte0 + 234, byte1 + 204, 1, 65280);
        else
            gameGraphics.drawText("Prayer cannot be used", byte0 + 234, byte1 + 204, 1, 0xff0000);
        if(duelWeapons == 0)
            gameGraphics.drawText("Weapons may be used", byte0 + 234, byte1 + 216, 1, 65280);
        else
            gameGraphics.drawText("Weapons cannot be used", byte0 + 234, byte1 + 216, 1, 0xff0000);
        gameGraphics.drawText("If you are sure click 'Accept' to begin the duel", byte0 + 234, byte1 + 230, 1, 0xffffff);
        if(!duelConfirmOurAccepted) {
            gameGraphics.drawPicture((byte0 + 118) - 35, byte1 + 238, baseInventoryPic + 25);
            gameGraphics.drawPicture((byte0 + 352) - 35, byte1 + 238, baseInventoryPic + 26);
        } else {
            gameGraphics.drawText("Waiting for other player...", byte0 + 234, byte1 + 250, 1, 0xffff00);
        }
        if(mouseButtonClick == 1) {
            if(super.mouseX < byte0 || super.mouseY < byte1 || super.mouseX > byte0 + 468 || super.mouseY > byte1 + 262) {
                showDuelConfirmBox = false;
                super.streamClass.createPacket(35);
                super.streamClass.formatPacket();
            }
            if(super.mouseX >= (byte0 + 118) - 35 && super.mouseX <= byte0 + 118 + 70 && super.mouseY >= byte1 + 238 && super.mouseY <= byte1 + 238 + 21) {
                duelConfirmOurAccepted = true;
                super.streamClass.createPacket(87);
                super.streamClass.formatPacket();
            }
            if(super.mouseX >= (byte0 + 352) - 35 && super.mouseX <= byte0 + 353 + 70 && super.mouseY >= byte1 + 238 && super.mouseY <= byte1 + 238 + 21) {
                showDuelConfirmBox = false;
                super.streamClass.createPacket(35);
                super.streamClass.formatPacket();
            }
            mouseButtonClick = 0;
        }
    }

    private final void setLoginVars() {
        loggedIn = 0;
        loginScreen = 0;
        loginUsername = "";
        loginPassword = "";
        /*dja = "Please enter a username:";
        djb = "*" + loginUsername + "*";*/
        playerCount = 0;
        npcCount = 0;
    }

    protected final void close() {
        requestLogout();
        cleanUp();
        if(audioPlayer != null)
            audioPlayer.stop();
    }

    protected final Socket makeSocket(String address, int port)
        throws IOException {
        if(link.gameApplet != null) {
            Socket socket = link.getSocket(port);
            if(socket == null)
                throw new IOException();
            else
                return socket;
        }
        Socket socket1 = new Socket(InetAddress.getByName(address), port);
        socket1.setSoTimeout(30000);
        socket1.setTcpNoDelay(true);
        return socket1;
    }

    private final void drawInventoryMenu(boolean canRightClick) {
        int l = ((GameImage) (gameGraphics)).gameWidth - 248;
        gameGraphics.drawPicture(l, 3, baseInventoryPic + 1);
        for(int i1 = 0; i1 < maxInventoryItems; i1++) {
            int j1 = l + (i1 % 5) * 49;
            int l1 = 36 + (i1 / 5) * 34;
            if(i1 < inventoryItemsCount && inventoryItemEquipped[i1] == 1)
                gameGraphics.drawBoxAlpha(j1, l1, 49, 34, 0xff0000, 128);
            else
                gameGraphics.drawBoxAlpha(j1, l1, 49, 34, GameImage.rgbToInt(181, 181, 181), 128);
            if(i1 < inventoryItemsCount) {
                gameGraphics.drawImage(j1, l1, 48, 32, baseItemPicture + Data.itemInventoryPicture[inventoryItems[i1]], Data.itemPictureMask[inventoryItems[i1]], 0, 0, false);
                if(Data.itemStackable[inventoryItems[i1]] == 0)
                    gameGraphics.drawString(String.valueOf(inventoryItemCount[i1]), j1 + 1, l1 + 10, 1, 0xffff00);
            }
        }

        for(int k1 = 1; k1 <= 4; k1++)
            gameGraphics.drawLineY(l + k1 * 49, 36, (maxInventoryItems / 5) * 34, 0);

        for(int i2 = 1; i2 <= maxInventoryItems / 5 - 1; i2++)
            gameGraphics.drawLineX(l, 36 + i2 * 34, 245, 0);

        if(!canRightClick)
            return;
        l = super.mouseX - (((GameImage) (gameGraphics)).gameWidth - 248);
        int j2 = super.mouseY - 36;
        if(l >= 0 && j2 >= 0 && l < 248 && j2 < (maxInventoryItems / 5) * 34) {
            int k2 = l / 49 + (j2 / 34) * 5;
            if(k2 < inventoryItemsCount) {
                int l2 = inventoryItems[k2];
                if(selectedSpell >= 0) {
                    if(Data.spellType[selectedSpell] == 3) {
                        menuText1[menuOptionsCount] = "Cast " + Data.spellName[selectedSpell] + " on";
                        menuText2[menuOptionsCount] = "@lre@" + Data.itemName[l2];
                        menuActionID[menuOptionsCount] = 600;
                        menuActionType[menuOptionsCount] = k2;
                        menuActionVar1[menuOptionsCount] = selectedSpell;
                        menuOptionsCount++;
                        return;
                    }
                } else {
                    if(selectedItem >= 0) {
                        menuText1[menuOptionsCount] = "Use " + selectedItemName + " with";
                        menuText2[menuOptionsCount] = "@lre@" + Data.itemName[l2];
                        menuActionID[menuOptionsCount] = 610;
                        menuActionType[menuOptionsCount] = k2;
                        menuActionVar1[menuOptionsCount] = selectedItem;
                        menuOptionsCount++;
                        return;
                    }
                    if(inventoryItemEquipped[k2] == 1) {
                        menuText1[menuOptionsCount] = "Remove";
                        menuText2[menuOptionsCount] = "@lre@" + Data.itemName[l2];
                        menuActionID[menuOptionsCount] = 620;
                        menuActionType[menuOptionsCount] = k2;
                        menuOptionsCount++;
                    } else
                    if(Data.itemIsEquippable[l2] != 0) {
                        if((Data.itemIsEquippable[l2] & 0x18) != 0)
                            menuText1[menuOptionsCount] = "Wield";
                        else
                            menuText1[menuOptionsCount] = "Wear";
                        menuText2[menuOptionsCount] = "@lre@" + Data.itemName[l2];
                        menuActionID[menuOptionsCount] = 630;
                        menuActionType[menuOptionsCount] = k2;
                        menuOptionsCount++;
                    }
                    if(!Data.itemCommand[l2].equals("")) {
                        menuText1[menuOptionsCount] = Data.itemCommand[l2];
                        menuText2[menuOptionsCount] = "@lre@" + Data.itemName[l2];
                        menuActionID[menuOptionsCount] = 640;
                        menuActionType[menuOptionsCount] = k2;
                        menuOptionsCount++;
                    }
                    menuText1[menuOptionsCount] = "Use";
                    menuText2[menuOptionsCount] = "@lre@" + Data.itemName[l2];
                    menuActionID[menuOptionsCount] = 650;
                    menuActionType[menuOptionsCount] = k2;
                    menuOptionsCount++;
                    menuText1[menuOptionsCount] = "Drop";
                    menuText2[menuOptionsCount] = "@lre@" + Data.itemName[l2];
                    menuActionID[menuOptionsCount] = 660;
                    menuActionType[menuOptionsCount] = k2;
                    menuOptionsCount++;
                    menuText1[menuOptionsCount] = "Examine";
                    menuText2[menuOptionsCount] = "@lre@" + Data.itemName[l2];
                    menuActionID[menuOptionsCount] = 3600;
                    menuActionType[menuOptionsCount] = l2;
                    menuOptionsCount++;
                }
            }
        }
    }

    private final void createLoginScreenBackgrounds() {
        int l = 0;
        byte byte0 = 50;
        byte byte1 = 50;
        engineHandle.loadSection(byte0 * 48 + 23, byte1 * 48 + 23, l);
        engineHandle.glg(gameDataObjects);
        char c1 = '\u2600';
        char c2 = '\u1900';
        char c3 = '\u044C';
        char c4 = '\u0378';
        gameCamera.zoom1 = 4100;
        gameCamera.zoom2 = 4100;
        gameCamera.zoom3 = 1;
        gameCamera.zoom4 = 4000;
        gameCamera.setCamera(c1, -engineHandle.getAveragedElevation(c1, c2), c2, 912, c4, 0, c3 * 2);
        gameCamera.finishCamera();
        gameGraphics.screenFadeToBlack();
        gameGraphics.screenFadeToBlack();
        gameGraphics.drawBox(0, 0, 512, 6, 0);
        for(int i1 = 6; i1 >= 1; i1--)
            gameGraphics.cbg(0, i1, 0, i1, 512, 8);

        gameGraphics.drawBox(0, 194, 512, 20, 0);
        for(int j1 = 6; j1 >= 1; j1--)
            gameGraphics.cbg(0, j1, 0, 194 - j1, 512, 8);

        if(bgPixels == null)
            gameGraphics.drawPicture(15, 15, baseInventoryPic + 10);
        else
            gameGraphics.drawPixels(bgPixels, 0, 0, bgPixels.length, bgPixels[0].length);
        gameGraphics.cca(baseLoginScreenBackgroundPic, 0, 0, 512, 200);
        gameGraphics.cbl(baseLoginScreenBackgroundPic);
        c1 = '\u2400';
        c2 = '\u2400';
        c3 = '\u044C';
        c4 = '\u0378';
        gameCamera.zoom1 = 4100;
        gameCamera.zoom2 = 4100;
        gameCamera.zoom3 = 1;
        gameCamera.zoom4 = 4000;
        gameCamera.setCamera(c1, -engineHandle.getAveragedElevation(c1, c2), c2, 912, c4, 0, c3 * 2);
        gameCamera.finishCamera();
        gameGraphics.screenFadeToBlack();
        gameGraphics.screenFadeToBlack();
        gameGraphics.drawBox(0, 0, 512, 6, 0);
        for(int k1 = 6; k1 >= 1; k1--)
            gameGraphics.cbg(0, k1, 0, k1, 512, 8);

        gameGraphics.drawBox(0, 194, 512, 20, 0);
        for(int l1 = 6; l1 >= 1; l1--)
            gameGraphics.cbg(0, l1, 0, 194 - l1, 512, 8);

        if(bgPixels == null)
            gameGraphics.drawPicture(15, 15, baseInventoryPic + 10);
        else
            gameGraphics.drawPixels(bgPixels, 0, 0, bgPixels.length, bgPixels[0].length);
        gameGraphics.cca(baseLoginScreenBackgroundPic + 1, 0, 0, 512, 200);
        gameGraphics.cbl(baseLoginScreenBackgroundPic + 1);
        for(int i2 = 0; i2 < 64; i2++) {
            gameCamera.removeModel(engineHandle.gih[0][i2]);
            gameCamera.removeModel(engineHandle.gim[1][i2]);
            gameCamera.removeModel(engineHandle.gih[1][i2]);
            gameCamera.removeModel(engineHandle.gim[2][i2]);
            gameCamera.removeModel(engineHandle.gih[2][i2]);
        }

        c1 = '\u2B80';
        c2 = '\u2880';
        c3 = '\u01F4';
        c4 = '\u0178';
        gameCamera.zoom1 = 4100;
        gameCamera.zoom2 = 4100;
        gameCamera.zoom3 = 1;
        gameCamera.zoom4 = 4000;
        gameCamera.setCamera(c1, -engineHandle.getAveragedElevation(c1, c2), c2, 912, c4, 0, c3 * 2);
        gameCamera.finishCamera();
        gameGraphics.screenFadeToBlack();
        gameGraphics.screenFadeToBlack();
        gameGraphics.drawBox(0, 0, 512, 6, 0);
        for(int j2 = 6; j2 >= 1; j2--)
            gameGraphics.cbg(0, j2, 0, j2, 512, 8);

        gameGraphics.drawBox(0, 194, 512, 20, 0);
        for(int k2 = 6; k2 >= 1; k2--)
            gameGraphics.cbg(0, k2, 0, 194, 512, 8);

        if(bgPixels == null)
            gameGraphics.drawPicture(15, 15, baseInventoryPic + 10);
        else
            gameGraphics.drawPixels(bgPixels, 0, 0, bgPixels.length, bgPixels[0].length);
        gameGraphics.cca(baseInventoryPic + 10, 0, 0, 512, 200);
        gameGraphics.cbl(baseInventoryPic + 10);
    }

    protected final void handlePacket(int packetID, int packetLength, byte packetData[]) {
        try {
            if(packetID == 145) {
                if(!hasWorldInfo)
                    return;
                lastPlayerCount = playerCount;
                for(int l = 0; l < lastPlayerCount; l++)
                    lastPlayerArray[l] = playerArray[l];

                int off = 8;
                sectionX = DataOperations.getBits(packetData, off, 11);
                off += 11;
                sectionY = DataOperations.getBits(packetData, off, 13);
                off += 13;
                int sprite = DataOperations.getBits(packetData, off, 4);
                off += 4;
                boolean sectionLoaded = loadSection(sectionX, sectionY);
                sectionX -= areaX;
                sectionY -= areaY;
                int mapEnterX = sectionX * magicLoc + 64;
                int mapEnterY = sectionY * magicLoc + 64;
                if(sectionLoaded) {
                    ourPlayer.waypointCurrent = 0;
                    ourPlayer.waypointsEndSprite = 0;
                    ourPlayer.currentX = ourPlayer.waypointsX[0] = mapEnterX;
                    ourPlayer.currentY = ourPlayer.waypointsY[0] = mapEnterY;
                }
                playerCount = 0;
                ourPlayer = makePlayer(serverIndex, mapEnterX, mapEnterY, sprite);
                int newPlayerCount = DataOperations.getBits(packetData, off, 8);
                off += 8;
                for(int currentNewPlayer = 0; currentNewPlayer < newPlayerCount; currentNewPlayer++) {
                    //Mob mob = lastPlayerArray[currentNewPlayer + 1];
                    Mob mob = getLastPlayer(DataOperations.getBits(packetData, off, 16));
                    off += 16;
                    int playerAtTile = DataOperations.getBits(packetData, off, 1);
                    off++;
                    if(playerAtTile != 0) {
                        int waypointsLeft = DataOperations.getBits(packetData, off, 1);
                        off++;
                        if(waypointsLeft == 0) {
                            int currentNextSprite = DataOperations.getBits(packetData, off, 3);
                            off += 3;
                            int currentWaypoint = mob.waypointCurrent;
                            int newWaypointX = mob.waypointsX[currentWaypoint];
                            int newWaypointY = mob.waypointsY[currentWaypoint];
                            if(currentNextSprite == 2 || currentNextSprite == 1 || currentNextSprite == 3)
                                newWaypointX += magicLoc;
                            if(currentNextSprite == 6 || currentNextSprite == 5 || currentNextSprite == 7)
                                newWaypointX -= magicLoc;
                            if(currentNextSprite == 4 || currentNextSprite == 3 || currentNextSprite == 5)
                                newWaypointY += magicLoc;
                            if(currentNextSprite == 0 || currentNextSprite == 1 || currentNextSprite == 7)
                                newWaypointY -= magicLoc;
                            mob.nextSprite = currentNextSprite;
                            mob.waypointCurrent = currentWaypoint = (currentWaypoint + 1) % 10;
                            mob.waypointsX[currentWaypoint] = newWaypointX;
                            mob.waypointsY[currentWaypoint] = newWaypointY;
                        } else {
                            int needsNextSprite = DataOperations.getBits(packetData, off, 4);
                            off += 4;
                            if((needsNextSprite & 0xc) == 12) {
                                continue;
                            }
                            mob.nextSprite = needsNextSprite;
                        }
                    }
                    playerArray[playerCount++] = mob;
                }

                int mobCount = 0;
                while(off + 24 < packetLength * 8)  {
                    int mobIndex = DataOperations.getBits(packetData, off, 16);
                    off += 16;
                    int areaMobX = DataOperations.getBits(packetData, off, 5);
                    off += 5;
                    if(areaMobX > 15)
                        areaMobX -= 32;
                    int areaMobY = DataOperations.getBits(packetData, off, 5);
                    off += 5;
                    if(areaMobY > 15)
                        areaMobY -= 32;
                    int mobSprite = DataOperations.getBits(packetData, off, 4);
                    off += 4;
                    int addIndex = DataOperations.getBits(packetData, off, 1);
                    off++;
                    int mobX = (sectionX + areaMobX) * magicLoc + 64;
                    int mobY = (sectionY + areaMobY) * magicLoc + 64;
                    makePlayer(mobIndex, mobX, mobY, mobSprite);
                    if(addIndex == 0)
                        playerBufferArrayIndexes[mobCount++] = mobIndex;
                }
                if(mobCount > 0) {
                    super.streamClass.createPacket(83);
                    super.streamClass.addShort(mobCount);
                    for(int k40 = 0; k40 < mobCount; k40++) {
                        Mob f5 = playerBufferArray[playerBufferArrayIndexes[k40]];
                        super.streamClass.addShort(f5.serverIndex);
                        super.streamClass.addShort(f5.serverID);
                    }

                    super.streamClass.formatPacket();
                    mobCount = 0;
                }
                return;
            }
            if(packetID == 109) {
                if(needsClear) {
                    for(int i = 0; i < groundItemID.length; i++) {
                        groundItemX[i] = -1;
                        groundItemY[i] = -1;
                        groundItemID[i] = -1;
                        groundItemObjectVar[i] = -1;
                    }
                    groundItemCount = 0;
                    needsClear = false;
                }
                for(int off = 1; off < packetLength;)
                    if(DataOperations.getByte(packetData[off]) == 255) {
                        int newCount = 0;
                        int newSectionX = sectionX + packetData[off + 1] >> 3;
                        int newSectionY = sectionY + packetData[off + 2] >> 3;
                        off += 3;
                        for(int groundItem = 0; groundItem < groundItemCount; groundItem++) {
                            int newX = (groundItemX[groundItem] >> 3) - newSectionX;
                            int newY = (groundItemY[groundItem] >> 3) - newSectionY;
                            if(newX != 0 || newY != 0) {
                                if(groundItem != newCount) {
                                    groundItemX[newCount] = groundItemX[groundItem];
                                    groundItemY[newCount] = groundItemY[groundItem];
                                    groundItemID[newCount] = groundItemID[groundItem];
                                    groundItemObjectVar[newCount] = groundItemObjectVar[groundItem];
                                }
                                newCount++;
                            }
                        }

                        groundItemCount = newCount;
                    } else {
                        int newID = DataOperations.getShort(packetData, off);
                        off += 2;
                        int newX = sectionX + packetData[off++];
                        int newY = sectionY + packetData[off++];
                        if((newID & 0x8000) == 0) {
                            groundItemX[groundItemCount] = newX;
                            groundItemY[groundItemCount] = newY;
                            groundItemID[groundItemCount] = newID;
                            groundItemObjectVar[groundItemCount] = 0;
                            for(int l23 = 0; l23 < objectCount; l23++) {
                                if(objectX[l23] != newX || objectY[l23] != newY)
                                    continue;
                                groundItemObjectVar[groundItemCount] = Data.objectGroundItemVar[objectType[l23]];
                                break;
                            }

                            groundItemCount++;
                        } else {
                            newID &= 0x7fff;
                            int i24 = 0;
                            for(int l26 = 0; l26 < groundItemCount; l26++)
                                if(groundItemX[l26] != newX || groundItemY[l26] != newY || groundItemID[l26] != newID) {
                                    if(l26 != i24) {
                                        groundItemX[i24] = groundItemX[l26];
                                        groundItemY[i24] = groundItemY[l26];
                                        groundItemID[i24] = groundItemID[l26];
                                        groundItemObjectVar[i24] = groundItemObjectVar[l26];
                                    }
                                    i24++;
                                } else {
                                    newID = -123;
                                }

                            groundItemCount = i24;
                        }
                    }

                return;
            }
            if(packetID == 27) {
                for(int off = 1; off < packetLength;)
                    if(DataOperations.getByte(packetData[off]) == 255) {
                        int newCount = 0;
                        int newSectionX = sectionX + packetData[off + 1] >> 3;
                        int newSectionY = sectionY + packetData[off + 2] >> 3;
                        off += 3;
                        for(int object = 0; object < objectCount; object++) {
                            int newX = (objectX[object] >> 3) - newSectionX;
                            int newY = (objectY[object] >> 3) - newSectionY;
                            if(newX != 0 || newY != 0) {
                                if(object != newCount) {
                                    objectArray[newCount] = objectArray[object];
                                    objectArray[newCount].index = newCount;
                                    objectX[newCount] = objectX[object];
                                    objectY[newCount] = objectY[object];
                                    objectType[newCount] = objectType[object];
                                    objectRotation[newCount] = objectRotation[object];
                                }
                                newCount++;
                            } else {
                                gameCamera.removeModel(objectArray[object]);
                                engineHandle.removeObject(objectX[object], objectY[object], objectType[object], objectRotation[object]);
                            }
                        }

                        objectCount = newCount;
                    } else {
                        int index = DataOperations.getShort(packetData, off);
                        off += 2;
                        int newSectionX = sectionX + packetData[off++];
                        int newSectionY = sectionY + packetData[off++];
                        int rotation = packetData[off++];
                        int newCount = 0;
                        for(int object = 0; object < objectCount; object++)
                            if(objectX[object] != newSectionX || objectY[object] != newSectionY || objectRotation[object] != rotation) {
                                if(object != newCount) {
                                    objectArray[newCount] = objectArray[object];
                                    objectArray[newCount].index = newCount;
                                    objectX[newCount] = objectX[object];
                                    objectY[newCount] = objectY[object];
                                    objectType[newCount] = objectType[object];
                                    objectRotation[newCount] = objectRotation[object];
                                }
                                newCount++;
                            } else {
                                gameCamera.removeModel(objectArray[object]);
                                engineHandle.removeObject(objectX[object], objectY[object], objectType[object], objectRotation[object]);
                            }

                        objectCount = newCount;
                        if(index != 60000) {
                            engineHandle.registerObjectDir(newSectionX, newSectionY, rotation);
                            int width;
                            int height;
                            if(rotation == 0 || rotation == 4) {
                                width = Data.objectWidth[index];
                                height = Data.objectHeight[index];
                            } else {
                                height = Data.objectWidth[index];
                                width = Data.objectHeight[index];
                            }
                            int l40 = ((newSectionX + newSectionX + width) * magicLoc) / 2;
                            int k42 = ((newSectionY + newSectionY + height) * magicLoc) / 2;
                            int model = Data.objectModelNumber[index];
                            GameObject gameObject = gameDataObjects[model].cnj();
                            gameCamera.addModel(gameObject);
                            gameObject.index = objectCount;
                            gameObject.cmi(0, rotation * 32, 0);
                            gameObject.cmk(l40, -engineHandle.getAveragedElevation(l40, k42), k42);
                            gameObject.cme(true, 48, 48, -50, -10, -50);
                            engineHandle.gla(newSectionX, newSectionY, index, rotation);
                            if(index == 74)
                                gameObject.cmk(0, -480, 0);
                            objectX[objectCount] = newSectionX;
                            objectY[objectCount] = newSectionY;
                            objectType[objectCount] = index;
                            objectRotation[objectCount] = rotation;
                            objectArray[objectCount++] = gameObject;
                        }
                    }

                return;
            }
            if(packetID == 114) {
                int off = 1;
                inventoryItemsCount = packetData[off++] & 0xff;
                for(int item = 0; item < inventoryItemsCount; item++) {
                    int data = DataOperations.getShort(packetData, off);
                    off += 2;
                    inventoryItems[item] = data & 0x7fff;
                    inventoryItemEquipped[item] = data / 32768;
                    if(Data.itemStackable[data & 0x7fff] == 0) {
                        inventoryItemCount[item] = DataOperations.getInt(packetData, off);
                        off += 4;
                    } else {
                        inventoryItemCount[item] = 1;
                    }
                }

                return;
            }
            if(packetID == 53) {
                int newMobCount = DataOperations.getShort(packetData, 1);
                int off = 3;
                for(int current = 0; current < newMobCount; current++) {
                    int index = DataOperations.getShort(packetData, off);
                    off += 2;
                    if(index < 0 || index > playerBufferArray.length)
                        return;
                    Mob mob = playerBufferArray[index];
                    if(mob == null)
                        return;
                    byte mobUpdateType = packetData[off];
                    off++;
                    if(mobUpdateType == 0) {
                        int j30 = DataOperations.getShort(packetData, off);
                        off += 2;
                        if(mob != null) {
                            mob.playerSkullTimeout = 150;
                            mob.itemAboveHeadID = j30;
                        }
                    } else
                    if(mobUpdateType == 1) {
                        byte byte7 = packetData[off];
                        off++;
                        String s3 = ChatMessage.bytesToString(packetData, off, byte7);
                        if(useChatFilter)
                            s3 = ChatFilter.filterChat(s3);
                        boolean ignore = false;
                        for(int i41 = 0; i41 < super.ignoresCount; i41++)
                            if(super.ignoresList[i41] == mob.nameHash)
                                ignore = true;

                        if(!ignore) {
                            mob.lastMessageTimeout = 150;
                            mob.lastMessage = s3;
                            displayMessage(mob.username + ": " + mob.lastMessage, 2);
                        }
                        off += byte7;
                    } else
                    if(mobUpdateType == 2) {
                        int lastDamageCount = DataOperations.getByte(packetData[off]);
                        off++;
                        int currentHits = DataOperations.getByte(packetData[off]);
                        off++;
                        int baseHits = DataOperations.getByte(packetData[off]);
                        off++;
                        mob.lastDamageCount = lastDamageCount;
                        mob.currentHits = currentHits;
                        mob.baseHits = baseHits;
                        mob.combatTimer = 200;
                        if(mob == ourPlayer) {
                            playerStatCurrent[3] = currentHits;
                            playerStatBase[3] = baseHits;
                            showWelcomeBox = false;
                            showServerMessageBox = false;
                        }
                    } else
                    if(mobUpdateType == 3) {
                        int l30 = DataOperations.getShort(packetData, off);
                        off += 2;
                        int l34 = DataOperations.getShort(packetData, off);
                        off += 2;
                        mob.projectileType = l30;
                        mob.attackingNpcIndex = l34;
                        mob.attackingPlayerIndex = -1;
                        mob.projectileDistance = projectileRange;
                    } else
                    if(mobUpdateType == 4) {
                        int i31 = DataOperations.getShort(packetData, off);
                        off += 2;
                        int i35 = DataOperations.getShort(packetData, off);
                        off += 2;
                        mob.projectileType = i31;
                        mob.attackingPlayerIndex = i35;
                        mob.attackingNpcIndex = -1;
                        mob.projectileDistance = projectileRange;
                    } else
                    if(mobUpdateType == 5) {
                        mob.serverID = DataOperations.getShort(packetData, off);
                        off += 2;
                        mob.nameHash = DataOperations.getLong(packetData, off);
                        off += 8;
                        mob.username = DataOperations.hashToName(mob.nameHash);
                        int appearanceCount = DataOperations.getByte(packetData[off]);
                        off++;
                        for(int j35 = 0; j35 < appearanceCount; j35++) {
                            mob.appearanceItems[j35] = DataOperations.getByte(packetData[off]);
                            off++;
                        }

                        for(int j38 = appearanceCount; j38 < 12; j38++)
                            mob.appearanceItems[j38] = 0;

                        mob.hairColour = packetData[off++] & 0xff;
                        mob.topColour = packetData[off++] & 0xff;
                        mob.bottomColour = packetData[off++] & 0xff;
                        mob.skinColour = packetData[off++] & 0xff;
                        mob.level = packetData[off++] & 0xff;
                        mob.playerSkulled = packetData[off++] & 0xff;
                        off++;// TODO to skip the admin flag (should it be removed)
                    } else
                    if(mobUpdateType == 6) {
                        byte byte8 = packetData[off];
                        off++;
                        String s4 = ChatMessage.bytesToString(packetData, off, byte8);
                        mob.lastMessageTimeout = 150;
                        mob.lastMessage = s4;
                        if(mob == ourPlayer)
                            displayMessage(mob.username + ": " + mob.lastMessage, 5);
                        off += byte8;
                    }
                }

                return;
            }
            if(packetID == 95) {
                for(int off = 1; off < packetLength;)
                    if(DataOperations.getByte(packetData[off]) == 255) {
                        int newCount = 0;
                        int newSectionX = sectionX + packetData[off + 1] >> 3;
                        int newSectionY = sectionY + packetData[off + 2] >> 3;
                        off += 3;
                        for(int current = 0; current < wallObjectCount; current++) {
                            int newX = (wallObjectX[current] >> 3) - newSectionX;
                            int newY = (wallObjectY[current] >> 3) - newSectionY;
                            if(newX != 0 || newY != 0) {
                                if(current != newCount) {
                                    wallObjectArray[newCount] = wallObjectArray[current];
                                    wallObjectArray[newCount].index = newCount + 10000;
                                    wallObjectX[newCount] = wallObjectX[current];
                                    wallObjectY[newCount] = wallObjectY[current];
                                    wallObjectDirection[newCount] = wallObjectDirection[current];
                                    wallObjectID[newCount] = wallObjectID[current];
                                }
                                newCount++;
                            } else {
                                gameCamera.removeModel(wallObjectArray[current]);
                                engineHandle.removeWallObject(wallObjectX[current], wallObjectY[current], wallObjectDirection[current], wallObjectID[current]);
                            }
                        }

                        wallObjectCount = newCount;
                    } else {
                        int newID = DataOperations.getShort(packetData, off);
                        off += 2;
                        int newSectionX = sectionX + packetData[off++];
                        int newSectionY = sectionY + packetData[off++];
                        byte direction = packetData[off++];
                        int newCount = 0;
                        for(int current = 0; current < wallObjectCount; current++)
                            if(wallObjectX[current] != newSectionX || wallObjectY[current] != newSectionY || wallObjectDirection[current] != direction) {
                                if(current != newCount) {
                                    wallObjectArray[newCount] = wallObjectArray[current];
                                    wallObjectArray[newCount].index = newCount + 10000;
                                    wallObjectX[newCount] = wallObjectX[current];
                                    wallObjectY[newCount] = wallObjectY[current];
                                    wallObjectDirection[newCount] = wallObjectDirection[current];
                                    wallObjectID[newCount] = wallObjectID[current];
                                }
                                newCount++;
                            } else {
                                gameCamera.removeModel(wallObjectArray[current]);
                                engineHandle.removeWallObject(wallObjectX[current], wallObjectY[current], wallObjectDirection[current], wallObjectID[current]);
                            }

                        wallObjectCount = newCount;
                        if(newID != 60000) {
                            engineHandle.gkc(newSectionX, newSectionY, direction, newID);
                            GameObject k35 = makeWallObject(newSectionX, newSectionY, direction, newID, wallObjectCount);
                            wallObjectArray[wallObjectCount] = k35;
                            wallObjectX[wallObjectCount] = newSectionX;
                            wallObjectY[wallObjectCount] = newSectionY;
                            wallObjectID[wallObjectCount] = newID;
                            wallObjectDirection[wallObjectCount++] = direction;
                        }
                    }

                return;
            }
            if(packetID == 77) {
                lastNpcCount = npcCount;
                npcCount = 0;
                for(int j2 = 0; j2 < lastNpcCount; j2++)
                    lastNpcArray[j2] = npcArray[j2];

                int off = 8;
                int newCount = DataOperations.getBits(packetData, off, 8);
                off += 8;
                for(int current = 0; current < newCount; current++) {
                    Mob newNpc = getLastNpc(DataOperations.getBits(packetData, off, 16));
                    off += 16;
                    int needsUpdate = DataOperations.getBits(packetData, off, 1);
                    off++;
                    if(needsUpdate != 0) {
                        int j32 = DataOperations.getBits(packetData, off, 1);
                        off++;
                        if(j32 == 0) {
                            int nextSprite = DataOperations.getBits(packetData, off, 3);
                            off += 3;
                            int waypointCurrent = newNpc.waypointCurrent;
                            int waypointX = newNpc.waypointsX[waypointCurrent];
                            int waypointY = newNpc.waypointsY[waypointCurrent];
                            if(nextSprite == 2 || nextSprite == 1 || nextSprite == 3)
                                waypointX += magicLoc;
                            if(nextSprite == 6 || nextSprite == 5 || nextSprite == 7)
                                waypointX -= magicLoc;
                            if(nextSprite == 4 || nextSprite == 3 || nextSprite == 5)
                                waypointY += magicLoc;
                            if(nextSprite == 0 || nextSprite == 1 || nextSprite == 7)
                                waypointY -= magicLoc;
                            newNpc.nextSprite = nextSprite;
                            newNpc.waypointCurrent = waypointCurrent = (waypointCurrent + 1) % 10;
                            newNpc.waypointsX[waypointCurrent] = waypointX;
                            newNpc.waypointsY[waypointCurrent] = waypointY;
                        } else {
                            int nextSprite = DataOperations.getBits(packetData, off, 4);
                            off += 4;
                            if((nextSprite & 0xc) == 12) {
                                continue;
                            }
                            newNpc.nextSprite = nextSprite;
                        }
                    }
                    npcArray[npcCount++] = newNpc;
                }

                while(off + 34 < packetLength * 8)  {
                    int mobIndex = DataOperations.getBits(packetData, off, 16);
                    off += 16;
                    int areaMobX = DataOperations.getBits(packetData, off, 5);
                    off += 5;
                    if(areaMobX > 15)
                        areaMobX -= 32;
                    int areaMobY = DataOperations.getBits(packetData, off, 5);
                    off += 5;
                    if(areaMobY > 15)
                        areaMobY -= 32;
                    int mobSprite = DataOperations.getBits(packetData, off, 4);
                    off += 4;
                    int mobX = (sectionX + areaMobX) * magicLoc + 64;
                    int mobY = (sectionY + areaMobY) * magicLoc + 64;
                    int addIndex = DataOperations.getBits(packetData, off, 10);
                    off += 10;
                    if(addIndex >= Data.npcCount)
                        addIndex = 24;
                    makeNPC(mobIndex, mobX, mobY, mobSprite, addIndex);
                }
                return;
            }
            if(packetID == 190) {
                int newCount = DataOperations.getShort(packetData, 1);
                int off = 3;
                for(int l16 = 0; l16 < newCount; l16++) {
                    int npcIndex = DataOperations.getShort(packetData, off);
                    off += 2;
                    Mob mob = npcAttackingArray[npcIndex];
                    int updateType = DataOperations.getByte(packetData[off]);
                    off++;
                    if(updateType == 1) {
                        int playerIndex = DataOperations.getShort(packetData, off);
                        off += 2;
                        byte messageLength = packetData[off];
                        off++;
                        if(mob != null) {
                            String s5 = ChatMessage.bytesToString(packetData, off, messageLength);
                            mob.lastMessageTimeout = 150;
                            mob.lastMessage = s5;
                            if(playerIndex == ourPlayer.serverIndex)
                                displayMessage("@yel@" + Data.npcName[mob.npcId] + ": " + mob.lastMessage, 5);
                        }
                        off += messageLength;
                    } else
                    if(updateType == 2) {
                        int lastDamageCount = DataOperations.getByte(packetData[off]);
                        off++;
                        int currentHits = DataOperations.getByte(packetData[off]);
                        off++;
                        int baseHits = DataOperations.getByte(packetData[off]);
                        off++;
                        if(mob != null) {
                            mob.lastDamageCount = lastDamageCount;
                            mob.currentHits = currentHits;
                            mob.baseHits = baseHits;
                            mob.combatTimer = 200;
                        }
                    }
                }

                return;
            }
            if(packetID == 223) {
                showQuestionMenu = true;
                int count = DataOperations.getByte(packetData[1]);
                questionMenuCount = count;
                int off = 2;
                for(int index = 0; index < count; index++) {
                    int optionLength = DataOperations.getByte(packetData[off]);
                    off++;
                    questionMenuAnswer[index] = new String(packetData, off, optionLength);
                    off += optionLength;
                }

                return;
            }
            if(packetID == 127) {
                showQuestionMenu = false;
                return;
            }
            if(packetID == 131) {
                loadArea = true;
                serverIndex = DataOperations.getShort(packetData, 1);
                wildX = DataOperations.getShort(packetData, 3);
                wildY = DataOperations.getShort(packetData, 5);
                layerIndex = DataOperations.getShort(packetData, 7);
                layerModifier = DataOperations.getShort(packetData, 9);
                wildY -= layerIndex * layerModifier;
                needsClear = true;
                hasWorldInfo = true;
                return;
            }
            if(packetID == 180) {
                int off = 1;
                for(int stat = 0; stat < 18; stat++)
                    playerStatCurrent[stat] = DataOperations.getByte(packetData[off++]);

                for(int stat = 0; stat < 18; stat++)
                    playerStatBase[stat] = DataOperations.getByte(packetData[off++]);

                for(int stat = 0; stat < 18; stat++) {
                    playerStatExp[stat] = DataOperations.getInt(packetData, off);
                    off += 4;
                }
                return;
            }
            if(packetID == 177) {
                int off = 1;
                for(int j3 = 0; j3 < 5; j3++) {
                    equipmentStatus[j3] = DataOperations.getShort2(packetData, off);
                    off += 2;
                }
                return;
            }
            if(packetID == 165) {
                playerAliveTimeout = 250;
                return;
            }
            if(packetID == 115) {
                int k3 = (packetLength - 1) / 4;
                for(int i11 = 0; i11 < k3; i11++) {
                    int k17 = sectionX + DataOperations.getShort2(packetData, 1 + i11 * 4) >> 3;
                    int i22 = sectionY + DataOperations.getShort2(packetData, 3 + i11 * 4) >> 3;
                    int j25 = 0;
                    for(int l28 = 0; l28 < groundItemCount; l28++) {
                        int j33 = (groundItemX[l28] >> 3) - k17;
                        int l36 = (groundItemY[l28] >> 3) - i22;
                        if(j33 != 0 || l36 != 0) {
                            if(l28 != j25) {
                                groundItemX[j25] = groundItemX[l28];
                                groundItemY[j25] = groundItemY[l28];
                                groundItemID[j25] = groundItemID[l28];
                                groundItemObjectVar[j25] = groundItemObjectVar[l28];
                            }
                            j25++;
                        }
                    }

                    groundItemCount = j25;
                    j25 = 0;
                    for(int k33 = 0; k33 < objectCount; k33++) {
                        int i37 = (objectX[k33] >> 3) - k17;
                        int j39 = (objectY[k33] >> 3) - i22;
                        if(i37 != 0 || j39 != 0) {
                            if(k33 != j25) {
                                objectArray[j25] = objectArray[k33];
                                objectArray[j25].index = j25;
                                objectX[j25] = objectX[k33];
                                objectY[j25] = objectY[k33];
                                objectType[j25] = objectType[k33];
                                objectRotation[j25] = objectRotation[k33];
                            }
                            j25++;
                        } else {
                            gameCamera.removeModel(objectArray[k33]);
                            engineHandle.removeObject(objectX[k33], objectY[k33], objectType[k33], objectRotation[k33]);
                        }
                    }

                    objectCount = j25;
                    j25 = 0;
                    for(int j37 = 0; j37 < wallObjectCount; j37++) {
                        int k39 = (wallObjectX[j37] >> 3) - k17;
                        int l41 = (wallObjectY[j37] >> 3) - i22;
                        if(k39 != 0 || l41 != 0) {
                            if(j37 != j25) {
                                wallObjectArray[j25] = wallObjectArray[j37];
                                wallObjectArray[j25].index = j25 + 10000;
                                wallObjectX[j25] = wallObjectX[j37];
                                wallObjectY[j25] = wallObjectY[j37];
                                wallObjectDirection[j25] = wallObjectDirection[j37];
                                wallObjectID[j25] = wallObjectID[j37];
                            }
                            j25++;
                        } else {
                            gameCamera.removeModel(wallObjectArray[j37]);
                            engineHandle.removeWallObject(wallObjectX[j37], wallObjectY[j37], wallObjectDirection[j37], wallObjectID[j37]);
                        }
                    }

                    wallObjectCount = j25;
                }

                return;
            }
            if(packetID == 207) {
                showAppearanceWindow = true;
                return;
            }
            if(packetID == 4) {
                int tradeOther = DataOperations.getShort(packetData, 1);
                if(playerBufferArray[tradeOther] != null)
                    tradeOtherName = playerBufferArray[tradeOther].username;
                showTradeBox = true;
                tradeOtherAccepted = false;
                tradeWeAccepted = false;
                tradeItemsOurCount = 0;
                tradeItemsOtherCount = 0;
                return;
            }
            if(packetID == 187) {
                showTradeBox = false;
                showTradeConfirmBox = false;
                return;
            }
            if(packetID == 250) {
                tradeItemsOtherCount = packetData[1] & 0xff;
                int i4 = 2;
                for(int j11 = 0; j11 < tradeItemsOtherCount; j11++) {
                    tradeItemsOther[j11] = DataOperations.getShort(packetData, i4);
                    i4 += 2;
                    tradeItemOtherCount[j11] = DataOperations.getInt(packetData, i4);
                    i4 += 4;
                }

                tradeOtherAccepted = false;
                tradeWeAccepted = false;
                return;
            }
            if(packetID == 92) {
                byte byte0 = packetData[1];
                if(byte0 == 1) {
                    tradeOtherAccepted = true;
                    return;
                } else {
                    tradeOtherAccepted = false;
                    return;
                }
            }
            if(packetID == 253) {
                showShopBox = true;
                int off = 1;
                int newShopItemCount = packetData[off++] & 0xff;
                byte isGeneralShop = packetData[off++];
                shopItemSellPriceModifier = packetData[off++] & 0xff;
                shopItemBuyPriceModifier = packetData[off++] & 0xff;
                for(int j22 = 0; j22 < 40; j22++)
                    shopItems[j22] = -1;

                for(int item = 0; item < newShopItemCount; item++) {
                    shopItems[item] = DataOperations.getShort(packetData, off);
                    off += 2;
                    shopItemCount[item] = DataOperations.getShort(packetData, off);
                    off += 2;
                    shopItemBuyPrice[item] = DataOperations.getInt2(packetData, off);
                    off += 4;
                    shopItemSellPrice[item] = DataOperations.getInt2(packetData, off);
                    off += 4;
                }

                if(isGeneralShop == 1) {
                    int i29 = 39;
                    for(int l33 = 0; l33 < inventoryItemsCount; l33++) {
                        if(i29 < newShopItemCount)
                            break;
                        boolean flag2 = false;
                        for(int l39 = 0; l39 < 40; l39++) {
                            if(shopItems[l39] != inventoryItems[l33])
                                continue;
                            flag2 = true;
                            break;
                        }

                        if(inventoryItems[l33] == 10)
                            flag2 = true;
                        if(!flag2) {
                            shopItems[i29] = inventoryItems[l33] & 0x7fff;
                            shopItemCount[i29] = 0;
                            shopItemSellPrice[i29] = Data.itemBasePrice[shopItems[i29]] - (int)(Data.itemBasePrice[shopItems[i29]] / 2.5);
                            shopItemSellPrice[i29] -= shopItemSellPrice[i29] * 0.10;
                            i29--;
                        }
                    }

                }
                if(selectedShopItemIndex >= 0 && selectedShopItemIndex < 40 && shopItems[selectedShopItemIndex] != selectedShopItemType) {
                    selectedShopItemIndex = -1;
                    selectedShopItemType = -2;
                }
                return;
            }
            if(packetID == 220) {
                showShopBox = false;
                return;
            }
            if(packetID == 18) {
                byte byte1 = packetData[1];
                if(byte1 == 1) {
                    tradeWeAccepted = true;
                    return;
                } else {
                    tradeWeAccepted = false;
                    return;
                }
            }
            if(packetID == 152) {
                configCameraAutoAngle = DataOperations.getByte(packetData[1]) == 1;
                configOneMouseButton = DataOperations.getByte(packetData[2]) == 1;
                configSoundOff = DataOperations.getByte(packetData[3]) == 1;
                showRoofs = DataOperations.getByte(packetData[4]) == 1;
                autoScreenshot = DataOperations.getByte(packetData[5]) == 1;
                showCombatWindow = DataOperations.getByte(packetData[6]) == 1;
                return;
            }
            if(packetID == 209) {
                for(int k4 = 0; k4 < packetLength - 1; k4++) {
                    boolean flag = packetData[k4 + 1] == 1;
                    if(!prayerOn[k4] && flag)
                        playSound("prayeron");
                    if(prayerOn[k4] && !flag)
                        playSound("prayeroff");
                    prayerOn[k4] = flag;
                }

                return;
            }
            if(packetID == 93) {
                showBankBox = true;
                int off = 1;
                serverBankItemsCount = packetData[off++] & 0xff;
                maxBankItems = packetData[off++] & 0xff;
                for(int l11 = 0; l11 < serverBankItemsCount; l11++) {
                    serverBankItems[l11] = DataOperations.getShort(packetData, off);
                    off += 2;
                    serverBankItemCount[l11] = DataOperations.getInt2(packetData, off);
                    off += 4;
                }

                updateBankItems();
                return;
            }
            if(packetID == 171) {
                showBankBox = false;
                return;
            }
            if(packetID == 211) {
                int j5 = packetData[1] & 0xff;
                playerStatExp[j5] = DataOperations.getInt(packetData, 2);
                return;
            }
            if(packetID == 229) {
                int k5 = DataOperations.getShort(packetData, 1);
                if(playerBufferArray[k5] != null)
                    duelOpponent = playerBufferArray[k5].username;
                showDuelBox = true;
                duelMyItemCount = 0;
                duelOpponentItemCount = 0;
                duelOpponentAccepted = false;
                duelMyAccepted = false;
                duelNoRetreating = false;
                duelNoMagic = false;
                duelNoPrayer = false;
                duelNoWeapons = false;
                return;
            }
            if(packetID == 160) {
                showDuelBox = false;
                showDuelConfirmBox = false;
                return;
            }
            if(packetID == 251) {
                showTradeConfirmBox = true;
                tradeConfirmAccepted = false;
                showTradeBox = false;
                int off = 1;
                tradeConfirmOtherNameLong = DataOperations.getLong(packetData, off);
                off += 8;
                tradeConfirmOtherItemCount = packetData[off++] & 0xff;
                for(int i12 = 0; i12 < tradeConfirmOtherItemCount; i12++) {
                    tradeConfirmOtherItems[i12] = DataOperations.getShort(packetData, off);
                    off += 2;
                    tradeConfirmOtherItemsCount[i12] = DataOperations.getInt(packetData, off);
                    off += 4;
                }

                tradeConfigItemCount = packetData[off++] & 0xff;
                for(int l17 = 0; l17 < tradeConfigItemCount; l17++) {
                    tradeConfirmItems[l17] = DataOperations.getShort(packetData, off);
                    off += 2;
                    tradeConfigItemsCount[l17] = DataOperations.getInt(packetData, off);
                    off += 4;
                }

                return;
            }
            if(packetID == 63) {
                duelOpponentItemCount = packetData[1] & 0xff;
                int off = 2;
                for(int j12 = 0; j12 < duelOpponentItemCount; j12++) {
                    duelOpponentItems[j12] = DataOperations.getShort(packetData, off);
                    off += 2;
                    duelOpponentItemsCount[j12] = DataOperations.getInt(packetData, off);
                    off += 4;
                }

                duelOpponentAccepted = false;
                duelMyAccepted = false;
                return;
            }
            if(packetID == 198) {
                if(packetData[1] == 1)
                    duelNoRetreating = true;
                else
                    duelNoRetreating = false;
                if(packetData[2] == 1)
                    duelNoMagic = true;
                else
                    duelNoMagic = false;
                if(packetData[3] == 1)
                    duelNoPrayer = true;
                else
                    duelNoPrayer = false;
                if(packetData[4] == 1)
                    duelNoWeapons = true;
                else
                    duelNoWeapons = false;
                duelOpponentAccepted = false;
                duelMyAccepted = false;
                return;
            }
            if(packetID == 139) {
                int off = 1;
                int itemSlot = packetData[off++] & 0xff;
                int itemID = DataOperations.getShort(packetData, off);
                off += 2;
                int itemCount = DataOperations.getInt2(packetData, off);
                off += 4;
                if(itemCount == 0) {
                    serverBankItemsCount--;
                    for(int l25 = itemSlot; l25 < serverBankItemsCount; l25++) {
                        serverBankItems[l25] = serverBankItems[l25 + 1];
                        serverBankItemCount[l25] = serverBankItemCount[l25 + 1];
                    }

                } else {
                    serverBankItems[itemSlot] = itemID;
                    serverBankItemCount[itemSlot] = itemCount;
                    if(itemSlot >= serverBankItemsCount)
                        serverBankItemsCount = itemSlot + 1;
                }
                updateBankItems();
                return;
            }
            if(packetID == 228) {
                int off = 1;
                int count = 1;
                int newCount = packetData[off++] & 0xff;
                int data = DataOperations.getShort(packetData, off);
                off += 2;
                if(Data.itemStackable[data & 0x7fff] == 0) {
                    count = DataOperations.getInt(packetData, off);
                    off += 4;
                }
                inventoryItems[newCount] = data & 0x7fff;
                inventoryItemEquipped[newCount] = data / 32768;
                inventoryItemCount[newCount] = count;
                if(newCount >= inventoryItemsCount)
                    inventoryItemsCount = newCount + 1;
                return;
            }
            if(packetID == 191) {
                int l6 = packetData[1] & 0xff;
                inventoryItemsCount--;
                for(int i13 = l6; i13 < inventoryItemsCount; i13++) {
                    inventoryItems[i13] = inventoryItems[i13 + 1];
                    inventoryItemCount[i13] = inventoryItemCount[i13 + 1];
                    inventoryItemEquipped[i13] = inventoryItemEquipped[i13 + 1];
                }

                return;
            }
            if(packetID == 208) {
                int off = 1;
                int stat = packetData[off++] & 0xff;
                playerStatCurrent[stat] = DataOperations.getByte(packetData[off++]);
                playerStatBase[stat] = DataOperations.getByte(packetData[off++]);
                playerStatExp[stat] = DataOperations.getInt(packetData, off);
                off += 4;
                return;
            }
            if(packetID == 65) {
                byte byte2 = packetData[1];
                if(byte2 == 1) {
                    duelOpponentAccepted = true;
                    return;
                } else {
                    duelOpponentAccepted = false;
                    return;
                }
            }
            if(packetID == 197) {
                byte byte3 = packetData[1];
                if(byte3 == 1) {
                    duelMyAccepted = true;
                    return;
                } else {
                    duelMyAccepted = false;
                    return;
                }
            }
            if(packetID == 147) {
                showDuelConfirmBox = true;
                duelConfirmOurAccepted = false;
                showDuelBox = false;
                int off = 1;
                duelOpponentHash = DataOperations.getLong(packetData, off);
                off += 8;
                duelOpponentStakeCount = packetData[off++] & 0xff;
                for(int k13 = 0; k13 < duelOpponentStakeCount; k13++) {
                    duelOpponentStakeItem[k13] = DataOperations.getShort(packetData, off);
                    off += 2;
                    duelOutStakeItemCount[k13] = DataOperations.getInt(packetData, off);
                    off += 4;
                }

                duelOurStakeCount = packetData[off++] & 0xff;
                for(int k18 = 0; k18 < duelOurStakeCount; k18++) {
                    duelOurStakeItem[k18] = DataOperations.getShort(packetData, off);
                    off += 2;
                    duelOurStakeItemCount[k18] = DataOperations.getInt(packetData, off);
                    off += 4;
                }

                duelRetreat = packetData[off++] & 0xff;
                duelMagic = packetData[off++] & 0xff;
                duelPrayer = packetData[off++] & 0xff;
                duelWeapons = packetData[off++] & 0xff;
                return;
            }
            if(packetID == 11) {
                String s1 = new String(packetData, 1, packetLength - 1);
                playSound(s1);
                return;
            }
            if(packetID == 23) {
                if(teleBubbleCount < 50) {
                    int type = packetData[1] & 0xff;
                    int x = packetData[2] + sectionX;
                    int y = packetData[3] + sectionY;
                    teleBubbleType[teleBubbleCount] = type;
                    teleBubbleTime[teleBubbleCount] = 0;
                    teleBubbleX[teleBubbleCount] = x;
                    teleBubbleY[teleBubbleCount] = y;
                    teleBubbleCount++;
                }
                return;
            }
            if(packetID == 248) {
                if(!loginScreenShown) {
                    lastLoginDays = DataOperations.getShort(packetData, 1);
                    subDaysLeft = DataOperations.getShort(packetData, 3);
                    lastLoginAddress = new String(packetData, 5, packetLength - 5); 
                    showWelcomeBox = true;
                    loginScreenShown = true;
                }
                return;
            }
            if(packetID == 148) {
                serverMessage = new String(packetData, 1, packetLength - 1);
                showServerMessageBox = true;
                serverMessageBoxTop = false;
                return;
            }
            if(packetID == 64) {
                serverMessage = new String(packetData, 1, packetLength - 1);
                showServerMessageBox = true;
                serverMessageBoxTop = true;
                return;
            }
            if(packetID == 126) {
                fatigue = DataOperations.getShort(packetData, 1);
                return;
            }
            if(packetID == 206) {
                isSleeping = true;
                super.inputText = "";
                super.enteredInputText = "";
                try {
                    BufferedImage image = ImageIO.read(new ByteArrayInputStream(packetData, 1, packetLength));
                    captchaWidth = image.getWidth();
                    captchaHeight = image.getHeight();
                    captchaPixels = new int[captchaWidth][captchaHeight];
                    for(int x = 0; x < captchaWidth; x++)
                        for(int y = 0; y < captchaHeight; y++)
                            captchaPixels[x][y] = image.getRGB(x, y);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                sleepingStatusText = null;
                return;
            }
            if(packetID == 224) {
                isSleeping = false;
                return;
            }
            if(packetID == 225) {
                sleepingStatusText = "Incorrect - Please wait...";
                return;
            }
            if(packetID == 172) {
                systemUpdate = DataOperations.getShort(packetData, 1) * 32;
                return;
            }
            if(packetID == 181) {
                if(autoScreenshot)
                    takeScreenshot(false);
                return;
            }
            if(packetID == 182) {
                int off = 1;
                questPoints = DataOperations.getShort(packetData, off);
                off += 2;
                for(int l4 = 0; l4 < questName.length; l4++)
                    questStage[l4] = packetData[l4 + 1];

                return;
            }
            if(packetID == 233) {
                questPoints = DataOperations.getByte(packetData[1]);
                int count = DataOperations.getByte(packetData[2]);
                int off = 3;
                String newQuestNames[] = new String[count];
                int newQuestStage[] = new int[count];
                for(int i = 0; i < count; i++) {
                    newQuestNames[i] = questName[DataOperations.getByte(packetData[off++])];
                    newQuestStage[i] = DataOperations.getByte(packetData[off++]);
                }
                usedQuestName = newQuestNames;
                questStage = newQuestStage;
                return;
            }
            if(packetID == 129) {
                combatStyle = DataOperations.getByte(packetData[1]);
                return;
            }
            if(packetID == 110) {// TODO remove?
                //System.out.println("RECEIVED PACKET 110 (SERVER INFO)");
                return;
            }
            System.err.println("UNHANDLED PACKET:" + packetID + " LEN:" + packetLength);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    protected final void startThread(Runnable runnable) {
        if(link.gameApplet != null) {
            link.thread(runnable);
            return;
        } else {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.start();
            return;
        }
    }

    protected final void initVars() {
        systemUpdate = 0;
        combatStyle = 0;
        logoutTimer = 0;
        loginScreen = 0;
        loggedIn = 1;
        resetPrivateMessages();
        gameGraphics.clearScreen();
        gameGraphics.drawImage(graphics, 0, 0);
        for(int l = 0; l < objectCount; l++) {
            gameCamera.removeModel(objectArray[l]);
            engineHandle.removeObject(objectX[l], objectY[l], objectType[l], objectRotation[l]);
        }

        for(int i1 = 0; i1 < wallObjectCount; i1++) {
            gameCamera.removeModel(wallObjectArray[i1]);
            engineHandle.removeWallObject(wallObjectX[i1], wallObjectY[i1], wallObjectDirection[i1], wallObjectID[i1]);
        }

        objectCount = 0;
        wallObjectCount = 0;
        groundItemCount = 0;
        playerCount = 0;
        for(int j1 = 0; j1 < 4000; j1++)
            playerBufferArray[j1] = null;

        for(int k1 = 0; k1 < 500; k1++)
            playerArray[k1] = null;

        npcCount = 0;
        for(int l1 = 0; l1 < 5000; l1++)
            npcAttackingArray[l1] = null;

        for(int i2 = 0; i2 < 500; i2++)
            npcArray[i2] = null;

        for(int j2 = 0; j2 < 50; j2++)
            prayerOn[j2] = false;

        mouseButtonClick = 0;
        super.lastMouseButton = 0;
        super.mouseButton = 0;
        showShopBox = false;
        showBankBox = false;
        isSleeping = false;
        super.friendsCount = 0;
    }

    private final void drawMinimapMenu(boolean canClick) {
        int l = ((GameImage) (gameGraphics)).gameWidth - 199;
        char c1 = '\234';
        char c3 = '\230';
        gameGraphics.drawPicture(l - 49, 3, baseInventoryPic + 2);
        l += 40;
        gameGraphics.drawBox(l, 36, c1, c3, 0);
        gameGraphics.setGameBoundaries(l, 36, l + c1, 36 + c3);
        int j1 = 192 + minimapRandomRotationY;
        int l1 = cameraRotation + minimapRandomRotationX & 0xff;
        int j2 = ((ourPlayer.currentX - 6040) * 3 * j1) / 2048;
        int l3 = ((ourPlayer.currentY - 6040) * 3 * j1) / 2048;
        int j5 = Camera.bbk[1024 - l1 * 4 & 0x3ff];
        int l5 = Camera.bbk[(1024 - l1 * 4 & 0x3ff) + 1024];
        int j6 = l3 * j5 + j2 * l5 >> 18;
        l3 = l3 * l5 - j2 * j5 >> 18;
        j2 = j6;
        gameGraphics.drawMinimapPic((l + c1 / 2) - j2, 36 + c3 / 2 + l3, baseInventoryPic - 1, l1 + 64 & 0xff, j1);
        for(int l7 = 0; l7 < objectCount; l7++) {
            int k2 = (((objectX[l7] * magicLoc + 64) - ourPlayer.currentX) * 3 * j1) / 2048;
            int i4 = (((objectY[l7] * magicLoc + 64) - ourPlayer.currentY) * 3 * j1) / 2048;
            int k6 = i4 * j5 + k2 * l5 >> 18;
            i4 = i4 * l5 - k2 * j5 >> 18;
            k2 = k6;
            drawMinimapObject(l + c1 / 2 + k2, (36 + c3 / 2) - i4, 65535);
        }

        for(int i8 = 0; i8 < groundItemCount; i8++) {
            int l2 = (((groundItemX[i8] * magicLoc + 64) - ourPlayer.currentX) * 3 * j1) / 2048;
            int j4 = (((groundItemY[i8] * magicLoc + 64) - ourPlayer.currentY) * 3 * j1) / 2048;
            int l6 = j4 * j5 + l2 * l5 >> 18;
            j4 = j4 * l5 - l2 * j5 >> 18;
            l2 = l6;
            drawMinimapObject(l + c1 / 2 + l2, (36 + c3 / 2) - j4, 0xff0000);
        }

        for(int j8 = 0; j8 < npcCount; j8++) {
            Mob f1 = npcArray[j8];
            int i3 = ((f1.currentX - ourPlayer.currentX) * 3 * j1) / 2048;
            int k4 = ((f1.currentY - ourPlayer.currentY) * 3 * j1) / 2048;
            int i7 = k4 * j5 + i3 * l5 >> 18;
            k4 = k4 * l5 - i3 * j5 >> 18;
            i3 = i7;
            drawMinimapObject(l + c1 / 2 + i3, (36 + c3 / 2) - k4, 0xffff00);
        }

        for(int k8 = 0; k8 < playerCount; k8++) {
            Mob f2 = playerArray[k8];
            int j3 = ((f2.currentX - ourPlayer.currentX) * 3 * j1) / 2048;
            int l4 = ((f2.currentY - ourPlayer.currentY) * 3 * j1) / 2048;
            int j7 = l4 * j5 + j3 * l5 >> 18;
            l4 = l4 * l5 - j3 * j5 >> 18;
            j3 = j7;
            int i9 = 0xffffff;
            for(int j9 = 0; j9 < super.friendsCount; j9++) {
                if(f2.nameHash != super.friendsList[j9] || super.friendsWorld[j9] != 99)
                    continue;
                i9 = 65280;
                break;
            }

            drawMinimapObject(l + c1 / 2 + j3, (36 + c3 / 2) - l4, i9);
        }
        
        // compass
        gameGraphics.drawCircle(l + c1 / 2, 36 + c3 / 2, 2, 0xffffff, 255);
        gameGraphics.drawMinimapPic(l + 19, 55, baseInventoryPic + 24, cameraRotation + 128 & 0xff, 128);
        gameGraphics.setGameBoundaries(0, 0, windowWidth, windowHeight + 12);
        if(!canClick)
            return;
        l = super.mouseX - (((GameImage) (gameGraphics)).gameWidth - 199);
        int l8 = super.mouseY - 36;
        if(l >= 40 && l8 >= 0 && l < 196 && l8 < 152) {
            char c2 = '\234';
            char c4 = '\230';
            int k1 = 192 + minimapRandomRotationY;
            int i2 = cameraRotation + minimapRandomRotationX & 0xff;
            int i1 = ((GameImage) (gameGraphics)).gameWidth - 199;
            i1 += 40;
            int k3 = ((super.mouseX - (i1 + c2 / 2)) * 16384) / (3 * k1);
            int i5 = ((super.mouseY - (36 + c4 / 2)) * 16384) / (3 * k1);
            int k5 = Camera.bbk[1024 - i2 * 4 & 0x3ff];
            int i6 = Camera.bbk[(1024 - i2 * 4 & 0x3ff) + 1024];
            int k7 = i5 * k5 + k3 * i6 >> 15;
            i5 = i5 * i6 - k3 * k5 >> 15;
            k3 = k7;
            k3 += ourPlayer.currentX;
            i5 = ourPlayer.currentY - i5;
            if(mouseButtonClick == 1)
                walkTo1Tile(sectionX, sectionY, k3 / 128, i5 / 128, false);
            mouseButtonClick = 0;
        }
    }

    private final boolean validCameraAngle(int arg0) {
        int l = ourPlayer.currentX / 128;
        int i1 = ourPlayer.currentY / 128;
        for(int j1 = 2; j1 >= 1; j1--) {
            if(arg0 == 1 && ((engineHandle.tiles[l][i1 - j1] & 0x80) == 128 || (engineHandle.tiles[l - j1][i1] & 0x80) == 128 || (engineHandle.tiles[l - j1][i1 - j1] & 0x80) == 128))
                return false;
            if(arg0 == 3 && ((engineHandle.tiles[l][i1 + j1] & 0x80) == 128 || (engineHandle.tiles[l - j1][i1] & 0x80) == 128 || (engineHandle.tiles[l - j1][i1 + j1] & 0x80) == 128))
                return false;
            if(arg0 == 5 && ((engineHandle.tiles[l][i1 + j1] & 0x80) == 128 || (engineHandle.tiles[l + j1][i1] & 0x80) == 128 || (engineHandle.tiles[l + j1][i1 + j1] & 0x80) == 128))
                return false;
            if(arg0 == 7 && ((engineHandle.tiles[l][i1 - j1] & 0x80) == 128 || (engineHandle.tiles[l + j1][i1] & 0x80) == 128 || (engineHandle.tiles[l + j1][i1 - j1] & 0x80) == 128))
                return false;
            if(arg0 == 0 && (engineHandle.tiles[l][i1 - j1] & 0x80) == 128)
                return false;
            if(arg0 == 2 && (engineHandle.tiles[l - j1][i1] & 0x80) == 128)
                return false;
            if(arg0 == 4 && (engineHandle.tiles[l][i1 + j1] & 0x80) == 128)
                return false;
            if(arg0 == 6 && (engineHandle.tiles[l + j1][i1] & 0x80) == 128)
                return false;
        }

        return true;
    }

    private final void loadSounds() {
        try {
            soundData = unpackData("sounds.mem", "Sound effects", 90);
            audioPlayer = new AudioReader();
            return;
        }
        catch(Throwable throwable) {
            System.out.println("Unable to init sounds:" + throwable);
        }
    }

    protected final void loadGame() {
        int l = 0;
        for(int i1 = 0; i1 < 99; i1++) {
            int j1 = i1 + 1;
            int l1 = (int)((double)j1 + 300D * Math.pow(2D, (double)j1 / 7D));
            l += l1;
            experienceList[i1] = l & 0xffffffc;
        }
        loadConfig();
        if(errorLoading)
            return;
        GameAppletMiddleMan.maxPacketReadCount = 500;
        baseInventoryPic = 2000;
        baseScrollPic = baseInventoryPic + 100;
        baseItemPicture = baseScrollPic + 50;
        baseLoginScreenBackgroundPic = baseItemPicture + 1000;
        baseProjectilePic = baseLoginScreenBackgroundPic + 10;
        baseTexturePic = baseProjectilePic + 50;
        subTexturePic = baseTexturePic + 10;
        graphics = getGraphics();
        setRefreshRate(50);
        gameGraphics = new GameImageMiddleMan(windowWidth, windowHeight + 12, 4000, this);
        gameGraphics.gameReference = this;
        gameGraphics.setGameBoundaries(0, 0, windowWidth, windowHeight + 12);
        Menu.gdh = false;
        Menu.baseScrollPic = baseScrollPic;
        spellMenu = new Menu(gameGraphics, 5);
        int k1 = ((GameImage) (gameGraphics)).gameWidth - 199;
        byte byte0 = 36;
        spellMenuHandle = spellMenu.createList(k1, byte0 + 24, 196, 90, 1, 500, true);
        friendsMenu = new Menu(gameGraphics, 5);
        friendsMenuHandle = friendsMenu.createList(k1, byte0 + 40, 196, 126, 1, 500, true);
        questMenu = new Menu(gameGraphics, 5);
        questMenuHandle = questMenu.createList(k1, byte0 + 24, 196, 251, 1, 500, true);
        loadMedia();
        if(errorLoading)
            return;
        loadAnimations();
        if(errorLoading)
            return;
        gameCamera = new Camera(gameGraphics, 15000, 15000, 1000);
        gameCamera.setCameraSize(windowWidth / 2, windowHeight / 2, windowWidth / 2, windowHeight / 2, windowWidth, cameraFieldOfView);
        gameCamera.zoom1 = 2400;
        gameCamera.zoom2 = 2400;
        gameCamera.zoom3 = 1;
        gameCamera.zoom4 = 2300;
        gameCamera.bjk(-50, -10, -50);
        engineHandle = new EngineHandle(gameCamera, gameGraphics);
        engineHandle.gjc = baseInventoryPic;
        loadTextures();
        if(errorLoading)
            return;
        loadModels();
        if(errorLoading)
            return;
        loadMap();
        if(errorLoading)
            return;
        loadSounds();
        if(!errorLoading) {
            drawLoadingBarText(100, "Starting game...");
            createChatInputMenu();
            createLoginMenus();
            createAppearanceWindow();
            setLoginVars();
            createLoginScreenBackgrounds();
            return;
        }
    }

    private final void createLoginMenus() {
        loginMenuFirst = new Menu(gameGraphics, 50);
        int l = 40;
        if(!Config.MEMBERS_FEATURES) {
            loginMenuFirst.drawText(256, 200 + l, "Click on an option", 5, true);
            loginMenuFirst.drawButton(156, 240 + l, 120, 35);
            loginMenuFirst.drawButton(356, 240 + l, 120, 35);
            loginMenuFirst.drawText(156, 240 + l, "New User", 5, false);
            loginMenuFirst.drawText(356, 240 + l, "Existing User", 5, false);
            loginButtonNewUser = loginMenuFirst.createButton(156, 240 + l, 120, 35);
            loginMenuLoginButton = loginMenuFirst.createButton(356, 240 + l, 120, 35);
        } else {
            loginMenuFirst.drawText(256, 200 + l, "Welcome to RuneScape", 4, true);
            loginMenuFirst.drawText(256, 215 + l, "You need a member account to use this server", 4, true);
            loginMenuFirst.drawButton(256, 250 + l, 200, 35);
            loginMenuFirst.drawText(256, 250 + l, "Click here to login", 5, false);
            loginMenuLoginButton = loginMenuFirst.createButton(256, 250 + l, 200, 35);
        }
        loginNewUser = new Menu(gameGraphics, 50);
        l = 230;
        loginNewUser.drawText(256, l + 8, "To create an account please go back to the", 4, true);
        l += 20;
        loginNewUser.drawText(256, l + 8, "www.runescape.com front page, and choose 'create account'", 4, true);
        l += 30;
        loginNewUser.drawButton(256, l + 17, 150, 34);
        loginNewUser.drawText(256, l + 17, "Ok", 5, false);
        loginMenuOkButton = loginNewUser.createButton(256, l + 17, 150, 34);
        loginMenuLogin = new Menu(gameGraphics, 50);
        l = 230;
        loginMenuStatusText = loginMenuLogin.drawText(256, l - 10, "Please enter your username and password", 4, true);
        l += 28;
        loginMenuLogin.drawButton(140, l, 200, 40);
        loginMenuLogin.drawText(140, l - 10, "Username:", 4, false);
        loginMenuUserText = loginMenuLogin.createInput(140, l + 10, 200, 40, 4, 12, false, false);
        l += 47;
        loginMenuLogin.drawButton(190, l, 200, 40);
        loginMenuLogin.drawText(190, l - 10, "Password:", 4, false);
        loginMenuPasswordText = loginMenuLogin.createInput(190, l + 10, 200, 40, 4, 20, true, false);
        l -= 55;
        loginMenuLogin.drawButton(410, l, 120, 25);
        loginMenuLogin.drawText(410, l, "Ok", 4, false);
        loginMenuOkLoginButton = loginMenuLogin.createButton(410, l, 120, 25);
        l += 30;
        loginMenuLogin.drawButton(410, l, 120, 25);
        loginMenuLogin.drawText(410, l, "Cancel", 4, false);
        loginMenuCancelButton = loginMenuLogin.createButton(410, l, 120, 25);
        l += 30;
        loginMenuLogin.setFocus(loginMenuUserText);
    }

    protected final void lostConnection() {
        systemUpdate = 0;
        if(logoutTimer != 0) {
            resetIntVars();
            return;
        } else {
            super.lostConnection();
            return;
        }
    }

    private final void loadMedia() {
        byte media[] = unpackData("media.jag", "2d graphics", 20);
        if(media == null) {
            errorLoading = true;
            return;
        }
        byte abyte1[] = DataOperations.loadData("index.dat", 0, media);
        gameGraphics.unpackImageData(baseInventoryPic, DataOperations.loadData("inv1.dat", 0, media), abyte1, 1);
        gameGraphics.unpackImageData(baseInventoryPic + 1, DataOperations.loadData("inv2.dat", 0, media), abyte1, 6);
        gameGraphics.unpackImageData(baseInventoryPic + 9, DataOperations.loadData("bubble.dat", 0, media), abyte1, 1);
        gameGraphics.unpackImageData(baseInventoryPic + 10, DataOperations.loadData("runescape.dat", 0, media), abyte1, 1);
        gameGraphics.unpackImageData(baseInventoryPic + 11, DataOperations.loadData("splat.dat", 0, media), abyte1, 3);
        gameGraphics.unpackImageData(baseInventoryPic + 14, DataOperations.loadData("icon.dat", 0, media), abyte1, 8);
        gameGraphics.unpackImageData(baseInventoryPic + 22, DataOperations.loadData("hbar.dat", 0, media), abyte1, 1);
        gameGraphics.unpackImageData(baseInventoryPic + 23, DataOperations.loadData("hbar2.dat", 0, media), abyte1, 1);
        gameGraphics.unpackImageData(baseInventoryPic + 24, DataOperations.loadData("compass.dat", 0, media), abyte1, 1);
        gameGraphics.unpackImageData(baseInventoryPic + 25, DataOperations.loadData("buttons.dat", 0, media), abyte1, 2);
        gameGraphics.unpackImageData(baseScrollPic, DataOperations.loadData("scrollbar.dat", 0, media), abyte1, 2);
        gameGraphics.unpackImageData(baseScrollPic + 2, DataOperations.loadData("corners.dat", 0, media), abyte1, 4);
        gameGraphics.unpackImageData(baseScrollPic + 6, DataOperations.loadData("arrows.dat", 0, media), abyte1, 2);
        gameGraphics.unpackImageData(baseProjectilePic, DataOperations.loadData("projectile.dat", 0, media), abyte1, Data.spellProjectileCount);
        int l = Data.highestLoadedPicture;
        for(int i1 = 1; l > 0; i1++) {
            int j1 = l;
            l -= 30;
            if(j1 > 30)
                j1 = 30;
            gameGraphics.unpackImageData(baseItemPicture + (i1 - 1) * 30, DataOperations.loadData("objects" + i1 + ".dat", 0, media), abyte1, j1);
        }

        gameGraphics.loadImage(baseInventoryPic);
        gameGraphics.loadImage(baseInventoryPic + 9);
        for(int k1 = 11; k1 <= 26; k1++)
            gameGraphics.loadImage(baseInventoryPic + k1);

        for(int l1 = 0; l1 < Data.spellProjectileCount; l1++)
            gameGraphics.loadImage(baseProjectilePic + l1);

        for(int i2 = 0; i2 < Data.highestLoadedPicture; i2++)
            gameGraphics.loadImage(baseItemPicture + i2);

    }

    protected final void checkInputs() {
        if(memoryError)
            return;
        if(errorLoading)
            return;
        try {
            tick++;
            if(loggedIn == 0) {
                checkLoginScreenInputs();
            }
            if(loggedIn == 1) {
                checkGameInputs();
            }
            super.lastMouseButton = 0;
            cameraRotateTime++;
            if(cameraRotateTime > 500) {
                cameraRotateTime = 0;
                int l = (int)(Math.random() * 4D);
                if((l & 1) == 1)
                    cameraRotationXAmount += cameraRotationXIncrement;
                if((l & 2) == 2)
                    cameraRotationYAmount += cameraRotationYIncrement;
            }
            if(cameraRotationXAmount < -50)
                cameraRotationXIncrement = 2;
            if(cameraRotationXAmount > 50)
                cameraRotationXIncrement = -2;
            if(cameraRotationYAmount < -50)
                cameraRotationYIncrement = 2;
            if(cameraRotationYAmount > 50)
                cameraRotationYIncrement = -2;
            if(chatTabAllMsgFlash > 0)
                chatTabAllMsgFlash--;
            if(chatTabHistoryFlash > 0)
                chatTabHistoryFlash--;
            if(chatTabQuestFlash > 0)
                chatTabQuestFlash--;
            if(chatTabPrivateFlash > 0)
                chatTabPrivateFlash--;
        }
        catch(OutOfMemoryError _ex) {
            cleanUp();
            memoryError = true;
        }
    }

    private final void loadAnimations() {
        byte abyte0[] = null;
        byte abyte1[] = null;
        abyte0 = unpackData("entity.jag", "people and monsters", 30);
        if(abyte0 == null) {
            errorLoading = true;
            return;
        }
        abyte1 = DataOperations.loadData("index.dat", 0, abyte0);
        byte abyte2[] = null;
        byte abyte3[] = null;
        abyte2 = unpackData("entity.mem", "member graphics", 45);
        if(abyte2 == null) {
            errorLoading = true;
            return;
        }
        abyte3 = DataOperations.loadData("index.dat", 0, abyte2);
        int l = 0;
        animationNumber = 0;
label0:
        for(int i1 = 0; i1 < Data.animationCount; i1++) {
            String s1 = Data.animationName[i1];
            for(int j1 = 0; j1 < i1; j1++) {
                if(!Data.animationName[j1].equalsIgnoreCase(s1))
                    continue;
                Data.animationNumber[i1] = Data.animationNumber[j1];
                continue label0;
            }

            byte abyte7[] = DataOperations.loadData(s1 + ".dat", 0, abyte0);
            byte abyte4[] = abyte1;
            if(abyte7 == null) {
                abyte7 = DataOperations.loadData(s1 + ".dat", 0, abyte2);
                abyte4 = abyte3;
            }
            if(abyte7 != null) {
                gameGraphics.unpackImageData(animationNumber, abyte7, abyte4, 15);
                l += 15;
                if(Data.animationHasA[i1] == 1) {
                    byte abyte8[] = DataOperations.loadData(s1 + "a.dat", 0, abyte0);
                    byte abyte5[] = abyte1;
                    if(abyte8 == null) {
                        abyte8 = DataOperations.loadData(s1 + "a.dat", 0, abyte2);
                        abyte5 = abyte3;
                    }
                    gameGraphics.unpackImageData(animationNumber + 15, abyte8, abyte5, 3);
                    l += 3;
                }
                if(Data.animationHasF[i1] == 1) {
                    byte abyte9[] = DataOperations.loadData(s1 + "f.dat", 0, abyte0);
                    byte abyte6[] = abyte1;
                    if(abyte9 == null) {
                        abyte9 = DataOperations.loadData(s1 + "f.dat", 0, abyte2);
                        abyte6 = abyte3;
                    }
                    gameGraphics.unpackImageData(animationNumber + 18, abyte9, abyte6, 9);
                    l += 9;
                }
                if(Data.animationGenderModels[i1] != 0) {
                    for(int k1 = animationNumber; k1 < animationNumber + 27; k1++)
                        gameGraphics.loadImage(k1);

                }
            }
            Data.animationNumber[i1] = animationNumber;
            animationNumber += 27;
        }

        //System.out.println("Loaded: " + l + " frames of animation");
    }

    private final void updateAppearanceWindow() {
        appearanceMenu.mouseClick(super.mouseX, super.mouseY, super.lastMouseButton, super.mouseButton);
        if(appearanceMenu.isClicked(appearanceHeadLeftArrow))
            do
                appearanceHeadType = ((appearanceHeadType - 1) + Data.animationCount) % Data.animationCount;
            while((Data.animationGenderModels[appearanceHeadType] & 3) != 1 || (Data.animationGenderModels[appearanceHeadType] & 4 * appearanceHeadGender) == 0);
        if(appearanceMenu.isClicked(appearanceHeadRightArrow))
            do
                appearanceHeadType = (appearanceHeadType + 1) % Data.animationCount;
            while((Data.animationGenderModels[appearanceHeadType] & 3) != 1 || (Data.animationGenderModels[appearanceHeadType] & 4 * appearanceHeadGender) == 0);
        if(appearanceMenu.isClicked(appearanceHairLeftArrow))
            appearanceHairColour = ((appearanceHairColour - 1) + appearanceHairColours.length) % appearanceHairColours.length;
        if(appearanceMenu.isClicked(appearanceHairRightArrow))
            appearanceHairColour = (appearanceHairColour + 1) % appearanceHairColours.length;
        if(appearanceMenu.isClicked(appearanceGenderLeftArrow) || appearanceMenu.isClicked(appearanceGenderRightArrow)) {
            for(appearanceHeadGender = 3 - appearanceHeadGender; (Data.animationGenderModels[appearanceHeadType] & 3) != 1 || (Data.animationGenderModels[appearanceHeadType] & 4 * appearanceHeadGender) == 0; appearanceHeadType = (appearanceHeadType + 1) % Data.animationCount);
            for(; (Data.animationGenderModels[appearanceBodyGender] & 3) != 2 || (Data.animationGenderModels[appearanceBodyGender] & 4 * appearanceHeadGender) == 0; appearanceBodyGender = (appearanceBodyGender + 1) % Data.animationCount);
        }
        if(appearanceMenu.isClicked(appearanceTopLeftArrow))
            appearanceTopColour = ((appearanceTopColour - 1) + appearanceTopBottomColours.length) % appearanceTopBottomColours.length;
        if(appearanceMenu.isClicked(appearanceTopRightArrow))
            appearanceTopColour = (appearanceTopColour + 1) % appearanceTopBottomColours.length;
        if(appearanceMenu.isClicked(appearanceSkinLeftArrow))
            appearanceSkinColour = ((appearanceSkinColour - 1) + appearanceSkinColours.length) % appearanceSkinColours.length;
        if(appearanceMenu.isClicked(appearanceSkingRightArrow))
            appearanceSkinColour = (appearanceSkinColour + 1) % appearanceSkinColours.length;
        if(appearanceMenu.isClicked(appearanceBottomLeftArrow))
            appearanceBottomColour = ((appearanceBottomColour - 1) + appearanceTopBottomColours.length) % appearanceTopBottomColours.length;
        if(appearanceMenu.isClicked(appearanceBottomRightArrow))
            appearanceBottomColour = (appearanceBottomColour + 1) % appearanceTopBottomColours.length;
        if(appearanceMenu.isClicked(appearanceAcceptButton)) {
            super.streamClass.createPacket(218);
            super.streamClass.addByte(appearanceHeadGender);
            super.streamClass.addByte(appearanceHeadType);
            super.streamClass.addByte(appearanceBodyGender);
            super.streamClass.addByte(appearance2Colour);
            super.streamClass.addByte(appearanceHairColour);
            super.streamClass.addByte(appearanceTopColour);
            super.streamClass.addByte(appearanceBottomColour);
            super.streamClass.addByte(appearanceSkinColour);
            super.streamClass.formatPacket();
            gameGraphics.clearScreen();
            showAppearanceWindow = false;
        }
    }

    private final void drawWelcomeBox() {
        int l = 65;
        if(!lastLoginAddress.equals("0.0.0.0"))
            l += 30;
        if(subDaysLeft > 0)
            l += 15;
        if(lastLoginDays >= 0)
            l += 15;
        int i1 = 167 - l / 2;
        gameGraphics.drawBox(56, 167 - l / 2, 400, l, 0);
        gameGraphics.drawBoxEdge(56, 167 - l / 2, 400, l, 0xffffff);
        i1 += 20;
        gameGraphics.drawText("Welcome to RuneScape " + loginUsername, 256, i1, 4, 0xffff00);
        i1 += 30;
        String s1;
        // lastLoginDays    subDaysLeft    lastLoginAddress
        if(lastLoginDays == 0)
            s1 = "earlier today";
        else
        if(lastLoginDays == 1)
            s1 = "yesterday";
        else
            s1 = lastLoginDays + " days ago";
        if(!lastLoginAddress.equals("0.0.0.0")) {
            gameGraphics.drawText("You last logged in " + s1, 256, i1, 1, 0xffffff);
            i1 += 15;
            gameGraphics.drawText("from: " + lastLoginAddress, 256, i1, 1, 0xffffff);
            i1 += 15;
        }
        if(subDaysLeft > 0) {
            gameGraphics.drawText("Subscription left: " + subDaysLeft + " days", 256, i1, 1, 0xffffff);
            i1 += 15;
        }
        /*if(unreadMessages > 0) {
            int j1 = 0xffffff;
            gameGraphics.drawText("Jagex staff will NEVER email you. We use the", 256, i1, 1, j1);
            i1 += 15;
            gameGraphics.drawText("message-centre on this website instead.", 256, i1, 1, j1);
            i1 += 15;
            if(unreadMessages == 1)
                gameGraphics.drawText("You have @yel@0@whi@ unread messages in your message-centre", 256, i1, 1, 0xffffff);
            else
                gameGraphics.drawText("You have @gre@" + (unreadMessages - 1) + " unread messages @whi@in your message-centre", 256, i1, 1, 0xffffff);
            i1 += 15;
            i1 += 15;
        }
        if(lastChangedRecoveryDays != 201) {
            if(lastChangedRecoveryDays == 200) {
                gameGraphics.drawText("You have not yet set any password recovery questions.", 256, i1, 1, 0xff8000);
                i1 += 15;
                gameGraphics.drawText("We strongly recommend you do so now to secure your account.", 256, i1, 1, 0xff8000);
                i1 += 15;
                gameGraphics.drawText("Do this from the 'account management' area on our front webpage", 256, i1, 1, 0xff8000);
                i1 += 15;
            } else {
                String s2;
                if(lastChangedRecoveryDays == 0)
                    s2 = "Earlier today";
                else
                if(lastChangedRecoveryDays == 1)
                    s2 = "Yesterday";
                else
                    s2 = lastChangedRecoveryDays + " days ago";
                gameGraphics.drawText(s2 + " you changed your recovery questions", 256, i1, 1, 0xff8000);
                i1 += 15;
                gameGraphics.drawText("If you do not remember making this change then cancel it immediately", 256, i1, 1, 0xff8000);
                i1 += 15;
                gameGraphics.drawText("Do this from the 'account management' area on our front webpage", 256, i1, 1, 0xff8000);
                i1 += 15;
            }
            i1 += 15;
        }*/
        int k1 = 0xffffff;
        if(super.mouseY > i1 - 12 && super.mouseY <= i1 && super.mouseX > 106 && super.mouseX < 406)
            k1 = 0xff0000;
        gameGraphics.drawText("Click here to close window", 256, i1, 1, k1);
        if(mouseButtonClick == 1) {
            if(k1 == 0xff0000)
                showWelcomeBox = false;
            if((super.mouseX < 86 || super.mouseX > 426) && (super.mouseY < 167 - l / 2 || super.mouseY > 167 + l / 2))
                showWelcomeBox = false;
        }
        mouseButtonClick = 0;
    }

    private final int getInventoryItemTotalCount(int arg0) {
        int l = 0;
        for(int i1 = 0; i1 < inventoryItemsCount; i1++)
            if(inventoryItems[i1] == arg0)
                if(Data.itemStackable[arg0] == 1)
                    l++;
                else
                    l += inventoryItemCount[i1];

        return l;
    }

    private final void sendLogout() {
        if(loggedIn == 0)
            return;
        if(combatTimeout > 450) {
            displayMessage("@cya@You can't logout during combat!", 3);
            return;
        }
        if(combatTimeout > 0) {
            displayMessage("@cya@You can't logout for 10 seconds after combat", 3);
            return;
        } else {
            super.streamClass.createPacket(129);
            super.streamClass.formatPacket();
            logoutTimer = 1000;
            return;
        }
    }

    public final URL getCodeBase() {
        if(link.gameApplet != null)
            return link.gameApplet.getCodeBase();
        else
            return super.getCodeBase();
    }

    private final boolean walkTo(int startX, int startY, int destBottomX, int destBottomY, int destTopX, int destTopY, boolean checkForObjects, 
            boolean walkToACommand) {
        int stepCount = engineHandle.generatePath(startX, startY, destBottomX, destBottomY, destTopX, destTopY, walkArrayX, walkArrayY, checkForObjects);
        if(stepCount == -1)
            if(walkToACommand) {
                stepCount = 1;
                walkArrayX[0] = destBottomX;
                walkArrayY[0] = destBottomY;
            } else {
                return false;
            }
        stepCount--;
        startX = walkArrayX[stepCount];
        startY = walkArrayY[stepCount];
        stepCount--;
        if(walkToACommand)
            super.streamClass.createPacket(246);
        else
            super.streamClass.createPacket(132);
        super.streamClass.addShort(startX + areaX);
        super.streamClass.addShort(startY + areaY);
        if(walkToACommand && stepCount == -1 && (startX + areaX) % 5 == 0)
            stepCount = 0;
        for(int i1 = stepCount; i1 >= 0 && i1 > stepCount - 25; i1--) {
            super.streamClass.addByte(walkArrayX[i1] - startX);
            super.streamClass.addByte(walkArrayY[i1] - startY);
        }

        super.streamClass.formatPacket();
        actionPictureType = -24;
        walkMouseX = super.mouseX;
        walkMouseY = super.mouseY;
        return true;
    }

    private final boolean walkTo2(int startX, int startY, int destBottomX, int destBottomY, int destTopX, int destTopY, boolean unknownDifferent, 
            boolean walkToACommand) {
        int stepCount = engineHandle.generatePath(startX, startY, destBottomX, destBottomY, destTopX, destTopY, walkArrayX, walkArrayY, unknownDifferent);
        if(stepCount == -1)
            return false;
        stepCount--;
        startX = walkArrayX[stepCount];
        startY = walkArrayY[stepCount];
        stepCount--;
        if(walkToACommand)
            super.streamClass.createPacket(246);
        else
            super.streamClass.createPacket(132);
        super.streamClass.addShort(startX + areaX);
        super.streamClass.addShort(startY + areaY);
        if(walkToACommand && stepCount == -1 && (startX + areaX) % 5 == 0)
            stepCount = 0;
        for(int i1 = stepCount; i1 >= 0 && i1 > stepCount - 25; i1--) {
            super.streamClass.addByte(walkArrayX[i1] - startX);
            super.streamClass.addByte(walkArrayY[i1] - startY);
        }

        super.streamClass.formatPacket();
        actionPictureType = -24;
        walkMouseX = super.mouseX;
        walkMouseY = super.mouseY;
        return true;
    }

    private final void drawOptionsMenu(boolean canClick) {
        int l = ((GameImage) (gameGraphics)).gameWidth - 199;
        int i1 = 36;
        gameGraphics.drawPicture(l - 49, 3, baseInventoryPic + 6);
        int c1 = 196;
        gameGraphics.drawBoxAlpha(l, 36, c1, 62, GameImage.rgbToInt(181, 181, 181), 160);
        gameGraphics.drawBoxAlpha(l, 98, c1, 92, GameImage.rgbToInt(201, 201, 201), 160);
        gameGraphics.drawBoxAlpha(l, 190, c1, 90, GameImage.rgbToInt(181, 181, 181), 160);
        gameGraphics.drawBoxAlpha(l, 280, c1, 40, GameImage.rgbToInt(201, 201, 201), 160);
        int j1 = l + 3;
        int l1 = i1 + 15;
        gameGraphics.drawString("Game options - click to toggle", j1, l1, 1, 0);
        l1 += 15;
        if(configCameraAutoAngle)
            gameGraphics.drawString("Camera angle mode - @gre@Auto", j1, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Camera angle mode - @red@Manual", j1, l1, 1, 0xffffff);
        l1 += 15;
        if(configOneMouseButton)
            gameGraphics.drawString("Mouse buttons - @red@One", j1, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Mouse buttons - @gre@Two", j1, l1, 1, 0xffffff);
        l1 += 15;
        if(Config.MEMBERS_FEATURES)
            if(configSoundOff)
                gameGraphics.drawString("Sound effects - @red@off", j1, l1, 1, 0xffffff);
            else
                gameGraphics.drawString("Sound effects - @gre@on", j1, l1, 1, 0xffffff);
        l1 += 15;
        gameGraphics.drawString("Client assists - click to toggle", j1, l1, 1, 0);
        l1 += 15;
        if(showRoofs)
            gameGraphics.drawString("Roofs - @gre@show", j1, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Roofs - @red@hide", j1, l1, 1, 0xffffff);
        l1 += 15;
        if(showCombatWindow)
            gameGraphics.drawString("Fight mode window - @gre@show", j1, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Fight mode window - @red@hide", j1, l1, 1, 0xffffff);
        l1 += 15;
        if(fogOfWar)
            gameGraphics.drawString("Fog of war - @gre@show", j1, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Fog of war - @red@hide", j1, l1, 1, 0xffffff);
        l1 += 15;
        if(autoScreenshot)
            gameGraphics.drawString("Automatic screenshots - @gre@on", j1, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Automatic screenshots - @red@off", j1, l1, 1, 0xffffff);
        l1 += 15;
        if(useChatFilter)
            gameGraphics.drawString("Chat filter: @gre@<on>", l + 3, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Chat filter: @red@<off>", l + 3, l1, 1, 0xffffff);
        l1 += 15;
        gameGraphics.drawString("Privacy settings. Will be applied to", j1, l1, 1, 0);
        l1 += 15;
        gameGraphics.drawString("all people not on your friends list", j1, l1, 1, 0);
        l1 += 15;
        if(super.blockChat == 0)
            gameGraphics.drawString("Block chat messages: @red@<off>", l + 3, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Block chat messages: @gre@<on>", l + 3, l1, 1, 0xffffff);
        l1 += 15;
        if(super.blockPrivate == 0)
            gameGraphics.drawString("Block private messages: @red@<off>", l + 3, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Block private messages: @gre@<on>", l + 3, l1, 1, 0xffffff);
        l1 += 15;
        if(super.blockTrade == 0)
            gameGraphics.drawString("Block trade requests: @red@<off>", l + 3, l1, 1, 0xffffff);
        else
            gameGraphics.drawString("Block trade requests: @gre@<on>", l + 3, l1, 1, 0xffffff);
        l1 += 15;
        if(Config.MEMBERS_FEATURES)
            if(super.blockDuel == 0)
                gameGraphics.drawString("Block duel requests: @red@<off>", l + 3, l1, 1, 0xffffff);
            else
                gameGraphics.drawString("Block duel requests: @gre@<on>", l + 3, l1, 1, 0xffffff);
        l1 += 15;
        l1 += 5;
        gameGraphics.drawString("Always logout when you finish", j1, l1, 1, 0);
        l1 += 15;
        int j2 = 0xffffff;
        if(super.mouseX > j1 && super.mouseX < j1 + c1 && super.mouseY > l1 - 12 && super.mouseY < l1 + 4)
            j2 = 0xffff00;
        gameGraphics.drawString("Click here to logout", l + 3, l1, 1, j2);
        if(!canClick)
            return;
        l = super.mouseX - (((GameImage) (gameGraphics)).gameWidth - 199);
        i1 = super.mouseY - 36;
        if(l >= 0 && i1 >= 0 && l < 196 && i1 < 280) {
            int k2 = ((GameImage) (gameGraphics)).gameWidth - 199;
            byte byte0 = 36;
            char c2 = '\304';
            int k1 = k2 + 3;
            int i2 = byte0 + 30;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                configCameraAutoAngle = !configCameraAutoAngle;
                super.streamClass.createPacket(157);
                super.streamClass.addByte(0);
                super.streamClass.addByte(configCameraAutoAngle ? 1 : 0);
                super.streamClass.formatPacket();
            }
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                configOneMouseButton = !configOneMouseButton;
                super.streamClass.createPacket(157);
                super.streamClass.addByte(2);
                super.streamClass.addByte(configOneMouseButton ? 1 : 0);
                super.streamClass.formatPacket();
            }
            i2 += 15;
            if(Config.MEMBERS_FEATURES && super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                configSoundOff = !configSoundOff;
                super.streamClass.createPacket(157);
                super.streamClass.addByte(3);
                super.streamClass.addByte(configSoundOff ? 1 : 0);
                super.streamClass.formatPacket();
            }
            i2 += 15;
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                showRoofs = !showRoofs;
                super.streamClass.createPacket(157);
                super.streamClass.addByte(4);
                super.streamClass.addByte(showRoofs ? 1 : 0);
                super.streamClass.formatPacket();
            }
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                showCombatWindow = !showCombatWindow;
                super.streamClass.createPacket(157);
                super.streamClass.addByte(6);
                super.streamClass.addByte(showCombatWindow ? 1 : 0);
                super.streamClass.formatPacket();
            }
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                fogOfWar = !fogOfWar;
            }
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                autoScreenshot = !autoScreenshot;
                super.streamClass.createPacket(157);
                super.streamClass.addByte(5);
                super.streamClass.addByte(autoScreenshot ? 1 : 0);
                super.streamClass.formatPacket();
            }
            boolean flag = false;
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                useChatFilter = !useChatFilter;
            }
            i2 += 15;
            i2 += 15;
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                super.blockChat = 1 - super.blockChat;
                flag = true;
            }
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                super.blockPrivate = 1 - super.blockPrivate;
                flag = true;
            }
            i2 += 15;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                super.blockTrade = 1 - super.blockTrade;
                flag = true;
            }
            i2 += 15;
            if(Config.MEMBERS_FEATURES && super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1) {
                super.blockDuel = 1 - super.blockDuel;
                flag = true;
            }
            i2 += 15;
            if(flag)
                sendUpdatedPrivacyInfo(super.blockChat, super.blockPrivate, super.blockTrade, super.blockDuel);
            i2 += 20;
            if(super.mouseX > k1 && super.mouseX < k1 + c2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && mouseButtonClick == 1)
                sendLogout();
            mouseButtonClick = 0;
        }
    }

    private final void walkToObject(int arg0, int arg1, int arg2, int arg3) {
        int l;
        int i1;
        if(arg2 == 0 || arg2 == 4) {
            l = Data.objectWidth[arg3];
            i1 = Data.objectHeight[arg3];
        } else {
            i1 = Data.objectWidth[arg3];
            l = Data.objectHeight[arg3];
        }
        if(Data.objectType[arg3] == 2 || Data.objectType[arg3] == 3) {
            if(arg2 == 0) {
                arg0--;
                l++;
            }
            if(arg2 == 2)
                i1++;
            if(arg2 == 4)
                l++;
            if(arg2 == 6) {
                arg1--;
                i1++;
            }
            walkTo(sectionX, sectionY, arg0, arg1, (arg0 + l) - 1, (arg1 + i1) - 1, false, true);
            return;
        } else {
            walkTo(sectionX, sectionY, arg0, arg1, (arg0 + l) - 1, (arg1 + i1) - 1, true, true);
            return;
        }
    }

    private final void createChatInputMenu() {
        chatInputMenu = new Menu(gameGraphics, 10);
        messagesHandleType2 = chatInputMenu.gfh(5, 269, 502, 56, 1, 20, true);
        chatInputBox = chatInputMenu.gfi(7, 324, 498, 14, 1, 80, false, true);
        messagesHandleType5 = chatInputMenu.gfh(5, 269, 502, 56, 1, 20, true);
        messagesHandleType6 = chatInputMenu.gfh(5, 269, 502, 56, 1, 20, true);
        chatInputMenu.setFocus(chatInputBox);
    }

    private final void drawCombatStyleBox() {
        byte byte0 = 7;
        byte byte1 = 15;
        char c1 = '\257';
        if(mouseButtonClick != 0) {
            for(int l = 0; l < 5; l++) {
                if(l <= 0 || super.mouseX <= byte0 || super.mouseX >= byte0 + c1 || super.mouseY <= byte1 + l * 20 || super.mouseY >= byte1 + l * 20 + 20)
                    continue;
                combatStyle = l - 1;
                mouseButtonClick = 0;
                super.streamClass.createPacket(42);
                super.streamClass.addByte(combatStyle);
                super.streamClass.formatPacket();
                break;
            }

        }
        for(int i1 = 0; i1 < 5; i1++) {
            if(i1 == combatStyle + 1)
                gameGraphics.drawBoxAlpha(byte0, byte1 + i1 * 20, c1, 20, GameImage.rgbToInt(255, 0, 0), 128);
            else
                gameGraphics.drawBoxAlpha(byte0, byte1 + i1 * 20, c1, 20, GameImage.rgbToInt(190, 190, 190), 128);
            gameGraphics.drawLineX(byte0, byte1 + i1 * 20, c1, 0);
            gameGraphics.drawLineX(byte0, byte1 + i1 * 20 + 20, c1, 0);
        }

        gameGraphics.drawText("Select combat style", byte0 + c1 / 2, byte1 + 16, 3, 0xffffff);
        gameGraphics.drawText("Controlled (+1 of each)", byte0 + c1 / 2, byte1 + 36, 3, 0);
        gameGraphics.drawText("Aggressive (+3 strength)", byte0 + c1 / 2, byte1 + 56, 3, 0);
        gameGraphics.drawText("Accurate   (+3 attack)", byte0 + c1 / 2, byte1 + 76, 3, 0);
        gameGraphics.drawText("Defensive  (+3 defense)", byte0 + c1 / 2, byte1 + 96, 3, 0);
    }

    private final void drawTradeBox() {
        if(mouseButtonClick != 0) {
            int mx = super.mouseX - 22;
            int my = super.mouseY - 36;
            if(mx >= 0 && my >= 30 && mx < 462 && my < 262) {
                if(mx > 216 && my > 30 && mx < 462 && my < 235) {
                    int curItem = (mx - 217) / 49 + ((my - 31) / 34) * 5;
                    if(curItem >= 0 && curItem < inventoryItemsCount) {
                        int item = inventoryItems[curItem];
                        mouseClickedHeldInTradeDuelBox = 1;
                        boolean ourTradeItemsChanged = false;
                        int someInt = 0;
                        for(int tradeItem = 0; tradeItem < tradeItemsOurCount; tradeItem++)
                            if(tradeItemsOur[tradeItem] == item)
                                if(Data.itemStackable[item] == 0)
                                    for(int i = 0; i < mouseClickedHeldInTradeDuelBox; i++) {
                                        if(tradeItemOurCount[tradeItem] < inventoryItemCount[curItem])
                                            tradeItemOurCount[tradeItem]++;
                                        ourTradeItemsChanged = true;
                                    }
                                else
                                    someInt++;
                        if(getInventoryItemTotalCount(item) <= someInt)
                            ourTradeItemsChanged = true;
                        if(Data.itemSpecial[item] == 1) {
                            displayMessage("This object cannot be traded with other players", 3);
                            ourTradeItemsChanged = true;
                        }
                        if(!ourTradeItemsChanged && tradeItemsOurCount < 12) {
                            tradeItemsOur[tradeItemsOurCount] = item;
                            tradeItemOurCount[tradeItemsOurCount] = 1;
                            tradeItemsOurCount++;
                            ourTradeItemsChanged = true;
                        }
                        if(ourTradeItemsChanged) {
                            super.streamClass.createPacket(70);
                            super.streamClass.addByte(tradeItemsOurCount);
                            for(int i = 0; i < tradeItemsOurCount; i++) {
                                super.streamClass.addShort(tradeItemsOur[i]);
                                super.streamClass.addInt(tradeItemOurCount[i]);
                            }
                            super.streamClass.formatPacket();
                            tradeOtherAccepted = false;
                            tradeWeAccepted = false;
                        }
                    }
                }
                else if(mx > 8 && my > 30 && mx < 205 && my < 133) {
                    int curItem = (mx - 9) / 49 + ((my - 31) / 34) * 4;
                    if(curItem >= 0 && curItem < tradeItemsOurCount) {
                        int item = tradeItemsOur[curItem];
                        for(int i = 0; i < mouseClickedHeldInTradeDuelBox; i++) {
                            if(Data.itemStackable[item] == 0 && tradeItemOurCount[curItem] > 1) {
                                tradeItemOurCount[curItem]--;
                                continue;
                            }
                            tradeItemsOurCount--;
                            mouseButtonHeldTime = 0;
                            for(int j = curItem; j < tradeItemsOurCount; j++) {
                                tradeItemsOur[j] = tradeItemsOur[j + 1];
                                tradeItemOurCount[j] = tradeItemOurCount[j + 1];
                            }
                            break;
                        }
                        super.streamClass.createPacket(70);
                        super.streamClass.addByte(tradeItemsOurCount);
                        for(int i = 0; i < tradeItemsOurCount; i++) {
                            super.streamClass.addShort(tradeItemsOur[i]);
                            super.streamClass.addInt(tradeItemOurCount[i]);
                        }
                        super.streamClass.formatPacket();
                        tradeOtherAccepted = false;
                        tradeWeAccepted = false;
                    }
                }
                if(mx >= 217 && my >= 238 && mx <= 286 && my <= 259) {
                    tradeWeAccepted = true;
                    super.streamClass.createPacket(211);
                    super.streamClass.formatPacket();
                }
                if(mx >= 394 && my >= 238 && mx < 463 && my < 259) {
                    showTradeBox = false;
                    super.streamClass.createPacket(216);
                    super.streamClass.formatPacket();
                }
            }
            else {
                showTradeBox = false;
                super.streamClass.createPacket(216);
                super.streamClass.formatPacket();
            }
            mouseButtonClick = 0;
            mouseClickedHeldInTradeDuelBox = 0;
        }
        if(!showTradeBox)
            return;
        byte byte0 = 22;
        byte byte1 = 36;
        gameGraphics.drawBox(byte0, byte1, 468, 12, 192);
        int l1 = 0x989898;
        gameGraphics.drawBoxAlpha(byte0, byte1 + 12, 468, 18, l1, 160);
        gameGraphics.drawBoxAlpha(byte0, byte1 + 30, 8, 248, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 205, byte1 + 30, 11, 248, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 462, byte1 + 30, 6, 248, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 133, 197, 22, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 258, 197, 20, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 216, byte1 + 235, 246, 43, l1, 160);
        int j2 = 0xd0d0d0;
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 30, 197, 103, j2, 160);
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 155, 197, 103, j2, 160);
        gameGraphics.drawBoxAlpha(byte0 + 216, byte1 + 30, 246, 205, j2, 160);
        for(int i3 = 0; i3 < 4; i3++)
            gameGraphics.drawLineX(byte0 + 8, byte1 + 30 + i3 * 34, 197, 0);

        for(int i4 = 0; i4 < 4; i4++)
            gameGraphics.drawLineX(byte0 + 8, byte1 + 155 + i4 * 34, 197, 0);

        for(int k4 = 0; k4 < 7; k4++)
            gameGraphics.drawLineX(byte0 + 216, byte1 + 30 + k4 * 34, 246, 0);

        for(int j5 = 0; j5 < 6; j5++) {
            if(j5 < 5)
                gameGraphics.drawLineY(byte0 + 8 + j5 * 49, byte1 + 30, 103, 0);
            if(j5 < 5)
                gameGraphics.drawLineY(byte0 + 8 + j5 * 49, byte1 + 155, 103, 0);
            gameGraphics.drawLineY(byte0 + 216 + j5 * 49, byte1 + 30, 205, 0);
        }

        gameGraphics.drawString("Trading with: " + tradeOtherName, byte0 + 1, byte1 + 10, 1, 0xffffff);
        gameGraphics.drawString("Your Offer", byte0 + 9, byte1 + 27, 4, 0xffffff);
        gameGraphics.drawString("Opponent's Offer", byte0 + 9, byte1 + 152, 4, 0xffffff);
        gameGraphics.drawString("Your Inventory", byte0 + 216, byte1 + 27, 4, 0xffffff);
        if(!tradeWeAccepted)
            gameGraphics.drawPicture(byte0 + 217, byte1 + 238, baseInventoryPic + 25);
        gameGraphics.drawPicture(byte0 + 394, byte1 + 238, baseInventoryPic + 26);
        if(tradeOtherAccepted) {
            gameGraphics.drawText("Other player", byte0 + 341, byte1 + 246, 1, 0xffffff);
            gameGraphics.drawText("has accepted", byte0 + 341, byte1 + 256, 1, 0xffffff);
        }
        if(tradeWeAccepted) {
            gameGraphics.drawText("Waiting for", byte0 + 217 + 35, byte1 + 246, 1, 0xffffff);
            gameGraphics.drawText("other player", byte0 + 217 + 35, byte1 + 256, 1, 0xffffff);
        }
        for(int k5 = 0; k5 < inventoryItemsCount; k5++) {
            int l5 = 217 + byte0 + (k5 % 5) * 49;
            int j6 = 31 + byte1 + (k5 / 5) * 34;
            gameGraphics.drawImage(l5, j6, 48, 32, baseItemPicture + Data.itemInventoryPicture[inventoryItems[k5]], Data.itemPictureMask[inventoryItems[k5]], 0, 0, false);
            if(Data.itemStackable[inventoryItems[k5]] == 0)
                gameGraphics.drawString(String.valueOf(inventoryItemCount[k5]), l5 + 1, j6 + 10, 1, 0xffff00);
        }

        for(int i6 = 0; i6 < tradeItemsOurCount; i6++) {
            int k6 = 9 + byte0 + (i6 % 4) * 49;
            int i7 = 31 + byte1 + (i6 / 4) * 34;
            gameGraphics.drawImage(k6, i7, 48, 32, baseItemPicture + Data.itemInventoryPicture[tradeItemsOur[i6]], Data.itemPictureMask[tradeItemsOur[i6]], 0, 0, false);
            if(Data.itemStackable[tradeItemsOur[i6]] == 0)
                gameGraphics.drawString(String.valueOf(tradeItemOurCount[i6]), k6 + 1, i7 + 10, 1, 0xffff00);
            if(super.mouseX > k6 && super.mouseX < k6 + 48 && super.mouseY > i7 && super.mouseY < i7 + 32)
                gameGraphics.drawString(Data.itemName[tradeItemsOur[i6]] + ": @whi@" + Data.itemDescription[tradeItemsOur[i6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

        for(int l6 = 0; l6 < tradeItemsOtherCount; l6++) {
            int j7 = 9 + byte0 + (l6 % 4) * 49;
            int k7 = 156 + byte1 + (l6 / 4) * 34;
            gameGraphics.drawImage(j7, k7, 48, 32, baseItemPicture + Data.itemInventoryPicture[tradeItemsOther[l6]], Data.itemPictureMask[tradeItemsOther[l6]], 0, 0, false);
            if(Data.itemStackable[tradeItemsOther[l6]] == 0)
                gameGraphics.drawString(String.valueOf(tradeItemOtherCount[l6]), j7 + 1, k7 + 10, 1, 0xffff00);
            if(super.mouseX > j7 && super.mouseX < j7 + 48 && super.mouseY > k7 && super.mouseY < k7 + 32)
                gameGraphics.drawString(Data.itemName[tradeItemsOther[l6]] + ": @whi@" + Data.itemDescription[tradeItemsOther[l6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

    }

    private final void autoRotateCamera() {
        if((cameraAutoAngle & 1) == 1 && validCameraAngle(cameraAutoAngle))
            return;
        if((cameraAutoAngle & 1) == 0 && validCameraAngle(cameraAutoAngle)) {
            if(validCameraAngle(cameraAutoAngle + 1 & 7)) {
                cameraAutoAngle = cameraAutoAngle + 1 & 7;
                return;
            }
            if(validCameraAngle(cameraAutoAngle + 7 & 7))
                cameraAutoAngle = cameraAutoAngle + 7 & 7;
            return;
        }
        int ai[] = {
            1, -1, 2, -2, 3, -3, 4
        };
        for(int l = 0; l < 7; l++) {
            if(!validCameraAngle(cameraAutoAngle + ai[l] + 8 & 7))
                continue;
            cameraAutoAngle = cameraAutoAngle + ai[l] + 8 & 7;
            break;
        }

        if((cameraAutoAngle & 1) == 0 && validCameraAngle(cameraAutoAngle)) {
            if(validCameraAngle(cameraAutoAngle + 1 & 7)) {
                cameraAutoAngle = cameraAutoAngle + 1 & 7;
                return;
            }
            if(validCameraAngle(cameraAutoAngle + 7 & 7))
                cameraAutoAngle = cameraAutoAngle + 7 & 7;
            return;
        } else {
            return;
        }
    }

    public final String getParameter(String s1) {
        if(link.gameApplet != null)
            return link.gameApplet.getParameter(s1);
        else
            return super.getParameter(s1);
    }

    private final void drawLogoutBox() {
        gameGraphics.drawBox(126, 137, 260, 60, 0);
        gameGraphics.drawBoxEdge(126, 137, 260, 60, 0xffffff);
        gameGraphics.drawText("Logging out...", 256, 173, 5, 0xffffff);
    }

    private final void walkToGroundItem(int l, int i1, int j1, int k1, boolean flag) {
        if(walkTo2(l, i1, j1, k1, j1, k1, false, flag)) {
            return;
        } else {
            walkTo(l, i1, j1, k1, j1, k1, true, flag);
            return;
        }
    }

    protected final void loginScreenPrint(String s1, String s2) {
        if(loginScreen == 2 && loginMenuLogin != null)
            loginMenuLogin.updateText(loginMenuStatusText, s1 + " " + s2);
        drawLoginScreens();
        resetTimings();
    }

    final void drawTeleBubble(int l, int i1, int j1, int k1, int l1, int i2, int j2) {
        int type = teleBubbleType[l1];
        int time = teleBubbleTime[l1];
        if(type == 0) {
            int i3 = 255 + time * 5 * 256;
            gameGraphics.drawCircle(l + j1 / 2, i1 + k1 / 2, 20 + time * 2, i3, 255 - time * 5);
        }
        if(type == 1) {
            int j3 = 0xff0000 + time * 5 * 256;
            gameGraphics.drawCircle(l + j1 / 2, i1 + k1 / 2, 10 + time, j3, 255 - time * 5);
        }
    }

    private final void checkLoginScreenInputs() {
        if(super.socketTimeout > 0)
            super.socketTimeout--;
        if(loginScreen == 0) {
            loginMenuFirst.mouseClick(super.mouseX, super.mouseY, super.lastMouseButton, super.mouseButton);
            if(loginMenuFirst.isClicked(loginButtonNewUser))
                loginScreen = 1;
            if(loginMenuFirst.isClicked(loginMenuLoginButton)) {
                loginScreen = 2;
                loginMenuLogin.updateText(loginMenuStatusText, "Please enter your username and password");
                loginMenuLogin.updateText(loginMenuUserText, "");
                loginMenuLogin.updateText(loginMenuPasswordText, "");
                loginMenuLogin.setFocus(loginMenuUserText);
                return;
            }
        } else
        if(loginScreen == 1) {
            loginNewUser.mouseClick(super.mouseX, super.mouseY, super.lastMouseButton, super.mouseButton);
            if(loginNewUser.isClicked(loginMenuOkButton)) {
                loginScreen = 0;
                return;
            }
        } else
        if(loginScreen == 2) {
            loginMenuLogin.mouseClick(super.mouseX, super.mouseY, super.lastMouseButton, super.mouseButton);
            if(loginMenuLogin.isClicked(loginMenuCancelButton))
                loginScreen = 0;
            if(loginMenuLogin.isClicked(loginMenuUserText))
                loginMenuLogin.setFocus(loginMenuPasswordText);
            if(loginMenuLogin.isClicked(loginMenuPasswordText) || loginMenuLogin.isClicked(loginMenuOkLoginButton)) {
                loginUsername = loginMenuLogin.getText(loginMenuUserText);
                loginPassword = loginMenuLogin.getText(loginMenuPasswordText);
                connect(loginUsername, loginPassword, false);
            }
        }
    }

    private final boolean isItemEquipped(int arg0) {
        for(int l = 0; l < inventoryItemsCount; l++)
            if(inventoryItems[l] == arg0 && inventoryItemEquipped[l] == 1)
                return true;

        return false;
    }

    protected final void drawWindow() {
        if(errorLoading) {
            Graphics g1 = getGraphics();
            g1.setColor(Color.black);
            g1.fillRect(0, 0, 512, 356);
            g1.setFont(new Font("Helvetica", 1, 16));
            g1.setColor(Color.yellow);
            int l = 35;
            g1.drawString("Sorry, an error has occured whilst loading", 30, l);
            l += 50;
            g1.setColor(Color.white);
            g1.drawString("To fix this try the following (in order):", 30, l);
            l += 50;
            g1.setColor(Color.white);
            g1.setFont(new Font("Helvetica", 1, 12));
            g1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, l);
            l += 30;
            g1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, l);
            l += 30;
            g1.drawString("3: Try using a different game-world", 30, l);
            l += 30;
            g1.drawString("4: Try rebooting your computer", 30, l);
            l += 30;
            g1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, l);
            setRefreshRate(1);
            return;
        }
        if(memoryError) {
            Graphics g3 = getGraphics();
            g3.setColor(Color.black);
            g3.fillRect(0, 0, 512, 356);
            g3.setFont(new Font("Helvetica", 1, 20));
            g3.setColor(Color.white);
            g3.drawString("Error - out of memory!", 50, 50);
            g3.drawString("Close ALL unnecessary programs", 50, 100);
            g3.drawString("and windows before loading the game", 50, 150);
            g3.drawString("this game needs about 48meg of spare RAM", 50, 200);
            setRefreshRate(1);
            return;
        }
        try {
            if(loggedIn == 0) {
                gameGraphics.loggedIn = false;
                drawLoginScreens();
            }
            if(loggedIn == 1) {
                gameGraphics.loggedIn = true;
                drawGame();
                return;
            }
        }
        catch(OutOfMemoryError _ex) {
            cleanUp();
            memoryError = true;
        }
    }

    private final void cleanUp() {
        try {
            if(gameGraphics != null) {
                gameGraphics.cleanUp();
                gameGraphics.pixels = null;
                gameGraphics = null;
            }
            if(gameCamera != null) {
                gameCamera.cleanUp();
                gameCamera = null;
            }
            gameDataObjects = null;
            objectArray = null;
            wallObjectArray = null;
            playerBufferArray = null;
            playerArray = null;
            npcAttackingArray = null;
            npcArray = null;
            ourPlayer = null;
            if(engineHandle != null) {
                engineHandle.ghn = null;
                engineHandle.gim = null;
                engineHandle.gih = null;
                engineHandle.gia = null;
                engineHandle = null;
            }
            System.gc();
            return;
        }
        catch(Exception _ex) {
            return;
        }
    }

    private final void drawQuestionMenu() {
        if(mouseButtonClick != 0) {
            for(int l = 0; l < questionMenuCount; l++) {
                if(super.mouseX >= gameGraphics.textWidth(questionMenuAnswer[l], 1) || super.mouseY <= l * 12 || super.mouseY >= 12 + l * 12)
                    continue;
                super.streamClass.createPacket(154);
                super.streamClass.addByte(l);
                super.streamClass.formatPacket();
                break;
            }

            mouseButtonClick = 0;
            showQuestionMenu = false;
            return;
        }
        for(int i1 = 0; i1 < questionMenuCount; i1++) {
            int j1 = 65535;
            if(super.mouseX < gameGraphics.textWidth(questionMenuAnswer[i1], 1) && super.mouseY > i1 * 12 && super.mouseY < 12 + i1 * 12)
                j1 = 0xff0000;
            gameGraphics.drawString(questionMenuAnswer[i1], 6, 12 + i1 * 12, 1, j1);
        }

    }

    private final void drawTradeConfirmBox() {
        byte byte0 = 22;
        byte byte1 = 36;
        gameGraphics.drawBox(byte0, byte1, 468, 16, 192);
        int l = 0x989898;
        gameGraphics.drawBoxAlpha(byte0, byte1 + 16, 468, 246, l, 160);
        gameGraphics.drawText("Please confirm your trade with @yel@" + DataOperations.hashToName(tradeConfirmOtherNameLong), byte0 + 234, byte1 + 12, 1, 0xffffff);
        gameGraphics.drawText("You are about to give:", byte0 + 117, byte1 + 30, 1, 0xffff00);
        for(int i1 = 0; i1 < tradeConfigItemCount; i1++) {
            String s1 = Data.itemName[tradeConfirmItems[i1]];
            if(Data.itemStackable[tradeConfirmItems[i1]] == 0)
                s1 = s1 + " x " + formatItemCount(tradeConfigItemsCount[i1]);
            gameGraphics.drawText(s1, byte0 + 117, byte1 + 42 + i1 * 12, 1, 0xffffff);
        }

        if(tradeConfigItemCount == 0)
            gameGraphics.drawText("Nothing!", byte0 + 117, byte1 + 42, 1, 0xffffff);
        gameGraphics.drawText("In return you will receive:", byte0 + 351, byte1 + 30, 1, 0xffff00);
        for(int j1 = 0; j1 < tradeConfirmOtherItemCount; j1++) {
            String s2 = Data.itemName[tradeConfirmOtherItems[j1]];
            if(Data.itemStackable[tradeConfirmOtherItems[j1]] == 0)
                s2 = s2 + " x " + formatItemCount(tradeConfirmOtherItemsCount[j1]);
            gameGraphics.drawText(s2, byte0 + 351, byte1 + 42 + j1 * 12, 1, 0xffffff);
        }

        if(tradeConfirmOtherItemCount == 0)
            gameGraphics.drawText("Nothing!", byte0 + 351, byte1 + 42, 1, 0xffffff);
        gameGraphics.drawText("Are you sure you want to do this?", byte0 + 234, byte1 + 200, 4, 65535);
        gameGraphics.drawText("There is NO WAY to reverse a trade if you change your mind.", byte0 + 234, byte1 + 215, 1, 0xffffff);
        gameGraphics.drawText("Remember that not all players are trustworthy", byte0 + 234, byte1 + 230, 1, 0xffffff);
        if(!tradeConfirmAccepted) {
            gameGraphics.drawPicture((byte0 + 118) - 35, byte1 + 238, baseInventoryPic + 25);
            gameGraphics.drawPicture((byte0 + 352) - 35, byte1 + 238, baseInventoryPic + 26);
        } else {
            gameGraphics.drawText("Waiting for other player...", byte0 + 234, byte1 + 250, 1, 0xffff00);
        }
        if(mouseButtonClick == 1) {
            if(super.mouseX < byte0 || super.mouseY < byte1 || super.mouseX > byte0 + 468 || super.mouseY > byte1 + 262) {
                showTradeConfirmBox = false;
                super.streamClass.createPacket(216);
                super.streamClass.formatPacket();
            }
            if(super.mouseX >= (byte0 + 118) - 35 && super.mouseX <= byte0 + 118 + 70 && super.mouseY >= byte1 + 238 && super.mouseY <= byte1 + 238 + 21) {
                tradeConfirmAccepted = true;
                super.streamClass.createPacket(53);
                super.streamClass.formatPacket();
            }
            if(super.mouseX >= (byte0 + 352) - 35 && super.mouseX <= byte0 + 353 + 70 && super.mouseY >= byte1 + 238 && super.mouseY <= byte1 + 238 + 21) {
                showTradeConfirmBox = false;
                super.streamClass.createPacket(216);
                super.streamClass.formatPacket();
            }
            mouseButtonClick = 0;
        }
    }

    private final void drawLoginScreens() {
        loginScreenShown = false;
        if(gameGraphics == null)
            return;
        gameGraphics.interlace = false;
        gameGraphics.clearScreen();
        if(loginScreen == 0 || loginScreen == 1 || loginScreen == 2 || loginScreen == 3) {
            int l = (tick * 2) % 3072;
            if(l < 1024) {
                gameGraphics.drawPicture(0, 10, baseLoginScreenBackgroundPic);
                if(l > 768)
                    gameGraphics.ccd(0, 10, baseLoginScreenBackgroundPic + 1, l - 768);
            } else
            if(l < 2048) {
                gameGraphics.drawPicture(0, 10, baseLoginScreenBackgroundPic + 1);
                if(l > 1792)
                    gameGraphics.ccd(0, 10, baseInventoryPic + 10, l - 1792);
            } else {
                gameGraphics.drawPicture(0, 10, baseInventoryPic + 10);
                if(l > 2816)
                    gameGraphics.ccd(0, 10, baseLoginScreenBackgroundPic, l - 2816);
            }
        }
        if(loginScreen == 0)
            loginMenuFirst.drawMenu();
        if(loginScreen == 1)
            loginNewUser.drawMenu();
        if(loginScreen == 2)
            loginMenuLogin.drawMenu();
        gameGraphics.drawPicture(0, windowHeight, baseInventoryPic + 22);
        gameGraphics.drawImage(graphics, 0, 0);
    }

    final void drawItem(int x, int y, int width, int height, int itemID, int i2, int j2) {
        int picture = Data.itemInventoryPicture[itemID] + baseItemPicture;
        int mask = Data.itemPictureMask[itemID];
        gameGraphics.drawImage(x, y, width, height, picture, mask, 0, 0, false);
    }

    private final Mob makePlayer(int index, int x, int y, int sprite) {
        if(playerBufferArray[index] == null) {
            playerBufferArray[index] = new Mob();
            playerBufferArray[index].serverIndex = index;
            playerBufferArray[index].serverID = 0;
        }
        Mob existingPlayer = playerBufferArray[index];
        boolean flag = false;
        for(int l = 0; l < lastPlayerCount; l++) {
            if(lastPlayerArray[l].serverIndex != index)
                continue;
            flag = true;
            break;
        }

        if(flag) {
            existingPlayer.nextSprite = sprite;
            int i1 = existingPlayer.waypointCurrent;
            if(x != existingPlayer.waypointsX[i1] || y != existingPlayer.waypointsY[i1]) {
                existingPlayer.waypointCurrent = i1 = (i1 + 1) % 10;
                existingPlayer.waypointsX[i1] = x;
                existingPlayer.waypointsY[i1] = y;
            }
        } else {
            existingPlayer.serverIndex = index;
            existingPlayer.waypointsEndSprite = 0;
            existingPlayer.waypointCurrent = 0;
            existingPlayer.waypointsX[0] = existingPlayer.currentX = x;
            existingPlayer.waypointsY[0] = existingPlayer.currentY = y;
            existingPlayer.nextSprite = existingPlayer.currentSprite = sprite;
            existingPlayer.stepCount = 0;
        }
        playerArray[playerCount++] = existingPlayer;
        return existingPlayer;
    }

    private final void walkTo1Tile(int l, int i1, int j1, int k1, boolean flag) {
        walkTo(l, i1, j1, k1, j1, k1, false, flag);
    }

    private final void loadConfig() {
        byte abyte0[] = unpackData("config.jag", "Configuration", 10);
        if(abyte0 == null) {
            errorLoading = true;
            return;
        }
        Data.load(abyte0);
        byte abyte1[] = unpackData("filter.jag", "Chat system", 15);
        if(abyte1 == null) {
            errorLoading = true;
            return;
        } else {
            byte abyte2[] = DataOperations.loadData("fragmentsenc.txt", 0, abyte1);
            byte abyte3[] = DataOperations.loadData("badenc.txt", 0, abyte1);
            byte abyte4[] = DataOperations.loadData("hostenc.txt", 0, abyte1);
            byte abyte5[] = DataOperations.loadData("tldlist.txt", 0, abyte1);
            ChatFilter.addFilterData(new DataEncryption(abyte2), new DataEncryption(abyte3), new DataEncryption(abyte4), new DataEncryption(abyte5));
            return;
        }
    }

    protected final void handleMouseDown(int arg0, int arg1, int arg2) {
        mouseTrailX[mouseTrailIndex] = arg1;
        mouseTrailY[mouseTrailIndex] = arg2;
        mouseTrailIndex = mouseTrailIndex + 1 & 0x1fff;
        for(int l = 10; l < 4000; l++) {
            int lastMouseTrailIndex = mouseTrailIndex - l & 0x1fff;
            if(mouseTrailX[lastMouseTrailIndex] == arg1 && mouseTrailY[lastMouseTrailIndex] == arg2) {
                boolean flag = false;
                for(int j1 = 1; j1 < l; j1++) {
                    int mouseNew = mouseTrailIndex - j1 & 0x1fff;
                    int mouseOld = lastMouseTrailIndex - j1 & 0x1fff;
                    if(mouseTrailX[mouseOld] != arg1 || mouseTrailY[mouseOld] != arg2)
                        flag = true;
                    if(mouseTrailX[mouseNew] != mouseTrailX[mouseOld] || mouseTrailY[mouseNew] != mouseTrailY[mouseOld])
                        break;
                    if(j1 == l - 1 && flag && combatTimeout == 0 && logoutTimer == 0) {
                        sendLogout();
                        return;
                    }
                }

            }
        }

    }

    private final void drawFriendsMenu(boolean canClick) {
        int l = ((GameImage) (gameGraphics)).gameWidth - 199;
        int i1 = 36;
        gameGraphics.drawPicture(l - 49, 3, baseInventoryPic + 5);
        char c1 = '\304';
        char c2 = '\266';
        int k1;
        int j1 = k1 = GameImage.rgbToInt(160, 160, 160);
        if(friendsIgnoreMenuSelected == 0)
            j1 = GameImage.rgbToInt(220, 220, 220);
        else
            k1 = GameImage.rgbToInt(220, 220, 220);
        gameGraphics.drawBoxAlpha(l, i1, c1 / 2, 24, j1, 128);
        gameGraphics.drawBoxAlpha(l + c1 / 2, i1, c1 / 2, 24, k1, 128);
        gameGraphics.drawBoxAlpha(l, i1 + 24, c1, c2 - 24, GameImage.rgbToInt(220, 220, 220), 128);
        gameGraphics.drawLineX(l, i1 + 24, c1, 0);
        gameGraphics.drawLineY(l + c1 / 2, i1, 24, 0);
        gameGraphics.drawLineX(l, (i1 + c2) - 16, c1, 0);
        gameGraphics.drawText("Friends", l + c1 / 4, i1 + 16, 4, 0);
        gameGraphics.drawText("Ignore", l + c1 / 4 + c1 / 2, i1 + 16, 4, 0);
        friendsLastShownEntries = spellMenu.listShownEntries;
        friendsMenu.clearList(friendsMenuHandle);
        if(friendsIgnoreMenuSelected == 0) {
            for(int l1 = 0; l1 < super.friendsCount; l1++) {
                String s1;
                if(super.friendsWorld[l1] == 99)
                    s1 = "@gre@";
                else
                if(super.friendsWorld[l1] > 0)
                    s1 = "@yel@";
                else
                    s1 = "@red@";
                friendsMenu.addListItem(friendsMenuHandle, l1, s1 + DataOperations.hashToName(super.friendsList[l1]) + "~439~@whi@Remove         WWWWWWWWWW");
            }

        }
        if(friendsIgnoreMenuSelected == 1) {
            for(int i2 = 0; i2 < super.ignoresCount; i2++)
                friendsMenu.addListItem(friendsMenuHandle, i2, "@yel@" + DataOperations.hashToName(super.ignoresList[i2]) + "~439~@whi@Remove         WWWWWWWWWW");

        }
        friendsMenu.listShownEntries = friendsLastShownEntries;
        friendsMenu.drawMenu();
        if(friendsIgnoreMenuSelected == 0) {
            int j2 = friendsMenu.getEntryHighlighted(friendsMenuHandle);
            if(j2 >= 0 && super.mouseX < 489) {
                if(super.mouseX > 429)
                    gameGraphics.drawText("Click to remove " + DataOperations.hashToName(super.friendsList[j2]), l + c1 / 2, i1 + 35, 1, 0xffffff);
                else
                if(super.friendsWorld[j2] == 99)
                    gameGraphics.drawText("Click to message " + DataOperations.hashToName(super.friendsList[j2]), l + c1 / 2, i1 + 35, 1, 0xffffff);
                else
                if(super.friendsWorld[j2] > 0)
                    gameGraphics.drawText(DataOperations.hashToName(super.friendsList[j2]) + " is on world " + super.friendsWorld[j2], l + c1 / 2, i1 + 35, 1, 0xffffff);
                else
                    gameGraphics.drawText(DataOperations.hashToName(super.friendsList[j2]) + " is offline", l + c1 / 2, i1 + 35, 1, 0xffffff);
            } else {
                gameGraphics.drawText("Click a name to send a message", l + c1 / 2, i1 + 35, 1, 0xffffff);
            }
            int j3;
            if(super.mouseX > l && super.mouseX < l + c1 && super.mouseY > (i1 + c2) - 16 && super.mouseY < i1 + c2)
                j3 = 0xffff00;
            else
                j3 = 0xffffff;
            gameGraphics.drawText("Click here to add a friend", l + c1 / 2, (i1 + c2) - 3, 1, j3);
        }
        if(friendsIgnoreMenuSelected == 1) {
            int k2 = friendsMenu.getEntryHighlighted(friendsMenuHandle);
            if(k2 >= 0 && super.mouseX < 489 && super.mouseX > 429) {
                if(super.mouseX > 429)
                    gameGraphics.drawText("Click to remove " + DataOperations.hashToName(super.ignoresList[k2]), l + c1 / 2, i1 + 35, 1, 0xffffff);
            } else {
                gameGraphics.drawText("Blocking messages from:", l + c1 / 2, i1 + 35, 1, 0xffffff);
            }
            int k3;
            if(super.mouseX > l && super.mouseX < l + c1 && super.mouseY > (i1 + c2) - 16 && super.mouseY < i1 + c2)
                k3 = 0xffff00;
            else
                k3 = 0xffffff;
            gameGraphics.drawText("Click here to add a name", l + c1 / 2, (i1 + c2) - 3, 1, k3);
        }
        if(!canClick)
            return;
        l = super.mouseX - (((GameImage) (gameGraphics)).gameWidth - 199);
        i1 = super.mouseY - 36;
        if(l >= 0 && i1 >= 0 && l < 196 && i1 < 182) {
            friendsMenu.mouseClick(l + (((GameImage) (gameGraphics)).gameWidth - 199), i1 + 36, super.lastMouseButton, super.mouseButton);
            if(i1 <= 24 && mouseButtonClick == 1)
                if(l < 98 && friendsIgnoreMenuSelected == 1) {
                    friendsIgnoreMenuSelected = 0;
                    friendsMenu.switchList(friendsMenuHandle);
                } else
                if(l > 98 && friendsIgnoreMenuSelected == 0) {
                    friendsIgnoreMenuSelected = 1;
                    friendsMenu.switchList(friendsMenuHandle);
                }
            if(mouseButtonClick == 1 && friendsIgnoreMenuSelected == 0) {
                int l2 = friendsMenu.getEntryHighlighted(friendsMenuHandle);
                if(l2 >= 0 && super.mouseX < 489)
                    if(super.mouseX > 429)
                        removeFriend(super.friendsList[l2]);
                    else
                    if(super.friendsWorld[l2] != 0) {
                        showFriendsBox = 2;
                        pmTarget = super.friendsList[l2];
                        super.pmText = "";
                        super.enteredPMText = "";
                    }
            }
            if(mouseButtonClick == 1 && friendsIgnoreMenuSelected == 1) {
                int i3 = friendsMenu.getEntryHighlighted(friendsMenuHandle);
                if(i3 >= 0 && super.mouseX < 489 && super.mouseX > 429)
                    removeIgnore(super.ignoresList[i3]);
            }
            if(i1 > 166 && mouseButtonClick == 1 && friendsIgnoreMenuSelected == 0) {
                showFriendsBox = 1;
                super.inputText = "";
                super.enteredInputText = "";
            }
            if(i1 > 166 && mouseButtonClick == 1 && friendsIgnoreMenuSelected == 1) {
                showFriendsBox = 3;
                super.inputText = "";
                super.enteredInputText = "";
            }
            mouseButtonClick = 0;
        }
    }

    private final void drawPrayerMagicMenu(boolean canClick) {
        int l = ((GameImage) (gameGraphics)).gameWidth - 199;
        int i1 = 36;
        gameGraphics.drawPicture(l - 49, 3, baseInventoryPic + 4);
        char c1 = '\304';
        char c2 = '\266';
        int k1;
        int j1 = k1 = GameImage.rgbToInt(160, 160, 160);
        if(menuMagicPrayersSelected == 0)
            j1 = GameImage.rgbToInt(220, 220, 220);
        else
            k1 = GameImage.rgbToInt(220, 220, 220);
        gameGraphics.drawBoxAlpha(l, i1, c1 / 2, 24, j1, 128);
        gameGraphics.drawBoxAlpha(l + c1 / 2, i1, c1 / 2, 24, k1, 128);
        gameGraphics.drawBoxAlpha(l, i1 + 24, c1, 90, GameImage.rgbToInt(220, 220, 220), 128);
        gameGraphics.drawBoxAlpha(l, i1 + 24 + 90, c1, c2 - 90 - 24, GameImage.rgbToInt(160, 160, 160), 128);
        gameGraphics.drawLineX(l, i1 + 24, c1, 0);
        gameGraphics.drawLineY(l + c1 / 2, i1, 24, 0);
        gameGraphics.drawLineX(l, i1 + 113, c1, 0);
        gameGraphics.drawText("Magic", l + c1 / 4, i1 + 16, 4, 0);
        gameGraphics.drawText("Prayers", l + c1 / 4 + c1 / 2, i1 + 16, 4, 0);
        if(menuMagicPrayersSelected == 0) {
            spellsLastShownEntries = spellMenu.listShownEntries;
            spellMenu.clearList(spellMenuHandle);
            int l1 = 0;
            for(int l2 = 0; l2 < Data.spellCount; l2++) {
                String s1 = "@yel@";
                for(int k4 = 0; k4 < Data.spellDifferentRuneCount[l2]; k4++) {
                    int j5 = Data.spelRequiredRuneID[l2][k4];
                    if(hasRequiredRunes(j5, Data.spellRequiredRuneCount[l2][k4]))
                        continue;
                    s1 = "@whi@";
                    break;
                }

                int k5 = playerStatCurrent[6];
                if(Data.spellRequiredLevel[l2] > k5)
                    s1 = "@bla@";
                spellMenu.addListItem(spellMenuHandle, l1++, s1 + "Level " + Data.spellRequiredLevel[l2] + ": " + Data.spellName[l2]);
            }

            spellMenu.listShownEntries = spellsLastShownEntries;
            spellMenu.drawMenu();
            int l3 = spellMenu.getEntryHighlighted(spellMenuHandle);
            if(l3 != -1) {
                gameGraphics.drawString("Level " + Data.spellRequiredLevel[l3] + ": " + Data.spellName[l3], l + 2, i1 + 124, 1, 0xffff00);
                gameGraphics.drawString(Data.spellDescription[l3], l + 2, i1 + 136, 0, 0xffffff);
                for(int l4 = 0; l4 < Data.spellDifferentRuneCount[l3]; l4++) {
                    int l5 = Data.spelRequiredRuneID[l3][l4];
                    gameGraphics.drawPicture(l + 2 + l4 * 44, i1 + 150, baseItemPicture + Data.itemInventoryPicture[l5]);
                    int i6 = getInventoryItemTotalCount(l5);
                    int j6 = Data.spellRequiredRuneCount[l3][l4];
                    String s3 = "@red@";
                    if(hasRequiredRunes(l5, j6))
                        s3 = "@gre@";
                    gameGraphics.drawString(s3 + i6 + "/" + j6, l + 2 + l4 * 44, i1 + 150, 1, 0xffffff);
                }

            } else {
                gameGraphics.drawString("Point at a spell for a description", l + 2, i1 + 124, 1, 0);
            }
        }
        if(menuMagicPrayersSelected == 1) {
            prayersLastShownEntries = spellMenu.listShownEntries;
            spellMenu.clearList(spellMenuHandle);
            int i2 = 0;
            for(int i3 = 0; i3 < Data.prayerCount; i3++) {
                String s2 = "@whi@";
                if(Data.prayerRequiredLevel[i3] > playerStatBase[5])
                    s2 = "@bla@";
                if(prayerOn[i3])
                    s2 = "@gre@";
                spellMenu.addListItem(spellMenuHandle, i2++, s2 + "Level " + Data.prayerRequiredLevel[i3] + ": " + Data.prayerName[i3]);
            }

            spellMenu.listShownEntries = prayersLastShownEntries;
            spellMenu.drawMenu();
            int i4 = spellMenu.getEntryHighlighted(spellMenuHandle);
            if(i4 != -1) {
                gameGraphics.drawText("Level " + Data.prayerRequiredLevel[i4] + ": " + Data.prayerName[i4], l + c1 / 2, i1 + 130, 1, 0xffff00);
                gameGraphics.drawText(Data.prayerDescription[i4], l + c1 / 2, i1 + 145, 0, 0xffffff);
                gameGraphics.drawText("Drain rate: " + Data.prayerDrainRate[i4], l + c1 / 2, i1 + 160, 1, 0);
            } else {
                gameGraphics.drawString("Point at a prayer for a description", l + 2, i1 + 124, 1, 0);
            }
        }
        if(!canClick)
            return;
        l = super.mouseX - (((GameImage) (gameGraphics)).gameWidth - 199);
        i1 = super.mouseY - 36;
        if(l >= 0 && i1 >= 0 && l < 196 && i1 < 182) {
            spellMenu.mouseClick(l + (((GameImage) (gameGraphics)).gameWidth - 199), i1 + 36, super.lastMouseButton, super.mouseButton);
            if(i1 <= 24 && mouseButtonClick == 1)
                if(l < 98 && menuMagicPrayersSelected == 1) {
                    menuMagicPrayersSelected = 0;
                    spellMenu.switchList(spellMenuHandle);
                } else
                if(l > 98 && menuMagicPrayersSelected == 0) {
                    menuMagicPrayersSelected = 1;
                    spellMenu.switchList(spellMenuHandle);
                }
            if(mouseButtonClick == 1 && menuMagicPrayersSelected == 0) {
                int j2 = spellMenu.getEntryHighlighted(spellMenuHandle);
                if(j2 != -1) {
                    int j3 = playerStatCurrent[6];
                    if(Data.spellRequiredLevel[j2] > j3) {
                        displayMessage("Your magic ability is not high enough for this spell", 3);
                    } else {
                        int j4;
                        for(j4 = 0; j4 < Data.spellDifferentRuneCount[j2]; j4++) {
                            int i5 = Data.spelRequiredRuneID[j2][j4];
                            if(hasRequiredRunes(i5, Data.spellRequiredRuneCount[j2][j4]))
                                continue;
                            displayMessage("You don't have all the reagents you need for this spell", 3);
                            j4 = -1;
                            break;
                        }

                        if(j4 == Data.spellDifferentRuneCount[j2]) {
                            selectedSpell = j2;
                            selectedItem = -1;
                        }
                    }
                }
            }
            if(mouseButtonClick == 1 && menuMagicPrayersSelected == 1) {
                int k2 = spellMenu.getEntryHighlighted(spellMenuHandle);
                if(k2 != -1) {
                    int k3 = playerStatBase[5];
                    if(Data.prayerRequiredLevel[k2] > k3)
                        displayMessage("Your prayer ability is not high enough for this prayer", 3);
                    else
                    if(playerStatCurrent[5] == 0)
                        displayMessage("You have run out of prayer points. Return to a church to recharge", 3);
                    else
                    if(prayerOn[k2]) {
                        super.streamClass.createPacket(248);
                        super.streamClass.addByte(k2);
                        super.streamClass.formatPacket();
                        prayerOn[k2] = false;
                        playSound("prayeroff");
                    } else {
                        super.streamClass.createPacket(56);
                        super.streamClass.addByte(k2);
                        super.streamClass.formatPacket();
                        prayerOn[k2] = true;
                        playSound("prayeron");
                    }
                }
            }
            mouseButtonClick = 0;
        }
    }

    protected final byte[] unpackData(String arg0, String arg1, int arg2) {
        byte abyte0[] = link.getFile(arg0);
        if(abyte0 != null) {
            int l = ((abyte0[0] & 0xff) << 16) + ((abyte0[1] & 0xff) << 8) + (abyte0[2] & 0xff);
            int i1 = ((abyte0[3] & 0xff) << 16) + ((abyte0[4] & 0xff) << 8) + (abyte0[5] & 0xff);
            byte abyte1[] = new byte[abyte0.length - 6];
            for(int j1 = 0; j1 < abyte0.length - 6; j1++)
                abyte1[j1] = abyte0[j1 + 6];

            drawLoadingBarText(arg2, "Unpacking " + arg1);
            if(i1 != l) {
                byte abyte2[] = new byte[l];
                DataFileDecrypter.unpackData(abyte2, l, abyte1, i1, 0);
                return abyte2;
            } else {
                return abyte1;
            }
        } else {
            return super.unpackData(arg0, arg1, arg2);
        }
    }

    private final void drawChatMessageTabs() {
        gameGraphics.drawPicture(0, windowHeight - 4, baseInventoryPic + 23);
        int l = GameImage.rgbToInt(200, 200, 255);
        if(messagesTab == 0)
            l = GameImage.rgbToInt(255, 200, 50);
        if(chatTabAllMsgFlash % 30 > 15)
            l = GameImage.rgbToInt(255, 50, 50);
        gameGraphics.drawText("All messages", 54, windowHeight + 6, 0, l);
        l = GameImage.rgbToInt(200, 200, 255);
        if(messagesTab == 1)
            l = GameImage.rgbToInt(255, 200, 50);
        if(chatTabHistoryFlash % 30 > 15)
            l = GameImage.rgbToInt(255, 50, 50);
        gameGraphics.drawText("Chat history", 155, windowHeight + 6, 0, l);
        l = GameImage.rgbToInt(200, 200, 255);
        if(messagesTab == 2)
            l = GameImage.rgbToInt(255, 200, 50);
        if(chatTabQuestFlash % 30 > 15)
            l = GameImage.rgbToInt(255, 50, 50);
        gameGraphics.drawText("Quest history", 255, windowHeight + 6, 0, l);
        l = GameImage.rgbToInt(200, 200, 255);
        if(messagesTab == 3)
            l = GameImage.rgbToInt(255, 200, 50);
        if(chatTabPrivateFlash % 30 > 15)
            l = GameImage.rgbToInt(255, 50, 50);
        gameGraphics.drawText("Private history", 355, windowHeight + 6, 0, l);
        gameGraphics.drawText("Report abuse", 457, windowHeight + 6, 0, 0xffffff);
    }

    public final URL getDocumentBase() {
        if(link.gameApplet != null)
            return link.gameApplet.getDocumentBase();
        else
            return super.getDocumentBase();
    }

    private final void checkGameInputs() {
        if(systemUpdate > 1)
            systemUpdate--;
        sendPingPacket();
        if(logoutTimer > 0)
            logoutTimer--;
        if(ourPlayer.currentSprite == 8 || ourPlayer.currentSprite == 9)
            combatTimeout = 500;
        if(combatTimeout > 0)
            combatTimeout--;
        if(showAppearanceWindow) {
            updateAppearanceWindow();
            return;
        }
        for(int l = 0; l < playerCount; l++) {
            Mob player = playerArray[l];
            int j1 = (player.waypointCurrent + 1) % 10;
            if(player.waypointsEndSprite != j1) {
                int l1 = -1;
                int k3 = player.waypointsEndSprite;
                int i5;
                if(k3 < j1)
                    i5 = j1 - k3;
                else
                    i5 = (10 + j1) - k3;
                int i6 = 4;
                if(i5 > 2)
                    i6 = (i5 - 1) * 4;
                if(player.waypointsX[k3] - player.currentX > magicLoc * 3 || player.waypointsY[k3] - player.currentY > magicLoc * 3 || player.waypointsX[k3] - player.currentX < -magicLoc * 3 || player.waypointsY[k3] - player.currentY < -magicLoc * 3 || i5 > 8) {
                    player.currentX = player.waypointsX[k3];
                    player.currentY = player.waypointsY[k3];
                } else {
                    if(player.currentX < player.waypointsX[k3]) {
                        player.currentX += i6;
                        player.stepCount++;
                        l1 = 2;
                    } else
                    if(player.currentX > player.waypointsX[k3]) {
                        player.currentX -= i6;
                        player.stepCount++;
                        l1 = 6;
                    }
                    if(player.currentX - player.waypointsX[k3] < i6 && player.currentX - player.waypointsX[k3] > -i6)
                        player.currentX = player.waypointsX[k3];
                    if(player.currentY < player.waypointsY[k3]) {
                        player.currentY += i6;
                        player.stepCount++;
                        if(l1 == -1)
                            l1 = 4;
                        else
                        if(l1 == 2)
                            l1 = 3;
                        else
                            l1 = 5;
                    } else
                    if(player.currentY > player.waypointsY[k3]) {
                        player.currentY -= i6;
                        player.stepCount++;
                        if(l1 == -1)
                            l1 = 0;
                        else
                        if(l1 == 2)
                            l1 = 1;
                        else
                            l1 = 7;
                    }
                    if(player.currentY - player.waypointsY[k3] < i6 && player.currentY - player.waypointsY[k3] > -i6)
                        player.currentY = player.waypointsY[k3];
                }
                if(l1 != -1)
                    player.currentSprite = l1;
                if(player.currentX == player.waypointsX[k3] && player.currentY == player.waypointsY[k3])
                    player.waypointsEndSprite = (k3 + 1) % 10;
            } else {
                player.currentSprite = player.nextSprite;
            }
            if(player.lastMessageTimeout > 0)
                player.lastMessageTimeout--;
            if(player.playerSkullTimeout > 0)
                player.playerSkullTimeout--;
            if(player.combatTimer > 0)
                player.combatTimer--;
            if(playerAliveTimeout > 0) {
                playerAliveTimeout--;
                if(playerAliveTimeout == 0)
                    displayMessage("You have been granted another life. Be more careful this time!", 3);
                if(playerAliveTimeout == 0)
                    displayMessage("You retain your skills. Your objects land where you died", 3);
            }
        }

        for(int i1 = 0; i1 < npcCount; i1++) {
            Mob f2 = npcArray[i1];
            int i2 = (f2.waypointCurrent + 1) % 10;
            if(f2.waypointsEndSprite != i2) {
                int l3 = -1;
                int j5 = f2.waypointsEndSprite;
                int j6;
                if(j5 < i2)
                    j6 = i2 - j5;
                else
                    j6 = (10 + i2) - j5;
                int k6 = 4;
                if(j6 > 2)
                    k6 = (j6 - 1) * 4;
                if(f2.waypointsX[j5] - f2.currentX > magicLoc * 3 || f2.waypointsY[j5] - f2.currentY > magicLoc * 3 || f2.waypointsX[j5] - f2.currentX < -magicLoc * 3 || f2.waypointsY[j5] - f2.currentY < -magicLoc * 3 || j6 > 8) {
                    f2.currentX = f2.waypointsX[j5];
                    f2.currentY = f2.waypointsY[j5];
                } else {
                    if(f2.currentX < f2.waypointsX[j5]) {
                        f2.currentX += k6;
                        f2.stepCount++;
                        l3 = 2;
                    } else
                    if(f2.currentX > f2.waypointsX[j5]) {
                        f2.currentX -= k6;
                        f2.stepCount++;
                        l3 = 6;
                    }
                    if(f2.currentX - f2.waypointsX[j5] < k6 && f2.currentX - f2.waypointsX[j5] > -k6)
                        f2.currentX = f2.waypointsX[j5];
                    if(f2.currentY < f2.waypointsY[j5]) {
                        f2.currentY += k6;
                        f2.stepCount++;
                        if(l3 == -1)
                            l3 = 4;
                        else
                        if(l3 == 2)
                            l3 = 3;
                        else
                            l3 = 5;
                    } else
                    if(f2.currentY > f2.waypointsY[j5]) {
                        f2.currentY -= k6;
                        f2.stepCount++;
                        if(l3 == -1)
                            l3 = 0;
                        else
                        if(l3 == 2)
                            l3 = 1;
                        else
                            l3 = 7;
                    }
                    if(f2.currentY - f2.waypointsY[j5] < k6 && f2.currentY - f2.waypointsY[j5] > -k6)
                        f2.currentY = f2.waypointsY[j5];
                }
                if(l3 != -1)
                    f2.currentSprite = l3;
                if(f2.currentX == f2.waypointsX[j5] && f2.currentY == f2.waypointsY[j5])
                    f2.waypointsEndSprite = (j5 + 1) % 10;
            } else {
                f2.currentSprite = f2.nextSprite;
                if(f2.npcId == 43)
                    f2.stepCount++;
            }
            if(f2.lastMessageTimeout > 0)
                f2.lastMessageTimeout--;
            if(f2.playerSkullTimeout > 0)
                f2.playerSkullTimeout--;
            if(f2.combatTimer > 0)
                f2.combatTimer--;
        }

        if(drawMenuTab != 2) {
            if(GameImage.bnn > 0)
                sleepWordDelayTimer++;
            if(GameImage.caa > 0)
                sleepWordDelayTimer = 0;
            GameImage.bnn = 0;
            GameImage.caa = 0;
        }
        for(int k1 = 0; k1 < playerCount; k1++) {
            Mob f3 = playerArray[k1];
            if(f3.projectileDistance > 0)
                f3.projectileDistance--;
        }

        if(cameraAutoAngleDebug) {
            if(cameraAutoRotatePlayerX - ourPlayer.currentX < -500 || cameraAutoRotatePlayerX - ourPlayer.currentX > 500 || cameraAutoRotatePlayerY - ourPlayer.currentY < -500 || cameraAutoRotatePlayerY - ourPlayer.currentY > 500) {
                cameraAutoRotatePlayerX = ourPlayer.currentX;
                cameraAutoRotatePlayerY = ourPlayer.currentY;
            }
        } else {
            if(cameraAutoRotatePlayerX - ourPlayer.currentX < -500 || cameraAutoRotatePlayerX - ourPlayer.currentX > 500 || cameraAutoRotatePlayerY - ourPlayer.currentY < -500 || cameraAutoRotatePlayerY - ourPlayer.currentY > 500) {
                cameraAutoRotatePlayerX = ourPlayer.currentX;
                cameraAutoRotatePlayerY = ourPlayer.currentY;
            }
            if(cameraAutoRotatePlayerX != ourPlayer.currentX)
                cameraAutoRotatePlayerX += (ourPlayer.currentX - cameraAutoRotatePlayerX) / (16 + (cameraDistance - 500) / 15);
            if(cameraAutoRotatePlayerY != ourPlayer.currentY)
                cameraAutoRotatePlayerY += (ourPlayer.currentY - cameraAutoRotatePlayerY) / (16 + (cameraDistance - 500) / 15);
            if(configCameraAutoAngle) {
                int j2 = cameraAutoAngle * 32;
                int i4 = j2 - cameraRotation;
                byte byte0 = 1;
                if(i4 != 0) {
                    cameraAutoRotationAmount++;
                    if(i4 > 128) {
                        byte0 = -1;
                        i4 = 256 - i4;
                    } else
                    if(i4 > 0)
                        byte0 = 1;
                    else
                    if(i4 < -128) {
                        byte0 = 1;
                        i4 = 256 + i4;
                    } else
                    if(i4 < 0) {
                        byte0 = -1;
                        i4 = -i4;
                    }
                    cameraRotation += ((cameraAutoRotationAmount * i4 + 255) / 256) * byte0;
                    cameraRotation &= 0xff;
                } else {
                    cameraAutoRotationAmount = 0;
                }
            }
        }
        if(sleepWordDelayTimer > 20) {
            sleepWordDelay = false;
            sleepWordDelayTimer = 0;
        }
        if(isSleeping) {
            if(super.enteredInputText.length() > 0)
                if(super.enteredInputText.equalsIgnoreCase("::lostcon"))
                    super.streamClass.closeStream();
                else
                if(super.enteredInputText.equalsIgnoreCase("::closecon")) {
                    requestLogout();
                } else {
                    super.streamClass.createPacket(200);
                    super.streamClass.addString(super.enteredInputText);
                    if(!sleepWordDelay) {
                        super.streamClass.addByte(0);
                        sleepWordDelay = true;
                    }
                    super.streamClass.formatPacket();
                    super.inputText = "";
                    super.enteredInputText = "";
                    sleepingStatusText = "Please wait...";
                }
            if(super.lastMouseButton == 1 && super.mouseY > 275 && super.mouseY < 310 && super.mouseX > 56 && super.mouseX < 456) {
                super.streamClass.createPacket(200);
                super.streamClass.addString("-null-");
                if(!sleepWordDelay) {
                    super.streamClass.addByte(0);
                    sleepWordDelay = true;
                }
                super.streamClass.formatPacket();
                super.inputText = "";
                super.enteredInputText = "";
                sleepingStatusText = "Please wait...";
            }
            super.lastMouseButton = 0;
            return;
        }
        if(super.mouseY > windowHeight - 4) {
            if(super.mouseX > 15 && super.mouseX < 96 && super.lastMouseButton == 1)
                messagesTab = 0;
            if(super.mouseX > 110 && super.mouseX < 194 && super.lastMouseButton == 1) {
                messagesTab = 1;
                chatInputMenu.listShownEntries[messagesHandleType2] = 0xf423f;
            }
            if(super.mouseX > 215 && super.mouseX < 295 && super.lastMouseButton == 1) {
                messagesTab = 2;
                chatInputMenu.listShownEntries[messagesHandleType5] = 0xf423f;
            }
            if(super.mouseX > 315 && super.mouseX < 395 && super.lastMouseButton == 1) {
                messagesTab = 3;
                chatInputMenu.listShownEntries[messagesHandleType6] = 0xf423f;
            }
            if(super.mouseX > 417 && super.mouseX < 497 && super.lastMouseButton == 1) {
                showAbuseBox = 1;
                reportAbuseOptionSelected = 0;
                super.inputText = "";
                super.enteredInputText = "";
            }
            super.lastMouseButton = 0;
            super.mouseButton = 0;
        }
        chatInputMenu.mouseClick(super.mouseX, super.mouseY, super.lastMouseButton, super.mouseButton);
        if(messagesTab > 0 && super.mouseX >= 494 && super.mouseY >= windowHeight - 66)
            super.lastMouseButton = 0;
        if(chatInputMenu.isClicked(chatInputBox)) {
            String input = chatInputMenu.getText(chatInputBox);
            chatInputMenu.updateText(chatInputBox, "");
            if(input.startsWith("::")) {
                if(!handleCommand(input.substring(2)))
                    sendCommand(input.substring(2));
            } else {
                int len = ChatMessage.stringToBytes(input);
                sendChatMessage(ChatMessage.lastChat, len);
                input = ChatMessage.bytesToString(ChatMessage.lastChat, 0, len);
                if(useChatFilter)
                    input = ChatFilter.filterChat(input);
                ourPlayer.lastMessageTimeout = 150;
                ourPlayer.lastMessage = input;
                displayMessage(ourPlayer.username + ": " + input, 2);
            }
        }
        if(messagesTab == 0) {
            for(int k2 = 0; k2 < 5; k2++)
                if(messagesTimeout[k2] > 0)
                    messagesTimeout[k2]--;

        }
        if(playerAliveTimeout != 0)
            super.lastMouseButton = 0;
        if(showTradeBox || showDuelBox) {
            if(super.mouseButton != 0)
                mouseButtonHeldTime++;
            else
                mouseButtonHeldTime = 0;
            if(mouseButtonHeldTime > 500)
                mouseClickedHeldInTradeDuelBox += 100000;
            else
            if(mouseButtonHeldTime > 350)
                mouseClickedHeldInTradeDuelBox += 10000;
            else
            if(mouseButtonHeldTime > 250)
                mouseClickedHeldInTradeDuelBox += 1000;
            else
            if(mouseButtonHeldTime > 150)
                mouseClickedHeldInTradeDuelBox += 100;
            else
            if(mouseButtonHeldTime > 100)
                mouseClickedHeldInTradeDuelBox += 10;
            else
            if(mouseButtonHeldTime > 50)
                mouseClickedHeldInTradeDuelBox++;
            else
            if(mouseButtonHeldTime > 20 && (mouseButtonHeldTime & 5) == 0)
                mouseClickedHeldInTradeDuelBox++;
        } else {
            mouseButtonHeldTime = 0;
            mouseClickedHeldInTradeDuelBox = 0;
        }
        if(super.lastMouseButton == 1)
            mouseButtonClick = 1;
        else
        if(super.lastMouseButton == 2)
            mouseButtonClick = 2;
        gameCamera.setMousePosition(super.mouseX, super.mouseY);
        super.lastMouseButton = 0;
        if(configCameraAutoAngle) {
            if(cameraAutoRotationAmount == 0 || cameraAutoAngleDebug) {
                if(super.keyLeftDown) {
                    cameraAutoAngle = cameraAutoAngle + 1 & 7;
                    super.keyLeftDown = false;
                    if(!cameraZoom) {
                        if((cameraAutoAngle & 1) == 0)
                            cameraAutoAngle = cameraAutoAngle + 1 & 7;
                        for(int l2 = 0; l2 < 8; l2++) {
                            if(validCameraAngle(cameraAutoAngle))
                                break;
                            cameraAutoAngle = cameraAutoAngle + 1 & 7;
                        }
                    }
                }
                if(super.keyRightDown) {
                    cameraAutoAngle = cameraAutoAngle + 7 & 7;
                    super.keyRightDown = false;
                    if(!cameraZoom) {
                        if((cameraAutoAngle & 1) == 0)
                            cameraAutoAngle = cameraAutoAngle + 7 & 7;
                        for(int i3 = 0; i3 < 8; i3++) {
                            if(validCameraAngle(cameraAutoAngle))
                                break;
                            cameraAutoAngle = cameraAutoAngle + 7 & 7;
                        }
                    }
                }
            }
        } else
        if(super.keyLeftDown)
            cameraRotation = cameraRotation + 2 & 0xff;
        else
        if(super.keyRightDown)
            cameraRotation = cameraRotation - 2 & 0xff;
        if(super.keyUpDown && cameraDistance > 550)
            cameraDistance -= 4;
        else if(super.keyDownDown && cameraDistance < 1250)
            cameraDistance += 4;
        if(fogOfWar) {
            if((cameraZoom && cameraDistance > 550) || cameraDistance > 750)
                cameraDistance -= 4;
            if(!cameraZoom && cameraDistance < 750)
                cameraDistance += 4;
        }
        if(actionPictureType > 0)
            actionPictureType--;
        else
        if(actionPictureType < 0)
            actionPictureType++;
        gameCamera.bji(17);
        modelUpdatingTimer++;
        if(modelUpdatingTimer > 5) {
            modelUpdatingTimer = 0;
            modelFireLightningSpellNumber = (modelFireLightningSpellNumber + 1) % 3;
            modelTorchNumber = (modelTorchNumber + 1) % 4;
            modelClawSpellNumber = (modelClawSpellNumber + 1) % 5;
        }
        for(int j3 = 0; j3 < objectCount; j3++) {
            int k4 = objectX[j3];
            int k5 = objectY[j3];
            if(k4 >= 0 && k5 >= 0 && k4 < 96 && k5 < 96 && objectType[j3] == 74)
                objectArray[j3].cmi(1, 0, 0);
        }

        for(int l4 = 0; l4 < teleBubbleCount; l4++) {
            teleBubbleTime[l4]++;
            if(teleBubbleTime[l4] > 50) {
                teleBubbleCount--;
                for(int l5 = l4; l5 < teleBubbleCount; l5++) {
                    teleBubbleX[l5] = teleBubbleX[l5 + 1];
                    teleBubbleY[l5] = teleBubbleY[l5 + 1];
                    teleBubbleTime[l5] = teleBubbleTime[l5 + 1];
                    teleBubbleType[l5] = teleBubbleType[l5 + 1];
                }

            }
        }

    }

    private final void createAppearanceWindow() {
        appearanceMenu = new Menu(gameGraphics, 100);
        appearanceMenu.drawText(256, 10, "Please design Your Character", 4, true);
        int l = 140;
        int i1 = 34;
        l += 116;
        i1 -= 10;
        appearanceMenu.drawText(l - 55, i1 + 110, "Front", 3, true);
        appearanceMenu.drawText(l, i1 + 110, "Side", 3, true);
        appearanceMenu.drawText(l + 55, i1 + 110, "Back", 3, true);
        byte byte0 = 54;
        i1 += 145;
        appearanceMenu.drawCurvedBox(l - byte0, i1, 53, 41);
        appearanceMenu.drawText(l - byte0, i1 - 8, "Head", 1, true);
        appearanceMenu.drawText(l - byte0, i1 + 8, "Type", 1, true);
        appearanceMenu.drawArrow(l - byte0 - 40, i1, Menu.baseScrollPic + 7);
        appearanceHeadLeftArrow = appearanceMenu.createButton(l - byte0 - 40, i1, 20, 20);
        appearanceMenu.drawArrow((l - byte0) + 40, i1, Menu.baseScrollPic + 6);
        appearanceHeadRightArrow = appearanceMenu.createButton((l - byte0) + 40, i1, 20, 20);
        appearanceMenu.drawCurvedBox(l + byte0, i1, 53, 41);
        appearanceMenu.drawText(l + byte0, i1 - 8, "Hair", 1, true);
        appearanceMenu.drawText(l + byte0, i1 + 8, "Color", 1, true);
        appearanceMenu.drawArrow((l + byte0) - 40, i1, Menu.baseScrollPic + 7);
        appearanceHairLeftArrow = appearanceMenu.createButton((l + byte0) - 40, i1, 20, 20);
        appearanceMenu.drawArrow(l + byte0 + 40, i1, Menu.baseScrollPic + 6);
        appearanceHairRightArrow = appearanceMenu.createButton(l + byte0 + 40, i1, 20, 20);
        i1 += 50;
        appearanceMenu.drawCurvedBox(l - byte0, i1, 53, 41);
        appearanceMenu.drawText(l - byte0, i1, "Gender", 1, true);
        appearanceMenu.drawArrow(l - byte0 - 40, i1, Menu.baseScrollPic + 7);
        appearanceGenderLeftArrow = appearanceMenu.createButton(l - byte0 - 40, i1, 20, 20);
        appearanceMenu.drawArrow((l - byte0) + 40, i1, Menu.baseScrollPic + 6);
        appearanceGenderRightArrow = appearanceMenu.createButton((l - byte0) + 40, i1, 20, 20);
        appearanceMenu.drawCurvedBox(l + byte0, i1, 53, 41);
        appearanceMenu.drawText(l + byte0, i1 - 8, "Top", 1, true);
        appearanceMenu.drawText(l + byte0, i1 + 8, "Color", 1, true);
        appearanceMenu.drawArrow((l + byte0) - 40, i1, Menu.baseScrollPic + 7);
        appearanceTopLeftArrow = appearanceMenu.createButton((l + byte0) - 40, i1, 20, 20);
        appearanceMenu.drawArrow(l + byte0 + 40, i1, Menu.baseScrollPic + 6);
        appearanceTopRightArrow = appearanceMenu.createButton(l + byte0 + 40, i1, 20, 20);
        i1 += 50;
        appearanceMenu.drawCurvedBox(l - byte0, i1, 53, 41);
        appearanceMenu.drawText(l - byte0, i1 - 8, "Skin", 1, true);
        appearanceMenu.drawText(l - byte0, i1 + 8, "Color", 1, true);
        appearanceMenu.drawArrow(l - byte0 - 40, i1, Menu.baseScrollPic + 7);
        appearanceSkinLeftArrow = appearanceMenu.createButton(l - byte0 - 40, i1, 20, 20);
        appearanceMenu.drawArrow((l - byte0) + 40, i1, Menu.baseScrollPic + 6);
        appearanceSkingRightArrow = appearanceMenu.createButton((l - byte0) + 40, i1, 20, 20);
        appearanceMenu.drawCurvedBox(l + byte0, i1, 53, 41);
        appearanceMenu.drawText(l + byte0, i1 - 8, "Bottom", 1, true);
        appearanceMenu.drawText(l + byte0, i1 + 8, "Color", 1, true);
        appearanceMenu.drawArrow((l + byte0) - 40, i1, Menu.baseScrollPic + 7);
        appearanceBottomLeftArrow = appearanceMenu.createButton((l + byte0) - 40, i1, 20, 20);
        appearanceMenu.drawArrow(l + byte0 + 40, i1, Menu.baseScrollPic + 6);
        appearanceBottomRightArrow = appearanceMenu.createButton(l + byte0 + 40, i1, 20, 20);
        i1 += 82;
        i1 -= 35;
        appearanceMenu.drawButton(l, i1, 200, 30);
        appearanceMenu.drawText(l, i1, "Accept", 4, false);
        appearanceAcceptButton = appearanceMenu.createButton(l, i1, 200, 30);
    }

    protected final void handleKeyDown(int key, char c) {
        if(loggedIn == 0) {
            if(loginScreen == 0 && loginMenuFirst != null)
                loginMenuFirst.keyPress(key, c);
            if(loginScreen == 1 && loginNewUser != null)
                loginNewUser.keyPress(key, c);
            if(loginScreen == 2 && loginMenuLogin != null)
                loginMenuLogin.keyPress(key, c);
        }
        if(loggedIn == 1) {
            if(key == KeyEvent.VK_F12)
                takeScreenshot(true);
            else if(showAppearanceWindow && appearanceMenu != null)
                appearanceMenu.keyPress(key, c);
            else if(showFriendsBox == 0 && showAbuseBox == 0 && !isSleeping && chatInputMenu != null)
                chatInputMenu.keyPress(key, c);
        }
    }

    private final void generateWorldRightClickMenu() {
        int l = 2203 - (sectionY + wildY + areaY);
        if(sectionX + wildX + areaX >= 2640)
            l = -50;
        int ground = -1;
        for(int j1 = 0; j1 < objectCount; j1++)
            objectAlreadyInMenu[j1] = false;

        for(int k1 = 0; k1 < wallObjectCount; k1++)
            wallObjectAlreadyInMenu[k1] = false;

        int optionCount = gameCamera.getOptionCount();
        GameObject objects[] = gameCamera.getHighlightedObjects();
        int players[] = gameCamera.getHighlightedPlayers();
        for(int i2 = 0; i2 < optionCount; i2++) {
            if(menuOptionsCount > 200)
                break;
            int player = players[i2];
            GameObject object = objects[i2];
            if(object.entityType[player] <= 65535 || object.entityType[player] >= 0x30d40 && object.entityType[player] <= 0x493e0)
                if(object == gameCamera.highlightedObject) {
                    int index = object.entityType[player] % 10000;
                    int type = object.entityType[player] / 10000;
                    if(type == 1) {
                        String s1 = "";
                        int k4 = 0;
                        if(ourPlayer.level > 0 && playerArray[index].level > 0)
                            k4 = ourPlayer.level - playerArray[index].level;
                        if(k4 < 0)
                            s1 = "@or1@";
                        if(k4 < -3)
                            s1 = "@or2@";
                        if(k4 < -6)
                            s1 = "@or3@";
                        if(k4 < -9)
                            s1 = "@red@";
                        if(k4 > 0)
                            s1 = "@gr1@";
                        if(k4 > 3)
                            s1 = "@gr2@";
                        if(k4 > 6)
                            s1 = "@gr3@";
                        if(k4 > 9)
                            s1 = "@gre@";
                        s1 = " " + s1 + "(level-" + playerArray[index].level + ")";
                        if(selectedSpell >= 0) {
                            if(Data.spellType[selectedSpell] == 1 || Data.spellType[selectedSpell] == 2) {
                                menuText1[menuOptionsCount] = "Cast " + Data.spellName[selectedSpell] + " on";
                                menuText2[menuOptionsCount] = "@whi@" + playerArray[index].username + s1;
                                menuActionID[menuOptionsCount] = 800;
                                menuActionX[menuOptionsCount] = playerArray[index].currentX;
                                menuActionY[menuOptionsCount] = playerArray[index].currentY;
                                menuActionType[menuOptionsCount] = playerArray[index].serverIndex;
                                menuActionVar1[menuOptionsCount] = selectedSpell;
                                menuOptionsCount++;
                            }
                        } else
                        if(selectedItem >= 0) {
                            menuText1[menuOptionsCount] = "Use " + selectedItemName + " with";
                            menuText2[menuOptionsCount] = "@whi@" + playerArray[index].username + s1;
                            menuActionID[menuOptionsCount] = 810;
                            menuActionX[menuOptionsCount] = playerArray[index].currentX;
                            menuActionY[menuOptionsCount] = playerArray[index].currentY;
                            menuActionType[menuOptionsCount] = playerArray[index].serverIndex;
                            menuActionVar1[menuOptionsCount] = selectedItem;
                            menuOptionsCount++;
                        } else {
                            if(l > 0 && (playerArray[index].currentY - 64) / magicLoc + wildY + areaY < 2203) {
                                menuText1[menuOptionsCount] = "Attack";
                                menuText2[menuOptionsCount] = "@whi@" + playerArray[index].username + s1;
                                if(k4 >= 0 && k4 < 5)
                                    menuActionID[menuOptionsCount] = 805;
                                else
                                    menuActionID[menuOptionsCount] = 2805;
                                menuActionX[menuOptionsCount] = playerArray[index].currentX;
                                menuActionY[menuOptionsCount] = playerArray[index].currentY;
                                menuActionType[menuOptionsCount] = playerArray[index].serverIndex;
                                menuOptionsCount++;
                            } else
                            if(Config.MEMBERS_FEATURES) {
                                menuText1[menuOptionsCount] = "Duel with";
                                menuText2[menuOptionsCount] = "@whi@" + playerArray[index].username + s1;
                                menuActionX[menuOptionsCount] = playerArray[index].currentX;
                                menuActionY[menuOptionsCount] = playerArray[index].currentY;
                                menuActionID[menuOptionsCount] = 2806;
                                menuActionType[menuOptionsCount] = playerArray[index].serverIndex;
                                menuOptionsCount++;
                            }
                            menuText1[menuOptionsCount] = "Trade with";
                            menuText2[menuOptionsCount] = "@whi@" + playerArray[index].username + s1;
                            menuActionID[menuOptionsCount] = 2810;
                            menuActionType[menuOptionsCount] = playerArray[index].serverIndex;
                            menuOptionsCount++;
                            menuText1[menuOptionsCount] = "Follow";
                            menuText2[menuOptionsCount] = "@whi@" + playerArray[index].username + s1;
                            menuActionID[menuOptionsCount] = 2820;
                            menuActionType[menuOptionsCount] = playerArray[index].serverIndex;
                            menuOptionsCount++;
                        }
                    } else
                    if(type == 2) {
                        if(selectedSpell >= 0) {
                            if(Data.spellType[selectedSpell] == 3) {
                                menuText1[menuOptionsCount] = "Cast " + Data.spellName[selectedSpell] + " on";
                                menuText2[menuOptionsCount] = "@lre@" + Data.itemName[groundItemID[index]];
                                menuActionID[menuOptionsCount] = 200;
                                menuActionX[menuOptionsCount] = groundItemX[index];
                                menuActionY[menuOptionsCount] = groundItemY[index];
                                menuActionType[menuOptionsCount] = groundItemID[index];
                                menuActionVar1[menuOptionsCount] = selectedSpell;
                                menuOptionsCount++;
                            }
                        } else
                        if(selectedItem >= 0) {
                            menuText1[menuOptionsCount] = "Use " + selectedItemName + " with";
                            menuText2[menuOptionsCount] = "@lre@" + Data.itemName[groundItemID[index]];
                            menuActionID[menuOptionsCount] = 210;
                            menuActionX[menuOptionsCount] = groundItemX[index];
                            menuActionY[menuOptionsCount] = groundItemY[index];
                            menuActionType[menuOptionsCount] = groundItemID[index];
                            menuActionVar1[menuOptionsCount] = selectedItem;
                            menuOptionsCount++;
                        } else {
                            menuText1[menuOptionsCount] = "Take";
                            menuText2[menuOptionsCount] = "@lre@" + Data.itemName[groundItemID[index]];
                            menuActionID[menuOptionsCount] = 220;
                            menuActionX[menuOptionsCount] = groundItemX[index];
                            menuActionY[menuOptionsCount] = groundItemY[index];
                            menuActionType[menuOptionsCount] = groundItemID[index];
                            menuOptionsCount++;
                            menuText1[menuOptionsCount] = "Examine";
                            menuText2[menuOptionsCount] = "@lre@" + Data.itemName[groundItemID[index]];
                            menuActionID[menuOptionsCount] = 3200;
                            menuActionType[menuOptionsCount] = groundItemID[index];
                            menuOptionsCount++;
                        }
                    } else
                    if(type == 3) {
                        String s2 = "";
                        int l4 = -1;
                        int id = npcArray[index].npcId;
                        if(Data.npcAttackable[id] > 0) {
                            int j5 = (Data.npcAttack[id] + Data.npcDefense[id] + Data.npcStrength[id] + Data.npcHits[id]) / 4;
                            int k5 = (playerStatBase[0] + playerStatBase[1] + playerStatBase[2] + playerStatBase[3] + 27) / 4;
                            l4 = k5 - j5;
                            s2 = "@yel@";
                            if(l4 < 0)
                                s2 = "@or1@";
                            if(l4 < -3)
                                s2 = "@or2@";
                            if(l4 < -6)
                                s2 = "@or3@";
                            if(l4 < -9)
                                s2 = "@red@";
                            if(l4 > 0)
                                s2 = "@gr1@";
                            if(l4 > 3)
                                s2 = "@gr2@";
                            if(l4 > 6)
                                s2 = "@gr3@";
                            if(l4 > 9)
                                s2 = "@gre@";
                            s2 = " " + s2 + "(level-" + j5 + ")";
                        }
                        if(selectedSpell >= 0) {
                            if(Data.spellType[selectedSpell] == 2) {
                                menuText1[menuOptionsCount] = "Cast " + Data.spellName[selectedSpell] + " on";
                                menuText2[menuOptionsCount] = "@yel@" + Data.npcName[npcArray[index].npcId];
                                menuActionID[menuOptionsCount] = 700;
                                menuActionX[menuOptionsCount] = npcArray[index].currentX;
                                menuActionY[menuOptionsCount] = npcArray[index].currentY;
                                menuActionType[menuOptionsCount] = npcArray[index].serverIndex;
                                menuActionVar1[menuOptionsCount] = selectedSpell;
                                menuOptionsCount++;
                            }
                        } else
                        if(selectedItem >= 0) {
                            menuText1[menuOptionsCount] = "Use " + selectedItemName + " with";
                            menuText2[menuOptionsCount] = "@yel@" + Data.npcName[npcArray[index].npcId];
                            menuActionID[menuOptionsCount] = 710;
                            menuActionX[menuOptionsCount] = npcArray[index].currentX;
                            menuActionY[menuOptionsCount] = npcArray[index].currentY;
                            menuActionType[menuOptionsCount] = npcArray[index].serverIndex;
                            menuActionVar1[menuOptionsCount] = selectedItem;
                            menuOptionsCount++;
                        } else {
                            if(Data.npcAttackable[id] > 0) {
                                menuText1[menuOptionsCount] = "Attack";
                                menuText2[menuOptionsCount] = "@yel@" + Data.npcName[npcArray[index].npcId] + s2;
                                if(l4 >= 0)
                                    menuActionID[menuOptionsCount] = 715;
                                else
                                    menuActionID[menuOptionsCount] = 2715;
                                menuActionX[menuOptionsCount] = npcArray[index].currentX;
                                menuActionY[menuOptionsCount] = npcArray[index].currentY;
                                menuActionType[menuOptionsCount] = npcArray[index].serverIndex;
                                menuOptionsCount++;
                            }
                            menuText1[menuOptionsCount] = "Talk-to";
                            menuText2[menuOptionsCount] = "@yel@" + Data.npcName[npcArray[index].npcId];
                            menuActionID[menuOptionsCount] = 720;
                            menuActionX[menuOptionsCount] = npcArray[index].currentX;
                            menuActionY[menuOptionsCount] = npcArray[index].currentY;
                            menuActionType[menuOptionsCount] = npcArray[index].serverIndex;
                            menuOptionsCount++;
                            if(!Data.npcCommand[id].equals("")) {
                                menuText1[menuOptionsCount] = Data.npcCommand[id];
                                menuText2[menuOptionsCount] = "@yel@" + Data.npcName[npcArray[index].npcId];
                                menuActionID[menuOptionsCount] = 725;
                                menuActionX[menuOptionsCount] = npcArray[index].currentX;
                                menuActionY[menuOptionsCount] = npcArray[index].currentY;
                                menuActionType[menuOptionsCount] = npcArray[index].serverIndex;
                                menuOptionsCount++;
                            }
                            menuText1[menuOptionsCount] = "Examine";
                            menuText2[menuOptionsCount] = "@yel@" + Data.npcName[npcArray[index].npcId];
                            menuActionID[menuOptionsCount] = 3700;
                            menuActionType[menuOptionsCount] = npcArray[index].npcId;
                            menuOptionsCount++;
                        }
                    }
                } else
                if(object != null && object.index >= 10000) {
                    int j3 = object.index - 10000;
                    int i4 = wallObjectID[j3];
                    if(!wallObjectAlreadyInMenu[j3]) {
                        if(selectedSpell >= 0) {
                            if(Data.spellType[selectedSpell] == 4) {
                                menuText1[menuOptionsCount] = "Cast " + Data.spellName[selectedSpell] + " on";
                                menuText2[menuOptionsCount] = "@cya@" + Data.wallObjectName[i4];
                                menuActionID[menuOptionsCount] = 300;
                                menuActionX[menuOptionsCount] = wallObjectX[j3];
                                menuActionY[menuOptionsCount] = wallObjectY[j3];
                                menuActionType[menuOptionsCount] = wallObjectDirection[j3];
                                menuActionVar1[menuOptionsCount] = selectedSpell;
                                menuOptionsCount++;
                            }
                        } else
                        if(selectedItem >= 0) {
                            menuText1[menuOptionsCount] = "Use " + selectedItemName + " with";
                            menuText2[menuOptionsCount] = "@cya@" + Data.wallObjectName[i4];
                            menuActionID[menuOptionsCount] = 310;
                            menuActionX[menuOptionsCount] = wallObjectX[j3];
                            menuActionY[menuOptionsCount] = wallObjectY[j3];
                            menuActionType[menuOptionsCount] = wallObjectDirection[j3];
                            menuActionVar1[menuOptionsCount] = selectedItem;
                            menuOptionsCount++;
                        } else {
                            if(!Data.wallObjectCommand1[i4].equalsIgnoreCase("WalkTo")) {
                                menuText1[menuOptionsCount] = Data.wallObjectCommand1[i4];
                                menuText2[menuOptionsCount] = "@cya@" + Data.wallObjectName[i4];
                                menuActionID[menuOptionsCount] = 320;
                                menuActionX[menuOptionsCount] = wallObjectX[j3];
                                menuActionY[menuOptionsCount] = wallObjectY[j3];
                                menuActionType[menuOptionsCount] = wallObjectDirection[j3];
                                menuOptionsCount++;
                            }
                            if(!Data.wallObjectCommand2[i4].equalsIgnoreCase("Examine")) {
                                menuText1[menuOptionsCount] = Data.wallObjectCommand2[i4];
                                menuText2[menuOptionsCount] = "@cya@" + Data.wallObjectName[i4];
                                menuActionID[menuOptionsCount] = 2300;
                                menuActionX[menuOptionsCount] = wallObjectX[j3];
                                menuActionY[menuOptionsCount] = wallObjectY[j3];
                                menuActionType[menuOptionsCount] = wallObjectDirection[j3];
                                menuOptionsCount++;
                            }
                            menuText1[menuOptionsCount] = "Examine";
                            menuText2[menuOptionsCount] = "@cya@" + Data.wallObjectName[i4];
                            menuActionID[menuOptionsCount] = 3300;
                            menuActionType[menuOptionsCount] = i4;
                            menuOptionsCount++;
                        }
                        wallObjectAlreadyInMenu[j3] = true;
                    }
                } else
                if(object != null && object.index >= 0) {
                    int k3 = object.index;
                    int j4 = objectType[k3];
                    if(!objectAlreadyInMenu[k3]) {
                        if(selectedSpell >= 0) {
                            if(Data.spellType[selectedSpell] == 5) {
                                menuText1[menuOptionsCount] = "Cast " + Data.spellName[selectedSpell] + " on";
                                menuText2[menuOptionsCount] = "@cya@" + Data.objectName[j4];
                                menuActionID[menuOptionsCount] = 400;
                                menuActionX[menuOptionsCount] = objectX[k3];
                                menuActionY[menuOptionsCount] = objectY[k3];
                                menuActionType[menuOptionsCount] = objectRotation[k3];
                                menuActionVar1[menuOptionsCount] = objectType[k3];
                                menuActionVar2[menuOptionsCount] = selectedSpell;
                                menuOptionsCount++;
                            }
                        } else
                        if(selectedItem >= 0) {
                            menuText1[menuOptionsCount] = "Use " + selectedItemName + " with";
                            menuText2[menuOptionsCount] = "@cya@" + Data.objectName[j4];
                            menuActionID[menuOptionsCount] = 410;
                            menuActionX[menuOptionsCount] = objectX[k3];
                            menuActionY[menuOptionsCount] = objectY[k3];
                            menuActionType[menuOptionsCount] = objectRotation[k3];
                            menuActionVar1[menuOptionsCount] = objectType[k3];
                            menuActionVar2[menuOptionsCount] = selectedItem;
                            menuOptionsCount++;
                        } else {
                            if(!Data.objectCommand1[j4].equalsIgnoreCase("WalkTo")) {
                                menuText1[menuOptionsCount] = Data.objectCommand1[j4];
                                menuText2[menuOptionsCount] = "@cya@" + Data.objectName[j4];
                                menuActionID[menuOptionsCount] = 420;
                                menuActionX[menuOptionsCount] = objectX[k3];
                                menuActionY[menuOptionsCount] = objectY[k3];
                                menuActionType[menuOptionsCount] = objectRotation[k3];
                                menuActionVar1[menuOptionsCount] = objectType[k3];
                                menuOptionsCount++;
                            }
                            if(!Data.objectCommand2[j4].equalsIgnoreCase("Examine")) {
                                menuText1[menuOptionsCount] = Data.objectCommand2[j4];
                                menuText2[menuOptionsCount] = "@cya@" + Data.objectName[j4];
                                menuActionID[menuOptionsCount] = 2400;
                                menuActionX[menuOptionsCount] = objectX[k3];
                                menuActionY[menuOptionsCount] = objectY[k3];
                                menuActionType[menuOptionsCount] = objectRotation[k3];
                                menuActionVar1[menuOptionsCount] = objectType[k3];
                                menuOptionsCount++;
                            }
                            menuText1[menuOptionsCount] = "Examine";
                            menuText2[menuOptionsCount] = "@cya@" + Data.objectName[j4];
                            menuActionID[menuOptionsCount] = 3400;
                            menuActionType[menuOptionsCount] = j4;
                            menuOptionsCount++;
                        }
                        objectAlreadyInMenu[k3] = true;
                    }
                } else {
                    if(player >= 0)
                        player = object.entityType[player] - 0x30d40;
                    if(player >= 0)
                        ground = player;
                }
        }

        if(selectedSpell >= 0 && Data.spellType[selectedSpell] <= 1) {
            menuText1[menuOptionsCount] = "Cast " + Data.spellName[selectedSpell] + " on self";
            menuText2[menuOptionsCount] = "";
            menuActionID[menuOptionsCount] = 1000;
            menuActionType[menuOptionsCount] = selectedSpell;
            menuOptionsCount++;
        }
        if(ground != -1) {
            if(selectedSpell >= 0) {
                if(Data.spellType[selectedSpell] == 6) {
                    menuText1[menuOptionsCount] = "Cast " + Data.spellName[selectedSpell] + " on ground";
                    menuText2[menuOptionsCount] = "";
                    menuActionID[menuOptionsCount] = 900;
                    menuActionX[menuOptionsCount] = engineHandle.selectedX[ground];
                    menuActionY[menuOptionsCount] = engineHandle.selectedY[ground];
                    menuActionType[menuOptionsCount] = selectedSpell;
                    menuOptionsCount++;
                    return;
                }
            } else
            if(selectedItem < 0) {
                menuText1[menuOptionsCount] = "Walk here";
                menuText2[menuOptionsCount] = "";
                menuActionID[menuOptionsCount] = 920;
                menuActionX[menuOptionsCount] = engineHandle.selectedX[ground];
                menuActionY[menuOptionsCount] = engineHandle.selectedY[ground];
                menuOptionsCount++;
            }
        }
    }

    private final void drawShopBox() {
        if(mouseButtonClick != 0) {
            mouseButtonClick = 0;
            int l = super.mouseX - 52;
            int i1 = super.mouseY - 44;
            if(l >= 0 && i1 >= 12 && l < 408 && i1 < 246) {
                int j1 = 0;
                for(int l1 = 0; l1 < 5; l1++) {
                    for(int l2 = 0; l2 < 8; l2++) {
                        int k3 = 7 + l2 * 49;
                        int k4 = 28 + l1 * 34;
                        if(l > k3 && l < k3 + 49 && i1 > k4 && i1 < k4 + 34 && shopItems[j1] != -1) {
                            selectedShopItemIndex = j1;
                            selectedShopItemType = shopItems[j1];
                        }
                        j1++;
                    }

                }

                if(selectedShopItemIndex >= 0) {
                    int i3 = shopItems[selectedShopItemIndex];
                    if(i3 != -1) {
                        if(shopItemCount[selectedShopItemIndex] > 0 && l > 298 && i1 >= 204 && l < 408 && i1 <= 215) {
                            super.streamClass.createPacket(128);
                            super.streamClass.addShort(shopItems[selectedShopItemIndex]);
                            super.streamClass.addInt(shopItemBuyPrice[selectedShopItemIndex]);
                            super.streamClass.formatPacket();
                        }
                        if(getInventoryItemTotalCount(i3) > 0 && l > 2 && i1 >= 229 && l < 112 && i1 <= 240) {
                            super.streamClass.createPacket(255);
                            super.streamClass.addShort(shopItems[selectedShopItemIndex]);
                            super.streamClass.addInt(shopItemSellPrice[selectedShopItemIndex]);
                            super.streamClass.formatPacket();
                        }
                    }
                }
            } else {
                super.streamClass.createPacket(253);
                super.streamClass.formatPacket();
                showShopBox = false;
                return;
            }
        }
        byte byte0 = 52;
        byte byte1 = 44;
        gameGraphics.drawBox(byte0, byte1, 408, 12, 192);
        int k1 = 0x989898;
        gameGraphics.drawBoxAlpha(byte0, byte1 + 12, 408, 17, k1, 160);
        gameGraphics.drawBoxAlpha(byte0, byte1 + 29, 8, 170, k1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 399, byte1 + 29, 9, 170, k1, 160);
        gameGraphics.drawBoxAlpha(byte0, byte1 + 199, 408, 47, k1, 160);
        gameGraphics.drawString("Buying and selling items", byte0 + 1, byte1 + 10, 1, 0xffffff);
        int i2 = 0xffffff;
        if(super.mouseX > byte0 + 320 && super.mouseY >= byte1 && super.mouseX < byte0 + 408 && super.mouseY < byte1 + 12)
            i2 = 0xff0000;
        gameGraphics.cdk("Close window", byte0 + 406, byte1 + 10, 1, i2);
        gameGraphics.drawString("Shops stock in green", byte0 + 2, byte1 + 24, 1, 65280);
        gameGraphics.drawString("Number you own in blue", byte0 + 135, byte1 + 24, 1, 65535);
        gameGraphics.drawString("Your money: " + getInventoryItemTotalCount(10) + "gp", byte0 + 280, byte1 + 24, 1, 0xffff00);
        int j3 = 0xd0d0d0;
        int j4 = 0;
        for(int j5 = 0; j5 < 5; j5++) {
            for(int k5 = 0; k5 < 8; k5++) {
                int i6 = byte0 + 7 + k5 * 49;
                int l6 = byte1 + 28 + j5 * 34;
                if(selectedShopItemIndex == j4)
                    gameGraphics.drawBoxAlpha(i6, l6, 49, 34, 0xff0000, 160);
                else
                    gameGraphics.drawBoxAlpha(i6, l6, 49, 34, j3, 160);
                gameGraphics.drawBoxEdge(i6, l6, 50, 35, 0);
                if(shopItems[j4] != -1) {
                    gameGraphics.drawImage(i6, l6, 48, 32, baseItemPicture + Data.itemInventoryPicture[shopItems[j4]], Data.itemPictureMask[shopItems[j4]], 0, 0, false);
                    gameGraphics.drawString(String.valueOf(shopItemCount[j4]), i6 + 1, l6 + 10, 1, 65280);
                    gameGraphics.cdk(String.valueOf(getInventoryItemTotalCount(shopItems[j4])), i6 + 47, l6 + 10, 1, 65535);
                }
                j4++;
            }

        }

        gameGraphics.drawLineX(byte0 + 5, byte1 + 222, 398, 0);
        if(selectedShopItemIndex == -1) {
            gameGraphics.drawText("Select an object to buy or sell", byte0 + 204, byte1 + 214, 3, 0xffff00);
            return;
        }
        int l5 = shopItems[selectedShopItemIndex];
        if(l5 != -1) {
            if(shopItemCount[selectedShopItemIndex] > 0) {
                int j6 = shopItemBuyPriceModifier + shopItemBasePriceModifier[selectedShopItemIndex];
                if(j6 < 10)
                    j6 = 10;
                int i7 = (j6 * Data.itemBasePrice[l5]) / 100;
                gameGraphics.drawString("Buy a new " + Data.itemName[l5] + " for " + i7 + "gp", byte0 + 2, byte1 + 214, 1, 0xffff00);
                int j2 = 0xffffff;
                if(super.mouseX > byte0 + 298 && super.mouseY >= byte1 + 204 && super.mouseX < byte0 + 408 && super.mouseY <= byte1 + 215)
                    j2 = 0xff0000;
                gameGraphics.cdk("Click here to buy", byte0 + 405, byte1 + 214, 3, j2);
            } else {
                gameGraphics.drawText("This item is not currently available to buy", byte0 + 204, byte1 + 214, 3, 0xffff00);
            }
            if(getInventoryItemTotalCount(l5) > 0) {
                int k6 = shopItemSellPriceModifier + shopItemBasePriceModifier[selectedShopItemIndex];
                if(k6 < 10)
                    k6 = 10;
                int j7 = (k6 * Data.itemBasePrice[l5]) / 100;
                gameGraphics.cdk("Sell your " + Data.itemName[l5] + " for " + j7 + "gp", byte0 + 405, byte1 + 239, 1, 0xffff00);
                int k2 = 0xffffff;
                if(super.mouseX > byte0 + 2 && super.mouseY >= byte1 + 229 && super.mouseX < byte0 + 112 && super.mouseY <= byte1 + 240)
                    k2 = 0xff0000;
                gameGraphics.drawString("Click here to sell", byte0 + 2, byte1 + 239, 3, k2);
                return;
            }
            gameGraphics.drawText("You do not have any of this item to sell", byte0 + 204, byte1 + 239, 3, 0xffff00);
        }
    }

    private final void loadTextures() {
        byte abyte0[] = unpackData("textures.jag", "Textures", 50);
        if(abyte0 == null) {
            errorLoading = true;
            return;
        }
        byte abyte1[] = DataOperations.loadData("index.dat", 0, abyte0);
        gameCamera.createPictures(Data.textureCount, 7, 11);
        for(int l = 0; l < Data.textureCount; l++) {
            String s1 = Data.textureName[l];
            byte abyte2[] = DataOperations.loadData(s1 + ".dat", 0, abyte0);
            gameGraphics.unpackImageData(baseTexturePic, abyte2, abyte1, 1);
            gameGraphics.drawBox(0, 0, 128, 128, 0xff00ff);
            gameGraphics.drawPicture(0, 0, baseTexturePic);
            int i1 = ((GameImage) (gameGraphics)).pictureAssumedWidth[baseTexturePic];
            String s2 = Data.textureSubName[l];
            if(s2 != null && s2.length() > 0) {
                byte abyte3[] = DataOperations.loadData(s2 + ".dat", 0, abyte0);
                gameGraphics.unpackImageData(baseTexturePic, abyte3, abyte1, 1);
                gameGraphics.drawPicture(0, 0, baseTexturePic);
            }
            gameGraphics.cca(subTexturePic + l, 0, 0, i1, i1);
            int j1 = i1 * i1;
            for(int k1 = 0; k1 < j1; k1++)
                if(((GameImage) (gameGraphics)).pictureColors[subTexturePic + l][k1] == 65280)
                    ((GameImage) (gameGraphics)).pictureColors[subTexturePic + l][k1] = 0xff00ff;

            gameGraphics.cbl(subTexturePic + l);
            gameCamera.bjf(l, ((GameImage) (gameGraphics)).bmd[subTexturePic + l], ((GameImage) (gameGraphics)).bme[subTexturePic + l], i1 / 64 - 1);
        }
    }

    private final void drawAppearanceWindow() {
        gameGraphics.interlace = false;
        gameGraphics.clearScreen();
        appearanceMenu.drawMenu();
        int l = 140;
        int i1 = 50;
        l += 116;
        i1 -= 25;
        gameGraphics.drawCharacterLegs(l - 32 - 55, i1, 64, 102, Data.animationNumber[appearance2Colour], appearanceTopBottomColours[appearanceBottomColour]);
        gameGraphics.drawImage(l - 32 - 55, i1, 64, 102, Data.animationNumber[appearanceBodyGender], appearanceTopBottomColours[appearanceTopColour], appearanceSkinColours[appearanceSkinColour], 0, false);
        gameGraphics.drawImage(l - 32 - 55, i1, 64, 102, Data.animationNumber[appearanceHeadType], appearanceHairColours[appearanceHairColour], appearanceSkinColours[appearanceSkinColour], 0, false);
        gameGraphics.drawCharacterLegs(l - 32, i1, 64, 102, Data.animationNumber[appearance2Colour] + 6, appearanceTopBottomColours[appearanceBottomColour]);
        gameGraphics.drawImage(l - 32, i1, 64, 102, Data.animationNumber[appearanceBodyGender] + 6, appearanceTopBottomColours[appearanceTopColour], appearanceSkinColours[appearanceSkinColour], 0, false);
        gameGraphics.drawImage(l - 32, i1, 64, 102, Data.animationNumber[appearanceHeadType] + 6, appearanceHairColours[appearanceHairColour], appearanceSkinColours[appearanceSkinColour], 0, false);
        gameGraphics.drawCharacterLegs((l - 32) + 55, i1, 64, 102, Data.animationNumber[appearance2Colour] + 12, appearanceTopBottomColours[appearanceBottomColour]);
        gameGraphics.drawImage((l - 32) + 55, i1, 64, 102, Data.animationNumber[appearanceBodyGender] + 12, appearanceTopBottomColours[appearanceTopColour], appearanceSkinColours[appearanceSkinColour], 0, false);
        gameGraphics.drawImage((l - 32) + 55, i1, 64, 102, Data.animationNumber[appearanceHeadType] + 12, appearanceHairColours[appearanceHairColour], appearanceSkinColours[appearanceSkinColour], 0, false);
        gameGraphics.drawPicture(0, windowHeight, baseInventoryPic + 22);
        gameGraphics.drawImage(graphics, 0, 0);
    }

    private final void checkMouseStatus() {
        if(selectedSpell >= 0 || selectedItem >= 0) {
            menuText1[menuOptionsCount] = "Cancel";
            menuText2[menuOptionsCount] = "";
            menuActionID[menuOptionsCount] = 4000;
            menuOptionsCount++;
        }
        for(int l = 0; l < menuOptionsCount; l++)
            menuIndexes[l] = l;

        for(boolean flag = false; !flag;) {
            flag = true;
            for(int i1 = 0; i1 < menuOptionsCount - 1; i1++) {
                int k1 = menuIndexes[i1];
                int i2 = menuIndexes[i1 + 1];
                if(menuActionID[k1] > menuActionID[i2]) {
                    menuIndexes[i1] = i2;
                    menuIndexes[i1 + 1] = k1;
                    flag = false;
                }
            }

        }

        if(menuOptionsCount > 20)
            menuOptionsCount = 20;
        if(menuOptionsCount > 0) {
            int j1 = -1;
            for(int l1 = 0; l1 < menuOptionsCount; l1++) {
                if(menuText2[menuIndexes[l1]] == null || menuText2[menuIndexes[l1]].length() <= 0)
                    continue;
                j1 = l1;
                break;
            }

            String s1 = null;
            if((selectedItem >= 0 || selectedSpell >= 0) && menuOptionsCount == 1)
                s1 = "Choose a target";
            else
            if((selectedItem >= 0 || selectedSpell >= 0) && menuOptionsCount > 1)
                s1 = "@whi@" + menuText1[menuIndexes[0]] + " " + menuText2[menuIndexes[0]];
            else
            if(j1 != -1)
                s1 = menuText2[menuIndexes[j1]] + ": @whi@" + menuText1[menuIndexes[0]];
            if(menuOptionsCount == 2 && s1 != null)
                s1 = s1 + "@whi@ / 1 more option";
            if(menuOptionsCount > 2 && s1 != null)
                s1 = s1 + "@whi@ / " + (menuOptionsCount - 1) + " more options";
            if(s1 != null)
                gameGraphics.drawString(s1, 6, 14, 1, 0xffff00);
            if(!configOneMouseButton && mouseButtonClick == 1 || configOneMouseButton && mouseButtonClick == 1 && menuOptionsCount == 1) {
                menuClick(menuIndexes[0]);
                mouseButtonClick = 0;
                return;
            }
            if(!configOneMouseButton && mouseButtonClick == 2 || configOneMouseButton && mouseButtonClick == 1) {
                menuHeight = (menuOptionsCount + 1) * 15;
                menuWidth = gameGraphics.textWidth("Choose option", 1) + 5;
                for(int j2 = 0; j2 < menuOptionsCount; j2++) {
                    int k2 = gameGraphics.textWidth(menuText1[j2] + " " + menuText2[j2], 1) + 5;
                    if(k2 > menuWidth)
                        menuWidth = k2;
                }

                menuX = super.mouseX - menuWidth / 2;
                menuY = super.mouseY - 7;
                menuShow = true;
                if(menuX < 0)
                    menuX = 0;
                if(menuY < 0)
                    menuY = 0;
                if(menuX + menuWidth > 510)
                    menuX = 510 - menuWidth;
                if(menuY + menuHeight > 315)
                    menuY = 315 - menuHeight;
                mouseButtonClick = 0;
            }
        }
    }
    
    private final void drawGame() {
        if(playerAliveTimeout != 0) {
            gameGraphics.screenFadeToBlack();
            gameGraphics.drawText("Oh dear! You are dead...", windowWidth / 2, windowHeight / 2, 7, 0xff0000);
            drawChatMessageTabs();
            gameGraphics.drawImage(graphics, 0, 0);
            return;
        }
        if(showAppearanceWindow) {
            drawAppearanceWindow();
            return;
        }
        if(isSleeping) {
            gameGraphics.screenFadeToBlack();
            if(Math.random() < 0.14999999999999999D)
                gameGraphics.drawText("ZZZ", (int)(Math.random() * 80D), (int)(Math.random() * 334D), 5, (int)(Math.random() * 16777215D));
            if(Math.random() < 0.14999999999999999D)
                gameGraphics.drawText("ZZZ", 512 - (int)(Math.random() * 80D), (int)(Math.random() * 334D), 5, (int)(Math.random() * 16777215D));
            gameGraphics.drawBox(windowWidth / 2 - 100, 160, 200, 40, 0);
            gameGraphics.drawText("You are sleeping", windowWidth / 2, 50, 7, 0xffff00);
            gameGraphics.drawText("Fatigue: " + (fatigue * 100) / 750 + "%", windowWidth / 2, 90, 7, 0xffff00);
            gameGraphics.drawText("When you want to wake up just use your", windowWidth / 2, 140, 5, 0xffffff);
            gameGraphics.drawText("keyboard to type the word in the box below", windowWidth / 2, 160, 5, 0xffffff);
            gameGraphics.drawText(super.inputText + "*", windowWidth / 2, 180, 5, 65535);
            if(sleepingStatusText == null) {
                gameGraphics.drawPixels(captchaPixels, windowWidth / 2 - 127, 230, captchaWidth, captchaHeight);
            }
            else
                gameGraphics.drawText(sleepingStatusText, windowWidth / 2, 260, 5, 0xff0000);
            gameGraphics.drawBoxEdge(windowWidth / 2 - 128, 229, 257, 42, 0xffffff);
            drawChatMessageTabs();
            gameGraphics.drawText("If you can't read the word", windowWidth / 2, 290, 1, 0xffffff);
            gameGraphics.drawText("@yel@click here@whi@ to get a different one", windowWidth / 2, 305, 1, 0xffffff);
            gameGraphics.drawImage(graphics, 0, 0);
            return;
        }
        if(!engineHandle.playerIsAlive)
            return;
        for(int l = 0; l < 64; l++) {
            gameCamera.removeModel(engineHandle.gih[lastLayerIndex][l]);
            if(lastLayerIndex == 0) {
                gameCamera.removeModel(engineHandle.gim[1][l]);
                gameCamera.removeModel(engineHandle.gih[1][l]);
                gameCamera.removeModel(engineHandle.gim[2][l]);
                gameCamera.removeModel(engineHandle.gih[2][l]);
            }
            cameraZoom = true;
            if(lastLayerIndex == 0 && (engineHandle.tiles[ourPlayer.currentX / 128][ourPlayer.currentY / 128] & 0x80) == 0) {
                if(showRoofs) {
                    gameCamera.addModel(engineHandle.gih[lastLayerIndex][l]);
                    if(lastLayerIndex == 0) {
                        gameCamera.addModel(engineHandle.gim[1][l]);
                        gameCamera.addModel(engineHandle.gih[1][l]);
                        gameCamera.addModel(engineHandle.gim[2][l]);
                        gameCamera.addModel(engineHandle.gih[2][l]);
                    }
                }
                cameraZoom = false;
            }
        }

        if(modelFireLightningSpellNumber != lastModelFireLightningSpellNumber) {
            lastModelFireLightningSpellNumber = modelFireLightningSpellNumber;
            for(int i1 = 0; i1 < objectCount; i1++) {
                if(objectType[i1] == 97)
                    drawModel(i1, "firea" + (modelFireLightningSpellNumber + 1));
                if(objectType[i1] == 274)
                    drawModel(i1, "fireplacea" + (modelFireLightningSpellNumber + 1));
                if(objectType[i1] == 1031)
                    drawModel(i1, "lightning" + (modelFireLightningSpellNumber + 1));
                if(objectType[i1] == 1036)
                    drawModel(i1, "firespell" + (modelFireLightningSpellNumber + 1));
                if(objectType[i1] == 1147)
                    drawModel(i1, "spellcharge" + (modelFireLightningSpellNumber + 1));
            }

        }
        if(modelTorchNumber != lastModelTorchNumber) {
            lastModelTorchNumber = modelTorchNumber;
            for(int j1 = 0; j1 < objectCount; j1++) {
                if(objectType[j1] == 51)
                    drawModel(j1, "torcha" + (modelTorchNumber + 1));
                if(objectType[j1] == 143)
                    drawModel(j1, "skulltorcha" + (modelTorchNumber + 1));
            }

        }
        if(modelClawSpellNumber != lastModelClawSpellNumber) {
            lastModelClawSpellNumber = modelClawSpellNumber;
            for(int k1 = 0; k1 < objectCount; k1++)
                if(objectType[k1] == 1142)
                    drawModel(k1, "clawspell" + (modelClawSpellNumber + 1));

        }
        gameCamera.removeLastUpdates(drawUpdatesPerformed);
        drawUpdatesPerformed = 0;
        for(int l1 = 0; l1 < playerCount; l1++) {
            Mob player = playerArray[l1];
            if(player.bottomColour != 255) {
                int j2 = player.currentX;
                int l2 = player.currentY;
                int j3 = -engineHandle.getAveragedElevation(j2, l2);
                int k4 = gameCamera.bhd(5000 + l1, j2, j3, l2, 145, 220, l1 + 10000);
                drawUpdatesPerformed++;
                if(player == ourPlayer)
                    gameCamera.bhe(k4);
                if(player.currentSprite == 8)
                    gameCamera.bhf(k4, -30);
                if(player.currentSprite == 9)
                    gameCamera.bhf(k4, 30);
            }
        }

        for(int i2 = 0; i2 < playerCount; i2++) {
            Mob player = playerArray[i2];
            if(player.projectileDistance > 0) {
                Mob f3 = null;
                if(player.attackingNpcIndex != -1)
                    f3 = npcAttackingArray[player.attackingNpcIndex];
                else
                if(player.attackingPlayerIndex != -1)
                    f3 = playerBufferArray[player.attackingPlayerIndex];
                if(f3 != null) {
                    int k3 = player.currentX;
                    int l4 = player.currentY;
                    int k7 = -engineHandle.getAveragedElevation(k3, l4) - 110;
                    int k9 = f3.currentX;
                    int j10 = f3.currentY;
                    int k10 = -engineHandle.getAveragedElevation(k9, j10) - Data.npcCameraArray2[f3.npcId] / 2;
                    int l10 = (k3 * player.projectileDistance + k9 * (projectileRange - player.projectileDistance)) / projectileRange;
                    int i11 = (k7 * player.projectileDistance + k10 * (projectileRange - player.projectileDistance)) / projectileRange;
                    int j11 = (l4 * player.projectileDistance + j10 * (projectileRange - player.projectileDistance)) / projectileRange;
                    gameCamera.bhd(baseProjectilePic + player.projectileType, l10, i11, j11, 32, 32, 0);
                    drawUpdatesPerformed++;
                }
            }
        }

        for(int k2 = 0; k2 < npcCount; k2++) {
            Mob npc = npcArray[k2];
            int l3 = npc.currentX;
            int i5 = npc.currentY;
            int l7 = -engineHandle.getAveragedElevation(l3, i5);
            int l9 = gameCamera.bhd(20000 + k2, l3, l7, i5, Data.npcCameraArray1[npc.npcId], Data.npcCameraArray2[npc.npcId], k2 + 30000);
            drawUpdatesPerformed++;
            if(npc.currentSprite == 8)
                gameCamera.bhf(l9, -30);
            if(npc.currentSprite == 9)
                gameCamera.bhf(l9, 30);
        }

        for(int i3 = 0; i3 < groundItemCount; i3++) {
            int i4 = groundItemX[i3] * magicLoc + 64;
            int j5 = groundItemY[i3] * magicLoc + 64;
            gameCamera.bhd(40000 + groundItemID[i3], i4, -engineHandle.getAveragedElevation(i4, j5) - groundItemObjectVar[i3], j5, 96, 64, i3 + 20000);
            drawUpdatesPerformed++;
        }

        for(int j4 = 0; j4 < teleBubbleCount; j4++) {
            int k5 = teleBubbleX[j4] * magicLoc + 64;
            int i8 = teleBubbleY[j4] * magicLoc + 64;
            int i10 = teleBubbleType[j4];
            if(i10 == 0) {
                gameCamera.bhd(50000 + j4, k5, -engineHandle.getAveragedElevation(k5, i8), i8, 128, 256, j4 + 50000);
                drawUpdatesPerformed++;
            }
            if(i10 == 1) {
                gameCamera.bhd(50000 + j4, k5, -engineHandle.getAveragedElevation(k5, i8), i8, 128, 64, j4 + 50000);
                drawUpdatesPerformed++;
            }
        }

        gameGraphics.interlace = false;
        gameGraphics.clearScreen();
        gameGraphics.interlace = super.keyF1Toggle;
        if(lastLayerIndex == 3) {
            int l5 = 40 + (int)(Math.random() * 3D);
            int j8 = 40 + (int)(Math.random() * 7D);
            gameCamera.bjl(l5, j8, -50, -10, -50);
        }
        itemsAboveHeadCount = 0;
        receivedMessagesCount = 0;
        healthBarVisibleCount = 0;
        if(cameraAutoAngleDebug) {
            if(configCameraAutoAngle && !cameraZoom) {
                int i6 = cameraAutoAngle;
                autoRotateCamera();
                if(cameraAutoAngle != i6) {
                    cameraAutoRotatePlayerX = ourPlayer.currentX;
                    cameraAutoRotatePlayerY = ourPlayer.currentY;
                }
            }
            if(fogOfWar) {
                gameCamera.zoom1 = 3000;
                gameCamera.zoom2 = 3000;
                gameCamera.zoom3 = 1;
                gameCamera.zoom4 = 2800;
            }
            else {
                gameCamera.zoom1 = 40000;
                gameCamera.zoom2 = 40000;
                gameCamera.zoom3 = 40000;
                gameCamera.zoom4 = 40000;
            }
            cameraRotation = cameraAutoAngle * 32;
            int j6 = cameraAutoRotatePlayerX + cameraRotationXAmount;
            int k8 = cameraAutoRotatePlayerY + cameraRotationYAmount;
            gameCamera.setCamera(j6, -engineHandle.getAveragedElevation(j6, k8), k8, 912, cameraRotation * 4, 0, 2000);
        } else {
            if(configCameraAutoAngle && !cameraZoom)
                autoRotateCamera();
            if(fogOfWar) {
                if(!super.keyF1Toggle) {
                    gameCamera.zoom1 = 2400;
                    gameCamera.zoom2 = 2400;
                    gameCamera.zoom3 = 1;
                    gameCamera.zoom4 = 2300;
                } else {
                    gameCamera.zoom1 = 2200;
                    gameCamera.zoom2 = 2200;
                    gameCamera.zoom3 = 1;
                    gameCamera.zoom4 = 2100;
                }
            }
            else {
                gameCamera.zoom1 = 40000;
                gameCamera.zoom2 = 40000;
                gameCamera.zoom3 = 40000;
                gameCamera.zoom4 = 40000;
            }
            int k6 = cameraAutoRotatePlayerX + cameraRotationXAmount;
            int l8 = cameraAutoRotatePlayerY + cameraRotationYAmount;
            gameCamera.setCamera(k6, -engineHandle.getAveragedElevation(k6, l8), l8, 912, cameraRotation * 4, 0, cameraDistance * 2);
        }
        gameCamera.finishCamera();
        drawAboveHeadThings();
        if(actionPictureType > 0)
            gameGraphics.drawPicture(walkMouseX - 8, walkMouseY - 8, baseInventoryPic + 14 + (24 - actionPictureType) / 6);
        if(actionPictureType < 0)
            gameGraphics.drawPicture(walkMouseX - 8, walkMouseY - 8, baseInventoryPic + 18 + (24 + actionPictureType) / 6);
        if(systemUpdate != 0) {
            int l6 = systemUpdate / 50;
            int i9 = l6 / 60;
            l6 %= 60;
            if(l6 < 10)
                gameGraphics.drawText("System update in: " + i9 + ":0" + l6, 256, windowHeight - 7, 1, 0xffff00);
            else
                gameGraphics.drawText("System update in: " + i9 + ":" + l6, 256, windowHeight - 7, 1, 0xffff00);
        }
        if(!loadArea) {
            int i7 = 2203 - (sectionY + wildY + areaY);
            if(sectionX + wildX + areaX >= 2640)
                i7 = -50;
            if(i7 > 0) {
                int j9 = 1 + i7 / 6;
                gameGraphics.drawPicture(453, windowHeight - 56, baseInventoryPic + 13);
                gameGraphics.drawText("Wilderness", 465, windowHeight - 20, 1, 0xffff00);
                gameGraphics.drawText("Level: " + j9, 465, windowHeight - 7, 1, 0xffff00);
                if(wildType == 0)
                    wildType = 2;
            }
            if(wildType == 0 && i7 > -10 && i7 <= 0)
                wildType = 1;
        }
        if(messagesTab == 0) {
            for(int j7 = 0; j7 < 5; j7++)
                if(messagesTimeout[j7] > 0) {
                    String s1 = messagesArray[j7];
                    gameGraphics.drawString(s1, 7, windowHeight - 18 - j7 * 12, 1, 0xffff00);
                }

        }
        chatInputMenu.ggf(messagesHandleType2);
        chatInputMenu.ggf(messagesHandleType5);
        chatInputMenu.ggf(messagesHandleType6);
        if(messagesTab == 1)
            chatInputMenu.gge(messagesHandleType2);
        else
        if(messagesTab == 2)
            chatInputMenu.gge(messagesHandleType5);
        else
        if(messagesTab == 3)
            chatInputMenu.gge(messagesHandleType6);
        Menu.chatMenuTextHeightMod = 2;
        chatInputMenu.drawMenu();
        Menu.chatMenuTextHeightMod = 0;
        gameGraphics.ccd(((GameImage) (gameGraphics)).gameWidth - 3 - 197, 3, baseInventoryPic, 128);
        drawMenus();
        gameGraphics.loggedIn = false;
        drawChatMessageTabs();
        gameGraphics.drawImage(graphics, 0, 0);
    }

    private final void drawReportAbuseBox2() {
        if(super.enteredInputText.length() > 0) {
            String s1 = super.enteredInputText.trim();
            super.inputText = "";
            super.enteredInputText = "";
            if(s1.length() > 0) {
                long l1 = DataOperations.nameToHash(s1);
                super.streamClass.createPacket(7);
                super.streamClass.addLong(l1);
                super.streamClass.addByte(reportAbuseOptionSelected);
                //super.streamClass.addByte(dia ? 1 : 0);
                super.streamClass.formatPacket();
            }
            showAbuseBox = 0;
            return;
        }
        gameGraphics.drawBox(56, 130, 400, 100, 0);
        gameGraphics.drawBoxEdge(56, 130, 400, 100, 0xffffff);
        int l = 160;
        gameGraphics.drawText("Now type the name of the offending player, and press enter", 256, l, 1, 0xffff00);
        l += 18;
        gameGraphics.drawText("Name: " + super.inputText + "*", 256, l, 4, 0xffffff);
        l = 222;
        int i1 = 0xffffff;
        if(super.mouseX > 196 && super.mouseX < 316 && super.mouseY > l - 13 && super.mouseY < l + 2) {
            i1 = 0xffff00;
            if(mouseButtonClick == 1) {
                mouseButtonClick = 0;
                showAbuseBox = 0;
            }
        }
        gameGraphics.drawText("Click here to cancel", 256, l, 1, i1);
        if(mouseButtonClick == 1 && (super.mouseX < 56 || super.mouseX > 456 || super.mouseY < 130 || super.mouseY > 230)) {
            mouseButtonClick = 0;
            showAbuseBox = 0;
        }
    }

    private final void drawMenus() {
        if(logoutTimer != 0)
            drawLogoutBox();
        else
        if(showWelcomeBox)
            drawWelcomeBox();
        else
        if(showServerMessageBox)
            drawServerMessageBox();
        else
        if(wildType == 1)
            drawWildernessAlertBox();
        else
        if(showBankBox && combatTimeout == 0)
            drawBankBox();
        else
        if(showShopBox && combatTimeout == 0)
            drawShopBox();
        else
        if(showTradeConfirmBox)
            drawTradeConfirmBox();
        else
        if(showTradeBox)
            drawTradeBox();
        else
        if(showDuelConfirmBox)
            drawDuelConfirmBox();
        else
        if(showDuelBox)
            drawDuelBox();
        else
        if(showAbuseBox == 1)
            drawReportAbuseBox1();
        else
        if(showAbuseBox == 2)
            drawReportAbuseBox2();
        else
        if(showFriendsBox != 0) {
            drawFriendsBox();
        } else {
            if(showQuestionMenu)
                drawQuestionMenu();
            if(showCombatWindow || ourPlayer.currentSprite == 8 || ourPlayer.currentSprite == 9)
                drawCombatStyleBox();
            getMenuHighlighted();
            boolean flag = !showQuestionMenu && !menuShow;
            if(flag)
                menuOptionsCount = 0;
            if(drawMenuTab == 0 && flag)
                generateWorldRightClickMenu();
            if(drawMenuTab == 1)
                drawInventoryMenu(flag);
            if(drawMenuTab == 2)
                drawMinimapMenu(flag);
            if(drawMenuTab == 3)
                drawStatsQuestsMenu(flag);
            if(drawMenuTab == 4)
                drawPrayerMagicMenu(flag);
            if(drawMenuTab == 5)
                drawFriendsMenu(flag);
            if(drawMenuTab == 6)
                drawOptionsMenu(flag);
            if(!menuShow && !showQuestionMenu)
                checkMouseStatus();
            if(menuShow && !showQuestionMenu)
                drawRightClickMenu();
        }
        mouseButtonClick = 0;
    }

    private final void loadModels() {
        Data.getModelNameIndex("torcha2");
        Data.getModelNameIndex("torcha3");
        Data.getModelNameIndex("torcha4");
        Data.getModelNameIndex("skulltorcha2");
        Data.getModelNameIndex("skulltorcha3");
        Data.getModelNameIndex("skulltorcha4");
        Data.getModelNameIndex("firea2");
        Data.getModelNameIndex("firea3");
        Data.getModelNameIndex("fireplacea2");
        Data.getModelNameIndex("fireplacea3");
        Data.getModelNameIndex("firespell2");
        Data.getModelNameIndex("firespell3");
        Data.getModelNameIndex("lightning2");
        Data.getModelNameIndex("lightning3");
        Data.getModelNameIndex("clawspell2");
        Data.getModelNameIndex("clawspell3");
        Data.getModelNameIndex("clawspell4");
        Data.getModelNameIndex("clawspell5");
        Data.getModelNameIndex("spellcharge2");
        Data.getModelNameIndex("spellcharge3");
        byte abyte0[] = unpackData("models.jag", "3d models", 60);
        if(abyte0 == null) {
            errorLoading = true;
            return;
        }
        for(int i1 = 0; i1 < Data.modelCount; i1++) {
            int j1 = DataOperations.getSoundOffset(Data.modelName[i1] + ".ob3", abyte0);
            if(j1 != 0)
                gameDataObjects[i1] = new GameObject(abyte0, j1, true);
            else
                gameDataObjects[i1] = new GameObject(1, 1);
            if(Data.modelName[i1].equals("giantcrystal"))
                gameDataObjects[i1].isGiantCrystal = true;
        }
    }

    private final void drawDuelBox() {
        if(mouseButtonClick != 0 && mouseClickedHeldInTradeDuelBox == 0)
            mouseClickedHeldInTradeDuelBox = 1;
        if(mouseClickedHeldInTradeDuelBox > 0) {
            int l = super.mouseX - 22;
            int i1 = super.mouseY - 36;
            if(l >= 0 && i1 >= 0 && l < 468 && i1 < 262) {
                if(l > 216 && i1 > 30 && l < 462 && i1 < 235) {
                    int j1 = (l - 217) / 49 + ((i1 - 31) / 34) * 5;
                    if(j1 >= 0 && j1 < inventoryItemsCount) {
                        boolean flag1 = false;
                        int k2 = 0;
                        int j3 = inventoryItems[j1];
                        for(int j4 = 0; j4 < duelMyItemCount; j4++)
                            if(duelMyItems[j4] == j3)
                                if(Data.itemStackable[j3] == 0) {
                                    for(int l4 = 0; l4 < mouseClickedHeldInTradeDuelBox; l4++) {
                                        if(duelMyItemsCount[j4] < inventoryItemCount[j1])
                                            duelMyItemsCount[j4]++;
                                        flag1 = true;
                                    }

                                } else {
                                    k2++;
                                }

                        if(getInventoryItemTotalCount(j3) <= k2)
                            flag1 = true;
                        if(Data.itemSpecial[j3] == 1) {
                            displayMessage("This object cannot be added to a duel offer", 3);
                            flag1 = true;
                        }
                        if(!flag1 && duelMyItemCount < 8) {
                            duelMyItems[duelMyItemCount] = j3;
                            duelMyItemsCount[duelMyItemCount] = 1;
                            duelMyItemCount++;
                            flag1 = true;
                        }
                        if(flag1) {
                            super.streamClass.createPacket(123);
                            super.streamClass.addByte(duelMyItemCount);
                            for(int i5 = 0; i5 < duelMyItemCount; i5++) {
                                super.streamClass.addShort(duelMyItems[i5]);
                                super.streamClass.addInt(duelMyItemsCount[i5]);
                            }

                            super.streamClass.formatPacket();
                            duelOpponentAccepted = false;
                            duelMyAccepted = false;
                        }
                    }
                }
                if(l > 8 && i1 > 30 && l < 205 && i1 < 129) {
                    int k1 = (l - 9) / 49 + ((i1 - 31) / 34) * 4;
                    if(k1 >= 0 && k1 < duelMyItemCount) {
                        int i2 = duelMyItems[k1];
                        for(int l2 = 0; l2 < mouseClickedHeldInTradeDuelBox; l2++) {
                            if(Data.itemStackable[i2] == 0 && duelMyItemsCount[k1] > 1) {
                                duelMyItemsCount[k1]--;
                                continue;
                            }
                            duelMyItemCount--;
                            mouseButtonHeldTime = 0;
                            for(int k3 = k1; k3 < duelMyItemCount; k3++) {
                                duelMyItems[k3] = duelMyItems[k3 + 1];
                                duelMyItemsCount[k3] = duelMyItemsCount[k3 + 1];
                            }

                            break;
                        }

                        super.streamClass.createPacket(123);
                        super.streamClass.addByte(duelMyItemCount);
                        for(int l3 = 0; l3 < duelMyItemCount; l3++) {
                            super.streamClass.addShort(duelMyItems[l3]);
                            super.streamClass.addInt(duelMyItemsCount[l3]);
                        }

                        super.streamClass.formatPacket();
                        duelOpponentAccepted = false;
                        duelMyAccepted = false;
                    }
                }
                boolean flag = false;
                if(l >= 93 && i1 >= 221 && l <= 104 && i1 <= 232) {
                    duelNoRetreating = !duelNoRetreating;
                    flag = true;
                }
                if(l >= 93 && i1 >= 240 && l <= 104 && i1 <= 251) {
                    duelNoMagic = !duelNoMagic;
                    flag = true;
                }
                if(l >= 191 && i1 >= 221 && l <= 202 && i1 <= 232) {
                    duelNoPrayer = !duelNoPrayer;
                    flag = true;
                }
                if(l >= 191 && i1 >= 240 && l <= 202 && i1 <= 251) {
                    duelNoWeapons = !duelNoWeapons;
                    flag = true;
                }
                if(flag) {
                    super.streamClass.createPacket(225);
                    super.streamClass.addByte(duelNoRetreating ? 1 : 0);
                    super.streamClass.addByte(duelNoMagic ? 1 : 0);
                    super.streamClass.addByte(duelNoPrayer ? 1 : 0);
                    super.streamClass.addByte(duelNoWeapons ? 1 : 0);
                    super.streamClass.formatPacket();
                    duelOpponentAccepted = false;
                    duelMyAccepted = false;
                }
                if(l >= 217 && i1 >= 238 && l <= 286 && i1 <= 259) {
                    duelMyAccepted = true;
                    super.streamClass.createPacket(252);
                    super.streamClass.formatPacket();
                }
                if(l >= 394 && i1 >= 238 && l < 463 && i1 < 259) {
                    showDuelBox = false;
                    super.streamClass.createPacket(35);
                    super.streamClass.formatPacket();
                }
            } else
            if(mouseButtonClick != 0) {
                showDuelBox = false;
                super.streamClass.createPacket(35);
                super.streamClass.formatPacket();
            }
            mouseButtonClick = 0;
            mouseClickedHeldInTradeDuelBox = 0;
        }
        if(!showDuelBox)
            return;
        byte byte0 = 22;
        byte byte1 = 36;
        gameGraphics.drawBox(byte0, byte1, 468, 12, 0xc90b1d);
        int l1 = 0x989898;
        gameGraphics.drawBoxAlpha(byte0, byte1 + 12, 468, 18, l1, 160);
        gameGraphics.drawBoxAlpha(byte0, byte1 + 30, 8, 248, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 205, byte1 + 30, 11, 248, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 462, byte1 + 30, 6, 248, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 99, 197, 24, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 192, 197, 23, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 258, 197, 20, l1, 160);
        gameGraphics.drawBoxAlpha(byte0 + 216, byte1 + 235, 246, 43, l1, 160);
        int j2 = 0xd0d0d0;
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 30, 197, 69, j2, 160);
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 123, 197, 69, j2, 160);
        gameGraphics.drawBoxAlpha(byte0 + 8, byte1 + 215, 197, 43, j2, 160);
        gameGraphics.drawBoxAlpha(byte0 + 216, byte1 + 30, 246, 205, j2, 160);
        for(int i3 = 0; i3 < 3; i3++)
            gameGraphics.drawLineX(byte0 + 8, byte1 + 30 + i3 * 34, 197, 0);

        for(int i4 = 0; i4 < 3; i4++)
            gameGraphics.drawLineX(byte0 + 8, byte1 + 123 + i4 * 34, 197, 0);

        for(int k4 = 0; k4 < 7; k4++)
            gameGraphics.drawLineX(byte0 + 216, byte1 + 30 + k4 * 34, 246, 0);

        for(int j5 = 0; j5 < 6; j5++) {
            if(j5 < 5)
                gameGraphics.drawLineY(byte0 + 8 + j5 * 49, byte1 + 30, 69, 0);
            if(j5 < 5)
                gameGraphics.drawLineY(byte0 + 8 + j5 * 49, byte1 + 123, 69, 0);
            gameGraphics.drawLineY(byte0 + 216 + j5 * 49, byte1 + 30, 205, 0);
        }

        gameGraphics.drawLineX(byte0 + 8, byte1 + 215, 197, 0);
        gameGraphics.drawLineX(byte0 + 8, byte1 + 257, 197, 0);
        gameGraphics.drawLineY(byte0 + 8, byte1 + 215, 43, 0);
        gameGraphics.drawLineY(byte0 + 204, byte1 + 215, 43, 0);
        gameGraphics.drawString("Preparing to duel with: " + duelOpponent, byte0 + 1, byte1 + 10, 1, 0xffffff);
        gameGraphics.drawString("Your Stake", byte0 + 9, byte1 + 27, 4, 0xffffff);
        gameGraphics.drawString("Opponent's Stake", byte0 + 9, byte1 + 120, 4, 0xffffff);
        gameGraphics.drawString("Duel Options", byte0 + 9, byte1 + 212, 4, 0xffffff);
        gameGraphics.drawString("Your Inventory", byte0 + 216, byte1 + 27, 4, 0xffffff);
        gameGraphics.drawString("No retreating", byte0 + 8 + 1, byte1 + 215 + 16, 3, 0xffff00);
        gameGraphics.drawString("No magic", byte0 + 8 + 1, byte1 + 215 + 35, 3, 0xffff00);
        gameGraphics.drawString("No prayer", byte0 + 8 + 102, byte1 + 215 + 16, 3, 0xffff00);
        gameGraphics.drawString("No weapons", byte0 + 8 + 102, byte1 + 215 + 35, 3, 0xffff00);
        gameGraphics.drawBoxEdge(byte0 + 93, byte1 + 215 + 6, 11, 11, 0xffff00);
        if(duelNoRetreating)
            gameGraphics.drawBox(byte0 + 95, byte1 + 215 + 8, 7, 7, 0xffff00);
        gameGraphics.drawBoxEdge(byte0 + 93, byte1 + 215 + 25, 11, 11, 0xffff00);
        if(duelNoMagic)
            gameGraphics.drawBox(byte0 + 95, byte1 + 215 + 27, 7, 7, 0xffff00);
        gameGraphics.drawBoxEdge(byte0 + 191, byte1 + 215 + 6, 11, 11, 0xffff00);
        if(duelNoPrayer)
            gameGraphics.drawBox(byte0 + 193, byte1 + 215 + 8, 7, 7, 0xffff00);
        gameGraphics.drawBoxEdge(byte0 + 191, byte1 + 215 + 25, 11, 11, 0xffff00);
        if(duelNoWeapons)
            gameGraphics.drawBox(byte0 + 193, byte1 + 215 + 27, 7, 7, 0xffff00);
        if(!duelMyAccepted)
            gameGraphics.drawPicture(byte0 + 217, byte1 + 238, baseInventoryPic + 25);
        gameGraphics.drawPicture(byte0 + 394, byte1 + 238, baseInventoryPic + 26);
        if(duelOpponentAccepted) {
            gameGraphics.drawText("Other player", byte0 + 341, byte1 + 246, 1, 0xffffff);
            gameGraphics.drawText("has accepted", byte0 + 341, byte1 + 256, 1, 0xffffff);
        }
        if(duelMyAccepted) {
            gameGraphics.drawText("Waiting for", byte0 + 217 + 35, byte1 + 246, 1, 0xffffff);
            gameGraphics.drawText("other player", byte0 + 217 + 35, byte1 + 256, 1, 0xffffff);
        }
        for(int k5 = 0; k5 < inventoryItemsCount; k5++) {
            int l5 = 217 + byte0 + (k5 % 5) * 49;
            int j6 = 31 + byte1 + (k5 / 5) * 34;
            gameGraphics.drawImage(l5, j6, 48, 32, baseItemPicture + Data.itemInventoryPicture[inventoryItems[k5]], Data.itemPictureMask[inventoryItems[k5]], 0, 0, false);
            if(Data.itemStackable[inventoryItems[k5]] == 0)
                gameGraphics.drawString(String.valueOf(inventoryItemCount[k5]), l5 + 1, j6 + 10, 1, 0xffff00);
        }

        for(int i6 = 0; i6 < duelMyItemCount; i6++) {
            int k6 = 9 + byte0 + (i6 % 4) * 49;
            int i7 = 31 + byte1 + (i6 / 4) * 34;
            gameGraphics.drawImage(k6, i7, 48, 32, baseItemPicture + Data.itemInventoryPicture[duelMyItems[i6]], Data.itemPictureMask[duelMyItems[i6]], 0, 0, false);
            if(Data.itemStackable[duelMyItems[i6]] == 0)
                gameGraphics.drawString(String.valueOf(duelMyItemsCount[i6]), k6 + 1, i7 + 10, 1, 0xffff00);
            if(super.mouseX > k6 && super.mouseX < k6 + 48 && super.mouseY > i7 && super.mouseY < i7 + 32)
                gameGraphics.drawString(Data.itemName[duelMyItems[i6]] + ": @whi@" + Data.itemDescription[duelMyItems[i6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

        for(int l6 = 0; l6 < duelOpponentItemCount; l6++) {
            int j7 = 9 + byte0 + (l6 % 4) * 49;
            int k7 = 124 + byte1 + (l6 / 4) * 34;
            gameGraphics.drawImage(j7, k7, 48, 32, baseItemPicture + Data.itemInventoryPicture[duelOpponentItems[l6]], Data.itemPictureMask[duelOpponentItems[l6]], 0, 0, false);
            if(Data.itemStackable[duelOpponentItems[l6]] == 0)
                gameGraphics.drawString(String.valueOf(duelOpponentItemsCount[l6]), j7 + 1, k7 + 10, 1, 0xffff00);
            if(super.mouseX > j7 && super.mouseX < j7 + 48 && super.mouseY > k7 && super.mouseY < k7 + 32)
                gameGraphics.drawString(Data.itemName[duelOpponentItems[l6]] + ": @whi@" + Data.itemDescription[duelOpponentItems[l6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

    }

    private final void drawWildernessAlertBox() {
        int l = 97;
        gameGraphics.drawBox(86, 77, 340, 180, 0);
        gameGraphics.drawBoxEdge(86, 77, 340, 180, 0xffffff);
        gameGraphics.drawText("Warning! Proceed with caution", 256, l, 4, 0xff0000);
        l += 26;
        gameGraphics.drawText("If you go much further north you will enter the", 256, l, 1, 0xffffff);
        l += 13;
        gameGraphics.drawText("wilderness. This a very dangerous area where", 256, l, 1, 0xffffff);
        l += 13;
        gameGraphics.drawText("other players can attack you!", 256, l, 1, 0xffffff);
        l += 22;
        gameGraphics.drawText("The further north you go the more dangerous it", 256, l, 1, 0xffffff);
        l += 13;
        gameGraphics.drawText("becomes, but the more treasure you will find.", 256, l, 1, 0xffffff);
        l += 22;
        gameGraphics.drawText("In the wilderness an indicator at the bottom-right", 256, l, 1, 0xffffff);
        l += 13;
        gameGraphics.drawText("of the screen will show the current level of danger", 256, l, 1, 0xffffff);
        l += 22;
        int i1 = 0xffffff;
        if(super.mouseY > l - 12 && super.mouseY <= l && super.mouseX > 181 && super.mouseX < 331)
            i1 = 0xff0000;
        gameGraphics.drawText("Click here to close window", 256, l, 1, i1);
        if(mouseButtonClick != 0) {
            if(super.mouseY > l - 12 && super.mouseY <= l && super.mouseX > 181 && super.mouseX < 331)
                wildType = 2;
            if(super.mouseX < 86 || super.mouseX > 426 || super.mouseY < 77 || super.mouseY > 257)
                wildType = 2;
            mouseButtonClick = 0;
        }
    }

    final void drawNPC(int x, int y, int width, int height, int index, int unknown1, int unknown2) {
        Mob npc = npcArray[index];
        int l = npc.currentSprite + (cameraRotation + 16) / 32 & 7;
        boolean flag = false;
        int i1 = l;
        if(i1 == 5) {
            i1 = 3;
            flag = true;
        } else
        if(i1 == 6) {
            i1 = 2;
            flag = true;
        } else
        if(i1 == 7) {
            i1 = 1;
            flag = true;
        }
        int j1 = i1 * 3 + walkModel[(npc.stepCount / Data.npcWalkModelArray[npc.npcId]) % 4];
        if(npc.currentSprite == 8) {
            i1 = 5;
            l = 2;
            flag = false;
            x -= (Data.npcCombatSprite[npc.npcId] * unknown2) / 100;
            j1 = i1 * 3 + combatModelArray1[(tick / (Data.npcCombatModel[npc.npcId] - 1)) % 8];
        } else
        if(npc.currentSprite == 9) {
            i1 = 5;
            l = 2;
            flag = true;
            x += (Data.npcCombatSprite[npc.npcId] * unknown2) / 100;
            j1 = i1 * 3 + combatModelArray2[(tick / Data.npcCombatModel[npc.npcId]) % 8];
        }
        for(int k1 = 0; k1 < 12; k1++) {
            int l1 = animationModelArray[l][k1];
            int k2 = Data.npcAnimationCount[npc.npcId][l1];
            if(k2 >= 0) {
                int i3 = 0;
                int j3 = 0;
                int k3 = j1;
                if(flag && i1 >= 1 && i1 <= 3 && Data.animationHasF[k2] == 1)
                    k3 += 15;
                if(i1 != 5 || Data.animationHasA[k2] == 1) {
                    int l3 = k3 + Data.animationNumber[k2];
                    i3 = (i3 * width) / ((GameImage) (gameGraphics)).pictureAssumedWidth[l3];
                    j3 = (j3 * height) / ((GameImage) (gameGraphics)).pictureAssumedHeight[l3];
                    int i4 = (width * ((GameImage) (gameGraphics)).pictureAssumedWidth[l3]) / ((GameImage) (gameGraphics)).pictureAssumedWidth[Data.animationNumber[k2]];
                    i3 -= (i4 - width) / 2;
                    int j4 = Data.animationCharacterColor[k2];
                    int k4 = 0;
                    if(j4 == 1) {
                        j4 = Data.npcHairColor[npc.npcId];
                        k4 = Data.npcSkinColor[npc.npcId];
                    } else
                    if(j4 == 2) {
                        j4 = Data.npcTopColor[npc.npcId];
                        k4 = Data.npcSkinColor[npc.npcId];
                    } else
                    if(j4 == 3) {
                        j4 = Data.npcBottomColor[npc.npcId];
                        k4 = Data.npcSkinColor[npc.npcId];
                    }
                    gameGraphics.drawImage(x + i3, y + j3, i4, height, l3, j4, k4, unknown1, flag);
                }
            }
        }

        if(npc.lastMessageTimeout > 0) {
            receivedMessageMidPoint[receivedMessagesCount] = gameGraphics.textWidth(npc.lastMessage, 1) / 2;
            if(receivedMessageMidPoint[receivedMessagesCount] > 150)
                receivedMessageMidPoint[receivedMessagesCount] = 150;
            receivedMessageHeight[receivedMessagesCount] = (gameGraphics.textWidth(npc.lastMessage, 1) / 300) * gameGraphics.textHeightNumber(1);
            receivedMessageX[receivedMessagesCount] = x + width / 2;
            receivedMessageY[receivedMessagesCount] = y;
            receivedMessages[receivedMessagesCount++] = npc.lastMessage;
        }
        if(npc.currentSprite == 8 || npc.currentSprite == 9 || npc.combatTimer != 0) {
            if(npc.combatTimer > 0) {
                int i2 = x;
                if(npc.currentSprite == 8)
                    i2 -= (20 * unknown2) / 100;
                else
                if(npc.currentSprite == 9)
                    i2 += (20 * unknown2) / 100;
                int l2 = (npc.currentHits * 30) / npc.baseHits;
                healthBarX[healthBarVisibleCount] = i2 + width / 2;
                healthBarY[healthBarVisibleCount] = y;
                healthBarMissing[healthBarVisibleCount++] = l2;
            }
            if(npc.combatTimer > 150) {
                int j2 = x;
                if(npc.currentSprite == 8)
                    j2 -= (10 * unknown2) / 100;
                else
                if(npc.currentSprite == 9)
                    j2 += (10 * unknown2) / 100;
                gameGraphics.drawPicture((j2 + width / 2) - 12, (y + height / 2) - 12, baseInventoryPic + 12);
                gameGraphics.drawText(String.valueOf(npc.lastDamageCount), (j2 + width / 2) - 1, y + height / 2 + 5, 3, 0xffffff);
            }
        }
    }

    protected final void displayMessage(String s1) {
        if(s1.startsWith("@bor@")) {
            displayMessage(s1, 4);
            return;
        }
        if(s1.startsWith("@que@")) {
            displayMessage("@whi@" + s1, 5);
            return;
        }
        if(s1.startsWith("@pri@")) {
            displayMessage(s1, 6);
            return;
        } else {
            displayMessage(s1, 3);
            return;
        }
    }

    private final void drawAboveHeadThings() {
        for(int l = 0; l < receivedMessagesCount; l++) {
            int height = gameGraphics.textHeightNumber(1);
            int x = receivedMessageX[l];
            int y = receivedMessageY[l];
            int midpoint = receivedMessageMidPoint[l];
            int l3 = receivedMessageHeight[l];
            boolean flag = true;
            while(flag)  {
                flag = false;
                for(int l4 = 0; l4 < l; l4++)
                    if(y + l3 > receivedMessageY[l4] - height && y - height < receivedMessageY[l4] + receivedMessageHeight[l4] && x - midpoint < receivedMessageX[l4] + receivedMessageMidPoint[l4] && x + midpoint > receivedMessageX[l4] - receivedMessageMidPoint[l4] && receivedMessageY[l4] - height - l3 < y) {
                        y = receivedMessageY[l4] - height - l3;
                        flag = true;
                    }

            }
            receivedMessageY[l] = y;
            gameGraphics.drawFloatingText(receivedMessages[l], x, y, 1, 0xffff00, 300);
        }

        for(int j1 = 0; j1 < itemsAboveHeadCount; j1++) {
            int x = itemAboveHeadX[j1];
            int y = itemAboveHeadY[j1];
            int scale = itemAboveHeadScale[j1];
            int id = itemAboveHeadID[j1];
            int width = (39 * scale) / 100;
            int height = (27 * scale) / 100;
            int j5 = y - height;
            gameGraphics.drawTransparentImage(x - width / 2, j5, width, height, baseInventoryPic + 9, 85);
            int k5 = (36 * scale) / 100;
            int l5 = (24 * scale) / 100;
            gameGraphics.drawImage(x - k5 / 2, (j5 + height / 2) - l5 / 2, k5, l5, Data.itemInventoryPicture[id] + baseItemPicture, Data.itemPictureMask[id], 0, 0, false);
        }

        for(int i2 = 0; i2 < healthBarVisibleCount; i2++) {
            int x = healthBarX[i2];
            int y = healthBarY[i2];
            int missing = healthBarMissing[i2];
            gameGraphics.drawBoxAlpha(x - 15, y - 3, missing, 5, 65280, 192);
            gameGraphics.drawBoxAlpha((x - 15) + missing, y - 3, 30 - missing, 5, 0xff0000, 192);
        }

    }

    protected final void cantLogout() {
        logoutTimer = 0;
        displayMessage("@cya@Sorry, you can't logout at the moment", 3);
    }

    private final void drawBankBox() {
        char c1 = '\u0198';
        char c2 = '\u014E';
        if(bankPage > 0 && bankItemsCount <= 48)
            bankPage = 0;
        if(bankPage > 1 && bankItemsCount <= 96)
            bankPage = 1;
        if(bankPage > 2 && bankItemsCount <= 144)
            bankPage = 2;
        if(selectedBankItem >= bankItemsCount || selectedBankItem < 0)
            selectedBankItem = -1;
        if(selectedBankItem != -1 && bankItems[selectedBankItem] != selectedBankItemType) {
            selectedBankItem = -1;
            selectedBankItemType = -2;
        }
        if(mouseButtonClick != 0) {
            mouseButtonClick = 0;
            int l = super.mouseX - (256 - c1 / 2);
            int j1 = super.mouseY - (170 - c2 / 2);
            if(l >= 0 && j1 >= 12 && l < 408 && j1 < 280) {
                int l1 = bankPage * 48;
                for(int k2 = 0; k2 < 6; k2++) {
                    for(int i3 = 0; i3 < 8; i3++) {
                        int k7 = 7 + i3 * 49;
                        int i8 = 28 + k2 * 34;
                        if(l > k7 && l < k7 + 49 && j1 > i8 && j1 < i8 + 34 && l1 < bankItemsCount && bankItems[l1] != -1) {
                            selectedBankItemType = bankItems[l1];
                            selectedBankItem = l1;
                        }
                        l1++;
                    }

                }

                l = 256 - c1 / 2;
                j1 = 170 - c2 / 2;
                int id;
                if(selectedBankItem < 0)
                    id = -1;
                else
                    id = bankItems[selectedBankItem];
                if(id != -1) {
                    int count = bankItemCount[selectedBankItem];
                    if(Data.itemStackable[id] == 1 && count > 1)
                        count = 1;
                    if(count >= 1 && super.mouseX >= l + 220 && super.mouseY >= j1 + 238 && super.mouseX < l + 250 && super.mouseY <= j1 + 249) {
                        super.streamClass.createPacket(183);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(1);
                        super.streamClass.formatPacket();
                    }
                    if(count >= 5 && super.mouseX >= l + 250 && super.mouseY >= j1 + 238 && super.mouseX < l + 280 && super.mouseY <= j1 + 249) {
                        super.streamClass.createPacket(183);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(5);
                        super.streamClass.formatPacket();
                    }
                    if(count >= 25 && super.mouseX >= l + 280 && super.mouseY >= j1 + 238 && super.mouseX < l + 305 && super.mouseY <= j1 + 249) {
                        super.streamClass.createPacket(183);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(25);
                        super.streamClass.formatPacket();
                    }
                    if(count >= 100 && super.mouseX >= l + 305 && super.mouseY >= j1 + 238 && super.mouseX < l + 335 && super.mouseY <= j1 + 249) {
                        super.streamClass.createPacket(183);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(100);
                        super.streamClass.formatPacket();
                    }
                    if(count >= 500 && super.mouseX >= l + 335 && super.mouseY >= j1 + 238 && super.mouseX < l + 368 && super.mouseY <= j1 + 249) {
                        super.streamClass.createPacket(183);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(500);
                        super.streamClass.formatPacket();
                    }
                    if(count >= 2500 && super.mouseX >= l + 370 && super.mouseY >= j1 + 238 && super.mouseX < l + 400 && super.mouseY <= j1 + 249) {
                        super.streamClass.createPacket(183);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(2500);
                        super.streamClass.formatPacket();
                    }
                    if(getInventoryItemTotalCount(id) >= 1 && super.mouseX >= l + 220 && super.mouseY >= j1 + 263 && super.mouseX < l + 250 && super.mouseY <= j1 + 274) {
                        super.streamClass.createPacket(198);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(1);
                        super.streamClass.formatPacket();
                    }
                    if(getInventoryItemTotalCount(id) >= 5 && super.mouseX >= l + 250 && super.mouseY >= j1 + 263 && super.mouseX < l + 280 && super.mouseY <= j1 + 274) {
                        super.streamClass.createPacket(198);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(5);
                        super.streamClass.formatPacket();
                    }
                    if(getInventoryItemTotalCount(id) >= 25 && super.mouseX >= l + 280 && super.mouseY >= j1 + 263 && super.mouseX < l + 305 && super.mouseY <= j1 + 274) {
                        super.streamClass.createPacket(198);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(25);
                        super.streamClass.formatPacket();
                    }
                    if(getInventoryItemTotalCount(id) >= 100 && super.mouseX >= l + 305 && super.mouseY >= j1 + 263 && super.mouseX < l + 335 && super.mouseY <= j1 + 274) {
                        super.streamClass.createPacket(198);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(100);
                        super.streamClass.formatPacket();
                    }
                    if(getInventoryItemTotalCount(id) >= 500 && super.mouseX >= l + 335 && super.mouseY >= j1 + 263 && super.mouseX < l + 368 && super.mouseY <= j1 + 274) {
                        super.streamClass.createPacket(198);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(500);
                        super.streamClass.formatPacket();
                    }
                    if(getInventoryItemTotalCount(id) >= 2500 && super.mouseX >= l + 370 && super.mouseY >= j1 + 263 && super.mouseX < l + 400 && super.mouseY <= j1 + 274) {
                        super.streamClass.createPacket(198);
                        super.streamClass.addShort(id);
                        super.streamClass.addInt(2500);
                        super.streamClass.formatPacket();
                    }
                }
            } else
            if(bankItemsCount > 48 && l >= 50 && l <= 115 && j1 <= 12)
                bankPage = 0;
            else
            if(bankItemsCount > 48 && l >= 115 && l <= 180 && j1 <= 12)
                bankPage = 1;
            else
            if(bankItemsCount > 96 && l >= 180 && l <= 245 && j1 <= 12)
                bankPage = 2;
            else
            if(bankItemsCount > 144 && l >= 245 && l <= 310 && j1 <= 12) {
                bankPage = 3;
            } else {
                super.streamClass.createPacket(48);
                super.streamClass.formatPacket();
                showBankBox = false;
                return;
            }
        }
        int i1 = 256 - c1 / 2;
        int k1 = 170 - c2 / 2;
        gameGraphics.drawBox(i1, k1, 408, 12, 192);
        int j2 = 0x989898;
        gameGraphics.drawBoxAlpha(i1, k1 + 12, 408, 17, j2, 160);
        gameGraphics.drawBoxAlpha(i1, k1 + 29, 8, 204, j2, 160);
        gameGraphics.drawBoxAlpha(i1 + 399, k1 + 29, 9, 204, j2, 160);
        gameGraphics.drawBoxAlpha(i1, k1 + 233, 408, 47, j2, 160);
        gameGraphics.drawString("Bank", i1 + 1, k1 + 10, 1, 0xffffff);
        int l2 = 50;
        if(bankItemsCount > 48) {
            int k3 = 0xffffff;
            if(bankPage == 0)
                k3 = 0xff0000;
            else
            if(super.mouseX > i1 + l2 && super.mouseY >= k1 && super.mouseX < i1 + l2 + 65 && super.mouseY < k1 + 12)
                k3 = 0xffff00;
            gameGraphics.drawString("<page 1>", i1 + l2, k1 + 10, 1, k3);
            l2 += 65;
            k3 = 0xffffff;
            if(bankPage == 1)
                k3 = 0xff0000;
            else
            if(super.mouseX > i1 + l2 && super.mouseY >= k1 && super.mouseX < i1 + l2 + 65 && super.mouseY < k1 + 12)
                k3 = 0xffff00;
            gameGraphics.drawString("<page 2>", i1 + l2, k1 + 10, 1, k3);
            l2 += 65;
        }
        if(bankItemsCount > 96) {
            int l3 = 0xffffff;
            if(bankPage == 2)
                l3 = 0xff0000;
            else
            if(super.mouseX > i1 + l2 && super.mouseY >= k1 && super.mouseX < i1 + l2 + 65 && super.mouseY < k1 + 12)
                l3 = 0xffff00;
            gameGraphics.drawString("<page 3>", i1 + l2, k1 + 10, 1, l3);
            l2 += 65;
        }
        if(bankItemsCount > 144) {
            int i4 = 0xffffff;
            if(bankPage == 3)
                i4 = 0xff0000;
            else
            if(super.mouseX > i1 + l2 && super.mouseY >= k1 && super.mouseX < i1 + l2 + 65 && super.mouseY < k1 + 12)
                i4 = 0xffff00;
            gameGraphics.drawString("<page 4>", i1 + l2, k1 + 10, 1, i4);
            l2 += 65;
        }
        int j4 = 0xffffff;
        if(super.mouseX > i1 + 320 && super.mouseY >= k1 && super.mouseX < i1 + 408 && super.mouseY < k1 + 12)
            j4 = 0xff0000;
        gameGraphics.cdk("Close window", i1 + 406, k1 + 10, 1, j4);
        gameGraphics.drawString("Number in bank in green", i1 + 7, k1 + 24, 1, 65280);
        gameGraphics.drawString("Number held in blue", i1 + 289, k1 + 24, 1, 65535);
        int l7 = 0xd0d0d0;
        int j8 = bankPage * 48;
        for(int l8 = 0; l8 < 6; l8++) {
            for(int i9 = 0; i9 < 8; i9++) {
                int k9 = i1 + 7 + i9 * 49;
                int l9 = k1 + 28 + l8 * 34;
                if(selectedBankItem == j8)
                    gameGraphics.drawBoxAlpha(k9, l9, 49, 34, 0xff0000, 160);
                else
                    gameGraphics.drawBoxAlpha(k9, l9, 49, 34, l7, 160);
                gameGraphics.drawBoxEdge(k9, l9, 50, 35, 0);
                if(j8 < bankItemsCount && bankItems[j8] != -1) {
                    gameGraphics.drawImage(k9, l9, 48, 32, baseItemPicture + Data.itemInventoryPicture[bankItems[j8]], Data.itemPictureMask[bankItems[j8]], 0, 0, false);
                    gameGraphics.drawString(String.valueOf(bankItemCount[j8]), k9 + 1, l9 + 10, 1, 65280);
                    gameGraphics.cdk(String.valueOf(getInventoryItemTotalCount(bankItems[j8])), k9 + 47, l9 + 29, 1, 65535);
                }
                j8++;
            }

        }

        gameGraphics.drawLineX(i1 + 5, k1 + 256, 398, 0);
        if(selectedBankItem == -1) {
            gameGraphics.drawText("Select an object to withdraw or deposit", i1 + 204, k1 + 248, 3, 0xffff00);
            return;
        }
        int j9;
        if(selectedBankItem < 0)
            j9 = -1;
        else
            j9 = bankItems[selectedBankItem];
        if(j9 != -1) {
            int k8 = bankItemCount[selectedBankItem];
            if(Data.itemStackable[j9] == 1 && k8 > 1)
                k8 = 1;
            if(k8 > 0) {
                gameGraphics.drawString("Withdraw " + Data.itemName[j9], i1 + 2, k1 + 248, 1, 0xffffff);
                int k4 = 0xffffff;
                if(super.mouseX >= i1 + 220 && super.mouseY >= k1 + 238 && super.mouseX < i1 + 250 && super.mouseY <= k1 + 249)
                    k4 = 0xff0000;
                gameGraphics.drawString("One", i1 + 222, k1 + 248, 1, k4);
                if(k8 >= 5) {
                    int l4 = 0xffffff;
                    if(super.mouseX >= i1 + 250 && super.mouseY >= k1 + 238 && super.mouseX < i1 + 280 && super.mouseY <= k1 + 249)
                        l4 = 0xff0000;
                    gameGraphics.drawString("Five", i1 + 252, k1 + 248, 1, l4);
                }
                if(k8 >= 25) {
                    int i5 = 0xffffff;
                    if(super.mouseX >= i1 + 280 && super.mouseY >= k1 + 238 && super.mouseX < i1 + 305 && super.mouseY <= k1 + 249)
                        i5 = 0xff0000;
                    gameGraphics.drawString("25", i1 + 282, k1 + 248, 1, i5);
                }
                if(k8 >= 100) {
                    int j5 = 0xffffff;
                    if(super.mouseX >= i1 + 305 && super.mouseY >= k1 + 238 && super.mouseX < i1 + 335 && super.mouseY <= k1 + 249)
                        j5 = 0xff0000;
                    gameGraphics.drawString("100", i1 + 307, k1 + 248, 1, j5);
                }
                if(k8 >= 500) {
                    int k5 = 0xffffff;
                    if(super.mouseX >= i1 + 335 && super.mouseY >= k1 + 238 && super.mouseX < i1 + 368 && super.mouseY <= k1 + 249)
                        k5 = 0xff0000;
                    gameGraphics.drawString("500", i1 + 337, k1 + 248, 1, k5);
                }
                if(k8 >= 2500) {
                    int l5 = 0xffffff;
                    if(super.mouseX >= i1 + 370 && super.mouseY >= k1 + 238 && super.mouseX < i1 + 400 && super.mouseY <= k1 + 249)
                        l5 = 0xff0000;
                    gameGraphics.drawString("2500", i1 + 370, k1 + 248, 1, l5);
                }
            }
            if(getInventoryItemTotalCount(j9) > 0) {
                gameGraphics.drawString("Deposit " + Data.itemName[j9], i1 + 2, k1 + 273, 1, 0xffffff);
                int i6 = 0xffffff;
                if(super.mouseX >= i1 + 220 && super.mouseY >= k1 + 263 && super.mouseX < i1 + 250 && super.mouseY <= k1 + 274)
                    i6 = 0xff0000;
                gameGraphics.drawString("One", i1 + 222, k1 + 273, 1, i6);
                if(getInventoryItemTotalCount(j9) >= 5) {
                    int j6 = 0xffffff;
                    if(super.mouseX >= i1 + 250 && super.mouseY >= k1 + 263 && super.mouseX < i1 + 280 && super.mouseY <= k1 + 274)
                        j6 = 0xff0000;
                    gameGraphics.drawString("Five", i1 + 252, k1 + 273, 1, j6);
                }
                if(getInventoryItemTotalCount(j9) >= 25) {
                    int k6 = 0xffffff;
                    if(super.mouseX >= i1 + 280 && super.mouseY >= k1 + 263 && super.mouseX < i1 + 305 && super.mouseY <= k1 + 274)
                        k6 = 0xff0000;
                    gameGraphics.drawString("25", i1 + 282, k1 + 273, 1, k6);
                }
                if(getInventoryItemTotalCount(j9) >= 100) {
                    int l6 = 0xffffff;
                    if(super.mouseX >= i1 + 305 && super.mouseY >= k1 + 263 && super.mouseX < i1 + 335 && super.mouseY <= k1 + 274)
                        l6 = 0xff0000;
                    gameGraphics.drawString("100", i1 + 307, k1 + 273, 1, l6);
                }
                if(getInventoryItemTotalCount(j9) >= 500) {
                    int i7 = 0xffffff;
                    if(super.mouseX >= i1 + 335 && super.mouseY >= k1 + 263 && super.mouseX < i1 + 368 && super.mouseY <= k1 + 274)
                        i7 = 0xff0000;
                    gameGraphics.drawString("500", i1 + 337, k1 + 273, 1, i7);
                }
                if(getInventoryItemTotalCount(j9) >= 2500) {
                    int j7 = 0xffffff;
                    if(super.mouseX >= i1 + 370 && super.mouseY >= k1 + 263 && super.mouseX < i1 + 400 && super.mouseY <= k1 + 274)
                        j7 = 0xff0000;
                    gameGraphics.drawString("2500", i1 + 370, k1 + 273, 1, j7);
                }
            }
        }
    }

    public final Graphics getGraphics() {
        if(GameApplet.gameFrame != null)
            return GameApplet.gameFrame.getGraphics();
        if(link.gameApplet != null)
            return link.gameApplet.getGraphics();
        else
            return super.getGraphics();
    }

    private final boolean loadSection(int x, int y) {
        if(playerAliveTimeout != 0) {
            engineHandle.playerIsAlive = false;
            return false;
        }
        loadArea = false;
        x += wildX;
        y += wildY;
        if(lastLayerIndex == layerIndex && x > sectionLowerX && x < sectionUpperX && y > sectionLowerY && y < sectionUpperY) {
            engineHandle.playerIsAlive = true;
            return false;
        }
        gameGraphics.drawText("Loading... Please wait", 256, 192, 1, 0xffffff);
        drawChatMessageTabs();
        gameGraphics.drawImage(graphics, 0, 0);
        int l = areaX;
        int i1 = areaY;
        int xBase = (x + 24) / 48;
        int yBase = (y + 24) / 48;
        lastLayerIndex = layerIndex;
        areaX = xBase * 48 - 48;
        areaY = yBase * 48 - 48;
        sectionLowerX = xBase * 48 - 32;
        sectionLowerY = yBase * 48 - 32;
        sectionUpperX = xBase * 48 + 32;
        sectionUpperY = yBase * 48 + 32;
        engineHandle.loadSection(x, y, lastLayerIndex);
        areaX -= wildX;
        areaY -= wildY;
        int offsetX = areaX - l;
        int offsetY = areaY - i1;
        for(int j2 = 0; j2 < objectCount; j2++) {
            objectX[j2] -= offsetX;
            objectY[j2] -= offsetY;
            int k2 = objectX[j2];
            int i3 = objectY[j2];
            int l3 = objectType[j2];
            GameObject object = objectArray[j2];
            try {
                int j5 = objectRotation[j2];
                int i6;
                int l6;
                if(j5 == 0 || j5 == 4) {
                    i6 = Data.objectWidth[l3];
                    l6 = Data.objectHeight[l3];
                } else {
                    l6 = Data.objectWidth[l3];
                    i6 = Data.objectHeight[l3];
                }
                int i7 = ((k2 + k2 + i6) * magicLoc) / 2;
                int j7 = ((i3 + i3 + l6) * magicLoc) / 2;
                if(k2 >= 0 && i3 >= 0 && k2 < 96 && i3 < 96) {
                    gameCamera.addModel(object);
                    object.cml(i7, -engineHandle.getAveragedElevation(i7, j7), j7);
                    engineHandle.gla(k2, i3, l3, j5);
                    if(l3 == 74)
                        object.cmk(0, -480, 0);
                }
            }
            catch(RuntimeException runtimeexception) {
                System.out.println("Loc Error: " + runtimeexception.getMessage());
                System.out.println("i:" + j2 + " obj:" + object);
                runtimeexception.printStackTrace();
            }
        }

        for(int l2 = 0; l2 < wallObjectCount; l2++) {
            wallObjectX[l2] -= offsetX;
            wallObjectY[l2] -= offsetY;
            int j3 = wallObjectX[l2];
            int i4 = wallObjectY[l2];
            int l4 = wallObjectID[l2];
            int k5 = wallObjectDirection[l2];
            try {
                engineHandle.gkc(j3, i4, k5, l4);
                GameObject j6 = makeWallObject(j3, i4, k5, l4, l2);
                wallObjectArray[l2] = j6;
            }
            catch(RuntimeException runtimeexception1) {
                System.out.println("Bound Error: " + runtimeexception1.getMessage());
                runtimeexception1.printStackTrace();
            }
        }

        for(int k3 = 0; k3 < groundItemCount; k3++) {
            groundItemX[k3] -= offsetX;
            groundItemY[k3] -= offsetY;
        }

        for(int j4 = 0; j4 < playerCount; j4++) {
            Mob f1 = playerArray[j4];
            f1.currentX -= offsetX * magicLoc;
            f1.currentY -= offsetY * magicLoc;
            for(int l5 = 0; l5 <= f1.waypointCurrent; l5++) {
                f1.waypointsX[l5] -= offsetX * magicLoc;
                f1.waypointsY[l5] -= offsetY * magicLoc;
            }

        }

        for(int i5 = 0; i5 < npcCount; i5++) {
            Mob f2 = npcArray[i5];
            f2.currentX -= offsetX * magicLoc;
            f2.currentY -= offsetY * magicLoc;
            for(int k6 = 0; k6 <= f2.waypointCurrent; k6++) {
                f2.waypointsX[k6] -= offsetX * magicLoc;
                f2.waypointsY[k6] -= offsetY * magicLoc;
            }

        }

        engineHandle.playerIsAlive = true;
        return true;
    }

    private static final String formatItemCount(int arg0) {
        String s1 = String.valueOf(arg0);
        for(int l = s1.length() - 3; l > 0; l -= 3)
            s1 = s1.substring(0, l) + "," + s1.substring(l);

        if(s1.length() > 8)
            s1 = "@gre@" + s1.substring(0, s1.length() - 8) + " million @whi@(" + s1 + ")";
        else
        if(s1.length() > 4)
            s1 = "@cya@" + s1.substring(0, s1.length() - 4) + "K @whi@(" + s1 + ")";
        return s1;
    }

    private final boolean hasRequiredRunes(int l, int i1) {
        if(l == 31 && (isItemEquipped(197) || isItemEquipped(615) || isItemEquipped(682)))
            return true;
        if(l == 32 && (isItemEquipped(102) || isItemEquipped(616) || isItemEquipped(683)))
            return true;
        if(l == 33 && (isItemEquipped(101) || isItemEquipped(617) || isItemEquipped(684)))
            return true;
        if(l == 34 && (isItemEquipped(103) || isItemEquipped(618) || isItemEquipped(685)))
            return true;
        return getInventoryItemTotalCount(l) >= i1;
    }

    private final void displayMessage(String message, int type) {
        if(type == 2 || type == 4 || type == 6) {
            for(; message.length() > 5 && message.charAt(0) == '@' && message.charAt(4) == '@'; message = message.substring(5));
            int l = message.indexOf(":");
            if(l != -1) {
                String s1 = message.substring(0, l);
                long l1 = DataOperations.nameToHash(s1);
                for(int j1 = 0; j1 < super.ignoresCount; j1++)
                    if(super.ignoresList[j1] == l1)
                        return;

            }
        }
        if(type == 2)
            message = "@yel@" + message;
        if(type == 3 || type == 4)
            message = "@whi@" + message;
        if(type == 6)
            message = "@cya@" + message;
        if(messagesTab != 0) {
            if(type == 4 || type == 3)
                chatTabAllMsgFlash = 200;
            if(type == 2 && messagesTab != 1)
                chatTabHistoryFlash = 200;
            if(type == 5 && messagesTab != 2)
                chatTabQuestFlash = 200;
            if(type == 6 && messagesTab != 3)
                chatTabPrivateFlash = 200;
            if(type == 3 && messagesTab != 0)
                messagesTab = 0;
            if(type == 6 && messagesTab != 3 && messagesTab != 0)
                messagesTab = 0;
        }
        for(int i1 = 4; i1 > 0; i1--) {
            messagesArray[i1] = messagesArray[i1 - 1];
            messagesTimeout[i1] = messagesTimeout[i1 - 1];
        }

        messagesArray[0] = message;
        messagesTimeout[0] = 300;
        if(type == 2)
            if(chatInputMenu.listShownEntries[messagesHandleType2] == chatInputMenu.listLength[messagesHandleType2] - 4)
                chatInputMenu.addMessage(messagesHandleType2, message, true);
            else
                chatInputMenu.addMessage(messagesHandleType2, message, false);
        if(type == 5)
            if(chatInputMenu.listShownEntries[messagesHandleType5] == chatInputMenu.listLength[messagesHandleType5] - 4)
                chatInputMenu.addMessage(messagesHandleType5, message, true);
            else
                chatInputMenu.addMessage(messagesHandleType5, message, false);
        if(type == 6) {
            if(chatInputMenu.listShownEntries[messagesHandleType6] == chatInputMenu.listLength[messagesHandleType6] - 4) {
                chatInputMenu.addMessage(messagesHandleType6, message, true);
                return;
            }
            chatInputMenu.addMessage(messagesHandleType6, message, false);
        }
    }

    private final void drawMinimapObject(int l, int i1, int j1) {
        gameGraphics.drawMinimapPixel(l, i1, j1);
        gameGraphics.drawMinimapPixel(l - 1, i1, j1);
        gameGraphics.drawMinimapPixel(l + 1, i1, j1);
        gameGraphics.drawMinimapPixel(l, i1 - 1, j1);
        gameGraphics.drawMinimapPixel(l, i1 + 1, j1);
    }

    private final void drawServerMessageBox() {
        char c1 = '\u0190';
        char c2 = 'd';
        if(serverMessageBoxTop) {
            c2 = '\u01C2';
            c2 = '\u012C';
        }
        gameGraphics.drawBox(256 - c1 / 2, 167 - c2 / 2, c1, c2, 0);
        gameGraphics.drawBoxEdge(256 - c1 / 2, 167 - c2 / 2, c1, c2, 0xffffff);
        gameGraphics.drawFloatingText(serverMessage, 256, (167 - c2 / 2) + 20, 1, 0xffffff, c1 - 40);
        int l = 157 + c2 / 2;
        int i1 = 0xffffff;
        if(super.mouseY > l - 12 && super.mouseY <= l && super.mouseX > 106 && super.mouseX < 406)
            i1 = 0xff0000;
        gameGraphics.drawText("Click here to close window", 256, l, 1, i1);
        if(mouseButtonClick == 1) {
            if(i1 == 0xff0000)
                showServerMessageBox = false;
            if((super.mouseX < 256 - c1 / 2 || super.mouseX > 256 + c1 / 2) && (super.mouseY < 167 - c2 / 2 || super.mouseY > 167 + c2 / 2))
                showServerMessageBox = false;
        }
        mouseButtonClick = 0;
    }

    public final Image createImage(int l, int i1) {
        if(GameApplet.gameFrame != null)
            return GameApplet.gameFrame.createImage(l, i1);
        if(link.gameApplet != null)
            return link.gameApplet.createImage(l, i1);
        else
            return super.createImage(l, i1);
    }

    private final GameObject makeWallObject(int x, int y, int dir, int type, int totalCount) {
        int i2 = x;
        int j2 = y;
        int k2 = x;
        int l2 = y;
        int i3 = Data.wallObjectModelVar2[type];
        int j3 = Data.wallObjectModelVar3[type];
        int k3 = Data.wallObjectModelVar1[type];
        GameObject l3 = new GameObject(4, 1);
        if(dir == 0)
            k2 = x + 1;
        if(dir == 1)
            l2 = y + 1;
        if(dir == 2) {
            i2 = x + 1;
            l2 = y + 1;
        }
        if(dir == 3) {
            k2 = x + 1;
            l2 = y + 1;
        }
        i2 *= magicLoc;
        j2 *= magicLoc;
        k2 *= magicLoc;
        l2 *= magicLoc;
        int i4 = l3.cln(i2, -engineHandle.getAveragedElevation(i2, j2), j2);
        int j4 = l3.cln(i2, -engineHandle.getAveragedElevation(i2, j2) - k3, j2);
        int k4 = l3.cln(k2, -engineHandle.getAveragedElevation(k2, l2) - k3, l2);
        int l4 = l3.cln(k2, -engineHandle.getAveragedElevation(k2, l2), l2);
        int ai[] = {
            i4, j4, k4, l4
        };
        l3.cmb(4, ai, i3, j3);
        l3.cme(false, 60, 24, -50, -10, -50);
        if(x >= 0 && y >= 0 && x < 96 && y < 96)
            gameCamera.addModel(l3);
        l3.index = totalCount + 10000;
        return l3;
    }

    private final void resetPrivateMessages() {
        super.pmText = "";
        super.enteredPMText = "";
    }

    private final Mob makeNPC(int index, int x, int y, int sprite, int id) {
        if(npcAttackingArray[index] == null) {
            npcAttackingArray[index] = new Mob();
            npcAttackingArray[index].serverIndex = index;
        }
        Mob f1 = npcAttackingArray[index];
        boolean flag = false;
        for(int l = 0; l < lastNpcCount; l++) {
            if(lastNpcArray[l].serverIndex != index)
                continue;
            flag = true;
            break;
        }

        if(flag) {
            f1.npcId = id;
            f1.nextSprite = sprite;
            int i1 = f1.waypointCurrent;
            if(x != f1.waypointsX[i1] || y != f1.waypointsY[i1]) {
                f1.waypointCurrent = i1 = (i1 + 1) % 10;
                f1.waypointsX[i1] = x;
                f1.waypointsY[i1] = y;
            }
        } else {
            f1.serverIndex = index;
            f1.waypointsEndSprite = 0;
            f1.waypointCurrent = 0;
            f1.waypointsX[0] = f1.currentX = x;
            f1.waypointsY[0] = f1.currentY = y;
            f1.npcId = id;
            f1.nextSprite = f1.currentSprite = sprite;
            f1.stepCount = 0;
        }
        npcArray[npcCount++] = f1;
        return f1;
    }

    private final void updateBankItems() {
        bankItemsCount = serverBankItemsCount;
        for(int l = 0; l < serverBankItemsCount; l++) {
            bankItems[l] = serverBankItems[l];
            bankItemCount[l] = serverBankItemCount[l];
        }

        for(int i1 = 0; i1 < inventoryItemsCount; i1++) {
            if(bankItemsCount >= maxBankItems)
                break;
            int j1 = inventoryItems[i1];
            boolean flag = false;
            for(int k1 = 0; k1 < bankItemsCount; k1++) {
                if(bankItems[k1] != j1)
                    continue;
                flag = true;
                break;
            }

            if(!flag) {
                bankItems[bankItemsCount] = j1;
                bankItemCount[bankItemsCount] = 0;
                bankItemsCount++;
            }
        }

    }

    private final void drawStatsQuestsMenu(boolean canClick) {
        int l = ((GameImage) (gameGraphics)).gameWidth - 199;
        int i1 = 36;
        gameGraphics.drawPicture(l - 49, 3, baseInventoryPic + 3);
        char c1 = '\304';
        char c2 = '\u0113';
        int k1;
        int j1 = k1 = GameImage.rgbToInt(160, 160, 160);
        if(questMenuSelected == 0)
            j1 = GameImage.rgbToInt(220, 220, 220);
        else
            k1 = GameImage.rgbToInt(220, 220, 220);
        gameGraphics.drawBoxAlpha(l, i1, c1 / 2, 24, j1, 128);
        gameGraphics.drawBoxAlpha(l + c1 / 2, i1, c1 / 2, 24, k1, 128);
        gameGraphics.drawBoxAlpha(l, i1 + 24, c1, c2 - 24, GameImage.rgbToInt(220, 220, 220), 128);
        gameGraphics.drawLineX(l, i1 + 24, c1, 0);
        gameGraphics.drawLineY(l + c1 / 2, i1, 24, 0);
        gameGraphics.drawText("Stats", l + c1 / 4, i1 + 16, 4, 0);
        gameGraphics.drawText("Quests", l + c1 / 4 + c1 / 2, i1 + 16, 4, 0);
        if(questMenuSelected == 0) {
            int l1 = 72;
            int j2 = -1;
            gameGraphics.drawString("Skills", l + 5, l1, 3, 0xffff00);
            l1 += 13;
            for(int k2 = 0; k2 < 9; k2++) {
                int l2 = 0xffffff;
                if(super.mouseX > l + 3 && super.mouseY >= l1 - 11 && super.mouseY < l1 + 2 && super.mouseX < l + 90) {
                    l2 = 0xff0000;
                    j2 = k2;
                }
                gameGraphics.drawString(skillName[k2] + ":@yel@" + playerStatCurrent[k2] + "/" + playerStatBase[k2], l + 5, l1, 1, l2);
                l2 = 0xffffff;
                if(super.mouseX >= l + 90 && super.mouseY >= l1 - 13 - 11 && super.mouseY < (l1 - 13) + 2 && super.mouseX < l + 196) {
                    l2 = 0xff0000;
                    j2 = k2 + 9;
                }
                gameGraphics.drawString(skillName[k2 + 9] + ":@yel@" + playerStatCurrent[k2 + 9] + "/" + playerStatBase[k2 + 9], (l + c1 / 2) - 5, l1 - 13, 1, l2);
                l1 += 13;
            }

            gameGraphics.drawString("Quest Points:@yel@" + questPoints, (l + c1 / 2) - 5, l1 - 13, 1, 0xffffff);
            l1 += 12;
            gameGraphics.drawString("Fatigue: @yel@" + (fatigue * 100) / 750 + "%", l + 5, l1 - 13, 1, 0xffffff);
            l1 += 8;
            gameGraphics.drawString("Equipment Status", l + 5, l1, 3, 0xffff00);
            l1 += 12;
            for(int i3 = 0; i3 < 3; i3++) {
                gameGraphics.drawString(gearStats[i3] + ":@yel@" + equipmentStatus[i3], l + 5, l1, 1, 0xffffff);
                if(i3 < 2)
                    gameGraphics.drawString(gearStats[i3 + 3] + ":@yel@" + equipmentStatus[i3 + 3], l + c1 / 2 + 25, l1, 1, 0xffffff);
                l1 += 13;
            }

            l1 += 6;
            gameGraphics.drawLineX(l, l1 - 15, c1, 0);
            if(j2 != -1) {
                gameGraphics.drawString(skillNameVerb[j2] + " skill", l + 5, l1, 1, 0xffff00);
                l1 += 12;
                int j3 = experienceList[0];
                for(int l3 = 0; l3 < 98; l3++)
                    if(playerStatExp[j2] >= experienceList[l3])
                        j3 = experienceList[l3 + 1];

                gameGraphics.drawString("Total xp: " + playerStatExp[j2], l + 5, l1, 1, 0xffffff);
                l1 += 12;
                gameGraphics.drawString("Next level at: " + j3 / 4, l + 5, l1, 1, 0xffffff);
            } else {
                gameGraphics.drawString("Overall levels", l + 5, l1, 1, 0xffff00);
                l1 += 12;
                int k3 = 0;
                for(int i4 = 0; i4 < 18; i4++)
                    k3 += playerStatBase[i4];

                gameGraphics.drawString("Skill total: " + k3, l + 5, l1, 1, 0xffffff);
                l1 += 12;
                gameGraphics.drawString("Combat level: " + ourPlayer.level, l + 5, l1, 1, 0xffffff);
                l1 += 12;
            }
        }
        if(questMenuSelected == 1) {
            questsLastShownEntries = questMenu.listShownEntries;
            questMenu.clearList(questMenuHandle);
            questMenu.addListItem(questMenuHandle, 0, "@whi@Quest-list (green=completed)");
            for(int i2 = 0; i2 < usedQuestName.length; i2++)
                questMenu.addListItem(questMenuHandle, i2 + 1, (questStage[i2] == 0 ? "@red@" : questStage[i2] == 1 ? "@yel@" : "@gre@") + usedQuestName[i2]);

            questMenu.listShownEntries = questsLastShownEntries;
            questMenu.drawMenu();
        }
        if(!canClick)
            return;
        l = super.mouseX - (((GameImage) (gameGraphics)).gameWidth - 199);
        i1 = super.mouseY - 36;
        if(l >= 0 && i1 >= 0 && l < c1 && i1 < c2) {
            if(questMenuSelected == 1)
                questMenu.mouseClick(l + (((GameImage) (gameGraphics)).gameWidth - 199), i1 + 36, super.lastMouseButton, super.mouseButton);
            if(i1 <= 24 && mouseButtonClick == 1) {
                if(l < 98) {
                    questMenuSelected = 0;
                    return;
                }
                if(l > 98)
                    questMenuSelected = 1;
            }
        }
    }

    private final void drawFriendsBox() {
        if(mouseButtonClick != 0) {
            mouseButtonClick = 0;
            if(showFriendsBox == 1 && (super.mouseX < 106 || super.mouseY < 145 || super.mouseX > 406 || super.mouseY > 215)) {
                showFriendsBox = 0;
                return;
            }
            if(showFriendsBox == 2 && (super.mouseX < 6 || super.mouseY < 145 || super.mouseX > 506 || super.mouseY > 215)) {
                showFriendsBox = 0;
                return;
            }
            if(showFriendsBox == 3 && (super.mouseX < 106 || super.mouseY < 145 || super.mouseX > 406 || super.mouseY > 215)) {
                showFriendsBox = 0;
                return;
            }
            if(super.mouseX > 236 && super.mouseX < 276 && super.mouseY > 193 && super.mouseY < 213) {
                showFriendsBox = 0;
                return;
            }
        }
        int l = 145;
        if(showFriendsBox == 1) {
            gameGraphics.drawBox(106, l, 300, 70, 0);
            gameGraphics.drawBoxEdge(106, l, 300, 70, 0xffffff);
            l += 20;
            gameGraphics.drawText("Enter name to add to friends list", 256, l, 4, 0xffffff);
            l += 20;
            gameGraphics.drawText(super.inputText + "*", 256, l, 4, 0xffffff);
            if(super.enteredInputText.length() > 0) {
                String s1 = super.enteredInputText.trim();
                super.inputText = "";
                super.enteredInputText = "";
                showFriendsBox = 0;
                if(s1.length() > 0 && DataOperations.nameToHash(s1) != ourPlayer.nameHash)
                    addFriend(s1);
            }
        }
        if(showFriendsBox == 2) {
            gameGraphics.drawBox(6, l, 500, 70, 0);
            gameGraphics.drawBoxEdge(6, l, 500, 70, 0xffffff);
            l += 20;
            gameGraphics.drawText("Enter message to send to " + DataOperations.hashToName(pmTarget), 256, l, 4, 0xffffff);
            l += 20;
            gameGraphics.drawText(super.pmText + "*", 256, l, 4, 0xffffff);
            if(super.enteredPMText.length() > 0) {
                String s2 = super.enteredPMText;
                super.pmText = "";
                super.enteredPMText = "";
                showFriendsBox = 0;
                int j1 = ChatMessage.stringToBytes(s2);
                sendPrivateMessage(pmTarget, ChatMessage.lastChat, j1);
                s2 = ChatMessage.bytesToString(ChatMessage.lastChat, 0, j1);
                if(useChatFilter)
                    s2 = ChatFilter.filterChat(s2);
                displayMessage("@pri@You tell " + DataOperations.hashToName(pmTarget) + ": " + s2);
            }
        }
        if(showFriendsBox == 3) {
            gameGraphics.drawBox(106, l, 300, 70, 0);
            gameGraphics.drawBoxEdge(106, l, 300, 70, 0xffffff);
            l += 20;
            gameGraphics.drawText("Enter name to add to ignore list", 256, l, 4, 0xffffff);
            l += 20;
            gameGraphics.drawText(super.inputText + "*", 256, l, 4, 0xffffff);
            if(super.enteredInputText.length() > 0) {
                String s3 = super.enteredInputText.trim();
                super.inputText = "";
                super.enteredInputText = "";
                showFriendsBox = 0;
                if(s3.length() > 0 && DataOperations.nameToHash(s3) != ourPlayer.nameHash)
                    addIgnore(s3);
            }
        }
        int i1 = 0xffffff;
        if(super.mouseX > 236 && super.mouseX < 276 && super.mouseY > 193 && super.mouseY < 213)
            i1 = 0xffff00;
        gameGraphics.drawText("Cancel", 256, 208, 1, i1);
    }

    private final void playSound(String s1) {
        if(audioPlayer == null || !Config.MEMBERS_FEATURES)
            return;
        if(!configSoundOff)
            audioPlayer.play(soundData, DataOperations.getSoundOffset(s1 + ".pcm", soundData), DataOperations.getSoundLength(s1 + ".pcm", soundData));
    }

    private final void drawRightClickMenu() {
        if(mouseButtonClick != 0) {
            for(int l = 0; l < menuOptionsCount; l++) {
                int j1 = menuX + 2;
                int l1 = menuY + 27 + l * 15;
                if(super.mouseX <= j1 - 2 || super.mouseY <= l1 - 12 || super.mouseY >= l1 + 4 || super.mouseX >= (j1 - 3) + menuWidth)
                    continue;
                menuClick(menuIndexes[l]);
                break;
            }

            mouseButtonClick = 0;
            menuShow = false;
            return;
        }
        if(super.mouseX < menuX - 10 || super.mouseY < menuY - 10 || super.mouseX > menuX + menuWidth + 10 || super.mouseY > menuY + menuHeight + 10) {
            menuShow = false;
            return;
        }
        gameGraphics.drawBoxAlpha(menuX, menuY, menuWidth, menuHeight, 0xd0d0d0, 160);
        gameGraphics.drawString("Choose option", menuX + 2, menuY + 12, 1, 65535);
        for(int i1 = 0; i1 < menuOptionsCount; i1++) {
            int k1 = menuX + 2;
            int i2 = menuY + 27 + i1 * 15;
            int j2 = 0xffffff;
            if(super.mouseX > k1 - 2 && super.mouseY > i2 - 12 && super.mouseY < i2 + 4 && super.mouseX < (k1 - 3) + menuWidth)
                j2 = 0xffff00;
            gameGraphics.drawString(menuText1[menuIndexes[i1]] + " " + menuText2[menuIndexes[i1]], k1, i2, 1, j2);
        }

    }

    private final void getMenuHighlighted() {
        if(drawMenuTab == 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 && super.mouseY < 35)
            drawMenuTab = 1;
        if(drawMenuTab == 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 33 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 33 && super.mouseY < 35) {
            drawMenuTab = 2;
            minimapRandomRotationX = (int)(Math.random() * 13D) - 6;
            minimapRandomRotationY = (int)(Math.random() * 23D) - 11;
        }
        if(drawMenuTab == 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 66 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 66 && super.mouseY < 35)
            drawMenuTab = 3;
        if(drawMenuTab == 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 99 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 99 && super.mouseY < 35)
            drawMenuTab = 4;
        if(drawMenuTab == 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 132 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 132 && super.mouseY < 35)
            drawMenuTab = 5;
        if(drawMenuTab == 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 165 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 165 && super.mouseY < 35)
            drawMenuTab = 6;
        if(drawMenuTab != 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 && super.mouseY < 26)
            drawMenuTab = 1;
        if(drawMenuTab != 0 && drawMenuTab != 2 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 33 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 33 && super.mouseY < 26) {
            drawMenuTab = 2;
            minimapRandomRotationX = (int)(Math.random() * 13D) - 6;
            minimapRandomRotationY = (int)(Math.random() * 23D) - 11;
        }
        if(drawMenuTab != 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 66 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 66 && super.mouseY < 26)
            drawMenuTab = 3;
        if(drawMenuTab != 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 99 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 99 && super.mouseY < 26)
            drawMenuTab = 4;
        if(drawMenuTab != 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 132 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 132 && super.mouseY < 26)
            drawMenuTab = 5;
        if(drawMenuTab != 0 && super.mouseX >= ((GameImage) (gameGraphics)).gameWidth - 35 - 165 && super.mouseY >= 3 && super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 3 - 165 && super.mouseY < 26)
            drawMenuTab = 6;
        if(drawMenuTab == 1 && (super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 248 || super.mouseY > 36 + (maxInventoryItems / 5) * 34))
            drawMenuTab = 0;
        if(drawMenuTab == 3 && (super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 199 || super.mouseY > 316))
            drawMenuTab = 0;
        if((drawMenuTab == 2 || drawMenuTab == 4 || drawMenuTab == 5) && (super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 199 || super.mouseY > 240))
            drawMenuTab = 0;
        if(drawMenuTab == 6 && (super.mouseX < ((GameImage) (gameGraphics)).gameWidth - 199 || super.mouseY > 326))
            drawMenuTab = 0;
    }

    protected final int getUID() {
        return link.uid;
    }
    
    private boolean takeScreenshot(boolean verb) {
        try {
            String charName = DataOperations.hashToName(DataOperations.nameToHash(username));
            File dir = new File(Config.MEDIA_DIR + "/" + charName);
            if(!dir.exists() || !dir.isDirectory())
                dir.mkdir();
            String folder = dir.getPath() + "/";
            File file = null;
            for(int count = 0; file == null || file.exists(); count++)
                file = new File(folder + "screenshot" + count + ".png");
            BufferedImage bi = new BufferedImage(windowWidth, windowHeight + 11, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = bi.createGraphics();
            g2d.drawImage(gameGraphics.image, 0, 0, this);
            g2d.dispose();
            ImageIO.write(bi, "png", file);
            if(verb)
                displayMessage("Screenshot saved as " + file.getName());
            return true;
        } catch(IOException ioe) {
            if(verb)
                displayMessage("Error saving screenshot");
            return false;
        }
    }
    
    private Mob getLastPlayer(int serverIndex) {
        for (int i1 = 0; i1 < lastPlayerCount; i1++) {
            if (lastPlayerArray[i1].serverIndex == serverIndex) {
                return lastPlayerArray[i1];
            }
        }
        return null;
    }

    private Mob getLastNpc(int serverIndex) {
        for (int i1 = 0; i1 < lastNpcCount; i1++) {
            if (lastNpcArray[i1].serverIndex == serverIndex) {
                return lastNpcArray[i1];
            }
        }
        return null;
    }
    
    public boolean handleCommand(String command) {
        try {
            int firstSpace = command.indexOf(' ');
            String cmd = command;
            String args[] = new String[0];
            if(firstSpace != -1) {
                cmd = command.substring(0, firstSpace).trim();
                args = command.substring(firstSpace).trim().split(" ");
            }
            if(cmd.equals("closecon")) {
                super.streamClass.closeStream();
                return true;
            }
            if(cmd.equals("logout")) {
                sendLogout();
                return true;
            }
            if(cmd.equals("lostcon")) {
                lostConnection();
                return true;
            }
            if(cmd.equals("tell")) {
                long recipient = DataOperations.nameToHash(args[0]);
                String message = joinString(args, " ", 1).trim();
                if(message.equals(""))
                    return true;
                int len = ChatMessage.stringToBytes(message);
                sendPrivateMessage(recipient, ChatMessage.lastChat, len);
                message = ChatMessage.bytesToString(ChatMessage.lastChat, 0, len);
                if(useChatFilter)
                    message = ChatFilter.filterChat(message);
                displayMessage("@pri@You tell " + DataOperations.hashToName(recipient) + ": " + message);
                return true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public String joinString(String hay[], String glue, int start) {
        String ret = "";
        for(int i = start; i < hay.length; i++)
            ret += hay[i] + (i != hay.length - 1 ? glue : "");
        return ret;
    }
    
    public String joinString(String hay[], String glue) {
        return joinString(hay, glue, 0);
    }

    public mudclient() {
        tradeOtherName = "";
        windowWidth = 512;
        windowHeight = 334;
        cameraFieldOfView = 9;
        showQuestionMenu = false;
        loginScreenShown = false;
        questionMenuAnswer = new String[5];
        appearanceBodyGender = 1;
        appearance2Colour = 2;
        appearanceHairColour = 2;
        appearanceTopColour = 8;
        appearanceBottomColour = 14;
        appearanceHeadGender = 1;
        menuIndexes = new int[250];
        duelMyItems = new int[8];
        duelMyItemsCount = new int[8];
        playerArray = new Mob[500];
        selectedShopItemIndex = -1;
        selectedShopItemType = -2;
        menuText1 = new String[250];
        isSleeping = false;
        tradeItemsOther = new int[14];
        tradeItemOtherCount = new int[14];
        tradeOtherAccepted = false;
        tradeWeAccepted = false;
        itemAboveHeadScale = new int[50];
        itemAboveHeadID = new int[50];
        playerStatCurrent = new int[18];
        menuActionX = new int[250];
        menuActionY = new int[250];
        menuActionID = new int[250];
        showTradeBox = false;
        npcArray = new Mob[500];
        duelNoRetreating = false;
        duelNoMagic = false;
        duelNoPrayer = false;
        duelNoWeapons = false;
        playerBufferArray = new Mob[4000];
        serverMessage = "";
        duelOpponentAccepted = false;
        duelMyAccepted = false;
        wallObjectX = new int[500];
        wallObjectY = new int[500];
        serverMessageBoxTop = false;
        cameraRotationYIncrement = 2;
        wallObjectArray = new GameObject[500];
        messagesArray = new String[5];
        objectAlreadyInMenu = new boolean[1500];
        objectArray = new GameObject[1500];
        selectedSpell = -1;
        cameraAutoAngleDebug = false;
        ourPlayer = new Mob();
        serverIndex = -1;
        tradeItemsOur = new int[14];
        tradeItemOurCount = new int[14];
        showWelcomeBox = false;
        menuActionType = new int[250];
        menuActionVar1 = new int[250];
        menuActionVar2 = new int[250];
        sleepWordDelay = true;
        configCameraAutoAngle = true;
        cameraRotation = 128;
        configSoundOff = false;
        menuShow = false;
        duelOpponentItems = new int[8];
        duelOpponentItemsCount = new int[8];
        showBankBox = false;
        playerStatBase = new int[18];
        serverBankItems = new int[256];
        serverBankItemCount = new int[256];
        showShopBox = false;
        groundItemX = new int[5000];
        groundItemY = new int[5000];
        groundItemID = new int[5000];
        groundItemObjectVar = new int[5000];
        maxBankItems = 48;
        tradeConfirmOtherItems = new int[14];
        tradeConfirmOtherItemsCount = new int[14];
        layerIndex = -1;
        walkArrayX = new int[8000];
        walkArrayY = new int[8000];
        cameraDistance = 550;
        receivedMessageX = new int[50];
        receivedMessageY = new int[50];
        receivedMessageMidPoint = new int[50];
        receivedMessageHeight = new int[50];
        wallObjectAlreadyInMenu = new boolean[500];
        lastLayerIndex = -1;
        bankItems = new int[256];
        bankItemCount = new int[256];
        maxInventoryItems = 30;
        errorLoading = false;
        itemAboveHeadX = new int[50];
        itemAboveHeadY = new int[50];
        showServerMessageBox = false;
        playerBufferArrayIndexes = new int[500];
        tradeConfirmItems = new int[14];
        tradeConfigItemsCount = new int[14];
        selectedBankItem = -1;
        selectedBankItemType = -2;
        showDuelConfirmBox = false;
        duelConfirmOurAccepted = false;
        wallObjectDirection = new int[500];
        wallObjectID = new int[500];
        gameDataObjects = new GameObject[1000];
        lastNpcArray = new Mob[500];
        inventoryItems = new int[35];
        inventoryItemCount = new int[35];
        inventoryItemEquipped = new int[35];
        selectedItem = -1;
        selectedItemName = "";
        lastPlayerArray = new Mob[500];
        showTradeConfirmBox = false;
        tradeConfirmAccepted = false;
        playerStatExp = new int[18];
        mouseTrailX = new int[8192];
        mouseTrailY = new int[8192];
        configOneMouseButton = false;
        prayerOn = new boolean[50];
        shopItems = new int[256];
        shopItemCount = new int[256];
        shopItemBasePriceModifier = new int[256];
        duelOpponentStakeItem = new int[8];
        duelOutStakeItemCount = new int[8];
        equipmentStatus = new int[5];
        receivedMessages = new String[50];
        cameraRotationXIncrement = 2;
        teleBubbleTime = new int[50];
        magicLoc = 128;
        questStage = new int[questName.length];
        teleBubbleType = new int[50];
        experienceList = new int[99];
        lastModelFireLightningSpellNumber = -1;
        lastModelTorchNumber = -1;
        lastModelClawSpellNumber = -1;
        messagesTimeout = new int[5];
        projectileRange = 40;
        memoryError = false;
        duelOurStakeItem = new int[8];
        duelOurStakeItemCount = new int[8];
        menuText2 = new String[250];
        loginUsername = "";
        loginPassword = "";
        duelOpponent = "";
        healthBarX = new int[50];
        healthBarY = new int[50];
        healthBarMissing = new int[50];
        objectX = new int[1500];
        objectY = new int[1500];
        objectType = new int[1500];
        objectRotation = new int[1500];
        showDuelBox = false;
        npcAttackingArray = new Mob[5000];
        teleBubbleY = new int[50];
        cameraAutoAngle = 1;
        loadArea = false;
        teleBubbleX = new int[50];
        showAppearanceWindow = false;
        cameraZoom = false;
        
        fogOfWar = true;
        showCombatWindow = false;
        showRoofs = true;
        autoScreenshot = false;
        useChatFilter = true;
        usedQuestName = new String[0];
        subDaysLeft = 0;
        shopItemSellPrice = new int[256];
        shopItemBuyPrice = new int[256];
        captchaPixels = new int[0][0];
        captchaWidth = 0;
        captchaHeight = 0;
        needsClear = false;
        hasWorldInfo = false;
        friendsLastShownEntries = new int[5];
        spellsLastShownEntries = new int[5];
        prayersLastShownEntries = new int[5];
        questsLastShownEntries = new int[5];
    }

    private String tradeOtherName;
    private int windowWidth;
    private int windowHeight;
    private int cameraFieldOfView;
    private boolean showQuestionMenu;
    private boolean loginScreenShown;
    private String questionMenuAnswer[];
    private int appearanceHeadType;
    private int appearanceBodyGender;
    private int appearance2Colour;
    private int appearanceHairColour;
    private int appearanceTopColour;
    private int appearanceBottomColour;
    private int appearanceSkinColour;
    private int appearanceHeadGender;
    private Menu chatInputMenu;
    int messagesHandleType2;
    int chatInputBox;
    int messagesHandleType5;
    int messagesHandleType6;
    int messagesTab;
    private int menuIndexes[];
    private int duelMyItemCount;
    private int duelMyItems[];
    private int duelMyItemsCount[];
    private int systemUpdate;
    private Mob playerArray[];
    private final String questName[] = {// TODO really?... needs to be done better imho
            "Cook's Assistant", "Sheep Shearer", "Black knight's fortress", "Imp catcher", "Vampire slayer",
            "Romeo & Juliet", "The restless ghost", "Doric's quest", "The knight's sword", "Witch's potion",
            "Goblin diplomacy", "Ernest the chicken", "Demon Slayer", "Pirate's treasure", "Prince Ali Rescue",
            "Shield of Arrav", "Dragon Slayer"
        /*"Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken",
        "Imp catcher", "Pirate's treasure", "Prince Ali rescue", 
        "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword", "Vampire slayer", "Witch's potion", "Dragon slayer", "Witch's house (members)",
        "Lost city (members)", "Hero's quest (members)", 
        "Druidic ritual (members)", "Merlin's crystal (members)", "Scorpion catcher (members)", "Family crest (members)", "Tribal totem (members)",
        "Fishing contest (members)", "Monk's friend (members)", "Temple of Ikov (members)", "Clock tower (members)", "The Holy Grail (members)", 
        "Fight Arena (members)", "Tree Gnome Village (members)", "The Hazeel Cult (members)", "Sheep Herder (members)", "Plague City (members)",
        "Sea Slug (members)", "Waterfall quest (members)", "Biohazard (members)", "Jungle potion (members)", "Grand tree (members)", 
        "Shilo village (members)", "Underground pass (members)", "Observatory quest (members)", "Tourist trap (members)", "Watchtower (members)",
        "Dwarf Cannon (members)", "Murder Mystery (members)", "Digsite (members)", "Gertrude's Cat (members)", "Legend's Quest (members)"*/
    };
    private int selectedShopItemIndex;
    private int selectedShopItemType;
    private String sleepingStatusText;
    private String menuText1[];
    private boolean isSleeping;
    private int modelFireLightningSpellNumber;
    private int modelTorchNumber;
    private int modelClawSpellNumber;
    private int tradeItemsOtherCount;
    private int tradeItemsOther[];
    private int tradeItemOtherCount[];
    private boolean tradeOtherAccepted;
    private boolean tradeWeAccepted;
    private int itemAboveHeadScale[];
    private int itemAboveHeadID[];
    private int playerStatCurrent[];
    private int menuActionX[];
    private int menuActionY[];
    private final String skillNameVerb[] = {
        "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", 
        "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"
    };
    private int menuActionID[];
    private int playerAliveTimeout;
    private int cameraAutoRotatePlayerX;
    private int cameraAutoRotatePlayerY;
    private boolean showTradeBox;
    private Mob npcArray[];
    private boolean duelNoRetreating;
    private boolean duelNoMagic;
    private boolean duelNoPrayer;
    private boolean duelNoWeapons;
    private Menu appearanceMenu;
    private int animationModelArray[][] = { {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            3, 4
        }, {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            3, 4
        }, {
            11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 
            8, 4
        }, {
            3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 
            8, 3
        }, {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            4, 3
        }
    };
    private int playerCount;
    private int lastPlayerCount;
    private int drawUpdatesPerformed;
    private Mob playerBufferArray[];
    private String serverMessage;
    private int groundItemCount;
    private boolean duelOpponentAccepted;
    private boolean duelMyAccepted;
    private int wallObjectX[];
    private int wallObjectY[];
    private boolean serverMessageBoxTop;
    private int fatigue;
    private int cameraRotationYAmount;
    private int cameraRotationYIncrement;
    private int walkModel[] = {
        0, 1, 2, 1
    };
    private int itemsAboveHeadCount;
    private AudioReader audioPlayer;
    private GameObject wallObjectArray[];
    private String messagesArray[];
    private long duelOpponentHash;
    private Menu questMenu;
    int questMenuHandle;
    int questMenuSelected;
    private boolean objectAlreadyInMenu[];
    private GameObject objectArray[];
    private int selectedSpell;
    private boolean cameraAutoAngleDebug;
    private String lastLoginAddress;
    private Mob ourPlayer;
    int sectionX;
    int sectionY;
    int serverIndex;
    private int tradeItemsOurCount;
    private int tradeItemsOur[];
    private int tradeItemOurCount[];
    private boolean showWelcomeBox;
    private int menuActionType[];
    private int menuActionVar1[];
    private int menuActionVar2[];
    private boolean sleepWordDelay;
    private boolean configCameraAutoAngle;
    private int minimapRandomRotationX;
    private int minimapRandomRotationY;
    private int loginMenuOkButton;
    private int cameraRotation;
    private int combatStyle;
    private final int appearanceSkinColours[] = {
        0xecded0, 0xccb366, 0xb38c40, 0x997326, 0x906020
    };
    private boolean configSoundOff;
    private boolean menuShow;
    private int duelOpponentItemCount;
    private int duelOpponentItems[];
    private int duelOpponentItemsCount[];
    private Menu loginMenuLogin;
    private int appearanceHeadLeftArrow;
    private int appearanceHeadRightArrow;
    private int appearanceHairLeftArrow;
    private int appearanceHairRightArrow;
    private int appearanceGenderLeftArrow;
    private int appearanceGenderRightArrow;
    private int appearanceTopLeftArrow;
    private int appearanceTopRightArrow;
    private int appearanceSkinLeftArrow;
    private int appearanceSkingRightArrow;
    private int appearanceBottomLeftArrow;
    private int appearanceBottomRightArrow;
    private int appearanceAcceptButton;
    private byte soundData[];
    private boolean showBankBox;
    private int shopItemSellPriceModifier;
    private int shopItemBuyPriceModifier;
    private int wildType;
    private int playerStatBase[];
    private long tradeConfirmOtherNameLong;
    private int showAbuseBox;
    private int serverBankItems[];
    private int serverBankItemCount[];
    private boolean showShopBox;
    private int groundItemX[];
    private int groundItemY[];
    private int groundItemID[];
    private int groundItemObjectVar[];
    private GameImageMiddleMan gameGraphics;
    private int maxBankItems;
    private int tradeConfirmOtherItemCount;
    private int tradeConfirmOtherItems[];
    private int tradeConfirmOtherItemsCount[];
    private int tick;
    private EngineHandle engineHandle;
    private int areaX;
    private int areaY;
    private int layerIndex;
    private int mouseButtonClick;
    private Menu loginNewUser;
    private int walkArrayX[];
    private int walkArrayY[];
    private int combatModelArray2[] = {
        0, 0, 0, 0, 0, 1, 2, 1
    };
    private int cameraDistance;
    private int receivedMessageX[];
    private int receivedMessageY[];
    private int receivedMessageMidPoint[];
    private int receivedMessageHeight[];
    private boolean wallObjectAlreadyInMenu[];
    private int wildX;
    private int wildY;
    private int layerModifier;
    private int lastLayerIndex;
    private int bankItems[];
    private int bankItemCount[];
    private final String skillName[] = {
        "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcut", "Fletching", 
        "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"
    };
    private int npcCount;
    private int lastNpcCount;
    private int combatTimeout;
    private int maxInventoryItems;
    private Graphics graphics;
    private boolean errorLoading;
    private int animationNumber;
    private int itemAboveHeadX[];
    private int itemAboveHeadY[];
    private int duelRetreat;
    private int duelMagic;
    private int duelPrayer;
    private int duelWeapons;
    private boolean showServerMessageBox;
    private int playerBufferArrayIndexes[];
    private int loginScreen;
    private int tradeConfigItemCount;
    private int tradeConfirmItems[];
    private int tradeConfigItemsCount[];
    private int selectedBankItem;
    private int selectedBankItemType;
    private boolean showDuelConfirmBox;
    private boolean duelConfirmOurAccepted;
    private int wallObjectDirection[];
    private int wallObjectID[];
    private GameObject gameDataObjects[];
    private Mob lastNpcArray[];
    private int modelUpdatingTimer;
    private int inventoryItemsCount;
    private int inventoryItems[];
    private int inventoryItemCount[];
    private int inventoryItemEquipped[];
    private int selectedItem;
    String selectedItemName;
    private Mob lastPlayerArray[];
    private boolean showTradeConfirmBox;
    private boolean tradeConfirmAccepted;
    private int playerStatExp[];
    private int loginButtonNewUser;
    private int loginMenuLoginButton;
    private int mouseTrailIndex;
    int mouseTrailX[];
    int mouseTrailY[];
    private boolean configOneMouseButton;
    private boolean prayerOn[];
    private int lastLoginDays;
    private int loginMenuStatusText;
    private int loginMenuUserText;
    private int loginMenuPasswordText;
    private int loginMenuOkLoginButton;
    private int loginMenuCancelButton;
    private int shopItems[];
    private int shopItemCount[];
    private int shopItemBasePriceModifier[];
    private int objectCount;
    private int duelOpponentStakeCount;
    private int duelOpponentStakeItem[];
    private int duelOutStakeItemCount[];
    private int baseInventoryPic;
    private int baseScrollPic;
    private int baseItemPicture;
    private int baseProjectilePic;
    private int baseTexturePic;
    private int subTexturePic;
    private int baseLoginScreenBackgroundPic;
    private int sectionLowerX;
    private int sectionLowerY;
    private int sectionUpperX;
    private int sectionUpperY;
    private int equipmentStatus[];
    private int drawMenuTab;
    private int receivedMessagesCount;
    String receivedMessages[];
    private int cameraRotateTime;
    private int questionMenuCount;
    private int cameraRotationXAmount;
    private int cameraRotationXIncrement;
    private int teleBubbleTime[];
    private final String gearStats[] = {
        "Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"
    };
    private int logoutTimer;
    private int wallObjectCount;
    private int magicLoc;
    private int loggedIn;
    private int questStage[];
    private int teleBubbleType[];
    private int experienceList[];
    private int lastModelFireLightningSpellNumber;
    private int lastModelTorchNumber;
    private int lastModelClawSpellNumber;
    private int chatTabAllMsgFlash;
    private int chatTabHistoryFlash;
    private int chatTabQuestFlash;
    private int chatTabPrivateFlash;
    private int messagesTimeout[];
    private int projectileRange;
    private final int appearanceTopBottomColours[] = {
        0xff0000, 0xff8000, 0xffe000, 0xa0e000, 57344, 32768, 41088, 45311, 33023, 12528, 
        0xe000e0, 0x303030, 0x604000, 0x805000, 0xffffff
    };
    private int showFriendsBox;
    private int teleBubbleCount;
    private boolean memoryError;
    private final int appearanceHairColours[] = {
        0xffc030, 0xffa040, 0x805030, 0x604020, 0x303030, 0xff6020, 0xff4000, 0xffffff, 65280, 65535
    };
    private Menu spellMenu;
    int spellMenuHandle;
    int menuMagicPrayersSelected;
    private int duelOurStakeCount;
    private int duelOurStakeItem[];
    private int duelOurStakeItemCount[];
    private int menuX;
    private int menuY;
    private int menuWidth;
    private int menuHeight;
    private int menuOptionsCount;
    private Camera gameCamera;
    private Menu friendsMenu;
    int friendsMenuHandle;
    int friendsIgnoreMenuSelected;
    long pmTarget;
    private int healthBarVisibleCount;
    private String menuText2[];
    private int sleepWordDelayTimer;
    private int mouseButtonHeldTime;
    private int mouseClickedHeldInTradeDuelBox;
    private String loginUsername;
    private String loginPassword;
    private String duelOpponent;
    private int bankPage;
    private Menu loginMenuFirst;
    private int healthBarX[];
    private int healthBarY[];
    private int healthBarMissing[];
    private int objectX[];
    private int objectY[];
    private int objectType[];
    private int objectRotation[];
    private int reportAbuseOptionSelected;
    private boolean showDuelBox;
    private Mob npcAttackingArray[];
    private int serverBankItemsCount;
    private int teleBubbleY[];
    private int cameraAutoAngle;
    private int cameraAutoRotationAmount;
    private boolean loadArea;
    private int teleBubbleX[];
    private int bankItemsCount;
    private boolean showAppearanceWindow;
    private int questPoints;
    private int actionPictureType;
    int walkMouseX;
    int walkMouseY;
    private int combatModelArray1[] = {
        0, 1, 2, 1, 0, 0, 0, 0
    };
    private boolean cameraZoom;
    
    private boolean fogOfWar;
    private boolean showCombatWindow;
    private boolean showRoofs;
    private boolean autoScreenshot;
    private boolean useChatFilter;
    private String usedQuestName[];
    private int subDaysLeft;
    private int shopItemSellPrice[];
    private int shopItemBuyPrice[];
    private int captchaPixels[][];
    private int captchaWidth;
    private int captchaHeight;
    private boolean needsClear;
    private boolean hasWorldInfo;
    private int friendsLastShownEntries[];
    private int spellsLastShownEntries[];
    private int prayersLastShownEntries[];
    private int questsLastShownEntries[];
}
