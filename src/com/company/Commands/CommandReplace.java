package com.company.Commands;

public class CommandReplace extends AbstractStringTransform {

    public CommandReplace(String data)
    {
        super(data);
    }
    @Override
    public String exec() {
        return this.data.replace("_","");
    }
}
