package testeos.victor.me.testeos;

import java.io.Serializable;

public enum CategoryType implements Serializable {

    LACTEOS_DERIVADOS("Lácteos y derivados", 123),
    PESCADOS_CARNES_HUEVOS("Pescados, carnes y huevos", 323),
    LEGUMBRES_FRUTOS_SECOS_TUBERCULOS("Legumbres, Frutos secos y tubérculos", 342),
    VERDURAS_HORTALIZAS("Verduras y hortalizas", 345),
    FRUTAS("Frutas", 342),
    CEREALES_DERIVADOS("Cereales y derviados", 435),
    GRASAS("Grasas", 34533);


    private String categoryType;
    private int categoryPhoto;

    CategoryType() {
    }

    CategoryType(String categoryType, int categoryPhoto) {
        this.categoryType = categoryType;
        this.categoryPhoto = categoryPhoto;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public int getCategoryPhoto() {
        return categoryPhoto;
    }

    public void setCategoryPhoto(int categoryPhoto) {
        this.categoryPhoto = categoryPhoto;
    }

    @Override
    public String toString() {
        return "CategoryType{" +
                "categoryType='" + categoryType + '\'' +
                ", categoryPhoto=" + categoryPhoto +
                '}';
    }


}
