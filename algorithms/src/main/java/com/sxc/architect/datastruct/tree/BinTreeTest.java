package com.sxc.architect.datastruct.tree;

/**
 * 二叉树的前序、中序、后序递归遍历
 * @Date 2020/10/28
 */
public class BinTreeTest {
    public static void main(String[] args) {
        BinTree a = new BinTree("a");
        BinTree b = new BinTree("b");
        BinTree c = new BinTree("c");
        BinTree d = new BinTree("d");
        BinTree e = new BinTree("e");

        a.lchild = b;
        a.rchild = c;
        b.lchild = d;
        b.rchild = e;

        PreOrder(a);
        System.out.print(";");
        InOrder(a);
        System.out.print(";");
        PostOrder(a);
        System.out.print(";");
    }

    static void PreOrder(BinTree binTree){
        if(binTree != null) {
            visit(binTree);
            PreOrder(binTree.lchild);
            PreOrder(binTree.rchild);
        }
    }

    static void InOrder(BinTree binTree){
        if(binTree != null) {
            InOrder(binTree.lchild);
            visit(binTree);
            InOrder(binTree.rchild);
        }
    }

    static void PostOrder(BinTree binTree){
        if(binTree != null) {
            PostOrder(binTree.lchild);
            PostOrder(binTree.rchild);
            visit(binTree);
        }
    }

    static void visit(BinTree binTree) {
        System.out.print(binTree.data);
    }
}
class BinTree {
    String data;
    BinTree lchild;
    BinTree rchild;

    BinTree(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BinTree getLchild() {
        return lchild;
    }

    public void setLchild(BinTree lchild) {
        this.lchild = lchild;
    }

    public BinTree getRchild() {
        return rchild;
    }

    public void setRchild(BinTree rchild) {
        this.rchild = rchild;
    }
}
