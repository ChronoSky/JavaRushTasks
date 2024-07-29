package com.javarush.task.task20.task2024;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/

public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();



    public void writeObject(ObjectOutput out) throws IOException {
        out.writeInt(node);
        out.writeObject(edges);
    }

    public void readObject(ObjectInput in) throws IOException, ClassNotFoundException {
        this.node = in.readInt();
        this.edges = (List<Solution>) in.readObject();
    }

    public static void main(String[] args) {

    }
}
