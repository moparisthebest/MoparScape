package mudclient;

import java.awt.event.KeyEvent;

public class Menu {

    public Menu(GameImage j1, int i) {
        selectedComponent = -1;
        gdg = true;
        gaj = j1;
        gal = i;
        componentAcceptsInput = new boolean[i];
        gan = new boolean[i];
        componentIsPasswordField = new boolean[i];
        componentSkip = new boolean[i];
        componentWhiteText = new boolean[i];
        listShownEntries = new int[i];
        listLength = new int[i];
        gbe = new int[i];
        gbf = new int[i];
        componentX = new int[i];
        componentY = new int[i];
        componentType = new int[i];
        componentWidth = new int[i];
        componentHeight = new int[i];
        copmonentInputMaxLength = new int[i];
        componentTextSize = new int[i];
        componentText = new String[i];
        componentTextList = new String[i][];
        scrollBarGradientColorTop = rgbToIntMod(114, 114, 176);
        scrollBarGradientColorBottom = rgbToIntMod(14, 14, 62);
        scrollBarDraggingBarLine1Color = rgbToIntMod(200, 208, 232);
        scrollBarDraggingBarColor = rgbToIntMod(96, 129, 184);
        scrollBarDraggingBarLine2Color = rgbToIntMod(53, 95, 115);
        gcn = rgbToIntMod(117, 142, 171);
        gda = rgbToIntMod(98, 122, 158);
        gdb = rgbToIntMod(86, 100, 136);
        gdc = rgbToIntMod(135, 146, 179);
        gdd = rgbToIntMod(97, 112, 151);
        gde = rgbToIntMod(88, 102, 136);
        gdf = rgbToIntMod(84, 93, 120);
    }

    public int rgbToIntMod(int i, int k, int l) {
        return GameImage.rgbToInt((redMod * i) / 114, (greenMod * k) / 114, (blueMod * l) / 176);
    }

    public void mouseClick(int mouseX, int mouseY, int lastMouseButton, int mouseButton) {
        this.mouseX = mouseX;
        this.mouseY = mouseY;
        this.mouseButton = mouseButton;
        if(lastMouseButton != 0)
            this.lastMouseButton = lastMouseButton;
        if(lastMouseButton == 1) {
            for(int i = 0; i < menuItemsCount; i++) {
                if(componentAcceptsInput[i] && componentType[i] == 10 && this.mouseX >= componentX[i] && this.mouseY >= componentY[i] && this.mouseX <= componentX[i] + componentWidth[i] && this.mouseY <= componentY[i] + componentHeight[i])
                    componentSkip[i] = true;
                if(componentAcceptsInput[i] && componentType[i] == 14 && this.mouseX >= componentX[i] && this.mouseY >= componentY[i] && this.mouseX <= componentX[i] + componentWidth[i] && this.mouseY <= componentY[i] + componentHeight[i])
                    gbe[i] = 1 - gbe[i];
            }

        }
        if(mouseButton == 1)
            gch++;
        else
            gch = 0;
        if(lastMouseButton == 1 || gch > 20) {
            for(int k = 0; k < menuItemsCount; k++)
                if(componentAcceptsInput[k] && componentType[k] == 15 && this.mouseX >= componentX[k] && this.mouseY >= componentY[k] && this.mouseX <= componentX[k] + componentWidth[k] && this.mouseY <= componentY[k] + componentHeight[k])
                    componentSkip[k] = true;

            gch -= 5;
        }
    }

    public boolean isClicked(int i) {
        if(componentAcceptsInput[i] && componentSkip[i]) {
            componentSkip[i] = false;
            return true;
        } else {
            return false;
        }
    }

    public void keyPress(int key, char c) {
        if(key == 0)
            return;
        if(selectedComponent != -1 && componentText[selectedComponent] != null && componentAcceptsInput[selectedComponent]) {
            int i = componentText[selectedComponent].length();
            if(key == KeyEvent.VK_BACK_SPACE && i > 0)
                componentText[selectedComponent] = componentText[selectedComponent].substring(0, i - 1);
            if((key == KeyEvent.VK_ENTER) && i > 0)
                componentSkip[selectedComponent] = true;
            String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
            if(i < copmonentInputMaxLength[selectedComponent]) {
                for(int k = 0; k < s.length(); k++)
                    if(c == s.charAt(k))
                        componentText[selectedComponent] += c;

            }
            if(key == KeyEvent.VK_TAB) {
                do
                    selectedComponent = (selectedComponent + 1) % menuItemsCount;
                while(componentType[selectedComponent] != 5 && componentType[selectedComponent] != 6);
                return;
            }
        }
    }

    public void drawMenu() {
        for(int i = 0; i < menuItemsCount; i++)
            if(componentAcceptsInput[i])
                if(componentType[i] == 0)
                    gef(i, componentX[i], componentY[i], componentText[i], componentTextSize[i]);
                else
                if(componentType[i] == 1)
                    gef(i, componentX[i] - gaj.textWidth(componentText[i], componentTextSize[i]) / 2, componentY[i], componentText[i], componentTextSize[i]);
                else
                if(componentType[i] == 2)
                    gei(componentX[i], componentY[i], componentWidth[i], componentHeight[i]);
                else
                if(componentType[i] == 3)
                    gel(componentX[i], componentY[i], componentWidth[i]);
                else
                if(componentType[i] == 4)
                    gem(i, componentX[i], componentY[i], componentWidth[i], componentHeight[i], componentTextSize[i], componentTextList[i], listLength[i], listShownEntries[i]);
                else
                if(componentType[i] == 5 || componentType[i] == 6)
                    geh(i, componentX[i], componentY[i], componentWidth[i], componentHeight[i], componentText[i], componentTextSize[i]);
                else
                if(componentType[i] == 7)
                    gfa(i, componentX[i], componentY[i], componentTextSize[i], componentTextList[i]);
                else
                if(componentType[i] == 8)
                    gfb(i, componentX[i], componentY[i], componentTextSize[i], componentTextList[i]);
                else
                if(componentType[i] == 9)
                    drawList(i, componentX[i], componentY[i], componentWidth[i], componentHeight[i], componentTextSize[i], componentTextList[i], listLength[i], listShownEntries[i]);
                else
                if(componentType[i] == 11)
                    gej(componentX[i], componentY[i], componentWidth[i], componentHeight[i]);
                else
                if(componentType[i] == 12)
                    gek(componentX[i], componentY[i], componentTextSize[i]);
                else
                if(componentType[i] == 14)
                    gee(i, componentX[i], componentY[i], componentWidth[i], componentHeight[i]);

        lastMouseButton = 0;
    }

    protected void gee(int arg0, int arg1, int arg2, int arg3, int arg4) {
        gaj.drawBox(arg1, arg2, arg3, arg4, 0xffffff);
        gaj.drawLineX(arg1, arg2, arg3, gdc);
        gaj.drawLineY(arg1, arg2, arg4, gdc);
        gaj.drawLineX(arg1, (arg2 + arg4) - 1, arg3, gdf);
        gaj.drawLineY((arg1 + arg3) - 1, arg2, arg4, gdf);
        if(gbe[arg0] == 1) {
            for(int i = 0; i < arg4; i++) {
                gaj.drawLineX(arg1 + i, arg2 + i, 1, 0);
                gaj.drawLineX((arg1 + arg3) - 1 - i, arg2 + i, 1, 0);
            }

        }
    }

    protected void gef(int i, int k, int l, String s, int i1) {
        int j1 = l + gaj.textHeightNumber(i1) / 3;
        geg(i, k, j1, s, i1);
    }

    protected void geg(int arg0, int arg1, int arg2, String arg3, int arg4) {
        int i;
        if(componentWhiteText[arg0])
            i = 0xffffff;
        else
            i = 0;
        gaj.drawString(arg3, arg1, arg2, arg4, i);
    }

    protected void geh(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if(componentIsPasswordField[arg0]) {
            int i = arg5.length();
            arg5 = "";
            for(int l = 0; l < i; l++)
                arg5 = arg5 + "X";

        }
        if(componentType[arg0] == 5) {
            if(lastMouseButton == 1 && mouseX >= arg1 && mouseY >= arg2 - arg4 / 2 && mouseX <= arg1 + arg3 && mouseY <= arg2 + arg4 / 2)
                selectedComponent = arg0;
        } else
        if(componentType[arg0] == 6) {
            if(lastMouseButton == 1 && mouseX >= arg1 - arg3 / 2 && mouseY >= arg2 - arg4 / 2 && mouseX <= arg1 + arg3 / 2 && mouseY <= arg2 + arg4 / 2)
                selectedComponent = arg0;
            arg1 -= gaj.textWidth(arg5, arg6) / 2;
        }
        if(selectedComponent == arg0)
            arg5 = arg5 + "*";
        int k = arg2 + gaj.textHeightNumber(arg6) / 3;
        geg(arg0, arg1, k, arg5, arg6);
    }

    public void gei(int arg0, int arg1, int arg2, int arg3) {
        gaj.setGameBoundaries(arg0, arg1, arg0 + arg2, arg1 + arg3);
        gaj.drawGradientBox(arg0, arg1, arg2, arg3, gdf, gdc);
        if(gdh) {
            for(int i = arg0 - (arg1 & 0x3f); i < arg0 + arg2; i += 128) {
                for(int k = arg1 - (arg1 & 0x1f); k < arg1 + arg3; k += 128)
                    gaj.ccd(i, k, 6 + baseScrollPic, 128);

            }

        }
        gaj.drawLineX(arg0, arg1, arg2, gdc);
        gaj.drawLineX(arg0 + 1, arg1 + 1, arg2 - 2, gdc);
        gaj.drawLineX(arg0 + 2, arg1 + 2, arg2 - 4, gdd);
        gaj.drawLineY(arg0, arg1, arg3, gdc);
        gaj.drawLineY(arg0 + 1, arg1 + 1, arg3 - 2, gdc);
        gaj.drawLineY(arg0 + 2, arg1 + 2, arg3 - 4, gdd);
        gaj.drawLineX(arg0, (arg1 + arg3) - 1, arg2, gdf);
        gaj.drawLineX(arg0 + 1, (arg1 + arg3) - 2, arg2 - 2, gdf);
        gaj.drawLineX(arg0 + 2, (arg1 + arg3) - 3, arg2 - 4, gde);
        gaj.drawLineY((arg0 + arg2) - 1, arg1, arg3, gdf);
        gaj.drawLineY((arg0 + arg2) - 2, arg1 + 1, arg3 - 2, gdf);
        gaj.drawLineY((arg0 + arg2) - 3, arg1 + 2, arg3 - 4, gde);
        gaj.cai();
    }

    public void gej(int i, int k, int l, int i1) {
        gaj.drawBox(i, k, l, i1, 0);
        gaj.drawBoxEdge(i, k, l, i1, gcn);
        gaj.drawBoxEdge(i + 1, k + 1, l - 2, i1 - 2, gda);
        gaj.drawBoxEdge(i + 2, k + 2, l - 4, i1 - 4, gdb);
        gaj.drawPicture(i, k, 2 + baseScrollPic);
        gaj.drawPicture((i + l) - 7, k, 3 + baseScrollPic);
        gaj.drawPicture(i, (k + i1) - 7, 4 + baseScrollPic);
        gaj.drawPicture((i + l) - 7, (k + i1) - 7, 5 + baseScrollPic);
    }

    protected void gek(int i, int k, int l) {
        gaj.drawPicture(i, k, l);
    }

    protected void gel(int i, int k, int l) {
        gaj.drawLineX(i, k, l, 0);
    }

    protected void gem(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6[], 
            int arg7, int arg8) {
        int i = arg4 / gaj.textHeightNumber(arg5);
        if(arg8 > arg7 - i)
            arg8 = arg7 - i;
        if(arg8 < 0)
            arg8 = 0;
        listShownEntries[arg0] = arg8;
        if(i < arg7) {
            int k = (arg1 + arg3) - 12;
            int i1 = ((arg4 - 27) * i) / arg7;
            if(i1 < 6)
                i1 = 6;
            int k1 = ((arg4 - 27 - i1) * arg8) / (arg7 - i);
            if(mouseButton == 1 && mouseX >= k && mouseX <= k + 12) {
                if(mouseY > arg2 && mouseY < arg2 + 12 && arg8 > 0)
                    arg8--;
                if(mouseY > (arg2 + arg4) - 12 && mouseY < arg2 + arg4 && arg8 < arg7 - i)
                    arg8++;
                listShownEntries[arg0] = arg8;
            }
            if(mouseButton == 1 && (mouseX >= k && mouseX <= k + 12 || mouseX >= k - 12 && mouseX <= k + 24 && gan[arg0])) {
                if(mouseY > arg2 + 12 && mouseY < (arg2 + arg4) - 12) {
                    gan[arg0] = true;
                    int i2 = mouseY - arg2 - 12 - i1 / 2;
                    arg8 = (i2 * arg7) / (arg4 - 24);
                    if(arg8 > arg7 - i)
                        arg8 = arg7 - i;
                    if(arg8 < 0)
                        arg8 = 0;
                    listShownEntries[arg0] = arg8;
                }
            } else {
                gan[arg0] = false;
            }
            k1 = ((arg4 - 27 - i1) * arg8) / (arg7 - i);
            drawScrollbar(arg1, arg2, arg3, arg4, k1, i1);
        }
        int l = arg4 - i * gaj.textHeightNumber(arg5);
        int j1 = arg2 + (gaj.textHeightNumber(arg5) * 5) / 6 + l / 2;
        for(int l1 = arg8; l1 < arg7; l1++) {
            geg(arg0, arg1 + 2, j1, arg6[l1], arg5);
            j1 += gaj.textHeightNumber(arg5) - chatMenuTextHeightMod;
            if(j1 >= arg2 + arg4)
                return;
        }

    }

    protected void drawScrollbar(int i, int k, int l, int i1, int j1, int k1) {
        int l1 = (i + l) - 12;
        gaj.drawBoxEdge(l1, k, 12, i1, 0);// border
        gaj.drawPicture(l1 + 1, k + 1, baseScrollPic);// up arrow
        gaj.drawPicture(l1 + 1, (k + i1) - 12, 1 + baseScrollPic);// down arrow
        gaj.drawLineX(l1, k + 13, 12, 0);// up arrow border
        gaj.drawLineX(l1, (k + i1) - 13, 12, 0);// down arrow border
        gaj.drawGradientBox(l1 + 1, k + 14, 11, i1 - 27, scrollBarGradientColorTop, scrollBarGradientColorBottom);// background gradient
        gaj.drawBox(l1 + 3, j1 + k + 14, 7, k1, scrollBarDraggingBarColor);// dragging bar
        gaj.drawLineY(l1 + 2, j1 + k + 14, k1, scrollBarDraggingBarLine1Color);// dragging bar
        gaj.drawLineY(l1 + 2 + 8, j1 + k + 14, k1, scrollBarDraggingBarLine2Color);// drawgging bar
    }

    protected void gfa(int arg0, int arg1, int arg2, int arg3, String arg4[]) {
        int i = 0;
        int k = arg4.length;
        for(int l = 0; l < k; l++) {
            i += gaj.textWidth(arg4[l], arg3);
            if(l < k - 1)
                i += gaj.textWidth("  ", arg3);
        }

        int i1 = arg1 - i / 2;
        int j1 = arg2 + gaj.textHeightNumber(arg3) / 3;
        for(int k1 = 0; k1 < k; k1++) {
            int l1;
            if(componentWhiteText[arg0])
                l1 = 0xffffff;
            else
                l1 = 0;
            if(mouseX >= i1 && mouseX <= i1 + gaj.textWidth(arg4[k1], arg3) && mouseY <= j1 && mouseY > j1 - gaj.textHeightNumber(arg3)) {
                if(componentWhiteText[arg0])
                    l1 = 0x808080;
                else
                    l1 = 0xffffff;
                if(lastMouseButton == 1) {
                    gbe[arg0] = k1;
                    componentSkip[arg0] = true;
                }
            }
            if(gbe[arg0] == k1)
                if(componentWhiteText[arg0])
                    l1 = 0xff0000;
                else
                    l1 = 0xc00000;
            gaj.drawString(arg4[k1], i1, j1, arg3, l1);
            i1 += gaj.textWidth(arg4[k1] + "  ", arg3);
        }

    }

    protected void gfb(int arg0, int arg1, int arg2, int arg3, String arg4[]) {
        int i = arg4.length;
        int k = arg2 - (gaj.textHeightNumber(arg3) * (i - 1)) / 2;
        for(int l = 0; l < i; l++) {
            int i1;
            if(componentWhiteText[arg0])
                i1 = 0xffffff;
            else
                i1 = 0;
            int j1 = gaj.textWidth(arg4[l], arg3);
            if(mouseX >= arg1 - j1 / 2 && mouseX <= arg1 + j1 / 2 && mouseY - 2 <= k && mouseY - 2 > k - gaj.textHeightNumber(arg3)) {
                if(componentWhiteText[arg0])
                    i1 = 0x808080;
                else
                    i1 = 0xffffff;
                if(lastMouseButton == 1) {
                    gbe[arg0] = l;
                    componentSkip[arg0] = true;
                }
            }
            if(gbe[arg0] == l)
                if(componentWhiteText[arg0])
                    i1 = 0xff0000;
                else
                    i1 = 0xc00000;
            gaj.drawString(arg4[l], arg1 - j1 / 2, k, arg3, i1);
            k += gaj.textHeightNumber(arg3);
        }

    }
   // drawList(i, componentX[i], componentY[i], componentWidth[i], componentHeight[i], componentTextSize[i], componentTextList[i], listLength[i], gbc[i]);
    protected void drawList(int listIndex, int listX, int listY, int listWidth, int listHeight, int listTextSize, String listText[], 
            int listLength, int shownEntries) {
        int entryCount = listHeight / gaj.textHeightNumber(listTextSize);
        if(entryCount < listLength) {
            int k = (listX + listWidth) - 12;
            int i1 = ((listHeight - 27) * entryCount) / listLength;
            if(i1 < 6)
                i1 = 6;
            int k1 = ((listHeight - 27 - i1) * shownEntries) / (listLength - entryCount);
            if(mouseButton == 1 && mouseX >= k && mouseX <= k + 12) {
                if(mouseY > listY && mouseY < listY + 12 && shownEntries > 0)
                    shownEntries--;
                if(mouseY > (listY + listHeight) - 12 && mouseY < listY + listHeight && shownEntries < listLength - entryCount)
                    shownEntries++;
                listShownEntries[listIndex] = shownEntries;
            }
            if(mouseButton == 1 && (mouseX >= k && mouseX <= k + 12 || mouseX >= k - 12 && mouseX <= k + 24 && gan[listIndex])) {
                if(mouseY > listY + 12 && mouseY < (listY + listHeight) - 12) {
                    gan[listIndex] = true;
                    int i2 = mouseY - listY - 12 - i1 / 2;
                    shownEntries = (i2 * listLength) / (listHeight - 24);
                    if(shownEntries < 0)
                        shownEntries = 0;
                    if(shownEntries > listLength - entryCount)
                        shownEntries = listLength - entryCount;
                    listShownEntries[listIndex] = shownEntries;
                }
            } else {
                gan[listIndex] = false;
            }
            k1 = ((listHeight - 27 - i1) * shownEntries) / (listLength - entryCount);
            drawScrollbar(listX, listY, listWidth, listHeight, k1, i1);
        } else {
            shownEntries = 0;
            listShownEntries[listIndex] = 0;
        }
        gbf[listIndex] = -1;
        int l = listHeight - entryCount * gaj.textHeightNumber(listTextSize);
        int j1 = listY + (gaj.textHeightNumber(listTextSize) * 5) / 6 + l / 2;
        for(int l1 = shownEntries; l1 < listLength; l1++) {
            int j2;
            if(componentWhiteText[listIndex])
                j2 = 0xffffff;
            else
                j2 = 0;
            if(mouseX >= listX + 2 && mouseX <= listX + 2 + gaj.textWidth(listText[l1], listTextSize) && mouseY - 2 <= j1 && mouseY - 2 > j1 - gaj.textHeightNumber(listTextSize)) {
                if(componentWhiteText[listIndex])
                    j2 = 0x808080;
                else
                    j2 = 0xffffff;
                gbf[listIndex] = l1;
                if(lastMouseButton == 1) {
                    gbe[listIndex] = l1;
                    componentSkip[listIndex] = true;
                }
            }
            if(gbe[listIndex] == l1 && gdg)
                j2 = 0xff0000;
            gaj.drawString(listText[l1], listX + 2, j1, listTextSize, j2);
            j1 += gaj.textHeightNumber(listTextSize);
            if(j1 >= listY + listHeight)
                return;
        }

    }

    public int drawText(int i, int k, String s, int l, boolean flag) {
        componentType[menuItemsCount] = 1;
        componentAcceptsInput[menuItemsCount] = true;
        componentSkip[menuItemsCount] = false;
        componentTextSize[menuItemsCount] = l;
        componentWhiteText[menuItemsCount] = flag;
        componentX[menuItemsCount] = i;
        componentY[menuItemsCount] = k;
        componentText[menuItemsCount] = s;
        return menuItemsCount++;
    }

    public int drawButton(int i, int k, int l, int i1) {
        componentType[menuItemsCount] = 2;
        componentAcceptsInput[menuItemsCount] = true;
        componentSkip[menuItemsCount] = false;
        componentX[menuItemsCount] = i - l / 2;
        componentY[menuItemsCount] = k - i1 / 2;
        componentWidth[menuItemsCount] = l;
        componentHeight[menuItemsCount] = i1;
        return menuItemsCount++;
    }

    public int drawCurvedBox(int i, int k, int l, int i1) {
        componentType[menuItemsCount] = 11;
        componentAcceptsInput[menuItemsCount] = true;
        componentSkip[menuItemsCount] = false;
        componentX[menuItemsCount] = i - l / 2;
        componentY[menuItemsCount] = k - i1 / 2;
        componentWidth[menuItemsCount] = l;
        componentHeight[menuItemsCount] = i1;
        return menuItemsCount++;
    }

    public int drawArrow(int i, int k, int l) {
        int i1 = gaj.pictureWidth[l];
        int j1 = gaj.pictureHeight[l];
        componentType[menuItemsCount] = 12;
        componentAcceptsInput[menuItemsCount] = true;
        componentSkip[menuItemsCount] = false;
        componentX[menuItemsCount] = i - i1 / 2;
        componentY[menuItemsCount] = k - j1 / 2;
        componentWidth[menuItemsCount] = i1;
        componentHeight[menuItemsCount] = j1;
        componentTextSize[menuItemsCount] = l;
        return menuItemsCount++;
    }

    public int gfh(int i, int k, int l, int i1, int j1, int k1, boolean flag) {
        componentType[menuItemsCount] = 4;
        componentAcceptsInput[menuItemsCount] = true;
        componentSkip[menuItemsCount] = false;
        componentX[menuItemsCount] = i;
        componentY[menuItemsCount] = k;
        componentWidth[menuItemsCount] = l;
        componentHeight[menuItemsCount] = i1;
        componentWhiteText[menuItemsCount] = flag;
        componentTextSize[menuItemsCount] = j1;
        copmonentInputMaxLength[menuItemsCount] = k1;
        listLength[menuItemsCount] = 0;
        listShownEntries[menuItemsCount] = 0;
        componentTextList[menuItemsCount] = new String[k1];
        return menuItemsCount++;
    }

    public int gfi(int i, int k, int l, int i1, int j1, int k1, boolean flag, 
            boolean flag1) {
        componentType[menuItemsCount] = 5;
        componentAcceptsInput[menuItemsCount] = true;
        componentIsPasswordField[menuItemsCount] = flag;
        componentSkip[menuItemsCount] = false;
        componentTextSize[menuItemsCount] = j1;
        componentWhiteText[menuItemsCount] = flag1;
        componentX[menuItemsCount] = i;
        componentY[menuItemsCount] = k;
        componentWidth[menuItemsCount] = l;
        componentHeight[menuItemsCount] = i1;
        copmonentInputMaxLength[menuItemsCount] = k1;
        componentText[menuItemsCount] = "";
        return menuItemsCount++;
    }

    public int createInput(int i, int k, int l, int i1, int j1, int k1, boolean flag, 
            boolean flag1) {
        componentType[menuItemsCount] = 6;
        componentAcceptsInput[menuItemsCount] = true;
        componentIsPasswordField[menuItemsCount] = flag;
        componentSkip[menuItemsCount] = false;
        componentTextSize[menuItemsCount] = j1;
        componentWhiteText[menuItemsCount] = flag1;
        componentX[menuItemsCount] = i;
        componentY[menuItemsCount] = k;
        componentWidth[menuItemsCount] = l;
        componentHeight[menuItemsCount] = i1;
        copmonentInputMaxLength[menuItemsCount] = k1;
        componentText[menuItemsCount] = "";
        return menuItemsCount++;
    }

    public int createList(int i, int k, int l, int i1, int j1, int k1, boolean flag) {
        componentType[menuItemsCount] = 9;
        componentAcceptsInput[menuItemsCount] = true;
        componentSkip[menuItemsCount] = false;
        componentTextSize[menuItemsCount] = j1;
        componentWhiteText[menuItemsCount] = flag;
        componentX[menuItemsCount] = i;
        componentY[menuItemsCount] = k;
        componentWidth[menuItemsCount] = l;
        componentHeight[menuItemsCount] = i1;
        copmonentInputMaxLength[menuItemsCount] = k1;
        componentTextList[menuItemsCount] = new String[k1];
        listLength[menuItemsCount] = 0;
        listShownEntries[menuItemsCount] = 0;
        gbe[menuItemsCount] = -1;
        gbf[menuItemsCount] = -1;
        return menuItemsCount++;
    }

    public int createButton(int i, int k, int l, int i1) {
        componentType[menuItemsCount] = 10;
        componentAcceptsInput[menuItemsCount] = true;
        componentSkip[menuItemsCount] = false;
        componentX[menuItemsCount] = i - l / 2;
        componentY[menuItemsCount] = k - i1 / 2;
        componentWidth[menuItemsCount] = l;
        componentHeight[menuItemsCount] = i1;
        return menuItemsCount++;
    }

    public void clearList(int i) {
        listLength[i] = 0;
    }

    public void switchList(int i) {
        listShownEntries[i] = 0;
        gbf[i] = -1;
    }

    public void addListItem(int i, int k, String s) {
        componentTextList[i][k] = s;
        if(k + 1 > listLength[i])
            listLength[i] = k + 1;
    }

    public void addMessage(int arg0, String arg1, boolean arg2) {
        int i = listLength[arg0]++;
        if(i >= copmonentInputMaxLength[arg0]) {
            i--;
            listLength[arg0]--;
            for(int k = 0; k < i; k++)
                componentTextList[arg0][k] = componentTextList[arg0][k + 1];

        }
        componentTextList[arg0][i] = arg1;
        if(arg2)
            listShownEntries[arg0] = 0xf423f;
    }

    public void updateText(int i, String s) {
        componentText[i] = s;
    }

    public String getText(int i) {
        if(componentText[i] == null)
            return "null";
        else
            return componentText[i];
    }

    public void gge(int i) {
        componentAcceptsInput[i] = true;
    }

    public void ggf(int i) {
        componentAcceptsInput[i] = false;
    }

    public void setFocus(int i) {
        selectedComponent = i;
    }

    public int getEntryHighlighted(int i) {
        int k = gbf[i];
        return k;
    }

    protected GameImage gaj;
    int menuItemsCount;
    int gal;
    public boolean componentAcceptsInput[];
    public boolean gan[];
    public boolean componentIsPasswordField[];
    public boolean componentSkip[];
    public int listShownEntries[];
    public int listLength[];
    public int gbe[];
    public int gbf[];
    boolean componentWhiteText[];
    int componentX[];
    int componentY[];
    int componentType[];
    int componentWidth[];
    int componentHeight[];
    int copmonentInputMaxLength[];
    int componentTextSize[];
    String componentText[];
    String componentTextList[][];
    int mouseX;
    int mouseY;
    int lastMouseButton;
    int mouseButton;
    int selectedComponent;
    int gch;
    int scrollBarGradientColorTop;
    int scrollBarGradientColorBottom;
    int scrollBarDraggingBarLine1Color;
    int scrollBarDraggingBarColor;
    int scrollBarDraggingBarLine2Color;
    int gcn;
    int gda;
    int gdb;
    int gdc;
    int gdd;
    int gde;
    int gdf;
    public boolean gdg;
    public static boolean gdh = true;
    public static int baseScrollPic;
    public static int redMod = 114;
    public static int greenMod = 114;
    public static int blueMod = 176;
    public static int chatMenuTextHeightMod;

}
