package com.company.StringParser;

public interface ICommandParser {
    boolean tryParse() throws ValidationException;
    String getCommand();
    String getData();
}
