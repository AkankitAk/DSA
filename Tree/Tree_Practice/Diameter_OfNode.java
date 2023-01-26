package Tree_Practice;

import Build_BinaryTree.BinaryTree;
import Node_Package.Node;

public class Diameter_OfNode {
    static int height(Node node){
        if(node==null) return 0;
        int left=height(node.left);
        int right=height(node.right);
        return Math.max(left,right)+1;
    }
    static int diameter(Node rootNode){
        if(rootNode==null)
            return 0;
        int diam1=diameter(rootNode.left);
        int diam2=diameter(rootNode.right);

        int diam3=height(rootNode.left)+height(rootNode.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    public static void main(String[] args) {
/* *******       TC:====O(n^2)          ****** */

        int[] node={1,2,4,-1,10,-1,-1,3,-1,8,-1,-1,5,6,9,-1,-1,11,-1,-1,7,-1,12,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node rootNode=bt.buildTree(node);

        System.out.println(diameter(rootNode));
    }
}
