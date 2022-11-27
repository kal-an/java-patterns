package Structural.Flyweight;

import java.util.List;

public class TreeFactory {

    private static List<TreeType> treeTypes;

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType type  = find(name, color, texture);
        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.add(type);
        }
        return type;
    }

    private static TreeType find(String name, String color, String texture) {
        for (TreeType treeType : treeTypes) {
            if (treeType.getName().equals(name)
                && treeType.getColor().equals(color)
                && treeType.getTexture().equals(texture)) {
                return treeType;
            }
        }
        return null;
    }
}
