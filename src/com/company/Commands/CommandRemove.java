package com.company.Commands;

public class CommandRemove extends AbstractStringTransform {

    int symbolCount;
    public CommandRemove(String data)
    {
        super(data);
        this.symbolCount =1;
    }
   /* public  CommandRemove(String data, int symbolCount)
    {
        super(data);
        this.symbolCount = symbolCount;
    }*/

    @Override
    public String exec() {
        String result = "";
        if (data != null && data.length()>this.symbolCount){
        result = this.data.substring(0,data.length()- this.symbolCount);
        }
        return  result;
    }
}
