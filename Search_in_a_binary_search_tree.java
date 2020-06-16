 static class Node { 
        int data; 
        Node left, right; 
    }; 
  
    // Function to check the given key exist or not 
    static boolean iterativeSearch(Node root, int key) 
    { 
        // Traverse untill root reaches to dead end 
        while (root != null) { 
            // pass right subtree as new tree 
            if (key > root.data) 
                root = root.right; 
  
            // pass left subtree as new tree 
            else if (key < root.data) 
                root = root.left; 
            else
                return true; // if the key is found return 1 
        } 
        return false; 
    } 
  
    // A utility function to create a new BST Node 
    static Node newNode(int item) 
    { 
        Node temp = new Node(); 
        temp.data = item; 
        temp.left = temp.right = null; 
        return temp; 
    } 