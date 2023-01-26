package Tree_Practice;

import Build_BinaryTree.BinaryTree;
import Node_Package.Node;

public class HeightOfTree {
    static int height(Node rootNode){
        if(rootNode == null) return 0;
        int leftNode=height(rootNode.left);
        int rightNode=height(rootNode.right);

        int level=Math.max(leftNode,rightNode)+1;
        return level;
    }
    public static void main(String[] args) {

/* *******       TC:====O(n)          ****** */

        int[] node={1,2,4,-1,10,-1,-1,3,-1,8,-1,-1,5,6,9,-1,-1,11,-1,-1,7,-1,12,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node rootNode=bt.buildTree(node);
        System.out.println(height(rootNode));
    }
}
