package Tree_Practice;


import Build_BinaryTree.BinaryTree;
import Node_Package.Node;

public class SubtreeOfAnother_Tree {


    public static void main(String[] args) {
/* *******       TC:====O(n)          ****** */

        int[] rootNode={1,2,4,-1,10,-1,-1,3,-1,8,-1,-1,5,6,9,-1,-1,11,-1,-1,7,-1,12,-1,-1};
        int[] subNode={6,9,-1,-1,11,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node mainTreeNode=bt.buildTree(rootNode);
        System.out.println(mainTreeNode.data );
        Node subRootNode =bt.buildTree(subNode);
        System.out.println(subRootNode.data);

    }
}
