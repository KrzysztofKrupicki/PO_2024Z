package construction;

public class TestBuildingMaterial {
    public static void main(String[] args) {
        BuildingMaterial buildingMaterial1 = new BuildingMaterial("Material type 1", "Quality grade 1", 152);
        BuildingMaterial buildingMaterial2 = new BuildingMaterial("Material type 2", "Quality grade 2", 67);
        System.out.println(buildingMaterial1.isSufficientQuantity());
        System.out.println(BuildingMaterial.isSufficientQuantity(buildingMaterial2));
    }
}
