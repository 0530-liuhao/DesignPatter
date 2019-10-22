package com.dingding.design.patter.creational.factory;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FactoryDemo {

    public static void main(String[] args) throws Exception {
        OperationFactory  operationFactory = new AdditionFactory();
        Operation addition = operationFactory.createOperation();
        System.out.println(addition.getResult(2L,3L));

        OperationFactory subtractionFactory = (OperationFactory) Class.forName("com.dingding.design.patter.creational.factory.SubtractionFactory").newInstance();
        Operation subtraction = subtractionFactory.createOperation();
        System.out.println(subtraction.getResult(4L,2L));
    }

}
