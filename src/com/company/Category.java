package com.company;

public enum Category {
    HORROR("HORROR"),
    SCI_FI("Sci-Fi"),
    ROMANTIC("Romantic"),
    DOCUMENT("Document");

    private String displayName;

      Category (String displayName) {
          this.displayName = displayName;
      }



      public String getDisplayName (){
          return displayName;
      }

    @Override
    public String toString() {
        return displayName;
    } }
