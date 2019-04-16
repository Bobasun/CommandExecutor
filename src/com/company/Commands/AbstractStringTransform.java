package com.company.Commands;

public abstract class AbstractStringTransform implements ICommandExec {

    String data;
    public AbstractStringTransform(String data)
    {
        this.data = data;
    }

    public abstract String exec();
}
