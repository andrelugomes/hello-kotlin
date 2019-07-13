import java.util.*
import javax.swing.tree.TreeNode

/**
 * Passando o tipo e usando reflection para verificar o tipo.
 *
 * "UNCHECKED_CAST" no  p as T?
 */
fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}

/**
 *  "reified" irá garantir o tipo e o acesso dentro da função.
 *  Precisa ser funções "inline" (currently limited to inline functions only).
 *  Não há a necessidade de reflection.
 *  `is` varifica a instância e o `as` faz o cast
 *
 *  https://github.com/JetBrains/kotlin/blob/master/spec-docs/reified-type-parameters.md
 */
inline fun <reified T> TreeNode.findParentOfType(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }
    return p as T?
}

fun main(args: Array<String>) {
    val myTreeNode = MyTreeNode()
     myTreeNode.findParentOfType(MyTreeNode::class.java)
     myTreeNode.findParentOfType<MyTreeNode>()
}

class MyTreeNode : TreeNode {
    override fun isLeaf() = false

    override fun getChildCount() = 0

    override fun getParent()= this

    override fun getChildAt(childIndex: Int) = this

    override fun getIndex(node: TreeNode?) = 0

    override fun getAllowsChildren() = true

    override fun children() =  MyEnumatarion()
}

class MyEnumatarion : Enumeration<String> {
    override fun hasMoreElements() = true

    override fun nextElement() = ""
}
