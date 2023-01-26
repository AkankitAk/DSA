package Build_BinaryTree;

import Node_Package.Node;

public class BinaryTree {
    static int index=-1;
    public static Node buildTree(int[] node){
        index++;
        if(node[index]==-1) return null;
        Node newNode=new Node(node[index]);
        newNode.left=buildTree(node);
        newNode.right=buildTree(node);
        return newNode;
    }
}
