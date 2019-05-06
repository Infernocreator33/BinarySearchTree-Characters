
package BinaryTrees;

/**
 *
 * @author zs087
 */
public class BinaryTreeNode {
    char letter = '\0';
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    
    public BinaryTreeNode(char letter)
    {
        this.letter = letter;  
    }
    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

}
