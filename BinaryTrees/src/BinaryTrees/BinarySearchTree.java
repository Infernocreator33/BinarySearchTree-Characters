
package BinaryTrees;

/**
 *
 * @author zs087
 */
public class BinarySearchTree {
    private static BinaryTreeNode root;
    private static BinaryTreeNode current;


    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getCurrent() {
        return current;
    }

    public void setCurrent(BinaryTreeNode current) {
        this.current = current;
    }
    
    
    public BinarySearchTree()
    {
        root = null;
        current = null;
        
    }
        public static void insert(BinaryTreeNode node, char letter)
    {
        if(letter < node.letter)
        {
            if(node.leftChild != null)
            {
                insert(node.leftChild, letter);
            }
            else
            {
                System.out.println(" Inserted " + letter + " to left of Tree Node " + node.letter);
                node.leftChild = new BinaryTreeNode(letter);
            }

        }
        else if(letter > node.letter)
        {
            if(node.rightChild != null)
            {
                insert(node.rightChild, letter);
            }
            else
            {
                System.out.println(" Inserted " + letter + " to right of the Tree Node " + node.letter);
                node.rightChild = new BinaryTreeNode(letter);
            }
        }
    }
    public static void inOrder(BinaryTreeNode node)
    {
        if(node != null)
        {
            inOrder(node.leftChild);
            System.out.println(" TreeNode " + node.letter);
            inOrder(node.rightChild);
        }
    }
    public static char search(BinaryTreeNode node, char letter)
    {
        if(node.letter == letter)
        {
            System.out.println("Node was found this should be letter searched for : " + node.letter);
            return node.letter;
        } 
        if(letter < node.letter && node.leftChild != null)
        {
            System.out.println("Node would be left of " + node.letter);
            return search(node.leftChild, letter);
        }
        if(node.rightChild != null)
        {
            System.out.println("Node would be right of " + node.letter);
            return search(node.rightChild, letter);
        }
        System.out.println("Traversed through all levels \nNo such character found in Binary Search Tree : " + letter);
        return letter;
    }
        public static void main(String [] args)
    {
        root = new BinaryTreeNode('e');
       System.out.println("Tree with root = " + root.letter);
       System.out.println("\nRemember that the letters are being compared as ASCII characters and the higher value will go to the right, as the lower will go to the left");
       System.out.println("**********************************");
       insert(root, 'b');
       insert(root, 'c');
       insert(root, 'z');
       insert(root, 'l');
       insert(root, 'G');
       insert(root, 'A');
       insert(root, 'Z');
       insert(root, 'a');
       insert(root, 'y');
       insert(root, 'Y');
       insert(root, 'n');
       search(root, 'y');
       search(root, 'M');
       System.out.println("\nTraversing tree in order");
       System.out.println("\nRemember that Capital letters have lower ASCII values then lowercase letters do");
       System.out.println("************************************");
       inOrder(root);
       
    }
}
