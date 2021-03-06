package editor.logic;

import editor.ui.parts.content.stageproperties.stage.RenderingStage;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Settings {
    private static int gridRenderSize = 32;
    private static int worldSectionSize = 3840;
    private static String projectFolder;
    private static boolean snapToGrid = false;
    private static int contentDividerPosition = 540;
    private static String lastAssetImportPath = "~";
    private static double viewPitch = 45.0; // the angle the game is rendered at, 90 degrees is straight down
    private static int minimumSnap = 2; // the minimum snap that an asset instance can be placed at, default 2 for pixel games

    public static int getGridRenderSize() {
        return gridRenderSize;
    }

    public static void setGridRenderSize(int gridRenderSize) {
        Settings.gridRenderSize = gridRenderSize;
    }

    public static int getWorldSectionSize() {
        return worldSectionSize;
    }

    public static void setWorldSectionSize(int worldSectionSize) {
        Settings.worldSectionSize = worldSectionSize;
    }

    public static String getProjectFolder() {
        return projectFolder;
    }

    public static void setProjectFolder(String projectFolder) {
        Settings.projectFolder = projectFolder;
    }

    public static boolean isSnapToGrid() {
        return snapToGrid;
    }

    public static void setSnapToGrid(boolean snapToGrid) {
        Settings.snapToGrid = snapToGrid;
    }

    public static int getContentDividerPosition() {
        return contentDividerPosition;
    }

    public static void setContentDividerPosition(int contentDividerPosition) {
        Settings.contentDividerPosition = contentDividerPosition;
    }

    public static String getLastAssetImportPath() {
        return lastAssetImportPath;
    }

    public static void setLastAssetImportPath(String lastAssetImportPath) {
        Settings.lastAssetImportPath = lastAssetImportPath;
    }

    public static double getViewPitch() {
        return viewPitch;
    }

    public static void setViewPitch(double viewPitch) {
        Settings.viewPitch = viewPitch;
    }

    public static int getMinimumSnap() {
        return minimumSnap;
    }

    public static void setMinimumSnap(int minimumSnap) {
        Settings.minimumSnap = minimumSnap;
    }

    static {
        try {
            projectFolder = new File("Soul World Project").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
