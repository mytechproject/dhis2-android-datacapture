package org.hisp.dhis.mobile.datacapture.api.android.models;

public class DBItemHolder<T> {
    private int id;
    private T item;

    public int getDatabaseId() {
        return id;
    }

    public void setDataBaseId(int id) {
        this.id = id;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}