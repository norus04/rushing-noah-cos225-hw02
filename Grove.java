public class Grove{
    public Tree[] Trees;
    public String GroveName;
    
    public Grove(String GroveName){
        this.GroveName = GroveName;
        this.Trees = new Tree[12];
    }
    public int PlantTree(Tree tree){
        for (int i = 0; i < Trees.length; i++){
            if (Trees[i] == null){
                Trees[i] = tree;
            }
        }
        return -1;
    }
    public Tree RemoveTree(int Position){
        if (Position >= 0 && Position < Trees.length){
            Tree Removed = Trees[Position];
            Trees[Position] = null;
            return Removed;
        }
        return null;
    }
    public String ToString(){
        int TreeCount = 0;
        for (Tree tree : Trees){
            if (tree != null){
                TreeCount++;
            }
        }
        return String.valueOf(TreeCount);
    }
}