package com.a01searchdemo;

public class A03_BlockSearchDemo {
    public static void main(String[] args) {
        //分块查找


        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        System.out.println(arr.length);


        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blockArr = {b1, b2, b3};

        int number = 34;

        int index = getIndex(blockArr, arr, number);
        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        int blockIndex = findBlockIndex(blockArr, number);
        if (blockIndex == -1) {
            return -1;
        }

        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        for (int i = startIndex; i < endIndex + 1; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;

    }

    public static int findBlockIndex(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (blockArr[i].getMax() >= number) {
                return i;
            }
        }
        return -1;
    }
}


class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}