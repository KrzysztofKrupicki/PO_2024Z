package construction;

public class BuildingMaterial {
    private String materialType;
    private String qualityGrade;
    private int quantityInStock;

    public BuildingMaterial(String materialType, String qualityGrade, int quantityInStock) {
        this.materialType = materialType;
        this.qualityGrade = qualityGrade;
        this.quantityInStock = quantityInStock;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getQualityGrade() {
        return qualityGrade;
    }

    public void setQualityGrade(String qualityGrade) {
        this.qualityGrade = qualityGrade;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public static boolean isSufficientQuantity(BuildingMaterial buildingMaterial){
        if(buildingMaterial == null){
            return false;
        }
        return buildingMaterial.getQuantityInStock() > 100;
    }

    public boolean isSufficientQuantity(){
        return getQuantityInStock() > 100;
    }
}
