package com.sxc.architect.datastruct.tree;

import java.util.Stack;

/**
 * 二叉树的前序、中序、后序递归和非递归遍历
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

        System.out.println("先序遍历:");
        PreOrder(a);System.out.print(";");
        PreOrder2(a);System.out.println(";");
        System.out.println("=============");
        System.out.println("中序遍历");
        InOrder(a);System.out.print(";");
        InOrder2(a);System.out.println(";");
        System.out.println("=============");
        System.out.println("后序遍历");
        PostOrder(a);System.out.println(";");
        PostOrder2(a);System.out.println(";");
        System.out.println("=============");
    }

    /**
     * 先序遍历非递归
     * @param binTree
     */
    static void PreOrder2(BinTree binTree){
        Stack<BinTree> stack = new Stack<BinTree>();
        BinTree p = binTree;
        while(p != null || !stack.empty()) {
            if(p != null) {
                visit(p);
                stack.push(p);
                p = p.lchild;
            }
            else {
                p = stack.pop();
                p = p.rchild;
            }
        }
    }


    static void PreOrder(BinTree binTree){
        if(binTree != null) {
            visit(binTree);
            PreOrder(binTree.lchild);
            PreOrder(binTree.rchild);
        }
    }

    static void InOrder2(BinTree binTree) {
        BinTree p = binTree;
        Stack<BinTree> stack = new Stack<BinTree>();
        while(p != null || !stack.isEmpty()) {
            if(p != null) {
                stack.push(p);
                p = p.lchild;
            }
            else {
                p = stack.pop();
                visit(p);
                p = p.rchild;
            }
        }
    }

    static void InOrder(BinTree binTree){
        if(binTree != null) {
            InOrder(binTree.lchild);
            visit(binTree);
            InOrder(binTree.rchild);
        }
    }

    static void PostOrder2(BinTree binTree) {
        Stack<BinTree> stack = new Stack<BinTree>();
        BinTree p = binTree;
        while(p != null || !stack.isEmpty()) {
            if(p != null) {
                stack.push(p);
                p = p.lchild;
            }
            else {
                BinTree peek = stack.peek();
                p = stack.pop();
                p = p.rchild;
                visit(p);
            }
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
