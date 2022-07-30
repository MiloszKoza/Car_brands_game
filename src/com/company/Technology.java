package com.company;

public enum Technology {
    TETRA ("Radio Tetra"),
    MOTOTRBO ("Mototrbo"),
    BUISNESS("Bisnez"),
    WAVE ("Wave");

    private String displayName;

    Technology( String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
    @Override
    public String toString() {
        return displayName;
    }
}
