Bahut badhiya 👍
Ab main tumhe **C++ code ko Java me convert karke deta hoon** (array → binary tree construction with `INT_MIN` as null marker + level order traversal).

---

## ✅ Java Code

```java
import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeBuilder {

    // Construct tree from array (using INT_MIN as null marker)
    public static Node construct(int[] arr) {
        if (arr.length == 0) return null;

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node temp = q.poll();

            // Left child
            Node l = null;
            if (i < arr.length && arr[i] != Integer.MIN_VALUE) {
                l = new Node(arr[i]);
            }
            i++;

            // Right child
            Node r = null;
            if (i < arr.length && arr[i] != Integer.MIN_VALUE) {
                r = new Node(arr[i]);
            }
            i++;

            temp.left = l;
            temp.right = r;

            if (l != null) q.add(l);
            if (r != null) q.add(r);
        }
        return root;
    }

    // Level order traversal
    public static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, Integer.MIN_VALUE, Integer.MIN_VALUE, 6,
                     Integer.MIN_VALUE, Integer.MIN_VALUE, 7, 8, 9};

        Node root = construct(arr);

        System.out.print("Level Order Traversal: ");
        levelOrder(root);
    }
}
```

---

## 🔹 Explanation of changes from C++ → Java

1. `Node*` → `Node` reference.
2. `INT_MIN` → `Integer.MIN_VALUE`.
3. `queue<Node*>` → `Queue<Node> q = new LinkedList<>();`
4. `q.push()` → `q.add()`
5. `q.pop()` → `q.poll()`

---

✅ Ab ye code Java me tree construct karega aur **Level Order Traversal** print karega.

---

Giteshwar, kya tum chahte ho main iska **sample output** bhi run karke bataun jo diya hua `arr` se banega?
