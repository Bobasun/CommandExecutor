package com.company.StringParser;

public class ValidationException extends Exception {
    private  String validationErrorInfo;

    public ValidationException(String info)
    {
        super();
        this.validationErrorInfo = info;
    }

    public String getValidationErrorInfo()
    {
        return this.validationErrorInfo;
    }
}
