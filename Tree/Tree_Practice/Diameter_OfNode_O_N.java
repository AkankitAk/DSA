package Tree_Practice;

import Build_BinaryTree.BinaryTree;
import Node_Package.Node;

public class Diameter_OfNode_O_N {
    static class TreeInfo{
        int height;
        int diameter;
        TreeInfo(int height,int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }

    public static TreeInfo diameter(Node rootNode){
        if(rootNode == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter(rootNode.left);
        TreeInfo right=diameter(rootNode.right);

        int height=Math.max(left.height, right.height)+1;

        int diam1= left.diameter;
        int diam2= right.diameter;
        int diam3= left.height + right.height +1;

        int curDiameter=Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo diamInfo=new TreeInfo(height,curDiameter);
        return diamInfo;
    }
    public static void main(String[] args) {
/* *******       TC:====O(n)          ****** */

        int[] node={1,2,4,-1,10,-1,-1,3,-1,8,-1,-1,5,6,9,-1,-1,11,-1,-1,7,-1,12,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node rootNode=bt.buildTree(node);

        System.out.println(diameter(rootNode).diameter);
    }
}
