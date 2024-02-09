public class GroveTester{
    public static void main(String[] args){
        Grove g1 = new Grove("Grove 1");
        System.out.println(g1.ToString());
        
        Tree Spruce1 = new Tree(0, 37, "Spruce");
        Tree Spruce2 = new Tree(1, 37, "Spruce");
        Tree Spruce3 = new Tree(2, 37, "Spruce");
        Tree Spruce4 = new Tree(3, 37, "Spruce");
        Tree Spruce5 = new Tree(4, 37, "Spruce");
        Tree Spruce6 = new Tree(5, 37, "Spruce");
        Tree Spruce7 = new Tree(6, 37, "Spruce");
        
        g1.PlantTree(Spruce1);
        g1.PlantTree(Spruce2);
        g1.PlantTree(Spruce3);
        g1.PlantTree(Spruce4);
        g1.PlantTree(Spruce5);
        g1.PlantTree(Spruce6);
        g1.PlantTree(Spruce7);

        System.out.println(g1);

        g1.RemoveTree(3);
        g1.RemoveTree(5);
        
        System.out.println(g1);

        Tree Maple = new Tree(7, 13, "Maple");
        g1.PlantTree(Maple);

        System.out.println(g1);
    }
}