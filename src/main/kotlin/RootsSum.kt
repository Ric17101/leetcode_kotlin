fun main(args: Array<String>) {
    val test =  RootsSum().checkTree(TreeNode(5))
    print(test)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class RootsSum {
    fun checkTree(root: TreeNode?): Boolean {
        if (root == null) return false

        return root.`val` == (root.left?.`val` ?: 0) + (root.right?.`val` ?: 0)
    }
}