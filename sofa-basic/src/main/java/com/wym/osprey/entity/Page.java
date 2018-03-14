package com.wym.osprey.entity;

public class Page {
    /** 序列化号 */
    private static final long serialVersionUID = 7823482964017086664L;

    /** 第一条记录的位置 */
    private int begin;

    /** 最后一条记录的位置 */
    private int end;

    /** 每页显示的大小 */
    private int size;

    /**
     * 创建一个空的Page对象
     */
    public Page() {

    }

    /**
     * 根据页码和页面大小，构造一个Page对象，默认第一条记录的索引值为1<br/>
     * 第一页的页码值为1
     * @param index
     * @param size
     */
    public Page(int index, int size) {
        this(index, size, false);
    }

    /**
     * 根据页码和页面大小，构造一个Page对象，并设置第一条记录的索引值是否从0开始<br/>
     * 第一页的页码值为1
     * @param index
     * @param size
     * @param startZero
     */
    public Page(int index, int size, boolean startZero) {
        index = index == 0 ? 0 : index - 1;
        this.begin = startZero ? index * size : index * size + 1;
        this.end = begin + size;
        this.size = size;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
